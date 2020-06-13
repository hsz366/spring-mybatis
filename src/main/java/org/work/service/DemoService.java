package org.work.service;

import org.work.model.Users;

import java.util.List;

public interface DemoService {
    List<Users> getAll();

    Users Login(String name,String password);
}
