package com.harbourspace.quiz3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GradeController {

    @GetMapping("/grade/{letter}")
    public int GetGrading(@PathVariable String letter)
    {
        if( letter.equals("A") )
            return 100;
        if( letter.equals("B") )
            return 90;
        return 0;
    }
}
