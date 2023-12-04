package com.ifriend.common_utils.extensions;

import com.facebook.internal.NativeProtocol;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: iterable.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 176)
@DebugMetadata(c = "com.ifriend.common_utils.extensions.IterableKt", f = "iterable.kt", i = {0, 0, 0}, l = {23}, m = "forEachInfinite-dWUq8MI", n = {"$this$forEachInfinite_u2ddWUq8MI", NativeProtocol.WEB_DIALOG_ACTION, "delay"}, s = {"L$0", "L$1", "J$0"})
/* loaded from: classes6.dex */
public final class IterableKt$forEachInfinite$1<T> extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public IterableKt$forEachInfinite$1(Continuation<? super IterableKt$forEachInfinite$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return IterableKt.m6851forEachInfinitedWUq8MI(null, 0L, null, this);
    }
}
