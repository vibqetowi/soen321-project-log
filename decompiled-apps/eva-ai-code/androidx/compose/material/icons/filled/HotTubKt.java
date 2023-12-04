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
/* compiled from: HotTub.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_hotTub", "Landroidx/compose/ui/graphics/vector/ImageVector;", "HotTub", "Landroidx/compose/material/icons/Icons$Filled;", "getHotTub", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HotTubKt {
    private static ImageVector _hotTub;

    public static final ImageVector getHotTub(Icons.Filled filled) {
        ImageVector.Builder m3927addPathoIyEayM;
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = _hotTub;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.HotTub", Dp.m5607constructorimpl(24.0f), Dp.m5607constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m3317getBlack0d7_KjU(), null);
        int m3644getButtKaPHkGw = StrokeCap.Companion.m3644getButtKaPHkGw();
        int m3654getBevelLxFBmk8 = StrokeJoin.Companion.m3654getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(7.0f, 6.0f);
        pathBuilder.moveToRelative(-2.0f, 0.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f);
        builder.m3927addPathoIyEayM(pathBuilder.getNodes(), (r30 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType, (r30 & 4) != 0 ? "" : "", (r30 & 8) != 0 ? null : solidColor, (r30 & 16) != 0 ? 1.0f : 1.0f, (r30 & 32) == 0 ? null : null, (r30 & 64) != 0 ? 1.0f : 1.0f, (r30 & 128) != 0 ? 0.0f : 1.0f, (r30 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : m3644getButtKaPHkGw, (r30 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : m3654getBevelLxFBmk8, (r30 & 1024) != 0 ? 4.0f : 1.0f, (r30 & 2048) != 0 ? 0.0f : 0.0f, (r30 & 4096) == 0 ? 0.0f : 1.0f, (r30 & 8192) == 0 ? 0.0f : 0.0f);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(Color.Companion.m3317getBlack0d7_KjU(), null);
        int m3644getButtKaPHkGw2 = StrokeCap.Companion.m3644getButtKaPHkGw();
        int m3654getBevelLxFBmk82 = StrokeJoin.Companion.m3654getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(11.15f, 12.0f);
        pathBuilder2.curveToRelative(-0.31f, -0.22f, -0.59f, -0.46f, -0.82f, -0.72f);
        pathBuilder2.lineToRelative(-1.4f, -1.55f);
        pathBuilder2.curveToRelative(-0.19f, -0.21f, -0.43f, -0.38f, -0.69f, -0.5f);
        pathBuilder2.curveToRelative(-0.29f, -0.14f, -0.62f, -0.23f, -0.96f, -0.23f);
        pathBuilder2.horizontalLineToRelative(-0.03f);
        pathBuilder2.curveTo(6.01f, 9.0f, 5.0f, 10.01f, 5.0f, 11.25f);
        pathBuilder2.lineTo(5.0f, 12.0f);
        pathBuilder2.lineTo(2.0f, 12.0f);
        pathBuilder2.verticalLineToRelative(8.0f);
        pathBuilder2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder2.horizontalLineToRelative(16.0f);
        pathBuilder2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder2.verticalLineToRelative(-8.0f);
        pathBuilder2.lineTo(11.15f, 12.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(7.0f, 20.0f);
        pathBuilder2.lineTo(5.0f, 20.0f);
        pathBuilder2.verticalLineToRelative(-6.0f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.verticalLineToRelative(6.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(11.0f, 20.0f);
        pathBuilder2.lineTo(9.0f, 20.0f);
        pathBuilder2.verticalLineToRelative(-6.0f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.verticalLineToRelative(6.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(15.0f, 20.0f);
        pathBuilder2.horizontalLineToRelative(-2.0f);
        pathBuilder2.verticalLineToRelative(-6.0f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.verticalLineToRelative(6.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(19.0f, 20.0f);
        pathBuilder2.horizontalLineToRelative(-2.0f);
        pathBuilder2.verticalLineToRelative(-6.0f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.verticalLineToRelative(6.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(18.65f, 5.86f);
        pathBuilder2.lineToRelative(-0.07f, -0.07f);
        pathBuilder2.curveToRelative(-0.57f, -0.62f, -0.82f, -1.41f, -0.67f, -2.2f);
        pathBuilder2.lineTo(18.0f, 3.0f);
        pathBuilder2.horizontalLineToRelative(-1.89f);
        pathBuilder2.lineToRelative(-0.06f, 0.43f);
        pathBuilder2.curveToRelative(-0.2f, 1.36f, 0.27f, 2.71f, 1.3f, 3.72f);
        pathBuilder2.lineToRelative(0.07f, 0.06f);
        pathBuilder2.curveToRelative(0.57f, 0.62f, 0.82f, 1.41f, 0.67f, 2.2f);
        pathBuilder2.lineToRelative(-0.11f, 0.59f);
        pathBuilder2.horizontalLineToRelative(1.91f);
        pathBuilder2.lineToRelative(0.06f, -0.43f);
        pathBuilder2.curveToRelative(0.21f, -1.36f, -0.27f, -2.71f, -1.3f, -3.71f);
        pathBuilder2.close();
        pathBuilder2.moveTo(14.65f, 5.86f);
        pathBuilder2.lineToRelative(-0.07f, -0.07f);
        pathBuilder2.curveToRelative(-0.57f, -0.62f, -0.82f, -1.41f, -0.67f, -2.2f);
        pathBuilder2.lineTo(14.0f, 3.0f);
        pathBuilder2.horizontalLineToRelative(-1.89f);
        pathBuilder2.lineToRelative(-0.06f, 0.43f);
        pathBuilder2.curveToRelative(-0.2f, 1.36f, 0.27f, 2.71f, 1.3f, 3.72f);
        pathBuilder2.lineToRelative(0.07f, 0.06f);
        pathBuilder2.curveToRelative(0.57f, 0.62f, 0.82f, 1.41f, 0.67f, 2.2f);
        pathBuilder2.lineToRelative(-0.11f, 0.59f);
        pathBuilder2.horizontalLineToRelative(1.91f);
        pathBuilder2.lineToRelative(0.06f, -0.43f);
        pathBuilder2.curveToRelative(0.21f, -1.36f, -0.27f, -2.71f, -1.3f, -3.71f);
        pathBuilder2.close();
        m3927addPathoIyEayM = builder.m3927addPathoIyEayM(pathBuilder2.getNodes(), (r30 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType2, (r30 & 4) != 0 ? "" : "", (r30 & 8) != 0 ? null : solidColor2, (r30 & 16) != 0 ? 1.0f : 1.0f, (r30 & 32) == 0 ? null : null, (r30 & 64) != 0 ? 1.0f : 1.0f, (r30 & 128) != 0 ? 0.0f : 1.0f, (r30 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : m3644getButtKaPHkGw2, (r30 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : m3654getBevelLxFBmk82, (r30 & 1024) != 0 ? 4.0f : 1.0f, (r30 & 2048) != 0 ? 0.0f : 0.0f, (r30 & 4096) == 0 ? 0.0f : 1.0f, (r30 & 8192) == 0 ? 0.0f : 0.0f);
        ImageVector build = m3927addPathoIyEayM.build();
        _hotTub = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
