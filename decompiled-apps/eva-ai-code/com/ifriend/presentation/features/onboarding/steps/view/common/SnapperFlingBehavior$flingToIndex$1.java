package com.ifriend.presentation.features.onboarding.steps.view.common;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SnapperFlingBehavior.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.presentation.features.onboarding.steps.view.common.SnapperFlingBehavior", f = "SnapperFlingBehavior.kt", i = {0, 0, 0, 0, 1}, l = {380, 390}, m = "flingToIndex", n = {"this", "$this$flingToIndex", FirebaseAnalytics.Param.INDEX, "initialVelocity", "this"}, s = {"L$0", "L$1", "I$0", "F$0", "L$0"})
/* loaded from: classes6.dex */
public final class SnapperFlingBehavior$flingToIndex$1 extends ContinuationImpl {
    float F$0;
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SnapperFlingBehavior this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapperFlingBehavior$flingToIndex$1(SnapperFlingBehavior snapperFlingBehavior, Continuation<? super SnapperFlingBehavior$flingToIndex$1> continuation) {
        super(continuation);
        this.this$0 = snapperFlingBehavior;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object flingToIndex;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        flingToIndex = this.this$0.flingToIndex(null, 0, 0.0f, this);
        return flingToIndex;
    }
}
