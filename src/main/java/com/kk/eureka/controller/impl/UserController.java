package com.kk.eureka.controller.impl;


import com.kk.eureka.controller.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
  @Autowired
  UserClient userClient;

  @PostMapping("/addUser")
  Object addUser(@RequestBody Object user) {
    return userClient.addUser(user);
  }

  @GetMapping("/getUserById")
  Object getUserById(@RequestParam("id") String id) {
    return userClient.getUserById(id);
  }

  @PostMapping("/delUserByIds")
  Object delUserByIds(@RequestBody List<String> ids) {
    return userClient.delUserByIds(ids);
  }

  @PostMapping("/updateUser")
  Object updateUser(@RequestBody Object user) {
    return userClient.updateUser(user);
  }

}
