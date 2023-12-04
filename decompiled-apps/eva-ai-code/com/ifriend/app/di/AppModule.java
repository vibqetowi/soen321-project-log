package com.ifriend.app.di;

import com.ifriend.app.PremiumIconDisabler;
import com.ifriend.domain.useCases.user.get.GetUserUseCase;
import com.ifriend.icon_switcher.PremiumAppIconManager;
import com.ifriend.registration.StartRegistrationUseCase;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: AppModule.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\r"}, d2 = {"Lcom/ifriend/app/di/AppModule;", "", "()V", "providePremiumIconDisabler", "Lcom/ifriend/app/PremiumIconDisabler;", "getUserUseCase", "Lcom/ifriend/domain/useCases/user/get/GetUserUseCase;", "premiumAppIconManager", "Lcom/ifriend/icon_switcher/PremiumAppIconManager;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "provideStartRegistrationUseCase", "Lcom/ifriend/registration/StartRegistrationUseCase;", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public final class AppModule {
    @Provides
    public final StartRegistrationUseCase provideStartRegistrationUseCase() {
        return new StartRegistrationUseCase();
    }

    @Provides
    public final PremiumIconDisabler providePremiumIconDisabler(GetUserUseCase getUserUseCase, PremiumAppIconManager premiumAppIconManager, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(getUserUseCase, "getUserUseCase");
        Intrinsics.checkNotNullParameter(premiumAppIconManager, "premiumAppIconManager");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        return new PremiumIconDisabler(getUserUseCase, premiumAppIconManager, coroutineScope);
    }
}
