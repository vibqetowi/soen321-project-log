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
/* compiled from: Hub.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_hub", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Hub", "Landroidx/compose/material/icons/Icons$Filled;", "getHub", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HubKt {
    private static ImageVector _hub;

    public static final ImageVector getHub(Icons.Filled filled) {
        ImageVector.Builder m3927addPathoIyEayM;
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = _hub;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Hub", Dp.m5607constructorimpl(24.0f), Dp.m5607constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m3317getBlack0d7_KjU(), null);
        int m3644getButtKaPHkGw = StrokeCap.Companion.m3644getButtKaPHkGw();
        int m3654getBevelLxFBmk8 = StrokeJoin.Companion.m3654getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(8.4f, 18.2f);
        pathBuilder.curveTo(8.78f, 18.7f, 9.0f, 19.32f, 9.0f, 20.0f);
        pathBuilder.curveToRelative(0.0f, 1.66f, -1.34f, 3.0f, -3.0f, 3.0f);
        pathBuilder.reflectiveCurveToRelative(-3.0f, -1.34f, -3.0f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f);
        pathBuilder.curveToRelative(0.44f, 0.0f, 0.85f, 0.09f, 1.23f, 0.26f);
        pathBuilder.lineToRelative(1.41f, -1.77f);
        pathBuilder.curveToRelative(-0.92f, -1.03f, -1.29f, -2.39f, -1.09f, -3.69f);
        pathBuilder.lineToRelative(-2.03f, -0.68f);
        pathBuilder.curveTo(4.98f, 11.95f, 4.06f, 12.5f, 3.0f, 12.5f);
        pathBuilder.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f);
        pathBuilder.curveToRelative(0.0f, 0.07f, 0.0f, 0.14f, -0.01f, 0.21f);
        pathBuilder.lineToRelative(2.03f, 0.68f);
        pathBuilder.curveToRelative(0.64f, -1.21f, 1.82f, -2.09f, 3.22f, -2.32f);
        pathBuilder.lineToRelative(0.0f, -2.16f);
        pathBuilder.curveTo(9.96f, 5.57f, 9.0f, 4.4f, 9.0f, 3.0f);
        pathBuilder.curveToRelative(0.0f, -1.66f, 1.34f, -3.0f, 3.0f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f);
        pathBuilder.curveToRelative(0.0f, 1.4f, -0.96f, 2.57f, -2.25f, 2.91f);
        pathBuilder.verticalLineToRelative(2.16f);
        pathBuilder.curveToRelative(1.4f, 0.23f, 2.58f, 1.11f, 3.22f, 2.32f);
        pathBuilder.lineToRelative(2.03f, -0.68f);
        pathBuilder.curveTo(18.0f, 9.64f, 18.0f, 9.57f, 18.0f, 9.5f);
        pathBuilder.curveToRelative(0.0f, -1.66f, 1.34f, -3.0f, 3.0f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f);
        pathBuilder.reflectiveCurveToRelative(-1.34f, 3.0f, -3.0f, 3.0f);
        pathBuilder.curveToRelative(-1.06f, 0.0f, -1.98f, -0.55f, -2.52f, -1.37f);
        pathBuilder.lineToRelative(-2.03f, 0.68f);
        pathBuilder.curveToRelative(0.2f, 1.29f, -0.16f, 2.65f, -1.09f, 3.69f);
        pathBuilder.lineToRelative(1.41f, 1.77f);
        pathBuilder.curveTo(17.15f, 17.09f, 17.56f, 17.0f, 18.0f, 17.0f);
        pathBuilder.curveToRelative(1.66f, 0.0f, 3.0f, 1.34f, 3.0f, 3.0f);
        pathBuilder.reflectiveCurveToRelative(-1.34f, 3.0f, -3.0f, 3.0f);
        pathBuilder.reflectiveCurveToRelative(-3.0f, -1.34f, -3.0f, -3.0f);
        pathBuilder.curveToRelative(0.0f, -0.68f, 0.22f, -1.3f, 0.6f, -1.8f);
        pathBuilder.lineToRelative(-1.41f, -1.77f);
        pathBuilder.curveToRelative(-1.35f, 0.75f, -3.01f, 0.76f, -4.37f, 0.0f);
        pathBuilder.lineTo(8.4f, 18.2f);
        pathBuilder.close();
        m3927addPathoIyEayM = builder.m3927addPathoIyEayM(pathBuilder.getNodes(), (r30 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType, (r30 & 4) != 0 ? "" : "", (r30 & 8) != 0 ? null : solidColor, (r30 & 16) != 0 ? 1.0f : 1.0f, (r30 & 32) == 0 ? null : null, (r30 & 64) != 0 ? 1.0f : 1.0f, (r30 & 128) != 0 ? 0.0f : 1.0f, (r30 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : m3644getButtKaPHkGw, (r30 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : m3654getBevelLxFBmk8, (r30 & 1024) != 0 ? 4.0f : 1.0f, (r30 & 2048) != 0 ? 0.0f : 0.0f, (r30 & 4096) == 0 ? 0.0f : 1.0f, (r30 & 8192) == 0 ? 0.0f : 0.0f);
        ImageVector build = m3927addPathoIyEayM.build();
        _hub = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
