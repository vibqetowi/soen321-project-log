package com.ifriend.chat.presentation.di.onboarding;

import android.content.Context;
import androidx.lifecycle.ViewModelProvider;
import com.ifriend.base.di.Feature;
import com.ifriend.base.di.UserSharedPreferences;
import com.ifriend.chat.presentation.ui.onboarding.analytics.OnboardingAnalyticsImpl;
import com.ifriend.common_utils.Logger;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.data.repository.infoonboarding.InfoOnboardingRepositoryImpl;
import com.ifriend.domain.data.Preferences;
import com.ifriend.domain.data.infoonboarding.InfoOnboardingRepository;
import com.ifriend.domain.onboarding.OnboardingAnalytics;
import com.ifriend.ui.base.di.ViewModelFactory;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: OnboardingModule.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \n2\u00020\u0001:\u0001\nJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH'¨\u0006\u000b"}, d2 = {"Lcom/ifriend/chat/presentation/di/onboarding/OnboardingModule;", "", "bindAnalytics", "Lcom/ifriend/domain/onboarding/OnboardingAnalytics;", "onboardingAnalyticsImpl", "Lcom/ifriend/chat/presentation/ui/onboarding/analytics/OnboardingAnalyticsImpl;", "bindViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Lcom/ifriend/ui/base/di/ViewModelFactory;", "Companion", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module(includes = {InfoOnboardingModule.class})
/* loaded from: classes6.dex */
public interface OnboardingModule {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Binds
    OnboardingAnalytics bindAnalytics(OnboardingAnalyticsImpl onboardingAnalyticsImpl);

    @Binds
    ViewModelProvider.Factory bindViewModelFactory(ViewModelFactory viewModelFactory);

    /* compiled from: OnboardingModule.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\r"}, d2 = {"Lcom/ifriend/chat/presentation/di/onboarding/OnboardingModule$Companion;", "", "()V", "provideInfoOnboardingRepository", "Lcom/ifriend/domain/data/infoonboarding/InfoOnboardingRepository;", "preferences", "Lcom/ifriend/domain/data/Preferences;", "context", "Landroid/content/Context;", "logger", "Lcom/ifriend/common_utils/Logger;", "dispatcherProvider", "Lcom/ifriend/core/tools/api/DispatcherProvider;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @Provides
        @Feature
        public final InfoOnboardingRepository provideInfoOnboardingRepository(@UserSharedPreferences Preferences preferences, Context context, Logger logger, DispatcherProvider dispatcherProvider) {
            Intrinsics.checkNotNullParameter(preferences, "preferences");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(logger, "logger");
            Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
            return new InfoOnboardingRepositoryImpl(preferences, context, logger, dispatcherProvider);
        }
    }
}
