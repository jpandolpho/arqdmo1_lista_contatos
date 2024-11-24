package br.edu.ifsp.dmo1.listadecontatos.model

import java.util.LinkedList

object ContactDao {
    private val dataset = LinkedList<Contact>()

    fun insert(contact: Contact) {
        dataset.add(Contact(contact.name, contact.phone))
        val aux = dataset.sorted()
        dataset.clear()
        dataset.addAll(aux)
    }

    fun findAll(): List<Contact> {
        return ArrayList(dataset)
    }
}