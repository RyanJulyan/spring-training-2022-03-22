package com.example.myticket.model.dummy;

import com.example.myticket.model.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="dummy")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DummyEntity extends BaseEntity {

    @Column(name = "name", nullable = false)
    private String name;
}
