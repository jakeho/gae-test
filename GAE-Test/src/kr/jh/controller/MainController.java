package kr.jh.controller;

import java.util.HashMap;

import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;

import kr.jh.service.MainService;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <pre>
 * Main controller
 * 
 * Created on 2012. 5. 21.
 * Copyright Jaeho J
 * </pre>
 * 
 * @author <a href="http://goo.gl/ZhMb8">Jaeho J</a>
 */
@Controller
@RequestMapping("/main")
public class MainController {

    private Logger      logger = Logger.getLogger(MainController.class);

    @Inject
    @Named("mainService")
    private MainService mainService;

    @RequestMapping
    public String main(HttpServletRequest request) {
        if(logger.isDebugEnabled()) {
            logger.debug("-=-=- main");
        }

        return "base/main/test";
    }

    @RequestMapping("/test/{name}")
    public String test(@PathVariable("name") String name, ModelMap modelMap, HttpServletRequest request) {
        if(logger.isDebugEnabled()) {
            logger.debug("-=-=- test log here");
            logger.debug("-=-=- request params : name / " + name);
        }

        HashMap<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("name", name);

        mainService.add(paramMap);

        return "base/main/test";
    }

    @RequestMapping("/index")
    public String index(ModelMap modelMap, HttpServletRequest request) {
        if(logger.isDebugEnabled()) {
            logger.debug("-=-=- index log here");
        }

        modelMap.addAttribute("members", mainService.list());

        return "base/main/test";
    }
}
