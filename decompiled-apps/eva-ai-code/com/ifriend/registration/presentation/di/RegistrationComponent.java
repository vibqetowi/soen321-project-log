package com.ifriend.registration.presentation.di;

import com.ifriend.analytics.di.AnalyticUseCasesModule;
import com.ifriend.base.di.BaseComponent;
import com.ifriend.base.di.Feature;
import com.ifriend.icon_switcher.di.PremiumIconManagerModule;
import com.ifriend.registration.presentation.ui.RegistrationActivity;
import com.ifriend.registration.presentation.ui.email.DebugFragment;
import com.ifriend.registration.presentation.ui.email.EmailRegistrationFragment;
import com.ifriend.registration.presentation.ui.email.resetPassword.ResetPasswordFragment;
import com.ifriend.registration.presentation.ui.registration.VideoBackgroundRegistrationFragment;
import com.ifriend.ui.base.BaseActivity;
import com.ifriend.ui.base.di.ActivityComponent;
import dagger.BindsInstance;
import dagger.Component;
import kotlin.Metadata;
/* compiled from: RegistrationComponent.kt */
@Component(dependencies = {BaseComponent.class}, modules = {RegistrationViewModelModule.class, AuthorizationModule.class, AnalyticUseCasesModule.class, PremiumIconManagerModule.class, AppStateModule.class, AuthAnalyticsModule.class})
@Feature
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u000eJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000f"}, d2 = {"Lcom/ifriend/registration/presentation/di/RegistrationComponent;", "Lcom/ifriend/ui/base/di/ActivityComponent;", "inject", "", "registrationActivity", "Lcom/ifriend/registration/presentation/ui/RegistrationActivity;", "debugFragment", "Lcom/ifriend/registration/presentation/ui/email/DebugFragment;", "emailRegistrationFragment", "Lcom/ifriend/registration/presentation/ui/email/EmailRegistrationFragment;", "resetPasswordFragment", "Lcom/ifriend/registration/presentation/ui/email/resetPassword/ResetPasswordFragment;", "videoBackgroundRegistrationFragment", "Lcom/ifriend/registration/presentation/ui/registration/VideoBackgroundRegistrationFragment;", "Builder", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface RegistrationComponent extends ActivityComponent {

    /* compiled from: RegistrationComponent.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H'J\b\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/ifriend/registration/presentation/di/RegistrationComponent$Builder;", "", "activity", "Lcom/ifriend/ui/base/BaseActivity;", "build", "Lcom/ifriend/registration/presentation/di/RegistrationComponent;", "coreComponent", "core", "Lcom/ifriend/base/di/BaseComponent;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Component.Builder
    /* loaded from: classes6.dex */
    public interface Builder {
        @BindsInstance
        Builder activity(BaseActivity baseActivity);

        RegistrationComponent build();

        Builder coreComponent(BaseComponent baseComponent);
    }

    void inject(RegistrationActivity registrationActivity);

    void inject(DebugFragment debugFragment);

    void inject(EmailRegistrationFragment emailRegistrationFragment);

    void inject(ResetPasswordFragment resetPasswordFragment);

    void inject(VideoBackgroundRegistrationFragment videoBackgroundRegistrationFragment);
}
