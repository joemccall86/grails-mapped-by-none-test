package grails22test

class Person {
    String name
    static hasOne = [softballTeampreference: SoftballTeamPreference]
}
