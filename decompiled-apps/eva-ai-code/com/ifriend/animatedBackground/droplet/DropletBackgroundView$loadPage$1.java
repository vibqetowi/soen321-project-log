package com.ifriend.animatedBackground.droplet;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DropletBackgroundView.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.animatedBackground.droplet.DropletBackgroundView", f = "DropletBackgroundView.kt", i = {0}, l = {123, 123}, m = "loadPage", n = {"this"}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class DropletBackgroundView$loadPage$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DropletBackgroundView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DropletBackgroundView$loadPage$1(DropletBackgroundView dropletBackgroundView, Continuation<? super DropletBackgroundView$loadPage$1> continuation) {
        super(continuation);
        this.this$0 = dropletBackgroundView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object loadPage;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        loadPage = this.this$0.loadPage(this);
        return loadPage;
    }
}
