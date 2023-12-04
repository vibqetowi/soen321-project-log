package com.airbnb.lottie.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
/* compiled from: LottieRetrySignal.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"rememberLottieRetrySignal", "Lcom/airbnb/lottie/compose/LottieRetrySignal;", "(Landroidx/compose/runtime/Composer;I)Lcom/airbnb/lottie/compose/LottieRetrySignal;", "lottie-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LottieRetrySignalKt {
    public static final LottieRetrySignal rememberLottieRetrySignal(Composer composer, int i) {
        composer.startReplaceableGroup(-1266611990);
        ComposerKt.sourceInformation(composer, "C(rememberLottieRetrySignal)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1266611990, i, -1, "com.airbnb.lottie.compose.rememberLottieRetrySignal (LottieRetrySignal.kt:17)");
        }
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LottieRetrySignal();
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        LottieRetrySignal lottieRetrySignal = (LottieRetrySignal) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return lottieRetrySignal;
    }
}
