package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @RequestMapping("")  //requesting info
    @ResponseBody
    public String skillsTrackerSetUp(){
        return "<html>" +
                    "<h1>Skills Tracker</h1>" +
                    "<h2>Here are some cool languages you should check out!</h2>" +
                    "<ol>" +
                        "<li>Javascript</li>" +
                        "<li>Java</li>" +
                        "<li>PHP</li>" +
                    "</ol>" +
                "</html>";
    }

    @GetMapping("/form") //getting info - get info and just want to show it, user doesnt have to see it
    @ResponseBody
    public String skillsTrackerForm(){
        return "<html>" +
                    "<body>" +
                        "<form action='' method='post'>" +
                            "<label>Name: <input type='text' name='name'><br></label>" +
                            "<label>My favorite language: </label>" +
                            "<select name='language1'>" +
                            "<label>My favorite language:</label>" +
                            "<option value='Java'>Java</option>" +
                            "<option value='Javascript'>Javascript</option>" +
                            "<option value='PHP'>PHP</option></select><br>" +

                            "<label>My second favorite language: </label>" +
                            "<select name='language2'>" +
                            "<label>My second favorite language:</label>" +
                            "<option value='Java'>Java</option>" +
                            "<option value='Javascript'>Javascript</option>" +
                            "<option value='PHP'>PHP<br></option></select><br>" +

                            "<label>My third favorite language: </label>" +
                            "<select name='language3'>" +
                            "<label>My third favorite language:</label>" +
                            "<option value='Java'>Java</option>" +
                            "<option value='Javascript'>Javascript</option>" +
                            "<option value='PHP'>PHP<br></option></select><br>" +

                            "<button>Submit</button>" +
                "</select>" +
                "</form>" +
                "</body>" +
                "</html>";
    }



    @PostMapping("/form")
    @ResponseBody
    public String formWithQueryParam(@RequestParam String name, @RequestParam String language1, @RequestParam String language2, @RequestParam String language3){
        return "<html>" +
                "<body>" +
                    "<h1>Hello, " + name + "!</h1>" +
                    "<ol>" +
                        "<li>" + language1 + "</li>" +
                        "<li>" + language2 + "</li>" +
                        "<li>" + language3 + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";

    }
}


//pass languages as well