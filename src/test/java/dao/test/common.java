package dao.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.work.model.Users;
import org.work.service.DemoService;

import java.util.List;

public class common {

//    @Autowired
//    private DemoService dao;
//
//    @Test
//    public void DaoTest(){
//        List<Users> all = dao.getAll();
//        System.out.println(all);
//    }

    @Autowired
    private static DemoService dao;
    public static void main(String[] args) {
        List<Users> all = dao.getAll();
        System.out.println(all);
        System.out.println("==========");
    }
}
