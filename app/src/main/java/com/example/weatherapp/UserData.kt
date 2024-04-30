package com.example.weatherapp

import android.provider.ContactsContract.CommonDataKinds.Email

class UserData(private val username:String, private val email:Email) {

    fun getUsername(): String {
        return username
    }

    fun getEmail(): Email {
        return email
    }

}