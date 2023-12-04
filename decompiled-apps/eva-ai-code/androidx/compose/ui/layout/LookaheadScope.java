package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: LookaheadScope.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001Jg\u0010\u0007\u001a\u00020\b*\u00020\b2V\u0010\t\u001aR\u0012\u0004\u0012\u00020\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\n¢\u0006\u0002\b\u0015H\u0017ø\u0001\u0000J$\u0010\u0016\u001a\u00020\u0017*\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0003H\u0016ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJD\u0010\u001b\u001a\u00020\b*\u00020\b26\u0010\u001b\u001a2\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u001f0\u001cH'J\f\u0010 \u001a\u00020\u0003*\u00020\u0003H&R\u0016\u0010\u0002\u001a\u00020\u0003*\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006ø\u0001\u0003\u0082\u0002\u0015\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006!À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/LookaheadScope;", "", "lookaheadScopeCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "getLookaheadScopeCoordinates", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)Landroidx/compose/ui/layout/LayoutCoordinates;", "intermediateLayout", "Landroidx/compose/ui/Modifier;", "measure", "Lkotlin/Function4;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Lkotlin/ParameterName;", "name", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/unit/IntSize;", "lookaheadSize", "Landroidx/compose/ui/layout/MeasureResult;", "Lkotlin/ExtensionFunctionType;", "localLookaheadPositionOf", "Landroidx/compose/ui/geometry/Offset;", "coordinates", "localLookaheadPositionOf-dBAh8RU", "(Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/layout/LayoutCoordinates;)J", "onPlaced", "Lkotlin/Function2;", "Landroidx/compose/ui/layout/LookaheadLayoutCoordinates;", "layoutCoordinates", "", "toLookaheadCoordinates", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface LookaheadScope {
    LayoutCoordinates getLookaheadScopeCoordinates(Placeable.PlacementScope placementScope);

    @Deprecated(message = "", replaceWith = @ReplaceWith(expression = "intermediateLayout { measurable, constraints ->measure.invoke(this, measurable, constraints, lookaheadSize)}", imports = {}))
    Modifier intermediateLayout(Modifier modifier, Function4<? super MeasureScope, ? super Measurable, ? super Constraints, ? super IntSize, ? extends MeasureResult> function4);

    /* renamed from: localLookaheadPositionOf-dBAh8RU */
    long mo4549localLookaheadPositionOfdBAh8RU(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2);

    @Deprecated(message = "onPlaced in LookaheadLayoutScope has been deprecated. It's replaced with reading LookaheadLayoutCoordinates directly during placement in IntermediateMeasureScope. See example below.")
    Modifier onPlaced(Modifier modifier, Function2<? super LookaheadLayoutCoordinates, ? super LookaheadLayoutCoordinates, Unit> function2);

    LayoutCoordinates toLookaheadCoordinates(LayoutCoordinates layoutCoordinates);

    /* compiled from: LookaheadScope.kt */
    /* renamed from: androidx.compose.ui.layout.LookaheadScope$-CC  reason: invalid class name */
    /* loaded from: classes3.dex */
    public final /* synthetic */ class CC {
        /* renamed from: $default$localLookaheadPositionOf-dBAh8RU  reason: not valid java name */
        public static long m4570$default$localLookaheadPositionOfdBAh8RU(LookaheadScope _this, LayoutCoordinates localLookaheadPositionOf, LayoutCoordinates coordinates) {
            Intrinsics.checkNotNullParameter(localLookaheadPositionOf, "$this$localLookaheadPositionOf");
            Intrinsics.checkNotNullParameter(coordinates, "coordinates");
            return _this.toLookaheadCoordinates(localLookaheadPositionOf).mo4553localPositionOfR5De75A(_this.toLookaheadCoordinates(coordinates), Offset.Companion.m3034getZeroF1C5BW0());
        }

        @Deprecated(message = "", replaceWith = @ReplaceWith(expression = "intermediateLayout { measurable, constraints ->measure.invoke(this, measurable, constraints, lookaheadSize)}", imports = {}))
        public static Modifier $default$intermediateLayout(LookaheadScope _this, Modifier modifier, Function4 measure) {
            Intrinsics.checkNotNullParameter(modifier, "<this>");
            Intrinsics.checkNotNullParameter(measure, "measure");
            return LookaheadScopeKt.intermediateLayout(modifier, new LookaheadScope$intermediateLayout$1(measure));
        }
    }
}
