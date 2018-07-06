package com.monochromeroad.flr.console;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Random;
import java.util.List;
import java.util.ArrayList;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(Model model) {
        String smell = "におうな";

        List<String> descriptions = new ArrayList<>();
        descriptions.add("シメイブルー。シメイ・ブルーは、もともと1948年にクリスマスビールとしてリリースされたもので、人気を集め、現在では通年で生産されています。");
        descriptions.add("乾杯という文化");
        descriptions.add("ビール腹。飲み過ぎるとなる");

        model.addAttribute("message", "適当にビールの情報を出します!");

        Random rndSeed = new Random();
        int beerIndex = rndSeed.nextInt(3);

        String imageURL = "https://s3-ap-northeast-1.amazonaws.com/beer-console-images/beer-" + Integer.toString(beerIndex) + ".jpg";
        model.addAttribute("imageURL", imageURL);
        model.addAttribute("description", descriptions.get(beerIndex));

        return "index";
    }
}

