package com.metacoding.authblog.user;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@RequiredArgsConstructor
@Repository
public class UserRepository {
    private final EntityManager em;

    public User findByUsername(String username) {
        Query query = em.createQuery("select u from User u where u.username = :username", User.class);
        query.setParameter("username", username);
        try {
            return (User) query.getSingleResult();
        }
        catch (RuntimeException e) {
            throw new RuntimeException("아이디 혹은 패스워드가 일치하지 않습니다.");
        }
    }

    public User save(User user) {
        em.persist(user);
        return user;
    }
}
