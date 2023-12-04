package com.ifriend.domain.logic.updates;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UpdatePromptInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.domain.logic.updates.UpdatePromptInteractor", f = "UpdatePromptInteractor.kt", i = {}, l = {72}, m = "getActualVersion", n = {}, s = {})
/* loaded from: classes6.dex */
public final class UpdatePromptInteractor$getActualVersion$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UpdatePromptInteractor this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdatePromptInteractor$getActualVersion$1(UpdatePromptInteractor updatePromptInteractor, Continuation<? super UpdatePromptInteractor$getActualVersion$1> continuation) {
        super(continuation);
        this.this$0 = updatePromptInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object actualVersion;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        actualVersion = this.this$0.getActualVersion(this);
        return actualVersion;
    }
}
