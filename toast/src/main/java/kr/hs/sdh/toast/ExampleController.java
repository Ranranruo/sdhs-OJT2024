package kr.hs.sdh.toast;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import java.util.Map;

@Controller
public class ExampleController {

    @GetMapping(value = "/profile")
    public String myProfile() {
        return "profile";
    }

    @GetMapping(value = "/list")
    public ModelAndView myList(Model model) {
        ModelAndView modelAndView = new ModelAndView("list");
        String[] fruits = new String[]{"사과", "바나나", "멜론", "수박"};
//        modelAndView.addObject("apple", "사과");
//        modelAndView.addObject("banana", "바나나");
//        modelAndView.addObject("melon", "멜론");
        modelAndView.addObject("fruits", fruits);

        return modelAndView;
    }

}
