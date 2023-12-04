package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.C;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Button.kt */
@Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\u001a\u008d\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u008d\u0001\u0010\u001a\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u008d\u0001\u0010\u001b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019¨\u0006\u001c²\u0006\n\u0010\u001d\u001a\u00020\u001eX\u008a\u0084\u0002"}, d2 = {"Button", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "elevation", "Landroidx/compose/material/ButtonElevation;", "shape", "Landroidx/compose/ui/graphics/Shape;", OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/BorderStroke;", "colors", "Landroidx/compose/material/ButtonColors;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/ButtonElevation;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/material/ButtonColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "OutlinedButton", "TextButton", "material_release", "contentColor", "Landroidx/compose/ui/graphics/Color;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ButtonKt {
    /* JADX WARN: Removed duplicated region for block: B:102:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010d  */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v5, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Button(Function0<Unit> onClick, Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, ButtonElevation buttonElevation, Shape shape, BorderStroke borderStroke, ButtonColors buttonColors, PaddingValues paddingValues, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        int i4;
        boolean z2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        Object obj;
        Object obj2;
        int i6;
        int i7;
        int i8;
        PaddingValues paddingValues2;
        int i9;
        MutableInteractionSource mutableInteractionSource3;
        boolean z3;
        int i10;
        CornerBasedShape cornerBasedShape;
        ButtonColors buttonColors2;
        PaddingValues contentPadding;
        Shape shape2;
        BorderStroke borderStroke2;
        ButtonColors buttonColors3;
        ButtonElevation buttonElevation2;
        Modifier modifier2;
        boolean z4;
        MutableInteractionSource mutableInteractionSource4;
        ?? r10;
        Composer composer2;
        Shape shape3;
        BorderStroke borderStroke3;
        ButtonElevation buttonElevation3;
        ButtonColors buttonColors4;
        Modifier modifier3;
        boolean z5;
        MutableInteractionSource mutableInteractionSource5;
        ScopeUpdateScope endRestartGroup;
        int i11;
        Object obj3;
        int i12;
        Object obj4;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-2116133464);
        ComposerKt.sourceInformation(startRestartGroup, "C(Button)P(8,7,5,6,4,9!2,3)97@4664L39,98@4754L11,99@4800L6,101@4890L14,105@5053L21,111@5250L24,106@5079L1119:Button.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changedInstance(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                } else if ((i & 7168) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 2048 : 1024;
                    if ((57344 & i) != 0) {
                        if ((i2 & 16) == 0) {
                            obj3 = buttonElevation;
                            if (startRestartGroup.changed(obj3)) {
                                i12 = 16384;
                                obj4 = obj3;
                                i3 |= i12;
                                obj = obj4;
                            }
                        } else {
                            obj3 = buttonElevation;
                        }
                        i12 = 8192;
                        obj4 = obj3;
                        i3 |= i12;
                        obj = obj4;
                    } else {
                        obj = buttonElevation;
                    }
                    if ((458752 & i) != 0) {
                        obj2 = shape;
                        i3 |= ((i2 & 32) == 0 && startRestartGroup.changed(obj2)) ? 131072 : 65536;
                    } else {
                        obj2 = shape;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        i3 |= startRestartGroup.changed(borderStroke) ? 1048576 : 524288;
                        if ((i & 29360128) == 0) {
                            if ((i2 & 128) == 0 && startRestartGroup.changed(buttonColors)) {
                                i11 = 8388608;
                                i3 |= i11;
                            }
                            i11 = 4194304;
                            i3 |= i11;
                        }
                        i7 = i2 & 256;
                        if (i7 != 0) {
                            i3 |= 100663296;
                        } else if ((i & 234881024) == 0) {
                            i8 = i7;
                            Object obj5 = paddingValues;
                            i3 |= startRestartGroup.changed(obj5) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                            paddingValues2 = obj5;
                            if ((i2 & 512) == 0) {
                                i3 |= C.ENCODING_PCM_32BIT;
                            } else if ((1879048192 & i) == 0) {
                                i3 |= startRestartGroup.changedInstance(content) ? 536870912 : 268435456;
                            }
                            i9 = i3;
                            if ((1533916891 & i9) == 306783378 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    Modifier.Companion companion = i13 == 0 ? Modifier.Companion : modifier;
                                    boolean z6 = i4 == 0 ? true : z2;
                                    if (i5 == 0) {
                                        startRestartGroup.startReplaceableGroup(-492369756);
                                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                        Object rememberedValue = startRestartGroup.rememberedValue();
                                        if (rememberedValue == Composer.Companion.getEmpty()) {
                                            rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                        }
                                        startRestartGroup.endReplaceableGroup();
                                        mutableInteractionSource3 = (MutableInteractionSource) rememberedValue;
                                    } else {
                                        mutableInteractionSource3 = mutableInteractionSource2;
                                    }
                                    if ((i2 & 16) == 0) {
                                        z3 = true;
                                        i10 = i8;
                                        i9 &= -57345;
                                        obj = ButtonDefaults.INSTANCE.m1275elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                                    } else {
                                        z3 = true;
                                        i10 = i8;
                                    }
                                    if ((i2 & 32) == 0) {
                                        cornerBasedShape = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getSmall();
                                        i9 &= -458753;
                                    } else {
                                        cornerBasedShape = shape;
                                    }
                                    BorderStroke borderStroke4 = i6 == 0 ? null : borderStroke;
                                    if ((i2 & 128) == 0) {
                                        buttonColors2 = ButtonDefaults.INSTANCE.m1274buttonColorsro_MJ88(0L, 0L, 0L, 0L, startRestartGroup, 24576, 15);
                                        i9 &= -29360129;
                                    } else {
                                        buttonColors2 = buttonColors;
                                    }
                                    contentPadding = i10 == 0 ? ButtonDefaults.INSTANCE.getContentPadding() : paddingValues;
                                    shape2 = cornerBasedShape;
                                    borderStroke2 = borderStroke4;
                                    buttonColors3 = buttonColors2;
                                    buttonElevation2 = obj;
                                    modifier2 = companion;
                                    z4 = z6;
                                    r10 = z3;
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i2 & 16) != 0) {
                                        i9 &= -57345;
                                    }
                                    if ((i2 & 32) != 0) {
                                        i9 &= -458753;
                                    }
                                    if ((i2 & 128) != 0) {
                                        i9 &= -29360129;
                                    }
                                    borderStroke2 = borderStroke;
                                    contentPadding = paddingValues;
                                    mutableInteractionSource4 = mutableInteractionSource2;
                                    buttonElevation2 = obj;
                                    shape2 = obj2;
                                    buttonColors3 = buttonColors;
                                    z4 = z2;
                                    r10 = 1;
                                    modifier2 = modifier;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2116133464, i9, -1, "androidx.compose.material.Button (Button.kt:93)");
                                }
                                int i14 = i9 >> 6;
                                int i15 = i14 & 14;
                                int i16 = ((i9 >> 18) & 112) | i15;
                                State<Color> contentColor = buttonColors3.contentColor(z4, startRestartGroup, i16);
                                Modifier semantics$default = SemanticsModifierKt.semantics$default(modifier2, false, ButtonKt$Button$2.INSTANCE, r10, null);
                                long m3301unboximpl = buttonColors3.backgroundColor(z4, startRestartGroup, i16).getValue().m3301unboximpl();
                                long m3290copywmQWz5c$default = Color.m3290copywmQWz5c$default(Button$lambda$1(contentColor), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                                startRestartGroup.startReplaceableGroup(-423487112);
                                ComposerKt.sourceInformation(startRestartGroup, "114@5392L37");
                                State<Dp> elevation = buttonElevation2 != null ? null : buttonElevation2.elevation(z4, mutableInteractionSource4, startRestartGroup, i15 | (i14 & 112) | (i14 & 896));
                                startRestartGroup.endReplaceableGroup();
                                PaddingValues paddingValues3 = contentPadding;
                                ButtonElevation buttonElevation4 = buttonElevation2;
                                ButtonColors buttonColors5 = buttonColors3;
                                boolean z7 = z4;
                                Modifier modifier4 = modifier2;
                                composer2 = startRestartGroup;
                                SurfaceKt.m1472SurfaceLPr_se0(onClick, semantics$default, z4, shape2, m3301unboximpl, m3290copywmQWz5c$default, borderStroke2, elevation == null ? elevation.getValue().m5621unboximpl() : Dp.m5607constructorimpl(0), mutableInteractionSource4, ComposableLambdaKt.composableLambda(startRestartGroup, 7524271, r10, new ButtonKt$Button$3(contentColor, contentPadding, content, i9)), composer2, (i14 & 7168) | (i9 & 14) | C.ENCODING_PCM_32BIT | (i9 & 896) | (i9 & 3670016) | ((i9 << 15) & 234881024), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                shape3 = shape2;
                                borderStroke3 = borderStroke2;
                                buttonElevation3 = buttonElevation4;
                                buttonColors4 = buttonColors5;
                                paddingValues2 = paddingValues3;
                                modifier3 = modifier4;
                                z5 = z7;
                                mutableInteractionSource5 = mutableInteractionSource4;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier3 = modifier;
                                z5 = z2;
                                mutableInteractionSource5 = mutableInteractionSource2;
                                buttonElevation3 = obj;
                                shape3 = obj2;
                                composer2 = startRestartGroup;
                                borderStroke3 = borderStroke;
                                buttonColors4 = buttonColors;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                                return;
                            }
                            endRestartGroup.updateScope(new ButtonKt$Button$4(onClick, modifier3, z5, mutableInteractionSource5, buttonElevation3, shape3, borderStroke3, buttonColors4, paddingValues2, content, i, i2));
                            return;
                        }
                        i8 = i7;
                        paddingValues2 = paddingValues;
                        if ((i2 & 512) == 0) {
                        }
                        i9 = i3;
                        if ((1533916891 & i9) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                        }
                        if (i13 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if ((i2 & 16) == 0) {
                        }
                        if ((i2 & 32) == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 128) == 0) {
                        }
                        if (i10 == 0) {
                        }
                        shape2 = cornerBasedShape;
                        borderStroke2 = borderStroke4;
                        buttonColors3 = buttonColors2;
                        buttonElevation2 = obj;
                        modifier2 = companion;
                        z4 = z6;
                        r10 = z3;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i142 = i9 >> 6;
                        int i152 = i142 & 14;
                        int i162 = ((i9 >> 18) & 112) | i152;
                        State<Color> contentColor2 = buttonColors3.contentColor(z4, startRestartGroup, i162);
                        Modifier semantics$default2 = SemanticsModifierKt.semantics$default(modifier2, false, ButtonKt$Button$2.INSTANCE, r10, null);
                        long m3301unboximpl2 = buttonColors3.backgroundColor(z4, startRestartGroup, i162).getValue().m3301unboximpl();
                        long m3290copywmQWz5c$default2 = Color.m3290copywmQWz5c$default(Button$lambda$1(contentColor2), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                        startRestartGroup.startReplaceableGroup(-423487112);
                        ComposerKt.sourceInformation(startRestartGroup, "114@5392L37");
                        if (buttonElevation2 != null) {
                        }
                        startRestartGroup.endReplaceableGroup();
                        if (elevation == null) {
                        }
                        PaddingValues paddingValues32 = contentPadding;
                        ButtonElevation buttonElevation42 = buttonElevation2;
                        ButtonColors buttonColors52 = buttonColors3;
                        boolean z72 = z4;
                        Modifier modifier42 = modifier2;
                        composer2 = startRestartGroup;
                        SurfaceKt.m1472SurfaceLPr_se0(onClick, semantics$default2, z4, shape2, m3301unboximpl2, m3290copywmQWz5c$default2, borderStroke2, elevation == null ? elevation.getValue().m5621unboximpl() : Dp.m5607constructorimpl(0), mutableInteractionSource4, ComposableLambdaKt.composableLambda(startRestartGroup, 7524271, r10, new ButtonKt$Button$3(contentColor2, contentPadding, content, i9)), composer2, (i142 & 7168) | (i9 & 14) | C.ENCODING_PCM_32BIT | (i9 & 896) | (i9 & 3670016) | ((i9 << 15) & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        shape3 = shape2;
                        borderStroke3 = borderStroke2;
                        buttonElevation3 = buttonElevation42;
                        buttonColors4 = buttonColors52;
                        paddingValues2 = paddingValues32;
                        modifier3 = modifier42;
                        z5 = z72;
                        mutableInteractionSource5 = mutableInteractionSource4;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    if ((i & 29360128) == 0) {
                    }
                    i7 = i2 & 256;
                    if (i7 != 0) {
                    }
                    i8 = i7;
                    paddingValues2 = paddingValues;
                    if ((i2 & 512) == 0) {
                    }
                    i9 = i3;
                    if ((1533916891 & i9) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i13 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if ((i2 & 16) == 0) {
                    }
                    if ((i2 & 32) == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if ((i2 & 128) == 0) {
                    }
                    if (i10 == 0) {
                    }
                    shape2 = cornerBasedShape;
                    borderStroke2 = borderStroke4;
                    buttonColors3 = buttonColors2;
                    buttonElevation2 = obj;
                    modifier2 = companion;
                    z4 = z6;
                    r10 = z3;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i1422 = i9 >> 6;
                    int i1522 = i1422 & 14;
                    int i1622 = ((i9 >> 18) & 112) | i1522;
                    State<Color> contentColor22 = buttonColors3.contentColor(z4, startRestartGroup, i1622);
                    Modifier semantics$default22 = SemanticsModifierKt.semantics$default(modifier2, false, ButtonKt$Button$2.INSTANCE, r10, null);
                    long m3301unboximpl22 = buttonColors3.backgroundColor(z4, startRestartGroup, i1622).getValue().m3301unboximpl();
                    long m3290copywmQWz5c$default22 = Color.m3290copywmQWz5c$default(Button$lambda$1(contentColor22), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                    startRestartGroup.startReplaceableGroup(-423487112);
                    ComposerKt.sourceInformation(startRestartGroup, "114@5392L37");
                    if (buttonElevation2 != null) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    if (elevation == null) {
                    }
                    PaddingValues paddingValues322 = contentPadding;
                    ButtonElevation buttonElevation422 = buttonElevation2;
                    ButtonColors buttonColors522 = buttonColors3;
                    boolean z722 = z4;
                    Modifier modifier422 = modifier2;
                    composer2 = startRestartGroup;
                    SurfaceKt.m1472SurfaceLPr_se0(onClick, semantics$default22, z4, shape2, m3301unboximpl22, m3290copywmQWz5c$default22, borderStroke2, elevation == null ? elevation.getValue().m5621unboximpl() : Dp.m5607constructorimpl(0), mutableInteractionSource4, ComposableLambdaKt.composableLambda(startRestartGroup, 7524271, r10, new ButtonKt$Button$3(contentColor22, contentPadding, content, i9)), composer2, (i1422 & 7168) | (i9 & 14) | C.ENCODING_PCM_32BIT | (i9 & 896) | (i9 & 3670016) | ((i9 << 15) & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    shape3 = shape2;
                    borderStroke3 = borderStroke2;
                    buttonElevation3 = buttonElevation422;
                    buttonColors4 = buttonColors522;
                    paddingValues2 = paddingValues322;
                    modifier3 = modifier422;
                    z5 = z722;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((57344 & i) != 0) {
                }
                if ((458752 & i) != 0) {
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                if ((i & 29360128) == 0) {
                }
                i7 = i2 & 256;
                if (i7 != 0) {
                }
                i8 = i7;
                paddingValues2 = paddingValues;
                if ((i2 & 512) == 0) {
                }
                i9 = i3;
                if ((1533916891 & i9) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i13 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if ((i2 & 16) == 0) {
                }
                if ((i2 & 32) == 0) {
                }
                if (i6 == 0) {
                }
                if ((i2 & 128) == 0) {
                }
                if (i10 == 0) {
                }
                shape2 = cornerBasedShape;
                borderStroke2 = borderStroke4;
                buttonColors3 = buttonColors2;
                buttonElevation2 = obj;
                modifier2 = companion;
                z4 = z6;
                r10 = z3;
                mutableInteractionSource4 = mutableInteractionSource3;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i14222 = i9 >> 6;
                int i15222 = i14222 & 14;
                int i16222 = ((i9 >> 18) & 112) | i15222;
                State<Color> contentColor222 = buttonColors3.contentColor(z4, startRestartGroup, i16222);
                Modifier semantics$default222 = SemanticsModifierKt.semantics$default(modifier2, false, ButtonKt$Button$2.INSTANCE, r10, null);
                long m3301unboximpl222 = buttonColors3.backgroundColor(z4, startRestartGroup, i16222).getValue().m3301unboximpl();
                long m3290copywmQWz5c$default222 = Color.m3290copywmQWz5c$default(Button$lambda$1(contentColor222), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                startRestartGroup.startReplaceableGroup(-423487112);
                ComposerKt.sourceInformation(startRestartGroup, "114@5392L37");
                if (buttonElevation2 != null) {
                }
                startRestartGroup.endReplaceableGroup();
                if (elevation == null) {
                }
                PaddingValues paddingValues3222 = contentPadding;
                ButtonElevation buttonElevation4222 = buttonElevation2;
                ButtonColors buttonColors5222 = buttonColors3;
                boolean z7222 = z4;
                Modifier modifier4222 = modifier2;
                composer2 = startRestartGroup;
                SurfaceKt.m1472SurfaceLPr_se0(onClick, semantics$default222, z4, shape2, m3301unboximpl222, m3290copywmQWz5c$default222, borderStroke2, elevation == null ? elevation.getValue().m5621unboximpl() : Dp.m5607constructorimpl(0), mutableInteractionSource4, ComposableLambdaKt.composableLambda(startRestartGroup, 7524271, r10, new ButtonKt$Button$3(contentColor222, contentPadding, content, i9)), composer2, (i14222 & 7168) | (i9 & 14) | C.ENCODING_PCM_32BIT | (i9 & 896) | (i9 & 3670016) | ((i9 << 15) & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                shape3 = shape2;
                borderStroke3 = borderStroke2;
                buttonElevation3 = buttonElevation4222;
                buttonColors4 = buttonColors5222;
                paddingValues2 = paddingValues3222;
                modifier3 = modifier4222;
                z5 = z7222;
                mutableInteractionSource5 = mutableInteractionSource4;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((57344 & i) != 0) {
            }
            if ((458752 & i) != 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            if ((i & 29360128) == 0) {
            }
            i7 = i2 & 256;
            if (i7 != 0) {
            }
            i8 = i7;
            paddingValues2 = paddingValues;
            if ((i2 & 512) == 0) {
            }
            i9 = i3;
            if ((1533916891 & i9) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i13 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if ((i2 & 16) == 0) {
            }
            if ((i2 & 32) == 0) {
            }
            if (i6 == 0) {
            }
            if ((i2 & 128) == 0) {
            }
            if (i10 == 0) {
            }
            shape2 = cornerBasedShape;
            borderStroke2 = borderStroke4;
            buttonColors3 = buttonColors2;
            buttonElevation2 = obj;
            modifier2 = companion;
            z4 = z6;
            r10 = z3;
            mutableInteractionSource4 = mutableInteractionSource3;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i142222 = i9 >> 6;
            int i152222 = i142222 & 14;
            int i162222 = ((i9 >> 18) & 112) | i152222;
            State<Color> contentColor2222 = buttonColors3.contentColor(z4, startRestartGroup, i162222);
            Modifier semantics$default2222 = SemanticsModifierKt.semantics$default(modifier2, false, ButtonKt$Button$2.INSTANCE, r10, null);
            long m3301unboximpl2222 = buttonColors3.backgroundColor(z4, startRestartGroup, i162222).getValue().m3301unboximpl();
            long m3290copywmQWz5c$default2222 = Color.m3290copywmQWz5c$default(Button$lambda$1(contentColor2222), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
            startRestartGroup.startReplaceableGroup(-423487112);
            ComposerKt.sourceInformation(startRestartGroup, "114@5392L37");
            if (buttonElevation2 != null) {
            }
            startRestartGroup.endReplaceableGroup();
            if (elevation == null) {
            }
            PaddingValues paddingValues32222 = contentPadding;
            ButtonElevation buttonElevation42222 = buttonElevation2;
            ButtonColors buttonColors52222 = buttonColors3;
            boolean z72222 = z4;
            Modifier modifier42222 = modifier2;
            composer2 = startRestartGroup;
            SurfaceKt.m1472SurfaceLPr_se0(onClick, semantics$default2222, z4, shape2, m3301unboximpl2222, m3290copywmQWz5c$default2222, borderStroke2, elevation == null ? elevation.getValue().m5621unboximpl() : Dp.m5607constructorimpl(0), mutableInteractionSource4, ComposableLambdaKt.composableLambda(startRestartGroup, 7524271, r10, new ButtonKt$Button$3(contentColor2222, contentPadding, content, i9)), composer2, (i142222 & 7168) | (i9 & 14) | C.ENCODING_PCM_32BIT | (i9 & 896) | (i9 & 3670016) | ((i9 << 15) & 234881024), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            shape3 = shape2;
            borderStroke3 = borderStroke2;
            buttonElevation3 = buttonElevation42222;
            buttonColors4 = buttonColors52222;
            paddingValues2 = paddingValues32222;
            modifier3 = modifier42222;
            z5 = z72222;
            mutableInteractionSource5 = mutableInteractionSource4;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((57344 & i) != 0) {
        }
        if ((458752 & i) != 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        if ((i & 29360128) == 0) {
        }
        i7 = i2 & 256;
        if (i7 != 0) {
        }
        i8 = i7;
        paddingValues2 = paddingValues;
        if ((i2 & 512) == 0) {
        }
        i9 = i3;
        if ((1533916891 & i9) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i13 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if (i6 == 0) {
        }
        if ((i2 & 128) == 0) {
        }
        if (i10 == 0) {
        }
        shape2 = cornerBasedShape;
        borderStroke2 = borderStroke4;
        buttonColors3 = buttonColors2;
        buttonElevation2 = obj;
        modifier2 = companion;
        z4 = z6;
        r10 = z3;
        mutableInteractionSource4 = mutableInteractionSource3;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i1422222 = i9 >> 6;
        int i1522222 = i1422222 & 14;
        int i1622222 = ((i9 >> 18) & 112) | i1522222;
        State<Color> contentColor22222 = buttonColors3.contentColor(z4, startRestartGroup, i1622222);
        Modifier semantics$default22222 = SemanticsModifierKt.semantics$default(modifier2, false, ButtonKt$Button$2.INSTANCE, r10, null);
        long m3301unboximpl22222 = buttonColors3.backgroundColor(z4, startRestartGroup, i1622222).getValue().m3301unboximpl();
        long m3290copywmQWz5c$default22222 = Color.m3290copywmQWz5c$default(Button$lambda$1(contentColor22222), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
        startRestartGroup.startReplaceableGroup(-423487112);
        ComposerKt.sourceInformation(startRestartGroup, "114@5392L37");
        if (buttonElevation2 != null) {
        }
        startRestartGroup.endReplaceableGroup();
        if (elevation == null) {
        }
        PaddingValues paddingValues322222 = contentPadding;
        ButtonElevation buttonElevation422222 = buttonElevation2;
        ButtonColors buttonColors522222 = buttonColors3;
        boolean z722222 = z4;
        Modifier modifier422222 = modifier2;
        composer2 = startRestartGroup;
        SurfaceKt.m1472SurfaceLPr_se0(onClick, semantics$default22222, z4, shape2, m3301unboximpl22222, m3290copywmQWz5c$default22222, borderStroke2, elevation == null ? elevation.getValue().m5621unboximpl() : Dp.m5607constructorimpl(0), mutableInteractionSource4, ComposableLambdaKt.composableLambda(startRestartGroup, 7524271, r10, new ButtonKt$Button$3(contentColor22222, contentPadding, content, i9)), composer2, (i1422222 & 7168) | (i9 & 14) | C.ENCODING_PCM_32BIT | (i9 & 896) | (i9 & 3670016) | ((i9 << 15) & 234881024), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        shape3 = shape2;
        borderStroke3 = borderStroke2;
        buttonElevation3 = buttonElevation422222;
        buttonColors4 = buttonColors522222;
        paddingValues2 = paddingValues322222;
        modifier3 = modifier422222;
        z5 = z722222;
        mutableInteractionSource5 = mutableInteractionSource4;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void OutlinedButton(Function0<Unit> onClick, Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, ButtonElevation buttonElevation, Shape shape, BorderStroke borderStroke, ButtonColors buttonColors, PaddingValues paddingValues, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        MutableInteractionSource mutableInteractionSource2;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(-1776134358);
        ComposerKt.sourceInformation(composer, "C(OutlinedButton)P(8,7,5,6,4,9!2,3)171@8120L39,173@8234L6,174@8291L14,175@8349L22,178@8489L270:Button.kt#jmzs0o");
        Modifier.Companion companion = (i2 & 2) != 0 ? Modifier.Companion : modifier;
        boolean z2 = (i2 & 4) != 0 ? true : z;
        if ((i2 & 8) != 0) {
            composer.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
        }
        ButtonElevation buttonElevation2 = (i2 & 16) != 0 ? null : buttonElevation;
        CornerBasedShape small = (i2 & 32) != 0 ? MaterialTheme.INSTANCE.getShapes(composer, 6).getSmall() : shape;
        BorderStroke outlinedBorder = (i2 & 64) != 0 ? ButtonDefaults.INSTANCE.getOutlinedBorder(composer, 6) : borderStroke;
        ButtonColors m1282outlinedButtonColorsRGew2ao = (i2 & 128) != 0 ? ButtonDefaults.INSTANCE.m1282outlinedButtonColorsRGew2ao(0L, 0L, 0L, composer, CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, 7) : buttonColors;
        PaddingValues contentPadding = (i2 & 256) != 0 ? ButtonDefaults.INSTANCE.getContentPadding() : paddingValues;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1776134358, i, -1, "androidx.compose.material.OutlinedButton (Button.kt:167)");
        }
        Button(onClick, companion, z2, mutableInteractionSource2, buttonElevation2, small, outlinedBorder, m1282outlinedButtonColorsRGew2ao, contentPadding, content, composer, (i & 14) | (i & 112) | (i & 896) | (i & 7168) | (57344 & i) | (458752 & i) | (3670016 & i) | (29360128 & i) | (234881024 & i) | (1879048192 & i), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    public static final void TextButton(Function0<Unit> onClick, Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, ButtonElevation buttonElevation, Shape shape, BorderStroke borderStroke, ButtonColors buttonColors, PaddingValues paddingValues, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        MutableInteractionSource mutableInteractionSource2;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(288797557);
        ComposerKt.sourceInformation(composer, "C(TextButton)P(8,7,5,6,4,9!2,3)225@10691L39,227@10805L6,229@10895L18,232@11041L270:Button.kt#jmzs0o");
        Modifier.Companion companion = (i2 & 2) != 0 ? Modifier.Companion : modifier;
        boolean z2 = (i2 & 4) != 0 ? true : z;
        if ((i2 & 8) != 0) {
            composer.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
        }
        ButtonElevation buttonElevation2 = (i2 & 16) != 0 ? null : buttonElevation;
        CornerBasedShape small = (i2 & 32) != 0 ? MaterialTheme.INSTANCE.getShapes(composer, 6).getSmall() : shape;
        BorderStroke borderStroke2 = (i2 & 64) != 0 ? null : borderStroke;
        ButtonColors m1283textButtonColorsRGew2ao = (i2 & 128) != 0 ? ButtonDefaults.INSTANCE.m1283textButtonColorsRGew2ao(0L, 0L, 0L, composer, CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, 7) : buttonColors;
        PaddingValues textButtonContentPadding = (i2 & 256) != 0 ? ButtonDefaults.INSTANCE.getTextButtonContentPadding() : paddingValues;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(288797557, i, -1, "androidx.compose.material.TextButton (Button.kt:221)");
        }
        Button(onClick, companion, z2, mutableInteractionSource2, buttonElevation2, small, borderStroke2, m1283textButtonColorsRGew2ao, textButtonContentPadding, content, composer, (i & 14) | (i & 112) | (i & 896) | (i & 7168) | (57344 & i) | (458752 & i) | (3670016 & i) | (29360128 & i) | (234881024 & i) | (1879048192 & i), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long Button$lambda$1(State<Color> state) {
        return state.getValue().m3301unboximpl();
    }
}
