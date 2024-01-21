package HomeWorksSpring.HomeWorksSpring4.controllers;

import HomeWorksSpring.HomeWorksSpring4.model.User;
import HomeWorksSpring.HomeWorksSpring4.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("/home")
@AllArgsConstructor
public class MyController {

    private UserService userService;

    @RequestMapping("/home")
    public String home(){
        return "home";
    }

    @PostMapping("/home")
    public String homeUser(){
        return "user";
    }

//    @RequestMapping("/user")
//    public String addUser(Model model){
//        model.addAttribute("user", userService.getAllUser());
//        return "user";
//    }
    @GetMapping("/user")
    public String getProduct(Model model){
        model.addAttribute("user", userService.getAllUser());
        return "user";
    }
    @PostMapping("/user")
    public String addUser(User user, Model model){
        userService.addUser(user);
        model.addAttribute("user", userService.getAllUser());
        return "user";
    }

}
