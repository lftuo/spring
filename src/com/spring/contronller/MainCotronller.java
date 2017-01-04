package com.spring.contronller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by MrTuo on 2016/12/25.
 */
@Controller
public class MainCotronller {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "login";
    }
}
