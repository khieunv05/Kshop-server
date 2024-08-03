package com.vti.kshop.Map;

import com.vti.kshop.Dto.UserDto;
import com.vti.kshop.Entity.User;
import com.vti.kshop.Form.UserCreateForm;

public class UserMapper {
    public static UserDto map(User user){
        var dto = new UserDto();
        dto.setId(user.getId());
        dto.setPassword(user.getPassword());
        dto.setUsername(user.getUsername());
        dto.setCreatedAt(user.getCreatedAt());
        dto.setUpdatedAt(user.getUpdatedAt());
        return dto;
    }
    public static User map(UserCreateForm form){
        var user = new User();
        user.setUsername(form.getUsername());
        user.setPassword(form.getPassword());
        return user;
    }
}
