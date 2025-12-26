// package com.example.demo.repository;

// import org.springframework.data.jpa.repository.JpaRepository;
// import com.example.demo.model.MatchRecord;

// import java.util.List;
// import org.springframework.stereotype.Repository;

// @Repository
// public interface MatchRecordRepository extends JpaRepository<MatchRecord, Long> {
//     List<MatchRecord> findByRequesterId(Long requesterId);
//     List<MatchRecord> findByProviderId(Long providerId);
// }