package com.example.dm.repository_flow;



import com.example.dm.domain_flow.QuickLog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by zhao yuan on 01/10/2015.
 */
public interface QuickLogRepository extends JpaRepository<QuickLog, Integer> {


    Optional<QuickLog> findByIdLong(Long no);

    Page<QuickLog> findByClientId(String principal, Pageable pageable);
}
