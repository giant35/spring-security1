/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package security1;

import java.util.logging.Logger;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author sihai
 */
@Controller
public class UserController {

    private static final Logger LOG = Logger.getLogger(UserController.class.getName());

    @Autowired
    UserRepo userRepo;

    @GetMapping("/mylogin")
    public String login() {
        return "login";
    }

    @PostMapping("/mylogin")
    public String valid(String email, String password, HttpSession session) {
        LOG.info("email:" + email + " password:" + password);
        return "redirect:/user/info";
    }

    @GetMapping("/user/info")
    public String info() {

        return "user/info";
    }
}
