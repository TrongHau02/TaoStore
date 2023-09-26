package applestore.Controller.User;

import applestore.Service.User.HomeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @Autowired
    HomeServiceImpl homeService;

    @RequestMapping(value = {"/", "/trang-chu"})
    public ModelAndView Index() {
        ModelAndView modelAndView = new ModelAndView("user/index");
        modelAndView.addObject("slides", homeService.getDataSlide());
        return modelAndView;
    }

    @RequestMapping(value = {"/product"})
    public ModelAndView Product() {
        ModelAndView modelAndView = new ModelAndView("user/product");
        return modelAndView;
    }
}
