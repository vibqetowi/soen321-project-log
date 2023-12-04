package com.ifriend.data.initialLoaders;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InitialLevelInfoLoader.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.initialLoaders.InitialLevelInfoLoader", f = "InitialLevelInfoLoader.kt", i = {}, l = {13, 14}, m = "load", n = {}, s = {})
/* loaded from: classes6.dex */
public final class InitialLevelInfoLoader$load$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitialLevelInfoLoader this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitialLevelInfoLoader$load$1(InitialLevelInfoLoader initialLevelInfoLoader, Continuation<? super InitialLevelInfoLoader$load$1> continuation) {
        super(continuation);
        this.this$0 = initialLevelInfoLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.load(this);
    }
}
