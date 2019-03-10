package com.TemplateLight.controller.v1;

import com.TemplateLight.dao.jpa.TaxCommitteeRepository;
import com.TemplateLight.domain.model.TaxCommittee;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/taxCommittee")
@AllArgsConstructor
public class TaxCommitteeResources {
    @Autowired
    private TaxCommitteeRepository taxCommitteeRepository;

    @GetMapping
    List<TaxCommittee> get() {
        return taxCommitteeRepository.findAll();
    }

    @PostMapping
    TaxCommittee create(@RequestBody TaxCommittee taxCommittee) {
        return taxCommitteeRepository.save(taxCommittee);
    }

    @GetMapping("/tree")
    List<TaxCommittee> getByParentId() {
        return taxCommitteeRepository.getAll();
    }
}
