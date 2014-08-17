layout 'layout.tpl', title: 'Configuration', content: contents {
    div(class: 'page-header') {
        div(class: 'row') {
            div(class: 'col-xs-12') {
                h1 'Configuration'
            }
        }
    }

    div(class: 'row') {
        div(class: 'col-md-6') {
            div(class: 'well') {
                h3 'Application'
                div(class: 'form-horizontal') {
                    div(class: 'form-group') {
                        label(class: 'col-sm-3 col-xs-4 control-label', for: 'queue-rate', 'Queue Rate')
                        div(class: 'col-sm-9 col-xs-8') {
                            input(class: 'form-control', id: 'queue-rate', type: 'number', value: 60, min: 30)
                        }
                    }
                }
            }
        }
        div(class: 'col-md-6') {
            div(class: 'well') {
                h3 'SMTP'
                div(class: 'form-horizontal') {
                    div(class: 'form-group') {
                        label(class: 'col-sm-3 col-xs-4 control-label', for: 'smtp-host', 'Host')
                        div(class: 'col-sm-9 col-xs-8') {
                            input(class: 'form-control', id: 'smtp-host', type: 'text')
                        }
                    }

                    div(class: 'form-group') {
                        label(class: 'col-sm-3 col-xs-4 control-label', for: 'smtp-port', 'Port')
                        div(class: 'col-sm-9 col-xs-8') {
                            input(class: 'form-control', id: 'smtp-port', type: 'number', value: 25)
                        }
                    }
                }
            }
        }
    }
}
