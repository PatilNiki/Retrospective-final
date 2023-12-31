package com.java.retrospective.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

@Entity
@Table(name="swimlane")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class SwimlaneEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column
    private Integer id;
    @Column
    @NonNull private String title;

    @ManyToOne
    @JoinColumn(name = "ref_retrospective", referencedColumnName = "id")
    @JsonBackReference
    @ToString.Exclude
    private RetrospectiveEntity retrospective=null;
}
