package abbas.springframework.springpetclinic.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vets")
public class VetController {

    @RequestMapping("")
    public String getVets(Model model){

        String vets[] = {"Cat", "Dog", "Lion"};
        model.addAttribute("vets", vets);
        return "vets/index";
    }
}
