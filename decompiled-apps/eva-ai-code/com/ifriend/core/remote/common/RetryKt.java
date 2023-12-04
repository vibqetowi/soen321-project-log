package com.ifriend.core.remote.common;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.DelayKt;
/* compiled from: retry.kt */
@Metadata(d1 = {"\u0000*\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\u001a5\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u001c\u0010\u0002\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u001a]\u0010\u0007\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u001c\u0010\u0002\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"oneTimeRetryRemoteRequest", ExifInterface.GPS_DIRECTION_TRUE, "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retryRemoteRequest", "times", "", "initialDelayMillis", "", "maxDelayMillis", "factor", "", "(IJJDLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "remote-datasource"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RetryKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00c2 -> B:17:0x004e). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object retryRemoteRequest(int i, long j, long j2, double d, Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super T> continuation) {
        RetryKt$retryRemoteRequest$1 retryKt$retryRemoteRequest$1;
        int i2;
        Ref.LongRef longRef;
        RetryKt$retryRemoteRequest$1 retryKt$retryRemoteRequest$12;
        Object obj;
        int i3;
        int i4;
        long j3;
        double d2;
        Function1<? super Continuation<? super T>, ? extends Object> function12;
        Function1<? super Continuation<? super T>, ? extends Object> function13;
        Ref.LongRef longRef2;
        long j4;
        double d3;
        int i5;
        int i6;
        long j5;
        if (continuation instanceof RetryKt$retryRemoteRequest$1) {
            retryKt$retryRemoteRequest$1 = (RetryKt$retryRemoteRequest$1) continuation;
            if ((retryKt$retryRemoteRequest$1.label & Integer.MIN_VALUE) != 0) {
                retryKt$retryRemoteRequest$1.label -= Integer.MIN_VALUE;
                Object obj2 = retryKt$retryRemoteRequest$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = retryKt$retryRemoteRequest$1.label;
                if (i2 == 0) {
                    if (i2 == 1) {
                        i6 = retryKt$retryRemoteRequest$1.I$1;
                        i5 = retryKt$retryRemoteRequest$1.I$0;
                        d3 = retryKt$retryRemoteRequest$1.D$0;
                        j4 = retryKt$retryRemoteRequest$1.J$0;
                        longRef2 = (Ref.LongRef) retryKt$retryRemoteRequest$1.L$1;
                        function13 = (Function1) retryKt$retryRemoteRequest$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj2);
                        } catch (Throwable unused) {
                            j5 = longRef2.element;
                            retryKt$retryRemoteRequest$1.L$0 = function13;
                            retryKt$retryRemoteRequest$1.L$1 = longRef2;
                            retryKt$retryRemoteRequest$1.J$0 = j4;
                            retryKt$retryRemoteRequest$1.D$0 = d3;
                            retryKt$retryRemoteRequest$1.I$0 = i5;
                            retryKt$retryRemoteRequest$1.I$1 = i6;
                            retryKt$retryRemoteRequest$1.label = 2;
                            if (DelayKt.delay(j5, retryKt$retryRemoteRequest$1) == coroutine_suspended) {
                            }
                            double d4 = d3;
                            retryKt$retryRemoteRequest$12 = retryKt$retryRemoteRequest$1;
                            j3 = j4;
                            longRef = longRef2;
                            obj = coroutine_suspended;
                            i3 = i5;
                            int i7 = i6;
                            d2 = d4;
                            longRef.element = RangesKt.coerceAtMost((long) (longRef.element * d2), j3);
                            i4 = i7 + 1;
                            function12 = function13;
                            if (i4 >= i3) {
                            }
                        }
                    } else if (i2 != 2) {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    } else {
                        i6 = retryKt$retryRemoteRequest$1.I$1;
                        i5 = retryKt$retryRemoteRequest$1.I$0;
                        d3 = retryKt$retryRemoteRequest$1.D$0;
                        j4 = retryKt$retryRemoteRequest$1.J$0;
                        longRef2 = (Ref.LongRef) retryKt$retryRemoteRequest$1.L$1;
                        function13 = (Function1) retryKt$retryRemoteRequest$1.L$0;
                        ResultKt.throwOnFailure(obj2);
                        double d42 = d3;
                        retryKt$retryRemoteRequest$12 = retryKt$retryRemoteRequest$1;
                        j3 = j4;
                        longRef = longRef2;
                        obj = coroutine_suspended;
                        i3 = i5;
                        int i72 = i6;
                        d2 = d42;
                        longRef.element = RangesKt.coerceAtMost((long) (longRef.element * d2), j3);
                        i4 = i72 + 1;
                        function12 = function13;
                        if (i4 >= i3) {
                            try {
                            } catch (Throwable unused2) {
                                function13 = function12;
                                i5 = i3;
                                int i8 = i4;
                                longRef2 = longRef;
                                retryKt$retryRemoteRequest$1 = retryKt$retryRemoteRequest$12;
                                d3 = d2;
                                coroutine_suspended = obj;
                                i6 = i8;
                                j4 = j3;
                                j5 = longRef2.element;
                                retryKt$retryRemoteRequest$1.L$0 = function13;
                                retryKt$retryRemoteRequest$1.L$1 = longRef2;
                                retryKt$retryRemoteRequest$1.J$0 = j4;
                                retryKt$retryRemoteRequest$1.D$0 = d3;
                                retryKt$retryRemoteRequest$1.I$0 = i5;
                                retryKt$retryRemoteRequest$1.I$1 = i6;
                                retryKt$retryRemoteRequest$1.label = 2;
                                if (DelayKt.delay(j5, retryKt$retryRemoteRequest$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                double d422 = d3;
                                retryKt$retryRemoteRequest$12 = retryKt$retryRemoteRequest$1;
                                j3 = j4;
                                longRef = longRef2;
                                obj = coroutine_suspended;
                                i3 = i5;
                                int i722 = i6;
                                d2 = d422;
                                longRef.element = RangesKt.coerceAtMost((long) (longRef.element * d2), j3);
                                i4 = i722 + 1;
                                function12 = function13;
                                if (i4 >= i3) {
                                }
                            }
                            retryKt$retryRemoteRequest$12.L$0 = function12;
                            retryKt$retryRemoteRequest$12.L$1 = longRef;
                            retryKt$retryRemoteRequest$12.J$0 = j3;
                            retryKt$retryRemoteRequest$12.D$0 = d2;
                            retryKt$retryRemoteRequest$12.I$0 = i3;
                            retryKt$retryRemoteRequest$12.I$1 = i4;
                            retryKt$retryRemoteRequest$12.label = 1;
                            obj2 = function12.invoke(retryKt$retryRemoteRequest$12);
                            return obj2 == obj ? obj : obj2;
                        }
                        retryKt$retryRemoteRequest$12.L$0 = null;
                        retryKt$retryRemoteRequest$12.L$1 = null;
                        retryKt$retryRemoteRequest$12.label = 3;
                        obj2 = function12.invoke(retryKt$retryRemoteRequest$12);
                        return obj2 == obj ? obj : obj2;
                    }
                }
                ResultKt.throwOnFailure(obj2);
                Ref.LongRef longRef3 = new Ref.LongRef();
                longRef3.element = j;
                longRef = longRef3;
                retryKt$retryRemoteRequest$12 = retryKt$retryRemoteRequest$1;
                obj = coroutine_suspended;
                i3 = i - 1;
                i4 = 0;
                j3 = j2;
                d2 = d;
                function12 = function1;
                if (i4 >= i3) {
                }
            }
        }
        retryKt$retryRemoteRequest$1 = new RetryKt$retryRemoteRequest$1(continuation);
        Object obj22 = retryKt$retryRemoteRequest$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = retryKt$retryRemoteRequest$1.label;
        if (i2 == 0) {
        }
    }

    public static /* synthetic */ Object retryRemoteRequest$default(int i, long j, long j2, double d, Function1 function1, Continuation continuation, int i2, Object obj) {
        return retryRemoteRequest((i2 & 1) != 0 ? 3 : i, (i2 & 2) != 0 ? 2000L : j, (i2 & 4) != 0 ? 5000L : j2, (i2 & 8) != 0 ? 2.0d : d, function1, continuation);
    }

    public static final <T> Object oneTimeRetryRemoteRequest(Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super T> continuation) {
        return retryRemoteRequest$default(2, 250L, 0L, 0.0d, function1, continuation, 12, null);
    }
}
