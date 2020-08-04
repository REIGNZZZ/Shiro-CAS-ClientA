package com.reignzzz.shirocas.dao;

import com.reignzzz.shirocas.entity.User;

public interface UserDao {
    User getUserByName(String username);
}
