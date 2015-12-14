package com.training.jmssender

class MessageSenderService {
    def jmsService

    def sendMessage(String message) {
        jmsService.send(queue: "queue.notification", message)
    }
}
