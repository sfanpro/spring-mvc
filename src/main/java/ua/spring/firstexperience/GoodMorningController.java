package ua.spring.firstexperience;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class GoodMorningController {

    //controller method to show the initial HTML form
    @RequestMapping("/showForm")
    public String goodMorning(){
        return "good-morning-form";
    }

    //controller method to process the HTML form
    @RequestMapping("/processForm")
    public String processForm(){
        return "good-morning";
    }

    // new a controller method to read from data and add data to the model
    @RequestMapping("/processFormVersionTwo")
    public String letsShoutBlessed( HttpServletRequest request, Model model){

        //read the request parameter from HTML form
        String theName = request.getParameter("developerName");

        //convert the data to all caps
        theName = theName.toUpperCase();

        //create the message
        String result = "We congratulate you! "+ theName;

        //add message to the model
        model.addAttribute("message", result);

        return "good-morning";
    }

    @RequestMapping("/processFormVersionThree")
    public String processFormVersionThree( @RequestParam("developerName") String theName, Model model){

        //convert the data to all caps
        theName = theName.toUpperCase();

        //create the message
        String result = "You became a member of the happy company and have received the blessing!  "+ theName;

        //add message to the model
        model.addAttribute("message", result);

        return "good-morning";
    }
}
