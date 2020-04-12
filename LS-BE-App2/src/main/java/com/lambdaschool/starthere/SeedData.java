//package com.lambdaschool.starthere;
//
//import com.lambdaschool.starthere.models.*;
//import com.lambdaschool.starthere.services.RoleService;
//import com.lambdaschool.starthere.services.UserService;
//import org.springframework.beans.factory.annotation.Autowired;import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.ArrayList;
//import java.util.Locale;
//
//@Transactional
//@Component
//public class SeedData implements CommandLineRunner
//{
//    @Autowired
//    RoleService roleService;
//
//    @Autowired
//    UserService userService;
//
//
//    @Override
//    public void run(String[] args) throws Exception
//    {
//        Role r1 = new Role("admin");
//        Role r2 = new Role("user");
//        Role r3 = new Role("data");
//
//        roleService.save(r1);
//        roleService.save(r2);
//        roleService.save(r3);
//
//        // user
//        ArrayList<UserRoles> users = new ArrayList<>();
//        users.add(new UserRoles(new User(),
//                                r2));
//        User u3 = new User("samir",
//                           "password",
//                           "samir@lambdaschool.local",
//                           users);
//        u3.getUseremails()
//          .add(new Useremail(u3,
//                             "samir@email.local"));
//        userService.save(u3);
//
//        users = new ArrayList<>();
//        users.add(new UserRoles(new User(),
//                                r2));
//        User u4 = new User("demo",
//                           "password",
//                           "demo@school.local",
//                           users);
//        userService.save(u4);
//
//    }
//}