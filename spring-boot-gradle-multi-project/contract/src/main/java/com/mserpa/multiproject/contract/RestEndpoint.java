package com.mserpa.multiproject.contract;

import com.mserpa.multiproject.impl.User;
import com.mserpa.multiproject.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class RestEndpoint {

    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public List<User> getAllUsers(){
        return userService.getAll();
    }


}
