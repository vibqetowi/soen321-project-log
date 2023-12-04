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
/* compiled from: AddReaction.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_addReaction", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AddReaction", "Landroidx/compose/material/icons/Icons$Filled;", "getAddReaction", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AddReactionKt {
    private static ImageVector _addReaction;

    public static final ImageVector getAddReaction(Icons.Filled filled) {
        ImageVector.Builder m3927addPathoIyEayM;
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = _addReaction;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.AddReaction", Dp.m5607constructorimpl(24.0f), Dp.m5607constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m3317getBlack0d7_KjU(), null);
        int m3644getButtKaPHkGw = StrokeCap.Companion.m3644getButtKaPHkGw();
        int m3654getBevelLxFBmk8 = StrokeJoin.Companion.m3654getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.0f, 9.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineTo(2.84f);
        pathBuilder.curveTo(14.77f, 2.3f, 13.42f, 2.0f, 11.99f, 2.0f);
        pathBuilder.curveTo(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(4.47f, 10.0f, 9.99f, 10.0f);
        pathBuilder.curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -1.05f, -0.17f, -2.05f, -0.47f, -3.0f);
        pathBuilder.horizontalLineTo(18.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.5f, 8.0f);
        pathBuilder.curveTo(16.33f, 8.0f, 17.0f, 8.67f, 17.0f, 9.5f);
        pathBuilder.reflectiveCurveTo(16.33f, 11.0f, 15.5f, 11.0f);
        pathBuilder.reflectiveCurveTo(14.0f, 10.33f, 14.0f, 9.5f);
        pathBuilder.reflectiveCurveTo(14.67f, 8.0f, 15.5f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(8.5f, 8.0f);
        pathBuilder.curveTo(9.33f, 8.0f, 10.0f, 8.67f, 10.0f, 9.5f);
        pathBuilder.reflectiveCurveTo(9.33f, 11.0f, 8.5f, 11.0f);
        pathBuilder.reflectiveCurveTo(7.0f, 10.33f, 7.0f, 9.5f);
        pathBuilder.reflectiveCurveTo(7.67f, 8.0f, 8.5f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 17.5f);
        pathBuilder.curveToRelative(-2.33f, 0.0f, -4.31f, -1.46f, -5.11f, -3.5f);
        pathBuilder.horizontalLineToRelative(10.22f);
        pathBuilder.curveTo(16.31f, 16.04f, 14.33f, 17.5f, 12.0f, 17.5f);
        pathBuilder.close();
        pathBuilder.moveTo(22.0f, 3.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineTo(3.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(1.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(3.0f);
        pathBuilder.close();
        m3927addPathoIyEayM = builder.m3927addPathoIyEayM(pathBuilder.getNodes(), (r30 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType, (r30 & 4) != 0 ? "" : "", (r30 & 8) != 0 ? null : solidColor, (r30 & 16) != 0 ? 1.0f : 1.0f, (r30 & 32) == 0 ? null : null, (r30 & 64) != 0 ? 1.0f : 1.0f, (r30 & 128) != 0 ? 0.0f : 1.0f, (r30 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : m3644getButtKaPHkGw, (r30 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : m3654getBevelLxFBmk8, (r30 & 1024) != 0 ? 4.0f : 1.0f, (r30 & 2048) != 0 ? 0.0f : 0.0f, (r30 & 4096) == 0 ? 0.0f : 1.0f, (r30 & 8192) == 0 ? 0.0f : 0.0f);
        ImageVector build = m3927addPathoIyEayM.build();
        _addReaction = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
