package com.example.extensivaoDoPookis

interface MainContract {

    interface View {
        fun showFeedback(text:String)
        fun navigateLoggedActivity()
    }

    interface Presenter{
        fun validateEmail(email:String, password:String){}
    }
}