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
/* compiled from: EmojiPeople.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_emojiPeople", "Landroidx/compose/ui/graphics/vector/ImageVector;", "EmojiPeople", "Landroidx/compose/material/icons/Icons$Filled;", "getEmojiPeople", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EmojiPeopleKt {
    private static ImageVector _emojiPeople;

    public static final ImageVector getEmojiPeople(Icons.Filled filled) {
        ImageVector.Builder m3927addPathoIyEayM;
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = _emojiPeople;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.EmojiPeople", Dp.m5607constructorimpl(24.0f), Dp.m5607constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m3317getBlack0d7_KjU(), null);
        int m3644getButtKaPHkGw = StrokeCap.Companion.m3644getButtKaPHkGw();
        int m3654getBevelLxFBmk8 = StrokeJoin.Companion.m3654getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 4.0f);
        pathBuilder.moveToRelative(-2.0f, 0.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f);
        builder.m3927addPathoIyEayM(pathBuilder.getNodes(), (r30 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType, (r30 & 4) != 0 ? "" : "", (r30 & 8) != 0 ? null : solidColor, (r30 & 16) != 0 ? 1.0f : 1.0f, (r30 & 32) == 0 ? null : null, (r30 & 64) != 0 ? 1.0f : 1.0f, (r30 & 128) != 0 ? 0.0f : 1.0f, (r30 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : m3644getButtKaPHkGw, (r30 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : m3654getBevelLxFBmk8, (r30 & 1024) != 0 ? 4.0f : 1.0f, (r30 & 2048) != 0 ? 0.0f : 0.0f, (r30 & 4096) == 0 ? 0.0f : 1.0f, (r30 & 8192) == 0 ? 0.0f : 0.0f);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(Color.Companion.m3317getBlack0d7_KjU(), null);
        int m3644getButtKaPHkGw2 = StrokeCap.Companion.m3644getButtKaPHkGw();
        int m3654getBevelLxFBmk82 = StrokeJoin.Companion.m3654getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(15.89f, 8.11f);
        pathBuilder2.curveTo(15.5f, 7.72f, 14.83f, 7.0f, 13.53f, 7.0f);
        pathBuilder2.curveToRelative(-0.21f, 0.0f, -1.42f, 0.0f, -2.54f, 0.0f);
        pathBuilder2.curveTo(8.24f, 6.99f, 6.0f, 4.75f, 6.0f, 2.0f);
        pathBuilder2.horizontalLineTo(4.0f);
        pathBuilder2.curveToRelative(0.0f, 3.16f, 2.11f, 5.84f, 5.0f, 6.71f);
        pathBuilder2.verticalLineTo(22.0f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.verticalLineToRelative(-6.0f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.verticalLineToRelative(6.0f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.verticalLineTo(10.05f);
        pathBuilder2.lineTo(18.95f, 14.0f);
        pathBuilder2.lineToRelative(1.41f, -1.41f);
        pathBuilder2.lineTo(15.89f, 8.11f);
        pathBuilder2.close();
        m3927addPathoIyEayM = builder.m3927addPathoIyEayM(pathBuilder2.getNodes(), (r30 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType2, (r30 & 4) != 0 ? "" : "", (r30 & 8) != 0 ? null : solidColor2, (r30 & 16) != 0 ? 1.0f : 1.0f, (r30 & 32) == 0 ? null : null, (r30 & 64) != 0 ? 1.0f : 1.0f, (r30 & 128) != 0 ? 0.0f : 1.0f, (r30 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : m3644getButtKaPHkGw2, (r30 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : m3654getBevelLxFBmk82, (r30 & 1024) != 0 ? 4.0f : 1.0f, (r30 & 2048) != 0 ? 0.0f : 0.0f, (r30 & 4096) == 0 ? 0.0f : 1.0f, (r30 & 8192) == 0 ? 0.0f : 0.0f);
        ImageVector build = m3927addPathoIyEayM.build();
        _emojiPeople = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
