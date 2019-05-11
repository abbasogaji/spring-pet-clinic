package abbas.springframework.springpetclinic.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owners")
public class OwnerController {

    @RequestMapping("")
    public String getOwners(Model model){
        model.addAttribute("ownerName", "Abbas Ogaji");
        return "owner/index";
    }
}
