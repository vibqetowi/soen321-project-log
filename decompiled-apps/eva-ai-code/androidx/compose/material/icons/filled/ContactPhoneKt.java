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
/* compiled from: ContactPhone.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_contactPhone", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ContactPhone", "Landroidx/compose/material/icons/Icons$Filled;", "getContactPhone", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ContactPhoneKt {
    private static ImageVector _contactPhone;

    public static final ImageVector getContactPhone(Icons.Filled filled) {
        ImageVector.Builder m3927addPathoIyEayM;
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = _contactPhone;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.ContactPhone", Dp.m5607constructorimpl(24.0f), Dp.m5607constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m3317getBlack0d7_KjU(), null);
        int m3644getButtKaPHkGw = StrokeCap.Companion.m3644getButtKaPHkGw();
        int m3654getBevelLxFBmk8 = StrokeJoin.Companion.m3654getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(22.0f, 3.0f);
        pathBuilder.lineTo(2.0f, 3.0f);
        pathBuilder.curveTo(0.9f, 3.0f, 0.0f, 3.9f, 0.0f, 5.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 1.99f, -0.9f, 1.99f, -2.0f);
        pathBuilder.lineTo(24.0f, 5.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(8.0f, 6.0f);
        pathBuilder.curveToRelative(1.66f, 0.0f, 3.0f, 1.34f, 3.0f, 3.0f);
        pathBuilder.reflectiveCurveToRelative(-1.34f, 3.0f, -3.0f, 3.0f);
        pathBuilder.reflectiveCurveToRelative(-3.0f, -1.34f, -3.0f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(14.0f, 18.0f);
        pathBuilder.lineTo(2.0f, 18.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.curveToRelative(0.0f, -2.0f, 4.0f, -3.1f, 6.0f, -3.1f);
        pathBuilder.reflectiveCurveToRelative(6.0f, 1.1f, 6.0f, 3.1f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.85f, 14.0f);
        pathBuilder.horizontalLineToRelative(1.64f);
        pathBuilder.lineTo(21.0f, 16.0f);
        pathBuilder.lineToRelative(-1.99f, 1.99f);
        pathBuilder.curveToRelative(-1.31f, -0.98f, -2.28f, -2.38f, -2.73f, -3.99f);
        pathBuilder.curveToRelative(-0.18f, -0.64f, -0.28f, -1.31f, -0.28f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(0.1f, -1.36f, 0.28f, -2.0f);
        pathBuilder.curveToRelative(0.45f, -1.62f, 1.42f, -3.01f, 2.73f, -3.99f);
        pathBuilder.lineTo(21.0f, 8.0f);
        pathBuilder.lineToRelative(-1.51f, 2.0f);
        pathBuilder.horizontalLineToRelative(-1.64f);
        pathBuilder.curveToRelative(-0.22f, 0.63f, -0.35f, 1.3f, -0.35f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(0.13f, 1.37f, 0.35f, 2.0f);
        pathBuilder.close();
        m3927addPathoIyEayM = builder.m3927addPathoIyEayM(pathBuilder.getNodes(), (r30 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType, (r30 & 4) != 0 ? "" : "", (r30 & 8) != 0 ? null : solidColor, (r30 & 16) != 0 ? 1.0f : 1.0f, (r30 & 32) == 0 ? null : null, (r30 & 64) != 0 ? 1.0f : 1.0f, (r30 & 128) != 0 ? 0.0f : 1.0f, (r30 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : m3644getButtKaPHkGw, (r30 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : m3654getBevelLxFBmk8, (r30 & 1024) != 0 ? 4.0f : 1.0f, (r30 & 2048) != 0 ? 0.0f : 0.0f, (r30 & 4096) == 0 ? 0.0f : 1.0f, (r30 & 8192) == 0 ? 0.0f : 0.0f);
        ImageVector build = m3927addPathoIyEayM.build();
        _contactPhone = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}