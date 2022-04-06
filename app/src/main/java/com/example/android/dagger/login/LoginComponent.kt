package com.example.android.dagger.login

import dagger.Subcomponent

@Subcomponent
interface LoginComponent {

    @Subcomponent.Factory
    interface Factory{
        fun create():LoginComponent
    }
    fun injection(activity:LoginActivity)
}