package com.docker.test_project;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class DemoController {

    private final UserRepository userRepository;

    @GetMapping("/")
    public List<User> hello() {
        return userRepository.findAll();
    }

    @GetMapping("/add")
    public User hello(@RequestParam("name") String name) {
        User user = new User();
        user.setName(name);
        return userRepository.save(user);
    }
}