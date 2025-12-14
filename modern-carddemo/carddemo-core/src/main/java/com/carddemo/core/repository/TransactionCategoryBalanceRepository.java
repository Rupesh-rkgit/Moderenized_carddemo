package com.carddemo.core.repository;

import com.carddemo.core.domain.TransactionCategoryBalance;
import com.carddemo.core.domain.TransactionCategoryBalanceId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionCategoryBalanceRepository extends JpaRepository<TransactionCategoryBalance, TransactionCategoryBalanceId> {
}
