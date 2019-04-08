package ua.spring.firstexperience;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/developer")
public class DeveloperController {

    @RequestMapping("/showForm")
    public String showForm( Model theModel ) {
        // create a new developer object
        Developer theDeveloper = new Developer();

        //add developer object to the model
        theModel.addAttribute("developer", theDeveloper);
        return "developer-form";
    }

    @RequestMapping("/processForm")
    public String processForm( @ModelAttribute("developer") Developer theDeveloper ){
        //log the input data
        System.out.println("theDeveloper: "+ theDeveloper.getFirstName()+" "+ theDeveloper.getLastName());
        return "developer-confirmation";
    }
}


