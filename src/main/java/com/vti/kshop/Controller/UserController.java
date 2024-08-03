package com.vti.kshop.Controller;

import com.vti.kshop.Dto.UserDto;
import com.vti.kshop.Form.UserCreateForm;
import com.vti.kshop.Service.UserService;
import com.vti.kshop.Service.UserServiceImp;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@Validated
public class UserController {
    private final UserService userService;

    @PostMapping("/api/v1/users")
    public UserDto create(@RequestBody UserCreateForm form){
        return userService.create(form);
    }
}
