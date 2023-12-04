package com.ifriend.ui.theme.icons.message;

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
/* compiled from: IconVoiceMessage.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_voice", "Landroidx/compose/ui/graphics/vector/ImageVector;", "IconVoiceMessage", "Lcom/ifriend/ui/theme/AppIcons;", "getIconVoiceMessage", "(Lcom/ifriend/ui/theme/AppIcons;)Landroidx/compose/ui/graphics/vector/ImageVector;", "common_ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IconVoiceMessageKt {
    private static ImageVector _voice;

    public static final ImageVector getIconVoiceMessage(AppIcons appIcons) {
        Intrinsics.checkNotNullParameter(appIcons, "<this>");
        ImageVector imageVector = _voice;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 12.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Voice", Dp.m5607constructorimpl(f), Dp.m5607constructorimpl(f), 12.0f, 12.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4294967295L), null);
        int m3644getButtKaPHkGw = StrokeCap.Companion.m3644getButtKaPHkGw();
        int m3655getMiterLxFBmk8 = StrokeJoin.Companion.m3655getMiterLxFBmk8();
        int m3575getNonZeroRgk1Os = PathFillType.Companion.m3575getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(6.0f, 0.25f);
        pathBuilder.curveTo(4.8954f, 0.25f, 4.0f, 1.1454f, 4.0f, 2.25f);
        pathBuilder.verticalLineTo(5.25f);
        pathBuilder.curveTo(4.0f, 6.3546f, 4.8954f, 7.25f, 6.0f, 7.25f);
        pathBuilder.curveTo(7.1046f, 7.25f, 8.0f, 6.3546f, 8.0f, 5.25f);
        pathBuilder.verticalLineTo(2.25f);
        pathBuilder.curveTo(8.0f, 1.1454f, 7.1046f, 0.25f, 6.0f, 0.25f);
        pathBuilder.close();
        builder.m3927addPathoIyEayM(pathBuilder.getNodes(), (r30 & 2) != 0 ? VectorKt.getDefaultFillType() : m3575getNonZeroRgk1Os, (r30 & 4) != 0 ? "" : "", (r30 & 8) != 0 ? null : solidColor, (r30 & 16) != 0 ? 1.0f : 1.0f, (r30 & 32) == 0 ? null : null, (r30 & 64) != 0 ? 1.0f : 1.0f, (r30 & 128) != 0 ? 0.0f : 0.0f, (r30 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : m3644getButtKaPHkGw, (r30 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : m3655getMiterLxFBmk8, (r30 & 1024) != 0 ? 4.0f : 4.0f, (r30 & 2048) != 0 ? 0.0f : 0.0f, (r30 & 4096) == 0 ? 0.0f : 1.0f, (r30 & 8192) == 0 ? 0.0f : 0.0f);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4294967295L), null);
        int m3644getButtKaPHkGw2 = StrokeCap.Companion.m3644getButtKaPHkGw();
        int m3655getMiterLxFBmk82 = StrokeJoin.Companion.m3655getMiterLxFBmk8();
        int m3575getNonZeroRgk1Os2 = PathFillType.Companion.m3575getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(3.125f, 4.75f);
        pathBuilder2.curveTo(3.125f, 4.4048f, 2.8452f, 4.125f, 2.5f, 4.125f);
        pathBuilder2.curveTo(2.1548f, 4.125f, 1.875f, 4.4048f, 1.875f, 4.75f);
        pathBuilder2.verticalLineTo(5.4773f);
        pathBuilder2.curveTo(1.875f, 7.4613f, 3.4216f, 9.0475f, 5.375f, 9.3301f);
        pathBuilder2.verticalLineTo(10.5f);
        pathBuilder2.curveTo(5.375f, 10.8452f, 5.6548f, 11.125f, 6.0f, 11.125f);
        pathBuilder2.curveTo(6.3452f, 11.125f, 6.625f, 10.8452f, 6.625f, 10.5f);
        pathBuilder2.verticalLineTo(9.3301f);
        pathBuilder2.curveTo(8.5784f, 9.0475f, 10.125f, 7.4613f, 10.125f, 5.4773f);
        pathBuilder2.verticalLineTo(4.75f);
        pathBuilder2.curveTo(10.125f, 4.4048f, 9.8452f, 4.125f, 9.5f, 4.125f);
        pathBuilder2.curveTo(9.1548f, 4.125f, 8.875f, 4.4048f, 8.875f, 4.75f);
        pathBuilder2.verticalLineTo(5.4773f);
        pathBuilder2.curveTo(8.875f, 6.9007f, 7.628f, 8.125f, 6.0f, 8.125f);
        pathBuilder2.curveTo(4.372f, 8.125f, 3.125f, 6.9007f, 3.125f, 5.4773f);
        pathBuilder2.verticalLineTo(4.75f);
        pathBuilder2.close();
        builder.m3927addPathoIyEayM(pathBuilder2.getNodes(), (r30 & 2) != 0 ? VectorKt.getDefaultFillType() : m3575getNonZeroRgk1Os2, (r30 & 4) != 0 ? "" : "", (r30 & 8) != 0 ? null : solidColor2, (r30 & 16) != 0 ? 1.0f : 1.0f, (r30 & 32) == 0 ? null : null, (r30 & 64) != 0 ? 1.0f : 1.0f, (r30 & 128) != 0 ? 0.0f : 0.0f, (r30 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : m3644getButtKaPHkGw2, (r30 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : m3655getMiterLxFBmk82, (r30 & 1024) != 0 ? 4.0f : 4.0f, (r30 & 2048) != 0 ? 0.0f : 0.0f, (r30 & 4096) == 0 ? 0.0f : 1.0f, (r30 & 8192) == 0 ? 0.0f : 0.0f);
        ImageVector build = builder.build();
        _voice = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
