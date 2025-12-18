package com.exmaple.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import orng.springframework.stereotype.Service;
import com.exmaple.demo.service.MatchmakingService;
import com.example.demo.model.MatchRecord;

@Service
public class MatchmakingServiceImpl implements MatchmakingService{
    @Autowired MatchRecordRepository ;
}
package com.exmaple.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.exmaple.demo.model.MatchRecord;

public interface MatchRecordRepository extends JpaRepository<MatchRecord, Long> {
    List<MatchRecord> findByUserAIdOrUserBId(Long userAId, Long userBId);
}
