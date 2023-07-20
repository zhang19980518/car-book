package com.example.carbook.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table(name = "car_user")
@Data
public class User {

    @Id
    private Long id;

    private String username;

    private String nickname;

    private String signal;

    private String sex;

    private String phone;


}
