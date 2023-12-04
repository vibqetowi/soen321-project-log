package androidx.compose.material;

import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.KeyframesSpec;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ProgressIndicator.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ProgressIndicatorKt$CircularProgressIndicator$endAngle$2 extends Lambda implements Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit> {
    public static final ProgressIndicatorKt$CircularProgressIndicator$endAngle$2 INSTANCE = new ProgressIndicatorKt$CircularProgressIndicator$endAngle$2();

    ProgressIndicatorKt$CircularProgressIndicator$endAngle$2() {
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
        keyframes.setDurationMillis(1332);
        KeyframesSpec.KeyframeEntity<Float> at = keyframes.at(Float.valueOf(0.0f), 0);
        cubicBezierEasing = ProgressIndicatorKt.CircularEasing;
        keyframes.with(at, cubicBezierEasing);
        keyframes.at(Float.valueOf(290.0f), 666);
    }
}
