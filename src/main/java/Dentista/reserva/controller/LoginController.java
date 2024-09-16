package Dentista.reserva.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@PreAuthorize("denyAll() ")
public class LoginController {


    @GetMapping("/Login")
    @PreAuthorize("permitAll()")
    public String showHomePage() {
        return "Home";
    }


}
