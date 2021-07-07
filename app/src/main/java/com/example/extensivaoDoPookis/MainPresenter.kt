package com.example.extensivaoDoPookis

class MainPresenter(private val view: MainContract.View) : MainContract.Presenter {

    override fun validateEmail(email:String, password: String){
        when{
            email.isEmpty() -> view.showFeedback("Digite um e-mail")
            password.isEmpty() -> view.showFeedback("Digite uma senha")
            else -> {
                view.showFeedback("Entrou")
                view.navigateLoggedActivity()
            }
        }
    }
}