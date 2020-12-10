package com.test.szh.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;


@Entity
@Table(name = "hospital")
public class Hospital {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    @Column(unique = true, nullable = false, updatable = false, length = 32)
    private String id;

    @Column(name = "name",length = 32,nullable = false)
    private String name;
}
