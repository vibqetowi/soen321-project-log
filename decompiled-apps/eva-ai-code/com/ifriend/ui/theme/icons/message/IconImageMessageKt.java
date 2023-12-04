package com.ifriend.ui.theme.icons.message;

import androidx.compose.ui.graphics.Color;
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
/* compiled from: IconImageMessage.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_icImageMessage", "Landroidx/compose/ui/graphics/vector/ImageVector;", "IconImageMessage", "Lcom/ifriend/ui/theme/AppIcons;", "getIconImageMessage", "(Lcom/ifriend/ui/theme/AppIcons;)Landroidx/compose/ui/graphics/vector/ImageVector;", "common_ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IconImageMessageKt {
    private static ImageVector _icImageMessage;

    public static final ImageVector getIconImageMessage(AppIcons appIcons) {
        Intrinsics.checkNotNullParameter(appIcons, "<this>");
        ImageVector imageVector = _icImageMessage;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("IcImageMessage", Dp.m5607constructorimpl(f), Dp.m5607constructorimpl(f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(Color.Companion.m3328getWhite0d7_KjU(), null);
        int m3644getButtKaPHkGw = StrokeCap.Companion.m3644getButtKaPHkGw();
        int m3655getMiterLxFBmk8 = StrokeJoin.Companion.m3655getMiterLxFBmk8();
        int m3575getNonZeroRgk1Os = PathFillType.Companion.m3575getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.0f, 19.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(8.5f, 13.5f);
        pathBuilder.lineToRelative(2.5f, 3.01f);
        pathBuilder.lineTo(14.5f, 12.0f);
        pathBuilder.lineToRelative(4.5f, 6.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.lineToRelative(3.5f, -4.5f);
        pathBuilder.close();
        builder.m3927addPathoIyEayM(pathBuilder.getNodes(), (r30 & 2) != 0 ? VectorKt.getDefaultFillType() : m3575getNonZeroRgk1Os, (r30 & 4) != 0 ? "" : "", (r30 & 8) != 0 ? null : solidColor, (r30 & 16) != 0 ? 1.0f : 1.0f, (r30 & 32) == 0 ? null : null, (r30 & 64) != 0 ? 1.0f : 1.0f, (r30 & 128) != 0 ? 0.0f : 0.0f, (r30 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : m3644getButtKaPHkGw, (r30 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : m3655getMiterLxFBmk8, (r30 & 1024) != 0 ? 4.0f : 4.0f, (r30 & 2048) != 0 ? 0.0f : 0.0f, (r30 & 4096) == 0 ? 0.0f : 1.0f, (r30 & 8192) == 0 ? 0.0f : 0.0f);
        ImageVector build = builder.build();
        _icImageMessage = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
