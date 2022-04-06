package com.example.android.dagger.settings

import dagger.Subcomponent

@Subcomponent
interface SettingsComponent{

    @Subcomponent.Factory
    interface Factory {
        fun create(): SettingsComponent
    }

    fun injection(activity: SettingsActivity)
}