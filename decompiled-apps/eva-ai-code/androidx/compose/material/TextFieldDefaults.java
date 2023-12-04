package androidx.compose.material;

import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.messaging.Constants;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: TextFieldDefaults.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JS\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\u00102\b\b\u0002\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010#\u001a\u00020\u0006H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b$\u0010%J×\u0001\u0010&\u001a\u00020\u00192\u0006\u0010'\u001a\u00020(2\u0011\u0010)\u001a\r\u0012\u0004\u0012\u00020\u00190*¢\u0006\u0002\b+2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020.2\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\u0015\b\u0002\u0010/\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\u0015\b\u0002\u00100\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\u0015\b\u0002\u00101\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\u0015\b\u0002\u00102\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u00103\u001a\u0002042\u0013\b\u0002\u00105\u001a\r\u0012\u0004\u0012\u00020\u00190*¢\u0006\u0002\b+H\u0007¢\u0006\u0002\u00106JÂ\u0001\u00107\u001a\u00020\u00192\u0006\u0010'\u001a\u00020(2\u0011\u0010)\u001a\r\u0012\u0004\u0012\u00020\u00190*¢\u0006\u0002\b+2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020.2\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\u0015\b\u0002\u0010/\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\u0015\b\u0002\u00100\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\u0015\b\u0002\u00101\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\u0015\b\u0002\u00102\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u00103\u001a\u000204H\u0007¢\u0006\u0002\u00108Jç\u0001\u00109\u001a\u00020 2\b\b\u0002\u0010:\u001a\u00020;2\b\b\u0002\u0010<\u001a\u00020;2\b\b\u0002\u0010=\u001a\u00020;2\b\b\u0002\u0010>\u001a\u00020;2\b\b\u0002\u0010?\u001a\u00020;2\b\b\u0002\u0010@\u001a\u00020;2\b\b\u0002\u0010A\u001a\u00020;2\b\b\u0002\u0010B\u001a\u00020;2\b\b\u0002\u0010C\u001a\u00020;2\b\b\u0002\u0010D\u001a\u00020;2\b\b\u0002\u0010E\u001a\u00020;2\b\b\u0002\u0010F\u001a\u00020;2\b\b\u0002\u0010G\u001a\u00020;2\b\b\u0002\u0010H\u001a\u00020;2\b\b\u0002\u0010I\u001a\u00020;2\b\b\u0002\u0010J\u001a\u00020;2\b\b\u0002\u0010K\u001a\u00020;2\b\b\u0002\u0010L\u001a\u00020;2\b\b\u0002\u0010M\u001a\u00020;2\b\b\u0002\u0010N\u001a\u00020;2\b\b\u0002\u0010O\u001a\u00020;H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bP\u0010QJ=\u0010R\u001a\u0002042\b\b\u0002\u0010S\u001a\u00020\u00062\b\b\u0002\u0010T\u001a\u00020\u00062\b\b\u0002\u0010U\u001a\u00020\u00062\b\b\u0002\u0010V\u001a\u00020\u0006H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bW\u0010XJç\u0001\u0010Y\u001a\u00020 2\b\b\u0002\u0010:\u001a\u00020;2\b\b\u0002\u0010<\u001a\u00020;2\b\b\u0002\u0010=\u001a\u00020;2\b\b\u0002\u0010>\u001a\u00020;2\b\b\u0002\u0010?\u001a\u00020;2\b\b\u0002\u0010Z\u001a\u00020;2\b\b\u0002\u0010[\u001a\u00020;2\b\b\u0002\u0010\\\u001a\u00020;2\b\b\u0002\u0010]\u001a\u00020;2\b\b\u0002\u0010D\u001a\u00020;2\b\b\u0002\u0010E\u001a\u00020;2\b\b\u0002\u0010F\u001a\u00020;2\b\b\u0002\u0010G\u001a\u00020;2\b\b\u0002\u0010H\u001a\u00020;2\b\b\u0002\u0010I\u001a\u00020;2\b\b\u0002\u0010J\u001a\u00020;2\b\b\u0002\u0010K\u001a\u00020;2\b\b\u0002\u0010L\u001a\u00020;2\b\b\u0002\u0010M\u001a\u00020;2\b\b\u0002\u0010N\u001a\u00020;2\b\b\u0002\u0010O\u001a\u00020;H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b^\u0010QJ=\u0010_\u001a\u0002042\b\b\u0002\u0010S\u001a\u00020\u00062\b\b\u0002\u0010U\u001a\u00020\u00062\b\b\u0002\u0010T\u001a\u00020\u00062\b\b\u0002\u0010V\u001a\u00020\u0006H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b`\u0010XJ=\u0010a\u001a\u0002042\b\b\u0002\u0010S\u001a\u00020\u00062\b\b\u0002\u0010T\u001a\u00020\u00062\b\b\u0002\u0010U\u001a\u00020\u00062\b\b\u0002\u0010V\u001a\u00020\u0006H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bb\u0010XJM\u0010c\u001a\u00020d*\u00020d2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010e\u001a\u00020\u00062\b\b\u0002\u0010f\u001a\u00020\u0006H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bg\u0010hR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\f\u0010\bR\u001c\u0010\r\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u000e\u0010\bR\u0011\u0010\u000f\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u001c\u0010\u0015\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0016\u0010\bR\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006i"}, d2 = {"Landroidx/compose/material/TextFieldDefaults;", "", "()V", "BackgroundOpacity", "", "FocusedBorderThickness", "Landroidx/compose/ui/unit/Dp;", "getFocusedBorderThickness-D9Ej5fM", "()F", "F", "IconOpacity", "MinHeight", "getMinHeight-D9Ej5fM", "MinWidth", "getMinWidth-D9Ej5fM", "OutlinedTextFieldShape", "Landroidx/compose/ui/graphics/Shape;", "getOutlinedTextFieldShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "TextFieldShape", "getTextFieldShape", "UnfocusedBorderThickness", "getUnfocusedBorderThickness-D9Ej5fM", "UnfocusedIndicatorLineOpacity", "BorderBox", "", "enabled", "", "isError", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "colors", "Landroidx/compose/material/TextFieldColors;", "shape", "focusedBorderThickness", "unfocusedBorderThickness", "BorderBox-nbWgWpA", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material/TextFieldColors;Landroidx/compose/ui/graphics/Shape;FFLandroidx/compose/runtime/Composer;II)V", "OutlinedTextFieldDecorationBox", "value", "", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "singleLine", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", Constants.ScionAnalytics.PARAM_LABEL, "placeholder", "leadingIcon", "trailingIcon", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", OutlinedTextFieldKt.BorderId, "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "TextFieldDecorationBox", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;III)V", "outlinedTextFieldColors", "textColor", "Landroidx/compose/ui/graphics/Color;", "disabledTextColor", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "cursorColor", "errorCursorColor", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "leadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "trailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "placeholderColor", "disabledPlaceholderColor", "outlinedTextFieldColors-dx8h9Zs", "(JJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIII)Landroidx/compose/material/TextFieldColors;", "outlinedTextFieldPadding", TtmlNode.START, ViewHierarchyConstants.DIMENSION_TOP_KEY, TtmlNode.END, "bottom", "outlinedTextFieldPadding-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "textFieldColors", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "textFieldColors-dx8h9Zs", "textFieldWithLabelPadding", "textFieldWithLabelPadding-a9UjIt4", "textFieldWithoutLabelPadding", "textFieldWithoutLabelPadding-a9UjIt4", "indicatorLine", "Landroidx/compose/ui/Modifier;", "focusedIndicatorLineThickness", "unfocusedIndicatorLineThickness", "indicatorLine-gv0btCI", "(Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material/TextFieldColors;FF)Landroidx/compose/ui/Modifier;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldDefaults {
    public static final int $stable = 0;
    public static final float BackgroundOpacity = 0.12f;
    public static final float IconOpacity = 0.54f;
    public static final float UnfocusedIndicatorLineOpacity = 0.42f;
    public static final TextFieldDefaults INSTANCE = new TextFieldDefaults();
    private static final float MinHeight = Dp.m5607constructorimpl(56);
    private static final float MinWidth = Dp.m5607constructorimpl(280);
    private static final float UnfocusedBorderThickness = Dp.m5607constructorimpl(1);
    private static final float FocusedBorderThickness = Dp.m5607constructorimpl(2);

    private TextFieldDefaults() {
    }

    /* renamed from: getMinHeight-D9Ej5fM  reason: not valid java name */
    public final float m1510getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM  reason: not valid java name */
    public final float m1511getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    public final Shape getTextFieldShape(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -1117199624, "C215@7733L6:TextFieldDefaults.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1117199624, i, -1, "androidx.compose.material.TextFieldDefaults.<get-TextFieldShape> (TextFieldDefaults.kt:215)");
        }
        CornerBasedShape copy$default = CornerBasedShape.copy$default(MaterialTheme.INSTANCE.getShapes(composer, 6).getSmall(), null, null, CornerSizeKt.getZeroCornerSize(), CornerSizeKt.getZeroCornerSize(), 3, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return copy$default;
    }

    public final Shape getOutlinedTextFieldShape(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 1899109048, "C224@8035L6:TextFieldDefaults.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1899109048, i, -1, "androidx.compose.material.TextFieldDefaults.<get-OutlinedTextFieldShape> (TextFieldDefaults.kt:224)");
        }
        CornerBasedShape small = MaterialTheme.INSTANCE.getShapes(composer, 6).getSmall();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return small;
    }

    /* renamed from: getUnfocusedBorderThickness-D9Ej5fM  reason: not valid java name */
    public final float m1512getUnfocusedBorderThicknessD9Ej5fM() {
        return UnfocusedBorderThickness;
    }

    /* renamed from: getFocusedBorderThickness-D9Ej5fM  reason: not valid java name */
    public final float m1509getFocusedBorderThicknessD9Ej5fM() {
        return FocusedBorderThickness;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* renamed from: BorderBox-nbWgWpA  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1508BorderBoxnbWgWpA(boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors colors, Shape shape, float f, float f2, Composer composer, int i, int i2) {
        int i3;
        Shape shape2;
        float f3;
        float f4;
        int i4;
        Object obj;
        float f5;
        float f6;
        State m1520animateBorderStrokeAsStateNuRrP5Q;
        Shape shape3;
        float f7;
        float f8;
        ScopeUpdateScope endRestartGroup;
        int i5;
        int i6;
        int i7;
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Composer startRestartGroup = composer.startRestartGroup(943754022);
        ComposerKt.sourceInformation(startRestartGroup, "C(BorderBox)P(1,4,3!1,5,2:c#ui.unit.Dp,6:c#ui.unit.Dp)314@11791L22,318@11975L203,326@12187L47:TextFieldDefaults.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(interactionSource) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
        } else if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changed(colors) ? 2048 : 1024;
        }
        if ((i & 57344) == 0) {
            if ((i2 & 16) == 0) {
                shape2 = shape;
                if (startRestartGroup.changed(shape2)) {
                    i7 = 16384;
                    i3 |= i7;
                }
            } else {
                shape2 = shape;
            }
            i7 = 8192;
            i3 |= i7;
        } else {
            shape2 = shape;
        }
        if ((i & 458752) == 0) {
            if ((i2 & 32) == 0) {
                f3 = f;
                if (startRestartGroup.changed(f3)) {
                    i6 = 131072;
                    i3 |= i6;
                }
            } else {
                f3 = f;
            }
            i6 = 65536;
            i3 |= i6;
        } else {
            f3 = f;
        }
        if ((3670016 & i) == 0) {
            if ((i2 & 64) == 0) {
                f4 = f2;
                if (startRestartGroup.changed(f4)) {
                    i5 = 1048576;
                    i3 |= i5;
                }
            } else {
                f4 = f2;
            }
            i5 = 524288;
            i3 |= i5;
        } else {
            f4 = f2;
        }
        if ((i2 & 128) == 0) {
            if ((29360128 & i) == 0) {
                i4 = startRestartGroup.changed(this) ? 8388608 : 4194304;
            }
            if ((23967451 & i3) == 4793490 || !startRestartGroup.getSkipping()) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                    if ((i2 & 16) != 0) {
                        shape2 = getOutlinedTextFieldShape(startRestartGroup, (i3 >> 21) & 14);
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        f3 = FocusedBorderThickness;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        obj = shape2;
                        f5 = UnfocusedBorderThickness;
                        f6 = f3;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(943754022, i3, -1, "androidx.compose.material.TextFieldDefaults.BorderBox (TextFieldDefaults.kt:309)");
                        }
                        int i8 = i3 >> 3;
                        Shape shape4 = obj;
                        m1520animateBorderStrokeAsStateNuRrP5Q = TextFieldDefaultsKt.m1520animateBorderStrokeAsStateNuRrP5Q(z, z2, interactionSource, colors, f6, f5, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i8) | (i8 & 458752));
                        BoxKt.Box(BorderKt.border(Modifier.Companion, (BorderStroke) m1520animateBorderStrokeAsStateNuRrP5Q.getValue(), shape4), startRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        shape3 = shape4;
                        f7 = f6;
                        f8 = f5;
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                    }
                }
                obj = shape2;
                f6 = f3;
                f5 = f4;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i82 = i3 >> 3;
                Shape shape42 = obj;
                m1520animateBorderStrokeAsStateNuRrP5Q = TextFieldDefaultsKt.m1520animateBorderStrokeAsStateNuRrP5Q(z, z2, interactionSource, colors, f6, f5, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i82) | (i82 & 458752));
                BoxKt.Box(BorderKt.border(Modifier.Companion, (BorderStroke) m1520animateBorderStrokeAsStateNuRrP5Q.getValue(), shape42), startRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                shape3 = shape42;
                f7 = f6;
                f8 = f5;
            } else {
                startRestartGroup.skipToGroupEnd();
                f7 = f3;
                f8 = f4;
                shape3 = shape2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new TextFieldDefaults$BorderBox$1(this, z, z2, interactionSource, colors, shape3, f7, f8, i, i2));
            return;
        }
        i4 = 12582912;
        i3 |= i4;
        if ((23967451 & i3) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        obj = shape2;
        f6 = f3;
        f5 = f4;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i822 = i3 >> 3;
        Shape shape422 = obj;
        m1520animateBorderStrokeAsStateNuRrP5Q = TextFieldDefaultsKt.m1520animateBorderStrokeAsStateNuRrP5Q(z, z2, interactionSource, colors, f6, f5, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i822) | (i822 & 458752));
        BoxKt.Box(BorderKt.border(Modifier.Companion, (BorderStroke) m1520animateBorderStrokeAsStateNuRrP5Q.getValue(), shape422), startRestartGroup, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        shape3 = shape422;
        f7 = f6;
        f8 = f5;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: textFieldWithLabelPadding-a9UjIt4$default  reason: not valid java name */
    public static /* synthetic */ PaddingValues m1506textFieldWithLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldKt.getFirstBaselineOffset();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldKt.getTextFieldBottomPadding();
        }
        return textFieldDefaults.m1517textFieldWithLabelPaddinga9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: textFieldWithLabelPadding-a9UjIt4  reason: not valid java name */
    public final PaddingValues m1517textFieldWithLabelPaddinga9UjIt4(float f, float f2, float f3, float f4) {
        return PaddingKt.m744PaddingValuesa9UjIt4(f, f3, f2, f4);
    }

    /* renamed from: textFieldWithoutLabelPadding-a9UjIt4$default  reason: not valid java name */
    public static /* synthetic */ PaddingValues m1507textFieldWithoutLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m1518textFieldWithoutLabelPaddinga9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: textFieldWithoutLabelPadding-a9UjIt4  reason: not valid java name */
    public final PaddingValues m1518textFieldWithoutLabelPaddinga9UjIt4(float f, float f2, float f3, float f4) {
        return PaddingKt.m744PaddingValuesa9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: outlinedTextFieldPadding-a9UjIt4$default  reason: not valid java name */
    public static /* synthetic */ PaddingValues m1505outlinedTextFieldPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m1515outlinedTextFieldPaddinga9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: outlinedTextFieldPadding-a9UjIt4  reason: not valid java name */
    public final PaddingValues m1515outlinedTextFieldPaddinga9UjIt4(float f, float f2, float f3, float f4) {
        return PaddingKt.m744PaddingValuesa9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: textFieldColors-dx8h9Zs  reason: not valid java name */
    public final TextFieldColors m1516textFieldColorsdx8h9Zs(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, Composer composer, int i, int i2, int i3, int i4) {
        long j22;
        composer.startReplaceableGroup(231892599);
        ComposerKt.sourceInformation(composer, "C(textFieldColors)P(17:c#ui.graphics.Color,6:c#ui.graphics.Color,0:c#ui.graphics.Color,1:c#ui.graphics.Color,8:c#ui.graphics.Color,13:c#ui.graphics.Color,19:c#ui.graphics.Color,2:c#ui.graphics.Color,9:c#ui.graphics.Color,15:c#ui.graphics.Color,4:c#ui.graphics.Color,11:c#ui.graphics.Color,18:c#ui.graphics.Color,7:c#ui.graphics.Color,12:c#ui.graphics.Color,14:c#ui.graphics.Color,20:c#ui.graphics.Color,3:c#ui.graphics.Color,10:c#ui.graphics.Color,16:c#ui.graphics.Color,5:c#ui.graphics.Color)377@14111L7,377@14142L7,378@14215L8,379@14273L6,380@14366L6,381@14430L6,383@14509L6,383@14550L4,385@14624L6,386@14776L8,387@14838L6,389@14912L6,390@15041L8,393@15170L6,394@15301L8,395@15366L6,397@15441L6,397@15482L4,398@15540L6,398@15575L6,399@15658L8,400@15716L6,401@15778L6,401@15813L6,402@15899L8:TextFieldDefaults.kt#jmzs0o");
        if ((i4 & 1) != 0) {
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(ContentColorKt.getLocalContentColor());
            ComposerKt.sourceInformationMarkerEnd(composer);
            long m3301unboximpl = ((Color) consume).m3301unboximpl();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume2 = composer.consume(ContentAlphaKt.getLocalContentAlpha());
            ComposerKt.sourceInformationMarkerEnd(composer);
            j22 = Color.m3290copywmQWz5c$default(m3301unboximpl, ((Number) consume2).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j22 = j;
        }
        long m3290copywmQWz5c$default = (i4 & 2) != 0 ? Color.m3290copywmQWz5c$default(j22, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long m3290copywmQWz5c$default2 = (i4 & 4) != 0 ? Color.m3290copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1308getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long m1309getPrimary0d7_KjU = (i4 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1309getPrimary0d7_KjU() : j4;
        long m1303getError0d7_KjU = (i4 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1303getError0d7_KjU() : j5;
        long m3290copywmQWz5c$default3 = (i4 & 32) != 0 ? Color.m3290copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1309getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long m3290copywmQWz5c$default4 = (i4 & 64) != 0 ? Color.m3290copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1308getOnSurface0d7_KjU(), 0.42f, 0.0f, 0.0f, 0.0f, 14, null) : j7;
        long m3290copywmQWz5c$default5 = (i4 & 128) != 0 ? Color.m3290copywmQWz5c$default(m3290copywmQWz5c$default4, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j8;
        long m1303getError0d7_KjU2 = (i4 & 256) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1303getError0d7_KjU() : j9;
        long m3290copywmQWz5c$default6 = (i4 & 512) != 0 ? Color.m3290copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1308getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j10;
        long m3290copywmQWz5c$default7 = (i4 & 1024) != 0 ? Color.m3290copywmQWz5c$default(m3290copywmQWz5c$default6, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long j23 = (i4 & 2048) != 0 ? m3290copywmQWz5c$default6 : j12;
        long m3290copywmQWz5c$default8 = (i4 & 4096) != 0 ? Color.m3290copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1308getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        long m3290copywmQWz5c$default9 = (i4 & 8192) != 0 ? Color.m3290copywmQWz5c$default(m3290copywmQWz5c$default8, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j14;
        long m1303getError0d7_KjU3 = (i4 & 16384) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1303getError0d7_KjU() : j15;
        long m3290copywmQWz5c$default10 = (32768 & i4) != 0 ? Color.m3290copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1309getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j16;
        long m3290copywmQWz5c$default11 = (65536 & i4) != 0 ? Color.m3290copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1308getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j17;
        long m3290copywmQWz5c$default12 = (131072 & i4) != 0 ? Color.m3290copywmQWz5c$default(m3290copywmQWz5c$default11, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j18;
        long m1303getError0d7_KjU4 = (262144 & i4) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1303getError0d7_KjU() : j19;
        long m3290copywmQWz5c$default13 = (524288 & i4) != 0 ? Color.m3290copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1308getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j20;
        long m3290copywmQWz5c$default14 = (i4 & 1048576) != 0 ? Color.m3290copywmQWz5c$default(m3290copywmQWz5c$default13, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j21;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(231892599, i, i2, "androidx.compose.material.TextFieldDefaults.textFieldColors (TextFieldDefaults.kt:376)");
        }
        DefaultTextFieldColors defaultTextFieldColors = new DefaultTextFieldColors(j22, m3290copywmQWz5c$default, m1309getPrimary0d7_KjU, m1303getError0d7_KjU, m3290copywmQWz5c$default3, m3290copywmQWz5c$default4, m1303getError0d7_KjU2, m3290copywmQWz5c$default5, m3290copywmQWz5c$default6, m3290copywmQWz5c$default7, j23, m3290copywmQWz5c$default8, m3290copywmQWz5c$default9, m1303getError0d7_KjU3, m3290copywmQWz5c$default2, m3290copywmQWz5c$default10, m3290copywmQWz5c$default11, m3290copywmQWz5c$default12, m1303getError0d7_KjU4, m3290copywmQWz5c$default13, m3290copywmQWz5c$default14, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultTextFieldColors;
    }

    /* renamed from: outlinedTextFieldColors-dx8h9Zs  reason: not valid java name */
    public final TextFieldColors m1514outlinedTextFieldColorsdx8h9Zs(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, Composer composer, int i, int i2, int i3, int i4) {
        long j22;
        composer.startReplaceableGroup(1762667317);
        ComposerKt.sourceInformation(composer, "C(outlinedTextFieldColors)P(17:c#ui.graphics.Color,6:c#ui.graphics.Color,0:c#ui.graphics.Color,1:c#ui.graphics.Color,9:c#ui.graphics.Color,13:c#ui.graphics.Color,19:c#ui.graphics.Color,2:c#ui.graphics.Color,8:c#ui.graphics.Color,15:c#ui.graphics.Color,4:c#ui.graphics.Color,11:c#ui.graphics.Color,18:c#ui.graphics.Color,7:c#ui.graphics.Color,12:c#ui.graphics.Color,14:c#ui.graphics.Color,20:c#ui.graphics.Color,3:c#ui.graphics.Color,10:c#ui.graphics.Color,16:c#ui.graphics.Color,5:c#ui.graphics.Color)435@17427L7,435@17458L7,436@17531L8,438@17637L6,439@17701L6,441@17777L6,441@17818L4,443@17889L6,443@17932L8,444@18027L8,445@18086L6,447@18160L6,448@18289L8,451@18418L6,452@18549L8,453@18614L6,455@18689L6,455@18730L4,456@18788L6,456@18823L6,457@18906L8,458@18964L6,459@19026L6,459@19061L6,460@19147L8:TextFieldDefaults.kt#jmzs0o");
        if ((i4 & 1) != 0) {
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(ContentColorKt.getLocalContentColor());
            ComposerKt.sourceInformationMarkerEnd(composer);
            long m3301unboximpl = ((Color) consume).m3301unboximpl();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume2 = composer.consume(ContentAlphaKt.getLocalContentAlpha());
            ComposerKt.sourceInformationMarkerEnd(composer);
            j22 = Color.m3290copywmQWz5c$default(m3301unboximpl, ((Number) consume2).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j22 = j;
        }
        long m3290copywmQWz5c$default = (i4 & 2) != 0 ? Color.m3290copywmQWz5c$default(j22, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long m3326getTransparent0d7_KjU = (i4 & 4) != 0 ? Color.Companion.m3326getTransparent0d7_KjU() : j3;
        long m1309getPrimary0d7_KjU = (i4 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1309getPrimary0d7_KjU() : j4;
        long m1303getError0d7_KjU = (i4 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1303getError0d7_KjU() : j5;
        long m3290copywmQWz5c$default2 = (i4 & 32) != 0 ? Color.m3290copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1309getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long m3290copywmQWz5c$default3 = (i4 & 64) != 0 ? Color.m3290copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1308getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j7;
        long m3290copywmQWz5c$default4 = (i4 & 128) != 0 ? Color.m3290copywmQWz5c$default(m3290copywmQWz5c$default3, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j8;
        long m1303getError0d7_KjU2 = (i4 & 256) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1303getError0d7_KjU() : j9;
        long m3290copywmQWz5c$default5 = (i4 & 512) != 0 ? Color.m3290copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1308getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j10;
        long m3290copywmQWz5c$default6 = (i4 & 1024) != 0 ? Color.m3290copywmQWz5c$default(m3290copywmQWz5c$default5, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long j23 = (i4 & 2048) != 0 ? m3290copywmQWz5c$default5 : j12;
        long m3290copywmQWz5c$default7 = (i4 & 4096) != 0 ? Color.m3290copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1308getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        long m3290copywmQWz5c$default8 = (i4 & 8192) != 0 ? Color.m3290copywmQWz5c$default(m3290copywmQWz5c$default7, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j14;
        long m1303getError0d7_KjU3 = (i4 & 16384) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1303getError0d7_KjU() : j15;
        long m3290copywmQWz5c$default9 = (32768 & i4) != 0 ? Color.m3290copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1309getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j16;
        long m3290copywmQWz5c$default10 = (65536 & i4) != 0 ? Color.m3290copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1308getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j17;
        long m3290copywmQWz5c$default11 = (131072 & i4) != 0 ? Color.m3290copywmQWz5c$default(m3290copywmQWz5c$default10, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j18;
        long m1303getError0d7_KjU4 = (262144 & i4) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1303getError0d7_KjU() : j19;
        long m3290copywmQWz5c$default12 = (524288 & i4) != 0 ? Color.m3290copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1308getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j20;
        long m3290copywmQWz5c$default13 = (i4 & 1048576) != 0 ? Color.m3290copywmQWz5c$default(m3290copywmQWz5c$default12, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j21;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1762667317, i, i2, "androidx.compose.material.TextFieldDefaults.outlinedTextFieldColors (TextFieldDefaults.kt:434)");
        }
        DefaultTextFieldColors defaultTextFieldColors = new DefaultTextFieldColors(j22, m3290copywmQWz5c$default, m1309getPrimary0d7_KjU, m1303getError0d7_KjU, m3290copywmQWz5c$default2, m3290copywmQWz5c$default3, m1303getError0d7_KjU2, m3290copywmQWz5c$default4, m3290copywmQWz5c$default5, m3290copywmQWz5c$default6, j23, m3290copywmQWz5c$default7, m3290copywmQWz5c$default8, m1303getError0d7_KjU3, m3326getTransparent0d7_KjU, m3290copywmQWz5c$default9, m3290copywmQWz5c$default10, m3290copywmQWz5c$default11, m1303getError0d7_KjU4, m3290copywmQWz5c$default12, m3290copywmQWz5c$default13, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultTextFieldColors;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:207:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void TextFieldDecorationBox(String value, Function2<? super Composer, ? super Integer, Unit> innerTextField, boolean z, boolean z2, VisualTransformation visualTransformation, InteractionSource interactionSource, boolean z3, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, TextFieldColors textFieldColors, PaddingValues paddingValues, Composer composer, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        TextFieldColors textFieldColors2;
        PaddingValues paddingValues2;
        Function2<? super Composer, ? super Integer, Unit> function25;
        TextFieldColors textFieldColors3;
        boolean z4;
        Function2<? super Composer, ? super Integer, Unit> function26;
        Function2<? super Composer, ? super Integer, Unit> function27;
        Function2<? super Composer, ? super Integer, Unit> function28;
        PaddingValues m1506textFieldWithLabelPaddinga9UjIt4$default;
        Composer composer2;
        boolean z5;
        Function2<? super Composer, ? super Integer, Unit> function29;
        Function2<? super Composer, ? super Integer, Unit> function210;
        Function2<? super Composer, ? super Integer, Unit> function211;
        Function2<? super Composer, ? super Integer, Unit> function212;
        TextFieldColors textFieldColors4;
        PaddingValues paddingValues3;
        ScopeUpdateScope endRestartGroup;
        int i12;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
        Intrinsics.checkNotNullParameter(visualTransformation, "visualTransformation");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Composer startRestartGroup = composer.startRestartGroup(1171040065);
        ComposerKt.sourceInformation(startRestartGroup, "C(TextFieldDecorationBox)P(11,3,2,9,12,4,5,6,8,7,10)554@25036L17,562@25270L569:TextFieldDefaults.kt#jmzs0o");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (startRestartGroup.changed(value) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= startRestartGroup.changedInstance(innerTextField) ? 32 : 16;
        }
        int i13 = 128;
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 896) == 0) {
            i4 |= startRestartGroup.changed(z) ? 256 : 128;
            if ((i3 & 8) == 0) {
                i4 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((i3 & 16) != 0) {
                    i4 |= 24576;
                } else if ((i & 57344) == 0) {
                    i4 |= startRestartGroup.changed(visualTransformation) ? 16384 : 8192;
                }
                if ((i3 & 32) != 0) {
                    i5 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else {
                    if ((i & 458752) == 0) {
                        i5 = startRestartGroup.changed(interactionSource) ? 131072 : 65536;
                    }
                    i6 = i3 & 64;
                    if (i6 == 0) {
                        i4 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        i4 |= startRestartGroup.changed(z3) ? 1048576 : 524288;
                    }
                    i7 = i3 & 128;
                    if (i7 == 0) {
                        i4 |= 12582912;
                    } else if ((i & 29360128) == 0) {
                        i4 |= startRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
                    }
                    i8 = i3 & 256;
                    if (i8 == 0) {
                        i4 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        i4 |= startRestartGroup.changedInstance(function22) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    i9 = i3 & 512;
                    if (i9 == 0) {
                        i4 |= C.ENCODING_PCM_32BIT;
                    } else if ((i & 1879048192) == 0) {
                        i4 |= startRestartGroup.changedInstance(function23) ? 536870912 : 268435456;
                    }
                    i10 = i3 & 1024;
                    if (i10 == 0) {
                        i11 = i2 | 6;
                    } else if ((i2 & 14) == 0) {
                        i11 = i2 | (startRestartGroup.changedInstance(function24) ? 4 : 2);
                    } else {
                        i11 = i2;
                    }
                    if ((i2 & 112) == 0) {
                        if ((i3 & 2048) == 0 && startRestartGroup.changed(textFieldColors)) {
                            i12 = 32;
                            i11 |= i12;
                        }
                        i12 = 16;
                        i11 |= i12;
                    }
                    if ((i2 & 896) == 0) {
                        if ((i3 & 4096) == 0 && startRestartGroup.changed(paddingValues)) {
                            i13 = 256;
                        }
                        i11 |= i13;
                    }
                    int i14 = i11;
                    if ((i3 & 8192) == 0) {
                        i14 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                    } else if ((i2 & 7168) == 0) {
                        i14 |= startRestartGroup.changed(this) ? 2048 : 1024;
                        if ((i4 & 1533916891) == 306783378 || (i14 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                boolean z6 = i6 != 0 ? false : z3;
                                Function2<? super Composer, ? super Integer, Unit> function213 = i7 != 0 ? null : function2;
                                Function2<? super Composer, ? super Integer, Unit> function214 = i8 != 0 ? null : function22;
                                Function2<? super Composer, ? super Integer, Unit> function215 = i9 != 0 ? null : function23;
                                Function2<? super Composer, ? super Integer, Unit> function216 = i10 == 0 ? function24 : null;
                                if ((i3 & 2048) != 0) {
                                    textFieldColors2 = m1516textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 0, (i14 >> 6) & 112, 2097151);
                                    i14 &= -113;
                                } else {
                                    textFieldColors2 = textFieldColors;
                                }
                                Function2<? super Composer, ? super Integer, Unit> function217 = function215;
                                if ((i3 & 4096) != 0) {
                                    if (function213 == null) {
                                        m1506textFieldWithLabelPaddinga9UjIt4$default = m1507textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    } else {
                                        m1506textFieldWithLabelPaddinga9UjIt4$default = m1506textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    }
                                    i14 &= -897;
                                    function25 = function217;
                                    paddingValues2 = m1506textFieldWithLabelPaddinga9UjIt4$default;
                                } else {
                                    paddingValues2 = paddingValues;
                                    function25 = function217;
                                }
                                textFieldColors3 = textFieldColors2;
                                z4 = z6;
                                function26 = function213;
                                function27 = function216;
                                function28 = function214;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 2048) != 0) {
                                    i14 &= -113;
                                }
                                if ((i3 & 4096) != 0) {
                                    i14 &= -897;
                                }
                                z4 = z3;
                                function26 = function2;
                                function28 = function22;
                                function25 = function23;
                                function27 = function24;
                                textFieldColors3 = textFieldColors;
                                paddingValues2 = paddingValues;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1171040065, i4, i14, "androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:542)");
                            }
                            int i15 = i4 << 3;
                            int i16 = i4 >> 9;
                            composer2 = startRestartGroup;
                            TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, value, innerTextField, visualTransformation, function26, function28, function25, function27, z2, z, z4, interactionSource, paddingValues2, textFieldColors3, null, composer2, (i15 & 896) | (i15 & 112) | 6 | ((i4 >> 3) & 7168) | (i16 & 57344) | (i16 & 458752) | (i16 & 3670016) | ((i14 << 21) & 29360128) | ((i4 << 15) & 234881024) | ((i4 << 21) & 1879048192), ((i4 >> 12) & 112) | ((i4 >> 18) & 14) | (i14 & 896) | ((i14 << 6) & 7168), 16384);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z5 = z4;
                            function29 = function26;
                            function210 = function28;
                            function211 = function25;
                            function212 = function27;
                            textFieldColors4 = textFieldColors3;
                            paddingValues3 = paddingValues2;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            z5 = z3;
                            function29 = function2;
                            function210 = function22;
                            function211 = function23;
                            function212 = function24;
                            textFieldColors4 = textFieldColors;
                            paddingValues3 = paddingValues;
                            composer2 = startRestartGroup;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new TextFieldDefaults$TextFieldDecorationBox$1(this, value, innerTextField, z, z2, visualTransformation, interactionSource, z5, function29, function210, function211, function212, textFieldColors4, paddingValues3, i, i2, i3));
                        return;
                    }
                    if ((i4 & 1533916891) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i10 == 0) {
                    }
                    if ((i3 & 2048) != 0) {
                    }
                    Function2<? super Composer, ? super Integer, Unit> function2172 = function215;
                    if ((i3 & 4096) != 0) {
                    }
                    textFieldColors3 = textFieldColors2;
                    z4 = z6;
                    function26 = function213;
                    function27 = function216;
                    function28 = function214;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i152 = i4 << 3;
                    int i162 = i4 >> 9;
                    composer2 = startRestartGroup;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, value, innerTextField, visualTransformation, function26, function28, function25, function27, z2, z, z4, interactionSource, paddingValues2, textFieldColors3, null, composer2, (i152 & 896) | (i152 & 112) | 6 | ((i4 >> 3) & 7168) | (i162 & 57344) | (i162 & 458752) | (i162 & 3670016) | ((i14 << 21) & 29360128) | ((i4 << 15) & 234881024) | ((i4 << 21) & 1879048192), ((i4 >> 12) & 112) | ((i4 >> 18) & 14) | (i14 & 896) | ((i14 << 6) & 7168), 16384);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z5 = z4;
                    function29 = function26;
                    function210 = function28;
                    function211 = function25;
                    function212 = function27;
                    textFieldColors4 = textFieldColors3;
                    paddingValues3 = paddingValues2;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i4 |= i5;
                i6 = i3 & 64;
                if (i6 == 0) {
                }
                i7 = i3 & 128;
                if (i7 == 0) {
                }
                i8 = i3 & 256;
                if (i8 == 0) {
                }
                i9 = i3 & 512;
                if (i9 == 0) {
                }
                i10 = i3 & 1024;
                if (i10 == 0) {
                }
                if ((i2 & 112) == 0) {
                }
                if ((i2 & 896) == 0) {
                }
                int i142 = i11;
                if ((i3 & 8192) == 0) {
                }
                if ((i4 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i10 == 0) {
                }
                if ((i3 & 2048) != 0) {
                }
                Function2<? super Composer, ? super Integer, Unit> function21722 = function215;
                if ((i3 & 4096) != 0) {
                }
                textFieldColors3 = textFieldColors2;
                z4 = z6;
                function26 = function213;
                function27 = function216;
                function28 = function214;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i1522 = i4 << 3;
                int i1622 = i4 >> 9;
                composer2 = startRestartGroup;
                TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, value, innerTextField, visualTransformation, function26, function28, function25, function27, z2, z, z4, interactionSource, paddingValues2, textFieldColors3, null, composer2, (i1522 & 896) | (i1522 & 112) | 6 | ((i4 >> 3) & 7168) | (i1622 & 57344) | (i1622 & 458752) | (i1622 & 3670016) | ((i142 << 21) & 29360128) | ((i4 << 15) & 234881024) | ((i4 << 21) & 1879048192), ((i4 >> 12) & 112) | ((i4 >> 18) & 14) | (i142 & 896) | ((i142 << 6) & 7168), 16384);
                if (ComposerKt.isTraceInProgress()) {
                }
                z5 = z4;
                function29 = function26;
                function210 = function28;
                function211 = function25;
                function212 = function27;
                textFieldColors4 = textFieldColors3;
                paddingValues3 = paddingValues2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            if ((i3 & 16) != 0) {
            }
            if ((i3 & 32) != 0) {
            }
            i4 |= i5;
            i6 = i3 & 64;
            if (i6 == 0) {
            }
            i7 = i3 & 128;
            if (i7 == 0) {
            }
            i8 = i3 & 256;
            if (i8 == 0) {
            }
            i9 = i3 & 512;
            if (i9 == 0) {
            }
            i10 = i3 & 1024;
            if (i10 == 0) {
            }
            if ((i2 & 112) == 0) {
            }
            if ((i2 & 896) == 0) {
            }
            int i1422 = i11;
            if ((i3 & 8192) == 0) {
            }
            if ((i4 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i10 == 0) {
            }
            if ((i3 & 2048) != 0) {
            }
            Function2<? super Composer, ? super Integer, Unit> function217222 = function215;
            if ((i3 & 4096) != 0) {
            }
            textFieldColors3 = textFieldColors2;
            z4 = z6;
            function26 = function213;
            function27 = function216;
            function28 = function214;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i15222 = i4 << 3;
            int i16222 = i4 >> 9;
            composer2 = startRestartGroup;
            TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, value, innerTextField, visualTransformation, function26, function28, function25, function27, z2, z, z4, interactionSource, paddingValues2, textFieldColors3, null, composer2, (i15222 & 896) | (i15222 & 112) | 6 | ((i4 >> 3) & 7168) | (i16222 & 57344) | (i16222 & 458752) | (i16222 & 3670016) | ((i1422 << 21) & 29360128) | ((i4 << 15) & 234881024) | ((i4 << 21) & 1879048192), ((i4 >> 12) & 112) | ((i4 >> 18) & 14) | (i1422 & 896) | ((i1422 << 6) & 7168), 16384);
            if (ComposerKt.isTraceInProgress()) {
            }
            z5 = z4;
            function29 = function26;
            function210 = function28;
            function211 = function25;
            function212 = function27;
            textFieldColors4 = textFieldColors3;
            paddingValues3 = paddingValues2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i3 & 8) == 0) {
        }
        if ((i3 & 16) != 0) {
        }
        if ((i3 & 32) != 0) {
        }
        i4 |= i5;
        i6 = i3 & 64;
        if (i6 == 0) {
        }
        i7 = i3 & 128;
        if (i7 == 0) {
        }
        i8 = i3 & 256;
        if (i8 == 0) {
        }
        i9 = i3 & 512;
        if (i9 == 0) {
        }
        i10 = i3 & 1024;
        if (i10 == 0) {
        }
        if ((i2 & 112) == 0) {
        }
        if ((i2 & 896) == 0) {
        }
        int i14222 = i11;
        if ((i3 & 8192) == 0) {
        }
        if ((i4 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 == 0) {
        }
        if ((i3 & 2048) != 0) {
        }
        Function2<? super Composer, ? super Integer, Unit> function2172222 = function215;
        if ((i3 & 4096) != 0) {
        }
        textFieldColors3 = textFieldColors2;
        z4 = z6;
        function26 = function213;
        function27 = function216;
        function28 = function214;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i152222 = i4 << 3;
        int i162222 = i4 >> 9;
        composer2 = startRestartGroup;
        TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, value, innerTextField, visualTransformation, function26, function28, function25, function27, z2, z, z4, interactionSource, paddingValues2, textFieldColors3, null, composer2, (i152222 & 896) | (i152222 & 112) | 6 | ((i4 >> 3) & 7168) | (i162222 & 57344) | (i162222 & 458752) | (i162222 & 3670016) | ((i14222 << 21) & 29360128) | ((i4 << 15) & 234881024) | ((i4 << 21) & 1879048192), ((i4 >> 12) & 112) | ((i4 >> 18) & 14) | (i14222 & 896) | ((i14222 << 6) & 7168), 16384);
        if (ComposerKt.isTraceInProgress()) {
        }
        z5 = z4;
        function29 = function26;
        function210 = function28;
        function211 = function25;
        function212 = function27;
        textFieldColors4 = textFieldColors3;
        paddingValues3 = paddingValues2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:218:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OutlinedTextFieldDecorationBox(String value, Function2<? super Composer, ? super Integer, Unit> innerTextField, boolean z, boolean z2, VisualTransformation visualTransformation, InteractionSource interactionSource, boolean z3, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, TextFieldColors textFieldColors, PaddingValues paddingValues, Function2<? super Composer, ? super Integer, Unit> function25, Composer composer, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        TextFieldColors textFieldColors2;
        PaddingValues paddingValues2;
        PaddingValues paddingValues3;
        TextFieldColors textFieldColors3;
        ComposableLambda composableLambda;
        Function2<? super Composer, ? super Integer, Unit> function26;
        Function2<? super Composer, ? super Integer, Unit> function27;
        boolean z4;
        Function2<? super Composer, ? super Integer, Unit> function28;
        Function2<? super Composer, ? super Integer, Unit> function29;
        Composer composer2;
        boolean z5;
        Function2<? super Composer, ? super Integer, Unit> function210;
        Function2<? super Composer, ? super Integer, Unit> function211;
        Function2<? super Composer, ? super Integer, Unit> function212;
        Function2<? super Composer, ? super Integer, Unit> function213;
        TextFieldColors textFieldColors4;
        PaddingValues paddingValues4;
        Function2<? super Composer, ? super Integer, Unit> function214;
        ScopeUpdateScope endRestartGroup;
        int i13;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
        Intrinsics.checkNotNullParameter(visualTransformation, "visualTransformation");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Composer startRestartGroup = composer.startRestartGroup(-1280721485);
        ComposerKt.sourceInformation(startRestartGroup, "C(OutlinedTextFieldDecorationBox)P(12,4,3,10,13,5,6,7,9,8,11,1,2)646@30369L25,652@30600L600:TextFieldDefaults.kt#jmzs0o");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (startRestartGroup.changed(value) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= startRestartGroup.changedInstance(innerTextField) ? 32 : 16;
        }
        int i14 = 128;
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 896) == 0) {
            i4 |= startRestartGroup.changed(z) ? 256 : 128;
            if ((i3 & 8) == 0) {
                i4 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((i3 & 16) != 0) {
                    i4 |= 24576;
                } else if ((i & 57344) == 0) {
                    i4 |= startRestartGroup.changed(visualTransformation) ? 16384 : 8192;
                }
                if ((i3 & 32) != 0) {
                    i5 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else {
                    if ((i & 458752) == 0) {
                        i5 = startRestartGroup.changed(interactionSource) ? 131072 : 65536;
                    }
                    i6 = i3 & 64;
                    if (i6 == 0) {
                        i4 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        i4 |= startRestartGroup.changed(z3) ? 1048576 : 524288;
                    }
                    i7 = i3 & 128;
                    if (i7 == 0) {
                        i4 |= 12582912;
                    } else if ((i & 29360128) == 0) {
                        i4 |= startRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
                    }
                    i8 = i3 & 256;
                    if (i8 == 0) {
                        i4 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        i4 |= startRestartGroup.changedInstance(function22) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    i9 = i3 & 512;
                    if (i9 == 0) {
                        i4 |= C.ENCODING_PCM_32BIT;
                    } else if ((i & 1879048192) == 0) {
                        i4 |= startRestartGroup.changedInstance(function23) ? 536870912 : 268435456;
                    }
                    i10 = i3 & 1024;
                    if (i10 == 0) {
                        i11 = i2 | 6;
                    } else if ((i2 & 14) == 0) {
                        i11 = i2 | (startRestartGroup.changedInstance(function24) ? 4 : 2);
                    } else {
                        i11 = i2;
                    }
                    if ((i2 & 112) == 0) {
                        if ((i3 & 2048) == 0 && startRestartGroup.changed(textFieldColors)) {
                            i13 = 32;
                            i11 |= i13;
                        }
                        i13 = 16;
                        i11 |= i13;
                    }
                    if ((i2 & 896) == 0) {
                        if ((i3 & 4096) == 0 && startRestartGroup.changed(paddingValues)) {
                            i14 = 256;
                        }
                        i11 |= i14;
                    }
                    int i15 = i11;
                    i12 = i3 & 8192;
                    if (i12 == 0) {
                        i15 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                    } else if ((i2 & 7168) == 0) {
                        i15 |= startRestartGroup.changedInstance(function25) ? 2048 : 1024;
                        if ((i3 & 16384) != 0) {
                            i15 |= 24576;
                        } else if ((i2 & 57344) == 0) {
                            i15 |= startRestartGroup.changed(this) ? 16384 : 8192;
                            if ((i4 & 1533916891) == 306783378 || (46811 & i15) != 9362 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    boolean z6 = i6 == 0 ? false : z3;
                                    Function2<? super Composer, ? super Integer, Unit> function215 = i7 == 0 ? null : function2;
                                    Function2<? super Composer, ? super Integer, Unit> function216 = i8 == 0 ? null : function22;
                                    Function2<? super Composer, ? super Integer, Unit> function217 = i9 == 0 ? null : function23;
                                    Function2<? super Composer, ? super Integer, Unit> function218 = i10 == 0 ? function24 : null;
                                    if ((i3 & 2048) == 0) {
                                        textFieldColors2 = m1514outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 0, (i15 >> 9) & 112, 2097151);
                                        i15 &= -113;
                                    } else {
                                        textFieldColors2 = textFieldColors;
                                    }
                                    Function2<? super Composer, ? super Integer, Unit> function219 = function217;
                                    if ((i3 & 4096) == 0) {
                                        paddingValues2 = m1505outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                        i15 &= -897;
                                    } else {
                                        paddingValues2 = paddingValues;
                                    }
                                    if (i12 == 0) {
                                        paddingValues3 = paddingValues2;
                                        textFieldColors3 = textFieldColors2;
                                        function26 = function219;
                                        composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, 1261916269, true, new TextFieldDefaults$OutlinedTextFieldDecorationBox$1(z, z6, interactionSource, textFieldColors2, i4, i15));
                                    } else {
                                        paddingValues3 = paddingValues2;
                                        textFieldColors3 = textFieldColors2;
                                        composableLambda = function25;
                                        function26 = function219;
                                    }
                                    function27 = function215;
                                    z4 = z6;
                                    function28 = function216;
                                    function29 = function218;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i3 & 2048) != 0) {
                                        i15 &= -113;
                                    }
                                    if ((i3 & 4096) != 0) {
                                        i15 &= -897;
                                    }
                                    z4 = z3;
                                    function27 = function2;
                                    function28 = function22;
                                    function26 = function23;
                                    function29 = function24;
                                    textFieldColors3 = textFieldColors;
                                    paddingValues3 = paddingValues;
                                    composableLambda = function25;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1280721485, i4, i15, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)");
                                }
                                int i16 = i4 << 3;
                                int i17 = i4 >> 9;
                                composer2 = startRestartGroup;
                                TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function27, function28, function26, function29, z2, z, z4, interactionSource, paddingValues3, textFieldColors3, composableLambda, composer2, (i16 & 896) | (i16 & 112) | 6 | ((i4 >> 3) & 7168) | (i17 & 57344) | (458752 & i17) | (i17 & 3670016) | ((i15 << 21) & 29360128) | ((i4 << 15) & 234881024) | ((i4 << 21) & 1879048192), ((i4 >> 12) & 112) | ((i4 >> 18) & 14) | (i15 & 896) | ((i15 << 6) & 7168) | ((i15 << 3) & 57344), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                z5 = z4;
                                function210 = function27;
                                function211 = function28;
                                function212 = function26;
                                function213 = function29;
                                textFieldColors4 = textFieldColors3;
                                paddingValues4 = paddingValues3;
                                function214 = composableLambda;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                function210 = function2;
                                function211 = function22;
                                function212 = function23;
                                function213 = function24;
                                textFieldColors4 = textFieldColors;
                                paddingValues4 = paddingValues;
                                function214 = function25;
                                composer2 = startRestartGroup;
                                z5 = z3;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                                return;
                            }
                            endRestartGroup.updateScope(new TextFieldDefaults$OutlinedTextFieldDecorationBox$2(this, value, innerTextField, z, z2, visualTransformation, interactionSource, z5, function210, function211, function212, function213, textFieldColors4, paddingValues4, function214, i, i2, i3));
                            return;
                        }
                        if ((i4 & 1533916891) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if ((i3 & 2048) == 0) {
                        }
                        Function2<? super Composer, ? super Integer, Unit> function2192 = function217;
                        if ((i3 & 4096) == 0) {
                        }
                        if (i12 == 0) {
                        }
                        function27 = function215;
                        z4 = z6;
                        function28 = function216;
                        function29 = function218;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i162 = i4 << 3;
                        int i172 = i4 >> 9;
                        composer2 = startRestartGroup;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function27, function28, function26, function29, z2, z, z4, interactionSource, paddingValues3, textFieldColors3, composableLambda, composer2, (i162 & 896) | (i162 & 112) | 6 | ((i4 >> 3) & 7168) | (i172 & 57344) | (458752 & i172) | (i172 & 3670016) | ((i15 << 21) & 29360128) | ((i4 << 15) & 234881024) | ((i4 << 21) & 1879048192), ((i4 >> 12) & 112) | ((i4 >> 18) & 14) | (i15 & 896) | ((i15 << 6) & 7168) | ((i15 << 3) & 57344), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        z5 = z4;
                        function210 = function27;
                        function211 = function28;
                        function212 = function26;
                        function213 = function29;
                        textFieldColors4 = textFieldColors3;
                        paddingValues4 = paddingValues3;
                        function214 = composableLambda;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    if ((i3 & 16384) != 0) {
                    }
                    if ((i4 & 1533916891) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i10 == 0) {
                    }
                    if ((i3 & 2048) == 0) {
                    }
                    Function2<? super Composer, ? super Integer, Unit> function21922 = function217;
                    if ((i3 & 4096) == 0) {
                    }
                    if (i12 == 0) {
                    }
                    function27 = function215;
                    z4 = z6;
                    function28 = function216;
                    function29 = function218;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i1622 = i4 << 3;
                    int i1722 = i4 >> 9;
                    composer2 = startRestartGroup;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function27, function28, function26, function29, z2, z, z4, interactionSource, paddingValues3, textFieldColors3, composableLambda, composer2, (i1622 & 896) | (i1622 & 112) | 6 | ((i4 >> 3) & 7168) | (i1722 & 57344) | (458752 & i1722) | (i1722 & 3670016) | ((i15 << 21) & 29360128) | ((i4 << 15) & 234881024) | ((i4 << 21) & 1879048192), ((i4 >> 12) & 112) | ((i4 >> 18) & 14) | (i15 & 896) | ((i15 << 6) & 7168) | ((i15 << 3) & 57344), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z5 = z4;
                    function210 = function27;
                    function211 = function28;
                    function212 = function26;
                    function213 = function29;
                    textFieldColors4 = textFieldColors3;
                    paddingValues4 = paddingValues3;
                    function214 = composableLambda;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i4 |= i5;
                i6 = i3 & 64;
                if (i6 == 0) {
                }
                i7 = i3 & 128;
                if (i7 == 0) {
                }
                i8 = i3 & 256;
                if (i8 == 0) {
                }
                i9 = i3 & 512;
                if (i9 == 0) {
                }
                i10 = i3 & 1024;
                if (i10 == 0) {
                }
                if ((i2 & 112) == 0) {
                }
                if ((i2 & 896) == 0) {
                }
                int i152 = i11;
                i12 = i3 & 8192;
                if (i12 == 0) {
                }
                if ((i3 & 16384) != 0) {
                }
                if ((i4 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if (i10 == 0) {
                }
                if ((i3 & 2048) == 0) {
                }
                Function2<? super Composer, ? super Integer, Unit> function219222 = function217;
                if ((i3 & 4096) == 0) {
                }
                if (i12 == 0) {
                }
                function27 = function215;
                z4 = z6;
                function28 = function216;
                function29 = function218;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i16222 = i4 << 3;
                int i17222 = i4 >> 9;
                composer2 = startRestartGroup;
                TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function27, function28, function26, function29, z2, z, z4, interactionSource, paddingValues3, textFieldColors3, composableLambda, composer2, (i16222 & 896) | (i16222 & 112) | 6 | ((i4 >> 3) & 7168) | (i17222 & 57344) | (458752 & i17222) | (i17222 & 3670016) | ((i152 << 21) & 29360128) | ((i4 << 15) & 234881024) | ((i4 << 21) & 1879048192), ((i4 >> 12) & 112) | ((i4 >> 18) & 14) | (i152 & 896) | ((i152 << 6) & 7168) | ((i152 << 3) & 57344), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                z5 = z4;
                function210 = function27;
                function211 = function28;
                function212 = function26;
                function213 = function29;
                textFieldColors4 = textFieldColors3;
                paddingValues4 = paddingValues3;
                function214 = composableLambda;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            if ((i3 & 16) != 0) {
            }
            if ((i3 & 32) != 0) {
            }
            i4 |= i5;
            i6 = i3 & 64;
            if (i6 == 0) {
            }
            i7 = i3 & 128;
            if (i7 == 0) {
            }
            i8 = i3 & 256;
            if (i8 == 0) {
            }
            i9 = i3 & 512;
            if (i9 == 0) {
            }
            i10 = i3 & 1024;
            if (i10 == 0) {
            }
            if ((i2 & 112) == 0) {
            }
            if ((i2 & 896) == 0) {
            }
            int i1522 = i11;
            i12 = i3 & 8192;
            if (i12 == 0) {
            }
            if ((i3 & 16384) != 0) {
            }
            if ((i4 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if (i10 == 0) {
            }
            if ((i3 & 2048) == 0) {
            }
            Function2<? super Composer, ? super Integer, Unit> function2192222 = function217;
            if ((i3 & 4096) == 0) {
            }
            if (i12 == 0) {
            }
            function27 = function215;
            z4 = z6;
            function28 = function216;
            function29 = function218;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i162222 = i4 << 3;
            int i172222 = i4 >> 9;
            composer2 = startRestartGroup;
            TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function27, function28, function26, function29, z2, z, z4, interactionSource, paddingValues3, textFieldColors3, composableLambda, composer2, (i162222 & 896) | (i162222 & 112) | 6 | ((i4 >> 3) & 7168) | (i172222 & 57344) | (458752 & i172222) | (i172222 & 3670016) | ((i1522 << 21) & 29360128) | ((i4 << 15) & 234881024) | ((i4 << 21) & 1879048192), ((i4 >> 12) & 112) | ((i4 >> 18) & 14) | (i1522 & 896) | ((i1522 << 6) & 7168) | ((i1522 << 3) & 57344), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            z5 = z4;
            function210 = function27;
            function211 = function28;
            function212 = function26;
            function213 = function29;
            textFieldColors4 = textFieldColors3;
            paddingValues4 = paddingValues3;
            function214 = composableLambda;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i3 & 8) == 0) {
        }
        if ((i3 & 16) != 0) {
        }
        if ((i3 & 32) != 0) {
        }
        i4 |= i5;
        i6 = i3 & 64;
        if (i6 == 0) {
        }
        i7 = i3 & 128;
        if (i7 == 0) {
        }
        i8 = i3 & 256;
        if (i8 == 0) {
        }
        i9 = i3 & 512;
        if (i9 == 0) {
        }
        i10 = i3 & 1024;
        if (i10 == 0) {
        }
        if ((i2 & 112) == 0) {
        }
        if ((i2 & 896) == 0) {
        }
        int i15222 = i11;
        i12 = i3 & 8192;
        if (i12 == 0) {
        }
        if ((i3 & 16384) != 0) {
        }
        if ((i4 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if (i10 == 0) {
        }
        if ((i3 & 2048) == 0) {
        }
        Function2<? super Composer, ? super Integer, Unit> function21922222 = function217;
        if ((i3 & 4096) == 0) {
        }
        if (i12 == 0) {
        }
        function27 = function215;
        z4 = z6;
        function28 = function216;
        function29 = function218;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i1622222 = i4 << 3;
        int i1722222 = i4 >> 9;
        composer2 = startRestartGroup;
        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function27, function28, function26, function29, z2, z, z4, interactionSource, paddingValues3, textFieldColors3, composableLambda, composer2, (i1622222 & 896) | (i1622222 & 112) | 6 | ((i4 >> 3) & 7168) | (i1722222 & 57344) | (458752 & i1722222) | (i1722222 & 3670016) | ((i15222 << 21) & 29360128) | ((i4 << 15) & 234881024) | ((i4 << 21) & 1879048192), ((i4 >> 12) & 112) | ((i4 >> 18) & 14) | (i15222 & 896) | ((i15222 << 6) & 7168) | ((i15222 << 3) & 57344), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        z5 = z4;
        function210 = function27;
        function211 = function28;
        function212 = function26;
        function213 = function29;
        textFieldColors4 = textFieldColors3;
        paddingValues4 = paddingValues3;
        function214 = composableLambda;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: indicatorLine-gv0btCI  reason: not valid java name */
    public final Modifier m1513indicatorLinegv0btCI(Modifier indicatorLine, boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors colors, float f, float f2) {
        Intrinsics.checkNotNullParameter(indicatorLine, "$this$indicatorLine");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(colors, "colors");
        return ComposedModifierKt.composed(indicatorLine, InspectableValueKt.isDebugInspectorInfoEnabled() ? new TextFieldDefaults$indicatorLinegv0btCI$$inlined$debugInspectorInfo$1(z, z2, interactionSource, colors, f, f2) : InspectableValueKt.getNoInspectorInfo(), new TextFieldDefaults$indicatorLine$2(z, z2, interactionSource, colors, f, f2));
    }
}
