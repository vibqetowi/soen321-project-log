package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: MeasureScope.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001JG\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", TtmlNode.TAG_LAYOUT, "Landroidx/compose/ui/layout/MeasureResult;", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "", ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "alignmentLines", "", "Landroidx/compose/ui/layout/AlignmentLine;", "placementBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface MeasureScope extends IntrinsicMeasureScope {
    MeasureResult layout(int i, int i2, Map<AlignmentLine, Integer> map, Function1<? super Placeable.PlacementScope, Unit> function1);

    /* compiled from: MeasureScope.kt */
    /* renamed from: androidx.compose.ui.layout.MeasureScope$-CC  reason: invalid class name */
    /* loaded from: classes3.dex */
    public final /* synthetic */ class CC {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MeasureResult layout$default(MeasureScope measureScope, int i, int i2, Map map, Function1 function1, int i3, Object obj) {
            if (obj == null) {
                if ((i3 & 4) != 0) {
                    map = MapsKt.emptyMap();
                }
                return measureScope.layout(i, i2, map, function1);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
        }

        public static MeasureResult $default$layout(final MeasureScope _this, final int i, final int i2, final Map alignmentLines, final Function1 placementBlock) {
            Intrinsics.checkNotNullParameter(alignmentLines, "alignmentLines");
            Intrinsics.checkNotNullParameter(placementBlock, "placementBlock");
            return new MeasureResult(i, i2, alignmentLines, _this, placementBlock) { // from class: androidx.compose.ui.layout.MeasureScope$layout$1
                final /* synthetic */ Function1<Placeable.PlacementScope, Unit> $placementBlock;
                final /* synthetic */ int $width;
                private final Map<AlignmentLine, Integer> alignmentLines;
                private final int height;
                final /* synthetic */ MeasureScope this$0;
                private final int width;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.$width = i;
                    this.this$0 = _this;
                    this.$placementBlock = placementBlock;
                    this.width = i;
                    this.height = i2;
                    this.alignmentLines = alignmentLines;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public int getWidth() {
                    return this.width;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public int getHeight() {
                    return this.height;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public Map<AlignmentLine, Integer> getAlignmentLines() {
                    return this.alignmentLines;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public void placeChildren() {
                    Placeable.PlacementScope.Companion companion = Placeable.PlacementScope.Companion;
                    int i3 = this.$width;
                    LayoutDirection layoutDirection = this.this$0.getLayoutDirection();
                    MeasureScope measureScope = this.this$0;
                    LookaheadCapablePlaceable lookaheadCapablePlaceable = measureScope instanceof LookaheadCapablePlaceable ? (LookaheadCapablePlaceable) measureScope : null;
                    Function1<Placeable.PlacementScope, Unit> function1 = this.$placementBlock;
                    LayoutCoordinates layoutCoordinates = Placeable.PlacementScope._coordinates;
                    int parentWidth = Placeable.PlacementScope.Companion.getParentWidth();
                    LayoutDirection parentLayoutDirection = Placeable.PlacementScope.Companion.getParentLayoutDirection();
                    LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = Placeable.PlacementScope.layoutDelegate;
                    Placeable.PlacementScope.Companion companion2 = Placeable.PlacementScope.Companion;
                    Placeable.PlacementScope.parentWidth = i3;
                    Placeable.PlacementScope.Companion companion3 = Placeable.PlacementScope.Companion;
                    Placeable.PlacementScope.parentLayoutDirection = layoutDirection;
                    boolean configureForPlacingForAlignment = companion.configureForPlacingForAlignment(lookaheadCapablePlaceable);
                    function1.invoke(companion);
                    if (lookaheadCapablePlaceable != null) {
                        lookaheadCapablePlaceable.setPlacingForAlignment$ui_release(configureForPlacingForAlignment);
                    }
                    Placeable.PlacementScope.Companion companion4 = Placeable.PlacementScope.Companion;
                    Placeable.PlacementScope.parentWidth = parentWidth;
                    Placeable.PlacementScope.Companion companion5 = Placeable.PlacementScope.Companion;
                    Placeable.PlacementScope.parentLayoutDirection = parentLayoutDirection;
                    Placeable.PlacementScope._coordinates = layoutCoordinates;
                    Placeable.PlacementScope.layoutDelegate = layoutNodeLayoutDelegate;
                }
            };
        }
    }

    /* compiled from: MeasureScope.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean isLookingAhead(MeasureScope measureScope) {
            return IntrinsicMeasureScope.CC.$default$isLookingAhead(measureScope);
        }

        @Deprecated
        /* renamed from: roundToPx--R2X_6o  reason: not valid java name */
        public static int m4584roundToPxR2X_6o(MeasureScope measureScope, long j) {
            return Density.CC.m5569$default$roundToPxR2X_6o(measureScope, j);
        }

        @Deprecated
        /* renamed from: roundToPx-0680j_4  reason: not valid java name */
        public static int m4585roundToPx0680j_4(MeasureScope measureScope, float f) {
            return Density.CC.m5570$default$roundToPx0680j_4(measureScope, f);
        }

        @Deprecated
        /* renamed from: toDp-GaN1DYA  reason: not valid java name */
        public static float m4586toDpGaN1DYA(MeasureScope measureScope, long j) {
            return Density.CC.m5571$default$toDpGaN1DYA(measureScope, j);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM  reason: not valid java name */
        public static float m4587toDpu2uoSUM(MeasureScope measureScope, float f) {
            return Density.CC.m5572$default$toDpu2uoSUM(measureScope, f);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM  reason: not valid java name */
        public static float m4588toDpu2uoSUM(MeasureScope measureScope, int i) {
            return Density.CC.m5573$default$toDpu2uoSUM((Density) measureScope, i);
        }

        @Deprecated
        /* renamed from: toDpSize-k-rfVVM  reason: not valid java name */
        public static long m4589toDpSizekrfVVM(MeasureScope measureScope, long j) {
            return Density.CC.m5574$default$toDpSizekrfVVM(measureScope, j);
        }

        @Deprecated
        /* renamed from: toPx--R2X_6o  reason: not valid java name */
        public static float m4590toPxR2X_6o(MeasureScope measureScope, long j) {
            return Density.CC.m5575$default$toPxR2X_6o(measureScope, j);
        }

        @Deprecated
        /* renamed from: toPx-0680j_4  reason: not valid java name */
        public static float m4591toPx0680j_4(MeasureScope measureScope, float f) {
            return Density.CC.m5576$default$toPx0680j_4(measureScope, f);
        }

        @Deprecated
        public static Rect toRect(MeasureScope measureScope, DpRect receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return Density.CC.$default$toRect(measureScope, receiver);
        }

        @Deprecated
        /* renamed from: toSize-XkaWNTQ  reason: not valid java name */
        public static long m4592toSizeXkaWNTQ(MeasureScope measureScope, long j) {
            return Density.CC.m5577$default$toSizeXkaWNTQ(measureScope, j);
        }

        @Deprecated
        /* renamed from: toSp-0xMU5do  reason: not valid java name */
        public static long m4593toSp0xMU5do(MeasureScope measureScope, float f) {
            return Density.CC.m5578$default$toSp0xMU5do(measureScope, f);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
        public static long m4594toSpkPz2Gy4(MeasureScope measureScope, float f) {
            return Density.CC.m5579$default$toSpkPz2Gy4(measureScope, f);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
        public static long m4595toSpkPz2Gy4(MeasureScope measureScope, int i) {
            return Density.CC.m5580$default$toSpkPz2Gy4((Density) measureScope, i);
        }

        @Deprecated
        public static MeasureResult layout(MeasureScope measureScope, int i, int i2, Map<AlignmentLine, Integer> alignmentLines, Function1<? super Placeable.PlacementScope, Unit> placementBlock) {
            Intrinsics.checkNotNullParameter(alignmentLines, "alignmentLines");
            Intrinsics.checkNotNullParameter(placementBlock, "placementBlock");
            return CC.$default$layout(measureScope, i, i2, alignmentLines, placementBlock);
        }
    }
}
