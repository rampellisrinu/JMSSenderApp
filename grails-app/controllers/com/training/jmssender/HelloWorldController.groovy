package com.training.jmssender

class HelloWorldController {

    def messageSenderService

    def index() {
        render(view: "index")
    }

    def sendMessage(String message) {
        log.info "message from form "+message
        def model = [:]
        messageSenderService.sendMessage(message)
        model.message = "Message sent."+message
        render(view: "index",model: model)
    }
}
