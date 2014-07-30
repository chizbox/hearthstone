package com.hearthstone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hearthstone.model.Contact;

@Controller
public class ContactController {
	private Contact contact;

	@RequestMapping(value = "/addContact", method = RequestMethod.POST)
	public String addContact(@ModelAttribute("contact") Contact contact,
			BindingResult result) {

		System.out.println("First Name:" + contact.getFirstName()
				+ "Last Name:" + contact.getLastName());
		this.contact = contact;
		return "redirect:contact.html";
	}

	@RequestMapping("/contact")
	public ModelAndView showContacts() {
		if (contact == null) {
			contact = new Contact();
		}

		return new ModelAndView("contact", "command", contact);
	}
}
