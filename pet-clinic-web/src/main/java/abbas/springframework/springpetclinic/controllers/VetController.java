package abbas.springframework.springpetclinic.controllers;


import abbas.springframework.springpetclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vets")
public class VetController {


    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }



    @RequestMapping("")
    public String getVets(Model model){
        model.addAttribute("vets", this.vetService.findAll());
        return "vets/index";
    }
}
