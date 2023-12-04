package androidx.compose.material3;

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
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: TextFieldImpl.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0002\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u00032\u0011\u00102\u001a\r\u0012\u0004\u0012\u00020.03¢\u0006\u0002\b42\u0006\u00105\u001a\u0002062\u0013\u00107\u001a\u000f\u0012\u0004\u0012\u00020.\u0018\u000103¢\u0006\u0002\b42\u0015\b\u0002\u00108\u001a\u000f\u0012\u0004\u0012\u00020.\u0018\u000103¢\u0006\u0002\b42\u0015\b\u0002\u00109\u001a\u000f\u0012\u0004\u0012\u00020.\u0018\u000103¢\u0006\u0002\b42\u0015\b\u0002\u0010:\u001a\u000f\u0012\u0004\u0012\u00020.\u0018\u000103¢\u0006\u0002\b42\u0015\b\u0002\u0010;\u001a\u000f\u0012\u0004\u0012\u00020.\u0018\u000103¢\u0006\u0002\b42\u0015\b\u0002\u0010<\u001a\u000f\u0012\u0004\u0012\u00020.\u0018\u000103¢\u0006\u0002\b42\u0015\b\u0002\u0010=\u001a\u000f\u0012\u0004\u0012\u00020.\u0018\u000103¢\u0006\u0002\b42\b\b\u0002\u0010>\u001a\u00020?2\b\b\u0002\u0010@\u001a\u00020?2\b\b\u0002\u0010A\u001a\u00020?2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020G2\u0011\u0010H\u001a\r\u0012\u0004\u0012\u00020.03¢\u0006\u0002\b4H\u0001¢\u0006\u0002\u0010I\u001a<\u0010J\u001a\u00020.2\u0006\u0010K\u001a\u00020L2\n\b\u0002\u0010M\u001a\u0004\u0018\u00010N2\u0011\u0010O\u001a\r\u0012\u0004\u0012\u00020.03¢\u0006\u0002\b4H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bP\u0010Q\u001a\u0012\u0010R\u001a\u00020\u00012\b\u0010S\u001a\u0004\u0018\u00010TH\u0000\u001a\u0012\u0010U\u001a\u00020\u00012\b\u0010S\u001a\u0004\u0018\u00010TH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u0019\u0010\u0004\u001a\u00020\u0005X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007\"\u0014\u0010\t\u001a\u00020\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u000e\u0010\r\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u0019\u0010\u000f\u001a\u00020\u0005X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0010\u0010\u0007\"\u0019\u0010\u0011\u001a\u00020\u0005X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0012\u0010\u0007\"\u0019\u0010\u0013\u001a\u00020\u0005X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0014\u0010\u0007\"\u000e\u0010\u0015\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u0019\u0010\u0019\u001a\u00020\u0005X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u001a\u0010\u0007\"\u000e\u0010\u001b\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u0019\u0010\u001d\u001a\u00020\u0005X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u001e\u0010\u0007\"\u000e\u0010\u001f\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u0019\u0010 \u001a\u00020\u0005X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b!\u0010\u0007\"\u000e\u0010\"\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u0019\u0010#\u001a\u00020$X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&\"\u001a\u0010(\u001a\u0004\u0018\u00010)*\u00020*8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006V"}, d2 = {"AnimationDuration", "", "ContainerId", "", "HorizontalIconPadding", "Landroidx/compose/ui/unit/Dp;", "getHorizontalIconPadding", "()F", "F", "IconDefaultSizeModifier", "Landroidx/compose/ui/Modifier;", "getIconDefaultSizeModifier", "()Landroidx/compose/ui/Modifier;", "LabelId", "LeadingId", "MinFocusedLabelLineHeight", "getMinFocusedLabelLineHeight", "MinSupportingTextLineHeight", "getMinSupportingTextLineHeight", "MinTextLineHeight", "getMinTextLineHeight", "PlaceholderAnimationDelayOrDuration", "PlaceholderAnimationDuration", "PlaceholderId", "PrefixId", "PrefixSuffixTextPadding", "getPrefixSuffixTextPadding", "SuffixId", "SupportingId", "SupportingTopPadding", "getSupportingTopPadding", "TextFieldId", "TextFieldPadding", "getTextFieldPadding", "TrailingId", "ZeroConstraints", "Landroidx/compose/ui/unit/Constraints;", "getZeroConstraints", "()J", "J", "layoutId", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "getLayoutId", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;", "CommonDecorationBox", "", "type", "Landroidx/compose/material3/TextFieldType;", "value", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", Constants.ScionAnalytics.PARAM_LABEL, "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "singleLine", "", "enabled", "isError", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "colors", "Landroidx/compose/material3/TextFieldColors;", TtmlNode.RUBY_CONTAINER, "(Landroidx/compose/material3/TextFieldType;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/material3/TextFieldColors;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "Decoration", "contentColor", "Landroidx/compose/ui/graphics/Color;", "typography", "Landroidx/compose/ui/text/TextStyle;", FirebaseAnalytics.Param.CONTENT, "Decoration-KTwxG1Y", "(JLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "heightOrZero", "placeable", "Landroidx/compose/ui/layout/Placeable;", "widthOrZero", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldImplKt {
    public static final int AnimationDuration = 150;
    public static final String ContainerId = "Container";
    private static final Modifier IconDefaultSizeModifier;
    public static final String LabelId = "Label";
    public static final String LeadingId = "Leading";
    private static final float MinFocusedLabelLineHeight;
    private static final float MinSupportingTextLineHeight;
    private static final int PlaceholderAnimationDelayOrDuration = 67;
    private static final int PlaceholderAnimationDuration = 83;
    public static final String PlaceholderId = "Hint";
    public static final String PrefixId = "Prefix";
    public static final String SuffixId = "Suffix";
    public static final String SupportingId = "Supporting";
    public static final String TextFieldId = "TextField";
    private static final float TextFieldPadding;
    public static final String TrailingId = "Trailing";
    private static final long ZeroConstraints = ConstraintsKt.Constraints(0, 0, 0, 0);
    private static final float HorizontalIconPadding = Dp.m5607constructorimpl(12);
    private static final float SupportingTopPadding = Dp.m5607constructorimpl(4);
    private static final float PrefixSuffixTextPadding = Dp.m5607constructorimpl(2);
    private static final float MinTextLineHeight = Dp.m5607constructorimpl(24);

    /* JADX WARN: Removed duplicated region for block: B:136:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:282:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CommonDecorationBox(TextFieldType type, String value, Function2<? super Composer, ? super Integer, Unit> innerTextField, VisualTransformation visualTransformation, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Function2<? super Composer, ? super Integer, Unit> function26, Function2<? super Composer, ? super Integer, Unit> function27, boolean z, boolean z2, boolean z3, InteractionSource interactionSource, PaddingValues contentPadding, TextFieldColors colors, Function2<? super Composer, ? super Integer, Unit> container, Composer composer, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z4;
        boolean changed;
        Object rememberedValue;
        InputPhase inputPhase;
        boolean z5;
        boolean z6;
        Composer composer2;
        Function2<? super Composer, ? super Integer, Unit> function28;
        Function2<? super Composer, ? super Integer, Unit> function29;
        Function2<? super Composer, ? super Integer, Unit> function210;
        Function2<? super Composer, ? super Integer, Unit> function211;
        Function2<? super Composer, ? super Integer, Unit> function212;
        Function2<? super Composer, ? super Integer, Unit> function213;
        boolean z7;
        boolean z8;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
        Intrinsics.checkNotNullParameter(visualTransformation, "visualTransformation");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(container, "container");
        Composer startRestartGroup = composer.startRestartGroup(-947035500);
        ComposerKt.sourceInformation(startRestartGroup, "C(CommonDecorationBox)P(15,16,4,17,7,9,8,14,10,12,13,11,3,6,5,2)81@3217L105,85@3372L25,96@3756L10,103@4099L7282:TextFieldImpl.kt#uh7d8r");
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
        int i12 = i3 & 32;
        if (i12 != 0) {
            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i & 458752) == 0) {
            i4 |= startRestartGroup.changedInstance(function22) ? 131072 : 65536;
        }
        int i13 = i3 & 64;
        if (i13 != 0) {
            i4 |= 1572864;
        } else if ((i & 3670016) == 0) {
            i4 |= startRestartGroup.changedInstance(function23) ? 1048576 : 524288;
        }
        int i14 = i3 & 128;
        if (i14 != 0) {
            i4 |= 12582912;
        } else if ((i & 29360128) == 0) {
            i4 |= startRestartGroup.changedInstance(function24) ? 8388608 : 4194304;
        }
        int i15 = i3 & 256;
        if (i15 != 0) {
            i4 |= 100663296;
        } else if ((i & 234881024) == 0) {
            i4 |= startRestartGroup.changedInstance(function25) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        int i16 = i3 & 512;
        if (i16 != 0) {
            i4 |= C.ENCODING_PCM_32BIT;
        } else if ((i & 1879048192) == 0) {
            i4 |= startRestartGroup.changedInstance(function26) ? 536870912 : 268435456;
        }
        int i17 = i3 & 1024;
        if (i17 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = i2 | (startRestartGroup.changedInstance(function27) ? 4 : 2);
        } else {
            i5 = i2;
        }
        int i18 = i3 & 2048;
        if (i18 != 0) {
            i5 |= 48;
        } else if ((i2 & 112) == 0) {
            i5 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        int i19 = i5;
        int i20 = i3 & 4096;
        if (i20 != 0) {
            i19 |= 384;
            i6 = i20;
        } else {
            i6 = i20;
            if ((i2 & 896) == 0) {
                i19 |= startRestartGroup.changed(z2) ? 256 : 128;
                i7 = i3 & 8192;
                if (i7 == 0) {
                    i19 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                    i8 = i7;
                } else {
                    i8 = i7;
                    if ((i2 & 7168) == 0) {
                        i19 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                        if ((i3 & 16384) != 0) {
                            i19 |= 24576;
                        } else if ((57344 & i2) == 0) {
                            i19 |= startRestartGroup.changed(interactionSource) ? 16384 : 8192;
                        }
                        if ((32768 & i3) != 0) {
                            i9 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else {
                            if ((458752 & i2) == 0) {
                                i9 = startRestartGroup.changed(contentPadding) ? 131072 : 65536;
                            }
                            if ((i3 & 65536) == 0) {
                                i10 = 1572864;
                            } else {
                                if ((3670016 & i2) == 0) {
                                    i10 = startRestartGroup.changed(colors) ? 1048576 : 524288;
                                }
                                if ((i3 & 131072) == 0) {
                                    if ((29360128 & i2) == 0) {
                                        i11 = startRestartGroup.changedInstance(container) ? 8388608 : 4194304;
                                    }
                                    if ((1533916891 & i4) == 306783378 || (23967451 & i19) != 4793490 || !startRestartGroup.getSkipping()) {
                                        Function2<? super Composer, ? super Integer, Unit> function214 = i12 == 0 ? null : function22;
                                        Function2<? super Composer, ? super Integer, Unit> function215 = i13 == 0 ? null : function23;
                                        Function2<? super Composer, ? super Integer, Unit> function216 = i14 == 0 ? null : function24;
                                        Function2<? super Composer, ? super Integer, Unit> function217 = i15 == 0 ? null : function25;
                                        Function2<? super Composer, ? super Integer, Unit> function218 = i16 == 0 ? null : function26;
                                        Function2<? super Composer, ? super Integer, Unit> function219 = i17 == 0 ? null : function27;
                                        z4 = i18 == 0 ? false : z;
                                        boolean z9 = i6 == 0 ? true : z2;
                                        boolean z10 = i8 == 0 ? false : z3;
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-947035500, i4, i19, "androidx.compose.material3.CommonDecorationBox (TextFieldImpl.kt:61)");
                                        }
                                        startRestartGroup.startReplaceableGroup(511388516);
                                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                                        changed = startRestartGroup.changed(value) | startRestartGroup.changed(visualTransformation);
                                        rememberedValue = startRestartGroup.rememberedValue();
                                        if (!changed || rememberedValue == Composer.Companion.getEmpty()) {
                                            rememberedValue = visualTransformation.filter(new AnnotatedString(value, null, null, 6, null));
                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                        }
                                        startRestartGroup.endReplaceableGroup();
                                        String text = ((TransformedText) rememberedValue).getText().getText();
                                        if (!FocusInteractionKt.collectIsFocusedAsState(interactionSource, startRestartGroup, (i19 >> 12) & 14).getValue().booleanValue()) {
                                            inputPhase = InputPhase.Focused;
                                        } else {
                                            inputPhase = text.length() == 0 ? InputPhase.UnfocusedEmpty : InputPhase.UnfocusedNotEmpty;
                                        }
                                        InputPhase inputPhase2 = inputPhase;
                                        TextFieldImplKt$CommonDecorationBox$labelColor$1 textFieldImplKt$CommonDecorationBox$labelColor$1 = new TextFieldImplKt$CommonDecorationBox$labelColor$1(colors, z9, z10, interactionSource, i19);
                                        Typography typography = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6);
                                        TextStyle bodyLarge = typography.getBodyLarge();
                                        TextStyle bodySmall = typography.getBodySmall();
                                        int i21 = i4;
                                        z5 = !(Color.m3292equalsimpl0(bodyLarge.m5103getColor0d7_KjU(), Color.Companion.m3327getUnspecified0d7_KjU()) || Color.m3292equalsimpl0(bodySmall.m5103getColor0d7_KjU(), Color.Companion.m3327getUnspecified0d7_KjU())) || (!Color.m3292equalsimpl0(bodyLarge.m5103getColor0d7_KjU(), Color.Companion.m3327getUnspecified0d7_KjU()) && Color.m3292equalsimpl0(bodySmall.m5103getColor0d7_KjU(), Color.Companion.m3327getUnspecified0d7_KjU()));
                                        TextFieldTransitionScope textFieldTransitionScope = TextFieldTransitionScope.INSTANCE;
                                        startRestartGroup.startReplaceableGroup(-646388253);
                                        ComposerKt.sourceInformation(startRestartGroup, "*105@4195L10,106@4289L22");
                                        long m5103getColor0d7_KjU = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6).getBodySmall().m5103getColor0d7_KjU();
                                        if (z5) {
                                            if (!(m5103getColor0d7_KjU != Color.Companion.m3327getUnspecified0d7_KjU())) {
                                                m5103getColor0d7_KjU = textFieldImplKt$CommonDecorationBox$labelColor$1.invoke(inputPhase2, startRestartGroup, 0).m3301unboximpl();
                                            }
                                        }
                                        long j = m5103getColor0d7_KjU;
                                        startRestartGroup.endReplaceableGroup();
                                        startRestartGroup.startReplaceableGroup(-646388060);
                                        ComposerKt.sourceInformation(startRestartGroup, "*108@4388L10,109@4482L22");
                                        long m5103getColor0d7_KjU2 = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6).getBodyLarge().m5103getColor0d7_KjU();
                                        if (z5) {
                                            if (!(m5103getColor0d7_KjU2 != Color.Companion.m3327getUnspecified0d7_KjU())) {
                                                z6 = false;
                                                m5103getColor0d7_KjU2 = textFieldImplKt$CommonDecorationBox$labelColor$1.invoke(inputPhase2, startRestartGroup, 0).m3301unboximpl();
                                                long j2 = m5103getColor0d7_KjU2;
                                                startRestartGroup.endReplaceableGroup();
                                                boolean z11 = function2 != null ? true : z6;
                                                TextFieldImplKt$CommonDecorationBox$3 textFieldImplKt$CommonDecorationBox$3 = new TextFieldImplKt$CommonDecorationBox$3(function2, function214, text, colors, z9, z10, interactionSource, i19, function217, function218, function215, function216, function219, type, innerTextField, z4, contentPadding, i21, z5, bodyLarge, bodySmall, container);
                                                composer2 = startRestartGroup;
                                                textFieldTransitionScope.m2143TransitionDTcfvLk(inputPhase2, j, j2, textFieldImplKt$CommonDecorationBox$labelColor$1, z11, ComposableLambdaKt.composableLambda(composer2, 1290853831, true, textFieldImplKt$CommonDecorationBox$3), composer2, 1769472);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                                function28 = function214;
                                                function29 = function215;
                                                function210 = function216;
                                                function211 = function217;
                                                function212 = function218;
                                                function213 = function219;
                                                z7 = z9;
                                                z8 = z10;
                                            }
                                        }
                                        z6 = false;
                                        long j22 = m5103getColor0d7_KjU2;
                                        startRestartGroup.endReplaceableGroup();
                                        if (function2 != null) {
                                        }
                                        TextFieldImplKt$CommonDecorationBox$3 textFieldImplKt$CommonDecorationBox$32 = new TextFieldImplKt$CommonDecorationBox$3(function2, function214, text, colors, z9, z10, interactionSource, i19, function217, function218, function215, function216, function219, type, innerTextField, z4, contentPadding, i21, z5, bodyLarge, bodySmall, container);
                                        composer2 = startRestartGroup;
                                        textFieldTransitionScope.m2143TransitionDTcfvLk(inputPhase2, j, j22, textFieldImplKt$CommonDecorationBox$labelColor$1, z11, ComposableLambdaKt.composableLambda(composer2, 1290853831, true, textFieldImplKt$CommonDecorationBox$32), composer2, 1769472);
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        function28 = function214;
                                        function29 = function215;
                                        function210 = function216;
                                        function211 = function217;
                                        function212 = function218;
                                        function213 = function219;
                                        z7 = z9;
                                        z8 = z10;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        function28 = function22;
                                        function29 = function23;
                                        function210 = function24;
                                        function211 = function25;
                                        function212 = function26;
                                        function213 = function27;
                                        z4 = z;
                                        z7 = z2;
                                        z8 = z3;
                                        composer2 = startRestartGroup;
                                    }
                                    endRestartGroup = composer2.endRestartGroup();
                                    if (endRestartGroup != null) {
                                        return;
                                    }
                                    endRestartGroup.updateScope(new TextFieldImplKt$CommonDecorationBox$4(type, value, innerTextField, visualTransformation, function2, function28, function29, function210, function211, function212, function213, z4, z7, z8, interactionSource, contentPadding, colors, container, i, i2, i3));
                                    return;
                                }
                                i11 = 12582912;
                                i19 |= i11;
                                if ((1533916891 & i4) == 306783378) {
                                }
                                if (i12 == 0) {
                                }
                                if (i13 == 0) {
                                }
                                if (i14 == 0) {
                                }
                                if (i15 == 0) {
                                }
                                if (i16 == 0) {
                                }
                                if (i17 == 0) {
                                }
                                if (i18 == 0) {
                                }
                                if (i6 == 0) {
                                }
                                if (i8 == 0) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                startRestartGroup.startReplaceableGroup(511388516);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                                changed = startRestartGroup.changed(value) | startRestartGroup.changed(visualTransformation);
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (!changed) {
                                }
                                rememberedValue = visualTransformation.filter(new AnnotatedString(value, null, null, 6, null));
                                startRestartGroup.updateRememberedValue(rememberedValue);
                                startRestartGroup.endReplaceableGroup();
                                String text2 = ((TransformedText) rememberedValue).getText().getText();
                                if (!FocusInteractionKt.collectIsFocusedAsState(interactionSource, startRestartGroup, (i19 >> 12) & 14).getValue().booleanValue()) {
                                }
                                InputPhase inputPhase22 = inputPhase;
                                TextFieldImplKt$CommonDecorationBox$labelColor$1 textFieldImplKt$CommonDecorationBox$labelColor$12 = new TextFieldImplKt$CommonDecorationBox$labelColor$1(colors, z9, z10, interactionSource, i19);
                                Typography typography2 = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6);
                                TextStyle bodyLarge2 = typography2.getBodyLarge();
                                TextStyle bodySmall2 = typography2.getBodySmall();
                                int i212 = i4;
                                if (Color.m3292equalsimpl0(bodyLarge2.m5103getColor0d7_KjU(), Color.Companion.m3327getUnspecified0d7_KjU())) {
                                }
                                TextFieldTransitionScope textFieldTransitionScope2 = TextFieldTransitionScope.INSTANCE;
                                startRestartGroup.startReplaceableGroup(-646388253);
                                ComposerKt.sourceInformation(startRestartGroup, "*105@4195L10,106@4289L22");
                                long m5103getColor0d7_KjU3 = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6).getBodySmall().m5103getColor0d7_KjU();
                                if (z5) {
                                }
                                long j3 = m5103getColor0d7_KjU3;
                                startRestartGroup.endReplaceableGroup();
                                startRestartGroup.startReplaceableGroup(-646388060);
                                ComposerKt.sourceInformation(startRestartGroup, "*108@4388L10,109@4482L22");
                                long m5103getColor0d7_KjU22 = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6).getBodyLarge().m5103getColor0d7_KjU();
                                if (z5) {
                                }
                                z6 = false;
                                long j222 = m5103getColor0d7_KjU22;
                                startRestartGroup.endReplaceableGroup();
                                if (function2 != null) {
                                }
                                TextFieldImplKt$CommonDecorationBox$3 textFieldImplKt$CommonDecorationBox$322 = new TextFieldImplKt$CommonDecorationBox$3(function2, function214, text2, colors, z9, z10, interactionSource, i19, function217, function218, function215, function216, function219, type, innerTextField, z4, contentPadding, i212, z5, bodyLarge2, bodySmall2, container);
                                composer2 = startRestartGroup;
                                textFieldTransitionScope2.m2143TransitionDTcfvLk(inputPhase22, j3, j222, textFieldImplKt$CommonDecorationBox$labelColor$12, z11, ComposableLambdaKt.composableLambda(composer2, 1290853831, true, textFieldImplKt$CommonDecorationBox$322), composer2, 1769472);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                function28 = function214;
                                function29 = function215;
                                function210 = function216;
                                function211 = function217;
                                function212 = function218;
                                function213 = function219;
                                z7 = z9;
                                z8 = z10;
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                }
                            }
                            i19 |= i10;
                            if ((i3 & 131072) == 0) {
                            }
                            i19 |= i11;
                            if ((1533916891 & i4) == 306783378) {
                            }
                            if (i12 == 0) {
                            }
                            if (i13 == 0) {
                            }
                            if (i14 == 0) {
                            }
                            if (i15 == 0) {
                            }
                            if (i16 == 0) {
                            }
                            if (i17 == 0) {
                            }
                            if (i18 == 0) {
                            }
                            if (i6 == 0) {
                            }
                            if (i8 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            startRestartGroup.startReplaceableGroup(511388516);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                            changed = startRestartGroup.changed(value) | startRestartGroup.changed(visualTransformation);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!changed) {
                            }
                            rememberedValue = visualTransformation.filter(new AnnotatedString(value, null, null, 6, null));
                            startRestartGroup.updateRememberedValue(rememberedValue);
                            startRestartGroup.endReplaceableGroup();
                            String text22 = ((TransformedText) rememberedValue).getText().getText();
                            if (!FocusInteractionKt.collectIsFocusedAsState(interactionSource, startRestartGroup, (i19 >> 12) & 14).getValue().booleanValue()) {
                            }
                            InputPhase inputPhase222 = inputPhase;
                            TextFieldImplKt$CommonDecorationBox$labelColor$1 textFieldImplKt$CommonDecorationBox$labelColor$122 = new TextFieldImplKt$CommonDecorationBox$labelColor$1(colors, z9, z10, interactionSource, i19);
                            Typography typography22 = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6);
                            TextStyle bodyLarge22 = typography22.getBodyLarge();
                            TextStyle bodySmall22 = typography22.getBodySmall();
                            int i2122 = i4;
                            if (Color.m3292equalsimpl0(bodyLarge22.m5103getColor0d7_KjU(), Color.Companion.m3327getUnspecified0d7_KjU())) {
                            }
                            TextFieldTransitionScope textFieldTransitionScope22 = TextFieldTransitionScope.INSTANCE;
                            startRestartGroup.startReplaceableGroup(-646388253);
                            ComposerKt.sourceInformation(startRestartGroup, "*105@4195L10,106@4289L22");
                            long m5103getColor0d7_KjU32 = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6).getBodySmall().m5103getColor0d7_KjU();
                            if (z5) {
                            }
                            long j32 = m5103getColor0d7_KjU32;
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.startReplaceableGroup(-646388060);
                            ComposerKt.sourceInformation(startRestartGroup, "*108@4388L10,109@4482L22");
                            long m5103getColor0d7_KjU222 = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6).getBodyLarge().m5103getColor0d7_KjU();
                            if (z5) {
                            }
                            z6 = false;
                            long j2222 = m5103getColor0d7_KjU222;
                            startRestartGroup.endReplaceableGroup();
                            if (function2 != null) {
                            }
                            TextFieldImplKt$CommonDecorationBox$3 textFieldImplKt$CommonDecorationBox$3222 = new TextFieldImplKt$CommonDecorationBox$3(function2, function214, text22, colors, z9, z10, interactionSource, i19, function217, function218, function215, function216, function219, type, innerTextField, z4, contentPadding, i2122, z5, bodyLarge22, bodySmall22, container);
                            composer2 = startRestartGroup;
                            textFieldTransitionScope22.m2143TransitionDTcfvLk(inputPhase222, j32, j2222, textFieldImplKt$CommonDecorationBox$labelColor$122, z11, ComposableLambdaKt.composableLambda(composer2, 1290853831, true, textFieldImplKt$CommonDecorationBox$3222), composer2, 1769472);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            function28 = function214;
                            function29 = function215;
                            function210 = function216;
                            function211 = function217;
                            function212 = function218;
                            function213 = function219;
                            z7 = z9;
                            z8 = z10;
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i19 |= i9;
                        if ((i3 & 65536) == 0) {
                        }
                        i19 |= i10;
                        if ((i3 & 131072) == 0) {
                        }
                        i19 |= i11;
                        if ((1533916891 & i4) == 306783378) {
                        }
                        if (i12 == 0) {
                        }
                        if (i13 == 0) {
                        }
                        if (i14 == 0) {
                        }
                        if (i15 == 0) {
                        }
                        if (i16 == 0) {
                        }
                        if (i17 == 0) {
                        }
                        if (i18 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        startRestartGroup.startReplaceableGroup(511388516);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                        changed = startRestartGroup.changed(value) | startRestartGroup.changed(visualTransformation);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!changed) {
                        }
                        rememberedValue = visualTransformation.filter(new AnnotatedString(value, null, null, 6, null));
                        startRestartGroup.updateRememberedValue(rememberedValue);
                        startRestartGroup.endReplaceableGroup();
                        String text222 = ((TransformedText) rememberedValue).getText().getText();
                        if (!FocusInteractionKt.collectIsFocusedAsState(interactionSource, startRestartGroup, (i19 >> 12) & 14).getValue().booleanValue()) {
                        }
                        InputPhase inputPhase2222 = inputPhase;
                        TextFieldImplKt$CommonDecorationBox$labelColor$1 textFieldImplKt$CommonDecorationBox$labelColor$1222 = new TextFieldImplKt$CommonDecorationBox$labelColor$1(colors, z9, z10, interactionSource, i19);
                        Typography typography222 = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6);
                        TextStyle bodyLarge222 = typography222.getBodyLarge();
                        TextStyle bodySmall222 = typography222.getBodySmall();
                        int i21222 = i4;
                        if (Color.m3292equalsimpl0(bodyLarge222.m5103getColor0d7_KjU(), Color.Companion.m3327getUnspecified0d7_KjU())) {
                        }
                        TextFieldTransitionScope textFieldTransitionScope222 = TextFieldTransitionScope.INSTANCE;
                        startRestartGroup.startReplaceableGroup(-646388253);
                        ComposerKt.sourceInformation(startRestartGroup, "*105@4195L10,106@4289L22");
                        long m5103getColor0d7_KjU322 = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6).getBodySmall().m5103getColor0d7_KjU();
                        if (z5) {
                        }
                        long j322 = m5103getColor0d7_KjU322;
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.startReplaceableGroup(-646388060);
                        ComposerKt.sourceInformation(startRestartGroup, "*108@4388L10,109@4482L22");
                        long m5103getColor0d7_KjU2222 = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6).getBodyLarge().m5103getColor0d7_KjU();
                        if (z5) {
                        }
                        z6 = false;
                        long j22222 = m5103getColor0d7_KjU2222;
                        startRestartGroup.endReplaceableGroup();
                        if (function2 != null) {
                        }
                        TextFieldImplKt$CommonDecorationBox$3 textFieldImplKt$CommonDecorationBox$32222 = new TextFieldImplKt$CommonDecorationBox$3(function2, function214, text222, colors, z9, z10, interactionSource, i19, function217, function218, function215, function216, function219, type, innerTextField, z4, contentPadding, i21222, z5, bodyLarge222, bodySmall222, container);
                        composer2 = startRestartGroup;
                        textFieldTransitionScope222.m2143TransitionDTcfvLk(inputPhase2222, j322, j22222, textFieldImplKt$CommonDecorationBox$labelColor$1222, z11, ComposableLambdaKt.composableLambda(composer2, 1290853831, true, textFieldImplKt$CommonDecorationBox$32222), composer2, 1769472);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        function28 = function214;
                        function29 = function215;
                        function210 = function216;
                        function211 = function217;
                        function212 = function218;
                        function213 = function219;
                        z7 = z9;
                        z8 = z10;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                }
                if ((i3 & 16384) != 0) {
                }
                if ((32768 & i3) != 0) {
                }
                i19 |= i9;
                if ((i3 & 65536) == 0) {
                }
                i19 |= i10;
                if ((i3 & 131072) == 0) {
                }
                i19 |= i11;
                if ((1533916891 & i4) == 306783378) {
                }
                if (i12 == 0) {
                }
                if (i13 == 0) {
                }
                if (i14 == 0) {
                }
                if (i15 == 0) {
                }
                if (i16 == 0) {
                }
                if (i17 == 0) {
                }
                if (i18 == 0) {
                }
                if (i6 == 0) {
                }
                if (i8 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                changed = startRestartGroup.changed(value) | startRestartGroup.changed(visualTransformation);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue = visualTransformation.filter(new AnnotatedString(value, null, null, 6, null));
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceableGroup();
                String text2222 = ((TransformedText) rememberedValue).getText().getText();
                if (!FocusInteractionKt.collectIsFocusedAsState(interactionSource, startRestartGroup, (i19 >> 12) & 14).getValue().booleanValue()) {
                }
                InputPhase inputPhase22222 = inputPhase;
                TextFieldImplKt$CommonDecorationBox$labelColor$1 textFieldImplKt$CommonDecorationBox$labelColor$12222 = new TextFieldImplKt$CommonDecorationBox$labelColor$1(colors, z9, z10, interactionSource, i19);
                Typography typography2222 = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6);
                TextStyle bodyLarge2222 = typography2222.getBodyLarge();
                TextStyle bodySmall2222 = typography2222.getBodySmall();
                int i212222 = i4;
                if (Color.m3292equalsimpl0(bodyLarge2222.m5103getColor0d7_KjU(), Color.Companion.m3327getUnspecified0d7_KjU())) {
                }
                TextFieldTransitionScope textFieldTransitionScope2222 = TextFieldTransitionScope.INSTANCE;
                startRestartGroup.startReplaceableGroup(-646388253);
                ComposerKt.sourceInformation(startRestartGroup, "*105@4195L10,106@4289L22");
                long m5103getColor0d7_KjU3222 = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6).getBodySmall().m5103getColor0d7_KjU();
                if (z5) {
                }
                long j3222 = m5103getColor0d7_KjU3222;
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.startReplaceableGroup(-646388060);
                ComposerKt.sourceInformation(startRestartGroup, "*108@4388L10,109@4482L22");
                long m5103getColor0d7_KjU22222 = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6).getBodyLarge().m5103getColor0d7_KjU();
                if (z5) {
                }
                z6 = false;
                long j222222 = m5103getColor0d7_KjU22222;
                startRestartGroup.endReplaceableGroup();
                if (function2 != null) {
                }
                TextFieldImplKt$CommonDecorationBox$3 textFieldImplKt$CommonDecorationBox$322222 = new TextFieldImplKt$CommonDecorationBox$3(function2, function214, text2222, colors, z9, z10, interactionSource, i19, function217, function218, function215, function216, function219, type, innerTextField, z4, contentPadding, i212222, z5, bodyLarge2222, bodySmall2222, container);
                composer2 = startRestartGroup;
                textFieldTransitionScope2222.m2143TransitionDTcfvLk(inputPhase22222, j3222, j222222, textFieldImplKt$CommonDecorationBox$labelColor$12222, z11, ComposableLambdaKt.composableLambda(composer2, 1290853831, true, textFieldImplKt$CommonDecorationBox$322222), composer2, 1769472);
                if (ComposerKt.isTraceInProgress()) {
                }
                function28 = function214;
                function29 = function215;
                function210 = function216;
                function211 = function217;
                function212 = function218;
                function213 = function219;
                z7 = z9;
                z8 = z10;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
        }
        i7 = i3 & 8192;
        if (i7 == 0) {
        }
        if ((i3 & 16384) != 0) {
        }
        if ((32768 & i3) != 0) {
        }
        i19 |= i9;
        if ((i3 & 65536) == 0) {
        }
        i19 |= i10;
        if ((i3 & 131072) == 0) {
        }
        i19 |= i11;
        if ((1533916891 & i4) == 306783378) {
        }
        if (i12 == 0) {
        }
        if (i13 == 0) {
        }
        if (i14 == 0) {
        }
        if (i15 == 0) {
        }
        if (i16 == 0) {
        }
        if (i17 == 0) {
        }
        if (i18 == 0) {
        }
        if (i6 == 0) {
        }
        if (i8 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
        changed = startRestartGroup.changed(value) | startRestartGroup.changed(visualTransformation);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue = visualTransformation.filter(new AnnotatedString(value, null, null, 6, null));
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceableGroup();
        String text22222 = ((TransformedText) rememberedValue).getText().getText();
        if (!FocusInteractionKt.collectIsFocusedAsState(interactionSource, startRestartGroup, (i19 >> 12) & 14).getValue().booleanValue()) {
        }
        InputPhase inputPhase222222 = inputPhase;
        TextFieldImplKt$CommonDecorationBox$labelColor$1 textFieldImplKt$CommonDecorationBox$labelColor$122222 = new TextFieldImplKt$CommonDecorationBox$labelColor$1(colors, z9, z10, interactionSource, i19);
        Typography typography22222 = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6);
        TextStyle bodyLarge22222 = typography22222.getBodyLarge();
        TextStyle bodySmall22222 = typography22222.getBodySmall();
        int i2122222 = i4;
        if (Color.m3292equalsimpl0(bodyLarge22222.m5103getColor0d7_KjU(), Color.Companion.m3327getUnspecified0d7_KjU())) {
        }
        TextFieldTransitionScope textFieldTransitionScope22222 = TextFieldTransitionScope.INSTANCE;
        startRestartGroup.startReplaceableGroup(-646388253);
        ComposerKt.sourceInformation(startRestartGroup, "*105@4195L10,106@4289L22");
        long m5103getColor0d7_KjU32222 = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6).getBodySmall().m5103getColor0d7_KjU();
        if (z5) {
        }
        long j32222 = m5103getColor0d7_KjU32222;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(-646388060);
        ComposerKt.sourceInformation(startRestartGroup, "*108@4388L10,109@4482L22");
        long m5103getColor0d7_KjU222222 = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6).getBodyLarge().m5103getColor0d7_KjU();
        if (z5) {
        }
        z6 = false;
        long j2222222 = m5103getColor0d7_KjU222222;
        startRestartGroup.endReplaceableGroup();
        if (function2 != null) {
        }
        TextFieldImplKt$CommonDecorationBox$3 textFieldImplKt$CommonDecorationBox$3222222 = new TextFieldImplKt$CommonDecorationBox$3(function2, function214, text22222, colors, z9, z10, interactionSource, i19, function217, function218, function215, function216, function219, type, innerTextField, z4, contentPadding, i2122222, z5, bodyLarge22222, bodySmall22222, container);
        composer2 = startRestartGroup;
        textFieldTransitionScope22222.m2143TransitionDTcfvLk(inputPhase222222, j32222, j2222222, textFieldImplKt$CommonDecorationBox$labelColor$122222, z11, ComposableLambdaKt.composableLambda(composer2, 1290853831, true, textFieldImplKt$CommonDecorationBox$3222222), composer2, 1769472);
        if (ComposerKt.isTraceInProgress()) {
        }
        function28 = function214;
        function29 = function215;
        function210 = function216;
        function211 = function217;
        function212 = function218;
        function213 = function219;
        z7 = z9;
        z8 = z10;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: Decoration-KTwxG1Y  reason: not valid java name */
    public static final void m2135DecorationKTwxG1Y(long j, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1520066345);
        ComposerKt.sourceInformation(startRestartGroup, "C(Decoration)P(1:c#ui.graphics.Color,2):TextFieldImpl.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(textStyle) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changedInstance(content) ? 256 : 128;
        }
        if ((i3 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                textStyle = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1520066345, i3, -1, "androidx.compose.material3.Decoration (TextFieldImpl.kt:274)");
            }
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, 1449369305, true, new TextFieldImplKt$Decoration$contentWithColor$1(j, content, i3));
            if (textStyle != null) {
                startRestartGroup.startReplaceableGroup(1830468032);
                ComposerKt.sourceInformation(startRestartGroup, "285@11827L46");
                TextKt.ProvideTextStyle(textStyle, composableLambda, startRestartGroup, ((i3 >> 3) & 14) | 48);
            } else {
                startRestartGroup.startReplaceableGroup(1830468084);
                ComposerKt.sourceInformation(startRestartGroup, "285@11879L18");
                composableLambda.invoke(startRestartGroup, 6);
            }
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        TextStyle textStyle2 = textStyle;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new TextFieldImplKt$Decoration$1(j, textStyle2, content, i, i2));
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
        float f = 16;
        TextFieldPadding = Dp.m5607constructorimpl(f);
        MinFocusedLabelLineHeight = Dp.m5607constructorimpl(f);
        MinSupportingTextLineHeight = Dp.m5607constructorimpl(f);
        float f2 = 48;
        IconDefaultSizeModifier = SizeKt.m779defaultMinSizeVpY3zN4(Modifier.Companion, Dp.m5607constructorimpl(f2), Dp.m5607constructorimpl(f2));
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

    public static final float getSupportingTopPadding() {
        return SupportingTopPadding;
    }

    public static final float getPrefixSuffixTextPadding() {
        return PrefixSuffixTextPadding;
    }

    public static final float getMinTextLineHeight() {
        return MinTextLineHeight;
    }

    public static final float getMinFocusedLabelLineHeight() {
        return MinFocusedLabelLineHeight;
    }

    public static final float getMinSupportingTextLineHeight() {
        return MinSupportingTextLineHeight;
    }

    public static final Modifier getIconDefaultSizeModifier() {
        return IconDefaultSizeModifier;
    }
}
