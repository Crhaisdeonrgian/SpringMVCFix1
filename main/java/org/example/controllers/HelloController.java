/*
package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class HelloController {
        @GetMapping("/world")
        @ResponseBody
        public String sayHello(@RequestParam(value = "name", required = false) String name,
                               @RequestParam(value = "surname", required = false) String surname,
                                Model model) {
            model.addAttribute("message", "Hello "+ name + " "+ surname+" !!");
            return "index";
        }
}
*/

