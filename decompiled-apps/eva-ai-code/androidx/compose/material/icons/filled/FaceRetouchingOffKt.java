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
/* compiled from: FaceRetouchingOff.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_faceRetouchingOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "FaceRetouchingOff", "Landroidx/compose/material/icons/Icons$Filled;", "getFaceRetouchingOff", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FaceRetouchingOffKt {
    private static ImageVector _faceRetouchingOff;

    public static final ImageVector getFaceRetouchingOff(Icons.Filled filled) {
        ImageVector.Builder m3927addPathoIyEayM;
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = _faceRetouchingOff;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.FaceRetouchingOff", Dp.m5607constructorimpl(24.0f), Dp.m5607constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m3317getBlack0d7_KjU(), null);
        int m3644getButtKaPHkGw = StrokeCap.Companion.m3644getButtKaPHkGw();
        int m3654getBevelLxFBmk8 = StrokeJoin.Companion.m3654getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.0f, 13.0f);
        pathBuilder.moveToRelative(-1.25f, 0.0f);
        pathBuilder.arcToRelative(1.25f, 1.25f, 0.0f, true, true, 2.5f, 0.0f);
        pathBuilder.arcToRelative(1.25f, 1.25f, 0.0f, true, true, -2.5f, 0.0f);
        builder.m3927addPathoIyEayM(pathBuilder.getNodes(), (r30 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType, (r30 & 4) != 0 ? "" : "", (r30 & 8) != 0 ? null : solidColor, (r30 & 16) != 0 ? 1.0f : 1.0f, (r30 & 32) == 0 ? null : null, (r30 & 64) != 0 ? 1.0f : 1.0f, (r30 & 128) != 0 ? 0.0f : 1.0f, (r30 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : m3644getButtKaPHkGw, (r30 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : m3654getBevelLxFBmk8, (r30 & 1024) != 0 ? 4.0f : 1.0f, (r30 & 2048) != 0 ? 0.0f : 0.0f, (r30 & 4096) == 0 ? 0.0f : 1.0f, (r30 & 8192) == 0 ? 0.0f : 0.0f);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(Color.Companion.m3317getBlack0d7_KjU(), null);
        int m3644getButtKaPHkGw2 = StrokeCap.Companion.m3644getButtKaPHkGw();
        int m3654getBevelLxFBmk82 = StrokeJoin.Companion.m3654getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(17.5f, 10.0f);
        pathBuilder2.curveToRelative(0.75f, 0.0f, 1.47f, -0.09f, 2.17f, -0.24f);
        pathBuilder2.curveTo(19.88f, 10.47f, 20.0f, 11.22f, 20.0f, 12.0f);
        pathBuilder2.curveToRelative(0.0f, 1.22f, -0.28f, 2.37f, -0.77f, 3.4f);
        pathBuilder2.lineToRelative(1.49f, 1.49f);
        pathBuilder2.curveTo(21.53f, 15.44f, 22.0f, 13.78f, 22.0f, 12.0f);
        pathBuilder2.curveToRelative(0.0f, -5.52f, -4.48f, -10.0f, -10.0f, -10.0f);
        pathBuilder2.curveToRelative(-1.78f, 0.0f, -3.44f, 0.47f, -4.89f, 1.28f);
        pathBuilder2.lineToRelative(5.33f, 5.33f);
        pathBuilder2.curveTo(13.93f, 9.49f, 15.65f, 10.0f, 17.5f, 10.0f);
        pathBuilder2.close();
        builder.m3927addPathoIyEayM(pathBuilder2.getNodes(), (r30 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType2, (r30 & 4) != 0 ? "" : "", (r30 & 8) != 0 ? null : solidColor2, (r30 & 16) != 0 ? 1.0f : 1.0f, (r30 & 32) == 0 ? null : null, (r30 & 64) != 0 ? 1.0f : 1.0f, (r30 & 128) != 0 ? 0.0f : 1.0f, (r30 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : m3644getButtKaPHkGw2, (r30 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : m3654getBevelLxFBmk82, (r30 & 1024) != 0 ? 4.0f : 1.0f, (r30 & 2048) != 0 ? 0.0f : 0.0f, (r30 & 4096) == 0 ? 0.0f : 1.0f, (r30 & 8192) == 0 ? 0.0f : 0.0f);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(Color.Companion.m3317getBlack0d7_KjU(), null);
        int m3644getButtKaPHkGw3 = StrokeCap.Companion.m3644getButtKaPHkGw();
        int m3654getBevelLxFBmk83 = StrokeJoin.Companion.m3654getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(1.89f, 3.72f);
        pathBuilder3.lineToRelative(2.19f, 2.19f);
        pathBuilder3.curveTo(2.78f, 7.6f, 2.0f, 9.71f, 2.0f, 12.0f);
        pathBuilder3.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder3.curveToRelative(2.29f, 0.0f, 4.4f, -0.78f, 6.09f, -2.08f);
        pathBuilder3.lineToRelative(2.19f, 2.19f);
        pathBuilder3.lineToRelative(1.41f, -1.41f);
        pathBuilder3.lineTo(3.31f, 2.31f);
        pathBuilder3.lineTo(1.89f, 3.72f);
        pathBuilder3.close();
        pathBuilder3.moveTo(16.66f, 18.49f);
        pathBuilder3.curveTo(15.35f, 19.44f, 13.74f, 20.0f, 12.0f, 20.0f);
        pathBuilder3.curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        pathBuilder3.curveToRelative(0.0f, -0.05f, 0.01f, -0.1f, 0.0f, -0.14f);
        pathBuilder3.curveToRelative(1.39f, -0.52f, 2.63f, -1.35f, 3.64f, -2.39f);
        pathBuilder3.lineTo(16.66f, 18.49f);
        pathBuilder3.close();
        m3927addPathoIyEayM = builder.m3927addPathoIyEayM(pathBuilder3.getNodes(), (r30 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType3, (r30 & 4) != 0 ? "" : "", (r30 & 8) != 0 ? null : solidColor3, (r30 & 16) != 0 ? 1.0f : 1.0f, (r30 & 32) == 0 ? null : null, (r30 & 64) != 0 ? 1.0f : 1.0f, (r30 & 128) != 0 ? 0.0f : 1.0f, (r30 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : m3644getButtKaPHkGw3, (r30 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : m3654getBevelLxFBmk83, (r30 & 1024) != 0 ? 4.0f : 1.0f, (r30 & 2048) != 0 ? 0.0f : 0.0f, (r30 & 4096) == 0 ? 0.0f : 1.0f, (r30 & 8192) == 0 ? 0.0f : 0.0f);
        ImageVector build = m3927addPathoIyEayM.build();
        _faceRetouchingOff = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
