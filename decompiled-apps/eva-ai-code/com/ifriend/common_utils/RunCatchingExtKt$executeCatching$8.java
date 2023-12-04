package com.ifriend.common_utils;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.reflect.KFunction;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RunCatchingExt.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 176)
@DebugMetadata(c = "com.ifriend.common_utils.RunCatchingExtKt", f = "RunCatchingExt.kt", i = {0}, l = {29}, m = "executeCatching", n = {"error"}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class RunCatchingExtKt$executeCatching$8<T> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunCatchingExtKt$executeCatching$8(Continuation<? super RunCatchingExtKt$executeCatching$8> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return RunCatchingExtKt.executeCatching((Object) null, (KFunction) null, (KFunction<? extends Throwable>) null, this);
    }
}
