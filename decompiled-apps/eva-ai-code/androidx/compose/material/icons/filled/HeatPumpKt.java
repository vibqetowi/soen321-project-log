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
/* compiled from: HeatPump.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_heatPump", "Landroidx/compose/ui/graphics/vector/ImageVector;", "HeatPump", "Landroidx/compose/material/icons/Icons$Filled;", "getHeatPump", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HeatPumpKt {
    private static ImageVector _heatPump;

    public static final ImageVector getHeatPump(Icons.Filled filled) {
        ImageVector.Builder m3927addPathoIyEayM;
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = _heatPump;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.HeatPump", Dp.m5607constructorimpl(24.0f), Dp.m5607constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m3317getBlack0d7_KjU(), null);
        int m3644getButtKaPHkGw = StrokeCap.Companion.m3644getButtKaPHkGw();
        int m3654getBevelLxFBmk8 = StrokeJoin.Companion.m3654getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.0f, 3.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.75f, 7.08f);
        pathBuilder.curveToRelative(0.82f, 0.12f, 1.57f, 0.44f, 2.2f, 0.91f);
        pathBuilder.lineToRelative(-2.2f, 2.2f);
        pathBuilder.verticalLineTo(7.08f);
        pathBuilder.close();
        pathBuilder.moveTo(11.25f, 7.08f);
        pathBuilder.verticalLineToRelative(3.11f);
        pathBuilder.lineToRelative(-2.2f, -2.2f);
        pathBuilder.curveTo(9.68f, 7.52f, 10.43f, 7.2f, 11.25f, 7.08f);
        pathBuilder.close();
        pathBuilder.moveTo(7.99f, 9.05f);
        pathBuilder.lineToRelative(2.2f, 2.2f);
        pathBuilder.horizontalLineTo(7.08f);
        pathBuilder.curveTo(7.2f, 10.43f, 7.52f, 9.68f, 7.99f, 9.05f);
        pathBuilder.close();
        pathBuilder.moveTo(7.08f, 12.75f);
        pathBuilder.horizontalLineToRelative(3.11f);
        pathBuilder.lineToRelative(-2.2f, 2.2f);
        pathBuilder.curveTo(7.52f, 14.32f, 7.2f, 13.57f, 7.08f, 12.75f);
        pathBuilder.close();
        pathBuilder.moveTo(11.25f, 16.92f);
        pathBuilder.curveToRelative(-0.82f, -0.12f, -1.57f, -0.44f, -2.2f, -0.91f);
        pathBuilder.lineToRelative(2.2f, -2.2f);
        pathBuilder.verticalLineTo(16.92f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 13.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.curveTo(13.0f, 12.55f, 12.55f, 13.0f, 12.0f, 13.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.75f, 16.92f);
        pathBuilder.verticalLineToRelative(-3.11f);
        pathBuilder.lineToRelative(2.2f, 2.2f);
        pathBuilder.curveTo(14.32f, 16.48f, 13.57f, 16.8f, 12.75f, 16.92f);
        pathBuilder.close();
        pathBuilder.moveTo(16.01f, 14.95f);
        pathBuilder.lineToRelative(-2.2f, -2.2f);
        pathBuilder.horizontalLineToRelative(3.11f);
        pathBuilder.curveTo(16.8f, 13.57f, 16.48f, 14.32f, 16.01f, 14.95f);
        pathBuilder.close();
        pathBuilder.moveTo(13.81f, 11.25f);
        pathBuilder.lineToRelative(2.2f, -2.2f);
        pathBuilder.curveToRelative(0.47f, 0.64f, 0.79f, 1.39f, 0.91f, 2.2f);
        pathBuilder.horizontalLineTo(13.81f);
        pathBuilder.close();
        m3927addPathoIyEayM = builder.m3927addPathoIyEayM(pathBuilder.getNodes(), (r30 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType, (r30 & 4) != 0 ? "" : "", (r30 & 8) != 0 ? null : solidColor, (r30 & 16) != 0 ? 1.0f : 1.0f, (r30 & 32) == 0 ? null : null, (r30 & 64) != 0 ? 1.0f : 1.0f, (r30 & 128) != 0 ? 0.0f : 1.0f, (r30 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : m3644getButtKaPHkGw, (r30 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : m3654getBevelLxFBmk8, (r30 & 1024) != 0 ? 4.0f : 1.0f, (r30 & 2048) != 0 ? 0.0f : 0.0f, (r30 & 4096) == 0 ? 0.0f : 1.0f, (r30 & 8192) == 0 ? 0.0f : 0.0f);
        ImageVector build = m3927addPathoIyEayM.build();
        _heatPump = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
