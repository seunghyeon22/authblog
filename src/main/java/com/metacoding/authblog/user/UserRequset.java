package com.metacoding.authblog.user;

import lombok.Data;
import org.springframework.security.crypto.password.PasswordEncoder;


public class UserRequset {
    @Data
    public static class LoginDTO{
        private String username;
        private String password;
    }
    @Data
    public class JoinDTO {
        private String username;
        private String password;
        private String email;

        public User toEntity(PasswordEncoder passwordEncoder) {
            String encodedPassword = passwordEncoder.encode(password);
            System.out.println(encodedPassword);
            User user = new User(null, username, encodedPassword, email, null);
            return user;
        }
    }
}
