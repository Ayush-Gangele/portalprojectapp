package com.sqr.portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sqr.portal.Model.Candidate;
import com.sqr.portal.Model.Candidate2;

public interface CandidateRepository extends JpaRepository <Candidate, Integer>
{

}
