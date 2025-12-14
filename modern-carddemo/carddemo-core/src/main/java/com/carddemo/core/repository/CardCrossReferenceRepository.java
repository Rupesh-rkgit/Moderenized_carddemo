package com.carddemo.core.repository;

import com.carddemo.core.domain.CardCrossReference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardCrossReferenceRepository extends JpaRepository<CardCrossReference, String> {
    java.util.List<CardCrossReference> findByXrefAccountId(Long xrefAccountId);
}
