package com.example.githubnumbers.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class NumberController {

    @GetMapping("/numbers")

    public String displayNumbers() {

        NumberService numbers = new NumberService();

        numbers.printNumbers(null, 60);

        return "index";

    }


}