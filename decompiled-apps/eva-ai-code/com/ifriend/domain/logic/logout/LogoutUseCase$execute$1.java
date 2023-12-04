package com.ifriend.domain.logic.logout;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LogoutUseCase.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.domain.logic.logout.LogoutUseCase", f = "LogoutUseCase.kt", i = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, l = {50, ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE, ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE, 56, 58, 64, 65, ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT, ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL, 68, 69, 70}, m = "execute", n = {"this", "this", "this", "this", "this", "this", "this", "this", "this", "this", "this"}, s = {"L$0", "L$0", "L$0", "L$0", "L$0", "L$0", "L$0", "L$0", "L$0", "L$0", "L$0"})
/* loaded from: classes6.dex */
public final class LogoutUseCase$execute$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LogoutUseCase this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogoutUseCase$execute$1(LogoutUseCase logoutUseCase, Continuation<? super LogoutUseCase$execute$1> continuation) {
        super(continuation);
        this.this$0 = logoutUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.execute((Unit) null, (Continuation<? super Unit>) this);
    }
}
