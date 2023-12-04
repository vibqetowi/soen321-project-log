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
/* compiled from: Hail.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_hail", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Hail", "Landroidx/compose/material/icons/Icons$Filled;", "getHail", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HailKt {
    private static ImageVector _hail;

    public static final ImageVector getHail(Icons.Filled filled) {
        ImageVector.Builder m3927addPathoIyEayM;
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = _hail;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Hail", Dp.m5607constructorimpl(24.0f), Dp.m5607constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m3317getBlack0d7_KjU(), null);
        int m3644getButtKaPHkGw = StrokeCap.Companion.m3644getButtKaPHkGw();
        int m3654getBevelLxFBmk8 = StrokeJoin.Companion.m3654getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 6.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(0.4f);
        pathBuilder.curveToRelative(-0.1f, 2.2f, -0.8f, 3.9f, -2.3f, 5.1f);
        pathBuilder.curveToRelative(-0.5f, 0.4f, -1.1f, 0.7f, -1.7f, 0.9f);
        pathBuilder.lineTo(15.0f, 22.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-6.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.lineTo(9.0f, 22.0f);
        pathBuilder.lineTo(9.0f, 10.1f);
        pathBuilder.curveToRelative(-0.3f, 0.1f, -0.5f, 0.2f, -0.6f, 0.3f);
        pathBuilder.curveToRelative(-0.9f, 0.7f, -1.39f, 1.6f, -1.4f, 3.1f);
        pathBuilder.verticalLineToRelative(0.5f);
        pathBuilder.lineTo(5.0f, 14.0f);
        pathBuilder.verticalLineToRelative(-0.5f);
        pathBuilder.curveToRelative(0.0f, -2.0f, 0.71f, -3.59f, 2.11f, -4.79f);
        pathBuilder.curveTo(8.21f, 7.81f, 10.0f, 7.0f, 12.0f, 7.0f);
        pathBuilder.reflectiveCurveToRelative(2.68f, -0.46f, 3.48f, -1.06f);
        pathBuilder.curveTo(16.48f, 5.14f, 17.0f, 4.0f, 17.0f, 2.5f);
        pathBuilder.lineTo(17.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(4.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.lineTo(4.0f, 22.0f);
        pathBuilder.verticalLineToRelative(-6.0f);
        pathBuilder.close();
        m3927addPathoIyEayM = builder.m3927addPathoIyEayM(pathBuilder.getNodes(), (r30 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType, (r30 & 4) != 0 ? "" : "", (r30 & 8) != 0 ? null : solidColor, (r30 & 16) != 0 ? 1.0f : 1.0f, (r30 & 32) == 0 ? null : null, (r30 & 64) != 0 ? 1.0f : 1.0f, (r30 & 128) != 0 ? 0.0f : 1.0f, (r30 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : m3644getButtKaPHkGw, (r30 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : m3654getBevelLxFBmk8, (r30 & 1024) != 0 ? 4.0f : 1.0f, (r30 & 2048) != 0 ? 0.0f : 0.0f, (r30 & 4096) == 0 ? 0.0f : 1.0f, (r30 & 8192) == 0 ? 0.0f : 0.0f);
        ImageVector build = m3927addPathoIyEayM.build();
        _hail = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
