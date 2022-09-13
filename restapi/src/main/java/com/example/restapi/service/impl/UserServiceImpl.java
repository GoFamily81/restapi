package com.example.restapi.service.impl;

import com.example.restapi.dto.UserDto;
import com.example.restapi.mapper.UserMapper;
import com.example.restapi.repository.UserRepository;
import com.example.restapi.service.UserService;
import com.example.restapi.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//Объявление класса UserServiceImpl - Сервисом
@Service
//Создание класса UserServiceImpl, который реализует методы интерфейса UserService
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    //аннотация @Override проверяет переопределен ли метод
    @Override
    //Реализация метода addUser c входящим параметром user типа User
    public User addUser(User user) {
        //вовзрат объекта user
        return userRepository.save(user);
    }

    @Override
    //Реализация метода deleteUserById c входящим параметром id типа String
    public String deleteUserById(Integer id) {
        userRepository.deleteById(id);
        return "User was been deleted with id" + id;
    }

    @Override
    //Реализация метода putUser без входящих параметров
    public User putUser(Integer id, User user) {
        user.setId(id);
        userRepository.save(user);
        //Возврат строки:User was changed и значение переменной id
        return getUserById(id).get();
    }

    @Override
    //Реализация метода getUserById с входящим параметром id типом данных Integer
    public Optional<User> getUserById(Integer id) {
        return userRepository.getUserById(id);
    }

    @Override
    //Реализация метода getUserByFlow с входящими параметрами flow, slovo типа данных String
    public String getUserByFlow(String flow, String slovo) {
        //Возврат строки: User was add и значений переменных flow и slovo
        return "User was add " + flow + " " + slovo;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public UserDto getUserByIdDto() {
        User user = userRepository.getUserById(1).get();
        return UserMapper.bigUserToSmallUserDto(user, new UserDto());
    }

}
