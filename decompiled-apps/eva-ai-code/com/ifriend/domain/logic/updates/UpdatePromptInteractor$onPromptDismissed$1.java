package com.ifriend.domain.logic.updates;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UpdatePromptInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.domain.logic.updates.UpdatePromptInteractor", f = "UpdatePromptInteractor.kt", i = {0}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF, ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE}, m = "onPromptDismissed", n = {"$this$onPromptDismissed_u24lambda_u240"}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class UpdatePromptInteractor$onPromptDismissed$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UpdatePromptInteractor this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdatePromptInteractor$onPromptDismissed$1(UpdatePromptInteractor updatePromptInteractor, Continuation<? super UpdatePromptInteractor$onPromptDismissed$1> continuation) {
        super(continuation);
        this.this$0 = updatePromptInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.onPromptDismissed(this);
    }
}
