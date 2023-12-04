package com.ifriend.chat.presentation.ui.diary.fragments;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseDiaryViewModel.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.chat.presentation.ui.diary.fragments.BaseDiaryViewModel", f = "BaseDiaryViewModel.kt", i = {0, 1, 2}, l = {293, 294, 295}, m = "handlePurchaseResult", n = {"this", "this", "this"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes6.dex */
public final class BaseDiaryViewModel$handlePurchaseResult$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BaseDiaryViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseDiaryViewModel$handlePurchaseResult$1(BaseDiaryViewModel baseDiaryViewModel, Continuation<? super BaseDiaryViewModel$handlePurchaseResult$1> continuation) {
        super(continuation);
        this.this$0 = baseDiaryViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object handlePurchaseResult;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        handlePurchaseResult = this.this$0.handlePurchaseResult(false, this);
        return handlePurchaseResult;
    }
}
