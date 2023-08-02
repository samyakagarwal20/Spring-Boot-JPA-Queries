package com.yflash.tech.SpringJPAQueries.service;

import com.yflash.tech.SpringJPAQueries.entity.UserEntity;
import com.yflash.tech.SpringJPAQueries.model.out.User;

import java.util.List;

public interface UserService {
    User getUserById(Integer id);
}
