package com.carddemo.core.repository;

import com.carddemo.core.domain.DisclosureGroup;
import com.carddemo.core.domain.DisclosureGroupId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DisclosureGroupRepository extends JpaRepository<DisclosureGroup, DisclosureGroupId> {
    Optional<DisclosureGroup> findByAccountGroupIdAndTransactionTypeCodeAndTransactionCategoryCode(
            String accountGroupId, String transactionTypeCode, Integer transactionCategoryCode);
}
