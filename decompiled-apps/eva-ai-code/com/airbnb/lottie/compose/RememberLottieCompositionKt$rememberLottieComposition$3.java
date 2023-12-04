package com.airbnb.lottie.compose;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.airbnb.lottie.LottieComposition;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: rememberLottieComposition.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$3", f = "rememberLottieComposition.kt", i = {0, 0, 1, 1}, l = {91, 93}, m = "invokeSuspend", n = {"exception", "failedCount", "exception", "failedCount"}, s = {"L$0", "I$0", "L$0", "I$0"})
/* loaded from: classes2.dex */
public final class RememberLottieCompositionKt$rememberLottieComposition$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $cacheKey;
    final /* synthetic */ Context $context;
    final /* synthetic */ String $fontAssetsFolder;
    final /* synthetic */ String $fontFileExtension;
    final /* synthetic */ String $imageAssetsFolder;
    final /* synthetic */ Function3<Integer, Throwable, Continuation<? super Boolean>, Object> $onRetry;
    final /* synthetic */ MutableState<LottieCompositionResultImpl> $result$delegate;
    final /* synthetic */ LottieCompositionSpec $spec;
    int I$0;
    Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RememberLottieCompositionKt$rememberLottieComposition$3(Function3<? super Integer, ? super Throwable, ? super Continuation<? super Boolean>, ? extends Object> function3, Context context, LottieCompositionSpec lottieCompositionSpec, String str, String str2, String str3, String str4, MutableState<LottieCompositionResultImpl> mutableState, Continuation<? super RememberLottieCompositionKt$rememberLottieComposition$3> continuation) {
        super(2, continuation);
        this.$onRetry = function3;
        this.$context = context;
        this.$spec = lottieCompositionSpec;
        this.$imageAssetsFolder = str;
        this.$fontAssetsFolder = str2;
        this.$fontFileExtension = str3;
        this.$cacheKey = str4;
        this.$result$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RememberLottieCompositionKt$rememberLottieComposition$3(this.$onRetry, this.$context, this.$spec, this.$imageAssetsFolder, this.$fontAssetsFolder, this.$fontFileExtension, this.$cacheKey, this.$result$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RememberLottieCompositionKt$rememberLottieComposition$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:5|(3:6|7|8)|9|10|11|12|(4:(2:15|(1:17)(3:19|20|(1:22)(1:23)))|24|25|(1:27)(6:28|9|10|11|12|(0)))|32|(1:35)|36|37) */
    /* JADX WARN: Can't wrap try/catch for region: R(4:(2:15|(1:17)(3:19|20|(1:22)(1:23)))|24|25|(1:27)(6:28|9|10|11|12|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b7, code lost:
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b8, code lost:
        r12 = r4;
        r4 = r14;
        r14 = r0;
        r0 = r1;
        r1 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00be, code lost:
        r4 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ce A[ADDED_TO_REGION] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00a1 -> B:42:0x00a7). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00bf -> B:15:0x003f). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        Throwable th;
        RememberLottieCompositionKt$rememberLottieComposition$3 rememberLottieCompositionKt$rememberLottieComposition$3;
        LottieCompositionResultImpl rememberLottieComposition$lambda$1;
        LottieCompositionResultImpl rememberLottieComposition$lambda$12;
        String ensureTrailingSlash;
        String ensureTrailingSlash2;
        String ensureLeadingPeriod;
        Object lottieComposition;
        RememberLottieCompositionKt$rememberLottieComposition$3 rememberLottieCompositionKt$rememberLottieComposition$32;
        Throwable th2;
        int i2;
        Object obj2;
        Throwable th3;
        int i3;
        Object obj3;
        RememberLottieCompositionKt$rememberLottieComposition$3 rememberLottieCompositionKt$rememberLottieComposition$33;
        LottieCompositionResultImpl rememberLottieComposition$lambda$13;
        LottieCompositionResultImpl rememberLottieComposition$lambda$14;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            i = 0;
            th = null;
            rememberLottieCompositionKt$rememberLottieComposition$3 = this;
            rememberLottieComposition$lambda$13 = RememberLottieCompositionKt.rememberLottieComposition$lambda$1(rememberLottieCompositionKt$rememberLottieComposition$3.$result$delegate);
            if (!rememberLottieComposition$lambda$13.isSuccess()) {
            }
            rememberLottieComposition$lambda$1 = RememberLottieCompositionKt.rememberLottieComposition$lambda$1(rememberLottieCompositionKt$rememberLottieComposition$3.$result$delegate);
            if (!rememberLottieComposition$lambda$1.isComplete()) {
                rememberLottieComposition$lambda$12 = RememberLottieCompositionKt.rememberLottieComposition$lambda$1(rememberLottieCompositionKt$rememberLottieComposition$3.$result$delegate);
                rememberLottieComposition$lambda$12.completeExceptionally$lottie_compose_release(th);
            }
            return Unit.INSTANCE;
        } else if (i4 != 1) {
            if (i4 == 2) {
                i = this.I$0;
                Throwable th4 = (Throwable) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    th2 = th4;
                    i2 = i;
                    obj2 = coroutine_suspended;
                    rememberLottieCompositionKt$rememberLottieComposition$32 = this;
                } catch (Throwable th5) {
                    th = th5;
                    rememberLottieCompositionKt$rememberLottieComposition$3 = this;
                    i++;
                    rememberLottieComposition$lambda$13 = RememberLottieCompositionKt.rememberLottieComposition$lambda$1(rememberLottieCompositionKt$rememberLottieComposition$3.$result$delegate);
                    if (!rememberLottieComposition$lambda$13.isSuccess()) {
                    }
                    rememberLottieComposition$lambda$1 = RememberLottieCompositionKt.rememberLottieComposition$lambda$1(rememberLottieCompositionKt$rememberLottieComposition$3.$result$delegate);
                    if (!rememberLottieComposition$lambda$1.isComplete()) {
                    }
                    return Unit.INSTANCE;
                }
                rememberLottieComposition$lambda$14 = RememberLottieCompositionKt.rememberLottieComposition$lambda$1(rememberLottieCompositionKt$rememberLottieComposition$32.$result$delegate);
                rememberLottieComposition$lambda$14.complete$lottie_compose_release((LottieComposition) obj);
                rememberLottieCompositionKt$rememberLottieComposition$3 = rememberLottieCompositionKt$rememberLottieComposition$32;
                coroutine_suspended = obj2;
                i = i2;
                th = th2;
                rememberLottieComposition$lambda$13 = RememberLottieCompositionKt.rememberLottieComposition$lambda$1(rememberLottieCompositionKt$rememberLottieComposition$3.$result$delegate);
                if (!rememberLottieComposition$lambda$13.isSuccess()) {
                    if (i != 0) {
                        Function3<Integer, Throwable, Continuation<? super Boolean>, Object> function3 = rememberLottieCompositionKt$rememberLottieComposition$3.$onRetry;
                        Integer boxInt = Boxing.boxInt(i);
                        Intrinsics.checkNotNull(th);
                        rememberLottieCompositionKt$rememberLottieComposition$3.L$0 = th;
                        rememberLottieCompositionKt$rememberLottieComposition$3.I$0 = i;
                        rememberLottieCompositionKt$rememberLottieComposition$3.label = 1;
                        Object invoke = function3.invoke(boxInt, th, rememberLottieCompositionKt$rememberLottieComposition$3);
                        if (invoke == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Object obj4 = coroutine_suspended;
                        rememberLottieCompositionKt$rememberLottieComposition$33 = rememberLottieCompositionKt$rememberLottieComposition$3;
                        obj = invoke;
                        th3 = th;
                        i3 = i;
                        obj3 = obj4;
                        if (((Boolean) obj).booleanValue()) {
                            rememberLottieCompositionKt$rememberLottieComposition$3 = rememberLottieCompositionKt$rememberLottieComposition$33;
                            th = th3;
                        } else {
                            rememberLottieCompositionKt$rememberLottieComposition$3 = rememberLottieCompositionKt$rememberLottieComposition$33;
                            coroutine_suspended = obj3;
                            i = i3;
                            th = th3;
                        }
                    }
                    Context context = rememberLottieCompositionKt$rememberLottieComposition$3.$context;
                    LottieCompositionSpec lottieCompositionSpec = rememberLottieCompositionKt$rememberLottieComposition$3.$spec;
                    ensureTrailingSlash = RememberLottieCompositionKt.ensureTrailingSlash(rememberLottieCompositionKt$rememberLottieComposition$3.$imageAssetsFolder);
                    ensureTrailingSlash2 = RememberLottieCompositionKt.ensureTrailingSlash(rememberLottieCompositionKt$rememberLottieComposition$3.$fontAssetsFolder);
                    ensureLeadingPeriod = RememberLottieCompositionKt.ensureLeadingPeriod(rememberLottieCompositionKt$rememberLottieComposition$3.$fontFileExtension);
                    rememberLottieCompositionKt$rememberLottieComposition$3.L$0 = th;
                    rememberLottieCompositionKt$rememberLottieComposition$3.I$0 = i;
                    rememberLottieCompositionKt$rememberLottieComposition$3.label = 2;
                    lottieComposition = RememberLottieCompositionKt.lottieComposition(context, lottieCompositionSpec, ensureTrailingSlash, ensureTrailingSlash2, ensureLeadingPeriod, rememberLottieCompositionKt$rememberLottieComposition$3.$cacheKey, rememberLottieCompositionKt$rememberLottieComposition$3);
                    if (lottieComposition == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    Object obj5 = coroutine_suspended;
                    rememberLottieCompositionKt$rememberLottieComposition$32 = rememberLottieCompositionKt$rememberLottieComposition$3;
                    obj = lottieComposition;
                    th2 = th;
                    i2 = i;
                    obj2 = obj5;
                    rememberLottieComposition$lambda$14 = RememberLottieCompositionKt.rememberLottieComposition$lambda$1(rememberLottieCompositionKt$rememberLottieComposition$32.$result$delegate);
                    rememberLottieComposition$lambda$14.complete$lottie_compose_release((LottieComposition) obj);
                    rememberLottieCompositionKt$rememberLottieComposition$3 = rememberLottieCompositionKt$rememberLottieComposition$32;
                    coroutine_suspended = obj2;
                    i = i2;
                    th = th2;
                    rememberLottieComposition$lambda$13 = RememberLottieCompositionKt.rememberLottieComposition$lambda$1(rememberLottieCompositionKt$rememberLottieComposition$3.$result$delegate);
                    if (!rememberLottieComposition$lambda$13.isSuccess()) {
                    }
                }
                rememberLottieComposition$lambda$1 = RememberLottieCompositionKt.rememberLottieComposition$lambda$1(rememberLottieCompositionKt$rememberLottieComposition$3.$result$delegate);
                if (!rememberLottieComposition$lambda$1.isComplete() && th != null) {
                    rememberLottieComposition$lambda$12 = RememberLottieCompositionKt.rememberLottieComposition$lambda$1(rememberLottieCompositionKt$rememberLottieComposition$3.$result$delegate);
                    rememberLottieComposition$lambda$12.completeExceptionally$lottie_compose_release(th);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            int i5 = this.I$0;
            ResultKt.throwOnFailure(obj);
            th3 = (Throwable) this.L$0;
            i3 = i5;
            obj3 = coroutine_suspended;
            rememberLottieCompositionKt$rememberLottieComposition$33 = this;
            if (((Boolean) obj).booleanValue()) {
            }
        }
    }
}
