package kr.jh.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <pre>
 * Index
 * 
 * Created on 2012. 5. 28.
 * Copyright Jaeho J
 * </pre>
 * 
 * @author <a href="http://goo.gl/ZhMb8">Jaeho J</a>
 */
@Controller
public class RootController {

    private Logger logger = Logger.getLogger(RootController.class);

    @RequestMapping("/index")
    public String index(HttpServletRequest request) {
        if(logger.isDebugEnabled()) {
            logger.debug("-=-=- index");
        }

        // return "index";
        return "base/main/test";
    }

    @RequestMapping("/test")
    public String test(HttpServletRequest request) {
        if(logger.isDebugEnabled()) {
            logger.debug("-=-=- test");
        }

        // return "index";
        return "base/main/test";
    }

    @RequestMapping("/err")
    public String err(HttpServletRequest request) throws Exception {
        if(logger.isDebugEnabled()) {
            logger.debug("-=-=- test");
        }

        throw new Exception();

        // return "index";
        // return "base/main/test";
    }
}
