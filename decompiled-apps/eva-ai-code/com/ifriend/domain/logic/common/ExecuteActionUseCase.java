package com.ifriend.domain.logic.common;

import com.facebook.internal.NativeProtocol;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ExecuteActionUseCase.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0006\b\u0001\u0010\u0002 \u00012\u00020\u0003J\u0019\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0006J*\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\n2\u0006\u0010\u0005\u001a\u00028\u0000H\u0096Bø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"Lcom/ifriend/domain/logic/common/ExecuteActionUseCase;", "Params", "Result", "", "execute", NativeProtocol.WEB_DIALOG_PARAMS, "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeBeforeThrowError", "", "invoke", "Lkotlin/Result;", "invoke-gIAlu-s", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ExecuteActionUseCase<Params, Result> {
    Object execute(Params params, Continuation<? super Result> continuation);

    Object executeBeforeThrowError(Params params, Continuation<? super Unit> continuation);

    /* renamed from: invoke-gIAlu-s  reason: not valid java name */
    Object m6877invokegIAlus(Params params, Continuation<? super Result<? extends Result>> continuation);

    /* compiled from: ExecuteActionUseCase.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x006e A[Catch: all -> 0x0083, TryCatch #1 {all -> 0x0083, blocks: (B:15:0x0035, B:37:0x0082, B:30:0x0068, B:32:0x006e, B:33:0x0073, B:23:0x0048, B:18:0x003f, B:27:0x0059, B:24:0x004a), top: B:41:0x0023 }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0073 A[Catch: all -> 0x0083, TryCatch #1 {all -> 0x0083, blocks: (B:15:0x0035, B:37:0x0082, B:30:0x0068, B:32:0x006e, B:33:0x0073, B:23:0x0048, B:18:0x003f, B:27:0x0059, B:24:0x004a), top: B:41:0x0023 }] */
        /* renamed from: invoke-gIAlu-s  reason: not valid java name */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static <Params, Result> Object m6878invokegIAlus(ExecuteActionUseCase<? super Params, ? extends Result> executeActionUseCase, Params params, Continuation<? super Result<? extends Result>> continuation) {
            ExecuteActionUseCase$invoke$1 executeActionUseCase$invoke$1;
            int i;
            boolean z;
            Throwable m7274exceptionOrNullimpl;
            try {
                if (continuation instanceof ExecuteActionUseCase$invoke$1) {
                    executeActionUseCase$invoke$1 = (ExecuteActionUseCase$invoke$1) continuation;
                    if ((executeActionUseCase$invoke$1.label & Integer.MIN_VALUE) != 0) {
                        executeActionUseCase$invoke$1.label -= Integer.MIN_VALUE;
                        Object obj = executeActionUseCase$invoke$1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = executeActionUseCase$invoke$1.label;
                        if (i != 0) {
                            ResultKt.throwOnFailure(obj);
                            Result.Companion companion = Result.Companion;
                            Result.Companion companion2 = Result.Companion;
                            executeActionUseCase$invoke$1.L$0 = params;
                            executeActionUseCase$invoke$1.L$1 = executeActionUseCase;
                            executeActionUseCase$invoke$1.label = 1;
                            obj = executeActionUseCase.execute(params, executeActionUseCase$invoke$1);
                            z = params;
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Throwable th = (Throwable) executeActionUseCase$invoke$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            throw th;
                        } else {
                            executeActionUseCase = (ExecuteActionUseCase) executeActionUseCase$invoke$1.L$1;
                            Object obj2 = (Object) executeActionUseCase$invoke$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            z = obj2;
                        }
                        Object m7271constructorimpl = Result.m7271constructorimpl(obj);
                        m7274exceptionOrNullimpl = Result.m7274exceptionOrNullimpl(m7271constructorimpl);
                        if (m7274exceptionOrNullimpl != null) {
                            return Result.m7271constructorimpl(m7271constructorimpl);
                        }
                        executeActionUseCase$invoke$1.L$0 = m7274exceptionOrNullimpl;
                        executeActionUseCase$invoke$1.L$1 = null;
                        executeActionUseCase$invoke$1.label = 2;
                        if (executeActionUseCase.executeBeforeThrowError((Object) z, executeActionUseCase$invoke$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        throw m7274exceptionOrNullimpl;
                    }
                }
                if (i != 0) {
                }
                Object m7271constructorimpl2 = Result.m7271constructorimpl(obj);
                m7274exceptionOrNullimpl = Result.m7274exceptionOrNullimpl(m7271constructorimpl2);
                if (m7274exceptionOrNullimpl != null) {
                }
            } catch (Throwable th2) {
                Result.Companion companion3 = Result.Companion;
                return Result.m7271constructorimpl(ResultKt.createFailure(th2));
            }
            executeActionUseCase$invoke$1 = new ExecuteActionUseCase$invoke$1(continuation);
            Object obj3 = executeActionUseCase$invoke$1.result;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = executeActionUseCase$invoke$1.label;
        }
    }
}
