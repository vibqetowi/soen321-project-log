package com.ifriend.data.toggle;

import androidx.core.location.LocationRequestCompat;
import com.ifriend.data.toggle.TypedConfigFeatureToggle;
import com.ifriend.domain.config.ConfigState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ConfigFeatureToggle.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.toggle.TypedConfigFeatureToggle$1$1", f = "ConfigFeatureToggle.kt", i = {2}, l = {98, 101, LocationRequestCompat.QUALITY_LOW_POWER, 105}, m = "emit", n = {"this"}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class TypedConfigFeatureToggle$1$1$emit$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TypedConfigFeatureToggle.AnonymousClass1.C01431<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TypedConfigFeatureToggle$1$1$emit$1(TypedConfigFeatureToggle.AnonymousClass1.C01431<? super T> c01431, Continuation<? super TypedConfigFeatureToggle$1$1$emit$1> continuation) {
        super(continuation);
        this.this$0 = c01431;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((ConfigState) null, (Continuation<? super Unit>) this);
    }
}
