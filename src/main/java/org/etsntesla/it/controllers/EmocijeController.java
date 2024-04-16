package org.etsntesla.it.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmocijeController {

    @Autowired
    EmocijeService service;
}
