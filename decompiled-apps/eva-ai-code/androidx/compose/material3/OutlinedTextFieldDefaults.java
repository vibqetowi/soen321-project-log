package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.tokens.OutlinedTextFieldTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
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
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b)\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JS\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u0004H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u009c\u0002\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020!2\u0011\u0010\"\u001a\r\u0012\u0004\u0012\u00020\u00130#¢\u0006\u0002\b$2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u00152\u0006\u0010&\u001a\u00020'2\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u0015\b\u0002\u0010(\u001a\u000f\u0012\u0004\u0012\u00020\u0013\u0018\u00010#¢\u0006\u0002\b$2\u0015\b\u0002\u0010)\u001a\u000f\u0012\u0004\u0012\u00020\u0013\u0018\u00010#¢\u0006\u0002\b$2\u0015\b\u0002\u0010*\u001a\u000f\u0012\u0004\u0012\u00020\u0013\u0018\u00010#¢\u0006\u0002\b$2\u0015\b\u0002\u0010+\u001a\u000f\u0012\u0004\u0012\u00020\u0013\u0018\u00010#¢\u0006\u0002\b$2\u0015\b\u0002\u0010,\u001a\u000f\u0012\u0004\u0012\u00020\u0013\u0018\u00010#¢\u0006\u0002\b$2\u0015\b\u0002\u0010-\u001a\u000f\u0012\u0004\u0012\u00020\u0013\u0018\u00010#¢\u0006\u0002\b$2\u0015\b\u0002\u0010.\u001a\u000f\u0012\u0004\u0012\u00020\u0013\u0018\u00010#¢\u0006\u0002\b$2\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010/\u001a\u0002002\u0013\b\u0002\u00101\u001a\r\u0012\u0004\u0012\u00020\u00130#¢\u0006\u0002\b$H\u0007¢\u0006\u0002\u00102JÃ\u0003\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u0002042\b\b\u0002\u00106\u001a\u0002042\b\b\u0002\u00107\u001a\u0002042\b\b\u0002\u00108\u001a\u0002042\b\b\u0002\u00109\u001a\u0002042\b\b\u0002\u0010:\u001a\u0002042\b\b\u0002\u0010;\u001a\u0002042\b\b\u0002\u0010<\u001a\u0002042\b\b\u0002\u0010=\u001a\u0002042\b\b\u0002\u0010>\u001a\u00020?2\b\b\u0002\u0010@\u001a\u0002042\b\b\u0002\u0010A\u001a\u0002042\b\b\u0002\u0010B\u001a\u0002042\b\b\u0002\u0010C\u001a\u0002042\b\b\u0002\u0010D\u001a\u0002042\b\b\u0002\u0010E\u001a\u0002042\b\b\u0002\u0010F\u001a\u0002042\b\b\u0002\u0010G\u001a\u0002042\b\b\u0002\u0010H\u001a\u0002042\b\b\u0002\u0010I\u001a\u0002042\b\b\u0002\u0010J\u001a\u0002042\b\b\u0002\u0010K\u001a\u0002042\b\b\u0002\u0010L\u001a\u0002042\b\b\u0002\u0010M\u001a\u0002042\b\b\u0002\u0010N\u001a\u0002042\b\b\u0002\u0010O\u001a\u0002042\b\b\u0002\u0010P\u001a\u0002042\b\b\u0002\u0010Q\u001a\u0002042\b\b\u0002\u0010R\u001a\u0002042\b\b\u0002\u0010S\u001a\u0002042\b\b\u0002\u0010T\u001a\u0002042\b\b\u0002\u0010U\u001a\u0002042\b\b\u0002\u0010V\u001a\u0002042\b\b\u0002\u0010W\u001a\u0002042\b\b\u0002\u0010X\u001a\u0002042\b\b\u0002\u0010Y\u001a\u0002042\b\b\u0002\u0010Z\u001a\u0002042\b\b\u0002\u0010[\u001a\u0002042\b\b\u0002\u0010\\\u001a\u0002042\b\b\u0002\u0010]\u001a\u0002042\b\b\u0002\u0010^\u001a\u0002042\b\b\u0002\u0010_\u001a\u000204H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b`\u0010aJ;\u0010/\u001a\u0002002\b\b\u0002\u0010b\u001a\u00020\u00042\b\b\u0002\u0010c\u001a\u00020\u00042\b\b\u0002\u0010d\u001a\u00020\u00042\b\b\u0002\u0010e\u001a\u00020\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bf\u0010gR\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u001c\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u0011\u0010\u000e\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006h"}, d2 = {"Landroidx/compose/material3/OutlinedTextFieldDefaults;", "", "()V", "FocusedBorderThickness", "Landroidx/compose/ui/unit/Dp;", "getFocusedBorderThickness-D9Ej5fM", "()F", "F", "MinHeight", "getMinHeight-D9Ej5fM", "MinWidth", "getMinWidth-D9Ej5fM", "UnfocusedBorderThickness", "getUnfocusedBorderThickness-D9Ej5fM", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "ContainerBox", "", "enabled", "", "isError", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "colors", "Landroidx/compose/material3/TextFieldColors;", "focusedBorderThickness", "unfocusedBorderThickness", "ContainerBox-nbWgWpA", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/ui/graphics/Shape;FFLandroidx/compose/runtime/Composer;II)V", "DecorationBox", "value", "", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "singleLine", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", Constants.ScionAnalytics.PARAM_LABEL, "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", TtmlNode.RUBY_CONTAINER, "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "focusedTextColor", "Landroidx/compose/ui/graphics/Color;", "unfocusedTextColor", "disabledTextColor", "errorTextColor", "focusedContainerColor", "unfocusedContainerColor", "disabledContainerColor", "errorContainerColor", "cursorColor", "errorCursorColor", "selectionColors", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "disabledPlaceholderColor", "errorPlaceholderColor", "focusedSupportingTextColor", "unfocusedSupportingTextColor", "disabledSupportingTextColor", "errorSupportingTextColor", "focusedPrefixColor", "unfocusedPrefixColor", "disabledPrefixColor", "errorPrefixColor", "focusedSuffixColor", "unfocusedSuffixColor", "disabledSuffixColor", "errorSuffixColor", "colors-0hiis_0", "(JJJJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIIIIII)Landroidx/compose/material3/TextFieldColors;", TtmlNode.START, ViewHierarchyConstants.DIMENSION_TOP_KEY, TtmlNode.END, "bottom", "contentPadding-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OutlinedTextFieldDefaults {
    public static final int $stable = 0;
    public static final OutlinedTextFieldDefaults INSTANCE = new OutlinedTextFieldDefaults();
    private static final float MinHeight = Dp.m5607constructorimpl(56);
    private static final float MinWidth = Dp.m5607constructorimpl(280);
    private static final float UnfocusedBorderThickness = Dp.m5607constructorimpl(1);
    private static final float FocusedBorderThickness = Dp.m5607constructorimpl(2);

    private OutlinedTextFieldDefaults() {
    }

    public final Shape getShape(Composer composer, int i) {
        composer.startReplaceableGroup(-1066756961);
        ComposerKt.sourceInformation(composer, "C1347@74442L9:TextFieldDefaults.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1066756961, i, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.<get-shape> (TextFieldDefaults.kt:1347)");
        }
        Shape shape = ShapesKt.toShape(OutlinedTextFieldTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    /* renamed from: getMinHeight-D9Ej5fM  reason: not valid java name */
    public final float m1913getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM  reason: not valid java name */
    public final float m1914getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    /* renamed from: getUnfocusedBorderThickness-D9Ej5fM  reason: not valid java name */
    public final float m1915getUnfocusedBorderThicknessD9Ej5fM() {
        return UnfocusedBorderThickness;
    }

    /* renamed from: getFocusedBorderThickness-D9Ej5fM  reason: not valid java name */
    public final float m1912getFocusedBorderThicknessD9Ej5fM() {
        return FocusedBorderThickness;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01da  */
    /* renamed from: ContainerBox-nbWgWpA  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1909ContainerBoxnbWgWpA(boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors colors, Shape shape, float f, float f2, Composer composer, int i, int i2) {
        int i3;
        Shape shape2;
        float f3;
        float f4;
        Object obj;
        float f5;
        float f6;
        Shape shape3;
        float f7;
        float f8;
        int i4;
        int i5;
        int i6;
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Composer startRestartGroup = composer.startRestartGroup(1461761386);
        ComposerKt.sourceInformation(startRestartGroup, "C(ContainerBox)P(1,4,3!1,5,2:c#ui.unit.Dp,6:c#ui.unit.Dp)1394@76327L9,1398@76498L203,1410@76843L51,1406@76710L199:TextFieldDefaults.kt#uh7d8r");
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
                    i6 = 16384;
                    i3 |= i6;
                }
            } else {
                shape2 = shape;
            }
            i6 = 8192;
            i3 |= i6;
        } else {
            shape2 = shape;
        }
        if ((i & 458752) == 0) {
            if ((i2 & 32) == 0) {
                f3 = f;
                if (startRestartGroup.changed(f3)) {
                    i5 = 131072;
                    i3 |= i5;
                }
            } else {
                f3 = f;
            }
            i5 = 65536;
            i3 |= i5;
        } else {
            f3 = f;
        }
        if ((3670016 & i) == 0) {
            if ((i2 & 64) == 0) {
                f4 = f2;
                if (startRestartGroup.changed(f4)) {
                    i4 = 1048576;
                    i3 |= i4;
                }
            } else {
                f4 = f2;
            }
            i4 = 524288;
            i3 |= i4;
        } else {
            f4 = f2;
        }
        if ((i2 & 128) != 0) {
            i3 |= 12582912;
        } else if ((29360128 & i) == 0) {
            i3 |= startRestartGroup.changed(this) ? 8388608 : 4194304;
        }
        if ((23967451 & i3) != 4793490 || !startRestartGroup.getSkipping()) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 16) != 0) {
                    shape2 = ShapesKt.toShape(OutlinedTextFieldTokens.INSTANCE.getContainerShape(), startRestartGroup, 6);
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
                        ComposerKt.traceEventStart(1461761386, i3, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.ContainerBox (TextFieldDefaults.kt:1389)");
                    }
                    int i7 = (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168);
                    int i8 = i3 >> 3;
                    Shape shape4 = obj;
                    BoxKt.Box(BackgroundKt.m420backgroundbw27NRU(BorderKt.border(Modifier.Companion, (BorderStroke) TextFieldDefaultsKt.m2133access$animateBorderStrokeAsStateNuRrP5Q(z, z2, interactionSource, colors, f6, f5, startRestartGroup, i7 | (i8 & 57344) | (i8 & 458752)).getValue(), shape4), colors.containerColor$material3_release(z, z2, interactionSource, startRestartGroup, i7).getValue().m3301unboximpl(), shape4), startRestartGroup, 0);
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
            int i72 = (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168);
            int i82 = i3 >> 3;
            Shape shape42 = obj;
            BoxKt.Box(BackgroundKt.m420backgroundbw27NRU(BorderKt.border(Modifier.Companion, (BorderStroke) TextFieldDefaultsKt.m2133access$animateBorderStrokeAsStateNuRrP5Q(z, z2, interactionSource, colors, f6, f5, startRestartGroup, i72 | (i82 & 57344) | (i82 & 458752)).getValue(), shape42), colors.containerColor$material3_release(z, z2, interactionSource, startRestartGroup, i72).getValue().m3301unboximpl(), shape42), startRestartGroup, 0);
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
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new OutlinedTextFieldDefaults$ContainerBox$1(this, z, z2, interactionSource, colors, shape3, f7, f8, i, i2));
    }

    /* renamed from: contentPadding-a9UjIt4$default  reason: not valid java name */
    public static /* synthetic */ PaddingValues m1908contentPaddinga9UjIt4$default(OutlinedTextFieldDefaults outlinedTextFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
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
        return outlinedTextFieldDefaults.m1911contentPaddinga9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: contentPadding-a9UjIt4  reason: not valid java name */
    public final PaddingValues m1911contentPaddinga9UjIt4(float f, float f2, float f3, float f4) {
        return PaddingKt.m744PaddingValuesa9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: colors-0hiis_0  reason: not valid java name */
    public final TextFieldColors m1910colors0hiis_0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, TextSelectionColors textSelectionColors, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, Composer composer, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        TextSelectionColors textSelectionColors2;
        composer.startReplaceableGroup(1767617725);
        ComposerKt.sourceInformation(composer, "C(colors)P(30:c#ui.graphics.Color,41:c#ui.graphics.Color,9:c#ui.graphics.Color,20:c#ui.graphics.Color,23:c#ui.graphics.Color,34:c#ui.graphics.Color,2:c#ui.graphics.Color,12:c#ui.graphics.Color,0:c#ui.graphics.Color,13:c#ui.graphics.Color,32,22:c#ui.graphics.Color,33:c#ui.graphics.Color,1:c#ui.graphics.Color,11:c#ui.graphics.Color,25:c#ui.graphics.Color,36:c#ui.graphics.Color,4:c#ui.graphics.Color,15:c#ui.graphics.Color,31:c#ui.graphics.Color,42:c#ui.graphics.Color,10:c#ui.graphics.Color,21:c#ui.graphics.Color,24:c#ui.graphics.Color,35:c#ui.graphics.Color,3:c#ui.graphics.Color,14:c#ui.graphics.Color,26:c#ui.graphics.Color,37:c#ui.graphics.Color,5:c#ui.graphics.Color,16:c#ui.graphics.Color,29:c#ui.graphics.Color,40:c#ui.graphics.Color,8:c#ui.graphics.Color,19:c#ui.graphics.Color,27:c#ui.graphics.Color,38:c#ui.graphics.Color,6:c#ui.graphics.Color,17:c#ui.graphics.Color,28:c#ui.graphics.Color,39:c#ui.graphics.Color,7:c#ui.graphics.Color,18:c#ui.graphics.Color)1479@81602L9,1480@81684L9,1481@81773L9,1483@81928L9,1488@82236L9,1489@82326L9,1490@82409L7,1491@82496L9,1492@82582L9,1493@82675L9,1495@82836L9,1496@82934L9,1497@83029L9,1498@83131L9,1500@83305L9,1501@83405L9,1502@83502L9,1504@83619L9,1505@83783L9,1506@83869L9,1507@83952L9,1508@84042L9,1510@84198L9,1511@84296L9,1512@84396L9,1513@84492L9,1515@84660L9,1516@84760L9,1517@84857L9,1519@84974L9,1520@85136L9,1521@85224L9,1522@85314L9,1523@85403L9,1525@85561L9,1526@85649L9,1527@85739L9,1528@85828L9,1530@85986L9:TextFieldDefaults.kt#uh7d8r");
        long color = (i6 & 1) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusInputColor(), composer, 6) : j;
        long color2 = (i6 & 2) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputColor(), composer, 6) : j2;
        long m3290copywmQWz5c$default = (i6 & 4) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long color3 = (i6 & 8) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorInputColor(), composer, 6) : j4;
        long m3326getTransparent0d7_KjU = (i6 & 16) != 0 ? Color.Companion.m3326getTransparent0d7_KjU() : j5;
        long m3326getTransparent0d7_KjU2 = (i6 & 32) != 0 ? Color.Companion.m3326getTransparent0d7_KjU() : j6;
        long m3326getTransparent0d7_KjU3 = (i6 & 64) != 0 ? Color.Companion.m3326getTransparent0d7_KjU() : j7;
        long m3326getTransparent0d7_KjU4 = (i6 & 128) != 0 ? Color.Companion.m3326getTransparent0d7_KjU() : j8;
        long color4 = (i6 & 256) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getCaretColor(), composer, 6) : j9;
        long color5 = (i6 & 512) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorFocusCaretColor(), composer, 6) : j10;
        if ((i6 & 1024) != 0) {
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors());
            ComposerKt.sourceInformationMarkerEnd(composer);
            textSelectionColors2 = (TextSelectionColors) consume;
        } else {
            textSelectionColors2 = textSelectionColors;
        }
        long color6 = (i6 & 2048) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusOutlineColor(), composer, 6) : j11;
        long color7 = (i6 & 4096) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getOutlineColor(), composer, 6) : j12;
        long m3290copywmQWz5c$default2 = (i6 & 8192) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        long color8 = (i6 & 16384) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorOutlineColor(), composer, 6) : j14;
        long color9 = (32768 & i6) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusLeadingIconColor(), composer, 6) : j15;
        long color10 = (65536 & i6) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j16;
        long m3290copywmQWz5c$default3 = (131072 & i6) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledLeadingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j17;
        long color11 = (262144 & i6) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorLeadingIconColor(), composer, 6) : j18;
        long color12 = (524288 & i6) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusTrailingIconColor(), composer, 6) : j19;
        long color13 = (1048576 & i6) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j20;
        long m3290copywmQWz5c$default4 = (2097152 & i6) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledTrailingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j21;
        long color14 = (4194304 & i6) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorTrailingIconColor(), composer, 6) : j22;
        long color15 = (8388608 & i6) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusLabelColor(), composer, 6) : j23;
        long color16 = (16777216 & i6) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getLabelColor(), composer, 6) : j24;
        long m3290copywmQWz5c$default5 = (33554432 & i6) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledLabelColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j25;
        long color17 = (67108864 & i6) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorLabelColor(), composer, 6) : j26;
        long color18 = (134217728 & i6) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer, 6) : j27;
        long color19 = (268435456 & i6) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer, 6) : j28;
        long m3290copywmQWz5c$default6 = (536870912 & i6) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j29;
        long color20 = (i6 & 1073741824) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer, 6) : j30;
        long color21 = (i7 & 1) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusSupportingColor(), composer, 6) : j31;
        long color22 = (i7 & 2) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getSupportingColor(), composer, 6) : j32;
        long m3290copywmQWz5c$default7 = (i7 & 4) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledSupportingColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j33;
        long color23 = (i7 & 8) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorSupportingColor(), composer, 6) : j34;
        long color24 = (i7 & 16) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j35;
        long color25 = (i7 & 32) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j36;
        long m3290copywmQWz5c$default8 = (i7 & 64) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j37;
        long color26 = (i7 & 128) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j38;
        long color27 = (i7 & 256) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j39;
        long color28 = (i7 & 512) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j40;
        long m3290copywmQWz5c$default9 = (i7 & 1024) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j41;
        long color29 = (i7 & 2048) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j42;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1767617725, i, i2, "androidx.compose.material3.OutlinedTextFieldDefaults.colors (TextFieldDefaults.kt:1478)");
        }
        TextFieldColors textFieldColors = new TextFieldColors(color, color2, m3290copywmQWz5c$default, color3, m3326getTransparent0d7_KjU, m3326getTransparent0d7_KjU2, m3326getTransparent0d7_KjU3, m3326getTransparent0d7_KjU4, color4, color5, textSelectionColors2, color6, color7, m3290copywmQWz5c$default2, color8, color9, color10, m3290copywmQWz5c$default3, color11, color12, color13, m3290copywmQWz5c$default4, color14, color15, color16, m3290copywmQWz5c$default5, color17, color18, color19, m3290copywmQWz5c$default6, color20, color21, color22, m3290copywmQWz5c$default7, color23, color24, color25, m3290copywmQWz5c$default8, color26, color27, color28, m3290copywmQWz5c$default9, color29, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textFieldColors;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:258:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void DecorationBox(String value, Function2<? super Composer, ? super Integer, Unit> innerTextField, boolean z, boolean z2, VisualTransformation visualTransformation, InteractionSource interactionSource, boolean z3, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Function2<? super Composer, ? super Integer, Unit> function26, Function2<? super Composer, ? super Integer, Unit> function27, TextFieldColors textFieldColors, PaddingValues paddingValues, Function2<? super Composer, ? super Integer, Unit> function28, Composer composer, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        TextFieldColors textFieldColors2;
        PaddingValues paddingValues2;
        Function2<? super Composer, ? super Integer, Unit> function29;
        Function2<? super Composer, ? super Integer, Unit> function210;
        ComposableLambda composableLambda;
        Function2<? super Composer, ? super Integer, Unit> function211;
        Function2<? super Composer, ? super Integer, Unit> function212;
        Function2<? super Composer, ? super Integer, Unit> function213;
        Function2<? super Composer, ? super Integer, Unit> function214;
        boolean z4;
        TextFieldColors textFieldColors3;
        Function2<? super Composer, ? super Integer, Unit> function215;
        PaddingValues paddingValues3;
        Composer composer2;
        boolean z5;
        Function2<? super Composer, ? super Integer, Unit> function216;
        Function2<? super Composer, ? super Integer, Unit> function217;
        Function2<? super Composer, ? super Integer, Unit> function218;
        Function2<? super Composer, ? super Integer, Unit> function219;
        Function2<? super Composer, ? super Integer, Unit> function220;
        Function2<? super Composer, ? super Integer, Unit> function221;
        Function2<? super Composer, ? super Integer, Unit> function222;
        TextFieldColors textFieldColors4;
        PaddingValues paddingValues4;
        Function2<? super Composer, ? super Integer, Unit> function223;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
        Intrinsics.checkNotNullParameter(visualTransformation, "visualTransformation");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Composer startRestartGroup = composer.startRestartGroup(-350442135);
        ComposerKt.sourceInformation(startRestartGroup, "C(DecorationBox)P(15,4,3,11,16,5,6,7,9,8,14,10,12,13!1,2)1652@93520L8,1663@93808L709:TextFieldDefaults.kt#uh7d8r");
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
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 896) == 0) {
            i4 |= startRestartGroup.changed(z) ? 256 : 128;
            if ((i3 & 8) == 0) {
                i4 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                int i16 = 8192;
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
                    i12 = i3 & 2048;
                    if (i12 == 0) {
                        i11 |= 48;
                    } else if ((i2 & 112) == 0) {
                        i11 |= startRestartGroup.changedInstance(function25) ? 32 : 16;
                    }
                    int i17 = i11;
                    i13 = i3 & 4096;
                    if (i13 == 0) {
                        i17 |= 384;
                    } else if ((i2 & 896) == 0) {
                        i17 |= startRestartGroup.changedInstance(function26) ? 256 : 128;
                        i14 = i3 & 8192;
                        if (i14 != 0) {
                            i17 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                        } else if ((i2 & 7168) == 0) {
                            i17 |= startRestartGroup.changedInstance(function27) ? 2048 : 1024;
                            if ((i2 & 57344) == 0) {
                                if ((i3 & 16384) == 0 && startRestartGroup.changed(textFieldColors)) {
                                    i16 = 16384;
                                }
                                i17 |= i16;
                            }
                            if ((i2 & 458752) == 0) {
                                i17 |= ((i3 & 32768) == 0 && startRestartGroup.changed(paddingValues)) ? 131072 : 65536;
                            }
                            i15 = i3 & 65536;
                            if (i15 == 0) {
                                i17 |= 1572864;
                            } else if ((i2 & 3670016) == 0) {
                                i17 |= startRestartGroup.changedInstance(function28) ? 1048576 : 524288;
                            }
                            if ((i3 & 131072) == 0) {
                                i17 |= 12582912;
                            } else if ((i2 & 29360128) == 0) {
                                i17 |= startRestartGroup.changed(this) ? 8388608 : 4194304;
                            }
                            if ((i4 & 1533916891) == 306783378 || (23967451 & i17) != 4793490 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    boolean z6 = i6 == 0 ? false : z3;
                                    Function2<? super Composer, ? super Integer, Unit> function224 = i7 == 0 ? null : function2;
                                    Function2<? super Composer, ? super Integer, Unit> function225 = i8 == 0 ? null : function22;
                                    Function2<? super Composer, ? super Integer, Unit> function226 = i9 == 0 ? null : function23;
                                    Function2<? super Composer, ? super Integer, Unit> function227 = i10 == 0 ? null : function24;
                                    Function2<? super Composer, ? super Integer, Unit> function228 = i12 == 0 ? null : function25;
                                    Function2<? super Composer, ? super Integer, Unit> function229 = i13 == 0 ? null : function26;
                                    Function2<? super Composer, ? super Integer, Unit> function230 = i14 == 0 ? function27 : null;
                                    if ((i3 & 16384) == 0) {
                                        textFieldColors2 = m1910colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 0, 0, 0, (i17 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                                        i17 &= -57345;
                                    } else {
                                        textFieldColors2 = textFieldColors;
                                    }
                                    if ((i3 & 32768) == 0) {
                                        paddingValues2 = m1908contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                        i17 &= -458753;
                                    } else {
                                        paddingValues2 = paddingValues;
                                    }
                                    Function2<? super Composer, ? super Integer, Unit> function231 = function226;
                                    if (i15 == 0) {
                                        function29 = function227;
                                        function210 = function228;
                                        function211 = function231;
                                        composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, -1448570018, true, new OutlinedTextFieldDefaults$DecorationBox$1(z, z6, interactionSource, textFieldColors2, i4, i17));
                                    } else {
                                        function29 = function227;
                                        function210 = function228;
                                        composableLambda = function28;
                                        function211 = function231;
                                    }
                                    function212 = function224;
                                    function213 = function225;
                                    function214 = function229;
                                    z4 = z6;
                                    textFieldColors3 = textFieldColors2;
                                    function215 = function230;
                                    paddingValues3 = paddingValues2;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i3 & 16384) != 0) {
                                        i17 &= -57345;
                                    }
                                    if ((32768 & i3) != 0) {
                                        i17 &= -458753;
                                    }
                                    z4 = z3;
                                    function212 = function2;
                                    function213 = function22;
                                    function211 = function23;
                                    function29 = function24;
                                    function210 = function25;
                                    function214 = function26;
                                    function215 = function27;
                                    textFieldColors3 = textFieldColors;
                                    paddingValues3 = paddingValues;
                                    composableLambda = function28;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-350442135, i4, i17, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)");
                                }
                                int i18 = i4;
                                int i19 = i18 << 3;
                                int i20 = i18 >> 3;
                                int i21 = i18 >> 9;
                                int i22 = i17 << 21;
                                composer2 = startRestartGroup;
                                TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function212, function213, function211, function29, function210, function214, function215, z2, z, z4, interactionSource, paddingValues3, textFieldColors3, composableLambda, composer2, (i19 & 896) | (i19 & 112) | 6 | (i20 & 7168) | (i21 & 57344) | (i21 & 458752) | (i21 & 3670016) | (i22 & 29360128) | (234881024 & i22) | (i22 & 1879048192), ((i17 >> 9) & 14) | ((i18 >> 6) & 112) | (i18 & 896) | (i21 & 7168) | (i20 & 57344) | (i17 & 458752) | ((i17 << 6) & 3670016) | ((i17 << 3) & 29360128), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                z5 = z4;
                                function216 = function212;
                                function217 = function213;
                                function218 = function211;
                                function219 = function29;
                                function220 = function210;
                                function221 = function214;
                                function222 = function215;
                                textFieldColors4 = textFieldColors3;
                                paddingValues4 = paddingValues3;
                                function223 = composableLambda;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                function216 = function2;
                                function217 = function22;
                                function218 = function23;
                                function219 = function24;
                                function220 = function25;
                                function221 = function26;
                                function222 = function27;
                                textFieldColors4 = textFieldColors;
                                paddingValues4 = paddingValues;
                                function223 = function28;
                                composer2 = startRestartGroup;
                                z5 = z3;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                                return;
                            }
                            endRestartGroup.updateScope(new OutlinedTextFieldDefaults$DecorationBox$2(this, value, innerTextField, z, z2, visualTransformation, interactionSource, z5, function216, function217, function218, function219, function220, function221, function222, textFieldColors4, paddingValues4, function223, i, i2, i3));
                            return;
                        }
                        if ((i2 & 57344) == 0) {
                        }
                        if ((i2 & 458752) == 0) {
                        }
                        i15 = i3 & 65536;
                        if (i15 == 0) {
                        }
                        if ((i3 & 131072) == 0) {
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
                        if (i12 == 0) {
                        }
                        if (i13 == 0) {
                        }
                        if (i14 == 0) {
                        }
                        if ((i3 & 16384) == 0) {
                        }
                        if ((i3 & 32768) == 0) {
                        }
                        Function2<? super Composer, ? super Integer, Unit> function2312 = function226;
                        if (i15 == 0) {
                        }
                        function212 = function224;
                        function213 = function225;
                        function214 = function229;
                        z4 = z6;
                        textFieldColors3 = textFieldColors2;
                        function215 = function230;
                        paddingValues3 = paddingValues2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i182 = i4;
                        int i192 = i182 << 3;
                        int i202 = i182 >> 3;
                        int i212 = i182 >> 9;
                        int i222 = i17 << 21;
                        composer2 = startRestartGroup;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function212, function213, function211, function29, function210, function214, function215, z2, z, z4, interactionSource, paddingValues3, textFieldColors3, composableLambda, composer2, (i192 & 896) | (i192 & 112) | 6 | (i202 & 7168) | (i212 & 57344) | (i212 & 458752) | (i212 & 3670016) | (i222 & 29360128) | (234881024 & i222) | (i222 & 1879048192), ((i17 >> 9) & 14) | ((i182 >> 6) & 112) | (i182 & 896) | (i212 & 7168) | (i202 & 57344) | (i17 & 458752) | ((i17 << 6) & 3670016) | ((i17 << 3) & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        z5 = z4;
                        function216 = function212;
                        function217 = function213;
                        function218 = function211;
                        function219 = function29;
                        function220 = function210;
                        function221 = function214;
                        function222 = function215;
                        textFieldColors4 = textFieldColors3;
                        paddingValues4 = paddingValues3;
                        function223 = composableLambda;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i14 = i3 & 8192;
                    if (i14 != 0) {
                    }
                    if ((i2 & 57344) == 0) {
                    }
                    if ((i2 & 458752) == 0) {
                    }
                    i15 = i3 & 65536;
                    if (i15 == 0) {
                    }
                    if ((i3 & 131072) == 0) {
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
                    if (i12 == 0) {
                    }
                    if (i13 == 0) {
                    }
                    if (i14 == 0) {
                    }
                    if ((i3 & 16384) == 0) {
                    }
                    if ((i3 & 32768) == 0) {
                    }
                    Function2<? super Composer, ? super Integer, Unit> function23122 = function226;
                    if (i15 == 0) {
                    }
                    function212 = function224;
                    function213 = function225;
                    function214 = function229;
                    z4 = z6;
                    textFieldColors3 = textFieldColors2;
                    function215 = function230;
                    paddingValues3 = paddingValues2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i1822 = i4;
                    int i1922 = i1822 << 3;
                    int i2022 = i1822 >> 3;
                    int i2122 = i1822 >> 9;
                    int i2222 = i17 << 21;
                    composer2 = startRestartGroup;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function212, function213, function211, function29, function210, function214, function215, z2, z, z4, interactionSource, paddingValues3, textFieldColors3, composableLambda, composer2, (i1922 & 896) | (i1922 & 112) | 6 | (i2022 & 7168) | (i2122 & 57344) | (i2122 & 458752) | (i2122 & 3670016) | (i2222 & 29360128) | (234881024 & i2222) | (i2222 & 1879048192), ((i17 >> 9) & 14) | ((i1822 >> 6) & 112) | (i1822 & 896) | (i2122 & 7168) | (i2022 & 57344) | (i17 & 458752) | ((i17 << 6) & 3670016) | ((i17 << 3) & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z5 = z4;
                    function216 = function212;
                    function217 = function213;
                    function218 = function211;
                    function219 = function29;
                    function220 = function210;
                    function221 = function214;
                    function222 = function215;
                    textFieldColors4 = textFieldColors3;
                    paddingValues4 = paddingValues3;
                    function223 = composableLambda;
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
                i12 = i3 & 2048;
                if (i12 == 0) {
                }
                int i172 = i11;
                i13 = i3 & 4096;
                if (i13 == 0) {
                }
                i14 = i3 & 8192;
                if (i14 != 0) {
                }
                if ((i2 & 57344) == 0) {
                }
                if ((i2 & 458752) == 0) {
                }
                i15 = i3 & 65536;
                if (i15 == 0) {
                }
                if ((i3 & 131072) == 0) {
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
                if (i12 == 0) {
                }
                if (i13 == 0) {
                }
                if (i14 == 0) {
                }
                if ((i3 & 16384) == 0) {
                }
                if ((i3 & 32768) == 0) {
                }
                Function2<? super Composer, ? super Integer, Unit> function231222 = function226;
                if (i15 == 0) {
                }
                function212 = function224;
                function213 = function225;
                function214 = function229;
                z4 = z6;
                textFieldColors3 = textFieldColors2;
                function215 = function230;
                paddingValues3 = paddingValues2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i18222 = i4;
                int i19222 = i18222 << 3;
                int i20222 = i18222 >> 3;
                int i21222 = i18222 >> 9;
                int i22222 = i172 << 21;
                composer2 = startRestartGroup;
                TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function212, function213, function211, function29, function210, function214, function215, z2, z, z4, interactionSource, paddingValues3, textFieldColors3, composableLambda, composer2, (i19222 & 896) | (i19222 & 112) | 6 | (i20222 & 7168) | (i21222 & 57344) | (i21222 & 458752) | (i21222 & 3670016) | (i22222 & 29360128) | (234881024 & i22222) | (i22222 & 1879048192), ((i172 >> 9) & 14) | ((i18222 >> 6) & 112) | (i18222 & 896) | (i21222 & 7168) | (i20222 & 57344) | (i172 & 458752) | ((i172 << 6) & 3670016) | ((i172 << 3) & 29360128), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                z5 = z4;
                function216 = function212;
                function217 = function213;
                function218 = function211;
                function219 = function29;
                function220 = function210;
                function221 = function214;
                function222 = function215;
                textFieldColors4 = textFieldColors3;
                paddingValues4 = paddingValues3;
                function223 = composableLambda;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            int i162 = 8192;
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
            i12 = i3 & 2048;
            if (i12 == 0) {
            }
            int i1722 = i11;
            i13 = i3 & 4096;
            if (i13 == 0) {
            }
            i14 = i3 & 8192;
            if (i14 != 0) {
            }
            if ((i2 & 57344) == 0) {
            }
            if ((i2 & 458752) == 0) {
            }
            i15 = i3 & 65536;
            if (i15 == 0) {
            }
            if ((i3 & 131072) == 0) {
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
            if (i12 == 0) {
            }
            if (i13 == 0) {
            }
            if (i14 == 0) {
            }
            if ((i3 & 16384) == 0) {
            }
            if ((i3 & 32768) == 0) {
            }
            Function2<? super Composer, ? super Integer, Unit> function2312222 = function226;
            if (i15 == 0) {
            }
            function212 = function224;
            function213 = function225;
            function214 = function229;
            z4 = z6;
            textFieldColors3 = textFieldColors2;
            function215 = function230;
            paddingValues3 = paddingValues2;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i182222 = i4;
            int i192222 = i182222 << 3;
            int i202222 = i182222 >> 3;
            int i212222 = i182222 >> 9;
            int i222222 = i1722 << 21;
            composer2 = startRestartGroup;
            TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function212, function213, function211, function29, function210, function214, function215, z2, z, z4, interactionSource, paddingValues3, textFieldColors3, composableLambda, composer2, (i192222 & 896) | (i192222 & 112) | 6 | (i202222 & 7168) | (i212222 & 57344) | (i212222 & 458752) | (i212222 & 3670016) | (i222222 & 29360128) | (234881024 & i222222) | (i222222 & 1879048192), ((i1722 >> 9) & 14) | ((i182222 >> 6) & 112) | (i182222 & 896) | (i212222 & 7168) | (i202222 & 57344) | (i1722 & 458752) | ((i1722 << 6) & 3670016) | ((i1722 << 3) & 29360128), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            z5 = z4;
            function216 = function212;
            function217 = function213;
            function218 = function211;
            function219 = function29;
            function220 = function210;
            function221 = function214;
            function222 = function215;
            textFieldColors4 = textFieldColors3;
            paddingValues4 = paddingValues3;
            function223 = composableLambda;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i3 & 8) == 0) {
        }
        int i1622 = 8192;
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
        i12 = i3 & 2048;
        if (i12 == 0) {
        }
        int i17222 = i11;
        i13 = i3 & 4096;
        if (i13 == 0) {
        }
        i14 = i3 & 8192;
        if (i14 != 0) {
        }
        if ((i2 & 57344) == 0) {
        }
        if ((i2 & 458752) == 0) {
        }
        i15 = i3 & 65536;
        if (i15 == 0) {
        }
        if ((i3 & 131072) == 0) {
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
        if (i12 == 0) {
        }
        if (i13 == 0) {
        }
        if (i14 == 0) {
        }
        if ((i3 & 16384) == 0) {
        }
        if ((i3 & 32768) == 0) {
        }
        Function2<? super Composer, ? super Integer, Unit> function23122222 = function226;
        if (i15 == 0) {
        }
        function212 = function224;
        function213 = function225;
        function214 = function229;
        z4 = z6;
        textFieldColors3 = textFieldColors2;
        function215 = function230;
        paddingValues3 = paddingValues2;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i1822222 = i4;
        int i1922222 = i1822222 << 3;
        int i2022222 = i1822222 >> 3;
        int i2122222 = i1822222 >> 9;
        int i2222222 = i17222 << 21;
        composer2 = startRestartGroup;
        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function212, function213, function211, function29, function210, function214, function215, z2, z, z4, interactionSource, paddingValues3, textFieldColors3, composableLambda, composer2, (i1922222 & 896) | (i1922222 & 112) | 6 | (i2022222 & 7168) | (i2122222 & 57344) | (i2122222 & 458752) | (i2122222 & 3670016) | (i2222222 & 29360128) | (234881024 & i2222222) | (i2222222 & 1879048192), ((i17222 >> 9) & 14) | ((i1822222 >> 6) & 112) | (i1822222 & 896) | (i2122222 & 7168) | (i2022222 & 57344) | (i17222 & 458752) | ((i17222 << 6) & 3670016) | ((i17222 << 3) & 29360128), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        z5 = z4;
        function216 = function212;
        function217 = function213;
        function218 = function211;
        function219 = function29;
        function220 = function210;
        function221 = function214;
        function222 = function215;
        textFieldColors4 = textFieldColors3;
        paddingValues4 = paddingValues3;
        function223 = composableLambda;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
