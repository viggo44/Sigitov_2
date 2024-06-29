package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.model.User;


public class Main {
    public static void main(String[] args) {

        UserDaoHibernateImpl userdao= new  UserDaoHibernateImpl();
        userdao.createUsersTable();
User user0 = new User("Artem0", "Sigitov", (byte) 23);
        User user1 = new User("Artem1", "Sigitov", (byte) 23);
        userdao.saveUser("A","S",(byte) 2);
        userdao.saveUser("b","S",(byte) 2);
        userdao.saveUser("c","S",(byte) 2);
        userdao.removeUserById(2);
        System.out.println(userdao.getAllUsers());
        userdao.cleanUsersTable();
//userdao.dropUsersTable();

    }
}
