package com.metacoding.authblog.user;

import lombok.Data;


public class UserRequset {
    @Data
    public static class LoginDTO{
        public String username;
        public String password;
    }
}
