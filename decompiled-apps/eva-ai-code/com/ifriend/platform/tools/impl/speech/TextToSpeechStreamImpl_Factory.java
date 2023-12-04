package com.ifriend.platform.tools.impl.speech;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
/* loaded from: classes6.dex */
public final class TextToSpeechStreamImpl_Factory implements Factory<TextToSpeechStreamImpl> {
    private final Provider<Context> contextProvider;
    private final Provider<CoroutineScope> coroutineScopeProvider;

    public TextToSpeechStreamImpl_Factory(Provider<Context> provider, Provider<CoroutineScope> provider2) {
        this.contextProvider = provider;
        this.coroutineScopeProvider = provider2;
    }

    @Override // javax.inject.Provider
    public TextToSpeechStreamImpl get() {
        return newInstance(this.contextProvider.get(), this.coroutineScopeProvider.get());
    }

    public static TextToSpeechStreamImpl_Factory create(Provider<Context> provider, Provider<CoroutineScope> provider2) {
        return new TextToSpeechStreamImpl_Factory(provider, provider2);
    }

    public static TextToSpeechStreamImpl newInstance(Context context, CoroutineScope coroutineScope) {
        return new TextToSpeechStreamImpl(context, coroutineScope);
    }
}
