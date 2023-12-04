package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Size.kt */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a-\u0010\u000b\u001a\u00020\f*\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0016\u0010\u0012\u001a\u00020\f*\u00020\f2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007\u001a\u0016\u0010\u0015\u001a\u00020\f*\u00020\f2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007\u001a\u0016\u0010\u0016\u001a\u00020\f*\u00020\f2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007\u001a!\u0010\u0017\u001a\u00020\f*\u00020\f2\u0006\u0010\u0017\u001a\u00020\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a-\u0010\u001a\u001a\u00020\f*\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u0011\u001a!\u0010\u001e\u001a\u00020\f*\u00020\f2\u0006\u0010\u0017\u001a\u00020\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010\u0019\u001a-\u0010 \u001a\u00020\f*\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\u0011\u001a!\u0010\"\u001a\u00020\f*\u00020\f2\u0006\u0010#\u001a\u00020\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010\u0019\u001a)\u0010\"\u001a\u00020\f*\u00020\f2\u0006\u0010%\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010\u0011\u001a!\u0010\"\u001a\u00020\f*\u00020\f2\u0006\u0010#\u001a\u00020'H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010)\u001aA\u0010*\u001a\u00020\f*\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010+\u001a\u00020\u000e2\b\b\u0002\u0010,\u001a\u00020\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010.\u001a!\u0010/\u001a\u00020\f*\u00020\f2\u0006\u0010%\u001a\u00020\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u0010\u0019\u001a-\u00101\u001a\u00020\f*\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u0010\u0011\u001a!\u0010#\u001a\u00020\f*\u00020\f2\u0006\u0010#\u001a\u00020\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b3\u0010\u0019\u001a)\u0010#\u001a\u00020\f*\u00020\f2\u0006\u0010%\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u0010\u0011\u001a!\u0010#\u001a\u00020\f*\u00020\f2\u0006\u0010#\u001a\u00020'H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b5\u0010)\u001aA\u00106\u001a\u00020\f*\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010+\u001a\u00020\u000e2\b\b\u0002\u0010,\u001a\u00020\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b7\u0010.\u001a!\u0010%\u001a\u00020\f*\u00020\f2\u0006\u0010%\u001a\u00020\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b8\u0010\u0019\u001a-\u00109\u001a\u00020\f*\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b:\u0010\u0011\u001a \u0010;\u001a\u00020\f*\u00020\f2\b\b\u0002\u0010<\u001a\u00020=2\b\b\u0002\u0010>\u001a\u00020?H\u0007\u001a \u0010@\u001a\u00020\f*\u00020\f2\b\b\u0002\u0010<\u001a\u00020A2\b\b\u0002\u0010>\u001a\u00020?H\u0007\u001a \u0010B\u001a\u00020\f*\u00020\f2\b\b\u0002\u0010<\u001a\u00020C2\b\b\u0002\u0010>\u001a\u00020?H\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006D"}, d2 = {"FillWholeMaxHeight", "Landroidx/compose/foundation/layout/FillElement;", "FillWholeMaxSize", "FillWholeMaxWidth", "WrapContentHeightCenter", "Landroidx/compose/foundation/layout/WrapContentElement;", "WrapContentHeightTop", "WrapContentSizeCenter", "WrapContentSizeTopStart", "WrapContentWidthCenter", "WrapContentWidthStart", "defaultMinSize", "Landroidx/compose/ui/Modifier;", "minWidth", "Landroidx/compose/ui/unit/Dp;", "minHeight", "defaultMinSize-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "fillMaxHeight", "fraction", "", "fillMaxSize", "fillMaxWidth", ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "height-3ABfNKs", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "heightIn", "min", "max", "heightIn-VpY3zN4", "requiredHeight", "requiredHeight-3ABfNKs", "requiredHeightIn", "requiredHeightIn-VpY3zN4", "requiredSize", "size", "requiredSize-3ABfNKs", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "requiredSize-VpY3zN4", "Landroidx/compose/ui/unit/DpSize;", "requiredSize-6HolHcs", "(Landroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;", "requiredSizeIn", "maxWidth", "maxHeight", "requiredSizeIn-qDBjuR0", "(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;", "requiredWidth", "requiredWidth-3ABfNKs", "requiredWidthIn", "requiredWidthIn-VpY3zN4", "size-3ABfNKs", "size-VpY3zN4", "size-6HolHcs", "sizeIn", "sizeIn-qDBjuR0", "width-3ABfNKs", "widthIn", "widthIn-VpY3zN4", "wrapContentHeight", "align", "Landroidx/compose/ui/Alignment$Vertical;", "unbounded", "", "wrapContentSize", "Landroidx/compose/ui/Alignment;", "wrapContentWidth", "Landroidx/compose/ui/Alignment$Horizontal;", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SizeKt {
    private static final FillElement FillWholeMaxWidth = FillElement.Companion.width(1.0f);
    private static final FillElement FillWholeMaxHeight = FillElement.Companion.height(1.0f);
    private static final FillElement FillWholeMaxSize = FillElement.Companion.size(1.0f);
    private static final WrapContentElement WrapContentWidthCenter = WrapContentElement.Companion.width(Alignment.Companion.getCenterHorizontally(), false);
    private static final WrapContentElement WrapContentWidthStart = WrapContentElement.Companion.width(Alignment.Companion.getStart(), false);
    private static final WrapContentElement WrapContentHeightCenter = WrapContentElement.Companion.height(Alignment.Companion.getCenterVertically(), false);
    private static final WrapContentElement WrapContentHeightTop = WrapContentElement.Companion.height(Alignment.Companion.getTop(), false);
    private static final WrapContentElement WrapContentSizeCenter = WrapContentElement.Companion.size(Alignment.Companion.getCenter(), false);
    private static final WrapContentElement WrapContentSizeTopStart = WrapContentElement.Companion.size(Alignment.Companion.getTopStart(), false);

    /* renamed from: width-3ABfNKs */
    public static final Modifier m800width3ABfNKs(Modifier width, float f) {
        Intrinsics.checkNotNullParameter(width, "$this$width");
        return width.then(new SizeElement(f, 0.0f, f, 0.0f, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new SizeKt$width3ABfNKs$$inlined$debugInspectorInfo$1(f) : InspectableValueKt.getNoInspectorInfo(), 10, null));
    }

    /* renamed from: height-3ABfNKs */
    public static final Modifier m781height3ABfNKs(Modifier height, float f) {
        Intrinsics.checkNotNullParameter(height, "$this$height");
        return height.then(new SizeElement(0.0f, f, 0.0f, f, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new SizeKt$height3ABfNKs$$inlined$debugInspectorInfo$1(f) : InspectableValueKt.getNoInspectorInfo(), 5, null));
    }

    /* renamed from: size-6HolHcs */
    public static final Modifier m796size6HolHcs(Modifier size, long j) {
        Intrinsics.checkNotNullParameter(size, "$this$size");
        return m797sizeVpY3zN4(size, DpSize.m5705getWidthD9Ej5fM(j), DpSize.m5703getHeightD9Ej5fM(j));
    }

    /* renamed from: widthIn-VpY3zN4$default */
    public static /* synthetic */ Modifier m802widthInVpY3zN4$default(Modifier modifier, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.Companion.m5627getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = Dp.Companion.m5627getUnspecifiedD9Ej5fM();
        }
        return m801widthInVpY3zN4(modifier, f, f2);
    }

    /* renamed from: widthIn-VpY3zN4 */
    public static final Modifier m801widthInVpY3zN4(Modifier widthIn, float f, float f2) {
        Intrinsics.checkNotNullParameter(widthIn, "$this$widthIn");
        return widthIn.then(new SizeElement(f, 0.0f, f2, 0.0f, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new SizeKt$widthInVpY3zN4$$inlined$debugInspectorInfo$1(f, f2) : InspectableValueKt.getNoInspectorInfo(), 10, null));
    }

    /* renamed from: heightIn-VpY3zN4$default */
    public static /* synthetic */ Modifier m783heightInVpY3zN4$default(Modifier modifier, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.Companion.m5627getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = Dp.Companion.m5627getUnspecifiedD9Ej5fM();
        }
        return m782heightInVpY3zN4(modifier, f, f2);
    }

    /* renamed from: heightIn-VpY3zN4 */
    public static final Modifier m782heightInVpY3zN4(Modifier heightIn, float f, float f2) {
        Intrinsics.checkNotNullParameter(heightIn, "$this$heightIn");
        return heightIn.then(new SizeElement(0.0f, f, 0.0f, f2, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new SizeKt$heightInVpY3zN4$$inlined$debugInspectorInfo$1(f, f2) : InspectableValueKt.getNoInspectorInfo(), 5, null));
    }

    /* renamed from: sizeIn-qDBjuR0$default */
    public static /* synthetic */ Modifier m799sizeInqDBjuR0$default(Modifier modifier, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.Companion.m5627getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = Dp.Companion.m5627getUnspecifiedD9Ej5fM();
        }
        if ((i & 4) != 0) {
            f3 = Dp.Companion.m5627getUnspecifiedD9Ej5fM();
        }
        if ((i & 8) != 0) {
            f4 = Dp.Companion.m5627getUnspecifiedD9Ej5fM();
        }
        return m798sizeInqDBjuR0(modifier, f, f2, f3, f4);
    }

    /* renamed from: sizeIn-qDBjuR0 */
    public static final Modifier m798sizeInqDBjuR0(Modifier sizeIn, float f, float f2, float f3, float f4) {
        Intrinsics.checkNotNullParameter(sizeIn, "$this$sizeIn");
        return sizeIn.then(new SizeElement(f, f2, f3, f4, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new SizeKt$sizeInqDBjuR0$$inlined$debugInspectorInfo$1(f, f2, f3, f4) : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: requiredWidth-3ABfNKs */
    public static final Modifier m792requiredWidth3ABfNKs(Modifier requiredWidth, float f) {
        Intrinsics.checkNotNullParameter(requiredWidth, "$this$requiredWidth");
        return requiredWidth.then(new SizeElement(f, 0.0f, f, 0.0f, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new SizeKt$requiredWidth3ABfNKs$$inlined$debugInspectorInfo$1(f) : InspectableValueKt.getNoInspectorInfo(), 10, null));
    }

    /* renamed from: requiredHeight-3ABfNKs */
    public static final Modifier m784requiredHeight3ABfNKs(Modifier requiredHeight, float f) {
        Intrinsics.checkNotNullParameter(requiredHeight, "$this$requiredHeight");
        return requiredHeight.then(new SizeElement(0.0f, f, 0.0f, f, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new SizeKt$requiredHeight3ABfNKs$$inlined$debugInspectorInfo$1(f) : InspectableValueKt.getNoInspectorInfo(), 5, null));
    }

    /* renamed from: requiredSize-6HolHcs */
    public static final Modifier m788requiredSize6HolHcs(Modifier requiredSize, long j) {
        Intrinsics.checkNotNullParameter(requiredSize, "$this$requiredSize");
        return m789requiredSizeVpY3zN4(requiredSize, DpSize.m5705getWidthD9Ej5fM(j), DpSize.m5703getHeightD9Ej5fM(j));
    }

    /* renamed from: requiredWidthIn-VpY3zN4$default */
    public static /* synthetic */ Modifier m794requiredWidthInVpY3zN4$default(Modifier modifier, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.Companion.m5627getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = Dp.Companion.m5627getUnspecifiedD9Ej5fM();
        }
        return m793requiredWidthInVpY3zN4(modifier, f, f2);
    }

    /* renamed from: requiredWidthIn-VpY3zN4 */
    public static final Modifier m793requiredWidthInVpY3zN4(Modifier requiredWidthIn, float f, float f2) {
        Intrinsics.checkNotNullParameter(requiredWidthIn, "$this$requiredWidthIn");
        return requiredWidthIn.then(new SizeElement(f, 0.0f, f2, 0.0f, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new SizeKt$requiredWidthInVpY3zN4$$inlined$debugInspectorInfo$1(f, f2) : InspectableValueKt.getNoInspectorInfo(), 10, null));
    }

    /* renamed from: requiredHeightIn-VpY3zN4$default */
    public static /* synthetic */ Modifier m786requiredHeightInVpY3zN4$default(Modifier modifier, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.Companion.m5627getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = Dp.Companion.m5627getUnspecifiedD9Ej5fM();
        }
        return m785requiredHeightInVpY3zN4(modifier, f, f2);
    }

    /* renamed from: requiredHeightIn-VpY3zN4 */
    public static final Modifier m785requiredHeightInVpY3zN4(Modifier requiredHeightIn, float f, float f2) {
        Intrinsics.checkNotNullParameter(requiredHeightIn, "$this$requiredHeightIn");
        return requiredHeightIn.then(new SizeElement(0.0f, f, 0.0f, f2, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new SizeKt$requiredHeightInVpY3zN4$$inlined$debugInspectorInfo$1(f, f2) : InspectableValueKt.getNoInspectorInfo(), 5, null));
    }

    /* renamed from: requiredSizeIn-qDBjuR0$default */
    public static /* synthetic */ Modifier m791requiredSizeInqDBjuR0$default(Modifier modifier, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.Companion.m5627getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = Dp.Companion.m5627getUnspecifiedD9Ej5fM();
        }
        if ((i & 4) != 0) {
            f3 = Dp.Companion.m5627getUnspecifiedD9Ej5fM();
        }
        if ((i & 8) != 0) {
            f4 = Dp.Companion.m5627getUnspecifiedD9Ej5fM();
        }
        return m790requiredSizeInqDBjuR0(modifier, f, f2, f3, f4);
    }

    /* renamed from: requiredSizeIn-qDBjuR0 */
    public static final Modifier m790requiredSizeInqDBjuR0(Modifier requiredSizeIn, float f, float f2, float f3, float f4) {
        Intrinsics.checkNotNullParameter(requiredSizeIn, "$this$requiredSizeIn");
        return requiredSizeIn.then(new SizeElement(f, f2, f3, f4, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new SizeKt$requiredSizeInqDBjuR0$$inlined$debugInspectorInfo$1(f, f2, f3, f4) : InspectableValueKt.getNoInspectorInfo(), null));
    }

    public static /* synthetic */ Modifier fillMaxWidth$default(Modifier modifier, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return fillMaxWidth(modifier, f);
    }

    public static final Modifier fillMaxWidth(Modifier modifier, float f) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return modifier.then((f > 1.0f ? 1 : (f == 1.0f ? 0 : -1)) == 0 ? FillWholeMaxWidth : FillElement.Companion.width(f));
    }

    public static /* synthetic */ Modifier fillMaxHeight$default(Modifier modifier, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return fillMaxHeight(modifier, f);
    }

    public static final Modifier fillMaxHeight(Modifier modifier, float f) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return modifier.then((f > 1.0f ? 1 : (f == 1.0f ? 0 : -1)) == 0 ? FillWholeMaxHeight : FillElement.Companion.height(f));
    }

    public static /* synthetic */ Modifier fillMaxSize$default(Modifier modifier, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return fillMaxSize(modifier, f);
    }

    public static final Modifier fillMaxSize(Modifier modifier, float f) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return modifier.then((f > 1.0f ? 1 : (f == 1.0f ? 0 : -1)) == 0 ? FillWholeMaxSize : FillElement.Companion.size(f));
    }

    public static /* synthetic */ Modifier wrapContentWidth$default(Modifier modifier, Alignment.Horizontal horizontal, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            horizontal = Alignment.Companion.getCenterHorizontally();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return wrapContentWidth(modifier, horizontal, z);
    }

    public static final Modifier wrapContentWidth(Modifier modifier, Alignment.Horizontal align, boolean z) {
        WrapContentElement width;
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(align, "align");
        if (Intrinsics.areEqual(align, Alignment.Companion.getCenterHorizontally()) && !z) {
            width = WrapContentWidthCenter;
        } else if (Intrinsics.areEqual(align, Alignment.Companion.getStart()) && !z) {
            width = WrapContentWidthStart;
        } else {
            width = WrapContentElement.Companion.width(align, z);
        }
        return modifier.then(width);
    }

    public static /* synthetic */ Modifier wrapContentHeight$default(Modifier modifier, Alignment.Vertical vertical, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            vertical = Alignment.Companion.getCenterVertically();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return wrapContentHeight(modifier, vertical, z);
    }

    public static final Modifier wrapContentHeight(Modifier modifier, Alignment.Vertical align, boolean z) {
        WrapContentElement height;
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(align, "align");
        if (Intrinsics.areEqual(align, Alignment.Companion.getCenterVertically()) && !z) {
            height = WrapContentHeightCenter;
        } else if (Intrinsics.areEqual(align, Alignment.Companion.getTop()) && !z) {
            height = WrapContentHeightTop;
        } else {
            height = WrapContentElement.Companion.height(align, z);
        }
        return modifier.then(height);
    }

    public static /* synthetic */ Modifier wrapContentSize$default(Modifier modifier, Alignment alignment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            alignment = Alignment.Companion.getCenter();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return wrapContentSize(modifier, alignment, z);
    }

    public static final Modifier wrapContentSize(Modifier modifier, Alignment align, boolean z) {
        WrapContentElement size;
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(align, "align");
        if (Intrinsics.areEqual(align, Alignment.Companion.getCenter()) && !z) {
            size = WrapContentSizeCenter;
        } else if (Intrinsics.areEqual(align, Alignment.Companion.getTopStart()) && !z) {
            size = WrapContentSizeTopStart;
        } else {
            size = WrapContentElement.Companion.size(align, z);
        }
        return modifier.then(size);
    }

    /* renamed from: defaultMinSize-VpY3zN4$default */
    public static /* synthetic */ Modifier m780defaultMinSizeVpY3zN4$default(Modifier modifier, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.Companion.m5627getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = Dp.Companion.m5627getUnspecifiedD9Ej5fM();
        }
        return m779defaultMinSizeVpY3zN4(modifier, f, f2);
    }

    /* renamed from: defaultMinSize-VpY3zN4 */
    public static final Modifier m779defaultMinSizeVpY3zN4(Modifier defaultMinSize, float f, float f2) {
        Intrinsics.checkNotNullParameter(defaultMinSize, "$this$defaultMinSize");
        return defaultMinSize.then(new UnspecifiedConstraintsElement(f, f2, null));
    }

    /* renamed from: size-3ABfNKs */
    public static final Modifier m795size3ABfNKs(Modifier size, float f) {
        Intrinsics.checkNotNullParameter(size, "$this$size");
        return size.then(new SizeElement(f, f, f, f, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new SizeKt$size3ABfNKs$$inlined$debugInspectorInfo$1(f) : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: size-VpY3zN4 */
    public static final Modifier m797sizeVpY3zN4(Modifier size, float f, float f2) {
        Intrinsics.checkNotNullParameter(size, "$this$size");
        return size.then(new SizeElement(f, f2, f, f2, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new SizeKt$sizeVpY3zN4$$inlined$debugInspectorInfo$1(f, f2) : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: requiredSize-3ABfNKs */
    public static final Modifier m787requiredSize3ABfNKs(Modifier requiredSize, float f) {
        Intrinsics.checkNotNullParameter(requiredSize, "$this$requiredSize");
        return requiredSize.then(new SizeElement(f, f, f, f, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new SizeKt$requiredSize3ABfNKs$$inlined$debugInspectorInfo$1(f) : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: requiredSize-VpY3zN4 */
    public static final Modifier m789requiredSizeVpY3zN4(Modifier requiredSize, float f, float f2) {
        Intrinsics.checkNotNullParameter(requiredSize, "$this$requiredSize");
        return requiredSize.then(new SizeElement(f, f2, f, f2, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new SizeKt$requiredSizeVpY3zN4$$inlined$debugInspectorInfo$1(f, f2) : InspectableValueKt.getNoInspectorInfo(), null));
    }
}
