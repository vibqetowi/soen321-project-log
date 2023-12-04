package com.ifriend.ui.base.mvvm;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseViewModel.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.ui.base.mvvm.BaseViewModel", f = "BaseViewModel.kt", i = {0}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE}, m = "suspendChangeState", n = {"this"}, s = {"L$0"})
/* loaded from: classes4.dex */
public final class BaseViewModel$suspendChangeState$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BaseViewModel<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseViewModel$suspendChangeState$1(BaseViewModel<T> baseViewModel, Continuation<? super BaseViewModel$suspendChangeState$1> continuation) {
        super(continuation);
        this.this$0 = baseViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.suspendChangeState(null, this);
    }
}
