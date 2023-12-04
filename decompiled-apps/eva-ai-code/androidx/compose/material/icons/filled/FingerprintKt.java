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
import com.ifriend.keychain.KeychainModule;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Fingerprint.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_fingerprint", "Landroidx/compose/ui/graphics/vector/ImageVector;", KeychainModule.FINGERPRINT_SUPPORTED_NAME, "Landroidx/compose/material/icons/Icons$Filled;", "getFingerprint", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FingerprintKt {
    private static ImageVector _fingerprint;

    public static final ImageVector getFingerprint(Icons.Filled filled) {
        ImageVector.Builder m3927addPathoIyEayM;
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = _fingerprint;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Fingerprint", Dp.m5607constructorimpl(24.0f), Dp.m5607constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m3317getBlack0d7_KjU(), null);
        int m3644getButtKaPHkGw = StrokeCap.Companion.m3644getButtKaPHkGw();
        int m3654getBevelLxFBmk8 = StrokeJoin.Companion.m3654getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.81f, 4.47f);
        pathBuilder.curveToRelative(-0.08f, 0.0f, -0.16f, -0.02f, -0.23f, -0.06f);
        pathBuilder.curveTo(15.66f, 3.42f, 14.0f, 3.0f, 12.01f, 3.0f);
        pathBuilder.curveToRelative(-1.98f, 0.0f, -3.86f, 0.47f, -5.57f, 1.41f);
        pathBuilder.curveToRelative(-0.24f, 0.13f, -0.54f, 0.04f, -0.68f, -0.2f);
        pathBuilder.curveToRelative(-0.13f, -0.24f, -0.04f, -0.55f, 0.2f, -0.68f);
        pathBuilder.curveTo(7.82f, 2.52f, 9.86f, 2.0f, 12.01f, 2.0f);
        pathBuilder.curveToRelative(2.13f, 0.0f, 3.99f, 0.47f, 6.03f, 1.52f);
        pathBuilder.curveToRelative(0.25f, 0.13f, 0.34f, 0.43f, 0.21f, 0.67f);
        pathBuilder.curveToRelative(-0.09f, 0.18f, -0.26f, 0.28f, -0.44f, 0.28f);
        pathBuilder.close();
        pathBuilder.moveTo(3.5f, 9.72f);
        pathBuilder.curveToRelative(-0.1f, 0.0f, -0.2f, -0.03f, -0.29f, -0.09f);
        pathBuilder.curveToRelative(-0.23f, -0.16f, -0.28f, -0.47f, -0.12f, -0.7f);
        pathBuilder.curveToRelative(0.99f, -1.4f, 2.25f, -2.5f, 3.75f, -3.27f);
        pathBuilder.curveTo(9.98f, 4.04f, 14.0f, 4.03f, 17.15f, 5.65f);
        pathBuilder.curveToRelative(1.5f, 0.77f, 2.76f, 1.86f, 3.75f, 3.25f);
        pathBuilder.curveToRelative(0.16f, 0.22f, 0.11f, 0.54f, -0.12f, 0.7f);
        pathBuilder.curveToRelative(-0.23f, 0.16f, -0.54f, 0.11f, -0.7f, -0.12f);
        pathBuilder.curveToRelative(-0.9f, -1.26f, -2.04f, -2.25f, -3.39f, -2.94f);
        pathBuilder.curveToRelative(-2.87f, -1.47f, -6.54f, -1.47f, -9.4f, 0.01f);
        pathBuilder.curveToRelative(-1.36f, 0.7f, -2.5f, 1.7f, -3.4f, 2.96f);
        pathBuilder.curveToRelative(-0.08f, 0.14f, -0.23f, 0.21f, -0.39f, 0.21f);
        pathBuilder.close();
        pathBuilder.moveTo(9.75f, 21.79f);
        pathBuilder.curveToRelative(-0.13f, 0.0f, -0.26f, -0.05f, -0.35f, -0.15f);
        pathBuilder.curveToRelative(-0.87f, -0.87f, -1.34f, -1.43f, -2.01f, -2.64f);
        pathBuilder.curveToRelative(-0.69f, -1.23f, -1.05f, -2.73f, -1.05f, -4.34f);
        pathBuilder.curveToRelative(0.0f, -2.97f, 2.54f, -5.39f, 5.66f, -5.39f);
        pathBuilder.reflectiveCurveToRelative(5.66f, 2.42f, 5.66f, 5.39f);
        pathBuilder.curveToRelative(0.0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f);
        pathBuilder.reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f);
        pathBuilder.curveToRelative(0.0f, -2.42f, -2.09f, -4.39f, -4.66f, -4.39f);
        pathBuilder.curveToRelative(-2.57f, 0.0f, -4.66f, 1.97f, -4.66f, 4.39f);
        pathBuilder.curveToRelative(0.0f, 1.44f, 0.32f, 2.77f, 0.93f, 3.85f);
        pathBuilder.curveToRelative(0.64f, 1.15f, 1.08f, 1.64f, 1.85f, 2.42f);
        pathBuilder.curveToRelative(0.19f, 0.2f, 0.19f, 0.51f, 0.0f, 0.71f);
        pathBuilder.curveToRelative(-0.11f, 0.1f, -0.24f, 0.15f, -0.37f, 0.15f);
        pathBuilder.close();
        pathBuilder.moveTo(16.92f, 19.94f);
        pathBuilder.curveToRelative(-1.19f, 0.0f, -2.24f, -0.3f, -3.1f, -0.89f);
        pathBuilder.curveToRelative(-1.49f, -1.01f, -2.38f, -2.65f, -2.38f, -4.39f);
        pathBuilder.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilder.reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f);
        pathBuilder.curveToRelative(0.0f, 1.41f, 0.72f, 2.74f, 1.94f, 3.56f);
        pathBuilder.curveToRelative(0.71f, 0.48f, 1.54f, 0.71f, 2.54f, 0.71f);
        pathBuilder.curveToRelative(0.24f, 0.0f, 0.64f, -0.03f, 1.04f, -0.1f);
        pathBuilder.curveToRelative(0.27f, -0.05f, 0.53f, 0.13f, 0.58f, 0.41f);
        pathBuilder.curveToRelative(0.05f, 0.27f, -0.13f, 0.53f, -0.41f, 0.58f);
        pathBuilder.curveToRelative(-0.57f, 0.11f, -1.07f, 0.12f, -1.21f, 0.12f);
        pathBuilder.close();
        pathBuilder.moveTo(14.91f, 22.0f);
        pathBuilder.curveToRelative(-0.04f, 0.0f, -0.09f, -0.01f, -0.13f, -0.02f);
        pathBuilder.curveToRelative(-1.59f, -0.44f, -2.63f, -1.03f, -3.72f, -2.1f);
        pathBuilder.curveToRelative(-1.4f, -1.39f, -2.17f, -3.24f, -2.17f, -5.22f);
        pathBuilder.curveToRelative(0.0f, -1.62f, 1.38f, -2.94f, 3.08f, -2.94f);
        pathBuilder.curveToRelative(1.7f, 0.0f, 3.08f, 1.32f, 3.08f, 2.94f);
        pathBuilder.curveToRelative(0.0f, 1.07f, 0.93f, 1.94f, 2.08f, 1.94f);
        pathBuilder.reflectiveCurveToRelative(2.08f, -0.87f, 2.08f, -1.94f);
        pathBuilder.curveToRelative(0.0f, -3.77f, -3.25f, -6.83f, -7.25f, -6.83f);
        pathBuilder.curveToRelative(-2.84f, 0.0f, -5.44f, 1.58f, -6.61f, 4.03f);
        pathBuilder.curveToRelative(-0.39f, 0.81f, -0.59f, 1.76f, -0.59f, 2.8f);
        pathBuilder.curveToRelative(0.0f, 0.78f, 0.07f, 2.01f, 0.67f, 3.61f);
        pathBuilder.curveToRelative(0.1f, 0.26f, -0.03f, 0.55f, -0.29f, 0.64f);
        pathBuilder.curveToRelative(-0.26f, 0.1f, -0.55f, -0.04f, -0.64f, -0.29f);
        pathBuilder.curveToRelative(-0.49f, -1.31f, -0.73f, -2.61f, -0.73f, -3.96f);
        pathBuilder.curveToRelative(0.0f, -1.2f, 0.23f, -2.29f, 0.68f, -3.24f);
        pathBuilder.curveToRelative(1.33f, -2.79f, 4.28f, -4.6f, 7.51f, -4.6f);
        pathBuilder.curveToRelative(4.55f, 0.0f, 8.25f, 3.51f, 8.25f, 7.83f);
        pathBuilder.curveToRelative(0.0f, 1.62f, -1.38f, 2.94f, -3.08f, 2.94f);
        pathBuilder.reflectiveCurveToRelative(-3.08f, -1.32f, -3.08f, -2.94f);
        pathBuilder.curveToRelative(0.0f, -1.07f, -0.93f, -1.94f, -2.08f, -1.94f);
        pathBuilder.reflectiveCurveToRelative(-2.08f, 0.87f, -2.08f, 1.94f);
        pathBuilder.curveToRelative(0.0f, 1.71f, 0.66f, 3.31f, 1.87f, 4.51f);
        pathBuilder.curveToRelative(0.95f, 0.94f, 1.86f, 1.46f, 3.27f, 1.85f);
        pathBuilder.curveToRelative(0.27f, 0.07f, 0.42f, 0.35f, 0.35f, 0.61f);
        pathBuilder.curveToRelative(-0.05f, 0.23f, -0.26f, 0.38f, -0.47f, 0.38f);
        pathBuilder.close();
        m3927addPathoIyEayM = builder.m3927addPathoIyEayM(pathBuilder.getNodes(), (r30 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType, (r30 & 4) != 0 ? "" : "", (r30 & 8) != 0 ? null : solidColor, (r30 & 16) != 0 ? 1.0f : 1.0f, (r30 & 32) == 0 ? null : null, (r30 & 64) != 0 ? 1.0f : 1.0f, (r30 & 128) != 0 ? 0.0f : 1.0f, (r30 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : m3644getButtKaPHkGw, (r30 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : m3654getBevelLxFBmk8, (r30 & 1024) != 0 ? 4.0f : 1.0f, (r30 & 2048) != 0 ? 0.0f : 0.0f, (r30 & 4096) == 0 ? 0.0f : 1.0f, (r30 & 8192) == 0 ? 0.0f : 0.0f);
        ImageVector build = m3927addPathoIyEayM.build();
        _fingerprint = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
