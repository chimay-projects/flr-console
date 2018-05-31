package com.monochromeroad.flr.console;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Random;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("message", "適当にビールの画像を出します!");

        Random rndSeed = new Random();
        int imageIndex = rndSeed.nextInt(3);
        String imageURL = "https://s3-ap-northeast-1.amazonaws.com/beer-console-images/beer-" + Integer.toString(imageIndex) + ".jpg";
        model.addAttribute("imageURL", imageURL);

        return "index";
    }
}

