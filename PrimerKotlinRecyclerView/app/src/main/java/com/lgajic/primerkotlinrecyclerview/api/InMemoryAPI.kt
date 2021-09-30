package com.lgajic.primerkotlinrecyclerview.api

import com.lgajic.primerkotlinrecyclerview.model.Contact

class InMemoryAPI {
    companion object {
        fun getContacts(): List<Contact> {
            return listOf(Contact("Pera", "Peric", "pperic@mail.local", "+381111234567"),
                          Contact("Mika", "Mikic", "mmikic@mail.local", "+381111234568"),
                          Contact("Laza", "Lazic", "llazic@mail.local", "+381111234569"),
                          Contact("Pera", "Peric", "pperic@mail.local", "+381111234567"),
                          Contact("Mika", "Mikic", "mmikic@mail.local", "+381111234568"),
                          Contact("Laza", "Lazic", "llazic@mail.local", "+381111234569"),
                          Contact("Pera", "Peric", "pperic@mail.local", "+381111234567"),
                          Contact("Mika", "Mikic", "mmikic@mail.local", "+381111234568"),
                          Contact("Laza", "Lazic", "llazic@mail.local", "+381111234569"),
                          Contact("Pera", "Peric", "pperic@mail.local", "+381111234567"),
                          Contact("Mika", "Mikic", "mmikic@mail.local", "+381111234568"),
                          Contact("Laza", "Lazic", "llazic@mail.local", "+381111234569")
            )
        }
    }
}