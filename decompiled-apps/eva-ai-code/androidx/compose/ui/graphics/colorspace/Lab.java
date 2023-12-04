package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
/* compiled from: Lab.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001#B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J%\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0010¢\u0006\u0002\b\u0016J\u0010\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J%\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0010¢\u0006\u0002\b\u0019J@\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u0001H\u0010ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\t\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006$"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Lab;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "name", "", "id", "", "(Ljava/lang/String;I)V", "isWideGamut", "", "()Z", "fromXyz", "", "v", "getMaxValue", "", "component", "getMinValue", "toXy", "", "v0", "v1", "v2", "toXy$ui_graphics_release", "toXyz", "toZ", "toZ$ui_graphics_release", "xyzaToColor", "Landroidx/compose/ui/graphics/Color;", "x", "y", "z", "a", "colorSpace", "xyzaToColor-JlNiLsg$ui_graphics_release", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Lab extends ColorSpace {
    private static final float A = 0.008856452f;
    private static final float B = 7.787037f;
    private static final float C = 0.13793103f;
    public static final Companion Companion = new Companion(null);
    private static final float D = 0.20689656f;

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int i) {
        return i == 0 ? 100.0f : 128.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMinValue(int i) {
        return i == 0 ? 0.0f : -128.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean isWideGamut() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Lab(String name, int i) {
        super(name, ColorModel.Companion.m3704getLabxdoWZVw(), i, null);
        Intrinsics.checkNotNullParameter(name, "name");
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] toXyz(float[] v) {
        Intrinsics.checkNotNullParameter(v, "v");
        v[0] = RangesKt.coerceIn(v[0], 0.0f, 100.0f);
        v[1] = RangesKt.coerceIn(v[1], -128.0f, 128.0f);
        float coerceIn = RangesKt.coerceIn(v[2], -128.0f, 128.0f);
        v[2] = coerceIn;
        float f = (v[0] + 16.0f) / 116.0f;
        float f2 = (v[1] * 0.002f) + f;
        float f3 = f - (coerceIn * 0.005f);
        float f4 = f2 > D ? f2 * f2 * f2 : (f2 - C) * 0.12841855f;
        float f5 = f > D ? f * f * f : (f - C) * 0.12841855f;
        float f6 = f3 > D ? f3 * f3 * f3 : (f3 - C) * 0.12841855f;
        v[0] = f4 * Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[0];
        v[1] = f5 * Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[1];
        v[2] = f6 * Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[2];
        return v;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public long toXy$ui_graphics_release(float f, float f2, float f3) {
        float coerceIn = (RangesKt.coerceIn(f, 0.0f, 100.0f) + 16.0f) / 116.0f;
        float coerceIn2 = (RangesKt.coerceIn(f, -128.0f, 128.0f) * 0.002f) + coerceIn;
        return (Float.floatToIntBits((coerceIn2 > D ? (coerceIn2 * coerceIn2) * coerceIn2 : (coerceIn2 - C) * 0.12841855f) * Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[0]) << 32) | (Float.floatToIntBits((coerceIn > D ? coerceIn * coerceIn * coerceIn : (coerceIn - C) * 0.12841855f) * Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[1]) & 4294967295L);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float toZ$ui_graphics_release(float f, float f2, float f3) {
        float coerceIn = ((RangesKt.coerceIn(f, 0.0f, 100.0f) + 16.0f) / 116.0f) - (RangesKt.coerceIn(f3, -128.0f, 128.0f) * 0.005f);
        return (coerceIn > D ? coerceIn * coerceIn * coerceIn : 0.12841855f * (coerceIn - C)) * Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[2];
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* renamed from: xyzaToColor-JlNiLsg$ui_graphics_release */
    public long mo3708xyzaToColorJlNiLsg$ui_graphics_release(float f, float f2, float f3, float f4, ColorSpace colorSpace) {
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        float f5 = f / Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[0];
        float f6 = f2 / Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[1];
        float f7 = f3 / Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[2];
        float pow = f5 > A ? (float) Math.pow(f5, 0.33333334f) : (f5 * B) + C;
        float pow2 = f6 > A ? (float) Math.pow(f6, 0.33333334f) : (f6 * B) + C;
        return ColorKt.Color(RangesKt.coerceIn((116.0f * pow2) - 16.0f, 0.0f, 100.0f), RangesKt.coerceIn((pow - pow2) * 500.0f, -128.0f, 128.0f), RangesKt.coerceIn((pow2 - (f7 > A ? (float) Math.pow(f7, 0.33333334f) : (f7 * B) + C)) * 200.0f, -128.0f, 128.0f), f4, colorSpace);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] fromXyz(float[] v) {
        Intrinsics.checkNotNullParameter(v, "v");
        float f = v[0] / Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[0];
        float f2 = v[1] / Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[1];
        float f3 = v[2] / Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[2];
        float pow = f > A ? (float) Math.pow(f, 0.33333334f) : (f * B) + C;
        float pow2 = f2 > A ? (float) Math.pow(f2, 0.33333334f) : (f2 * B) + C;
        float pow3 = f3 > A ? (float) Math.pow(f3, 0.33333334f) : (f3 * B) + C;
        v[0] = RangesKt.coerceIn((116.0f * pow2) - 16.0f, 0.0f, 100.0f);
        v[1] = RangesKt.coerceIn((pow - pow2) * 500.0f, -128.0f, 128.0f);
        v[2] = RangesKt.coerceIn((pow2 - pow3) * 200.0f, -128.0f, 128.0f);
        return v;
    }

    /* compiled from: Lab.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Lab$Companion;", "", "()V", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "", "B", "C", "D", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
