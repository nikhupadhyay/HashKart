package Hashkart.Controller;

import Hashkart.Model.Item;
import Hashkart.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;

@Controller
public class HomeController {

    public HomeController(){
        System.out.println("**** Home Contoler ****");
    }

    @Autowired
    private ItemService itemService;

    @RequestMapping("/")
    public String getAllItems(Model model){

        ArrayList<Item> items=itemService.getAllItems();
        model.addAttribute("items",items);

        return "index";
    }
}
