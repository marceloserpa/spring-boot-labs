package com.mserpa.multiproject.impl;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;


@Component
public class UserService {

    public List<User> getAll(){
        User user = new User();
        user.setName("Marcelo Serpa");
        return Arrays.asList(user);
    }

}
