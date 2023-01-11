package com.nissan.dao;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.nissan.model.SalesVisit;


@Repository
public interface ISalesVisitDao extends JpaRepositoryImplementation<SalesVisit, Integer> {

}
