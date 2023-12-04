package com.ifriend.common_utils;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KFunction;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RunCatchingExt.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 176)
@DebugMetadata(c = "com.ifriend.common_utils.RunCatchingExtKt", f = "RunCatchingExt.kt", i = {}, l = {23}, m = "executeCatching", n = {}, s = {})
/* loaded from: classes6.dex */
public final class RunCatchingExtKt$executeCatching$5<T> extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunCatchingExtKt$executeCatching$5(Continuation<? super RunCatchingExtKt$executeCatching$5> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return RunCatchingExtKt.executeCatching((Object) null, (Function0) null, (KFunction<? extends Throwable>) null, this);
    }
}
