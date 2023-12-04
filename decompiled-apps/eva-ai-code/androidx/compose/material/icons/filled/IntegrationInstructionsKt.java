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
/* compiled from: IntegrationInstructions.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_integrationInstructions", "Landroidx/compose/ui/graphics/vector/ImageVector;", "IntegrationInstructions", "Landroidx/compose/material/icons/Icons$Filled;", "getIntegrationInstructions", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class IntegrationInstructionsKt {
    private static ImageVector _integrationInstructions;

    public static final ImageVector getIntegrationInstructions(Icons.Filled filled) {
        ImageVector.Builder m3927addPathoIyEayM;
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = _integrationInstructions;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.IntegrationInstructions", Dp.m5607constructorimpl(24.0f), Dp.m5607constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m3317getBlack0d7_KjU(), null);
        int m3644getButtKaPHkGw = StrokeCap.Companion.m3644getButtKaPHkGw();
        int m3654getBevelLxFBmk8 = StrokeJoin.Companion.m3654getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.0f, 3.0f);
        pathBuilder.horizontalLineToRelative(-4.18f);
        pathBuilder.curveTo(14.4f, 1.84f, 13.3f, 1.0f, 12.0f, 1.0f);
        pathBuilder.reflectiveCurveTo(9.6f, 1.84f, 9.18f, 3.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.curveTo(4.86f, 3.0f, 4.73f, 3.01f, 4.6f, 3.04f);
        pathBuilder.curveTo(4.21f, 3.12f, 3.86f, 3.32f, 3.59f, 3.59f);
        pathBuilder.curveToRelative(-0.18f, 0.18f, -0.33f, 0.4f, -0.43f, 0.64f);
        pathBuilder.curveTo(3.06f, 4.46f, 3.0f, 4.72f, 3.0f, 5.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.curveToRelative(0.0f, 0.27f, 0.06f, 0.54f, 0.16f, 0.78f);
        pathBuilder.curveToRelative(0.1f, 0.24f, 0.25f, 0.45f, 0.43f, 0.64f);
        pathBuilder.curveToRelative(0.27f, 0.27f, 0.62f, 0.47f, 1.01f, 0.55f);
        pathBuilder.curveTo(4.73f, 20.99f, 4.86f, 21.0f, 5.0f, 21.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 14.17f);
        pathBuilder.lineToRelative(-1.41f, 1.42f);
        pathBuilder.lineTo(6.0f, 12.0f);
        pathBuilder.lineToRelative(3.59f, -3.59f);
        pathBuilder.lineTo(11.0f, 9.83f);
        pathBuilder.lineTo(8.83f, 12.0f);
        pathBuilder.lineTo(11.0f, 14.17f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 4.25f);
        pathBuilder.curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f);
        pathBuilder.reflectiveCurveTo(11.59f, 2.75f, 12.0f, 2.75f);
        pathBuilder.reflectiveCurveToRelative(0.75f, 0.34f, 0.75f, 0.75f);
        pathBuilder.reflectiveCurveTo(12.41f, 4.25f, 12.0f, 4.25f);
        pathBuilder.close();
        pathBuilder.moveTo(14.41f, 15.59f);
        pathBuilder.lineTo(13.0f, 14.17f);
        pathBuilder.lineTo(15.17f, 12.0f);
        pathBuilder.lineTo(13.0f, 9.83f);
        pathBuilder.lineToRelative(1.41f, -1.42f);
        pathBuilder.lineTo(18.0f, 12.0f);
        pathBuilder.lineTo(14.41f, 15.59f);
        pathBuilder.close();
        m3927addPathoIyEayM = builder.m3927addPathoIyEayM(pathBuilder.getNodes(), (r30 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType, (r30 & 4) != 0 ? "" : "", (r30 & 8) != 0 ? null : solidColor, (r30 & 16) != 0 ? 1.0f : 1.0f, (r30 & 32) == 0 ? null : null, (r30 & 64) != 0 ? 1.0f : 1.0f, (r30 & 128) != 0 ? 0.0f : 1.0f, (r30 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : m3644getButtKaPHkGw, (r30 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : m3654getBevelLxFBmk8, (r30 & 1024) != 0 ? 4.0f : 1.0f, (r30 & 2048) != 0 ? 0.0f : 0.0f, (r30 & 4096) == 0 ? 0.0f : 1.0f, (r30 & 8192) == 0 ? 0.0f : 0.0f);
        ImageVector build = m3927addPathoIyEayM.build();
        _integrationInstructions = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
