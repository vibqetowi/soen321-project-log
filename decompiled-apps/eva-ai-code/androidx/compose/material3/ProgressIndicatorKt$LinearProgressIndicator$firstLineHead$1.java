package androidx.compose.material3;

import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.KeyframesSpec;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ProgressIndicator.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$1 extends Lambda implements Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit> {
    public static final ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$1 INSTANCE = new ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$1();

    ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
        invoke2(keyframesSpecConfig);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
        CubicBezierEasing cubicBezierEasing;
        Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
        keyframes.setDurationMillis(1800);
        KeyframesSpec.KeyframeEntity<Float> at = keyframes.at(Float.valueOf(0.0f), 0);
        cubicBezierEasing = ProgressIndicatorKt.FirstLineHeadEasing;
        keyframes.with(at, cubicBezierEasing);
        keyframes.at(Float.valueOf(1.0f), 750);
    }
}
