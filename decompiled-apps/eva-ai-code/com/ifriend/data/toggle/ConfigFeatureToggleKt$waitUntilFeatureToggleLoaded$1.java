package com.ifriend.data.toggle;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ConfigFeatureToggle.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.toggle.ConfigFeatureToggleKt", f = "ConfigFeatureToggle.kt", i = {}, l = {120, 120}, m = "waitUntilFeatureToggleLoaded", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ConfigFeatureToggleKt$waitUntilFeatureToggleLoaded$1<T> extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ConfigFeatureToggleKt$waitUntilFeatureToggleLoaded$1(Continuation<? super ConfigFeatureToggleKt$waitUntilFeatureToggleLoaded$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ConfigFeatureToggleKt.waitUntilFeatureToggleLoaded(null, this);
    }
}
