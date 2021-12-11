package com.lits;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;

// Створити клас User(id,fname, lname, age) і за допомогою Hibernate+Spring :
// 1) Записати 10 рекордів у базу
// 2) Додати метод для виделля
// 3) Метод для отримання по Id
// 4) Метод щоб вивесті всі

public class SpringHibernateMain {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(JavaConfig.class);

        var userService = context.getBean(UserService.class);

        ArrayList<User> userList = new ArrayList<>();

        userList.add(new User("Vitaliy","Andrushko",13));
        userList.add(new User("Vitaliy2","Andrushko2",23));
        userList.add(new User("Vitaliy3","Andrushko3",33));
        userList.add(new User("Vitaliy4","Andrushko4",43));
        userList.add(new User("Vitaliy5","Andrushko5",53));
        userList.add(new User("Vitaliy6","Andrushko6",63));
        userList.add(new User("Vitaliy7","Andrushko7",73));
        userList.add(new User("Vitaliy8","Andrushko8",83));
        userList.add(new User("Vitaliy9","Andrushko9",93));
        userList.add(new User("Vitaliy10","Andrushko10",103));

        for (User user: userList) {
            userService.addUser(user);
        }

        var user = userService.getUserById(1L);

        System.out.println(user);

        userService.deleteUser(user);

        System.out.println(userService.getAllUsers());
    }
}
