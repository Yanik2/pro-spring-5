class Singer {
    def firstName
    def lastName
    def birthDate

    String toString() {
        "($firstName, $lastName, $birthDate)"
    }
}

Singer singer = new Singer(firstName: 'John', lastName: 'Mayer', birthDate: new Date(new GregorianCalendar(1977, 9, 16).getTime().getTime()))
Singer anotherSinger = new Singer(firstName: 39, lastName: 'Krasinski', birthDate:
        new Date(new GregorianCalendar(1977, 9, 15).getTime().getTime()))

println singer
println anotherSinger

println singer.firstName + 39
println anotherSinger.firstName + 39

def names = ['john', 'Clayton', 'mayer']
names.each {println 'hello: ' + it}