package com.yash.talentacquisition.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.yash.talentacquisition.controller.util.UserRequestContext;
import com.yash.talentacquisition.model.User;
import com.yash.talentacquisition.service.UserService;


/**
 * Handles login operations and information display.
 * 
 * @author Durgesh Vaishnav
 */
@Controller
public class LoginController {
	
	private transient final Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private UserRequestContext userRequestContext;
    @Autowired
    private UserService userService;
    
    /**
     * Renders a partial for the logged-in user status.
     */
    @RequestMapping(method=RequestMethod.GET, value="/login/status")
    public ModelAndView getStatusPartial(final ModelMap modelMap) {
    	logger.debug("GET /login/status");
        modelMap.put("userRequestContext", userRequestContext);
        return new ModelAndView("login/_status");
    }
    
    @RequestMapping(value="/loginfailed", method = RequestMethod.GET)
	public String loginerror(ModelMap model) {
    	logger.debug("GET /loginfailed");
		model.addAttribute("error", "true");
		return "redirect:/login";
 
	}
    
    @RequestMapping(method=RequestMethod.GET, value="/login")
    public ModelAndView getLoginPage() {
    	logger.debug("GET /login");
        return new ModelAndView("login/login");
    }
    
    @RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logout(ModelMap model) {
    	logger.debug("GET /logout");
		return "redirect:/login";
 
	}
    
    @Transactional
    @RequestMapping(method=RequestMethod.POST, value="/login")
    public String login(@RequestParam("email") final String email, @RequestParam("password") final String password) {
    	logger.debug("POST /login");
        final User user = userService.getUserByEmail(email);
        logger.debug("found user :"+user);
        logger.debug("user password :"+ password);
        logger.debug("found user password :"+ user.getPasswordPlaintext());
        logger.debug("match :"+ user.passwordMatches(password));
        if ( null == user || !user.passwordMatches(password) ) {
            return "redirect:/login";
        }
        logger.debug("redirect to users :");
        return "redirect:/dashboard";
    }
}
