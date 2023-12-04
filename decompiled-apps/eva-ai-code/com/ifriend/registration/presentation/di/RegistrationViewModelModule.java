package com.ifriend.registration.presentation.di;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ifriend.registration.presentation.ui.email.EmailRegistrationViewModel;
import com.ifriend.registration.presentation.ui.email.resetPassword.ResetPasswordViewModel;
import com.ifriend.registration.presentation.ui.registration.VideoBackgroundRegistrationViewModel;
import com.ifriend.ui.base.di.ViewModelFactory;
import com.ifriend.ui.base.di.ViewModelKey;
import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;
import kotlin.Metadata;
/* compiled from: RegistrationViewModelModule.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH'J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\fH'J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u000eH'¨\u0006\u000f"}, d2 = {"Lcom/ifriend/registration/presentation/di/RegistrationViewModelModule;", "", "()V", "bindViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Lcom/ifriend/ui/base/di/ViewModelFactory;", "emailRegistrationViewModel", "Landroidx/lifecycle/ViewModel;", "viewModel", "Lcom/ifriend/registration/presentation/ui/email/EmailRegistrationViewModel;", "registrationV2ViewModel", "Lcom/ifriend/registration/presentation/ui/registration/VideoBackgroundRegistrationViewModel;", "resetEmailViewModel", "Lcom/ifriend/registration/presentation/ui/email/resetPassword/ResetPasswordViewModel;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public abstract class RegistrationViewModelModule {
    public static final int $stable = 0;

    @Binds
    public abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelFactory viewModelFactory);

    @ViewModelKey(EmailRegistrationViewModel.class)
    @Binds
    @IntoMap
    public abstract ViewModel emailRegistrationViewModel(EmailRegistrationViewModel emailRegistrationViewModel);

    @ViewModelKey(VideoBackgroundRegistrationViewModel.class)
    @Binds
    @IntoMap
    public abstract ViewModel registrationV2ViewModel(VideoBackgroundRegistrationViewModel videoBackgroundRegistrationViewModel);

    @ViewModelKey(ResetPasswordViewModel.class)
    @Binds
    @IntoMap
    public abstract ViewModel resetEmailViewModel(ResetPasswordViewModel resetPasswordViewModel);
}
