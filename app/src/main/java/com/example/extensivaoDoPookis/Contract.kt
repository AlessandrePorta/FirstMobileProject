package com.example.extensivaoDoPookis

interface Contract {

    interface View {
        fun showFeedback(text:String)
    }

    interface Presenter{
        fun validateEmail(email:String, password:String){}
    }
}