package com.sns.independent.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sns.independent.domain.Document;

public interface DocumentRepository extends JpaRepository<Document, Long>{

}
