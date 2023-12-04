package com.ifriend.chat.presentation.ui.diary.fragments;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseDiaryViewModel.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.chat.presentation.ui.diary.fragments.BaseDiaryViewModel$onPurchaseResult$2", f = "BaseDiaryViewModel.kt", i = {}, l = {286}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class BaseDiaryViewModel$onPurchaseResult$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isSucceed;
    int label;
    final /* synthetic */ BaseDiaryViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseDiaryViewModel$onPurchaseResult$2(BaseDiaryViewModel baseDiaryViewModel, boolean z, Continuation<? super BaseDiaryViewModel$onPurchaseResult$2> continuation) {
        super(1, continuation);
        this.this$0 = baseDiaryViewModel;
        this.$isSucceed = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new BaseDiaryViewModel$onPurchaseResult$2(this.this$0, this.$isSucceed, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((BaseDiaryViewModel$onPurchaseResult$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object handlePurchaseResult;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            handlePurchaseResult = this.this$0.handlePurchaseResult(this.$isSucceed, this);
            if (handlePurchaseResult == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
