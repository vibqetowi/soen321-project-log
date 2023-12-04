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
/* compiled from: AppSettingsAlt.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_appSettingsAlt", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AppSettingsAlt", "Landroidx/compose/material/icons/Icons$Filled;", "getAppSettingsAlt", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AppSettingsAltKt {
    private static ImageVector _appSettingsAlt;

    public static final ImageVector getAppSettingsAlt(Icons.Filled filled) {
        ImageVector.Builder m3927addPathoIyEayM;
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = _appSettingsAlt;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.AppSettingsAlt", Dp.m5607constructorimpl(24.0f), Dp.m5607constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m3317getBlack0d7_KjU(), null);
        int m3644getButtKaPHkGw = StrokeCap.Companion.m3644getButtKaPHkGw();
        int m3654getBevelLxFBmk8 = StrokeJoin.Companion.m3654getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.81f, 12.74f);
        pathBuilder.lineToRelative(-0.82f, -0.63f);
        pathBuilder.verticalLineToRelative(-0.22f);
        pathBuilder.lineToRelative(0.8f, -0.63f);
        pathBuilder.curveToRelative(0.16f, -0.12f, 0.2f, -0.34f, 0.1f, -0.51f);
        pathBuilder.lineToRelative(-0.85f, -1.48f);
        pathBuilder.curveToRelative(-0.07f, -0.13f, -0.21f, -0.2f, -0.35f, -0.2f);
        pathBuilder.curveToRelative(-0.05f, 0.0f, -0.1f, 0.01f, -0.15f, 0.03f);
        pathBuilder.lineToRelative(-0.95f, 0.38f);
        pathBuilder.curveToRelative(-0.08f, -0.05f, -0.11f, -0.07f, -0.19f, -0.11f);
        pathBuilder.lineToRelative(-0.15f, -1.01f);
        pathBuilder.curveToRelative(-0.03f, -0.21f, -0.2f, -0.36f, -0.4f, -0.36f);
        pathBuilder.horizontalLineToRelative(-1.71f);
        pathBuilder.curveToRelative(-0.2f, 0.0f, -0.37f, 0.15f, -0.4f, 0.34f);
        pathBuilder.lineToRelative(-0.14f, 1.01f);
        pathBuilder.curveToRelative(-0.03f, 0.02f, -0.07f, 0.03f, -0.1f, 0.05f);
        pathBuilder.lineToRelative(-0.09f, 0.06f);
        pathBuilder.lineToRelative(-0.95f, -0.38f);
        pathBuilder.curveToRelative(-0.05f, -0.02f, -0.1f, -0.03f, -0.15f, -0.03f);
        pathBuilder.curveToRelative(-0.14f, 0.0f, -0.27f, 0.07f, -0.35f, 0.2f);
        pathBuilder.lineToRelative(-0.85f, 1.48f);
        pathBuilder.curveToRelative(-0.1f, 0.17f, -0.06f, 0.39f, 0.1f, 0.51f);
        pathBuilder.lineToRelative(0.8f, 0.63f);
        pathBuilder.verticalLineToRelative(0.23f);
        pathBuilder.lineToRelative(-0.8f, 0.63f);
        pathBuilder.curveToRelative(-0.16f, 0.12f, -0.2f, 0.34f, -0.1f, 0.51f);
        pathBuilder.lineToRelative(0.85f, 1.48f);
        pathBuilder.curveToRelative(0.07f, 0.13f, 0.21f, 0.2f, 0.35f, 0.2f);
        pathBuilder.curveToRelative(0.05f, 0.0f, 0.1f, -0.01f, 0.15f, -0.03f);
        pathBuilder.lineToRelative(0.95f, -0.37f);
        pathBuilder.curveToRelative(0.08f, 0.05f, 0.12f, 0.07f, 0.2f, 0.11f);
        pathBuilder.lineToRelative(0.15f, 1.01f);
        pathBuilder.curveToRelative(0.03f, 0.2f, 0.2f, 0.34f, 0.4f, 0.34f);
        pathBuilder.horizontalLineToRelative(1.71f);
        pathBuilder.curveToRelative(0.2f, 0.0f, 0.37f, -0.15f, 0.4f, -0.34f);
        pathBuilder.lineToRelative(0.15f, -1.01f);
        pathBuilder.curveToRelative(0.03f, -0.02f, 0.07f, -0.03f, 0.1f, -0.05f);
        pathBuilder.lineToRelative(0.09f, -0.06f);
        pathBuilder.lineToRelative(0.95f, 0.38f);
        pathBuilder.curveToRelative(0.05f, 0.02f, 0.1f, 0.03f, 0.15f, 0.03f);
        pathBuilder.curveToRelative(0.14f, 0.0f, 0.27f, -0.07f, 0.35f, -0.2f);
        pathBuilder.lineToRelative(0.85f, -1.48f);
        pathBuilder.curveToRelative(0.1f, -0.17f, 0.06f, -0.39f, -0.1f, -0.51f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 13.5f);
        pathBuilder.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        pathBuilder.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder.reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 17.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.verticalLineTo(3.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.close();
        m3927addPathoIyEayM = builder.m3927addPathoIyEayM(pathBuilder.getNodes(), (r30 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType, (r30 & 4) != 0 ? "" : "", (r30 & 8) != 0 ? null : solidColor, (r30 & 16) != 0 ? 1.0f : 1.0f, (r30 & 32) == 0 ? null : null, (r30 & 64) != 0 ? 1.0f : 1.0f, (r30 & 128) != 0 ? 0.0f : 1.0f, (r30 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : m3644getButtKaPHkGw, (r30 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : m3654getBevelLxFBmk8, (r30 & 1024) != 0 ? 4.0f : 1.0f, (r30 & 2048) != 0 ? 0.0f : 0.0f, (r30 & 4096) == 0 ? 0.0f : 1.0f, (r30 & 8192) == 0 ? 0.0f : 0.0f);
        ImageVector build = m3927addPathoIyEayM.build();
        _appSettingsAlt = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
