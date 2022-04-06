package com.example.android.dagger.di

import com.example.android.dagger.login.LoginComponent
import com.example.android.dagger.settings.SettingsComponent
import dagger.Module

@Module(
    subcomponents = [
        LoginComponent::class,
        SettingsComponent::class
    ]
)
class AppSubComponents