package com.bugsnag.android.internal.dag;

import com.bugsnag.android.Configuration;
import com.bugsnag.android.Connectivity;
import com.bugsnag.android.internal.ImmutableConfig;
import com.bugsnag.android.internal.ImmutableConfigKt;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: ConfigModule.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/bugsnag/android/internal/dag/ConfigModule;", "Lcom/bugsnag/android/internal/dag/DependencyModule;", "contextModule", "Lcom/bugsnag/android/internal/dag/ContextModule;", "configuration", "Lcom/bugsnag/android/Configuration;", "connectivity", "Lcom/bugsnag/android/Connectivity;", "(Lcom/bugsnag/android/internal/dag/ContextModule;Lcom/bugsnag/android/Configuration;Lcom/bugsnag/android/Connectivity;)V", "config", "Lcom/bugsnag/android/internal/ImmutableConfig;", "getConfig", "()Lcom/bugsnag/android/internal/ImmutableConfig;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class ConfigModule extends DependencyModule {
    private final ImmutableConfig config;

    public ConfigModule(ContextModule contextModule, Configuration configuration, Connectivity connectivity) {
        i.h(contextModule, "contextModule");
        i.h(configuration, "configuration");
        i.h(connectivity, "connectivity");
        this.config = ImmutableConfigKt.sanitiseConfiguration(contextModule.getCtx(), configuration, connectivity);
    }

    public final ImmutableConfig getConfig() {
        return this.config;
    }
}
