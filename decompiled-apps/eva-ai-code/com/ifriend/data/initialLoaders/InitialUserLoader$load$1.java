package com.ifriend.data.initialLoaders;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InitialUserLoader.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.initialLoaders.InitialUserLoader", f = "InitialUserLoader.kt", i = {}, l = {12}, m = "load", n = {}, s = {})
/* loaded from: classes6.dex */
public final class InitialUserLoader$load$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitialUserLoader this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitialUserLoader$load$1(InitialUserLoader initialUserLoader, Continuation<? super InitialUserLoader$load$1> continuation) {
        super(continuation);
        this.this$0 = initialUserLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.load(this);
    }
}
