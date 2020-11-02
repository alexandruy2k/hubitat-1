/**
 * Simple Virtual Resetting Switch Driver that works on
 * Amazon Alexa to force on/off
 *
 *
 * Version:  1.0
 *
 */
metadata {
    definition(name: "Virtual Resetting Switch", namespace: "waytotheweb", author: "Jonathan Michaelson") {
        capability "Switch"

	command "other"
    }
}

def on() {
    log.info "on()"
    sendEvent(name: "switch", value: "on")
    runIn(2, "other")
}

def off() {
    log.info "off()"
    sendEvent(name: "switch", value: "off")
    runIn(2, "other")
}

def other() {
    log.info "other()"
    sendEvent(name: "switch", value: "other")
}