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
/* compiled from: Agriculture.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_agriculture", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Agriculture", "Landroidx/compose/material/icons/Icons$Filled;", "getAgriculture", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AgricultureKt {
    private static ImageVector _agriculture;

    public static final ImageVector getAgriculture(Icons.Filled filled) {
        ImageVector.Builder m3927addPathoIyEayM;
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = _agriculture;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Agriculture", Dp.m5607constructorimpl(24.0f), Dp.m5607constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m3317getBlack0d7_KjU(), null);
        int m3644getButtKaPHkGw = StrokeCap.Companion.m3644getButtKaPHkGw();
        int m3654getBevelLxFBmk8 = StrokeJoin.Companion.m3654getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.5f, 12.0f);
        pathBuilder.curveToRelative(0.93f, 0.0f, 1.78f, 0.28f, 2.5f, 0.76f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.horizontalLineToRelative(-6.29f);
        pathBuilder.lineToRelative(-1.06f, -1.06f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineToRelative(-0.71f, -0.71f);
        pathBuilder.lineTo(9.82f, 6.35f);
        pathBuilder.lineToRelative(0.71f, 0.71f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineTo(13.0f, 6.71f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(-0.54f);
        pathBuilder.curveToRelative(0.95f, 1.06f, 1.54f, 2.46f, 1.54f, 4.0f);
        pathBuilder.curveToRelative(0.0f, 0.34f, -0.04f, 0.67f, -0.09f, 1.0f);
        pathBuilder.horizontalLineToRelative(3.14f);
        pathBuilder.curveTo(15.3f, 13.75f, 17.19f, 12.0f, 19.5f, 12.0f);
        pathBuilder.close();
        builder.m3927addPathoIyEayM(pathBuilder.getNodes(), (r30 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType, (r30 & 4) != 0 ? "" : "", (r30 & 8) != 0 ? null : solidColor, (r30 & 16) != 0 ? 1.0f : 1.0f, (r30 & 32) == 0 ? null : null, (r30 & 64) != 0 ? 1.0f : 1.0f, (r30 & 128) != 0 ? 0.0f : 1.0f, (r30 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : m3644getButtKaPHkGw, (r30 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : m3654getBevelLxFBmk8, (r30 & 1024) != 0 ? 4.0f : 1.0f, (r30 & 2048) != 0 ? 0.0f : 0.0f, (r30 & 4096) == 0 ? 0.0f : 1.0f, (r30 & 8192) == 0 ? 0.0f : 0.0f);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(Color.Companion.m3317getBlack0d7_KjU(), null);
        int m3644getButtKaPHkGw2 = StrokeCap.Companion.m3644getButtKaPHkGw();
        int m3654getBevelLxFBmk82 = StrokeJoin.Companion.m3654getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(19.5f, 13.0f);
        pathBuilder2.curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f);
        pathBuilder2.reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f);
        pathBuilder2.reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f);
        pathBuilder2.reflectiveCurveTo(21.43f, 13.0f, 19.5f, 13.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(19.5f, 18.0f);
        pathBuilder2.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder2.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        pathBuilder2.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder2.reflectiveCurveTo(20.33f, 18.0f, 19.5f, 18.0f);
        pathBuilder2.close();
        builder.m3927addPathoIyEayM(pathBuilder2.getNodes(), (r30 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType2, (r30 & 4) != 0 ? "" : "", (r30 & 8) != 0 ? null : solidColor2, (r30 & 16) != 0 ? 1.0f : 1.0f, (r30 & 32) == 0 ? null : null, (r30 & 64) != 0 ? 1.0f : 1.0f, (r30 & 128) != 0 ? 0.0f : 1.0f, (r30 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : m3644getButtKaPHkGw2, (r30 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : m3654getBevelLxFBmk82, (r30 & 1024) != 0 ? 4.0f : 1.0f, (r30 & 2048) != 0 ? 0.0f : 0.0f, (r30 & 4096) == 0 ? 0.0f : 1.0f, (r30 & 8192) == 0 ? 0.0f : 0.0f);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(Color.Companion.m3317getBlack0d7_KjU(), null);
        int m3644getButtKaPHkGw3 = StrokeCap.Companion.m3644getButtKaPHkGw();
        int m3654getBevelLxFBmk83 = StrokeJoin.Companion.m3654getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(4.0f, 9.0f);
        pathBuilder3.horizontalLineToRelative(5.0f);
        pathBuilder3.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder3.horizontalLineTo(4.0f);
        pathBuilder3.curveTo(3.45f, 7.0f, 3.0f, 7.45f, 3.0f, 8.0f);
        pathBuilder3.curveTo(3.0f, 8.55f, 3.45f, 9.0f, 4.0f, 9.0f);
        pathBuilder3.close();
        builder.m3927addPathoIyEayM(pathBuilder3.getNodes(), (r30 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType3, (r30 & 4) != 0 ? "" : "", (r30 & 8) != 0 ? null : solidColor3, (r30 & 16) != 0 ? 1.0f : 1.0f, (r30 & 32) == 0 ? null : null, (r30 & 64) != 0 ? 1.0f : 1.0f, (r30 & 128) != 0 ? 0.0f : 1.0f, (r30 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : m3644getButtKaPHkGw3, (r30 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : m3654getBevelLxFBmk83, (r30 & 1024) != 0 ? 4.0f : 1.0f, (r30 & 2048) != 0 ? 0.0f : 0.0f, (r30 & 4096) == 0 ? 0.0f : 1.0f, (r30 & 8192) == 0 ? 0.0f : 0.0f);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(Color.Companion.m3317getBlack0d7_KjU(), null);
        int m3644getButtKaPHkGw4 = StrokeCap.Companion.m3644getButtKaPHkGw();
        int m3654getBevelLxFBmk84 = StrokeJoin.Companion.m3654getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(9.83f, 13.82f);
        pathBuilder4.lineToRelative(-0.18f, -0.47f);
        pathBuilder4.lineTo(10.58f, 13.0f);
        pathBuilder4.curveToRelative(-0.46f, -1.06f, -1.28f, -1.91f, -2.31f, -2.43f);
        pathBuilder4.lineToRelative(-0.4f, 0.89f);
        pathBuilder4.lineToRelative(-0.46f, -0.21f);
        pathBuilder4.lineToRelative(0.4f, -0.9f);
        pathBuilder4.curveTo(7.26f, 10.13f, 6.64f, 10.0f, 6.0f, 10.0f);
        pathBuilder4.curveToRelative(-0.53f, 0.0f, -1.04f, 0.11f, -1.52f, 0.26f);
        pathBuilder4.lineToRelative(0.34f, 0.91f);
        pathBuilder4.lineToRelative(-0.47f, 0.18f);
        pathBuilder4.lineTo(4.0f, 10.42f);
        pathBuilder4.curveToRelative(-1.06f, 0.46f, -1.91f, 1.28f, -2.43f, 2.31f);
        pathBuilder4.lineToRelative(0.89f, 0.4f);
        pathBuilder4.lineToRelative(-0.21f, 0.46f);
        pathBuilder4.lineToRelative(-0.9f, -0.4f);
        pathBuilder4.curveTo(1.13f, 13.74f, 1.0f, 14.36f, 1.0f, 15.0f);
        pathBuilder4.curveToRelative(0.0f, 0.53f, 0.11f, 1.04f, 0.26f, 1.52f);
        pathBuilder4.lineToRelative(0.91f, -0.34f);
        pathBuilder4.lineToRelative(0.18f, 0.47f);
        pathBuilder4.lineTo(1.42f, 17.0f);
        pathBuilder4.curveToRelative(0.46f, 1.06f, 1.28f, 1.91f, 2.31f, 2.43f);
        pathBuilder4.lineToRelative(0.4f, -0.89f);
        pathBuilder4.lineToRelative(0.46f, 0.21f);
        pathBuilder4.lineToRelative(-0.4f, 0.9f);
        pathBuilder4.curveTo(4.74f, 19.87f, 5.36f, 20.0f, 6.0f, 20.0f);
        pathBuilder4.curveToRelative(0.53f, 0.0f, 1.04f, -0.11f, 1.52f, -0.26f);
        pathBuilder4.lineToRelative(-0.34f, -0.91f);
        pathBuilder4.lineToRelative(0.47f, -0.18f);
        pathBuilder4.lineTo(8.0f, 19.58f);
        pathBuilder4.curveToRelative(1.06f, -0.46f, 1.91f, -1.28f, 2.43f, -2.31f);
        pathBuilder4.lineToRelative(-0.89f, -0.4f);
        pathBuilder4.lineToRelative(0.21f, -0.46f);
        pathBuilder4.lineToRelative(0.9f, 0.4f);
        pathBuilder4.curveTo(10.87f, 16.26f, 11.0f, 15.64f, 11.0f, 15.0f);
        pathBuilder4.curveToRelative(0.0f, -0.53f, -0.11f, -1.04f, -0.26f, -1.52f);
        pathBuilder4.lineTo(9.83f, 13.82f);
        pathBuilder4.close();
        pathBuilder4.moveTo(7.15f, 17.77f);
        pathBuilder4.curveToRelative(-1.53f, 0.63f, -3.29f, -0.09f, -3.92f, -1.62f);
        pathBuilder4.curveToRelative(-0.63f, -1.53f, 0.09f, -3.29f, 1.62f, -3.92f);
        pathBuilder4.curveToRelative(1.53f, -0.63f, 3.29f, 0.09f, 3.92f, 1.62f);
        pathBuilder4.curveTo(9.41f, 15.38f, 8.68f, 17.14f, 7.15f, 17.77f);
        pathBuilder4.close();
        m3927addPathoIyEayM = builder.m3927addPathoIyEayM(pathBuilder4.getNodes(), (r30 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType4, (r30 & 4) != 0 ? "" : "", (r30 & 8) != 0 ? null : solidColor4, (r30 & 16) != 0 ? 1.0f : 1.0f, (r30 & 32) == 0 ? null : null, (r30 & 64) != 0 ? 1.0f : 1.0f, (r30 & 128) != 0 ? 0.0f : 1.0f, (r30 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : m3644getButtKaPHkGw4, (r30 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : m3654getBevelLxFBmk84, (r30 & 1024) != 0 ? 4.0f : 1.0f, (r30 & 2048) != 0 ? 0.0f : 0.0f, (r30 & 4096) == 0 ? 0.0f : 1.0f, (r30 & 8192) == 0 ? 0.0f : 0.0f);
        ImageVector build = m3927addPathoIyEayM.build();
        _agriculture = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
