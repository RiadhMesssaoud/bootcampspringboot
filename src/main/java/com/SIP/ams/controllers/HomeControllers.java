package com.SIP.ams.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeControllers {
@RequestMapping("/info")
   public String info()
   {
	System.out.println("methode info");
	   return "home/info" ;
   }
@RequestMapping("/affiche")
   public String affichage()
	   {
	System.out.println("methode affichage");
		return "home/affiche" ;
	   }


@RequestMapping("/information")
public String information()
	   {
		return "home/information" ;
	   }

}