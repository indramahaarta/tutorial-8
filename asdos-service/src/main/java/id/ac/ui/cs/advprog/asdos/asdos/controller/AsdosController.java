package id.ac.ui.cs.advprog.asdos.asdos.controller;

import id.ac.ui.cs.advprog.asdos.asdos.service.AsdosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/category")
public class AsdosController {
    @Autowired
    private AsdosService asdosService;


}
