package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Padding.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a)\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u001a=\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001aA\u0010\u0010\u001a\u00020\u0011*\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001c\u0010\u0016\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0018H\u0007ø\u0001\u0001¢\u0006\u0002\u0010\u0019\u001a\u001c\u0010\u001a\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0018H\u0007ø\u0001\u0001¢\u0006\u0002\u0010\u0019\u001a\u0014\u0010\u001b\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0001H\u0007\u001a!\u0010\u001b\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001a-\u0010\u001b\u001a\u00020\u0011*\u00020\u00112\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 \u001aA\u0010\u001b\u001a\u00020\u0011*\u00020\u00112\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\""}, d2 = {"PaddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", TtmlNode.COMBINE_ALL, "Landroidx/compose/ui/unit/Dp;", "PaddingValues-0680j_4", "(F)Landroidx/compose/foundation/layout/PaddingValues;", "horizontal", "vertical", "PaddingValues-YgX7TsA", "(FF)Landroidx/compose/foundation/layout/PaddingValues;", TtmlNode.START, ViewHierarchyConstants.DIMENSION_TOP_KEY, TtmlNode.END, "bottom", "PaddingValues-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "absolutePadding", "Landroidx/compose/ui/Modifier;", "left", TtmlNode.RIGHT, "absolutePadding-qDBjuR0", "(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;", "calculateEndPadding", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/unit/LayoutDirection;)F", "calculateStartPadding", "padding", "paddingValues", "padding-3ABfNKs", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "padding-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "padding-qDBjuR0", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PaddingKt {
    /* renamed from: padding-qDBjuR0  reason: not valid java name */
    public static final Modifier m751paddingqDBjuR0(Modifier padding, float f, float f2, float f3, float f4) {
        Intrinsics.checkNotNullParameter(padding, "$this$padding");
        return padding.then(new PaddingElement(f, f2, f3, f4, true, new PaddingKt$padding$1(f, f2, f3, f4), null));
    }

    /* renamed from: padding-VpY3zN4  reason: not valid java name */
    public static final Modifier m749paddingVpY3zN4(Modifier padding, float f, float f2) {
        Intrinsics.checkNotNullParameter(padding, "$this$padding");
        return padding.then(new PaddingElement(f, f2, f, f2, true, new PaddingKt$padding$2(f, f2), null));
    }

    /* renamed from: padding-3ABfNKs  reason: not valid java name */
    public static final Modifier m748padding3ABfNKs(Modifier padding, float f) {
        Intrinsics.checkNotNullParameter(padding, "$this$padding");
        return padding.then(new PaddingElement(f, f, f, f, true, new PaddingKt$padding$3(f), null));
    }

    public static final Modifier padding(Modifier modifier, PaddingValues paddingValues) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        return modifier.then(new PaddingValuesElement(paddingValues, new PaddingKt$padding$4(paddingValues)));
    }

    /* renamed from: absolutePadding-qDBjuR0  reason: not valid java name */
    public static final Modifier m746absolutePaddingqDBjuR0(Modifier absolutePadding, float f, float f2, float f3, float f4) {
        Intrinsics.checkNotNullParameter(absolutePadding, "$this$absolutePadding");
        return absolutePadding.then(new PaddingElement(f, f2, f3, f4, false, new PaddingKt$absolutePadding$1(f, f2, f3, f4), null));
    }

    public static final float calculateStartPadding(PaddingValues paddingValues, LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(paddingValues, "<this>");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        if (layoutDirection == LayoutDirection.Ltr) {
            return paddingValues.mo698calculateLeftPaddingu2uoSUM(layoutDirection);
        }
        return paddingValues.mo699calculateRightPaddingu2uoSUM(layoutDirection);
    }

    public static final float calculateEndPadding(PaddingValues paddingValues, LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(paddingValues, "<this>");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        if (layoutDirection == LayoutDirection.Ltr) {
            return paddingValues.mo699calculateRightPaddingu2uoSUM(layoutDirection);
        }
        return paddingValues.mo698calculateLeftPaddingu2uoSUM(layoutDirection);
    }

    /* renamed from: PaddingValues-0680j_4  reason: not valid java name */
    public static final PaddingValues m741PaddingValues0680j_4(float f) {
        return new PaddingValuesImpl(f, f, f, f, null);
    }

    /* renamed from: PaddingValues-YgX7TsA  reason: not valid java name */
    public static final PaddingValues m742PaddingValuesYgX7TsA(float f, float f2) {
        return new PaddingValuesImpl(f, f2, f, f2, null);
    }

    /* renamed from: PaddingValues-a9UjIt4  reason: not valid java name */
    public static final PaddingValues m744PaddingValuesa9UjIt4(float f, float f2, float f3, float f4) {
        return new PaddingValuesImpl(f, f2, f3, f4, null);
    }

    /* renamed from: padding-qDBjuR0$default  reason: not valid java name */
    public static /* synthetic */ Modifier m752paddingqDBjuR0$default(Modifier modifier, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.m5607constructorimpl(0);
        }
        if ((i & 2) != 0) {
            f2 = Dp.m5607constructorimpl(0);
        }
        if ((i & 4) != 0) {
            f3 = Dp.m5607constructorimpl(0);
        }
        if ((i & 8) != 0) {
            f4 = Dp.m5607constructorimpl(0);
        }
        return m751paddingqDBjuR0(modifier, f, f2, f3, f4);
    }

    /* renamed from: padding-VpY3zN4$default  reason: not valid java name */
    public static /* synthetic */ Modifier m750paddingVpY3zN4$default(Modifier modifier, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.m5607constructorimpl(0);
        }
        if ((i & 2) != 0) {
            f2 = Dp.m5607constructorimpl(0);
        }
        return m749paddingVpY3zN4(modifier, f, f2);
    }

    /* renamed from: absolutePadding-qDBjuR0$default  reason: not valid java name */
    public static /* synthetic */ Modifier m747absolutePaddingqDBjuR0$default(Modifier modifier, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.m5607constructorimpl(0);
        }
        if ((i & 2) != 0) {
            f2 = Dp.m5607constructorimpl(0);
        }
        if ((i & 4) != 0) {
            f3 = Dp.m5607constructorimpl(0);
        }
        if ((i & 8) != 0) {
            f4 = Dp.m5607constructorimpl(0);
        }
        return m746absolutePaddingqDBjuR0(modifier, f, f2, f3, f4);
    }

    /* renamed from: PaddingValues-YgX7TsA$default  reason: not valid java name */
    public static /* synthetic */ PaddingValues m743PaddingValuesYgX7TsA$default(float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.m5607constructorimpl(0);
        }
        if ((i & 2) != 0) {
            f2 = Dp.m5607constructorimpl(0);
        }
        return m742PaddingValuesYgX7TsA(f, f2);
    }

    /* renamed from: PaddingValues-a9UjIt4$default  reason: not valid java name */
    public static /* synthetic */ PaddingValues m745PaddingValuesa9UjIt4$default(float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.m5607constructorimpl(0);
        }
        if ((i & 2) != 0) {
            f2 = Dp.m5607constructorimpl(0);
        }
        if ((i & 4) != 0) {
            f3 = Dp.m5607constructorimpl(0);
        }
        if ((i & 8) != 0) {
            f4 = Dp.m5607constructorimpl(0);
        }
        return m744PaddingValuesa9UjIt4(f, f2, f3, f4);
    }
}
