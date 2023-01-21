package com.spring.springapp.auth;

// import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.spring.springapp.auth.authService;


@Controller
@RestController
@RequestMapping("/api/v1")
public class authController {

    private authService service;

    @GetMapping("/home")
    public void getHello() {
        try {
            service.getHello();
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
