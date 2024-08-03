package com.vti.kshop.Service;

import com.vti.kshop.Dto.UserDto;
import com.vti.kshop.Form.UserCreateForm;

public interface UserService {
    UserDto create(UserCreateForm form);
}
