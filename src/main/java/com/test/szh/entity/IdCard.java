package com.test.szh.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @author songzehui
 * @email <a href="mailto:songzehui@gtmap.cn">Email To</a>
 * @date 2020/11/18 14:54
 * @desc com.test.szh.entity:
 */
@Entity
@Table(name = "id_card")
public class IdCard {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    @Column(unique = true, nullable = false, updatable = false, length = 32)
    private String id;

//    @OneToOne
//    @JoinColumn(name = "id_card")
//    private Student student;
}
