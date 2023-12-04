package androidx.compose.material;

import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.LayoutIdParentData;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.C;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: TextFieldImpl.kt */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aß\u0001\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\f2\u0011\u0010$\u001a\r\u0012\u0004\u0012\u00020 0%¢\u0006\u0002\b&2\u0006\u0010'\u001a\u00020(2\u0013\u0010)\u001a\u000f\u0012\u0004\u0012\u00020 \u0018\u00010%¢\u0006\u0002\b&2\u0015\b\u0002\u0010*\u001a\u000f\u0012\u0004\u0012\u00020 \u0018\u00010%¢\u0006\u0002\b&2\u0015\b\u0002\u0010+\u001a\u000f\u0012\u0004\u0012\u00020 \u0018\u00010%¢\u0006\u0002\b&2\u0015\b\u0002\u0010,\u001a\u000f\u0012\u0004\u0012\u00020 \u0018\u00010%¢\u0006\u0002\b&2\b\b\u0002\u0010-\u001a\u00020.2\b\b\u0002\u0010/\u001a\u00020.2\b\b\u0002\u00100\u001a\u00020.2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0015\b\u0002\u00107\u001a\u000f\u0012\u0004\u0012\u00020 \u0018\u00010%¢\u0006\u0002\b&H\u0001¢\u0006\u0002\u00108\u001aW\u00109\u001a\u00020 2\u0006\u0010:\u001a\u00020;2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010=2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010?2 \u0010@\u001a\u001c\u0012\u0004\u0012\u00020 0%¢\u0006\u0002\b&¢\u0006\f\bA\u0012\b\bB\u0012\u0004\b\u0003\u0010\u0000H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bC\u0010D\u001a\u0012\u0010E\u001a\u00020\u00012\b\u0010F\u001a\u0004\u0018\u00010GH\u0000\u001a\u0012\u0010H\u001a\u00020\u00012\b\u0010F\u001a\u0004\u0018\u00010GH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0019\u0010\u0002\u001a\u00020\u0003X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\"\u000e\u0010\u000b\u001a\u00020\fX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\fX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\fX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\fX\u0080T¢\u0006\u0002\n\u0000\"\u0019\u0010\u0012\u001a\u00020\u0003X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0013\u0010\u0005\"\u000e\u0010\u0014\u001a\u00020\fX\u0080T¢\u0006\u0002\n\u0000\"\u0019\u0010\u0015\u001a\u00020\u0016X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018\"\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u001b*\u00020\u001c8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006I"}, d2 = {"AnimationDuration", "", "HorizontalIconPadding", "Landroidx/compose/ui/unit/Dp;", "getHorizontalIconPadding", "()F", "F", "IconDefaultSizeModifier", "Landroidx/compose/ui/Modifier;", "getIconDefaultSizeModifier", "()Landroidx/compose/ui/Modifier;", "LabelId", "", "LeadingId", "PlaceholderAnimationDelayOrDuration", "PlaceholderAnimationDuration", "PlaceholderId", "TextFieldId", "TextFieldPadding", "getTextFieldPadding", "TrailingId", "ZeroConstraints", "Landroidx/compose/ui/unit/Constraints;", "getZeroConstraints", "()J", "J", "layoutId", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "getLayoutId", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;", "CommonDecorationBox", "", "type", "Landroidx/compose/material/TextFieldType;", "value", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", Constants.ScionAnalytics.PARAM_LABEL, "placeholder", "leadingIcon", "trailingIcon", "singleLine", "", "enabled", "isError", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "colors", "Landroidx/compose/material/TextFieldColors;", OutlinedTextFieldKt.BorderId, "(Landroidx/compose/material/TextFieldType;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/material/TextFieldColors;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "Decoration", "contentColor", "Landroidx/compose/ui/graphics/Color;", "typography", "Landroidx/compose/ui/text/TextStyle;", "contentAlpha", "", FirebaseAnalytics.Param.CONTENT, "Landroidx/compose/runtime/ComposableOpenTarget;", FirebaseAnalytics.Param.INDEX, "Decoration-euL9pac", "(JLandroidx/compose/ui/text/TextStyle;Ljava/lang/Float;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "heightOrZero", "placeable", "Landroidx/compose/ui/layout/Placeable;", "widthOrZero", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldImplKt {
    public static final int AnimationDuration = 150;
    private static final Modifier IconDefaultSizeModifier;
    public static final String LabelId = "Label";
    public static final String LeadingId = "Leading";
    private static final int PlaceholderAnimationDelayOrDuration = 67;
    private static final int PlaceholderAnimationDuration = 83;
    public static final String PlaceholderId = "Hint";
    public static final String TextFieldId = "TextField";
    public static final String TrailingId = "Trailing";
    private static final long ZeroConstraints = ConstraintsKt.Constraints(0, 0, 0, 0);
    private static final float TextFieldPadding = Dp.m5607constructorimpl(16);
    private static final float HorizontalIconPadding = Dp.m5607constructorimpl(12);

    public static final void CommonDecorationBox(TextFieldType type, String value, Function2<? super Composer, ? super Integer, Unit> innerTextField, VisualTransformation visualTransformation, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, boolean z, boolean z2, boolean z3, InteractionSource interactionSource, PaddingValues contentPadding, TextFieldColors colors, Function2<? super Composer, ? super Integer, Unit> function25, Composer composer, int i, int i2, int i3) {
        int i4;
        int i5;
        InputPhase inputPhase;
        Composer composer2;
        Function2<? super Composer, ? super Integer, Unit> function26;
        Function2<? super Composer, ? super Integer, Unit> function27;
        Function2<? super Composer, ? super Integer, Unit> function28;
        boolean z4;
        boolean z5;
        boolean z6;
        Function2<? super Composer, ? super Integer, Unit> function29;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
        Intrinsics.checkNotNullParameter(visualTransformation, "visualTransformation");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Composer startRestartGroup = composer.startRestartGroup(-712568069);
        ComposerKt.sourceInformation(startRestartGroup, "C(CommonDecorationBox)P(12,13,4,14,7,9,8,11,10,3,6,5,2,1)80@3167L105,84@3322L25,101@3932L10,108@4267L5253:TextFieldImpl.kt#jmzs0o");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (startRestartGroup.changed(type) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= startRestartGroup.changed(value) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 896) == 0) {
            i4 |= startRestartGroup.changedInstance(innerTextField) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
        } else if ((i & 7168) == 0) {
            i4 |= startRestartGroup.changed(visualTransformation) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((57344 & i) == 0) {
            i4 |= startRestartGroup.changedInstance(function2) ? 16384 : 8192;
        }
        int i6 = i3 & 32;
        if (i6 != 0) {
            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i & 458752) == 0) {
            i4 |= startRestartGroup.changedInstance(function22) ? 131072 : 65536;
        }
        int i7 = i3 & 64;
        if (i7 != 0) {
            i4 |= 1572864;
        } else if ((i & 3670016) == 0) {
            i4 |= startRestartGroup.changedInstance(function23) ? 1048576 : 524288;
        }
        int i8 = i3 & 128;
        if (i8 != 0) {
            i4 |= 12582912;
        } else if ((i & 29360128) == 0) {
            i4 |= startRestartGroup.changedInstance(function24) ? 8388608 : 4194304;
        }
        int i9 = i3 & 256;
        if (i9 != 0) {
            i4 |= 100663296;
        } else if ((i & 234881024) == 0) {
            i4 |= startRestartGroup.changed(z) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        int i10 = i3 & 512;
        if (i10 != 0) {
            i4 |= C.ENCODING_PCM_32BIT;
        } else if ((i & 1879048192) == 0) {
            i4 |= startRestartGroup.changed(z2) ? 536870912 : 268435456;
        }
        int i11 = i3 & 1024;
        if (i11 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = i2 | (startRestartGroup.changed(z3) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i3 & 2048) != 0) {
            i5 |= 48;
        } else if ((i2 & 112) == 0) {
            i5 |= startRestartGroup.changed(interactionSource) ? 32 : 16;
        }
        int i12 = i5;
        if ((i3 & 4096) != 0) {
            i12 |= 384;
        } else if ((i2 & 896) == 0) {
            i12 |= startRestartGroup.changed(contentPadding) ? 256 : 128;
        }
        if ((i3 & 8192) != 0) {
            i12 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
        } else if ((i2 & 7168) == 0) {
            i12 |= startRestartGroup.changed(colors) ? 2048 : 1024;
        }
        int i13 = i3 & 16384;
        if (i13 != 0) {
            i12 |= 24576;
        } else if ((i2 & 57344) == 0) {
            i12 |= startRestartGroup.changedInstance(function25) ? 16384 : 8192;
        }
        if ((i4 & 1533916891) != 306783378 || (46811 & i12) != 9362 || !startRestartGroup.getSkipping()) {
            Function2<? super Composer, ? super Integer, Unit> function210 = i6 != 0 ? null : function22;
            Function2<? super Composer, ? super Integer, Unit> function211 = i7 != 0 ? null : function23;
            Function2<? super Composer, ? super Integer, Unit> function212 = i8 != 0 ? null : function24;
            boolean z7 = i9 != 0 ? false : z;
            boolean z8 = i10 != 0 ? true : z2;
            boolean z9 = i11 != 0 ? false : z3;
            Function2<? super Composer, ? super Integer, Unit> function213 = i13 != 0 ? null : function25;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-712568069, i4, i12, "androidx.compose.material.CommonDecorationBox (TextFieldImpl.kt:63)");
            }
            startRestartGroup.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(value) | startRestartGroup.changed(visualTransformation);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = visualTransformation.filter(new AnnotatedString(value, null, null, 6, null));
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            String text = ((TransformedText) rememberedValue).getText().getText();
            if (FocusInteractionKt.collectIsFocusedAsState(interactionSource, startRestartGroup, (i12 >> 3) & 14).getValue().booleanValue()) {
                inputPhase = InputPhase.Focused;
            } else {
                inputPhase = text.length() == 0 ? InputPhase.UnfocusedEmpty : InputPhase.UnfocusedNotEmpty;
            }
            InputPhase inputPhase2 = inputPhase;
            int i14 = i4;
            TextFieldImplKt$CommonDecorationBox$labelColor$1 textFieldImplKt$CommonDecorationBox$labelColor$1 = new TextFieldImplKt$CommonDecorationBox$labelColor$1(colors, z8, z9, interactionSource, i14, i12);
            Typography typography = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6);
            TextStyle subtitle1 = typography.getSubtitle1();
            TextStyle caption = typography.getCaption();
            boolean z10 = (Color.m3292equalsimpl0(subtitle1.m5103getColor0d7_KjU(), Color.Companion.m3327getUnspecified0d7_KjU()) && !Color.m3292equalsimpl0(caption.m5103getColor0d7_KjU(), Color.Companion.m3327getUnspecified0d7_KjU())) || (!Color.m3292equalsimpl0(subtitle1.m5103getColor0d7_KjU(), Color.Companion.m3327getUnspecified0d7_KjU()) && Color.m3292equalsimpl0(caption.m5103getColor0d7_KjU(), Color.Companion.m3327getUnspecified0d7_KjU()));
            TextFieldTransitionScope textFieldTransitionScope = TextFieldTransitionScope.INSTANCE;
            startRestartGroup.startReplaceableGroup(2129141006);
            ComposerKt.sourceInformation(startRestartGroup, "*110@4363L10,111@4455L22");
            long m5103getColor0d7_KjU = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6).getCaption().m5103getColor0d7_KjU();
            if (z10) {
                if (!(m5103getColor0d7_KjU != Color.Companion.m3327getUnspecified0d7_KjU())) {
                    m5103getColor0d7_KjU = textFieldImplKt$CommonDecorationBox$labelColor$1.invoke(inputPhase2, startRestartGroup, 0).m3301unboximpl();
                }
            }
            long j = m5103getColor0d7_KjU;
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(2129141197);
            ComposerKt.sourceInformation(startRestartGroup, "*113@4554L10,114@4648L22");
            long m5103getColor0d7_KjU2 = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6).getSubtitle1().m5103getColor0d7_KjU();
            if (z10) {
                if (!(m5103getColor0d7_KjU2 != Color.Companion.m3327getUnspecified0d7_KjU())) {
                    m5103getColor0d7_KjU2 = textFieldImplKt$CommonDecorationBox$labelColor$1.invoke(inputPhase2, startRestartGroup, 0).m3301unboximpl();
                }
            }
            long j2 = m5103getColor0d7_KjU2;
            startRestartGroup.endReplaceableGroup();
            composer2 = startRestartGroup;
            textFieldTransitionScope.m1529TransitionDTcfvLk(inputPhase2, j, j2, textFieldImplKt$CommonDecorationBox$labelColor$1, function2 != null, ComposableLambdaKt.composableLambda(composer2, 341865432, true, new TextFieldImplKt$CommonDecorationBox$3(function2, function210, text, z9, i12, colors, z8, interactionSource, i14, function211, function212, type, innerTextField, z7, contentPadding, z10, function213)), composer2, 1769472);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function26 = function210;
            function27 = function211;
            function28 = function212;
            z4 = z7;
            z5 = z8;
            z6 = z9;
            function29 = function213;
        } else {
            startRestartGroup.skipToGroupEnd();
            function26 = function22;
            function27 = function23;
            function28 = function24;
            z4 = z;
            z5 = z2;
            z6 = z3;
            function29 = function25;
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new TextFieldImplKt$CommonDecorationBox$4(type, value, innerTextField, visualTransformation, function2, function26, function27, function28, z4, z5, z6, interactionSource, contentPadding, colors, function29, i, i2, i3));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* renamed from: Decoration-euL9pac  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1521DecorationeuL9pac(long j, TextStyle textStyle, Float f, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        Object obj2;
        int i5;
        TextStyle textStyle2;
        Float f2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-399493340);
        ComposerKt.sourceInformation(startRestartGroup, "C(Decoration)P(2:c#ui.graphics.Color,3,1):TextFieldImpl.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            obj = textStyle;
            i3 |= startRestartGroup.changed(obj) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                obj2 = f;
                i3 |= startRestartGroup.changed(obj2) ? 256 : 128;
                if ((i2 & 8) != 0) {
                    i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                } else if ((i & 7168) == 0) {
                    i3 |= startRestartGroup.changedInstance(content) ? 2048 : 1024;
                }
                i5 = i3;
                if ((i5 & 5851) == 1170 || !startRestartGroup.getSkipping()) {
                    textStyle2 = i6 != 0 ? null : obj;
                    Object obj3 = i4 != 0 ? null : obj2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-399493340, i5, -1, "androidx.compose.material.Decoration (TextFieldImpl.kt:233)");
                    }
                    ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, 494684590, true, new TextFieldImplKt$Decoration$colorAndEmphasis$1(j, obj3, content, i5));
                    if (textStyle2 != null) {
                        startRestartGroup.startReplaceableGroup(-2009952671);
                        ComposerKt.sourceInformation(startRestartGroup, "254@10423L46");
                        TextKt.ProvideTextStyle(textStyle2, composableLambda, startRestartGroup, ((i5 >> 3) & 14) | 48);
                    } else {
                        startRestartGroup.startReplaceableGroup(-2009952619);
                        ComposerKt.sourceInformation(startRestartGroup, "254@10475L18");
                        composableLambda.invoke(startRestartGroup, 6);
                    }
                    startRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    obj = textStyle2;
                    f2 = obj3;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    f2 = obj2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new TextFieldImplKt$Decoration$1(j, obj, f2, content, i, i2));
                return;
            }
            obj2 = f;
            if ((i2 & 8) != 0) {
            }
            i5 = i3;
            if ((i5 & 5851) == 1170) {
            }
            if (i6 != 0) {
            }
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(startRestartGroup, 494684590, true, new TextFieldImplKt$Decoration$colorAndEmphasis$1(j, obj3, content, i5));
            if (textStyle2 != null) {
            }
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
            }
            obj = textStyle2;
            f2 = obj3;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        obj = textStyle;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        obj2 = f;
        if ((i2 & 8) != 0) {
        }
        i5 = i3;
        if ((i5 & 5851) == 1170) {
        }
        if (i6 != 0) {
        }
        if (i4 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposableLambda composableLambda22 = ComposableLambdaKt.composableLambda(startRestartGroup, 494684590, true, new TextFieldImplKt$Decoration$colorAndEmphasis$1(j, obj3, content, i5));
        if (textStyle2 != null) {
        }
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        obj = textStyle2;
        f2 = obj3;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final int widthOrZero(Placeable placeable) {
        if (placeable != null) {
            return placeable.getWidth();
        }
        return 0;
    }

    public static final int heightOrZero(Placeable placeable) {
        if (placeable != null) {
            return placeable.getHeight();
        }
        return 0;
    }

    public static final Object getLayoutId(IntrinsicMeasurable intrinsicMeasurable) {
        Intrinsics.checkNotNullParameter(intrinsicMeasurable, "<this>");
        Object parentData = intrinsicMeasurable.getParentData();
        LayoutIdParentData layoutIdParentData = parentData instanceof LayoutIdParentData ? (LayoutIdParentData) parentData : null;
        if (layoutIdParentData != null) {
            return layoutIdParentData.getLayoutId();
        }
        return null;
    }

    static {
        float f = 48;
        IconDefaultSizeModifier = SizeKt.m779defaultMinSizeVpY3zN4(Modifier.Companion, Dp.m5607constructorimpl(f), Dp.m5607constructorimpl(f));
    }

    public static final long getZeroConstraints() {
        return ZeroConstraints;
    }

    public static final float getTextFieldPadding() {
        return TextFieldPadding;
    }

    public static final float getHorizontalIconPadding() {
        return HorizontalIconPadding;
    }

    public static final Modifier getIconDefaultSizeModifier() {
        return IconDefaultSizeModifier;
    }
}
