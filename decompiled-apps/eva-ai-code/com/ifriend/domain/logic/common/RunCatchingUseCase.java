package com.ifriend.domain.logic.common;

import com.facebook.internal.NativeProtocol;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import org.apache.http.cookie.ClientCookie;
/* compiled from: RunCatchingUseCase.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0006\b\u0001\u0010\u0002 \u00012\u00020\u0003J\u0019\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0006J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\b2\u0006\u0010\u0005\u001a\u00028\u0000H\u0096Bø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\n"}, d2 = {"Lcom/ifriend/domain/logic/common/RunCatchingUseCase;", "Params", "Result", "", "execute", NativeProtocol.WEB_DIALOG_PARAMS, "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invoke", "Lkotlin/Result;", "invoke-gIAlu-s", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface RunCatchingUseCase<Params, Result> {
    Object execute(Params params, Continuation<? super Result> continuation);

    /* renamed from: invoke-gIAlu-s */
    Object mo6875invokegIAlus(Params params, Continuation<? super Result<? extends Result>> continuation);

    /* compiled from: RunCatchingUseCase.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
        /* renamed from: invoke-gIAlu-s  reason: not valid java name */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static <Params, Result> Object m6879invokegIAlus(RunCatchingUseCase<? super Params, ? extends Result> runCatchingUseCase, Params params, Continuation<? super Result<? extends Result>> continuation) {
            RunCatchingUseCase$invoke$1 runCatchingUseCase$invoke$1;
            int i;
            try {
                if (continuation instanceof RunCatchingUseCase$invoke$1) {
                    runCatchingUseCase$invoke$1 = (RunCatchingUseCase$invoke$1) continuation;
                    if ((runCatchingUseCase$invoke$1.label & Integer.MIN_VALUE) != 0) {
                        runCatchingUseCase$invoke$1.label -= Integer.MIN_VALUE;
                        Object obj = runCatchingUseCase$invoke$1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = runCatchingUseCase$invoke$1.label;
                        if (i != 0) {
                            ResultKt.throwOnFailure(obj);
                            Result.Companion companion = Result.Companion;
                            runCatchingUseCase$invoke$1.label = 1;
                            obj = runCatchingUseCase.execute(params, runCatchingUseCase$invoke$1);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            ResultKt.throwOnFailure(obj);
                        }
                        return Result.m7271constructorimpl(obj);
                    }
                }
                if (i != 0) {
                }
                return Result.m7271constructorimpl(obj);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                return Result.m7271constructorimpl(ResultKt.createFailure(th));
            }
            runCatchingUseCase$invoke$1 = new RunCatchingUseCase$invoke$1(continuation);
            Object obj2 = runCatchingUseCase$invoke$1.result;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = runCatchingUseCase$invoke$1.label;
        }
    }
}
