package com.test.szh.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author songzehui
 * @email <a href="mailto:songzehui@gtmap.cn">Email To</a>
 * @date 2020/11/14 12:41
 * @desc com.test.szh.entity:
 */
@Entity
@Table(name = "phone")
public class Phone {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    @Column(unique = true, nullable = false, updatable = false, length = 32)
    private String id;

    @Column(name = "type")
    private String type;

    @Column(name = "price")
    private int price;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return price == phone.price &&
                Objects.equals(id, phone.id) &&
                Objects.equals(type, phone.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, price);
    }
}
