package com.ifriend.chat.presentation.ui.menu.botProfile.reset;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ResetViewModel.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.chat.presentation.ui.menu.botProfile.reset.ResetViewModel", f = "ResetViewModel.kt", i = {0}, l = {36}, m = "confirmErase", n = {"this"}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class ResetViewModel$confirmErase$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ResetViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResetViewModel$confirmErase$1(ResetViewModel resetViewModel, Continuation<? super ResetViewModel$confirmErase$1> continuation) {
        super(continuation);
        this.this$0 = resetViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.confirmErase(null, this);
    }
}
