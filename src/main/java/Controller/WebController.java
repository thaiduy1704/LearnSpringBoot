package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class WebController {
    // Nhan request get
    @RequestMapping("/")// Nếu người dùng request tới địa chỉ "/"
    public String index(){
        System.out.println("INDEX");
        return "index";// Trả về file index.html
    }
    @RequestMapping("/about")// Nếu người dùng request tới địa chỉ "/about"
    public String about(){
        return "about";  // Trả về file about.html
    }
    @RequestMapping (value = "/hello", method = RequestMethod.POST)
    public String hello(@RequestParam(value = "name",required = true) String name,Model model  ){
        model.addAttribute("name", name);
        return "hello";



    }
}
