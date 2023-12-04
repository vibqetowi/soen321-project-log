package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ContentDrawScope.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drawContent", "", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ContentDrawScope extends DrawScope {
    void drawContent();

    /* compiled from: ContentDrawScope.kt */
    /* renamed from: androidx.compose.ui.graphics.drawscope.ContentDrawScope$-CC  reason: invalid class name */
    /* loaded from: classes3.dex */
    public final /* synthetic */ class CC {
    }

    /* compiled from: ContentDrawScope.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: drawImage-AZ2fEMs  reason: not valid java name */
        public static void m3792drawImageAZ2fEMs(ContentDrawScope contentDrawScope, ImageBitmap image, long j, long j2, long j3, long j4, float f, DrawStyle style, ColorFilter colorFilter, int i, int i2) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(style, "style");
            DrawScope.CC.m3807$default$drawImageAZ2fEMs(contentDrawScope, image, j, j2, j3, j4, f, style, colorFilter, i, i2);
        }

        @Deprecated
        /* renamed from: getCenter-F1C5BW0  reason: not valid java name */
        public static long m3793getCenterF1C5BW0(ContentDrawScope contentDrawScope) {
            return DrawScope.CC.m3808$default$getCenterF1C5BW0(contentDrawScope);
        }

        @Deprecated
        /* renamed from: getSize-NH-jbRc  reason: not valid java name */
        public static long m3794getSizeNHjbRc(ContentDrawScope contentDrawScope) {
            return DrawScope.CC.m3809$default$getSizeNHjbRc(contentDrawScope);
        }

        @Deprecated
        /* renamed from: roundToPx--R2X_6o  reason: not valid java name */
        public static int m3795roundToPxR2X_6o(ContentDrawScope contentDrawScope, long j) {
            return Density.CC.m5569$default$roundToPxR2X_6o(contentDrawScope, j);
        }

        @Deprecated
        /* renamed from: roundToPx-0680j_4  reason: not valid java name */
        public static int m3796roundToPx0680j_4(ContentDrawScope contentDrawScope, float f) {
            return Density.CC.m5570$default$roundToPx0680j_4(contentDrawScope, f);
        }

        @Deprecated
        /* renamed from: toDp-GaN1DYA  reason: not valid java name */
        public static float m3797toDpGaN1DYA(ContentDrawScope contentDrawScope, long j) {
            return Density.CC.m5571$default$toDpGaN1DYA(contentDrawScope, j);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM  reason: not valid java name */
        public static float m3798toDpu2uoSUM(ContentDrawScope contentDrawScope, float f) {
            return Density.CC.m5572$default$toDpu2uoSUM(contentDrawScope, f);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM  reason: not valid java name */
        public static float m3799toDpu2uoSUM(ContentDrawScope contentDrawScope, int i) {
            return Density.CC.m5573$default$toDpu2uoSUM((Density) contentDrawScope, i);
        }

        @Deprecated
        /* renamed from: toDpSize-k-rfVVM  reason: not valid java name */
        public static long m3800toDpSizekrfVVM(ContentDrawScope contentDrawScope, long j) {
            return Density.CC.m5574$default$toDpSizekrfVVM(contentDrawScope, j);
        }

        @Deprecated
        /* renamed from: toPx--R2X_6o  reason: not valid java name */
        public static float m3801toPxR2X_6o(ContentDrawScope contentDrawScope, long j) {
            return Density.CC.m5575$default$toPxR2X_6o(contentDrawScope, j);
        }

        @Deprecated
        /* renamed from: toPx-0680j_4  reason: not valid java name */
        public static float m3802toPx0680j_4(ContentDrawScope contentDrawScope, float f) {
            return Density.CC.m5576$default$toPx0680j_4(contentDrawScope, f);
        }

        @Deprecated
        public static Rect toRect(ContentDrawScope contentDrawScope, DpRect receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return Density.CC.$default$toRect(contentDrawScope, receiver);
        }

        @Deprecated
        /* renamed from: toSize-XkaWNTQ  reason: not valid java name */
        public static long m3803toSizeXkaWNTQ(ContentDrawScope contentDrawScope, long j) {
            return Density.CC.m5577$default$toSizeXkaWNTQ(contentDrawScope, j);
        }

        @Deprecated
        /* renamed from: toSp-0xMU5do  reason: not valid java name */
        public static long m3804toSp0xMU5do(ContentDrawScope contentDrawScope, float f) {
            return Density.CC.m5578$default$toSp0xMU5do(contentDrawScope, f);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
        public static long m3805toSpkPz2Gy4(ContentDrawScope contentDrawScope, float f) {
            return Density.CC.m5579$default$toSpkPz2Gy4(contentDrawScope, f);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
        public static long m3806toSpkPz2Gy4(ContentDrawScope contentDrawScope, int i) {
            return Density.CC.m5580$default$toSpkPz2Gy4((Density) contentDrawScope, i);
        }
    }
}
