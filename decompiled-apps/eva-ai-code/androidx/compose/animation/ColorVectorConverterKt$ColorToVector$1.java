package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
/* compiled from: ColorVectorConverter.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/graphics/Color;", "Landroidx/compose/animation/core/AnimationVector4D;", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ColorVectorConverterKt$ColorToVector$1 extends Lambda implements Function1<ColorSpace, TwoWayConverter<Color, AnimationVector4D>> {
    public static final ColorVectorConverterKt$ColorToVector$1 INSTANCE = new ColorVectorConverterKt$ColorToVector$1();

    ColorVectorConverterKt$ColorToVector$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ColorVectorConverter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/AnimationVector4D;", "color", "Landroidx/compose/ui/graphics/Color;", "invoke-8_81llA", "(J)Landroidx/compose/animation/core/AnimationVector4D;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<Color, AnimationVector4D> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ AnimationVector4D invoke(Color color) {
            return m301invoke8_81llA(color.m3301unboximpl());
        }

        /* renamed from: invoke-8_81llA  reason: not valid java name */
        public final AnimationVector4D m301invoke8_81llA(long j) {
            long m3288convertvNxB06k = Color.m3288convertvNxB06k(j, ColorSpaces.INSTANCE.getOklab());
            return new AnimationVector4D(Color.m3285component4impl(m3288convertvNxB06k), Color.m3282component1impl(m3288convertvNxB06k), Color.m3283component2impl(m3288convertvNxB06k), Color.m3284component3impl(m3288convertvNxB06k));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ColorVectorConverter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/ui/graphics/Color;", "vector", "Landroidx/compose/animation/core/AnimationVector4D;", "invoke-vNxB06k", "(Landroidx/compose/animation/core/AnimationVector4D;)J"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends Lambda implements Function1<AnimationVector4D, Color> {
        final /* synthetic */ ColorSpace $colorSpace;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ColorSpace colorSpace) {
            super(1);
            this.$colorSpace = colorSpace;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Color invoke(AnimationVector4D animationVector4D) {
            return Color.m3281boximpl(m302invokevNxB06k(animationVector4D));
        }

        /* renamed from: invoke-vNxB06k  reason: not valid java name */
        public final long m302invokevNxB06k(AnimationVector4D vector) {
            Intrinsics.checkNotNullParameter(vector, "vector");
            return Color.m3288convertvNxB06k(ColorKt.Color(RangesKt.coerceIn(vector.getV2(), 0.0f, 1.0f), RangesKt.coerceIn(vector.getV3(), -0.5f, 0.5f), RangesKt.coerceIn(vector.getV4(), -0.5f, 0.5f), RangesKt.coerceIn(vector.getV1(), 0.0f, 1.0f), ColorSpaces.INSTANCE.getOklab()), this.$colorSpace);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final TwoWayConverter<Color, AnimationVector4D> invoke(ColorSpace colorSpace) {
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        return VectorConvertersKt.TwoWayConverter(AnonymousClass1.INSTANCE, new AnonymousClass2(colorSpace));
    }
}
