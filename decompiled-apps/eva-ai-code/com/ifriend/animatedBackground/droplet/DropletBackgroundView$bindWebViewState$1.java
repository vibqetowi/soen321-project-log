package com.ifriend.animatedBackground.droplet;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DropletBackgroundView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/ifriend/animatedBackground/droplet/DropletState;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.animatedBackground.droplet.DropletBackgroundView$bindWebViewState$1", f = "DropletBackgroundView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class DropletBackgroundView$bindWebViewState$1 extends SuspendLambda implements Function2<DropletState, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DropletBackgroundView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DropletBackgroundView$bindWebViewState$1(DropletBackgroundView dropletBackgroundView, Continuation<? super DropletBackgroundView$bindWebViewState$1> continuation) {
        super(2, continuation);
        this.this$0 = dropletBackgroundView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DropletBackgroundView$bindWebViewState$1 dropletBackgroundView$bindWebViewState$1 = new DropletBackgroundView$bindWebViewState$1(this.this$0, continuation);
        dropletBackgroundView$bindWebViewState$1.L$0 = obj;
        return dropletBackgroundView$bindWebViewState$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DropletState dropletState, Continuation<? super Unit> continuation) {
        return ((DropletBackgroundView$bindWebViewState$1) create(dropletState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AnimatedBackgroundDelegate backgroundDelegate;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        DropletState dropletState = (DropletState) this.L$0;
        if (!Intrinsics.areEqual(dropletState, InitState.INSTANCE) && (dropletState instanceof ModifiedState)) {
            backgroundDelegate = this.this$0.getBackgroundDelegate();
            backgroundDelegate.toggleDropletVisible(((ModifiedState) dropletState).getDropletVisible());
        }
        return Unit.INSTANCE;
    }
}
