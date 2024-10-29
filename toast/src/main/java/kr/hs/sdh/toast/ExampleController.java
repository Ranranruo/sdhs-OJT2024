package kr.hs.sdh.toast;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ExampleController {

    private final ExampleService exampleService;
    private final MenuService menuService;

    public ExampleController(ExampleService exampleService, MenuService menuService) {
        this.exampleService = exampleService;
        this.menuService = menuService;
    }

    @GetMapping(value = "/profile")
    public String myProfile() {
        return "profile";
    }

    @GetMapping(value = "/list")
    public ModelAndView myList(Model model) {
        ModelAndView modelAndView = new ModelAndView("list");
        String[] fruits = exampleService.getFruits();
//        String[] fruits = new String[]{"사과", "바나나", "멜론", "수박"};
//        modelAndView.addObject("apple", "사과");
//        modelAndView.addObject("banana", "바나나");
//        modelAndView.addObject("melon", "멜론");
        modelAndView.addObject("fruits", fruits);

        return modelAndView;
    }

    @GetMapping(value = "/menus")
    public ModelAndView menus() {
        Menu menu = exampleService.getMenu();
        ModelAndView modelAndView = new ModelAndView("menus");
        modelAndView.addObject("menus", menu);
        return modelAndView;
    }

    @GetMapping("/multi-menus")
    public ModelAndView multiMenus() {
        List<Menu> rootMenu = menuService.getRootMenus();
        ModelAndView modelAndView = new ModelAndView("multi-menus");
        modelAndView.addObject("rootMenu", rootMenu);
        return modelAndView;
    }
}

