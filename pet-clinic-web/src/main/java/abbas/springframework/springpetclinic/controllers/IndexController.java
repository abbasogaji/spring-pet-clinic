package abbas.springframework.springpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"/", "", "index.html", "index"})
    public String getIndexPage(Model model){
        model.addAttribute("message", "Stirnnnnngg of lifeeeeee");
        return "index";
    }

}
