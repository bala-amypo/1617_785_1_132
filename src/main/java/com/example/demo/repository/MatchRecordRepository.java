package com.exmaple.demo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.exmaple.demo.model.MatchRecord;

@Repository
public interface MatchRecordRepository extends JpaRepository<MatchRecord, Long> {
    List<MatchRecord> findByUserAIdOrUserBId(Long userAId, Long userBId);
}
