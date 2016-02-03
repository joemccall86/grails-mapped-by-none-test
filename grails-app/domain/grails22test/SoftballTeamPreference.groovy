package grails22test

class SoftballTeamPreference {

    static constraints = {
    }

    static belongsTo = [owner: Person]
    static hasMany = [players: Person]
    static mappedBy = [players: "none"]
}
