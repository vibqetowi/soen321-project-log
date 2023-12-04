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
/* compiled from: Chalet.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_chalet", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Chalet", "Landroidx/compose/material/icons/Icons$Filled;", "getChalet", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ChaletKt {
    private static ImageVector _chalet;

    public static final ImageVector getChalet(Icons.Filled filled) {
        ImageVector.Builder m3927addPathoIyEayM;
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = _chalet;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Chalet", Dp.m5607constructorimpl(24.0f), Dp.m5607constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m3317getBlack0d7_KjU(), null);
        int m3644getButtKaPHkGw = StrokeCap.Companion.m3644getButtKaPHkGw();
        int m3654getBevelLxFBmk8 = StrokeJoin.Companion.m3654getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.0f, 7.5f);
        pathBuilder.lineToRelative(7.5f, 7.5f);
        pathBuilder.lineToRelative(-1.41f, 1.41f);
        pathBuilder.lineTo(15.0f, 15.33f);
        pathBuilder.verticalLineTo(20.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.verticalLineToRelative(-5.0f);
        pathBuilder.horizontalLineTo(9.0f);
        pathBuilder.verticalLineToRelative(5.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.verticalLineToRelative(-4.67f);
        pathBuilder.lineToRelative(-1.09f, 1.09f);
        pathBuilder.lineTo(2.5f, 15.0f);
        pathBuilder.lineTo(10.0f, 7.5f);
        pathBuilder.close();
        pathBuilder.moveTo(22.0f, 6.5f);
        pathBuilder.horizontalLineToRelative(-1.19f);
        pathBuilder.lineToRelative(0.75f, -0.75f);
        pathBuilder.lineToRelative(-0.71f, -0.71f);
        pathBuilder.lineTo(19.39f, 6.5f);
        pathBuilder.horizontalLineTo(18.5f);
        pathBuilder.verticalLineTo(5.61f);
        pathBuilder.lineToRelative(1.45f, -1.45f);
        pathBuilder.lineToRelative(-0.71f, -0.71f);
        pathBuilder.lineTo(18.5f, 4.19f);
        pathBuilder.verticalLineTo(3.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.verticalLineToRelative(1.19f);
        pathBuilder.lineToRelative(-0.75f, -0.75f);
        pathBuilder.lineToRelative(-0.71f, 0.71f);
        pathBuilder.lineToRelative(1.45f, 1.45f);
        pathBuilder.verticalLineTo(6.5f);
        pathBuilder.horizontalLineToRelative(-0.89f);
        pathBuilder.lineToRelative(-1.45f, -1.45f);
        pathBuilder.lineToRelative(-0.71f, 0.71f);
        pathBuilder.lineToRelative(0.75f, 0.75f);
        pathBuilder.horizontalLineTo(14.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineToRelative(1.19f);
        pathBuilder.lineToRelative(-0.75f, 0.75f);
        pathBuilder.lineToRelative(0.71f, 0.71f);
        pathBuilder.lineToRelative(1.45f, -1.45f);
        pathBuilder.horizontalLineToRelative(0.89f);
        pathBuilder.verticalLineToRelative(0.89f);
        pathBuilder.lineToRelative(-1.45f, 1.45f);
        pathBuilder.lineToRelative(0.71f, 0.71f);
        pathBuilder.lineToRelative(0.75f, -0.75f);
        pathBuilder.verticalLineTo(11.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.verticalLineTo(9.81f);
        pathBuilder.lineToRelative(0.75f, 0.75f);
        pathBuilder.lineToRelative(0.71f, -0.71f);
        pathBuilder.lineTo(18.5f, 8.39f);
        pathBuilder.verticalLineTo(7.5f);
        pathBuilder.horizontalLineToRelative(0.89f);
        pathBuilder.lineToRelative(1.45f, 1.45f);
        pathBuilder.lineToRelative(0.71f, -0.71f);
        pathBuilder.lineTo(20.81f, 7.5f);
        pathBuilder.horizontalLineTo(22.0f);
        pathBuilder.verticalLineTo(6.5f);
        pathBuilder.close();
        m3927addPathoIyEayM = builder.m3927addPathoIyEayM(pathBuilder.getNodes(), (r30 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType, (r30 & 4) != 0 ? "" : "", (r30 & 8) != 0 ? null : solidColor, (r30 & 16) != 0 ? 1.0f : 1.0f, (r30 & 32) == 0 ? null : null, (r30 & 64) != 0 ? 1.0f : 1.0f, (r30 & 128) != 0 ? 0.0f : 1.0f, (r30 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : m3644getButtKaPHkGw, (r30 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : m3654getBevelLxFBmk8, (r30 & 1024) != 0 ? 4.0f : 1.0f, (r30 & 2048) != 0 ? 0.0f : 0.0f, (r30 & 4096) == 0 ? 0.0f : 1.0f, (r30 & 8192) == 0 ? 0.0f : 0.0f);
        ImageVector build = m3927addPathoIyEayM.build();
        _chalet = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
