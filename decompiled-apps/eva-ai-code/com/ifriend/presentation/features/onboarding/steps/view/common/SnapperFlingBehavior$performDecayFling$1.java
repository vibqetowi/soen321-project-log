package com.ifriend.presentation.features.onboarding.steps.view.common;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SnapperFlingBehavior.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.presentation.features.onboarding.steps.view.common.SnapperFlingBehavior", f = "SnapperFlingBehavior.kt", i = {0, 0}, l = {438}, m = "performDecayFling", n = {"this", "velocityLeft"}, s = {"L$0", "L$1"})
/* loaded from: classes6.dex */
public final class SnapperFlingBehavior$performDecayFling$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SnapperFlingBehavior this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapperFlingBehavior$performDecayFling$1(SnapperFlingBehavior snapperFlingBehavior, Continuation<? super SnapperFlingBehavior$performDecayFling$1> continuation) {
        super(continuation);
        this.this$0 = snapperFlingBehavior;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object performDecayFling;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        performDecayFling = this.this$0.performDecayFling(null, null, 0, 0.0f, false, this);
        return performDecayFling;
    }
}
