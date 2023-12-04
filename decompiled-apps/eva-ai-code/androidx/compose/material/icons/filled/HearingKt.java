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
/* compiled from: Hearing.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_hearing", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Hearing", "Landroidx/compose/material/icons/Icons$Filled;", "getHearing", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HearingKt {
    private static ImageVector _hearing;

    public static final ImageVector getHearing(Icons.Filled filled) {
        ImageVector.Builder m3927addPathoIyEayM;
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = _hearing;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Hearing", Dp.m5607constructorimpl(24.0f), Dp.m5607constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m3317getBlack0d7_KjU(), null);
        int m3644getButtKaPHkGw = StrokeCap.Companion.m3644getButtKaPHkGw();
        int m3654getBevelLxFBmk8 = StrokeJoin.Companion.m3654getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.0f, 20.0f);
        pathBuilder.curveToRelative(-0.29f, 0.0f, -0.56f, -0.06f, -0.76f, -0.15f);
        pathBuilder.curveToRelative(-0.71f, -0.37f, -1.21f, -0.88f, -1.71f, -2.38f);
        pathBuilder.curveToRelative(-0.51f, -1.56f, -1.47f, -2.29f, -2.39f, -3.0f);
        pathBuilder.curveToRelative(-0.79f, -0.61f, -1.61f, -1.24f, -2.32f, -2.53f);
        pathBuilder.curveTo(9.29f, 10.98f, 9.0f, 9.93f, 9.0f, 9.0f);
        pathBuilder.curveToRelative(0.0f, -2.8f, 2.2f, -5.0f, 5.0f, -5.0f);
        pathBuilder.reflectiveCurveToRelative(5.0f, 2.2f, 5.0f, 5.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.curveToRelative(0.0f, -3.93f, -3.07f, -7.0f, -7.0f, -7.0f);
        pathBuilder.reflectiveCurveTo(7.0f, 5.07f, 7.0f, 9.0f);
        pathBuilder.curveToRelative(0.0f, 1.26f, 0.38f, 2.65f, 1.07f, 3.9f);
        pathBuilder.curveToRelative(0.91f, 1.65f, 1.98f, 2.48f, 2.85f, 3.15f);
        pathBuilder.curveToRelative(0.81f, 0.62f, 1.39f, 1.07f, 1.71f, 2.05f);
        pathBuilder.curveToRelative(0.6f, 1.82f, 1.37f, 2.84f, 2.73f, 3.55f);
        pathBuilder.curveToRelative(0.51f, 0.23f, 1.07f, 0.35f, 1.64f, 0.35f);
        pathBuilder.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.64f, 2.64f);
        pathBuilder.lineTo(6.22f, 1.22f);
        pathBuilder.curveTo(4.23f, 3.21f, 3.0f, 5.96f, 3.0f, 9.0f);
        pathBuilder.reflectiveCurveToRelative(1.23f, 5.79f, 3.22f, 7.78f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.curveTo(6.01f, 13.74f, 5.0f, 11.49f, 5.0f, 9.0f);
        pathBuilder.reflectiveCurveToRelative(1.01f, -4.74f, 2.64f, -6.36f);
        pathBuilder.close();
        pathBuilder.moveTo(11.5f, 9.0f);
        pathBuilder.curveToRelative(0.0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f);
        pathBuilder.reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f);
        pathBuilder.reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f);
        pathBuilder.reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f);
        pathBuilder.close();
        m3927addPathoIyEayM = builder.m3927addPathoIyEayM(pathBuilder.getNodes(), (r30 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType, (r30 & 4) != 0 ? "" : "", (r30 & 8) != 0 ? null : solidColor, (r30 & 16) != 0 ? 1.0f : 1.0f, (r30 & 32) == 0 ? null : null, (r30 & 64) != 0 ? 1.0f : 1.0f, (r30 & 128) != 0 ? 0.0f : 1.0f, (r30 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : m3644getButtKaPHkGw, (r30 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : m3654getBevelLxFBmk8, (r30 & 1024) != 0 ? 4.0f : 1.0f, (r30 & 2048) != 0 ? 0.0f : 0.0f, (r30 & 4096) == 0 ? 0.0f : 1.0f, (r30 & 8192) == 0 ? 0.0f : 0.0f);
        ImageVector build = m3927addPathoIyEayM.build();
        _hearing = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
