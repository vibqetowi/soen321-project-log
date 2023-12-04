package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Brush.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001BD\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0002\u0010\fJ!\u0010\u0013\u001a\u00060\u0014j\u0002`\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000R\u0019\u0010\t\u001a\u00020\bX\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\rR\u001d\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0007\u001a\u00020\bX\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\rR\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\n\u001a\u00020\u000bX\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0012\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/compose/ui/graphics/LinearGradient;", "Landroidx/compose/ui/graphics/ShaderBrush;", "colors", "", "Landroidx/compose/ui/graphics/Color;", "stops", "", TtmlNode.START, "Landroidx/compose/ui/geometry/Offset;", TtmlNode.END, "tileMode", "Landroidx/compose/ui/graphics/TileMode;", "(Ljava/util/List;Ljava/util/List;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "intrinsicSize", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "()J", "I", "createShader", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "size", "createShader-uvyYCjk", "(J)Landroid/graphics/Shader;", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LinearGradient extends ShaderBrush {
    private final List<Color> colors;
    private final long end;
    private final long start;
    private final List<Float> stops;
    private final int tileMode;

    public /* synthetic */ LinearGradient(List list, List list2, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, j, j2, i);
    }

    public /* synthetic */ LinearGradient(List list, List list2, long j, long j2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i2 & 2) != 0 ? null : list2, j, j2, (i2 & 16) != 0 ? TileMode.Companion.m3664getClamp3opZhB0() : i, null);
    }

    private LinearGradient(List<Color> colors, List<Float> list, long j, long j2, int i) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        this.colors = colors;
        this.stops = list;
        this.start = j;
        this.end = j2;
        this.tileMode = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    @Override // androidx.compose.ui.graphics.Brush
    /* renamed from: getIntrinsicSize-NH-jbRc */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long mo3239getIntrinsicSizeNHjbRc() {
        float f;
        float m3019getYimpl;
        float m3018getXimpl = Offset.m3018getXimpl(this.start);
        boolean z = true;
        float f2 = Float.NaN;
        if ((Float.isInfinite(m3018getXimpl) || Float.isNaN(m3018getXimpl)) ? false : true) {
            float m3018getXimpl2 = Offset.m3018getXimpl(this.end);
            if ((Float.isInfinite(m3018getXimpl2) || Float.isNaN(m3018getXimpl2)) ? false : true) {
                f = Math.abs(Offset.m3018getXimpl(this.start) - Offset.m3018getXimpl(this.end));
                m3019getYimpl = Offset.m3019getYimpl(this.start);
                if (Float.isInfinite(m3019getYimpl) && !Float.isNaN(m3019getYimpl)) {
                    float m3019getYimpl2 = Offset.m3019getYimpl(this.end);
                    if (Float.isInfinite(m3019getYimpl2) || Float.isNaN(m3019getYimpl2)) {
                        z = false;
                    }
                    if (z) {
                        f2 = Math.abs(Offset.m3019getYimpl(this.start) - Offset.m3019getYimpl(this.end));
                    }
                }
                return SizeKt.Size(f, f2);
            }
        }
        f = Float.NaN;
        m3019getYimpl = Offset.m3019getYimpl(this.start);
        if (Float.isInfinite(m3019getYimpl) && !Float.isNaN(m3019getYimpl)) {
        }
        return SizeKt.Size(f, f2);
    }

    @Override // androidx.compose.ui.graphics.ShaderBrush
    /* renamed from: createShader-uvyYCjk */
    public Shader mo3260createShaderuvyYCjk(long j) {
        return ShaderKt.m3606LinearGradientShaderVjE6UOU(OffsetKt.Offset((Offset.m3018getXimpl(this.start) > Float.POSITIVE_INFINITY ? 1 : (Offset.m3018getXimpl(this.start) == Float.POSITIVE_INFINITY ? 0 : -1)) == 0 ? Size.m3087getWidthimpl(j) : Offset.m3018getXimpl(this.start), (Offset.m3019getYimpl(this.start) > Float.POSITIVE_INFINITY ? 1 : (Offset.m3019getYimpl(this.start) == Float.POSITIVE_INFINITY ? 0 : -1)) == 0 ? Size.m3084getHeightimpl(j) : Offset.m3019getYimpl(this.start)), OffsetKt.Offset((Offset.m3018getXimpl(this.end) > Float.POSITIVE_INFINITY ? 1 : (Offset.m3018getXimpl(this.end) == Float.POSITIVE_INFINITY ? 0 : -1)) == 0 ? Size.m3087getWidthimpl(j) : Offset.m3018getXimpl(this.end), Offset.m3019getYimpl(this.end) == Float.POSITIVE_INFINITY ? Size.m3084getHeightimpl(j) : Offset.m3019getYimpl(this.end)), this.colors, this.stops, this.tileMode);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LinearGradient) {
            LinearGradient linearGradient = (LinearGradient) obj;
            return Intrinsics.areEqual(this.colors, linearGradient.colors) && Intrinsics.areEqual(this.stops, linearGradient.stops) && Offset.m3015equalsimpl0(this.start, linearGradient.start) && Offset.m3015equalsimpl0(this.end, linearGradient.end) && TileMode.m3660equalsimpl0(this.tileMode, linearGradient.tileMode);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.colors.hashCode() * 31;
        List<Float> list = this.stops;
        return ((((((hashCode + (list != null ? list.hashCode() : 0)) * 31) + Offset.m3020hashCodeimpl(this.start)) * 31) + Offset.m3020hashCodeimpl(this.end)) * 31) + TileMode.m3661hashCodeimpl(this.tileMode);
    }

    public String toString() {
        String str;
        String str2 = "";
        if (OffsetKt.m3035isFinitek4lQ0M(this.start)) {
            str = "start=" + ((Object) Offset.m3026toStringimpl(this.start)) + ", ";
        } else {
            str = "";
        }
        if (OffsetKt.m3035isFinitek4lQ0M(this.end)) {
            str2 = "end=" + ((Object) Offset.m3026toStringimpl(this.end)) + ", ";
        }
        return "LinearGradient(colors=" + this.colors + ", stops=" + this.stops + ", " + str + str2 + "tileMode=" + ((Object) TileMode.m3662toStringimpl(this.tileMode)) + ')';
    }
}
