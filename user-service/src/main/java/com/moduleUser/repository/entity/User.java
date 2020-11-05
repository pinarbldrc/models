package com.moduleUser.repository.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "tbl_user")
public class User implements Serializable {

    @SequenceGenerator(name = "seq_user",allocationSize =1)
    @GeneratedValue(generator = "seq_user",strategy = GenerationType.SEQUENCE)
    @Id
    private long id;

    private String name;

    private String lastName;

    private String email;

    private String password;

    private int active;


}
