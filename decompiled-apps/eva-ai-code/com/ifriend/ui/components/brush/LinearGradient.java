package com.ifriend.ui.components.brush;

import android.graphics.Shader;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.ShaderKt;
import androidx.compose.ui.graphics.TileMode;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: LinearGradient.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001BF\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0002\u0010\fJ!\u0010\u0010\u001a\u00060\u0011j\u0002`\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J)\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\"H\u0016R\u000e\u0010\r\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0007\u001a\u00020\bX\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u000f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Lcom/ifriend/ui/components/brush/LinearGradient;", "Landroidx/compose/ui/graphics/ShaderBrush;", "colors", "", "Landroidx/compose/ui/graphics/Color;", "stops", "", "tileMode", "Landroidx/compose/ui/graphics/TileMode;", "angleInDegrees", "useAsCssAngle", "", "(Ljava/util/List;Ljava/util/List;IFZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "angleInRadians", "normalizedAngle", "I", "createShader", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "size", "Landroidx/compose/ui/geometry/Size;", "createShader-uvyYCjk", "(J)Landroid/graphics/Shader;", "equals", "other", "", "getGradientCoordinates", "Lkotlin/Pair;", "Landroidx/compose/ui/geometry/Offset;", "getGradientCoordinates-uvyYCjk", "(J)Lkotlin/Pair;", "hashCode", "", "toString", "", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LinearGradient extends ShaderBrush {
    public static final int $stable = 0;
    private final float angleInRadians;
    private final List<Color> colors;
    private final float normalizedAngle;
    private final List<Float> stops;
    private final int tileMode;

    public /* synthetic */ LinearGradient(List list, List list2, int i, float f, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, i, f, z);
    }

    public /* synthetic */ LinearGradient(List list, List list2, int i, float f, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i2 & 2) != 0 ? null : list2, (i2 & 4) != 0 ? TileMode.Companion.m3664getClamp3opZhB0() : i, (i2 & 8) != 0 ? 0.0f : f, (i2 & 16) != 0 ? false : z, null);
    }

    private LinearGradient(List<Color> colors, List<Float> list, int i, float f, boolean z) {
        float f2;
        Intrinsics.checkNotNullParameter(colors, "colors");
        this.colors = colors;
        this.stops = list;
        this.tileMode = i;
        if (z) {
            float f3 = 360;
            f2 = (((90 - f) % f3) + f3) % f3;
        } else {
            float f4 = 360;
            f2 = ((f % f4) + f4) % f4;
        }
        this.normalizedAngle = f2;
        this.angleInRadians = (float) Math.toRadians(f2);
    }

    @Override // androidx.compose.ui.graphics.ShaderBrush
    /* renamed from: createShader-uvyYCjk */
    public Shader mo3260createShaderuvyYCjk(long j) {
        Pair<Offset, Offset> m7016getGradientCoordinatesuvyYCjk = m7016getGradientCoordinatesuvyYCjk(j);
        return ShaderKt.m3606LinearGradientShaderVjE6UOU(m7016getGradientCoordinatesuvyYCjk.component1().m3028unboximpl(), m7016getGradientCoordinatesuvyYCjk.component2().m3028unboximpl(), this.colors, this.stops, this.tileMode);
    }

    /* renamed from: getGradientCoordinates-uvyYCjk  reason: not valid java name */
    private final Pair<Offset, Offset> m7016getGradientCoordinatesuvyYCjk(long j) {
        float f;
        double d = 2;
        float sqrt = (float) Math.sqrt(((float) Math.pow(Size.m3087getWidthimpl(j), d)) + ((float) Math.pow(Size.m3084getHeightimpl(j), d)));
        float acos = (float) Math.acos(Size.m3087getWidthimpl(j) / sqrt);
        float f2 = this.normalizedAngle;
        if ((f2 > 90.0f && f2 < 180.0f) || (f2 > 270.0f && f2 < 360.0f)) {
            f = 3.1415927f - this.angleInRadians;
        } else {
            f = this.angleInRadians;
        }
        float abs = Math.abs(((float) Math.cos(f - acos)) * sqrt) / 2;
        float cos = ((float) Math.cos(this.angleInRadians)) * abs;
        float sin = abs * ((float) Math.sin(this.angleInRadians));
        return TuplesKt.to(Offset.m3007boximpl(Offset.m3023plusMKHz9U(SizeKt.m3097getCenteruvyYCjk(j), OffsetKt.Offset(-cos, sin))), Offset.m3007boximpl(Offset.m3023plusMKHz9U(SizeKt.m3097getCenteruvyYCjk(j), OffsetKt.Offset(cos, -sin))));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LinearGradient) {
            LinearGradient linearGradient = (LinearGradient) obj;
            if (Intrinsics.areEqual(this.colors, linearGradient.colors) && Intrinsics.areEqual(this.stops, linearGradient.stops)) {
                return ((this.normalizedAngle > linearGradient.normalizedAngle ? 1 : (this.normalizedAngle == linearGradient.normalizedAngle ? 0 : -1)) == 0) && TileMode.m3660equalsimpl0(this.tileMode, linearGradient.tileMode);
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.colors.hashCode() * 31;
        List<Float> list = this.stops;
        return ((((hashCode + (list != null ? list.hashCode() : 0)) * 31) + Float.floatToIntBits(this.normalizedAngle)) * 31) + TileMode.m3661hashCodeimpl(this.tileMode);
    }

    public String toString() {
        List<Color> list = this.colors;
        List<Float> list2 = this.stops;
        float f = this.normalizedAngle;
        String m3662toStringimpl = TileMode.m3662toStringimpl(this.tileMode);
        return "LinearGradient(colors=" + list + ", stops=" + list2 + ", angle=" + f + ", tileMode=" + m3662toStringimpl + ")";
    }
}
