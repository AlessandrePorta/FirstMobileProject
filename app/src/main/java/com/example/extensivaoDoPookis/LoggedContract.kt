package com.example.extensivaoDoPookis

class LoggedContract {

    interface View {
        fun showFeedback(text:String)
        fun navigateLoggedActivity()
    }

    interface Presenter{
        fun validateLogout(email:String, password:String){}
    }
}