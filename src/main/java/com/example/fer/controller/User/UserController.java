package com.example.fer.controller.User;

import com.example.fer.models.User.DTO.UserDTO;
import com.example.fer.models.User.User;
import com.example.fer.repository.User.UserRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @PostMapping("/save")
    public void saveUser(@RequestBody UserDTO userRequest){
        User newUser = new User();


        newUser.setName(userRequest.getName());
        newUser.setPhone(userRequest.getPhone());
        newUser.setAge(userRequest.getAge());
        newUser.setRef(userRequest.getRef());
        newUser.setEdu(userRequest.getEdu());
        newUser.setMemory(userRequest.getMemory());
        newUser.setSnake(userRequest.getSnake());
        newUser.setGender(userRequest.getGender());

        userRepository.save(newUser);
    }
}
