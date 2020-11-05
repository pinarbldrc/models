package com.moduleUser.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "tbl_role")
public class Rolee {

    @SequenceGenerator(name = "seq_role",allocationSize =1)
    @GeneratedValue(generator = "seq_role",strategy = GenerationType.SEQUENCE)
    @Id
    private long id;

    private String name;


}
