package com.example.restapi.service;

import com.example.restapi.dto.UserDto;
import com.example.restapi.user.User;

import java.util.List;
import java.util.Optional;

//Создание интерейса UserService
public interface UserService {
    //Создание метода addUser типа User с входящим параметром user типа User
    User addUser(User user);

    //Создание метода deleteUserById типа String с входящим параметром id типа String
    String deleteUserById(Integer id);

    //Создание метода putUser типа String
    User putUser(Integer id, User user);

    //Создание метода getUserById типа User с входящим параметром id типа Integer
    Optional<User> getUserById(Integer id);

    //Создание метода getUserByFlow типа String с входящими парматрами flow и slovo типа String
    String getUserByFlow(String flow, String slovo);

    List<User> getAllUsers();

    UserDto getUserByIdDto();
}
