package id.ac.ui.cs.advprog.tutorial8.asdos.controller;

import id.ac.ui.cs.advprog.tutorial8.asdos.service.AsdosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/category")
public class AsdosController {
    @Autowired
    private AsdosService asdosService;


}
