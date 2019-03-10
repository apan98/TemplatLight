package com.TemplateLight.dao;

import com.TemplateLight.domain.model.TaxCommittee;

public interface TaxCommitteeDao {

    TaxCommittee save(TaxCommittee taxCommittee);

    TaxCommittee getAll();

    TaxCommittee getAllChildrenById(Long id);

    TaxCommittee getObject();
}
