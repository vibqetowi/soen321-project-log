package com.ifriend.ui.theme.icons;

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
/* compiled from: IconBack.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_back", "Landroidx/compose/ui/graphics/vector/ImageVector;", "IconBack", "Lcom/ifriend/ui/theme/AppIcons;", "getIconBack", "(Lcom/ifriend/ui/theme/AppIcons;)Landroidx/compose/ui/graphics/vector/ImageVector;", "common_ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IconBackKt {
    private static ImageVector _back;

    public static final ImageVector getIconBack(AppIcons appIcons) {
        Intrinsics.checkNotNullParameter(appIcons, "<this>");
        ImageVector imageVector = _back;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Back", Dp.m5607constructorimpl((float) 10.0d), Dp.m5607constructorimpl((float) 18.0d), 10.0f, 18.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(0), null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4294967295L), null);
        int m3645getRoundKaPHkGw = StrokeCap.Companion.m3645getRoundKaPHkGw();
        int m3656getRoundLxFBmk8 = StrokeJoin.Companion.m3656getRoundLxFBmk8();
        int m3575getNonZeroRgk1Os = PathFillType.Companion.m3575getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.0f, 17.0f);
        pathBuilder.lineTo(1.0f, 9.0f);
        pathBuilder.lineTo(9.0f, 1.0f);
        builder.m3927addPathoIyEayM(pathBuilder.getNodes(), (r30 & 2) != 0 ? VectorKt.getDefaultFillType() : m3575getNonZeroRgk1Os, (r30 & 4) != 0 ? "" : "", (r30 & 8) != 0 ? null : solidColor, (r30 & 16) != 0 ? 1.0f : 1.0f, (r30 & 32) == 0 ? solidColor2 : null, (r30 & 64) != 0 ? 1.0f : 1.0f, (r30 & 128) != 0 ? 0.0f : 2.0f, (r30 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : m3645getRoundKaPHkGw, (r30 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : m3656getRoundLxFBmk8, (r30 & 1024) != 0 ? 4.0f : 4.0f, (r30 & 2048) != 0 ? 0.0f : 0.0f, (r30 & 4096) == 0 ? 0.0f : 1.0f, (r30 & 8192) == 0 ? 0.0f : 0.0f);
        ImageVector build = builder.build();
        _back = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
