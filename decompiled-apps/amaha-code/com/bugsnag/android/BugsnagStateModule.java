package com.bugsnag.android;

import com.bugsnag.android.internal.ImmutableConfig;
import com.bugsnag.android.internal.dag.DependencyModule;
import hs.k;
import kotlin.jvm.internal.i;
/* compiled from: BugsnagStateModule.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/bugsnag/android/BugsnagStateModule;", "Lcom/bugsnag/android/internal/dag/DependencyModule;", "cfg", "Lcom/bugsnag/android/internal/ImmutableConfig;", "configuration", "Lcom/bugsnag/android/Configuration;", "(Lcom/bugsnag/android/internal/ImmutableConfig;Lcom/bugsnag/android/Configuration;)V", "breadcrumbState", "Lcom/bugsnag/android/BreadcrumbState;", "getBreadcrumbState", "()Lcom/bugsnag/android/BreadcrumbState;", "callbackState", "Lcom/bugsnag/android/CallbackState;", "getCallbackState", "()Lcom/bugsnag/android/CallbackState;", "clientObservable", "Lcom/bugsnag/android/ClientObservable;", "getClientObservable", "()Lcom/bugsnag/android/ClientObservable;", "contextState", "Lcom/bugsnag/android/ContextState;", "getContextState", "()Lcom/bugsnag/android/ContextState;", "featureFlagState", "Lcom/bugsnag/android/FeatureFlagState;", "getFeatureFlagState", "()Lcom/bugsnag/android/FeatureFlagState;", "metadataState", "Lcom/bugsnag/android/MetadataState;", "getMetadataState", "()Lcom/bugsnag/android/MetadataState;", "copyMetadataState", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class BugsnagStateModule extends DependencyModule {
    private final BreadcrumbState breadcrumbState;
    private final CallbackState callbackState;
    private final ClientObservable clientObservable;
    private final ContextState contextState;
    private final FeatureFlagState featureFlagState;
    private final MetadataState metadataState;

    public BugsnagStateModule(ImmutableConfig cfg, Configuration configuration) {
        i.h(cfg, "cfg");
        i.h(configuration, "configuration");
        this.clientObservable = new ClientObservable();
        CallbackState callbackState = configuration.impl.callbackState;
        this.callbackState = callbackState;
        ContextState contextState = new ContextState();
        if (configuration.getContext() != null) {
            contextState.setManualContext(configuration.getContext());
        }
        k kVar = k.f19476a;
        this.contextState = contextState;
        this.breadcrumbState = new BreadcrumbState(cfg.getMaxBreadcrumbs(), callbackState, cfg.getLogger());
        this.metadataState = copyMetadataState(configuration);
        this.featureFlagState = configuration.impl.featureFlagState.copy();
    }

    private final MetadataState copyMetadataState(Configuration configuration) {
        return configuration.impl.metadataState.copy(configuration.impl.metadataState.getMetadata().copy());
    }

    public final BreadcrumbState getBreadcrumbState() {
        return this.breadcrumbState;
    }

    public final CallbackState getCallbackState() {
        return this.callbackState;
    }

    public final ClientObservable getClientObservable() {
        return this.clientObservable;
    }

    public final ContextState getContextState() {
        return this.contextState;
    }

    public final FeatureFlagState getFeatureFlagState() {
        return this.featureFlagState;
    }

    public final MetadataState getMetadataState() {
        return this.metadataState;
    }
}
