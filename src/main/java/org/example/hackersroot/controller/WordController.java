package org.example.hackersroot.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class WordController {

    private final WordService wordService;

    @GetMapping("/word/random")
    public String randomWords(
            @RequestParam(defaultValue = "1") int startWeek,
            @RequestParam(defaultValue = "1") int endWeek,
            Model model
    ) {
        List<WordDto> words = wordService.getRandomWords(startWeek, endWeek, 30);
        model.addAttribute("words", words);
        model.addAttribute("startWeek", startWeek);
        model.addAttribute("endWeek", endWeek);
        return "word/random";
    }
}
