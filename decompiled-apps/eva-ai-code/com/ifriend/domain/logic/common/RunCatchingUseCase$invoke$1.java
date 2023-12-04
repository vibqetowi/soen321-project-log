package com.ifriend.domain.logic.common;

import com.ifriend.domain.logic.common.RunCatchingUseCase;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RunCatchingUseCase.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.domain.logic.common.RunCatchingUseCase$DefaultImpls", f = "RunCatchingUseCase.kt", i = {}, l = {7}, m = "invoke-gIAlu-s", n = {}, s = {})
/* loaded from: classes6.dex */
public final class RunCatchingUseCase$invoke$1<Params, Result> extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunCatchingUseCase$invoke$1(Continuation<? super RunCatchingUseCase$invoke$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m6879invokegIAlus = RunCatchingUseCase.DefaultImpls.m6879invokegIAlus(null, null, this);
        return m6879invokegIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m6879invokegIAlus : Result.m7270boximpl(m6879invokegIAlus);
    }
}
