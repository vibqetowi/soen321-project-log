package androidx.compose.material.icons.outlined;

import androidx.compose.ui.graphics.vector.ImageVector;
import kotlin.Metadata;
/* compiled from: KeyboardControlKey.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_keyboardControlKey", "Landroidx/compose/ui/graphics/vector/ImageVector;", "KeyboardControlKey", "Landroidx/compose/material/icons/Icons$Outlined;", "getKeyboardControlKey", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KeyboardControlKeyKt {
    private static ImageVector _keyboardControlKey;

    /*  JADX ERROR: JadxRuntimeException in pass: InlineMethods
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to process method for inline: androidx.compose.ui.graphics.vector.ImageVector.Builder.addPath-oIyEayM$default(androidx.compose.ui.graphics.vector.ImageVector$Builder, java.util.List, int, java.lang.String, androidx.compose.ui.graphics.Brush, float, androidx.compose.ui.graphics.Brush, float, float, int, int, float, float, float, float, int, java.lang.Object):androidx.compose.ui.graphics.vector.ImageVector$Builder
        	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:76)
        	at jadx.core.dex.visitors.InlineMethods.visit(InlineMethods.java:51)
        Caused by: java.lang.NullPointerException
        */
    public static final androidx.compose.ui.graphics.vector.ImageVector getKeyboardControlKey(androidx.compose.material.icons.Icons.Outlined r30) {
        /*
            java.lang.String r0 = "<this>"
            r1 = r30
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            androidx.compose.ui.graphics.vector.ImageVector r0 = androidx.compose.material.icons.outlined.KeyboardControlKeyKt._keyboardControlKey
            if (r0 == 0) goto Lf
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            return r0
        Lf:
            java.lang.String r2 = "Outlined.KeyboardControlKey"
            androidx.compose.ui.graphics.vector.ImageVector$Builder r1 = new androidx.compose.ui.graphics.vector.ImageVector$Builder
            r13 = r1
            r0 = 1103101952(0x41c00000, float:24.0)
            float r3 = androidx.compose.ui.unit.Dp.m5607constructorimpl(r0)
            float r4 = androidx.compose.ui.unit.Dp.m5607constructorimpl(r0)
            r5 = 1103101952(0x41c00000, float:24.0)
            r6 = 1103101952(0x41c00000, float:24.0)
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 224(0xe0, float:3.14E-43)
            r12 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r9, r10, r11, r12)
            r18 = 1065353216(0x3f800000, float:1.0)
            r20 = 1065353216(0x3f800000, float:1.0)
            int r15 = androidx.compose.ui.graphics.vector.VectorKt.getDefaultFillType()
            androidx.compose.ui.graphics.SolidColor r0 = new androidx.compose.ui.graphics.SolidColor
            androidx.compose.ui.graphics.Color$Companion r1 = androidx.compose.ui.graphics.Color.Companion
            long r1 = r1.m3317getBlack0d7_KjU()
            r3 = 0
            r0.<init>(r1, r3)
            r17 = r0
            androidx.compose.ui.graphics.Brush r17 = (androidx.compose.ui.graphics.Brush) r17
            r19 = 0
            r21 = 1065353216(0x3f800000, float:1.0)
            androidx.compose.ui.graphics.StrokeCap$Companion r0 = androidx.compose.ui.graphics.StrokeCap.Companion
            int r22 = r0.m3644getButtKaPHkGw()
            androidx.compose.ui.graphics.StrokeJoin$Companion r0 = androidx.compose.ui.graphics.StrokeJoin.Companion
            int r23 = r0.m3654getBevelLxFBmk8()
            r24 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r16 = ""
            androidx.compose.ui.graphics.vector.PathBuilder r0 = new androidx.compose.ui.graphics.vector.PathBuilder
            r0.<init>()
            r1 = 1084227584(0x40a00000, float:5.0)
            r2 = 1094713344(0x41400000, float:12.0)
            r0.moveTo(r1, r2)
            r1 = 1068792545(0x3fb47ae1, float:1.41)
            r0.lineToRelative(r1, r1)
            r2 = -1062039716(0xffffffffc0b28f5c, float:-5.58)
            r3 = 1085464904(0x40b2e148, float:5.59)
            r0.lineToRelative(r3, r2)
            r2 = 1085443932(0x40b28f5c, float:5.58)
            r0.lineToRelative(r3, r2)
            r2 = -1078691103(0xffffffffbfb47ae1, float:-1.41)
            r0.lineToRelative(r1, r2)
            r1 = -1059061760(0xffffffffc0e00000, float:-7.0)
            r0.lineToRelative(r1, r1)
            r0.close()
            java.util.List r14 = r0.getNodes()
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 14336(0x3800, float:2.0089E-41)
            r29 = 0
            androidx.compose.ui.graphics.vector.ImageVector$Builder r0 = androidx.compose.ui.graphics.vector.ImageVector.Builder.m3926addPathoIyEayM$default(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            androidx.compose.ui.graphics.vector.ImageVector r0 = r0.build()
            androidx.compose.material.icons.outlined.KeyboardControlKeyKt._keyboardControlKey = r0
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.icons.outlined.KeyboardControlKeyKt.getKeyboardControlKey(androidx.compose.material.icons.Icons$Outlined):androidx.compose.ui.graphics.vector.ImageVector");
    }
}
