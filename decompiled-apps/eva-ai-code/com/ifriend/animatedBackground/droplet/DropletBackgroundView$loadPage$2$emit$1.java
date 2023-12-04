package com.ifriend.animatedBackground.droplet;

import com.google.firebase.perf.util.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DropletBackgroundView.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.animatedBackground.droplet.DropletBackgroundView$loadPage$2", f = "DropletBackgroundView.kt", i = {0, 0}, l = {124}, m = "emit", n = {"this", Constants.ENABLE_DISABLE}, s = {"L$0", "Z$0"})
/* loaded from: classes6.dex */
public final class DropletBackgroundView$loadPage$2$emit$1 extends ContinuationImpl {
    Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DropletBackgroundView$loadPage$2<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DropletBackgroundView$loadPage$2$emit$1(DropletBackgroundView$loadPage$2<? super T> dropletBackgroundView$loadPage$2, Continuation<? super DropletBackgroundView$loadPage$2$emit$1> continuation) {
        super(continuation);
        this.this$0 = dropletBackgroundView$loadPage$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(false, (Continuation<? super Unit>) this);
    }
}
