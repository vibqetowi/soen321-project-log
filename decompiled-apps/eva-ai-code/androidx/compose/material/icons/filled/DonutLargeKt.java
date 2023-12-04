package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: DonutLarge.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_donutLarge", "Landroidx/compose/ui/graphics/vector/ImageVector;", "DonutLarge", "Landroidx/compose/material/icons/Icons$Filled;", "getDonutLarge", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DonutLargeKt {
    private static ImageVector _donutLarge;

    public static final ImageVector getDonutLarge(Icons.Filled filled) {
        ImageVector.Builder m3927addPathoIyEayM;
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = _donutLarge;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.DonutLarge", Dp.m5607constructorimpl(24.0f), Dp.m5607constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m3317getBlack0d7_KjU(), null);
        int m3644getButtKaPHkGw = StrokeCap.Companion.m3644getButtKaPHkGw();
        int m3654getBevelLxFBmk8 = StrokeJoin.Companion.m3654getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.0f, 5.08f);
        pathBuilder.verticalLineTo(2.0f);
        pathBuilder.curveTo(6.0f, 2.5f, 2.0f, 6.81f, 2.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(4.0f, 9.5f, 9.0f, 10.0f);
        pathBuilder.verticalLineToRelative(-3.08f);
        pathBuilder.curveToRelative(-3.0f, -0.48f, -6.0f, -3.4f, -6.0f, -6.92f);
        pathBuilder.reflectiveCurveTo(8.0f, 5.56f, 11.0f, 5.08f);
        pathBuilder.close();
        pathBuilder.moveTo(18.97f, 11.0f);
        pathBuilder.horizontalLineTo(22.0f);
        pathBuilder.curveToRelative(-0.47f, -5.0f, -4.0f, -8.53f, -9.0f, -9.0f);
        pathBuilder.verticalLineToRelative(3.08f);
        pathBuilder.curveTo(16.0f, 5.51f, 18.54f, 8.0f, 18.97f, 11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 18.92f);
        pathBuilder.verticalLineTo(22.0f);
        pathBuilder.curveToRelative(5.0f, -0.47f, 8.53f, -4.0f, 9.0f, -9.0f);
        pathBuilder.horizontalLineToRelative(-3.03f);
        pathBuilder.curveTo(18.54f, 16.0f, 16.0f, 18.49f, 13.0f, 18.92f);
        pathBuilder.close();
        m3927addPathoIyEayM = builder.m3927addPathoIyEayM(pathBuilder.getNodes(), (r30 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType, (r30 & 4) != 0 ? "" : "", (r30 & 8) != 0 ? null : solidColor, (r30 & 16) != 0 ? 1.0f : 1.0f, (r30 & 32) == 0 ? null : null, (r30 & 64) != 0 ? 1.0f : 1.0f, (r30 & 128) != 0 ? 0.0f : 1.0f, (r30 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : m3644getButtKaPHkGw, (r30 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : m3654getBevelLxFBmk8, (r30 & 1024) != 0 ? 4.0f : 1.0f, (r30 & 2048) != 0 ? 0.0f : 0.0f, (r30 & 4096) == 0 ? 0.0f : 1.0f, (r30 & 8192) == 0 ? 0.0f : 0.0f);
        ImageVector build = m3927addPathoIyEayM.build();
        _donutLarge = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
