package com.example.extensivaoDoPookis

class LoggedContract {

    interface View {
        fun showFeedback(text:String)
    }

    interface Presenter{
        fun validateLogout(email:String, password:String){}
    }
}