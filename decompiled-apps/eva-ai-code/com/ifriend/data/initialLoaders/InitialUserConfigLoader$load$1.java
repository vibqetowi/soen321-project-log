package com.ifriend.data.initialLoaders;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InitialUserConfigLoader.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.initialLoaders.InitialUserConfigLoader", f = "InitialUserConfigLoader.kt", i = {}, l = {17}, m = "load", n = {}, s = {})
/* loaded from: classes6.dex */
public final class InitialUserConfigLoader$load$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitialUserConfigLoader this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitialUserConfigLoader$load$1(InitialUserConfigLoader initialUserConfigLoader, Continuation<? super InitialUserConfigLoader$load$1> continuation) {
        super(continuation);
        this.this$0 = initialUserConfigLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.load(this);
    }
}
