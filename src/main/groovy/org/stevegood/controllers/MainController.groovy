package org.stevegood.controllers

import org.springframework.web.bind.annotation.*
import org.springframework.stereotype.*

@Controller
class MainController {
    
    @RequestMapping('/')
    String index() {
        'Hello world!'
    }
    
}