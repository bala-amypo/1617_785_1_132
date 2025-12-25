// package com.example.demo.service.impl;

// import com.example.demo.exception.ResourceNotFoundException;
// import com.example.demo.model.SkillOffer;
// import com.example.demo.repository.SkillOfferRepository;
// import com.example.demo.service.SkillOfferService;
// import org.springframework.stereotype.Service;
// import java.util.List;
// import java.util.stream.Collectors;

// @Service
// public class SkillOfferServiceImpl implements SkillOfferService {

//     private final SkillOfferRepository repo;

//     public SkillOfferServiceImpl(SkillOfferRepository repo) {
//         this.repo = repo;
//     }

//     @Override
//     public SkillOffer createOffer(SkillOffer offer) {
//         return repo.save(offer);
//     }

//     @Override
//     public SkillOffer updateOffer(Long id, SkillOffer offer) throws Exception {
//         SkillOffer existing = getOfferById(id);
//         existing.setSkill(offer.getSkill());
//         existing.setUser(offer.getUser());
//         existing.setExperienceLevel(offer.getExperienceLevel());
//         existing.setAvailableHoursPerWeek(offer.getAvailableHoursPerWeek());
//         existing.setActive(offer.isActive());
//         return repo.save(existing);
//     }

//     @Override
//     public SkillOffer getOfferById(Long id) throws Exception {
//         return repo.findById(id)
//                 .orElseThrow(() -> new ResourceNotFoundException("Offer not found"));
//     }

//     @Override
//     public List<SkillOffer> getOffersByUser(Long userId) {
//         return repo.findAll().stream()
//                 .filter(o -> o.getUser().getId().equals(userId))
//                 .collect(Collectors.toList());
//     }

//     @Override
//     public void deactivateOffer(Long id) throws Exception {
//         SkillOffer existing = getOfferById(id);
//         existing.setActive(false);
//         repo.save(existing);
//     }
// }
package com.example.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.demo.exception.ResourceNotFoundException;

import com.example.demo.service.SkillOfferService;
import com.example.demo.repository.SkillOfferRepository;
import com.example.demo.model.SkillOffer;

@Service
public class SkillOfferServiceImpl implements SkillOfferService{
    private final SkillOfferRepository sor;
    public SkillOfferServiceImpl(SkillOfferRepository sor){
        this.sor=sor;
    }
    public SkillOffer createOffer(SkillOffer offer){
        return sor.save(offer);
    }
    public SkillOffer updateOffer(Long id,SkillOffer offer){
        SkillOffer existing=sor.findById(id).orElseThrow(()->new RuntimeException("Offer not found"));
        existing.setExperienceLevel(offer.getExperienceLevel());
        existing.setAvailableHoursPerWeek(offer.getAvailableHoursPerWeek());
        return sor.save(existing);
    }
//     @Override
// public SkillOffer updateOffer(Long id, SkillOffer offer) {
//     SkillOffer existing = sor.findById(id)
//             .orElseThrow(() ->
//                     new ResourceNotFoundException("Offer not found with id " + id)
//             );

//     existing.setExperienceLevel(offer.getExperienceLevel());
//     existing.setAvailableHoursPerWeek(offer.getAvailableHoursPerWeek());
//     existing.setActive(offer.getActive());

//     return sor.save(existing);
// }

    public SkillOffer getOfferById(Long id){
        return sor.findById(id).orElseThrow(()->new RuntimeException("Offer not found"));
    }
    public List<SkillOffer> getOffersByUser(Long userId){
        return sor.findByUserId(userId);
    }
    public void deactivateOffer(Long id){
        SkillOffer offer=sor.findById(id).orElseThrow(()->new RuntimeException("Offer not found"));
        offer.setActive(false);
        sor.save(offer);
    }
}
