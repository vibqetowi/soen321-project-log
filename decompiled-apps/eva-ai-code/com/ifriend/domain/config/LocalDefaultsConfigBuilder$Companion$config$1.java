package com.ifriend.domain.config;

import com.ifriend.domain.config.LocalDefaultsConfigBuilder;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LocalDefaultsConfigBuilder.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.domain.config.LocalDefaultsConfigBuilder$Companion", f = "LocalDefaultsConfigBuilder.kt", i = {0}, l = {15}, m = "config", n = {"builder"}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class LocalDefaultsConfigBuilder$Companion$config$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LocalDefaultsConfigBuilder.Companion this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalDefaultsConfigBuilder$Companion$config$1(LocalDefaultsConfigBuilder.Companion companion, Continuation<? super LocalDefaultsConfigBuilder$Companion$config$1> continuation) {
        super(continuation);
        this.this$0 = companion;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.config(null, null, this);
    }
}
