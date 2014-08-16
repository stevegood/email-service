html {
    head {
        title("Email Service &middot; $title")
        link(rel: 'stylesheet', href: '/css/bootstrap.min.css')
        link(rel: 'stylesheet', href: '/css/cosmo.bootswatch.min.css')
    }
    body {

        div(class: 'navbar navbar-default navbar-fixed-top') {
            div(class: 'container') {
                div(class: 'navbar-header') {
                    button(type: 'button', class: 'navbar-toggle', 'data-toggle':'collapse','data-target':'.navbar-responsive-collapse'){
                        span(class: 'icon-bar')
                        span(class: 'icon-bar')
                        span(class: 'icon-bar')
                    }
                    a(href: '/', class: 'navbar-brand') {
                        b(class:'glyphicon glyphicon-home','')
                    }
                }
                div(class: 'navbar-collapse collapse navbar-responsive-collapse') {
                    ul(class: 'nav navbar-nav navbar-right') {
                        li {
                            a(href: '/config', 'Configure')
                        }
                    }
                }
            }
        }

        div(class: 'container') {
            content()
        }

        script(type: 'text/javascript', src: '/js/bootstrap.min.js')
    }
}
