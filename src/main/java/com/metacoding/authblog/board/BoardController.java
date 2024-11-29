package com.metacoding.authblog.board;

import com.metacoding.authblog.user.User;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class BoardController {

    private final HttpSession session;

    @GetMapping("/")
    public String index() {

        return "index";
    }
    @GetMapping("/board/save-form")
    public String saveForm(@AuthenticationPrincipal User sessionUser) {
        return "board/save-form";
    }
}
