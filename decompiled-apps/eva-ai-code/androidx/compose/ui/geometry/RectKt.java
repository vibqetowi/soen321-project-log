package androidx.compose.ui.geometry;

import androidx.compose.ui.util.MathHelpersKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Rect.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u0006\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a \u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\rH\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Rect", "Landroidx/compose/ui/geometry/Rect;", "topLeft", "Landroidx/compose/ui/geometry/Offset;", "bottomRight", "Rect-0a9Yr6o", "(JJ)Landroidx/compose/ui/geometry/Rect;", TypedValues.CycleType.S_WAVE_OFFSET, "size", "Landroidx/compose/ui/geometry/Size;", "Rect-tz77jQw", TtmlNode.CENTER, "radius", "", "Rect-3MmeM6k", "(JF)Landroidx/compose/ui/geometry/Rect;", "lerp", TtmlNode.START, "stop", "fraction", "ui-geometry_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RectKt {
    /* renamed from: Rect-tz77jQw  reason: not valid java name */
    public static final Rect m3058Recttz77jQw(long j, long j2) {
        return new Rect(Offset.m3018getXimpl(j), Offset.m3019getYimpl(j), Offset.m3018getXimpl(j) + Size.m3087getWidthimpl(j2), Offset.m3019getYimpl(j) + Size.m3084getHeightimpl(j2));
    }

    /* renamed from: Rect-0a9Yr6o  reason: not valid java name */
    public static final Rect m3056Rect0a9Yr6o(long j, long j2) {
        return new Rect(Offset.m3018getXimpl(j), Offset.m3019getYimpl(j), Offset.m3018getXimpl(j2), Offset.m3019getYimpl(j2));
    }

    /* renamed from: Rect-3MmeM6k  reason: not valid java name */
    public static final Rect m3057Rect3MmeM6k(long j, float f) {
        return new Rect(Offset.m3018getXimpl(j) - f, Offset.m3019getYimpl(j) - f, Offset.m3018getXimpl(j) + f, Offset.m3019getYimpl(j) + f);
    }

    public static final Rect lerp(Rect start, Rect stop, float f) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        return new Rect(MathHelpersKt.lerp(start.getLeft(), stop.getLeft(), f), MathHelpersKt.lerp(start.getTop(), stop.getTop(), f), MathHelpersKt.lerp(start.getRight(), stop.getRight(), f), MathHelpersKt.lerp(start.getBottom(), stop.getBottom(), f));
    }
}
