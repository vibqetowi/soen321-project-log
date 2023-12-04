package androidx.compose.ui.graphics;

import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.os.Build;
import androidx.compose.ui.geometry.Offset;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AndroidShader.android.kt */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a1\u0010\u0000\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u001aO\u0010\n\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u0006H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001aO\u0010\u0016\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00122\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u0006H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a?\u0010\u001b\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u0017\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000fH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0019\u0010\u001e\u001a\u00020\u001f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0001ø\u0001\u0001\u001a!\u0010 \u001a\u00020!2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\"\u001a\u00020\u001fH\u0001ø\u0001\u0001\u001a3\u0010#\u001a\u0004\u0018\u00010$2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\"\u001a\u00020\u001fH\u0001ø\u0001\u0001\u001a)\u0010&\u001a\u00020'2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000fH\u0002ø\u0001\u0001*\n\u0010(\"\u00020\u00012\u00020\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006)"}, d2 = {"ActualImageShader", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "tileModeX", "Landroidx/compose/ui/graphics/TileMode;", "tileModeY", "ActualImageShader-F49vj9s", "(Landroidx/compose/ui/graphics/ImageBitmap;II)Landroid/graphics/Shader;", "ActualLinearGradientShader", "from", "Landroidx/compose/ui/geometry/Offset;", "to", "colors", "", "Landroidx/compose/ui/graphics/Color;", "colorStops", "", "tileMode", "ActualLinearGradientShader-VjE6UOU", "(JJLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "ActualRadialGradientShader", TtmlNode.CENTER, "radius", "ActualRadialGradientShader-8uybcMk", "(JFLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "ActualSweepGradientShader", "ActualSweepGradientShader-9KIMszo", "(JLjava/util/List;Ljava/util/List;)Landroid/graphics/Shader;", "countTransparentColors", "", "makeTransparentColors", "", "numTransparentColors", "makeTransparentStops", "", "stops", "validateColorStops", "", "Shader", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AndroidShader_androidKt {
    /* renamed from: ActualLinearGradientShader-VjE6UOU  reason: not valid java name */
    public static final Shader m3161ActualLinearGradientShaderVjE6UOU(long j, long j2, List<Color> colors, List<Float> list, int i) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        validateColorStops(colors, list);
        int countTransparentColors = countTransparentColors(colors);
        return new android.graphics.LinearGradient(Offset.m3018getXimpl(j), Offset.m3019getYimpl(j), Offset.m3018getXimpl(j2), Offset.m3019getYimpl(j2), makeTransparentColors(colors, countTransparentColors), makeTransparentStops(list, colors, countTransparentColors), AndroidTileMode_androidKt.m3165toAndroidTileMode0vamqd0(i));
    }

    /* renamed from: ActualRadialGradientShader-8uybcMk  reason: not valid java name */
    public static final Shader m3162ActualRadialGradientShader8uybcMk(long j, float f, List<Color> colors, List<Float> list, int i) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        validateColorStops(colors, list);
        int countTransparentColors = countTransparentColors(colors);
        return new android.graphics.RadialGradient(Offset.m3018getXimpl(j), Offset.m3019getYimpl(j), f, makeTransparentColors(colors, countTransparentColors), makeTransparentStops(list, colors, countTransparentColors), AndroidTileMode_androidKt.m3165toAndroidTileMode0vamqd0(i));
    }

    /* renamed from: ActualSweepGradientShader-9KIMszo  reason: not valid java name */
    public static final Shader m3163ActualSweepGradientShader9KIMszo(long j, List<Color> colors, List<Float> list) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        validateColorStops(colors, list);
        int countTransparentColors = countTransparentColors(colors);
        return new android.graphics.SweepGradient(Offset.m3018getXimpl(j), Offset.m3019getYimpl(j), makeTransparentColors(colors, countTransparentColors), makeTransparentStops(list, colors, countTransparentColors));
    }

    /* renamed from: ActualImageShader-F49vj9s  reason: not valid java name */
    public static final Shader m3160ActualImageShaderF49vj9s(ImageBitmap image, int i, int i2) {
        Intrinsics.checkNotNullParameter(image, "image");
        return new BitmapShader(AndroidImageBitmap_androidKt.asAndroidBitmap(image), AndroidTileMode_androidKt.m3165toAndroidTileMode0vamqd0(i), AndroidTileMode_androidKt.m3165toAndroidTileMode0vamqd0(i2));
    }

    public static final int countTransparentColors(List<Color> colors) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        if (Build.VERSION.SDK_INT >= 26) {
            return 0;
        }
        int lastIndex = CollectionsKt.getLastIndex(colors);
        int i = 0;
        for (int i2 = 1; i2 < lastIndex; i2++) {
            if (Color.m3293getAlphaimpl(colors.get(i2).m3301unboximpl()) == 0.0f) {
                i++;
            }
        }
        return i;
    }

    public static final int[] makeTransparentColors(List<Color> colors, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(colors, "colors");
        if (Build.VERSION.SDK_INT >= 26) {
            int size = colors.size();
            int[] iArr = new int[size];
            for (int i3 = 0; i3 < size; i3++) {
                iArr[i3] = ColorKt.m3345toArgb8_81llA(colors.get(i3).m3301unboximpl());
            }
            return iArr;
        }
        int[] iArr2 = new int[colors.size() + i];
        int lastIndex = CollectionsKt.getLastIndex(colors);
        int size2 = colors.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size2; i5++) {
            long m3301unboximpl = colors.get(i5).m3301unboximpl();
            if (Color.m3293getAlphaimpl(m3301unboximpl) == 0.0f) {
                if (i5 == 0) {
                    i2 = i4 + 1;
                    iArr2[i4] = ColorKt.m3345toArgb8_81llA(Color.m3290copywmQWz5c$default(colors.get(1).m3301unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                } else if (i5 == lastIndex) {
                    i2 = i4 + 1;
                    iArr2[i4] = ColorKt.m3345toArgb8_81llA(Color.m3290copywmQWz5c$default(colors.get(i5 - 1).m3301unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                } else {
                    int i6 = i4 + 1;
                    iArr2[i4] = ColorKt.m3345toArgb8_81llA(Color.m3290copywmQWz5c$default(colors.get(i5 - 1).m3301unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                    i4 = i6 + 1;
                    iArr2[i6] = ColorKt.m3345toArgb8_81llA(Color.m3290copywmQWz5c$default(colors.get(i5 + 1).m3301unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                }
                i4 = i2;
            } else {
                iArr2[i4] = ColorKt.m3345toArgb8_81llA(m3301unboximpl);
                i4++;
            }
        }
        return iArr2;
    }

    public static final float[] makeTransparentStops(List<Float> list, List<Color> colors, int i) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        if (i == 0) {
            if (list != null) {
                return CollectionsKt.toFloatArray(list);
            }
            return null;
        }
        float[] fArr = new float[colors.size() + i];
        fArr[0] = list != null ? list.get(0).floatValue() : 0.0f;
        int lastIndex = CollectionsKt.getLastIndex(colors);
        int i2 = 1;
        for (int i3 = 1; i3 < lastIndex; i3++) {
            long m3301unboximpl = colors.get(i3).m3301unboximpl();
            float floatValue = list != null ? list.get(i3).floatValue() : i3 / CollectionsKt.getLastIndex(colors);
            int i4 = i2 + 1;
            fArr[i2] = floatValue;
            if (Color.m3293getAlphaimpl(m3301unboximpl) == 0.0f) {
                i2 = i4 + 1;
                fArr[i4] = floatValue;
            } else {
                i2 = i4;
            }
        }
        fArr[i2] = list != null ? list.get(CollectionsKt.getLastIndex(colors)).floatValue() : 1.0f;
        return fArr;
    }

    private static final void validateColorStops(List<Color> list, List<Float> list2) {
        if (list2 == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() != list2.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }
}
