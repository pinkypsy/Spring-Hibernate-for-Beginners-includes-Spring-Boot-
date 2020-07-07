package ua.alvin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
//@RequestMapping(value="customer", method= RequestMethod.POST)
@RequestMapping("customer")
public class CustomerController {

//    @RequestMapping(value = "/showForm", method= RequestMethod.GET)
//    @GetMapping("/showForm")
    @RequestMapping("/showForm")
   public String showForm(Model theModel){

//        ua.alvin.Customer theCustomer = new ua.alvin.Customer();
        theModel.addAttribute("customer", new Customer());

        return "customer-form";
    }

//    @GetMapping("/processedForm")
    @RequestMapping("/processedForm")
   public String processedForm(@Valid @ModelAttribute("customer") Customer theCustomer,
                               BindingResult theBindingResult) {

        if (theBindingResult.hasErrors()) return "customer-form";
        else return "customer-confirmation";
    }

}
