package com.airbnb.lottie.compose;

import androidx.compose.runtime.State;
import com.airbnb.lottie.value.LottieFrameInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: LottieDynamicProperties.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class LottieDynamicPropertiesKt$rememberLottieDynamicProperty$2$1 extends Lambda implements Function1<LottieFrameInfo<T>, T> {
    final /* synthetic */ State<Function1<LottieFrameInfo<T>, T>> $callbackState$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LottieDynamicPropertiesKt$rememberLottieDynamicProperty$2$1(State<? extends Function1<? super LottieFrameInfo<T>, ? extends T>> state) {
        super(1);
        this.$callbackState$delegate = state;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
    public final T invoke(LottieFrameInfo<T> it) {
        Function1 rememberLottieDynamicProperty$lambda$4;
        Intrinsics.checkNotNullParameter(it, "it");
        rememberLottieDynamicProperty$lambda$4 = LottieDynamicPropertiesKt.rememberLottieDynamicProperty$lambda$4(this.$callbackState$delegate);
        return rememberLottieDynamicProperty$lambda$4.invoke(it);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((LottieFrameInfo<Object>) obj);
    }
}
