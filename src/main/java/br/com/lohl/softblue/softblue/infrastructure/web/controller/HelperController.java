package br.com.lohl.softblue.softblue.infrastructure.web.controller;

import org.springframework.ui.Model;

public class HelperController {
    
    public static void setEditMode(Model model, boolean isEdit) {
        model.addAttribute("editMode", isEdit);
    }
}
