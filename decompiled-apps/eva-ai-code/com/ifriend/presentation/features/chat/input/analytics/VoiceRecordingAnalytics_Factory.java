package com.ifriend.presentation.features.chat.input.analytics;

import com.ifriend.analytics.api.logic.AnalyticsInteractor;
import com.ifriend.core.tools.api.AppIdentityConverter;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class VoiceRecordingAnalytics_Factory implements Factory<VoiceRecordingAnalytics> {
    private final Provider<AnalyticsInteractor> analyticsInteractorProvider;
    private final Provider<AppIdentityConverter> appIdentityConverterProvider;

    public VoiceRecordingAnalytics_Factory(Provider<AnalyticsInteractor> provider, Provider<AppIdentityConverter> provider2) {
        this.analyticsInteractorProvider = provider;
        this.appIdentityConverterProvider = provider2;
    }

    @Override // javax.inject.Provider
    public VoiceRecordingAnalytics get() {
        return newInstance(this.analyticsInteractorProvider.get(), this.appIdentityConverterProvider.get());
    }

    public static VoiceRecordingAnalytics_Factory create(Provider<AnalyticsInteractor> provider, Provider<AppIdentityConverter> provider2) {
        return new VoiceRecordingAnalytics_Factory(provider, provider2);
    }

    public static VoiceRecordingAnalytics newInstance(AnalyticsInteractor analyticsInteractor, AppIdentityConverter appIdentityConverter) {
        return new VoiceRecordingAnalytics(analyticsInteractor, appIdentityConverter);
    }
}
