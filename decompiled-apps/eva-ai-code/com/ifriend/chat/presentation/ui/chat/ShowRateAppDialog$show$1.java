package com.ifriend.chat.presentation.ui.chat;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ShowRateAppDialog.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.chat.presentation.ui.chat.ShowRateAppDialog", f = "ShowRateAppDialog.kt", i = {0, 1}, l = {19, 20}, m = "show", n = {"this", "this"}, s = {"L$0", "L$0"})
/* loaded from: classes6.dex */
public final class ShowRateAppDialog$show$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ShowRateAppDialog this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShowRateAppDialog$show$1(ShowRateAppDialog showRateAppDialog, Continuation<? super ShowRateAppDialog$show$1> continuation) {
        super(continuation);
        this.this$0 = showRateAppDialog;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.show(this);
    }
}
