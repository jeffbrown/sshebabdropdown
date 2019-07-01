package sshebabdropdown

import grails.util.Holders

class Profile {
    String accType
    static constraints = {
        accType(nullable: true, inList: Holders.config.getProperty('profile.accType', List))
    }
}
