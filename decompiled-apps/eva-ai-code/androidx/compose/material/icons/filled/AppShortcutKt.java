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
/* compiled from: AppShortcut.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_appShortcut", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AppShortcut", "Landroidx/compose/material/icons/Icons$Filled;", "getAppShortcut", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AppShortcutKt {
    private static ImageVector _appShortcut;

    public static final ImageVector getAppShortcut(Icons.Filled filled) {
        ImageVector.Builder m3927addPathoIyEayM;
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = _appShortcut;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.AppShortcut", Dp.m5607constructorimpl(24.0f), Dp.m5607constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m3317getBlack0d7_KjU(), null);
        int m3644getButtKaPHkGw = StrokeCap.Companion.m3644getButtKaPHkGw();
        int m3654getBevelLxFBmk8 = StrokeJoin.Companion.m3654getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.0f, 18.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(3.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.curveTo(5.9f, 1.0f, 5.0f, 1.9f, 5.0f, 3.0f);
        pathBuilder.verticalLineToRelative(18.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineTo(18.0f);
        pathBuilder.close();
        builder.m3927addPathoIyEayM(pathBuilder.getNodes(), (r30 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType, (r30 & 4) != 0 ? "" : "", (r30 & 8) != 0 ? null : solidColor, (r30 & 16) != 0 ? 1.0f : 1.0f, (r30 & 32) == 0 ? null : null, (r30 & 64) != 0 ? 1.0f : 1.0f, (r30 & 128) != 0 ? 0.0f : 1.0f, (r30 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : m3644getButtKaPHkGw, (r30 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : m3654getBevelLxFBmk8, (r30 & 1024) != 0 ? 4.0f : 1.0f, (r30 & 2048) != 0 ? 0.0f : 0.0f, (r30 & 4096) == 0 ? 0.0f : 1.0f, (r30 & 8192) == 0 ? 0.0f : 0.0f);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(Color.Companion.m3317getBlack0d7_KjU(), null);
        int m3644getButtKaPHkGw2 = StrokeCap.Companion.m3644getButtKaPHkGw();
        int m3654getBevelLxFBmk82 = StrokeJoin.Companion.m3654getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(20.38f, 9.62f);
        pathBuilder2.lineToRelative(0.62f, 1.38f);
        pathBuilder2.lineToRelative(0.62f, -1.38f);
        pathBuilder2.lineToRelative(1.38f, -0.62f);
        pathBuilder2.lineToRelative(-1.38f, -0.62f);
        pathBuilder2.lineToRelative(-0.62f, -1.38f);
        pathBuilder2.lineToRelative(-0.62f, 1.38f);
        pathBuilder2.lineToRelative(-1.38f, 0.62f);
        pathBuilder2.close();
        builder.m3927addPathoIyEayM(pathBuilder2.getNodes(), (r30 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType2, (r30 & 4) != 0 ? "" : "", (r30 & 8) != 0 ? null : solidColor2, (r30 & 16) != 0 ? 1.0f : 1.0f, (r30 & 32) == 0 ? null : null, (r30 & 64) != 0 ? 1.0f : 1.0f, (r30 & 128) != 0 ? 0.0f : 1.0f, (r30 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : m3644getButtKaPHkGw2, (r30 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : m3654getBevelLxFBmk82, (r30 & 1024) != 0 ? 4.0f : 1.0f, (r30 & 2048) != 0 ? 0.0f : 0.0f, (r30 & 4096) == 0 ? 0.0f : 1.0f, (r30 & 8192) == 0 ? 0.0f : 0.0f);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(Color.Companion.m3317getBlack0d7_KjU(), null);
        int m3644getButtKaPHkGw3 = StrokeCap.Companion.m3644getButtKaPHkGw();
        int m3654getBevelLxFBmk83 = StrokeJoin.Companion.m3654getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(16.0f, 8.0f);
        pathBuilder3.lineToRelative(-1.25f, 2.75f);
        pathBuilder3.lineToRelative(-2.75f, 1.25f);
        pathBuilder3.lineToRelative(2.75f, 1.25f);
        pathBuilder3.lineToRelative(1.25f, 2.75f);
        pathBuilder3.lineToRelative(1.25f, -2.75f);
        pathBuilder3.lineToRelative(2.75f, -1.25f);
        pathBuilder3.lineToRelative(-2.75f, -1.25f);
        pathBuilder3.close();
        builder.m3927addPathoIyEayM(pathBuilder3.getNodes(), (r30 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType3, (r30 & 4) != 0 ? "" : "", (r30 & 8) != 0 ? null : solidColor3, (r30 & 16) != 0 ? 1.0f : 1.0f, (r30 & 32) == 0 ? null : null, (r30 & 64) != 0 ? 1.0f : 1.0f, (r30 & 128) != 0 ? 0.0f : 1.0f, (r30 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : m3644getButtKaPHkGw3, (r30 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : m3654getBevelLxFBmk83, (r30 & 1024) != 0 ? 4.0f : 1.0f, (r30 & 2048) != 0 ? 0.0f : 0.0f, (r30 & 4096) == 0 ? 0.0f : 1.0f, (r30 & 8192) == 0 ? 0.0f : 0.0f);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(Color.Companion.m3317getBlack0d7_KjU(), null);
        int m3644getButtKaPHkGw4 = StrokeCap.Companion.m3644getButtKaPHkGw();
        int m3654getBevelLxFBmk84 = StrokeJoin.Companion.m3654getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(21.0f, 13.0f);
        pathBuilder4.lineToRelative(-0.62f, 1.38f);
        pathBuilder4.lineToRelative(-1.38f, 0.62f);
        pathBuilder4.lineToRelative(1.38f, 0.62f);
        pathBuilder4.lineToRelative(0.62f, 1.38f);
        pathBuilder4.lineToRelative(0.62f, -1.38f);
        pathBuilder4.lineToRelative(1.38f, -0.62f);
        pathBuilder4.lineToRelative(-1.38f, -0.62f);
        pathBuilder4.close();
        m3927addPathoIyEayM = builder.m3927addPathoIyEayM(pathBuilder4.getNodes(), (r30 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType4, (r30 & 4) != 0 ? "" : "", (r30 & 8) != 0 ? null : solidColor4, (r30 & 16) != 0 ? 1.0f : 1.0f, (r30 & 32) == 0 ? null : null, (r30 & 64) != 0 ? 1.0f : 1.0f, (r30 & 128) != 0 ? 0.0f : 1.0f, (r30 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : m3644getButtKaPHkGw4, (r30 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : m3654getBevelLxFBmk84, (r30 & 1024) != 0 ? 4.0f : 1.0f, (r30 & 2048) != 0 ? 0.0f : 0.0f, (r30 & 4096) == 0 ? 0.0f : 1.0f, (r30 & 8192) == 0 ? 0.0f : 0.0f);
        ImageVector build = m3927addPathoIyEayM.build();
        _appShortcut = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}