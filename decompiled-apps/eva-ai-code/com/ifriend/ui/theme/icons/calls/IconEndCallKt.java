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
/* compiled from: IconEndCall.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_EndCall", "Landroidx/compose/ui/graphics/vector/ImageVector;", "IconEndCall", "Lcom/ifriend/ui/theme/AppIcons;", "getIconEndCall", "(Lcom/ifriend/ui/theme/AppIcons;)Landroidx/compose/ui/graphics/vector/ImageVector;", "common_ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IconEndCallKt {
    private static ImageVector _EndCall;

    public static final ImageVector getIconEndCall(AppIcons appIcons) {
        Intrinsics.checkNotNullParameter(appIcons, "<this>");
        ImageVector imageVector = _EndCall;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 25.0d;
        ImageVector.Builder builder = new ImageVector.Builder("EndCall", Dp.m5607constructorimpl(f), Dp.m5607constructorimpl(f), 25.0f, 25.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4294967295L), null);
        int m3644getButtKaPHkGw = StrokeCap.Companion.m3644getButtKaPHkGw();
        int m3655getMiterLxFBmk8 = StrokeJoin.Companion.m3655getMiterLxFBmk8();
        int m3575getNonZeroRgk1Os = PathFillType.Companion.m3575getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(22.45f, 13.675f);
        pathBuilder.lineTo(22.2512f, 14.7125f);
        pathBuilder.curveTo(22.0675f, 15.6825f, 21.1587f, 16.335f, 20.13f, 16.235f);
        pathBuilder.lineTo(18.0837f, 16.0375f);
        pathBuilder.curveTo(17.1912f, 15.9513f, 16.53f, 15.3f, 16.25f, 14.375f);
        pathBuilder.curveTo(15.87f, 13.1188f, 15.625f, 12.1875f, 15.625f, 12.1875f);
        pathBuilder.curveTo(14.638f, 11.7645f, 13.5738f, 11.5517f, 12.5f, 11.5625f);
        pathBuilder.curveTo(11.2325f, 11.5625f, 10.3275f, 11.8313f, 9.375f, 12.1875f);
        pathBuilder.curveTo(9.375f, 12.1875f, 9.12f, 13.12f, 8.75f, 14.375f);
        pathBuilder.curveTo(8.5025f, 15.2125f, 8.12f, 15.9463f, 7.2463f, 16.0338f);
        pathBuilder.lineTo(5.2112f, 16.2388f);
        pathBuilder.curveTo(4.7157f, 16.2864f, 4.2189f, 16.162f, 3.8042f, 15.8866f);
        pathBuilder.curveTo(3.3894f, 15.6112f, 3.0821f, 15.2015f, 2.9337f, 14.7263f);
        pathBuilder.lineTo(2.6237f, 13.69f);
        pathBuilder.curveTo(2.4701f, 13.1946f, 2.4561f, 12.6664f, 2.5834f, 12.1635f);
        pathBuilder.curveTo(2.7106f, 11.6607f, 2.9742f, 11.2027f, 3.345f, 10.84f);
        pathBuilder.curveTo(5.1262f, 9.11f, 8.3325f, 8.135f, 12.49f, 8.13f);
        pathBuilder.curveTo(16.655f, 8.125f, 19.4825f, 9.095f, 21.4425f, 10.825f);
        pathBuilder.curveTo(22.2675f, 11.5525f, 22.645f, 12.6475f, 22.4487f, 13.675f);
        pathBuilder.horizontalLineTo(22.45f);
        pathBuilder.close();
        builder.m3927addPathoIyEayM(pathBuilder.getNodes(), (r30 & 2) != 0 ? VectorKt.getDefaultFillType() : m3575getNonZeroRgk1Os, (r30 & 4) != 0 ? "" : "", (r30 & 8) != 0 ? null : solidColor, (r30 & 16) != 0 ? 1.0f : 1.0f, (r30 & 32) == 0 ? null : null, (r30 & 64) != 0 ? 1.0f : 1.0f, (r30 & 128) != 0 ? 0.0f : 0.0f, (r30 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : m3644getButtKaPHkGw, (r30 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : m3655getMiterLxFBmk8, (r30 & 1024) != 0 ? 4.0f : 4.0f, (r30 & 2048) != 0 ? 0.0f : 0.0f, (r30 & 4096) == 0 ? 0.0f : 1.0f, (r30 & 8192) == 0 ? 0.0f : 0.0f);
        ImageVector build = builder.build();
        _EndCall = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
