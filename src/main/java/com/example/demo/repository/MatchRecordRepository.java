// package com.example.demo.repository;

// import org.springframework.data.jpa.repository.JpaRepository;
// import com.example.demo.model.MatchRecord;

// import java.util.List;

// public interface MatchRecordRepository extends JpaRepository<MatchRecord, Long> {
//     List<MatchRecord> findByRequesterId(Long requesterId);
//     List<MatchRecord> findByProviderId(Long providerId);
// }

// // package com.example.demo.repository;

// // import org.springframework.stereotype.Repository;
// // import org.springframework.data.jpa.repository.JpaRepository;
// // import java.util.List;
// // import com.example.demo.model.MatchRecord;

// // @Repository
// // public interface MatchRecordRepository extends JpaRepository<MatchRecord, Long> {
// //     List<MatchRecord> findByUserAIdOrUserBId(Long userAId, Long userBId);
// // }
package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;
import com.example.demo.model.MatchRecord;

public interface MatchRecordRepository extends JpaRepository<MatchRecord, Long> {

    List<MatchRecord> findByUserAIdOrUserBId(Long userAId, Long userBId);

    Optional<MatchRecord> findFirstByUserAIdOrUserBId(Long userAId, Long userBId);
}
