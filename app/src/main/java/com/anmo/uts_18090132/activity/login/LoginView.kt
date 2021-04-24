package com.anmo.uts_18090132.activity.login

import com.anmo.uts_18090132.model.User

interface LoginView {
    fun onSuccessLogin(user: User?)
    fun onErrorLogin(msg: String?)
}