package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    //fake user list
    List<User> list = List.of(
            new User(1311L,"Ashwini Dhaked", "1234567890"),
            new User(1312L,"Neetu Kumawat", "1234567891"),
            new User(1314L,"Khemraj Marathe", "1234567892")
    );

    @Override
    public User getuser(Long id) {
        return this.list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null) ;
    }
}
