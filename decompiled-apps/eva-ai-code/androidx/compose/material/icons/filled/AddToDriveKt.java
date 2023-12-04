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
/* compiled from: AddToDrive.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_addToDrive", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AddToDrive", "Landroidx/compose/material/icons/Icons$Filled;", "getAddToDrive", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AddToDriveKt {
    private static ImageVector _addToDrive;

    public static final ImageVector getAddToDrive(Icons.Filled filled) {
        ImageVector.Builder m3927addPathoIyEayM;
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = _addToDrive;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.AddToDrive", Dp.m5607constructorimpl(24.0f), Dp.m5607constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m3317getBlack0d7_KjU(), null);
        int m3644getButtKaPHkGw = StrokeCap.Companion.m3644getButtKaPHkGw();
        int m3654getBevelLxFBmk8 = StrokeJoin.Companion.m3654getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.0f, 21.0f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineTo(20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.03f, 21.5f);
        pathBuilder.horizontalLineTo(5.66f);
        pathBuilder.curveToRelative(-0.72f, 0.0f, -1.38f, -0.38f, -1.73f, -1.0f);
        pathBuilder.lineTo(1.57f, 16.4f);
        pathBuilder.curveToRelative(-0.36f, -0.62f, -0.35f, -1.38f, 0.01f, -2.0f);
        pathBuilder.lineTo(7.92f, 3.49f);
        pathBuilder.curveTo(8.28f, 2.88f, 8.94f, 2.5f, 9.65f, 2.5f);
        pathBuilder.horizontalLineToRelative(4.7f);
        pathBuilder.curveToRelative(0.71f, 0.0f, 1.37f, 0.38f, 1.73f, 0.99f);
        pathBuilder.lineToRelative(4.48f, 7.71f);
        pathBuilder.curveTo(20.06f, 11.07f, 19.54f, 11.0f, 19.0f, 11.0f);
        pathBuilder.curveToRelative(-0.28f, 0.0f, -0.56f, 0.02f, -0.84f, 0.06f);
        pathBuilder.lineTo(14.35f, 4.5f);
        pathBuilder.horizontalLineToRelative(-4.7f);
        pathBuilder.lineTo(3.31f, 15.41f);
        pathBuilder.lineToRelative(2.35f, 4.09f);
        pathBuilder.horizontalLineToRelative(7.89f);
        pathBuilder.curveTo(13.9f, 20.27f, 14.4f, 20.95f, 15.03f, 21.5f);
        pathBuilder.close();
        pathBuilder.moveTo(13.34f, 15.0f);
        pathBuilder.curveTo(13.12f, 15.63f, 13.0f, 16.3f, 13.0f, 17.0f);
        pathBuilder.horizontalLineTo(7.25f);
        pathBuilder.lineToRelative(-0.73f, -1.27f);
        pathBuilder.lineToRelative(4.58f, -7.98f);
        pathBuilder.horizontalLineToRelative(1.8f);
        pathBuilder.lineToRelative(2.53f, 4.42f);
        pathBuilder.curveToRelative(-0.56f, 0.42f, -1.05f, 0.93f, -1.44f, 1.51f);
        pathBuilder.lineToRelative(-2.0f, -3.49f);
        pathBuilder.lineTo(9.25f, 15.0f);
        pathBuilder.horizontalLineTo(13.34f);
        pathBuilder.close();
        m3927addPathoIyEayM = builder.m3927addPathoIyEayM(pathBuilder.getNodes(), (r30 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType, (r30 & 4) != 0 ? "" : "", (r30 & 8) != 0 ? null : solidColor, (r30 & 16) != 0 ? 1.0f : 1.0f, (r30 & 32) == 0 ? null : null, (r30 & 64) != 0 ? 1.0f : 1.0f, (r30 & 128) != 0 ? 0.0f : 1.0f, (r30 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : m3644getButtKaPHkGw, (r30 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : m3654getBevelLxFBmk8, (r30 & 1024) != 0 ? 4.0f : 1.0f, (r30 & 2048) != 0 ? 0.0f : 0.0f, (r30 & 4096) == 0 ? 0.0f : 1.0f, (r30 & 8192) == 0 ? 0.0f : 0.0f);
        ImageVector build = m3927addPathoIyEayM.build();
        _addToDrive = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
