package org.work.dao;

import org.apache.ibatis.annotations.Param;
import org.work.model.Users;

import java.util.List;

public interface UserDao {
    List<Users> getAll();
    Users Login(@Param("name") String name,@Param("password") String password);
}
