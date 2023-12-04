package androidx.compose.animation.core;

import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpOffset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: VectorConverters.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/DpOffset;", "it", "Landroidx/compose/animation/core/AnimationVector2D;", "invoke-gVRvYmI", "(Landroidx/compose/animation/core/AnimationVector2D;)J"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class VectorConvertersKt$DpOffsetToVector$2 extends Lambda implements Function1<AnimationVector2D, DpOffset> {
    public static final VectorConvertersKt$DpOffsetToVector$2 INSTANCE = new VectorConvertersKt$DpOffsetToVector$2();

    VectorConvertersKt$DpOffsetToVector$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ DpOffset invoke(AnimationVector2D animationVector2D) {
        return DpOffset.m5662boximpl(m391invokegVRvYmI(animationVector2D));
    }

    /* renamed from: invoke-gVRvYmI  reason: not valid java name */
    public final long m391invokegVRvYmI(AnimationVector2D it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return DpKt.m5628DpOffsetYgX7TsA(Dp.m5607constructorimpl(it.getV1()), Dp.m5607constructorimpl(it.getV2()));
    }
}
