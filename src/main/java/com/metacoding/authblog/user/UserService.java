package com.metacoding.authblog.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User 로그인(UserRequset.LoginDTO loginDTO) {
        User userPs = userRepository.findByUsername(loginDTO.getUsername());
        if(!userPs.getPassword().equals(loginDTO.getPassword())) {
            throw new RuntimeException("아이디 혹은 패스워드가 일치하지 않습니다.");
        }
        return userPs;
    }
}
