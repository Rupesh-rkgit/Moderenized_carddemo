package com.carddemo.core.repository;

import com.carddemo.core.domain.DailyTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DailyTransactionRepository extends JpaRepository<DailyTransaction, String> {
    java.util.List<DailyTransaction> findByValidationStatus(String validationStatus);
}
