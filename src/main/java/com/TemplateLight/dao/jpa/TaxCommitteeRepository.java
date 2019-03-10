package com.TemplateLight.dao.jpa;

import com.TemplateLight.domain.model.TaxCommittee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaxCommitteeRepository extends JpaRepository<TaxCommittee, Long> {

    @Query("select obj from TaxCommittee obj where obj.parent = null")
    List<TaxCommittee> getAll();

}
