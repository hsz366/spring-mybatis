package org.work.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Service;
import org.work.dao.UserDao;
import org.work.model.Users;
import org.work.service.DemoService;

import java.util.List;

@Service
public class DemoServiceImpl implements DemoService {


    @Autowired
    private UserDao dao;

    @Override
    public List<Users> getAll() {
        List<Users> all = dao.getAll();
        return all;
    }

    @Override
    public Users Login(String name, String password) {
        Users login = dao.Login(name, password);
        return login;
    }
}
