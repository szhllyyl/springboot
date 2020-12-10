package com.test.szh.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

/**
 * @author songzehui
 * @email <a href="mailto:songzehui@gtmap.cn">Email To</a>
 * @date 2020/11/14 12:35
 * @desc com.test.szh.entity:
 */
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    @Column(unique = true, nullable = false, updatable = false, length = 32)
    private String id;

    @Column(name = "name",length = 32,nullable = false)
    private String name;

    @Column(name = "gender",length = 10)
    private String gender;

    @Column(name = "grand",length = 10)
    private String grand;

    @Column(name = "phones")
    @OneToMany
    private List<Phone> phones;

    @JoinColumn(name = "id_card")
    @OneToOne
    private IdCard idCard;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    public String getGrand() {
        return grand;
    }

    public void setGrand(String grand) {
        this.grand = grand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) &&
                Objects.equals(name, student.name) &&
                Objects.equals(gender, student.gender) &&
                Objects.equals(grand, student.grand) &&
                Objects.equals(phones, student.phones) &&
                Objects.equals(idCard, student.idCard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, gender, grand, phones, idCard);
    }
}
