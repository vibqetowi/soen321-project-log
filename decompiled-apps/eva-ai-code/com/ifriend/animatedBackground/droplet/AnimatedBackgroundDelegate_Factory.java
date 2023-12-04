package com.ifriend.animatedBackground.droplet;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class AnimatedBackgroundDelegate_Factory implements Factory<AnimatedBackgroundDelegate> {
    private final Provider<Context> contextProvider;
    private final Provider<JsExecutor> jsExecutorProvider;

    public AnimatedBackgroundDelegate_Factory(Provider<Context> provider, Provider<JsExecutor> provider2) {
        this.contextProvider = provider;
        this.jsExecutorProvider = provider2;
    }

    @Override // javax.inject.Provider
    public AnimatedBackgroundDelegate get() {
        return newInstance(this.contextProvider.get(), this.jsExecutorProvider.get());
    }

    public static AnimatedBackgroundDelegate_Factory create(Provider<Context> provider, Provider<JsExecutor> provider2) {
        return new AnimatedBackgroundDelegate_Factory(provider, provider2);
    }

    public static AnimatedBackgroundDelegate newInstance(Context context, JsExecutor jsExecutor) {
        return new AnimatedBackgroundDelegate(context, jsExecutor);
    }
}
