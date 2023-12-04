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
/* compiled from: GroupOff.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_groupOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "GroupOff", "Landroidx/compose/material/icons/Icons$Filled;", "getGroupOff", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GroupOffKt {
    private static ImageVector _groupOff;

    public static final ImageVector getGroupOff(Icons.Filled filled) {
        ImageVector.Builder m3927addPathoIyEayM;
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = _groupOff;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.GroupOff", Dp.m5607constructorimpl(24.0f), Dp.m5607constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m3317getBlack0d7_KjU(), null);
        int m3644getButtKaPHkGw = StrokeCap.Companion.m3644getButtKaPHkGw();
        int m3654getBevelLxFBmk8 = StrokeJoin.Companion.m3654getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.0f, 8.0f);
        pathBuilder.curveToRelative(0.0f, -1.42f, -0.5f, -2.73f, -1.33f, -3.76f);
        pathBuilder.curveTo(14.09f, 4.1f, 14.53f, 4.0f, 15.0f, 4.0f);
        pathBuilder.curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f);
        pathBuilder.reflectiveCurveToRelative(-1.79f, 4.0f, -4.0f, 4.0f);
        pathBuilder.curveToRelative(-0.06f, 0.0f, -0.12f, 0.0f, -0.18f, 0.0f);
        pathBuilder.lineToRelative(-0.77f, -0.77f);
        pathBuilder.curveTo(14.65f, 10.29f, 15.0f, 9.18f, 15.0f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(22.83f, 20.0f);
        pathBuilder.horizontalLineTo(23.0f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.curveToRelative(0.0f, -2.18f, -3.58f, -3.47f, -6.34f, -3.87f);
        pathBuilder.curveToRelative(1.1f, 0.75f, 1.95f, 1.71f, 2.23f, 2.94f);
        pathBuilder.lineTo(22.83f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.24f, 4.41f);
        pathBuilder.curveTo(7.77f, 4.15f, 8.37f, 4.0f, 9.0f, 4.0f);
        pathBuilder.curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f);
        pathBuilder.curveToRelative(0.0f, 0.63f, -0.15f, 1.23f, -0.41f, 1.76f);
        pathBuilder.lineTo(7.24f, 4.41f);
        pathBuilder.close();
        pathBuilder.moveTo(9.17f, 12.0f);
        pathBuilder.curveTo(9.11f, 12.0f, 9.06f, 12.0f, 9.0f, 12.0f);
        pathBuilder.curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f);
        pathBuilder.curveToRelative(0.0f, -0.06f, 0.0f, -0.11f, 0.0f, -0.17f);
        pathBuilder.lineTo(0.69f, 3.51f);
        pathBuilder.lineTo(2.1f, 2.1f);
        pathBuilder.lineToRelative(19.8f, 19.8f);
        pathBuilder.lineToRelative(-1.41f, 1.41f);
        pathBuilder.lineTo(17.0f, 19.83f);
        pathBuilder.verticalLineTo(20.0f);
        pathBuilder.horizontalLineTo(1.0f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.curveToRelative(0.0f, -2.66f, 5.33f, -4.0f, 8.0f, -4.0f);
        pathBuilder.curveToRelative(0.37f, 0.0f, 0.8f, 0.03f, 1.25f, 0.08f);
        pathBuilder.lineTo(9.17f, 12.0f);
        pathBuilder.close();
        m3927addPathoIyEayM = builder.m3927addPathoIyEayM(pathBuilder.getNodes(), (r30 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType, (r30 & 4) != 0 ? "" : "", (r30 & 8) != 0 ? null : solidColor, (r30 & 16) != 0 ? 1.0f : 1.0f, (r30 & 32) == 0 ? null : null, (r30 & 64) != 0 ? 1.0f : 1.0f, (r30 & 128) != 0 ? 0.0f : 1.0f, (r30 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : m3644getButtKaPHkGw, (r30 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : m3654getBevelLxFBmk8, (r30 & 1024) != 0 ? 4.0f : 1.0f, (r30 & 2048) != 0 ? 0.0f : 0.0f, (r30 & 4096) == 0 ? 0.0f : 1.0f, (r30 & 8192) == 0 ? 0.0f : 0.0f);
        ImageVector build = m3927addPathoIyEayM.build();
        _groupOff = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
