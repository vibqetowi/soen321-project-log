package androidx.compose.foundation;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: AndroidOverscroll.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "invoke-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class AndroidOverscrollKt$StretchOverscrollNonClippingLayer$1 extends Lambda implements Function3<MeasureScope, Measurable, Constraints, MeasureResult> {
    public static final AndroidOverscrollKt$StretchOverscrollNonClippingLayer$1 INSTANCE = new AndroidOverscrollKt$StretchOverscrollNonClippingLayer$1();

    AndroidOverscrollKt$StretchOverscrollNonClippingLayer$1() {
        super(3);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        return m418invoke3p2s80s(measureScope, measurable, constraints.m5557unboximpl());
    }

    /* renamed from: invoke-3p2s80s  reason: not valid java name */
    public final MeasureResult m418invoke3p2s80s(MeasureScope layout, Measurable measurable, long j) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        Placeable mo4545measureBRTryo0 = measurable.mo4545measureBRTryo0(j);
        int i = layout.mo582roundToPx0680j_4(Dp.m5607constructorimpl(ClipScrollableContainerKt.getMaxSupportedElevation() * 2));
        return MeasureScope.CC.layout$default(layout, mo4545measureBRTryo0.getMeasuredWidth() - i, mo4545measureBRTryo0.getMeasuredHeight() - i, null, new AnonymousClass1(mo4545measureBRTryo0, i), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidOverscroll.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.AndroidOverscrollKt$StretchOverscrollNonClippingLayer$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
        final /* synthetic */ int $extraSizePx;
        final /* synthetic */ Placeable $placeable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Placeable placeable, int i) {
            super(1);
            this.$placeable = placeable;
            this.$extraSizePx = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
            invoke2(placementScope);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Placeable.PlacementScope layout) {
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            Placeable placeable = this.$placeable;
            Placeable.PlacementScope.placeWithLayer$default(layout, placeable, ((-this.$extraSizePx) / 2) - ((placeable.getWidth() - this.$placeable.getMeasuredWidth()) / 2), ((-this.$extraSizePx) / 2) - ((this.$placeable.getHeight() - this.$placeable.getMeasuredHeight()) / 2), 0.0f, null, 12, null);
        }
    }
}
