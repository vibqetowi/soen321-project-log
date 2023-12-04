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
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001BD\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0002\u0010\fJ!\u0010\u0013\u001a\u00060\u0014j\u0002`\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016R\u0019\u0010\u0007\u001a\u00020\bX\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\rR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000R\u001d\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\n\u001a\u00020\u000bX\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0012\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/compose/ui/graphics/RadialGradient;", "Landroidx/compose/ui/graphics/ShaderBrush;", "colors", "", "Landroidx/compose/ui/graphics/Color;", "stops", "", TtmlNode.CENTER, "Landroidx/compose/ui/geometry/Offset;", "radius", "tileMode", "Landroidx/compose/ui/graphics/TileMode;", "(Ljava/util/List;Ljava/util/List;JFILkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "intrinsicSize", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "()J", "I", "createShader", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "size", "createShader-uvyYCjk", "(J)Landroid/graphics/Shader;", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RadialGradient extends ShaderBrush {
    private final long center;
    private final List<Color> colors;
    private final float radius;
    private final List<Float> stops;
    private final int tileMode;

    public /* synthetic */ RadialGradient(List list, List list2, long j, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, j, f, i);
    }

    public /* synthetic */ RadialGradient(List list, List list2, long j, float f, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i2 & 2) != 0 ? null : list2, j, f, (i2 & 16) != 0 ? TileMode.Companion.m3664getClamp3opZhB0() : i, null);
    }

    private RadialGradient(List<Color> colors, List<Float> list, long j, float f, int i) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        this.colors = colors;
        this.stops = list;
        this.center = j;
        this.radius = f;
        this.tileMode = i;
    }

    @Override // androidx.compose.ui.graphics.Brush
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo3239getIntrinsicSizeNHjbRc() {
        float f = this.radius;
        if ((Float.isInfinite(f) || Float.isNaN(f)) ? false : true) {
            float f2 = this.radius;
            float f3 = 2;
            return SizeKt.Size(f2 * f3, f2 * f3);
        }
        return Size.Companion.m3095getUnspecifiedNHjbRc();
    }

    @Override // androidx.compose.ui.graphics.ShaderBrush
    /* renamed from: createShader-uvyYCjk */
    public Shader mo3260createShaderuvyYCjk(long j) {
        float m3087getWidthimpl;
        float m3084getHeightimpl;
        if (OffsetKt.m3039isUnspecifiedk4lQ0M(this.center)) {
            long m3097getCenteruvyYCjk = SizeKt.m3097getCenteruvyYCjk(j);
            m3087getWidthimpl = Offset.m3018getXimpl(m3097getCenteruvyYCjk);
            m3084getHeightimpl = Offset.m3019getYimpl(m3097getCenteruvyYCjk);
        } else {
            m3087getWidthimpl = (Offset.m3018getXimpl(this.center) > Float.POSITIVE_INFINITY ? 1 : (Offset.m3018getXimpl(this.center) == Float.POSITIVE_INFINITY ? 0 : -1)) == 0 ? Size.m3087getWidthimpl(j) : Offset.m3018getXimpl(this.center);
            m3084getHeightimpl = (Offset.m3019getYimpl(this.center) > Float.POSITIVE_INFINITY ? 1 : (Offset.m3019getYimpl(this.center) == Float.POSITIVE_INFINITY ? 0 : -1)) == 0 ? Size.m3084getHeightimpl(j) : Offset.m3019getYimpl(this.center);
        }
        List<Color> list = this.colors;
        List<Float> list2 = this.stops;
        long Offset = OffsetKt.Offset(m3087getWidthimpl, m3084getHeightimpl);
        float f = this.radius;
        return ShaderKt.m3608RadialGradientShader8uybcMk(Offset, f == Float.POSITIVE_INFINITY ? Size.m3086getMinDimensionimpl(j) / 2 : f, list, list2, this.tileMode);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RadialGradient) {
            RadialGradient radialGradient = (RadialGradient) obj;
            if (Intrinsics.areEqual(this.colors, radialGradient.colors) && Intrinsics.areEqual(this.stops, radialGradient.stops) && Offset.m3015equalsimpl0(this.center, radialGradient.center)) {
                return ((this.radius > radialGradient.radius ? 1 : (this.radius == radialGradient.radius ? 0 : -1)) == 0) && TileMode.m3660equalsimpl0(this.tileMode, radialGradient.tileMode);
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.colors.hashCode() * 31;
        List<Float> list = this.stops;
        return ((((((hashCode + (list != null ? list.hashCode() : 0)) * 31) + Offset.m3020hashCodeimpl(this.center)) * 31) + Float.floatToIntBits(this.radius)) * 31) + TileMode.m3661hashCodeimpl(this.tileMode);
    }

    public String toString() {
        String str;
        String str2 = "";
        if (OffsetKt.m3037isSpecifiedk4lQ0M(this.center)) {
            str = "center=" + ((Object) Offset.m3026toStringimpl(this.center)) + ", ";
        } else {
            str = "";
        }
        float f = this.radius;
        if ((Float.isInfinite(f) || Float.isNaN(f)) ? false : true) {
            str2 = "radius=" + this.radius + ", ";
        }
        return "RadialGradient(colors=" + this.colors + ", stops=" + this.stops + ", " + str + str2 + "tileMode=" + ((Object) TileMode.m3662toStringimpl(this.tileMode)) + ')';
    }
}
