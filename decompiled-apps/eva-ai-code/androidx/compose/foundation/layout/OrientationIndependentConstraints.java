package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: RowColumnImpl.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081@\u0018\u00002\u00020\u0001B,\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bB\u001c\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\rB\u0014\b\u0002\u0012\u0006\u0010\u000e\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u000fJ>\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0011J\u0015\u0010 \u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b$\u0010\"J\u0016\u0010%\u001a\u00020\u0000ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010\u000fJ\u001e\u0010'\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010\rJ\u0010\u0010)\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,R\u0012\u0010\u0006\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0005\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011R\u0012\u0010\u0004\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0012\u0010\u0002\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0011R\u0019\u0010\u000e\u001a\u00020\nX\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0015\u0088\u0001\u000e\u0092\u0001\u00020\nø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006-"}, d2 = {"Landroidx/compose/foundation/layout/OrientationIndependentConstraints;", "", "mainAxisMin", "", "mainAxisMax", "crossAxisMin", "crossAxisMax", "constructor-impl", "(IIII)J", "c", "Landroidx/compose/ui/unit/Constraints;", "orientation", "Landroidx/compose/foundation/layout/LayoutOrientation;", "(JLandroidx/compose/foundation/layout/LayoutOrientation;)J", "value", "(J)J", "getCrossAxisMax-impl", "(J)I", "getCrossAxisMin-impl", "getMainAxisMax-impl", "getMainAxisMin-impl", "J", "copy", "copy-yUG9Ft0", "(JIIII)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "maxHeight", "maxHeight-impl", "(JLandroidx/compose/foundation/layout/LayoutOrientation;)I", "maxWidth", "maxWidth-impl", "stretchCrossAxis", "stretchCrossAxis-q4ezo7Y", "toBoxConstraints", "toBoxConstraints-OenEA2s", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@JvmInline
/* loaded from: classes.dex */
public final class OrientationIndependentConstraints {
    private final long value;

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ OrientationIndependentConstraints m714boximpl(long j) {
        return new OrientationIndependentConstraints(j);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    private static long m716constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m720equalsimpl(long j, Object obj) {
        return (obj instanceof OrientationIndependentConstraints) && Constraints.m5544equalsimpl0(j, ((OrientationIndependentConstraints) obj).m732unboximpl());
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m721equalsimpl0(long j, long j2) {
        return Constraints.m5544equalsimpl0(j, j2);
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m726hashCodeimpl(long j) {
        return Constraints.m5554hashCodeimpl(j);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m731toStringimpl(long j) {
        return "OrientationIndependentConstraints(value=" + ((Object) Constraints.m5556toStringimpl(j)) + ')';
    }

    public boolean equals(Object obj) {
        return m720equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m726hashCodeimpl(this.value);
    }

    public String toString() {
        return m731toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m732unboximpl() {
        return this.value;
    }

    private /* synthetic */ OrientationIndependentConstraints(long j) {
        this.value = j;
    }

    /* renamed from: getMainAxisMin-impl  reason: not valid java name */
    public static final int m725getMainAxisMinimpl(long j) {
        return Constraints.m5553getMinWidthimpl(j);
    }

    /* renamed from: getMainAxisMax-impl  reason: not valid java name */
    public static final int m724getMainAxisMaximpl(long j) {
        return Constraints.m5551getMaxWidthimpl(j);
    }

    /* renamed from: getCrossAxisMin-impl  reason: not valid java name */
    public static final int m723getCrossAxisMinimpl(long j) {
        return Constraints.m5552getMinHeightimpl(j);
    }

    /* renamed from: getCrossAxisMax-impl  reason: not valid java name */
    public static final int m722getCrossAxisMaximpl(long j) {
        return Constraints.m5550getMaxHeightimpl(j);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m715constructorimpl(int i, int i2, int i3, int i4) {
        return m716constructorimpl(ConstraintsKt.Constraints(i, i2, i3, i4));
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m717constructorimpl(long j, LayoutOrientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return m715constructorimpl(orientation == LayoutOrientation.Horizontal ? Constraints.m5553getMinWidthimpl(j) : Constraints.m5552getMinHeightimpl(j), orientation == LayoutOrientation.Horizontal ? Constraints.m5551getMaxWidthimpl(j) : Constraints.m5550getMaxHeightimpl(j), orientation == LayoutOrientation.Horizontal ? Constraints.m5552getMinHeightimpl(j) : Constraints.m5553getMinWidthimpl(j), orientation == LayoutOrientation.Horizontal ? Constraints.m5550getMaxHeightimpl(j) : Constraints.m5551getMaxWidthimpl(j));
    }

    /* renamed from: toBoxConstraints-OenEA2s  reason: not valid java name */
    public static final long m730toBoxConstraintsOenEA2s(long j, LayoutOrientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        if (orientation == LayoutOrientation.Horizontal) {
            return ConstraintsKt.Constraints(Constraints.m5553getMinWidthimpl(j), Constraints.m5551getMaxWidthimpl(j), Constraints.m5552getMinHeightimpl(j), Constraints.m5550getMaxHeightimpl(j));
        }
        return ConstraintsKt.Constraints(Constraints.m5552getMinHeightimpl(j), Constraints.m5550getMaxHeightimpl(j), Constraints.m5553getMinWidthimpl(j), Constraints.m5551getMaxWidthimpl(j));
    }

    /* renamed from: maxWidth-impl  reason: not valid java name */
    public static final int m728maxWidthimpl(long j, LayoutOrientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        if (orientation == LayoutOrientation.Horizontal) {
            return Constraints.m5551getMaxWidthimpl(j);
        }
        return Constraints.m5550getMaxHeightimpl(j);
    }

    /* renamed from: maxHeight-impl  reason: not valid java name */
    public static final int m727maxHeightimpl(long j, LayoutOrientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        if (orientation == LayoutOrientation.Horizontal) {
            return Constraints.m5550getMaxHeightimpl(j);
        }
        return Constraints.m5551getMaxWidthimpl(j);
    }

    /* renamed from: copy-yUG9Ft0  reason: not valid java name */
    public static final long m718copyyUG9Ft0(long j, int i, int i2, int i3, int i4) {
        return m715constructorimpl(i, i2, i3, i4);
    }

    /* renamed from: stretchCrossAxis-q4ezo7Y  reason: not valid java name */
    public static final long m729stretchCrossAxisq4ezo7Y(long j) {
        return m715constructorimpl(Constraints.m5553getMinWidthimpl(j), Constraints.m5551getMaxWidthimpl(j), Constraints.m5550getMaxHeightimpl(j) != Integer.MAX_VALUE ? Constraints.m5550getMaxHeightimpl(j) : Constraints.m5552getMinHeightimpl(j), Constraints.m5550getMaxHeightimpl(j));
    }

    /* renamed from: copy-yUG9Ft0$default  reason: not valid java name */
    public static /* synthetic */ long m719copyyUG9Ft0$default(long j, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = Constraints.m5553getMinWidthimpl(j);
        }
        int i6 = i;
        if ((i5 & 2) != 0) {
            i2 = Constraints.m5551getMaxWidthimpl(j);
        }
        int i7 = i2;
        if ((i5 & 4) != 0) {
            i3 = Constraints.m5552getMinHeightimpl(j);
        }
        int i8 = i3;
        if ((i5 & 8) != 0) {
            i4 = Constraints.m5550getMaxHeightimpl(j);
        }
        return m718copyyUG9Ft0(j, i6, i7, i8, i4);
    }
}
