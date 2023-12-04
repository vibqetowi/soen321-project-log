package com.ifriend.domain.logic.common;

import com.facebook.internal.NativeProtocol;
import com.ifriend.domain.logic.common.ExecuteActionUseCase;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ExecuteActionUseCase.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.domain.logic.common.ExecuteActionUseCase$DefaultImpls", f = "ExecuteActionUseCase.kt", i = {0, 0, 1}, l = {14, 17}, m = "invoke-gIAlu-s", n = {NativeProtocol.WEB_DIALOG_PARAMS, "$this$invoke_gIAlu_s_u24lambda_u242", "it$iv"}, s = {"L$0", "L$1", "L$0"})
/* loaded from: classes6.dex */
public final class ExecuteActionUseCase$invoke$1<Params, Result> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ExecuteActionUseCase$invoke$1(Continuation<? super ExecuteActionUseCase$invoke$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m6878invokegIAlus = ExecuteActionUseCase.DefaultImpls.m6878invokegIAlus(null, null, this);
        return m6878invokegIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m6878invokegIAlus : Result.m7270boximpl(m6878invokegIAlus);
    }
}
