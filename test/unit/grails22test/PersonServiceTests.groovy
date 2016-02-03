package grails22test

import grails.test.mixin.Mock
import spock.lang.Specification

@Mock([Person, SoftballTeamPreference])
class PersonServiceTests extends Specification {

    def 'test a thing'() {
        expect:
        true
    }
}
