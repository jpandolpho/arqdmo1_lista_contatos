package br.edu.ifsp.dmo1.listadecontatos.model

class Contact(val name: String, val phone: String):Comparable<Contact> {
    override fun compareTo(other: Contact): Int {
        return this.name.compareTo(other.name)
    }

    override fun toString(): String {
        return "Contato{name:'$name', phone:'$phone'}"
    }
}