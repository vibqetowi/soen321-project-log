package com.ifriend.common_utils;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.internal.NativeProtocol;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
/* compiled from: RunCatchingExt.kt */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0002H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u0003\u001a7\u0010\u0004\u001a\u0002H\u0005\"\u0004\b\u0000\u0010\u0005*\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00050\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\bH\u0086\bø\u0001\u0001¢\u0006\u0002\u0010\u000b\u001a=\u0010\f\u001a\u0002H\u0005\"\u0004\b\u0000\u0010\u0005*\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00050\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\rH\u0086\bø\u0001\u0001¢\u0006\u0002\u0010\u000e\u001a=\u0010\f\u001a\u0002H\u0005\"\u0004\b\u0000\u0010\u0005*\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00050\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u000fH\u0086\bø\u0001\u0001¢\u0006\u0002\u0010\u0010\u001a=\u0010\f\u001a\u0002H\u0005\"\u0004\b\u0000\u0010\u0005*\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00050\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0011H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001a=\u0010\f\u001a\u0002H\u0005\"\u0004\b\u0000\u0010\u0005*\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00050\u00132\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u000fH\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u0014\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u0006\u0015"}, d2 = {"exception", "", "Lkotlin/Result;", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "executeAction", ExifInterface.GPS_DIRECTION_TRUE, "", NativeProtocol.WEB_DIALOG_ACTION, "Lkotlin/Function0;", "error", "", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "executeCatching", "Lkotlin/Function1;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Lkotlin/reflect/KFunction1;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Lkotlin/reflect/KFunction;)Ljava/lang/Object;", "Lkotlin/reflect/KSuspendFunction1;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Lkotlin/reflect/KFunction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/reflect/KSuspendFunction0;", "(Ljava/lang/Object;Lkotlin/reflect/KFunction;Lkotlin/reflect/KFunction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "common_utils"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RunCatchingExtKt {
    public static final <T> T executeCatching(Object obj, Function0<? extends T> action, KFunction<? extends Throwable> error) {
        T t;
        Intrinsics.checkNotNullParameter(obj, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(error, "error");
        try {
            Result.Companion companion = Result.Companion;
            t = (T) Result.m7271constructorimpl(action.invoke());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            t = (T) Result.m7271constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m7274exceptionOrNullimpl = Result.m7274exceptionOrNullimpl(t);
        if (m7274exceptionOrNullimpl == null) {
            return t;
        }
        throw ((Throwable) ((Function1) error).invoke(m7274exceptionOrNullimpl));
    }

    public static final <T> T executeCatching(Object obj, Function0<? extends T> action, Function1<? super Throwable, ? extends Throwable> error) {
        T t;
        Intrinsics.checkNotNullParameter(obj, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(error, "error");
        try {
            Result.Companion companion = Result.Companion;
            t = (T) Result.m7271constructorimpl(action.invoke());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            t = (T) Result.m7271constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m7274exceptionOrNullimpl = Result.m7274exceptionOrNullimpl(t);
        if (m7274exceptionOrNullimpl == null) {
            return t;
        }
        throw error.invoke(m7274exceptionOrNullimpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object executeCatching(Object obj, Function0<? extends T> function0, KFunction<? extends Throwable> kFunction, Continuation<? super T> continuation) {
        RunCatchingExtKt$executeCatching$5 runCatchingExtKt$executeCatching$5;
        int i;
        Object m7271constructorimpl;
        if (continuation instanceof RunCatchingExtKt$executeCatching$5) {
            runCatchingExtKt$executeCatching$5 = (RunCatchingExtKt$executeCatching$5) continuation;
            if ((runCatchingExtKt$executeCatching$5.label & Integer.MIN_VALUE) != 0) {
                runCatchingExtKt$executeCatching$5.label -= Integer.MIN_VALUE;
                Object obj2 = runCatchingExtKt$executeCatching$5.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = runCatchingExtKt$executeCatching$5.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    try {
                        Result.Companion companion = Result.Companion;
                        m7271constructorimpl = Result.m7271constructorimpl(function0.invoke());
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        m7271constructorimpl = Result.m7271constructorimpl(ResultKt.createFailure(th));
                    }
                    Throwable m7274exceptionOrNullimpl = Result.m7274exceptionOrNullimpl(m7271constructorimpl);
                    if (m7274exceptionOrNullimpl == null) {
                        return m7271constructorimpl;
                    }
                    runCatchingExtKt$executeCatching$5.label = 1;
                    obj2 = ((Function2) kFunction).invoke(m7274exceptionOrNullimpl, runCatchingExtKt$executeCatching$5);
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj2);
                }
                throw ((Throwable) obj2);
            }
        }
        runCatchingExtKt$executeCatching$5 = new RunCatchingExtKt$executeCatching$5(continuation);
        Object obj22 = runCatchingExtKt$executeCatching$5.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = runCatchingExtKt$executeCatching$5.label;
        if (i != 0) {
        }
        throw ((Throwable) obj22);
    }

    private static final <T> Object executeCatching$$forInline(Object obj, Function0<? extends T> function0, KFunction<? extends Throwable> kFunction, Continuation<? super T> continuation) {
        Object m7271constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            m7271constructorimpl = Result.m7271constructorimpl(function0.invoke());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m7271constructorimpl = Result.m7271constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m7274exceptionOrNullimpl = Result.m7274exceptionOrNullimpl(m7271constructorimpl);
        if (m7274exceptionOrNullimpl == null) {
            return m7271constructorimpl;
        }
        InlineMarker.mark(3);
        InlineMarker.mark(0);
        Object invoke = ((Function2) kFunction).invoke(m7274exceptionOrNullimpl, null);
        InlineMarker.mark(1);
        throw ((Throwable) invoke);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(2:10|11)(2:20|21))(3:22|23|(1:25))|12|13|(1:15)(2:17|18)))|28|6|7|(0)(0)|12|13|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
        r4 = kotlin.Result.Companion;
        r3 = kotlin.Result.m7271constructorimpl(kotlin.ResultKt.createFailure(r3));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object executeCatching(Object obj, KFunction<? extends T> kFunction, KFunction<? extends Throwable> kFunction2, Continuation<? super T> continuation) {
        RunCatchingExtKt$executeCatching$8 runCatchingExtKt$executeCatching$8;
        int i;
        Throwable m7274exceptionOrNullimpl;
        if (continuation instanceof RunCatchingExtKt$executeCatching$8) {
            runCatchingExtKt$executeCatching$8 = (RunCatchingExtKt$executeCatching$8) continuation;
            if ((runCatchingExtKt$executeCatching$8.label & Integer.MIN_VALUE) != 0) {
                runCatchingExtKt$executeCatching$8.label -= Integer.MIN_VALUE;
                Object obj2 = runCatchingExtKt$executeCatching$8.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = runCatchingExtKt$executeCatching$8.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    Result.Companion companion = Result.Companion;
                    runCatchingExtKt$executeCatching$8.L$0 = kFunction2;
                    runCatchingExtKt$executeCatching$8.label = 1;
                    obj2 = ((Function1) kFunction).invoke(runCatchingExtKt$executeCatching$8);
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    kFunction2 = (KFunction) runCatchingExtKt$executeCatching$8.L$0;
                    ResultKt.throwOnFailure(obj2);
                }
                Object m7271constructorimpl = Result.m7271constructorimpl(obj2);
                m7274exceptionOrNullimpl = Result.m7274exceptionOrNullimpl(m7271constructorimpl);
                if (m7274exceptionOrNullimpl != null) {
                    return m7271constructorimpl;
                }
                throw ((Throwable) ((Function1) kFunction2).invoke(m7274exceptionOrNullimpl));
            }
        }
        runCatchingExtKt$executeCatching$8 = new RunCatchingExtKt$executeCatching$8(continuation);
        Object obj22 = runCatchingExtKt$executeCatching$8.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = runCatchingExtKt$executeCatching$8.label;
        if (i != 0) {
        }
        Object m7271constructorimpl2 = Result.m7271constructorimpl(obj22);
        m7274exceptionOrNullimpl = Result.m7274exceptionOrNullimpl(m7271constructorimpl2);
        if (m7274exceptionOrNullimpl != null) {
        }
    }

    private static final <T> Object executeCatching$$forInline(Object obj, KFunction<? extends T> kFunction, KFunction<? extends Throwable> kFunction2, Continuation<? super T> continuation) {
        Object m7271constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            InlineMarker.mark(3);
            InlineMarker.mark(0);
            Object invoke = ((Function1) kFunction).invoke(null);
            InlineMarker.mark(1);
            m7271constructorimpl = Result.m7271constructorimpl(invoke);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m7271constructorimpl = Result.m7271constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m7274exceptionOrNullimpl = Result.m7274exceptionOrNullimpl(m7271constructorimpl);
        if (m7274exceptionOrNullimpl == null) {
            return m7271constructorimpl;
        }
        throw ((Throwable) ((Function1) kFunction2).invoke(m7274exceptionOrNullimpl));
    }

    public static final <T> T executeAction(Object obj, Function0<? extends T> action, Function0<Unit> error) {
        T t;
        Intrinsics.checkNotNullParameter(obj, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(error, "error");
        try {
            Result.Companion companion = Result.Companion;
            t = (T) Result.m7271constructorimpl(action.invoke());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            t = (T) Result.m7271constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m7274exceptionOrNullimpl = Result.m7274exceptionOrNullimpl(t);
        if (m7274exceptionOrNullimpl == null) {
            return t;
        }
        error.invoke();
        throw m7274exceptionOrNullimpl;
    }

    public static final Throwable exception(Object obj) {
        Throwable m7274exceptionOrNullimpl = Result.m7274exceptionOrNullimpl(obj);
        Intrinsics.checkNotNull(m7274exceptionOrNullimpl);
        return m7274exceptionOrNullimpl;
    }
}
