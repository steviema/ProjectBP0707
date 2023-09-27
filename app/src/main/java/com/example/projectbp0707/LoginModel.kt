package com.example.projectbp0707

class LoginModel {
    //variabel
    var username = ""
    var password = ""
    //method/func
    fun loginCek():Boolean{
        if(username.equals("stevi") && password.equals("admin")){
            return true
        }else{
            return false
        }
    }

}