package com.example.demo.service.impl;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.MatchRecord;
import com.example.demo.model.SkillOffer;
import com.example.demo.model.SkillRequest;
import com.example.demo.repository.MatchRecordRepository;
import com.example.demo.repository.SkillOfferRepository;
import com.example.demo.repository.SkillRequestRepository;
import com.example.demo.service.MatchmakingService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MatchmakingServiceImpl implements MatchmakingService {

    private final SkillRequestRepository requestRepo;
    private final SkillOfferRepository offerRepo;
    private final MatchRecordRepository matchRepo;

    public MatchmakingServiceImpl(SkillRequestRepository requestRepo,
                                  SkillOfferRepository offerRepo,
                                  MatchRecordRepository matchRepo) {
        this.requestRepo = requestRepo;
        this.offerRepo = offerRepo;
        this.matchRepo = matchRepo;
    }

    @Override
    public MatchRecord generateMatch(Long userId) throws Exception {
        List<SkillRequest> requests = requestRepo.findAll().stream()
                .filter(r -> r.getUser().getId().equals(userId) && r.isActive())
                .collect(Collectors.toList());

        if (requests.isEmpty()) throw new ResourceNotFoundException("No skill request found for user");

        SkillRequest request = requests.get(0);

        List<SkillOffer> offers = offerRepo.findBySkillIdAndActiveTrue(request.getSkill().getId());
        if (offers.isEmpty()) throw new ResourceNotFoundException("No match found");

        SkillOffer offer = offers.get(0);

        MatchRecord match = new MatchRecord();
        match.setRequester(request.getUser());
        match.setProvider(offer.getUser());
        match.setSkillRequested(request.getSkill());
        match.setSkillOffered(offer.getSkill());
        match.setStatus("MATCHED");

        return matchRepo.save(match);
    }

    @Override
    public MatchRecord getMatchById(Long id) throws Exception {
        return matchRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Match not found"));
    }

    @Override
    public List<MatchRecord> getMatchesForUser(Long userId) {
        return matchRepo.findAll().stream()
                .filter(m -> m.getRequester().getId().equals(userId) ||
                             m.getProvider().getId().equals(userId))
                .collect(Collectors.toList());
    }

    @Override
    public MatchRecord updateMatchStatus(Long id, String status) throws Exception {
        MatchRecord match = getMatchById(id);
        match.setStatus(status);
        return matchRepo.save(match);
    }
}