package com.example.githubnumbers.Controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

public class NumberService {

    public void printNumbers(Model model,@RequestParam int n) {

        List<Integer> list = new ArrayList<>();
        
        for(int i = 1; i <= n; i++) {

            if (i % 3==0){

                list.add(i);
            }
        }
        model.addAttribute("printNum", list);


    }
}
