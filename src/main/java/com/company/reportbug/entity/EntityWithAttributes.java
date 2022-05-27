package com.company.reportbug.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;

@JmixEntity
@Table(name = "ENTITY_WITH_ATTRIBUTES")
@Entity
public class EntityWithAttributes {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "FIRST_ATTRIBUTE")
    private String firstAttribute;

    @Column(name = "SECOND_ATTRIBUTE")
    private String secondAttribute;

    @Column(name = "THIRD_ATTRIBUTE")
    private String thirdAttribute;

    public String getThirdAttribute() {
        return thirdAttribute;
    }

    public void setThirdAttribute(String thirdAttribute) {
        this.thirdAttribute = thirdAttribute;
    }

    public String getSecondAttribute() {
        return secondAttribute;
    }

    public void setSecondAttribute(String secondAttribute) {
        this.secondAttribute = secondAttribute;
    }

    public String getFirstAttribute() {
        return firstAttribute;
    }

    public void setFirstAttribute(String firstAttribute) {
        this.firstAttribute = firstAttribute;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}