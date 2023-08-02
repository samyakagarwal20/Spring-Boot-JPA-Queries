package com.yflash.tech.SpringJPAQueries.service.impl;

import com.yflash.tech.SpringJPAQueries.entity.UserEntity;
import com.yflash.tech.SpringJPAQueries.model.out.User;
import com.yflash.tech.SpringJPAQueries.repository.UserRepository;
import com.yflash.tech.SpringJPAQueries.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    UserRepository userRepository;

    private static final Logger LOGGER = LogManager.getLogger(UserServiceImpl.class);

    @Override
    public User getUserById(Integer id) {
        UserEntity userEntity = userRepository.findUser(id);
        if(userEntity == null)
            return null;
        return modelMapper.map(userEntity,User.class);
    }

}
