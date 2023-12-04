package com.ifriend.app.di.modules.platform;

import android.content.Context;
import com.google.cloud.speech.v1.SpeechClient;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class PlatformToolsModule_Companion_ProvideSpeechClientFactory implements Factory<SpeechClient> {
    private final Provider<Context> contextProvider;

    public PlatformToolsModule_Companion_ProvideSpeechClientFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider
    public SpeechClient get() {
        return provideSpeechClient(this.contextProvider.get());
    }

    public static PlatformToolsModule_Companion_ProvideSpeechClientFactory create(Provider<Context> provider) {
        return new PlatformToolsModule_Companion_ProvideSpeechClientFactory(provider);
    }

    public static SpeechClient provideSpeechClient(Context context) {
        return (SpeechClient) Preconditions.checkNotNullFromProvides(PlatformToolsModule.Companion.provideSpeechClient(context));
    }
}
