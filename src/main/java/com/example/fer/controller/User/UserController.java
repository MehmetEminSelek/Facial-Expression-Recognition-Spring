package com.example.fer.controller.User;

import com.example.fer.models.User.DTO.UserDTO;
import com.example.fer.models.User.User;
import com.example.fer.repository.User.UserRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/save")
    public void saveUser(@RequestBody UserDTO userRequest){
        User newUser = new User();
        newUser.setAge(userRequest.getAge());
        newUser.setName(userRequest.getName());
        newUser.setMail(userRequest.getMail());
        userRepository.save(newUser);
    }
}
