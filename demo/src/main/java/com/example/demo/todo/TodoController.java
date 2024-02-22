package com.example.demo.todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TodoController {


    private List<String> tasks = new ArrayList<>();

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("tasks", tasks);
        return "index";
    }

    @PostMapping("/addTask")
    public String addTask(String taskName) {
        tasks.add(taskName);
        return "redirect:/";
    }

    @GetMapping("/checked")
    public String checked(String task) {
        tasks.remove(task);

            System.out.println(task);


        return "redirect:/";
    }

}

