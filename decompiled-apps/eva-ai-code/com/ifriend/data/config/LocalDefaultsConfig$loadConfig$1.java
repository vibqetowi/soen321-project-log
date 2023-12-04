package com.ifriend.data.config;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LocalDefaultsConfig.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.config.LocalDefaultsConfig", f = "LocalDefaultsConfig.kt", i = {0}, l = {33}, m = "loadConfig", n = {"this"}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class LocalDefaultsConfig$loadConfig$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LocalDefaultsConfig this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalDefaultsConfig$loadConfig$1(LocalDefaultsConfig localDefaultsConfig, Continuation<? super LocalDefaultsConfig$loadConfig$1> continuation) {
        super(continuation);
        this.this$0 = localDefaultsConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.loadConfig(null, this);
    }
}
