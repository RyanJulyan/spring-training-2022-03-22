package com.example.myticket.model.category;

import com.example.myticket.model.BaseEntity;
import lombok.*;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="category")
@Data
@Accessors(chain = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CategoryEntity extends BaseEntity {

    @Column(name = "name", nullable = false, unique = true)
    private String name;

}
