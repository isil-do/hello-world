package de.htw.Outfittery;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TimeController {

    @RequestMapping("/displayTime")
    public String displayTime(Model model){
        TimeModel timeModel = new TimeModel();
        model.addAttribute("TimeAndDate", timeModel.getTime());
        return "displayTime";
    }
}
