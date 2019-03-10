package com.TemplateLight.domain.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "tax_committee")
public class TaxCommittee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

//        @ManyToOne
//    @JoinColumn(name = "parent_id")
    @Column(name = "parent_id")
    public Long parent;
    public String name;

    @ManyToMany
    @JoinTable(
            name = "tax_committee",
            joinColumns = @JoinColumn(name = "parent_id"),
            inverseJoinColumns = @JoinColumn(name = "id"))
    public List<TaxCommittee> children;



}