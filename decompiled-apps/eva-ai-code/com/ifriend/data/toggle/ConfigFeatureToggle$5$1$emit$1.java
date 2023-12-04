package com.ifriend.data.toggle;

import com.ifriend.data.toggle.ConfigFeatureToggle;
import com.ifriend.domain.config.ConfigState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ConfigFeatureToggle.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.toggle.ConfigFeatureToggle$5$1", f = "ConfigFeatureToggle.kt", i = {2}, l = {56, LockFreeTaskQueueCore.FROZEN_SHIFT, 63, 65}, m = "emit", n = {"this"}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class ConfigFeatureToggle$5$1$emit$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ConfigFeatureToggle.AnonymousClass5.AnonymousClass1<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConfigFeatureToggle$5$1$emit$1(ConfigFeatureToggle.AnonymousClass5.AnonymousClass1<? super T> anonymousClass1, Continuation<? super ConfigFeatureToggle$5$1$emit$1> continuation) {
        super(continuation);
        this.this$0 = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((ConfigState) null, (Continuation<? super Unit>) this);
    }
}
