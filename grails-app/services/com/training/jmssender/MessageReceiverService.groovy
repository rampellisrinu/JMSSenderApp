package com.training.jmssender

import grails.plugin.jms.Queue

class MessageReceiverService {

    static exposes = ["jms"]

    @Queue(name = "queue.notification")
    def receiveMessage(message){
        log.info "message received.."+message
    }
}
