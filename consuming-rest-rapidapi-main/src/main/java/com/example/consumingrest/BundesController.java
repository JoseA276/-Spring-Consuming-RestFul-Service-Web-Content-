package com.example.consumingrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(BundesController.Bundes)
public class BundesController {
    public static final String Bundes = "/bundesliga";

    @Autowired
    BundesService bundesService;

    @GetMapping
    public String getSports(Model model) {
        BundesResponse[] sp = bundesService.getBundesResponse();
        model.addAttribute("bundes", sp);
        return "bundes";
    }

}
