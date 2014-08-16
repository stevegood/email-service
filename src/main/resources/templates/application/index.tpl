layout 'layout.tpl', title: 'Home',
content: contents {
    div(class: 'page-header') {
        div(class: 'row') {
            div(class: 'col-xs-12'){
                h1 'Email Service'
            }
        }
    }

    div(class: 'row') {
        div(class: 'col-md-4'){
            yield 'Col 1'
        }
        div(class: 'col-md-4'){
            yield 'Col 2'
        }
        div(class: 'col-md-4'){
            yield 'Col 2'
        }
    }
}
