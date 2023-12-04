package com.airbnb.lottie.compose;

import com.airbnb.lottie.LottieComposition;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
/* compiled from: LottieCompositionResult.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0004"}, d2 = {"awaitOrNull", "Lcom/airbnb/lottie/LottieComposition;", "Lcom/airbnb/lottie/compose/LottieCompositionResult;", "(Lcom/airbnb/lottie/compose/LottieCompositionResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lottie-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LottieCompositionResultKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object awaitOrNull(LottieCompositionResult lottieCompositionResult, Continuation<? super LottieComposition> continuation) {
        LottieCompositionResultKt$awaitOrNull$1 lottieCompositionResultKt$awaitOrNull$1;
        int i;
        try {
            if (continuation instanceof LottieCompositionResultKt$awaitOrNull$1) {
                lottieCompositionResultKt$awaitOrNull$1 = (LottieCompositionResultKt$awaitOrNull$1) continuation;
                if ((lottieCompositionResultKt$awaitOrNull$1.label & Integer.MIN_VALUE) != 0) {
                    lottieCompositionResultKt$awaitOrNull$1.label -= Integer.MIN_VALUE;
                    Object obj = lottieCompositionResultKt$awaitOrNull$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = lottieCompositionResultKt$awaitOrNull$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        lottieCompositionResultKt$awaitOrNull$1.label = 1;
                        obj = lottieCompositionResult.await(lottieCompositionResultKt$awaitOrNull$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ResultKt.throwOnFailure(obj);
                    }
                    return (LottieComposition) obj;
                }
            }
            if (i != 0) {
            }
            return (LottieComposition) obj;
        } catch (Throwable unused) {
            return null;
        }
        lottieCompositionResultKt$awaitOrNull$1 = new LottieCompositionResultKt$awaitOrNull$1(continuation);
        Object obj2 = lottieCompositionResultKt$awaitOrNull$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = lottieCompositionResultKt$awaitOrNull$1.label;
    }
}
