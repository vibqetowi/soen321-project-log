package androidx.compose.material3;

import androidx.compose.runtime.State;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SearchBar.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SearchBarKt$SearchBar$3$1 extends Lambda implements Function3<MeasureScope, Measurable, Constraints, MeasureResult> {
    final /* synthetic */ State<Float> $animationProgress;
    final /* synthetic */ State<Dp> $topPadding;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBarKt$SearchBar$3$1(State<Dp> state, State<Float> state2) {
        super(3);
        this.$topPadding = state;
        this.$animationProgress = state2;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        return m1962invoke3p2s80s(measureScope, measurable, constraints.m5557unboximpl());
    }

    /* renamed from: invoke-3p2s80s  reason: not valid java name */
    public final MeasureResult m1962invoke3p2s80s(MeasureScope layout, Measurable measurable, long j) {
        float f;
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        int i = layout.mo582roundToPx0680j_4(DpKt.m5650lerpMdfbLM(this.$topPadding.getValue().m5621unboximpl(), Dp.m5607constructorimpl(0), this.$animationProgress.getValue().floatValue()));
        int max = Math.max(Constraints.m5553getMinWidthimpl(j), layout.mo582roundToPx0680j_4(SearchBarKt.getSearchBarMinWidth()));
        int m5551getMaxWidthimpl = Constraints.m5551getMaxWidthimpl(j);
        f = SearchBarKt.SearchBarMaxWidth;
        int coerceAtMost = RangesKt.coerceAtMost(max, Math.min(m5551getMaxWidthimpl, layout.mo582roundToPx0680j_4(f)));
        int coerceAtMost2 = RangesKt.coerceAtMost(Math.max(Constraints.m5552getMinHeightimpl(j), layout.mo582roundToPx0680j_4(SearchBarDefaults.INSTANCE.m1957getInputFieldHeightD9Ej5fM())), Constraints.m5550getMaxHeightimpl(j));
        int m5551getMaxWidthimpl2 = Constraints.m5551getMaxWidthimpl(j);
        int m5550getMaxHeightimpl = Constraints.m5550getMaxHeightimpl(j);
        int lerp = MathHelpersKt.lerp(coerceAtMost, m5551getMaxWidthimpl2, this.$animationProgress.getValue().floatValue());
        int lerp2 = MathHelpersKt.lerp(coerceAtMost2, m5550getMaxHeightimpl, this.$animationProgress.getValue().floatValue()) + i;
        return MeasureScope.CC.layout$default(layout, lerp, lerp2, null, new AnonymousClass1(measurable.mo4545measureBRTryo0(ConstraintsKt.m5568offsetNN6EwU$default(Constraints.Companion.m5559fixedJhjzzOo(lerp, lerp2), 0, -i, 1, null)), i), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SearchBar.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.SearchBarKt$SearchBar$3$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
        final /* synthetic */ int $animatedTopPadding;
        final /* synthetic */ Placeable $placeable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Placeable placeable, int i) {
            super(1);
            this.$placeable = placeable;
            this.$animatedTopPadding = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
            invoke2(placementScope);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Placeable.PlacementScope layout) {
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            Placeable.PlacementScope.placeRelative$default(layout, this.$placeable, 0, this.$animatedTopPadding, 0.0f, 4, null);
        }
    }
}
