package com.ifriend.presentation.common.uistate;

import com.facebook.internal.NativeProtocol;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UiStateDelegate.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.presentation.common.uistate.UiStateDelegateImpl", f = "UiStateDelegate.kt", i = {0, 0, 0, 0, 1}, l = {143, 102}, m = "reduce", n = {"this", "$this$reduce", NativeProtocol.WEB_DIALOG_ACTION, "$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0"})
/* loaded from: classes6.dex */
public final class UiStateDelegateImpl$reduce$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UiStateDelegateImpl<UiState, Event> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiStateDelegateImpl$reduce$1(UiStateDelegateImpl<UiState, Event> uiStateDelegateImpl, Continuation<? super UiStateDelegateImpl$reduce$1> continuation) {
        super(continuation);
        this.this$0 = uiStateDelegateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.reduce(null, null, this);
    }
}
