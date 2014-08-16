package org.stevegood.email

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView

/**
 * @author <a href="http://stevegood.org">Steve Good</a>
 * @since 2014-08-16
 */
@Controller
@RequestMapping('/config')
class ConfigController {

    @RequestMapping
    ModelAndView index() {
        new ModelAndView('config/index')
    }

}
