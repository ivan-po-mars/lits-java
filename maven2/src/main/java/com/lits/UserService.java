package com.lits;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private SessionFactory sessionFactory;

    public UserService(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void addUser(User user) {
        getCurrentSession().save(user);
    }

    public User getUserById(Long id) {
        User user = getCurrentSession().createQuery("SELECT u FROM User u where u.id = ?1", User.class)
                .setParameter(1, id)
                .getSingleResult();

        return user;
    }

    public void deleteUser(User user) {
        Session session = getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.delete(user);
        transaction.commit();
    }

    public List<User> getAllUsers() {
        return (List<User>) getCurrentSession().createQuery("SELECT u FROM User u", User.class).getResultList();
    }

    private Session getCurrentSession() {
        return sessionFactory.openSession();
    }
}
