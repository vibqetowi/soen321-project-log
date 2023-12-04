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
/* compiled from: AllInclusive.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_allInclusive", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AllInclusive", "Landroidx/compose/material/icons/Icons$Filled;", "getAllInclusive", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AllInclusiveKt {
    private static ImageVector _allInclusive;

    public static final ImageVector getAllInclusive(Icons.Filled filled) {
        ImageVector.Builder m3927addPathoIyEayM;
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = _allInclusive;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.AllInclusive", Dp.m5607constructorimpl(24.0f), Dp.m5607constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m3317getBlack0d7_KjU(), null);
        int m3644getButtKaPHkGw = StrokeCap.Companion.m3644getButtKaPHkGw();
        int m3654getBevelLxFBmk8 = StrokeJoin.Companion.m3654getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.6f, 6.62f);
        pathBuilder.curveToRelative(-1.44f, 0.0f, -2.8f, 0.56f, -3.77f, 1.53f);
        pathBuilder.lineTo(12.0f, 10.66f);
        pathBuilder.lineTo(10.48f, 12.0f);
        pathBuilder.horizontalLineToRelative(0.01f);
        pathBuilder.lineTo(7.8f, 14.39f);
        pathBuilder.curveToRelative(-0.64f, 0.64f, -1.49f, 0.99f, -2.4f, 0.99f);
        pathBuilder.curveToRelative(-1.87f, 0.0f, -3.39f, -1.51f, -3.39f, -3.38f);
        pathBuilder.reflectiveCurveTo(3.53f, 8.62f, 5.4f, 8.62f);
        pathBuilder.curveToRelative(0.91f, 0.0f, 1.76f, 0.35f, 2.44f, 1.03f);
        pathBuilder.lineToRelative(1.13f, 1.0f);
        pathBuilder.lineToRelative(1.51f, -1.34f);
        pathBuilder.lineTo(9.22f, 8.2f);
        pathBuilder.curveTo(8.2f, 7.18f, 6.84f, 6.62f, 5.4f, 6.62f);
        pathBuilder.curveTo(2.42f, 6.62f, 0.0f, 9.04f, 0.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(2.42f, 5.38f, 5.4f, 5.38f);
        pathBuilder.curveToRelative(1.44f, 0.0f, 2.8f, -0.56f, 3.77f, -1.53f);
        pathBuilder.lineToRelative(2.83f, -2.5f);
        pathBuilder.lineToRelative(0.01f, 0.01f);
        pathBuilder.lineTo(13.52f, 12.0f);
        pathBuilder.horizontalLineToRelative(-0.01f);
        pathBuilder.lineToRelative(2.69f, -2.39f);
        pathBuilder.curveToRelative(0.64f, -0.64f, 1.49f, -0.99f, 2.4f, -0.99f);
        pathBuilder.curveToRelative(1.87f, 0.0f, 3.39f, 1.51f, 3.39f, 3.38f);
        pathBuilder.reflectiveCurveToRelative(-1.52f, 3.38f, -3.39f, 3.38f);
        pathBuilder.curveToRelative(-0.9f, 0.0f, -1.76f, -0.35f, -2.44f, -1.03f);
        pathBuilder.lineToRelative(-1.14f, -1.01f);
        pathBuilder.lineToRelative(-1.51f, 1.34f);
        pathBuilder.lineToRelative(1.27f, 1.12f);
        pathBuilder.curveToRelative(1.02f, 1.01f, 2.37f, 1.57f, 3.82f, 1.57f);
        pathBuilder.curveToRelative(2.98f, 0.0f, 5.4f, -2.41f, 5.4f, -5.38f);
        pathBuilder.reflectiveCurveToRelative(-2.42f, -5.37f, -5.4f, -5.37f);
        pathBuilder.close();
        m3927addPathoIyEayM = builder.m3927addPathoIyEayM(pathBuilder.getNodes(), (r30 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType, (r30 & 4) != 0 ? "" : "", (r30 & 8) != 0 ? null : solidColor, (r30 & 16) != 0 ? 1.0f : 1.0f, (r30 & 32) == 0 ? null : null, (r30 & 64) != 0 ? 1.0f : 1.0f, (r30 & 128) != 0 ? 0.0f : 1.0f, (r30 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : m3644getButtKaPHkGw, (r30 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : m3654getBevelLxFBmk8, (r30 & 1024) != 0 ? 4.0f : 1.0f, (r30 & 2048) != 0 ? 0.0f : 0.0f, (r30 & 4096) == 0 ? 0.0f : 1.0f, (r30 & 8192) == 0 ? 0.0f : 0.0f);
        ImageVector build = m3927addPathoIyEayM.build();
        _allInclusive = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
