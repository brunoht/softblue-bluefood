package br.com.lohl.softblue.softblue.infrastructure.web.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.lohl.softblue.softblue.application.ClientService;
import br.com.lohl.softblue.softblue.domain.client.Client;

@Controller
@RequestMapping(path = "/public")
public class PublicController {
    
    @Autowired
    private ClientService clientService;

    @GetMapping("/client/new")
    public String newClient(Model model) {
        Client client = new Client();
        model.addAttribute("client", client);
        HelperController.setEditMode(model, false);
        return "client-register";
    }

    @PostMapping("/client/save")
    public String saveClient(
        @ModelAttribute("client") @Valid Client client, 
        Errors errors, 
        Model model
    ) {
        if (errors.hasErrors()) {

        }
        HelperController.setEditMode(model, true);
        clientService.saveClient(client);
        return "client-register";
    }
}
