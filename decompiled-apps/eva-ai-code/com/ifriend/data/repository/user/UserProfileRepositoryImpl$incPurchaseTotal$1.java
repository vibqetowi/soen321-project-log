package com.ifriend.data.repository.user;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UserProfileRepositoryImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.repository.user.UserProfileRepositoryImpl", f = "UserProfileRepositoryImpl.kt", i = {0}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF}, m = "incPurchaseTotal", n = {"amount"}, s = {"F$0"})
/* loaded from: classes6.dex */
public final class UserProfileRepositoryImpl$incPurchaseTotal$1 extends ContinuationImpl {
    float F$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UserProfileRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserProfileRepositoryImpl$incPurchaseTotal$1(UserProfileRepositoryImpl userProfileRepositoryImpl, Continuation<? super UserProfileRepositoryImpl$incPurchaseTotal$1> continuation) {
        super(continuation);
        this.this$0 = userProfileRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.incPurchaseTotal(0.0f, this);
    }
}
