package com.example.android.dagger.registration

import com.example.android.dagger.registration.enterdetails.EnterDetailsFragment
import com.example.android.dagger.registration.termsandconditions.TermsAndConditionsFragment
import dagger.Subcomponent

@Subcomponent
interface RegistrationComponent {

    @Subcomponent.Factory
    interface Factory{
        fun create(): RegistrationComponent
    }
    fun injection(activity:RegistrationActivity)
    fun injection(fragment:EnterDetailsFragment)
    fun injection(fragment:TermsAndConditionsFragment)
}