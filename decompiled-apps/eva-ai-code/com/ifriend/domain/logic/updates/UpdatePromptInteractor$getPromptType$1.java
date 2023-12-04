package com.ifriend.domain.logic.updates;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UpdatePromptInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.domain.logic.updates.UpdatePromptInteractor", f = "UpdatePromptInteractor.kt", i = {0, 0, 1, 1, 2, 2, 2, 3, 3, 4, 5, 5, 6, 6}, l = {21, 23, 25, 28, 32, 34, 39}, m = "getPromptType", n = {"this", "availableVersionCode", "this", "availableVersionCode", "this", "availableVersionCode", "currentVersion", "this", "currentVersion", "this", "this", "thresholds", "thresholds", "dismissCount"}, s = {"L$0", "I$0", "L$0", "I$0", "L$0", "I$0", "J$0", "L$0", "J$0", "L$0", "L$0", "L$1", "L$0", "I$0"})
/* loaded from: classes6.dex */
public final class UpdatePromptInteractor$getPromptType$1 extends ContinuationImpl {
    int I$0;
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UpdatePromptInteractor this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdatePromptInteractor$getPromptType$1(UpdatePromptInteractor updatePromptInteractor, Continuation<? super UpdatePromptInteractor$getPromptType$1> continuation) {
        super(continuation);
        this.this$0 = updatePromptInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getPromptType(0, this);
    }
}
