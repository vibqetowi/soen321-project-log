package com.ifriend.platform.tools.impl.speech;

import com.google.cloud.speech.v1.SpeechClient;
import com.ifriend.analytics.api.logic.AnalyticsInteractor;
import com.ifriend.core.tools.api.DispatcherProvider;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
/* loaded from: classes6.dex */
public final class VoiceRecognitionStreamingImpl_Factory implements Factory<VoiceRecognitionStreamingImpl> {
    private final Provider<AnalyticsInteractor> analyticsInteractorProvider;
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<CoroutineScope> externalScopeProvider;
    private final Provider<SpeechClient> speechClientProvider;

    public VoiceRecognitionStreamingImpl_Factory(Provider<CoroutineScope> provider, Provider<DispatcherProvider> provider2, Provider<SpeechClient> provider3, Provider<AnalyticsInteractor> provider4) {
        this.externalScopeProvider = provider;
        this.dispatcherProvider = provider2;
        this.speechClientProvider = provider3;
        this.analyticsInteractorProvider = provider4;
    }

    @Override // javax.inject.Provider
    public VoiceRecognitionStreamingImpl get() {
        return newInstance(this.externalScopeProvider.get(), this.dispatcherProvider.get(), this.speechClientProvider.get(), this.analyticsInteractorProvider.get());
    }

    public static VoiceRecognitionStreamingImpl_Factory create(Provider<CoroutineScope> provider, Provider<DispatcherProvider> provider2, Provider<SpeechClient> provider3, Provider<AnalyticsInteractor> provider4) {
        return new VoiceRecognitionStreamingImpl_Factory(provider, provider2, provider3, provider4);
    }

    public static VoiceRecognitionStreamingImpl newInstance(CoroutineScope coroutineScope, DispatcherProvider dispatcherProvider, SpeechClient speechClient, AnalyticsInteractor analyticsInteractor) {
        return new VoiceRecognitionStreamingImpl(coroutineScope, dispatcherProvider, speechClient, analyticsInteractor);
    }
}
