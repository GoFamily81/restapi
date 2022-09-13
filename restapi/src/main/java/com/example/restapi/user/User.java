package com.example.restapi.user;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//Аннотация @AllArgsConstructor заменяет конструктор со всеми полями класса

//Аннотация @Data заменяет геттеры, сеттеры и метод toString(), а также @EqualsAndHashCode и @RequiredArgsConstructor

//Аннотация @NoArgsConstructor заменяет пустой конструктор
@NoArgsConstructor
@Data
@Entity(name = "User")
@Table(name = "user", schema = "public")
//Создание публичного класса User
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    //Создание приватного поля id с типом данных Integer
    private Integer id;

    @Column(name = "user_name")
    //Создание приватного поля name с типом данных String
    private String userName;

    @Column(name = "sur_name")
    //Создание приватного поля surname с типом данных String
    private String surName;

    @Column(name = "age")
    private Integer age;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id", referencedColumnName = "id")
    public Card card;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "user_id")
    List<Car> carList = new ArrayList<>();

}
