package com.airbnb.lottie.compose;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.utils.Utils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.apache.commons.lang3.ClassUtils;
/* compiled from: animateLottieCompositionAsState.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001as\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, d2 = {"animateLottieCompositionAsState", "Lcom/airbnb/lottie/compose/LottieAnimationState;", "composition", "Lcom/airbnb/lottie/LottieComposition;", "isPlaying", "", "restartOnPlay", "reverseOnRepeat", "clipSpec", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "speed", "", "iterations", "", "cancellationBehavior", "Lcom/airbnb/lottie/compose/LottieCancellationBehavior;", "ignoreSystemAnimatorScale", "useCompositionFrameRate", "(Lcom/airbnb/lottie/LottieComposition;ZZZLcom/airbnb/lottie/compose/LottieClipSpec;FILcom/airbnb/lottie/compose/LottieCancellationBehavior;ZZLandroidx/compose/runtime/Composer;II)Lcom/airbnb/lottie/compose/LottieAnimationState;", "lottie-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AnimateLottieCompositionAsStateKt {
    public static final LottieAnimationState animateLottieCompositionAsState(LottieComposition lottieComposition, boolean z, boolean z2, boolean z3, LottieClipSpec lottieClipSpec, float f, int i, LottieCancellationBehavior lottieCancellationBehavior, boolean z4, boolean z5, Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(683659508);
        ComposerKt.sourceInformation(composer, "C(animateLottieCompositionAsState)P(2,4,6,7,1,8,5)");
        boolean z6 = (i3 & 2) != 0 ? true : z;
        boolean z7 = (i3 & 4) != 0 ? true : z2;
        boolean z8 = (i3 & 8) != 0 ? false : z3;
        LottieClipSpec lottieClipSpec2 = (i3 & 16) != 0 ? null : lottieClipSpec;
        float f2 = (i3 & 32) != 0 ? 1.0f : f;
        int i4 = (i3 & 64) != 0 ? 1 : i;
        LottieCancellationBehavior lottieCancellationBehavior2 = (i3 & 128) != 0 ? LottieCancellationBehavior.Immediately : lottieCancellationBehavior;
        boolean z9 = (i3 & 256) != 0 ? false : z4;
        boolean z10 = (i3 & 512) != 0 ? false : z5;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(683659508, i2, -1, "com.airbnb.lottie.compose.animateLottieCompositionAsState (animateLottieCompositionAsState.kt:43)");
        }
        if (!(i4 > 0)) {
            throw new IllegalArgumentException(("Iterations must be a positive number (" + i4 + ").").toString());
        }
        if (!((Float.isInfinite(f2) || Float.isNaN(f2)) ? false : true)) {
            throw new IllegalArgumentException(("Speed must be a finite number. It is " + f2 + ClassUtils.PACKAGE_SEPARATOR_CHAR).toString());
        }
        LottieAnimatable rememberLottieAnimatable = LottieAnimatableKt.rememberLottieAnimatable(composer, 0);
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z6), null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        composer.startReplaceableGroup(-180606834);
        if (!z9) {
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            ComposerKt.sourceInformationMarkerEnd(composer);
            f2 /= Utils.getAnimationScale((Context) consume);
        }
        composer.endReplaceableGroup();
        EffectsKt.LaunchedEffect(new Object[]{lottieComposition, Boolean.valueOf(z6), lottieClipSpec2, Float.valueOf(f2), Integer.valueOf(i4)}, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) new AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3(z6, z7, rememberLottieAnimatable, lottieComposition, i4, z8, f2, lottieClipSpec2, lottieCancellationBehavior2, z10, mutableState, null), composer, 72);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberLottieAnimatable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean animateLottieCompositionAsState$lambda$3(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateLottieCompositionAsState$lambda$4(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }
}
