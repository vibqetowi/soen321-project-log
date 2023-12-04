package com.ifriend.ui.theme.icons.calls;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import com.ifriend.ui.theme.AppIcons;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: IconCall.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_Call", "Landroidx/compose/ui/graphics/vector/ImageVector;", "IconCall", "Lcom/ifriend/ui/theme/AppIcons;", "getIconCall", "(Lcom/ifriend/ui/theme/AppIcons;)Landroidx/compose/ui/graphics/vector/ImageVector;", "common_ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IconCallKt {
    private static ImageVector _Call;

    public static final ImageVector getIconCall(AppIcons appIcons) {
        Intrinsics.checkNotNullParameter(appIcons, "<this>");
        ImageVector imageVector = _Call;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 13.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Call", Dp.m5607constructorimpl(f), Dp.m5607constructorimpl(f), 13.0f, 13.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4294967295L), null);
        int m3644getButtKaPHkGw = StrokeCap.Companion.m3644getButtKaPHkGw();
        int m3655getMiterLxFBmk8 = StrokeJoin.Companion.m3655getMiterLxFBmk8();
        int m3575getNonZeroRgk1Os = PathFillType.Companion.m3575getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(1.0336f, 1.2396f);
        pathBuilder.lineTo(1.6946f, 0.7911f);
        pathBuilder.curveTo(2.3114f, 0.3707f, 3.1462f, 0.5077f, 3.6428f, 1.1112f);
        pathBuilder.lineTo(4.6313f, 2.3109f);
        pathBuilder.curveTo(5.0624f, 2.8342f, 5.0677f, 3.536f, 4.7228f, 4.1803f);
        pathBuilder.curveTo(4.2543f, 5.0552f, 3.8874f, 5.6841f, 3.8874f, 5.6841f);
        pathBuilder.curveTo(4.189f, 6.438f, 4.6442f, 7.1208f, 5.2241f, 7.6891f);
        pathBuilder.curveTo(5.9018f, 8.3668f, 6.5294f, 8.707f, 7.2291f, 9.0258f);
        pathBuilder.curveTo(7.2291f, 9.0258f, 7.8641f, 8.6636f, 8.7329f, 8.1904f);
        pathBuilder.curveTo(9.3131f, 7.8749f, 9.9099f, 7.6871f, 10.4239f, 8.1075f);
        pathBuilder.lineTo(11.6215f, 9.086f);
        pathBuilder.curveTo(11.9119f, 9.3255f, 12.1111f, 9.6576f, 12.1856f, 10.0266f);
        pathBuilder.curveTo(12.2601f, 10.3956f, 12.2053f, 10.779f, 12.0306f, 11.1124f);
        pathBuilder.lineTo(11.6423f, 11.8322f);
        pathBuilder.curveTo(11.4595f, 12.1793f, 11.1846f, 12.4691f, 10.8477f, 12.67f);
        pathBuilder.curveTo(10.5108f, 12.8708f, 10.125f, 12.9748f, 9.7328f, 12.9704f);
        pathBuilder.curveTo(7.8554f, 12.943f, 5.6198f, 11.75f, 3.3942f, 9.5298f);
        pathBuilder.curveTo(1.1645f, 7.3055f, 0.1714f, 5.2751f, 0.0484f, 3.3021f);
        pathBuilder.curveTo(-0.0037f, 2.472f, 0.3799f, 1.6847f, 1.0342f, 1.2402f);
        pathBuilder.lineTo(1.0336f, 1.2396f);
        pathBuilder.close();
        builder.m3927addPathoIyEayM(pathBuilder.getNodes(), (r30 & 2) != 0 ? VectorKt.getDefaultFillType() : m3575getNonZeroRgk1Os, (r30 & 4) != 0 ? "" : "", (r30 & 8) != 0 ? null : solidColor, (r30 & 16) != 0 ? 1.0f : 1.0f, (r30 & 32) == 0 ? null : null, (r30 & 64) != 0 ? 1.0f : 1.0f, (r30 & 128) != 0 ? 0.0f : 0.0f, (r30 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : m3644getButtKaPHkGw, (r30 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : m3655getMiterLxFBmk8, (r30 & 1024) != 0 ? 4.0f : 4.0f, (r30 & 2048) != 0 ? 0.0f : 0.0f, (r30 & 4096) == 0 ? 0.0f : 1.0f, (r30 & 8192) == 0 ? 0.0f : 0.0f);
        ImageVector build = builder.build();
        _Call = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
