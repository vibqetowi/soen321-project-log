package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.C;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Button.kt */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u008d\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u008d\u0001\u0010\u001a\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u008d\u0001\u0010\u001b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u008d\u0001\u0010\u001c\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u008d\u0001\u0010\u001d\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019¨\u0006\u001e"}, d2 = {"Button", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material3/ButtonColors;", "elevation", "Landroidx/compose/material3/ButtonElevation;", androidx.compose.material.OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/BorderStroke;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ButtonColors;Landroidx/compose/material3/ButtonElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "ElevatedButton", "FilledTonalButton", "OutlinedButton", "TextButton", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ButtonKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:187:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010d  */
    /* JADX WARN: Type inference failed for: r4v11, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Button(Function0<Unit> onClick, Modifier modifier, boolean z, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        int i4;
        boolean z2;
        Shape shape2;
        Object obj;
        ButtonElevation buttonElevation2;
        int i5;
        int i6;
        int i7;
        int i8;
        Object obj2;
        int i9;
        int i10;
        boolean z3;
        int i11;
        BorderStroke borderStroke2;
        MutableInteractionSource mutableInteractionSource2;
        BorderStroke borderStroke3;
        Shape shape3;
        ButtonElevation buttonElevation3;
        PaddingValues paddingValues2;
        Modifier modifier2;
        int i12;
        ?? r4;
        Composer composer2;
        Shape shape4;
        BorderStroke borderStroke4;
        PaddingValues paddingValues3;
        MutableInteractionSource mutableInteractionSource3;
        boolean z4;
        Modifier modifier3;
        ButtonElevation buttonElevation4;
        ButtonColors buttonColors2;
        ScopeUpdateScope endRestartGroup;
        Object obj3;
        int i13;
        Object obj4;
        int i14;
        Object obj5;
        Shape shape5;
        int i15;
        Shape shape6;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(650121315);
        ComposerKt.sourceInformation(startRestartGroup, "C(Button)P(8,7,5,9,1,4!1,3,6)108@5507L5,109@5556L14,110@5621L17,113@5791L39,116@5913L23,117@5973L21,120@6195L1045:Button.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changedInstance(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i16 = i2 & 2;
        if (i16 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                if ((i & 7168) == 0) {
                    if ((i2 & 8) == 0) {
                        shape5 = shape;
                        if (startRestartGroup.changed(shape5)) {
                            i15 = 2048;
                            shape6 = shape5;
                            i3 |= i15;
                            shape2 = shape6;
                        }
                    } else {
                        shape5 = shape;
                    }
                    i15 = 1024;
                    shape6 = shape5;
                    i3 |= i15;
                    shape2 = shape6;
                } else {
                    shape2 = shape;
                }
                if ((57344 & i) == 0) {
                    if ((i2 & 16) == 0) {
                        obj4 = buttonColors;
                        if (startRestartGroup.changed(obj4)) {
                            i14 = 16384;
                            obj5 = obj4;
                            i3 |= i14;
                            obj = obj5;
                        }
                    } else {
                        obj4 = buttonColors;
                    }
                    i14 = 8192;
                    obj5 = obj4;
                    i3 |= i14;
                    obj = obj5;
                } else {
                    obj = buttonColors;
                }
                if ((458752 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        obj3 = buttonElevation;
                        boolean changed = startRestartGroup.changed(obj3);
                        obj3 = obj3;
                        if (changed) {
                            i13 = 131072;
                            i3 |= i13;
                            buttonElevation2 = obj3;
                        }
                    } else {
                        obj3 = buttonElevation;
                    }
                    i13 = 65536;
                    i3 |= i13;
                    buttonElevation2 = obj3;
                } else {
                    buttonElevation2 = buttonElevation;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((3670016 & i) == 0) {
                    i3 |= startRestartGroup.changed(borderStroke) ? 1048576 : 524288;
                }
                i6 = i2 & 128;
                if (i6 != 0) {
                    i3 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    i3 |= startRestartGroup.changed(paddingValues) ? 8388608 : 4194304;
                }
                i7 = i2 & 256;
                if (i7 != 0) {
                    i3 |= 100663296;
                } else if ((i & 234881024) == 0) {
                    i8 = i7;
                    obj2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(obj2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    if ((i2 & 512) != 0) {
                        if ((i & 1879048192) == 0) {
                            i9 = startRestartGroup.changedInstance(content) ? 536870912 : 268435456;
                        }
                        if ((1533916891 & i3) == 306783378 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier.Companion companion = i16 != 0 ? Modifier.Companion : modifier;
                                if (i4 != 0) {
                                    z2 = true;
                                }
                                Shape shape7 = shape2;
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                    shape7 = ButtonDefaults.INSTANCE.getShape(startRestartGroup, 6);
                                }
                                if ((i2 & 16) != 0) {
                                    i10 = i6;
                                    i11 = i8;
                                    borderStroke2 = null;
                                    i3 &= -57345;
                                    obj = ButtonDefaults.INSTANCE.m1595buttonColorsro_MJ88(0L, 0L, 0L, 0L, startRestartGroup, 24576, 15);
                                    z3 = true;
                                } else {
                                    i10 = i6;
                                    z3 = true;
                                    i11 = i8;
                                    borderStroke2 = null;
                                }
                                if ((i2 & 32) != 0) {
                                    buttonElevation2 = ButtonDefaults.INSTANCE.m1596buttonElevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                                    i3 &= -458753;
                                }
                                BorderStroke borderStroke5 = i5 != 0 ? borderStroke2 : borderStroke;
                                PaddingValues contentPadding = i10 != 0 ? ButtonDefaults.INSTANCE.getContentPadding() : paddingValues;
                                if (i11 != 0) {
                                    startRestartGroup.startReplaceableGroup(-492369756);
                                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                    Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.Companion.getEmpty()) {
                                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                                } else {
                                    mutableInteractionSource2 = mutableInteractionSource;
                                }
                                borderStroke3 = borderStroke5;
                                shape3 = shape7;
                                buttonElevation3 = buttonElevation2;
                                paddingValues2 = contentPadding;
                                modifier2 = companion;
                                i12 = i3;
                                r4 = z3;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                borderStroke3 = borderStroke;
                                paddingValues2 = paddingValues;
                                mutableInteractionSource2 = mutableInteractionSource;
                                i12 = i3;
                                shape3 = shape2;
                                buttonElevation3 = buttonElevation2;
                                r4 = 1;
                                modifier2 = modifier;
                            }
                            ButtonColors buttonColors3 = obj;
                            boolean z5 = z2;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(650121315, i12, -1, "androidx.compose.material3.Button (Button.kt:104)");
                            }
                            int i17 = (i12 >> 6) & 14;
                            int i18 = i12 >> 9;
                            int i19 = (i18 & 112) | i17;
                            long m3301unboximpl = buttonColors3.containerColor$material3_release(z5, startRestartGroup, i19).getValue().m3301unboximpl();
                            long m3301unboximpl2 = buttonColors3.contentColor$material3_release(z5, startRestartGroup, i19).getValue().m3301unboximpl();
                            startRestartGroup.startReplaceableGroup(823569249);
                            ComposerKt.sourceInformation(startRestartGroup, "118@6038L43");
                            State<Dp> shadowElevation$material3_release = buttonElevation3 == null ? null : buttonElevation3.shadowElevation$material3_release(z5, mutableInteractionSource2, startRestartGroup, ((i12 >> 21) & 112) | i17 | (i18 & 896));
                            startRestartGroup.endReplaceableGroup();
                            float m5621unboximpl = shadowElevation$material3_release != null ? shadowElevation$material3_release.getValue().m5621unboximpl() : Dp.m5607constructorimpl(0);
                            startRestartGroup.startReplaceableGroup(823569344);
                            ComposerKt.sourceInformation(startRestartGroup, "119@6133L42");
                            State<Dp> state = buttonElevation3 == null ? null : buttonElevation3.tonalElevation$material3_release(z5, mutableInteractionSource2, startRestartGroup, i17 | ((i12 >> 21) & 112) | (i18 & 896));
                            startRestartGroup.endReplaceableGroup();
                            ButtonElevation buttonElevation5 = buttonElevation3;
                            Modifier modifier4 = modifier2;
                            composer2 = startRestartGroup;
                            SurfaceKt.m2070Surfaceo_FOJdg(onClick, SemanticsModifierKt.semantics$default(modifier2, false, ButtonKt$Button$2.INSTANCE, r4, null), z5, shape3, m3301unboximpl, m3301unboximpl2, state != null ? state.getValue().m5621unboximpl() : Dp.m5607constructorimpl(0), m5621unboximpl, borderStroke3, mutableInteractionSource2, ComposableLambdaKt.composableLambda(startRestartGroup, 956488494, r4, new ButtonKt$Button$3(m3301unboximpl2, paddingValues2, content, i12)), composer2, (i12 & 14) | (i12 & 896) | (i12 & 7168) | ((i12 << 6) & 234881024) | ((i12 << 3) & 1879048192), 6, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            shape4 = shape3;
                            borderStroke4 = borderStroke3;
                            paddingValues3 = paddingValues2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            z4 = z5;
                            modifier3 = modifier4;
                            buttonElevation4 = buttonElevation5;
                            buttonColors2 = buttonColors3;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            z4 = z2;
                            shape4 = shape2;
                            buttonColors2 = obj;
                            composer2 = startRestartGroup;
                            buttonElevation4 = buttonElevation2;
                            mutableInteractionSource3 = obj2;
                            borderStroke4 = borderStroke;
                            paddingValues3 = paddingValues;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new ButtonKt$Button$4(onClick, modifier3, z4, shape4, buttonColors2, buttonElevation4, borderStroke4, paddingValues3, mutableInteractionSource3, content, i, i2));
                        return;
                    }
                    i9 = C.ENCODING_PCM_32BIT;
                    i3 |= i9;
                    if ((1533916891 & i3) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    Shape shape72 = shape2;
                    if ((i2 & 8) != 0) {
                    }
                    if ((i2 & 16) != 0) {
                    }
                    if ((i2 & 32) != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    borderStroke3 = borderStroke5;
                    shape3 = shape72;
                    buttonElevation3 = buttonElevation2;
                    paddingValues2 = contentPadding;
                    modifier2 = companion;
                    i12 = i3;
                    r4 = z3;
                    ButtonColors buttonColors32 = obj;
                    boolean z52 = z2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i172 = (i12 >> 6) & 14;
                    int i182 = i12 >> 9;
                    int i192 = (i182 & 112) | i172;
                    long m3301unboximpl3 = buttonColors32.containerColor$material3_release(z52, startRestartGroup, i192).getValue().m3301unboximpl();
                    long m3301unboximpl22 = buttonColors32.contentColor$material3_release(z52, startRestartGroup, i192).getValue().m3301unboximpl();
                    startRestartGroup.startReplaceableGroup(823569249);
                    ComposerKt.sourceInformation(startRestartGroup, "118@6038L43");
                    if (buttonElevation3 == null) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    float m5621unboximpl2 = shadowElevation$material3_release != null ? shadowElevation$material3_release.getValue().m5621unboximpl() : Dp.m5607constructorimpl(0);
                    startRestartGroup.startReplaceableGroup(823569344);
                    ComposerKt.sourceInformation(startRestartGroup, "119@6133L42");
                    if (buttonElevation3 == null) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    ButtonElevation buttonElevation52 = buttonElevation3;
                    Modifier modifier42 = modifier2;
                    composer2 = startRestartGroup;
                    SurfaceKt.m2070Surfaceo_FOJdg(onClick, SemanticsModifierKt.semantics$default(modifier2, false, ButtonKt$Button$2.INSTANCE, r4, null), z52, shape3, m3301unboximpl3, m3301unboximpl22, state != null ? state.getValue().m5621unboximpl() : Dp.m5607constructorimpl(0), m5621unboximpl2, borderStroke3, mutableInteractionSource2, ComposableLambdaKt.composableLambda(startRestartGroup, 956488494, r4, new ButtonKt$Button$3(m3301unboximpl22, paddingValues2, content, i12)), composer2, (i12 & 14) | (i12 & 896) | (i12 & 7168) | ((i12 << 6) & 234881024) | ((i12 << 3) & 1879048192), 6, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    shape4 = shape3;
                    borderStroke4 = borderStroke3;
                    paddingValues3 = paddingValues2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z4 = z52;
                    modifier3 = modifier42;
                    buttonElevation4 = buttonElevation52;
                    buttonColors2 = buttonColors32;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i8 = i7;
                obj2 = mutableInteractionSource;
                if ((i2 & 512) != 0) {
                }
                i3 |= i9;
                if ((1533916891 & i3) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i16 != 0) {
                }
                if (i4 != 0) {
                }
                Shape shape722 = shape2;
                if ((i2 & 8) != 0) {
                }
                if ((i2 & 16) != 0) {
                }
                if ((i2 & 32) != 0) {
                }
                if (i5 != 0) {
                }
                if (i10 != 0) {
                }
                if (i11 != 0) {
                }
                borderStroke3 = borderStroke5;
                shape3 = shape722;
                buttonElevation3 = buttonElevation2;
                paddingValues2 = contentPadding;
                modifier2 = companion;
                i12 = i3;
                r4 = z3;
                ButtonColors buttonColors322 = obj;
                boolean z522 = z2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i1722 = (i12 >> 6) & 14;
                int i1822 = i12 >> 9;
                int i1922 = (i1822 & 112) | i1722;
                long m3301unboximpl32 = buttonColors322.containerColor$material3_release(z522, startRestartGroup, i1922).getValue().m3301unboximpl();
                long m3301unboximpl222 = buttonColors322.contentColor$material3_release(z522, startRestartGroup, i1922).getValue().m3301unboximpl();
                startRestartGroup.startReplaceableGroup(823569249);
                ComposerKt.sourceInformation(startRestartGroup, "118@6038L43");
                if (buttonElevation3 == null) {
                }
                startRestartGroup.endReplaceableGroup();
                float m5621unboximpl22 = shadowElevation$material3_release != null ? shadowElevation$material3_release.getValue().m5621unboximpl() : Dp.m5607constructorimpl(0);
                startRestartGroup.startReplaceableGroup(823569344);
                ComposerKt.sourceInformation(startRestartGroup, "119@6133L42");
                if (buttonElevation3 == null) {
                }
                startRestartGroup.endReplaceableGroup();
                ButtonElevation buttonElevation522 = buttonElevation3;
                Modifier modifier422 = modifier2;
                composer2 = startRestartGroup;
                SurfaceKt.m2070Surfaceo_FOJdg(onClick, SemanticsModifierKt.semantics$default(modifier2, false, ButtonKt$Button$2.INSTANCE, r4, null), z522, shape3, m3301unboximpl32, m3301unboximpl222, state != null ? state.getValue().m5621unboximpl() : Dp.m5607constructorimpl(0), m5621unboximpl22, borderStroke3, mutableInteractionSource2, ComposableLambdaKt.composableLambda(startRestartGroup, 956488494, r4, new ButtonKt$Button$3(m3301unboximpl222, paddingValues2, content, i12)), composer2, (i12 & 14) | (i12 & 896) | (i12 & 7168) | ((i12 << 6) & 234881024) | ((i12 << 3) & 1879048192), 6, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                shape4 = shape3;
                borderStroke4 = borderStroke3;
                paddingValues3 = paddingValues2;
                mutableInteractionSource3 = mutableInteractionSource2;
                z4 = z522;
                modifier3 = modifier422;
                buttonElevation4 = buttonElevation522;
                buttonColors2 = buttonColors322;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            if ((i & 7168) == 0) {
            }
            if ((57344 & i) == 0) {
            }
            if ((458752 & i) == 0) {
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            i6 = i2 & 128;
            if (i6 != 0) {
            }
            i7 = i2 & 256;
            if (i7 != 0) {
            }
            i8 = i7;
            obj2 = mutableInteractionSource;
            if ((i2 & 512) != 0) {
            }
            i3 |= i9;
            if ((1533916891 & i3) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i16 != 0) {
            }
            if (i4 != 0) {
            }
            Shape shape7222 = shape2;
            if ((i2 & 8) != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if (i5 != 0) {
            }
            if (i10 != 0) {
            }
            if (i11 != 0) {
            }
            borderStroke3 = borderStroke5;
            shape3 = shape7222;
            buttonElevation3 = buttonElevation2;
            paddingValues2 = contentPadding;
            modifier2 = companion;
            i12 = i3;
            r4 = z3;
            ButtonColors buttonColors3222 = obj;
            boolean z5222 = z2;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i17222 = (i12 >> 6) & 14;
            int i18222 = i12 >> 9;
            int i19222 = (i18222 & 112) | i17222;
            long m3301unboximpl322 = buttonColors3222.containerColor$material3_release(z5222, startRestartGroup, i19222).getValue().m3301unboximpl();
            long m3301unboximpl2222 = buttonColors3222.contentColor$material3_release(z5222, startRestartGroup, i19222).getValue().m3301unboximpl();
            startRestartGroup.startReplaceableGroup(823569249);
            ComposerKt.sourceInformation(startRestartGroup, "118@6038L43");
            if (buttonElevation3 == null) {
            }
            startRestartGroup.endReplaceableGroup();
            float m5621unboximpl222 = shadowElevation$material3_release != null ? shadowElevation$material3_release.getValue().m5621unboximpl() : Dp.m5607constructorimpl(0);
            startRestartGroup.startReplaceableGroup(823569344);
            ComposerKt.sourceInformation(startRestartGroup, "119@6133L42");
            if (buttonElevation3 == null) {
            }
            startRestartGroup.endReplaceableGroup();
            ButtonElevation buttonElevation5222 = buttonElevation3;
            Modifier modifier4222 = modifier2;
            composer2 = startRestartGroup;
            SurfaceKt.m2070Surfaceo_FOJdg(onClick, SemanticsModifierKt.semantics$default(modifier2, false, ButtonKt$Button$2.INSTANCE, r4, null), z5222, shape3, m3301unboximpl322, m3301unboximpl2222, state != null ? state.getValue().m5621unboximpl() : Dp.m5607constructorimpl(0), m5621unboximpl222, borderStroke3, mutableInteractionSource2, ComposableLambdaKt.composableLambda(startRestartGroup, 956488494, r4, new ButtonKt$Button$3(m3301unboximpl2222, paddingValues2, content, i12)), composer2, (i12 & 14) | (i12 & 896) | (i12 & 7168) | ((i12 << 6) & 234881024) | ((i12 << 3) & 1879048192), 6, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            shape4 = shape3;
            borderStroke4 = borderStroke3;
            paddingValues3 = paddingValues2;
            mutableInteractionSource3 = mutableInteractionSource2;
            z4 = z5222;
            modifier3 = modifier4222;
            buttonElevation4 = buttonElevation5222;
            buttonColors2 = buttonColors3222;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 7168) == 0) {
        }
        if ((57344 & i) == 0) {
        }
        if ((458752 & i) == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        i6 = i2 & 128;
        if (i6 != 0) {
        }
        i7 = i2 & 256;
        if (i7 != 0) {
        }
        i8 = i7;
        obj2 = mutableInteractionSource;
        if ((i2 & 512) != 0) {
        }
        i3 |= i9;
        if ((1533916891 & i3) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i16 != 0) {
        }
        if (i4 != 0) {
        }
        Shape shape72222 = shape2;
        if ((i2 & 8) != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if (i5 != 0) {
        }
        if (i10 != 0) {
        }
        if (i11 != 0) {
        }
        borderStroke3 = borderStroke5;
        shape3 = shape72222;
        buttonElevation3 = buttonElevation2;
        paddingValues2 = contentPadding;
        modifier2 = companion;
        i12 = i3;
        r4 = z3;
        ButtonColors buttonColors32222 = obj;
        boolean z52222 = z2;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i172222 = (i12 >> 6) & 14;
        int i182222 = i12 >> 9;
        int i192222 = (i182222 & 112) | i172222;
        long m3301unboximpl3222 = buttonColors32222.containerColor$material3_release(z52222, startRestartGroup, i192222).getValue().m3301unboximpl();
        long m3301unboximpl22222 = buttonColors32222.contentColor$material3_release(z52222, startRestartGroup, i192222).getValue().m3301unboximpl();
        startRestartGroup.startReplaceableGroup(823569249);
        ComposerKt.sourceInformation(startRestartGroup, "118@6038L43");
        if (buttonElevation3 == null) {
        }
        startRestartGroup.endReplaceableGroup();
        float m5621unboximpl2222 = shadowElevation$material3_release != null ? shadowElevation$material3_release.getValue().m5621unboximpl() : Dp.m5607constructorimpl(0);
        startRestartGroup.startReplaceableGroup(823569344);
        ComposerKt.sourceInformation(startRestartGroup, "119@6133L42");
        if (buttonElevation3 == null) {
        }
        startRestartGroup.endReplaceableGroup();
        ButtonElevation buttonElevation52222 = buttonElevation3;
        Modifier modifier42222 = modifier2;
        composer2 = startRestartGroup;
        SurfaceKt.m2070Surfaceo_FOJdg(onClick, SemanticsModifierKt.semantics$default(modifier2, false, ButtonKt$Button$2.INSTANCE, r4, null), z52222, shape3, m3301unboximpl3222, m3301unboximpl22222, state != null ? state.getValue().m5621unboximpl() : Dp.m5607constructorimpl(0), m5621unboximpl2222, borderStroke3, mutableInteractionSource2, ComposableLambdaKt.composableLambda(startRestartGroup, 956488494, r4, new ButtonKt$Button$3(m3301unboximpl22222, paddingValues2, content, i12)), composer2, (i12 & 14) | (i12 & 896) | (i12 & 7168) | ((i12 << 6) & 234881024) | ((i12 << 3) & 1879048192), 6, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        shape4 = shape3;
        borderStroke4 = borderStroke3;
        paddingValues3 = paddingValues2;
        mutableInteractionSource3 = mutableInteractionSource2;
        z4 = z52222;
        modifier3 = modifier42222;
        buttonElevation4 = buttonElevation52222;
        buttonColors2 = buttonColors32222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ElevatedButton(Function0<Unit> onClick, Modifier modifier, boolean z, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        int i4;
        boolean z2;
        Object obj;
        Object obj2;
        Object obj3;
        int i5;
        int i6;
        int i7;
        int i8;
        Object obj4;
        int i9;
        boolean z3;
        Shape shape2;
        int i10;
        ButtonColors buttonColors2;
        int i11;
        MutableInteractionSource mutableInteractionSource2;
        BorderStroke borderStroke2;
        PaddingValues paddingValues2;
        Object obj5;
        Object obj6;
        Modifier modifier2;
        Composer composer2;
        Modifier modifier3;
        ButtonColors buttonColors3;
        ButtonElevation buttonElevation2;
        BorderStroke borderStroke3;
        PaddingValues paddingValues3;
        boolean z4;
        Shape shape3;
        ScopeUpdateScope endRestartGroup;
        int i12;
        int i13;
        int i14;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1466887385);
        ComposerKt.sourceInformation(startRestartGroup, "C(ElevatedButton)P(8,7,5,9,1,4!1,3,6)199@10107L13,200@10164L22,201@10237L25,204@10415L39,207@10509L314:Button.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changedInstance(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i15 = i2 & 2;
        if (i15 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                if ((i & 7168) == 0) {
                    if ((i2 & 8) == 0) {
                        obj = shape;
                        if (startRestartGroup.changed(obj)) {
                            i14 = 2048;
                            i3 |= i14;
                        }
                    } else {
                        obj = shape;
                    }
                    i14 = 1024;
                    i3 |= i14;
                } else {
                    obj = shape;
                }
                if ((i & 57344) == 0) {
                    if ((i2 & 16) == 0) {
                        obj2 = buttonColors;
                        if (startRestartGroup.changed(obj2)) {
                            i13 = 16384;
                            i3 |= i13;
                        }
                    } else {
                        obj2 = buttonColors;
                    }
                    i13 = 8192;
                    i3 |= i13;
                } else {
                    obj2 = buttonColors;
                }
                if ((i & 458752) == 0) {
                    if ((i2 & 32) == 0) {
                        obj3 = buttonElevation;
                        if (startRestartGroup.changed(obj3)) {
                            i12 = 131072;
                            i3 |= i12;
                        }
                    } else {
                        obj3 = buttonElevation;
                    }
                    i12 = 65536;
                    i3 |= i12;
                } else {
                    obj3 = buttonElevation;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    i3 |= startRestartGroup.changed(borderStroke) ? 1048576 : 524288;
                    i6 = i2 & 128;
                    if (i6 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 29360128) == 0) {
                        i3 |= startRestartGroup.changed(paddingValues) ? 8388608 : 4194304;
                    }
                    i7 = i2 & 256;
                    if (i7 == 0) {
                        i3 |= 100663296;
                        i8 = i7;
                        obj4 = mutableInteractionSource;
                    } else {
                        i8 = i7;
                        obj4 = mutableInteractionSource;
                        if ((i & 234881024) == 0) {
                            i3 |= startRestartGroup.changed(obj4) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                    }
                    if ((i2 & 512) != 0) {
                        if ((i & 1879048192) == 0) {
                            i9 = startRestartGroup.changedInstance(content) ? 536870912 : 268435456;
                        }
                        if ((1533916891 & i3) == 306783378 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier.Companion companion = i15 != 0 ? Modifier.Companion : modifier;
                                z3 = i4 != 0 ? true : z2;
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                    shape2 = ButtonDefaults.INSTANCE.getElevatedShape(startRestartGroup, 6);
                                } else {
                                    shape2 = obj;
                                }
                                if ((i2 & 16) != 0) {
                                    i10 = i3 & (-57345);
                                    buttonColors2 = ButtonDefaults.INSTANCE.m1597elevatedButtonColorsro_MJ88(0L, 0L, 0L, 0L, startRestartGroup, 24576, 15);
                                } else {
                                    i10 = i3;
                                    buttonColors2 = obj2;
                                }
                                if ((i2 & 32) != 0) {
                                    i11 = i8;
                                    obj3 = ButtonDefaults.INSTANCE.m1598elevatedButtonElevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                                    i3 = i10 & (-458753);
                                } else {
                                    i11 = i8;
                                    i3 = i10;
                                }
                                BorderStroke borderStroke4 = i5 != 0 ? null : borderStroke;
                                PaddingValues contentPadding = i6 != 0 ? ButtonDefaults.INSTANCE.getContentPadding() : paddingValues;
                                if (i11 != 0) {
                                    startRestartGroup.startReplaceableGroup(-492369756);
                                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                    Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.Companion.getEmpty()) {
                                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    borderStroke2 = borderStroke4;
                                    paddingValues2 = contentPadding;
                                    mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                                } else {
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    borderStroke2 = borderStroke4;
                                    paddingValues2 = contentPadding;
                                }
                                obj5 = obj3;
                                obj6 = buttonColors2;
                                modifier2 = companion;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                modifier2 = modifier;
                                borderStroke2 = borderStroke;
                                paddingValues2 = paddingValues;
                                z3 = z2;
                                shape2 = obj;
                                obj6 = obj2;
                                obj5 = obj3;
                                mutableInteractionSource2 = obj4;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1466887385, i3, -1, "androidx.compose.material3.ElevatedButton (Button.kt:195)");
                            }
                            composer2 = startRestartGroup;
                            Button(onClick, modifier2, z3, shape2, obj6, obj5, borderStroke2, paddingValues2, mutableInteractionSource2, content, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752) | (i3 & 3670016) | (i3 & 29360128) | (i3 & 234881024) | (i3 & 1879048192), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier2;
                            buttonColors3 = obj6;
                            buttonElevation2 = obj5;
                            borderStroke3 = borderStroke2;
                            paddingValues3 = paddingValues2;
                            obj4 = mutableInteractionSource2;
                            z4 = z3;
                            shape3 = shape2;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            z4 = z2;
                            shape3 = obj;
                            buttonColors3 = obj2;
                            buttonElevation2 = obj3;
                            composer2 = startRestartGroup;
                            borderStroke3 = borderStroke;
                            paddingValues3 = paddingValues;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new ButtonKt$ElevatedButton$2(onClick, modifier3, z4, shape3, buttonColors3, buttonElevation2, borderStroke3, paddingValues3, obj4, content, i, i2));
                        return;
                    }
                    i9 = C.ENCODING_PCM_32BIT;
                    i3 |= i9;
                    if ((1533916891 & i3) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if ((i2 & 8) != 0) {
                    }
                    if ((i2 & 16) != 0) {
                    }
                    if ((i2 & 32) != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    obj5 = obj3;
                    obj6 = buttonColors2;
                    modifier2 = companion;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composer2 = startRestartGroup;
                    Button(onClick, modifier2, z3, shape2, obj6, obj5, borderStroke2, paddingValues2, mutableInteractionSource2, content, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752) | (i3 & 3670016) | (i3 & 29360128) | (i3 & 234881024) | (i3 & 1879048192), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier2;
                    buttonColors3 = obj6;
                    buttonElevation2 = obj5;
                    borderStroke3 = borderStroke2;
                    paddingValues3 = paddingValues2;
                    obj4 = mutableInteractionSource2;
                    z4 = z3;
                    shape3 = shape2;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i6 = i2 & 128;
                if (i6 == 0) {
                }
                i7 = i2 & 256;
                if (i7 == 0) {
                }
                if ((i2 & 512) != 0) {
                }
                i3 |= i9;
                if ((1533916891 & i3) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i15 != 0) {
                }
                if (i4 != 0) {
                }
                if ((i2 & 8) != 0) {
                }
                if ((i2 & 16) != 0) {
                }
                if ((i2 & 32) != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (i11 != 0) {
                }
                obj5 = obj3;
                obj6 = buttonColors2;
                modifier2 = companion;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                composer2 = startRestartGroup;
                Button(onClick, modifier2, z3, shape2, obj6, obj5, borderStroke2, paddingValues2, mutableInteractionSource2, content, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752) | (i3 & 3670016) | (i3 & 29360128) | (i3 & 234881024) | (i3 & 1879048192), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier2;
                buttonColors3 = obj6;
                buttonElevation2 = obj5;
                borderStroke3 = borderStroke2;
                paddingValues3 = paddingValues2;
                obj4 = mutableInteractionSource2;
                z4 = z3;
                shape3 = shape2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            if ((i & 7168) == 0) {
            }
            if ((i & 57344) == 0) {
            }
            if ((i & 458752) == 0) {
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            i6 = i2 & 128;
            if (i6 == 0) {
            }
            i7 = i2 & 256;
            if (i7 == 0) {
            }
            if ((i2 & 512) != 0) {
            }
            i3 |= i9;
            if ((1533916891 & i3) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i15 != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 8) != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i11 != 0) {
            }
            obj5 = obj3;
            obj6 = buttonColors2;
            modifier2 = companion;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            composer2 = startRestartGroup;
            Button(onClick, modifier2, z3, shape2, obj6, obj5, borderStroke2, paddingValues2, mutableInteractionSource2, content, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752) | (i3 & 3670016) | (i3 & 29360128) | (i3 & 234881024) | (i3 & 1879048192), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier2;
            buttonColors3 = obj6;
            buttonElevation2 = obj5;
            borderStroke3 = borderStroke2;
            paddingValues3 = paddingValues2;
            obj4 = mutableInteractionSource2;
            z4 = z3;
            shape3 = shape2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 7168) == 0) {
        }
        if ((i & 57344) == 0) {
        }
        if ((i & 458752) == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        i6 = i2 & 128;
        if (i6 == 0) {
        }
        i7 = i2 & 256;
        if (i7 == 0) {
        }
        if ((i2 & 512) != 0) {
        }
        i3 |= i9;
        if ((1533916891 & i3) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i15 != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i11 != 0) {
        }
        obj5 = obj3;
        obj6 = buttonColors2;
        modifier2 = companion;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        composer2 = startRestartGroup;
        Button(onClick, modifier2, z3, shape2, obj6, obj5, borderStroke2, paddingValues2, mutableInteractionSource2, content, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752) | (i3 & 3670016) | (i3 & 29360128) | (i3 & 234881024) | (i3 & 1879048192), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier2;
        buttonColors3 = obj6;
        buttonElevation2 = obj5;
        borderStroke3 = borderStroke2;
        paddingValues3 = paddingValues2;
        obj4 = mutableInteractionSource2;
        z4 = z3;
        shape3 = shape2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FilledTonalButton(Function0<Unit> onClick, Modifier modifier, boolean z, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        int i4;
        boolean z2;
        Object obj;
        Object obj2;
        Object obj3;
        int i5;
        int i6;
        int i7;
        int i8;
        Object obj4;
        int i9;
        boolean z3;
        Shape shape2;
        int i10;
        ButtonColors buttonColors2;
        int i11;
        MutableInteractionSource mutableInteractionSource2;
        BorderStroke borderStroke2;
        PaddingValues paddingValues2;
        Object obj5;
        Object obj6;
        Modifier modifier2;
        Composer composer2;
        Modifier modifier3;
        ButtonColors buttonColors3;
        ButtonElevation buttonElevation2;
        BorderStroke borderStroke3;
        PaddingValues paddingValues3;
        boolean z4;
        Shape shape3;
        ScopeUpdateScope endRestartGroup;
        int i12;
        int i13;
        int i14;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1717924381);
        ComposerKt.sourceInformation(startRestartGroup, "C(FilledTonalButton)P(8,7,5,9,1,4!1,3,6)269@13745L16,270@13805L25,271@13881L28,274@14062L39,277@14156L314:Button.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changedInstance(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i15 = i2 & 2;
        if (i15 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                if ((i & 7168) == 0) {
                    if ((i2 & 8) == 0) {
                        obj = shape;
                        if (startRestartGroup.changed(obj)) {
                            i14 = 2048;
                            i3 |= i14;
                        }
                    } else {
                        obj = shape;
                    }
                    i14 = 1024;
                    i3 |= i14;
                } else {
                    obj = shape;
                }
                if ((i & 57344) == 0) {
                    if ((i2 & 16) == 0) {
                        obj2 = buttonColors;
                        if (startRestartGroup.changed(obj2)) {
                            i13 = 16384;
                            i3 |= i13;
                        }
                    } else {
                        obj2 = buttonColors;
                    }
                    i13 = 8192;
                    i3 |= i13;
                } else {
                    obj2 = buttonColors;
                }
                if ((i & 458752) == 0) {
                    if ((i2 & 32) == 0) {
                        obj3 = buttonElevation;
                        if (startRestartGroup.changed(obj3)) {
                            i12 = 131072;
                            i3 |= i12;
                        }
                    } else {
                        obj3 = buttonElevation;
                    }
                    i12 = 65536;
                    i3 |= i12;
                } else {
                    obj3 = buttonElevation;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    i3 |= startRestartGroup.changed(borderStroke) ? 1048576 : 524288;
                    i6 = i2 & 128;
                    if (i6 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 29360128) == 0) {
                        i3 |= startRestartGroup.changed(paddingValues) ? 8388608 : 4194304;
                    }
                    i7 = i2 & 256;
                    if (i7 == 0) {
                        i3 |= 100663296;
                        i8 = i7;
                        obj4 = mutableInteractionSource;
                    } else {
                        i8 = i7;
                        obj4 = mutableInteractionSource;
                        if ((i & 234881024) == 0) {
                            i3 |= startRestartGroup.changed(obj4) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                    }
                    if ((i2 & 512) != 0) {
                        if ((i & 1879048192) == 0) {
                            i9 = startRestartGroup.changedInstance(content) ? 536870912 : 268435456;
                        }
                        if ((1533916891 & i3) == 306783378 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier.Companion companion = i15 != 0 ? Modifier.Companion : modifier;
                                z3 = i4 != 0 ? true : z2;
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                    shape2 = ButtonDefaults.INSTANCE.getFilledTonalShape(startRestartGroup, 6);
                                } else {
                                    shape2 = obj;
                                }
                                if ((i2 & 16) != 0) {
                                    i10 = i3 & (-57345);
                                    buttonColors2 = ButtonDefaults.INSTANCE.m1599filledTonalButtonColorsro_MJ88(0L, 0L, 0L, 0L, startRestartGroup, 24576, 15);
                                } else {
                                    i10 = i3;
                                    buttonColors2 = obj2;
                                }
                                if ((i2 & 32) != 0) {
                                    i11 = i8;
                                    obj3 = ButtonDefaults.INSTANCE.m1600filledTonalButtonElevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                                    i3 = i10 & (-458753);
                                } else {
                                    i11 = i8;
                                    i3 = i10;
                                }
                                BorderStroke borderStroke4 = i5 != 0 ? null : borderStroke;
                                PaddingValues contentPadding = i6 != 0 ? ButtonDefaults.INSTANCE.getContentPadding() : paddingValues;
                                if (i11 != 0) {
                                    startRestartGroup.startReplaceableGroup(-492369756);
                                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                    Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.Companion.getEmpty()) {
                                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    borderStroke2 = borderStroke4;
                                    paddingValues2 = contentPadding;
                                    mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                                } else {
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    borderStroke2 = borderStroke4;
                                    paddingValues2 = contentPadding;
                                }
                                obj5 = obj3;
                                obj6 = buttonColors2;
                                modifier2 = companion;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                modifier2 = modifier;
                                borderStroke2 = borderStroke;
                                paddingValues2 = paddingValues;
                                z3 = z2;
                                shape2 = obj;
                                obj6 = obj2;
                                obj5 = obj3;
                                mutableInteractionSource2 = obj4;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1717924381, i3, -1, "androidx.compose.material3.FilledTonalButton (Button.kt:265)");
                            }
                            composer2 = startRestartGroup;
                            Button(onClick, modifier2, z3, shape2, obj6, obj5, borderStroke2, paddingValues2, mutableInteractionSource2, content, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752) | (i3 & 3670016) | (i3 & 29360128) | (i3 & 234881024) | (i3 & 1879048192), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier2;
                            buttonColors3 = obj6;
                            buttonElevation2 = obj5;
                            borderStroke3 = borderStroke2;
                            paddingValues3 = paddingValues2;
                            obj4 = mutableInteractionSource2;
                            z4 = z3;
                            shape3 = shape2;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            z4 = z2;
                            shape3 = obj;
                            buttonColors3 = obj2;
                            buttonElevation2 = obj3;
                            composer2 = startRestartGroup;
                            borderStroke3 = borderStroke;
                            paddingValues3 = paddingValues;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new ButtonKt$FilledTonalButton$2(onClick, modifier3, z4, shape3, buttonColors3, buttonElevation2, borderStroke3, paddingValues3, obj4, content, i, i2));
                        return;
                    }
                    i9 = C.ENCODING_PCM_32BIT;
                    i3 |= i9;
                    if ((1533916891 & i3) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if ((i2 & 8) != 0) {
                    }
                    if ((i2 & 16) != 0) {
                    }
                    if ((i2 & 32) != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    obj5 = obj3;
                    obj6 = buttonColors2;
                    modifier2 = companion;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composer2 = startRestartGroup;
                    Button(onClick, modifier2, z3, shape2, obj6, obj5, borderStroke2, paddingValues2, mutableInteractionSource2, content, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752) | (i3 & 3670016) | (i3 & 29360128) | (i3 & 234881024) | (i3 & 1879048192), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier2;
                    buttonColors3 = obj6;
                    buttonElevation2 = obj5;
                    borderStroke3 = borderStroke2;
                    paddingValues3 = paddingValues2;
                    obj4 = mutableInteractionSource2;
                    z4 = z3;
                    shape3 = shape2;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i6 = i2 & 128;
                if (i6 == 0) {
                }
                i7 = i2 & 256;
                if (i7 == 0) {
                }
                if ((i2 & 512) != 0) {
                }
                i3 |= i9;
                if ((1533916891 & i3) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i15 != 0) {
                }
                if (i4 != 0) {
                }
                if ((i2 & 8) != 0) {
                }
                if ((i2 & 16) != 0) {
                }
                if ((i2 & 32) != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (i11 != 0) {
                }
                obj5 = obj3;
                obj6 = buttonColors2;
                modifier2 = companion;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                composer2 = startRestartGroup;
                Button(onClick, modifier2, z3, shape2, obj6, obj5, borderStroke2, paddingValues2, mutableInteractionSource2, content, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752) | (i3 & 3670016) | (i3 & 29360128) | (i3 & 234881024) | (i3 & 1879048192), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier2;
                buttonColors3 = obj6;
                buttonElevation2 = obj5;
                borderStroke3 = borderStroke2;
                paddingValues3 = paddingValues2;
                obj4 = mutableInteractionSource2;
                z4 = z3;
                shape3 = shape2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            if ((i & 7168) == 0) {
            }
            if ((i & 57344) == 0) {
            }
            if ((i & 458752) == 0) {
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            i6 = i2 & 128;
            if (i6 == 0) {
            }
            i7 = i2 & 256;
            if (i7 == 0) {
            }
            if ((i2 & 512) != 0) {
            }
            i3 |= i9;
            if ((1533916891 & i3) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i15 != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 8) != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i11 != 0) {
            }
            obj5 = obj3;
            obj6 = buttonColors2;
            modifier2 = companion;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            composer2 = startRestartGroup;
            Button(onClick, modifier2, z3, shape2, obj6, obj5, borderStroke2, paddingValues2, mutableInteractionSource2, content, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752) | (i3 & 3670016) | (i3 & 29360128) | (i3 & 234881024) | (i3 & 1879048192), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier2;
            buttonColors3 = obj6;
            buttonElevation2 = obj5;
            borderStroke3 = borderStroke2;
            paddingValues3 = paddingValues2;
            obj4 = mutableInteractionSource2;
            z4 = z3;
            shape3 = shape2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 7168) == 0) {
        }
        if ((i & 57344) == 0) {
        }
        if ((i & 458752) == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        i6 = i2 & 128;
        if (i6 == 0) {
        }
        i7 = i2 & 256;
        if (i7 == 0) {
        }
        if ((i2 & 512) != 0) {
        }
        i3 |= i9;
        if ((1533916891 & i3) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i15 != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i11 != 0) {
        }
        obj5 = obj3;
        obj6 = buttonColors2;
        modifier2 = companion;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        composer2 = startRestartGroup;
        Button(onClick, modifier2, z3, shape2, obj6, obj5, borderStroke2, paddingValues2, mutableInteractionSource2, content, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752) | (i3 & 3670016) | (i3 & 29360128) | (i3 & 234881024) | (i3 & 1879048192), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier2;
        buttonColors3 = obj6;
        buttonElevation2 = obj5;
        borderStroke3 = borderStroke2;
        paddingValues3 = paddingValues2;
        obj4 = mutableInteractionSource2;
        z4 = z3;
        shape3 = shape2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OutlinedButton(Function0<Unit> onClick, Modifier modifier, boolean z, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        int i4;
        ButtonColors buttonColors2;
        int i5;
        Object obj;
        BorderStroke borderStroke2;
        int i6;
        int i7;
        int i8;
        Shape shape2;
        BorderStroke borderStroke3;
        MutableInteractionSource mutableInteractionSource2;
        PaddingValues paddingValues2;
        Modifier modifier2;
        boolean z2;
        Shape shape3;
        BorderStroke borderStroke4;
        Object obj2;
        Object obj3;
        Composer composer2;
        Modifier modifier3;
        boolean z3;
        Shape shape4;
        ButtonColors buttonColors3;
        ButtonElevation buttonElevation2;
        PaddingValues paddingValues3;
        MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        int i9;
        int i10;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1694808287);
        ComposerKt.sourceInformation(startRestartGroup, "C(OutlinedButton)P(8,7,5,9,1,4!1,3,6)338@17289L13,339@17346L22,341@17453L20,343@17592L39,346@17686L314:Button.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changedInstance(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                i3 |= startRestartGroup.changed(z) ? 256 : 128;
                if ((i & 7168) == 0) {
                    if ((i2 & 8) == 0 && startRestartGroup.changed(shape)) {
                        i10 = 2048;
                        i3 |= i10;
                    }
                    i10 = 1024;
                    i3 |= i10;
                }
                if ((i & 57344) == 0) {
                    if ((i2 & 16) == 0) {
                        buttonColors2 = buttonColors;
                        if (startRestartGroup.changed(buttonColors2)) {
                            i9 = 16384;
                            i3 |= i9;
                        }
                    } else {
                        buttonColors2 = buttonColors;
                    }
                    i9 = 8192;
                    i3 |= i9;
                } else {
                    buttonColors2 = buttonColors;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    obj = buttonElevation;
                } else {
                    obj = buttonElevation;
                    if ((i & 458752) == 0) {
                        i3 |= startRestartGroup.changed(obj) ? 131072 : 65536;
                    }
                }
                if ((i & 3670016) == 0) {
                    borderStroke2 = borderStroke;
                    i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(borderStroke2)) ? 1048576 : 524288;
                } else {
                    borderStroke2 = borderStroke;
                }
                i6 = i2 & 128;
                if (i6 != 0) {
                    i3 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    i3 |= startRestartGroup.changed(paddingValues) ? 8388608 : 4194304;
                }
                i7 = i2 & 256;
                if (i7 != 0) {
                    i3 |= 100663296;
                } else if ((i & 234881024) == 0) {
                    i3 |= startRestartGroup.changed(mutableInteractionSource) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                if ((i2 & 512) == 0) {
                    if ((i & 1879048192) == 0) {
                        i8 = startRestartGroup.changedInstance(content) ? 536870912 : 268435456;
                    }
                    if ((1533916891 & i3) == 306783378 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i11 == 0 ? Modifier.Companion : modifier;
                            boolean z4 = i4 == 0 ? true : z;
                            if ((i2 & 8) == 0) {
                                shape2 = ButtonDefaults.INSTANCE.getOutlinedShape(startRestartGroup, 6);
                                i3 &= -7169;
                            } else {
                                shape2 = shape;
                            }
                            if ((i2 & 16) != 0) {
                                buttonColors2 = ButtonDefaults.INSTANCE.m1605outlinedButtonColorsro_MJ88(0L, 0L, 0L, 0L, startRestartGroup, 24576, 15);
                                i3 &= -57345;
                            }
                            Object obj4 = i5 == 0 ? null : obj;
                            if ((i2 & 64) == 0) {
                                borderStroke3 = ButtonDefaults.INSTANCE.getOutlinedButtonBorder(startRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                borderStroke3 = borderStroke2;
                            }
                            PaddingValues contentPadding = i6 == 0 ? ButtonDefaults.INSTANCE.getContentPadding() : paddingValues;
                            if (i7 == 0) {
                                startRestartGroup.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.Companion.getEmpty()) {
                                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceableGroup();
                                paddingValues2 = contentPadding;
                                modifier2 = companion;
                                mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                                paddingValues2 = contentPadding;
                                modifier2 = companion;
                            }
                            z2 = z4;
                            shape3 = shape2;
                            borderStroke4 = borderStroke3;
                            obj2 = buttonColors2;
                            obj3 = obj4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                            modifier2 = modifier;
                            z2 = z;
                            shape3 = shape;
                            paddingValues2 = paddingValues;
                            mutableInteractionSource2 = mutableInteractionSource;
                            borderStroke4 = borderStroke2;
                            obj2 = buttonColors2;
                            obj3 = obj;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1694808287, i3, -1, "androidx.compose.material3.OutlinedButton (Button.kt:334)");
                        }
                        composer2 = startRestartGroup;
                        Button(onClick, modifier2, z2, shape3, obj2, obj3, borderStroke4, paddingValues2, mutableInteractionSource2, content, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (i3 & 3670016) | (i3 & 29360128) | (i3 & 234881024) | (i3 & 1879048192), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        z3 = z2;
                        shape4 = shape3;
                        buttonColors3 = obj2;
                        buttonElevation2 = obj3;
                        borderStroke2 = borderStroke4;
                        paddingValues3 = paddingValues2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        z3 = z;
                        shape4 = shape;
                        mutableInteractionSource3 = mutableInteractionSource;
                        buttonColors3 = buttonColors2;
                        buttonElevation2 = obj;
                        composer2 = startRestartGroup;
                        paddingValues3 = paddingValues;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new ButtonKt$OutlinedButton$2(onClick, modifier3, z3, shape4, buttonColors3, buttonElevation2, borderStroke2, paddingValues3, mutableInteractionSource3, content, i, i2));
                    return;
                }
                i8 = C.ENCODING_PCM_32BIT;
                i3 |= i8;
                if ((1533916891 & i3) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i11 == 0) {
                }
                if (i4 == 0) {
                }
                if ((i2 & 8) == 0) {
                }
                if ((i2 & 16) != 0) {
                }
                if (i5 == 0) {
                }
                if ((i2 & 64) == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                z2 = z4;
                shape3 = shape2;
                borderStroke4 = borderStroke3;
                obj2 = buttonColors2;
                obj3 = obj4;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                composer2 = startRestartGroup;
                Button(onClick, modifier2, z2, shape3, obj2, obj3, borderStroke4, paddingValues2, mutableInteractionSource2, content, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (i3 & 3670016) | (i3 & 29360128) | (i3 & 234881024) | (i3 & 1879048192), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier2;
                z3 = z2;
                shape4 = shape3;
                buttonColors3 = obj2;
                buttonElevation2 = obj3;
                borderStroke2 = borderStroke4;
                paddingValues3 = paddingValues2;
                mutableInteractionSource3 = mutableInteractionSource2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            if ((i & 7168) == 0) {
            }
            if ((i & 57344) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            if ((i & 3670016) == 0) {
            }
            i6 = i2 & 128;
            if (i6 != 0) {
            }
            i7 = i2 & 256;
            if (i7 != 0) {
            }
            if ((i2 & 512) == 0) {
            }
            i3 |= i8;
            if ((1533916891 & i3) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i11 == 0) {
            }
            if (i4 == 0) {
            }
            if ((i2 & 8) == 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if (i5 == 0) {
            }
            if ((i2 & 64) == 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            z2 = z4;
            shape3 = shape2;
            borderStroke4 = borderStroke3;
            obj2 = buttonColors2;
            obj3 = obj4;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            composer2 = startRestartGroup;
            Button(onClick, modifier2, z2, shape3, obj2, obj3, borderStroke4, paddingValues2, mutableInteractionSource2, content, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (i3 & 3670016) | (i3 & 29360128) | (i3 & 234881024) | (i3 & 1879048192), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier2;
            z3 = z2;
            shape4 = shape3;
            buttonColors3 = obj2;
            buttonElevation2 = obj3;
            borderStroke2 = borderStroke4;
            paddingValues3 = paddingValues2;
            mutableInteractionSource3 = mutableInteractionSource2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        if ((i & 7168) == 0) {
        }
        if ((i & 57344) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        if ((i & 3670016) == 0) {
        }
        i6 = i2 & 128;
        if (i6 != 0) {
        }
        i7 = i2 & 256;
        if (i7 != 0) {
        }
        if ((i2 & 512) == 0) {
        }
        i3 |= i8;
        if ((1533916891 & i3) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i11 == 0) {
        }
        if (i4 == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if (i5 == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        z2 = z4;
        shape3 = shape2;
        borderStroke4 = borderStroke3;
        obj2 = buttonColors2;
        obj3 = obj4;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        composer2 = startRestartGroup;
        Button(onClick, modifier2, z2, shape3, obj2, obj3, borderStroke4, paddingValues2, mutableInteractionSource2, content, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (i3 & 3670016) | (i3 & 29360128) | (i3 & 234881024) | (i3 & 1879048192), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier2;
        z3 = z2;
        shape4 = shape3;
        buttonColors3 = obj2;
        buttonElevation2 = obj3;
        borderStroke2 = borderStroke4;
        paddingValues3 = paddingValues2;
        mutableInteractionSource3 = mutableInteractionSource2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:166:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TextButton(Function0<Unit> onClick, Modifier modifier, boolean z, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        int i4;
        Object obj;
        int i5;
        Object obj2;
        int i6;
        Object obj3;
        int i7;
        int i8;
        int i9;
        Shape shape2;
        ButtonColors buttonColors2;
        MutableInteractionSource mutableInteractionSource2;
        PaddingValues paddingValues2;
        Modifier modifier2;
        boolean z2;
        Shape shape3;
        Object obj4;
        BorderStroke borderStroke2;
        Object obj5;
        Composer composer2;
        Modifier modifier3;
        boolean z3;
        Shape shape4;
        ButtonColors buttonColors3;
        ButtonElevation buttonElevation2;
        PaddingValues paddingValues3;
        MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-2106428362);
        ComposerKt.sourceInformation(startRestartGroup, "C(TextButton)P(8,7,5,9,1,4!1,3,6)409@20955L9,410@21008L18,414@21229L39,417@21323L314:Button.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changedInstance(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                i3 |= startRestartGroup.changed(z) ? 256 : 128;
                if ((i & 7168) == 0) {
                    if ((i2 & 8) == 0 && startRestartGroup.changed(shape)) {
                        i11 = 2048;
                        i3 |= i11;
                    }
                    i11 = 1024;
                    i3 |= i11;
                }
                if ((i & 57344) == 0) {
                    if ((i2 & 16) == 0) {
                        obj = buttonColors;
                        if (startRestartGroup.changed(obj)) {
                            i10 = 16384;
                            i3 |= i10;
                        }
                    } else {
                        obj = buttonColors;
                    }
                    i10 = 8192;
                    i3 |= i10;
                } else {
                    obj = buttonColors;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    obj2 = buttonElevation;
                } else {
                    obj2 = buttonElevation;
                    if ((i & 458752) == 0) {
                        i3 |= startRestartGroup.changed(obj2) ? 131072 : 65536;
                    }
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    i3 |= 1572864;
                    obj3 = borderStroke;
                } else {
                    obj3 = borderStroke;
                    if ((i & 3670016) == 0) {
                        i3 |= startRestartGroup.changed(obj3) ? 1048576 : 524288;
                    }
                }
                i7 = i2 & 128;
                if (i7 != 0) {
                    i3 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    i3 |= startRestartGroup.changed(paddingValues) ? 8388608 : 4194304;
                }
                i8 = i2 & 256;
                if (i8 != 0) {
                    i3 |= 100663296;
                } else if ((i & 234881024) == 0) {
                    i3 |= startRestartGroup.changed(mutableInteractionSource) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                if ((i2 & 512) == 0) {
                    if ((i & 1879048192) == 0) {
                        i9 = startRestartGroup.changedInstance(content) ? 536870912 : 268435456;
                    }
                    if ((1533916891 & i3) == 306783378 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i12 == 0 ? Modifier.Companion : modifier;
                            boolean z4 = i4 == 0 ? true : z;
                            if ((i2 & 8) == 0) {
                                shape2 = ButtonDefaults.INSTANCE.getTextShape(startRestartGroup, 6);
                                i3 &= -7169;
                            } else {
                                shape2 = shape;
                            }
                            if ((i2 & 16) == 0) {
                                buttonColors2 = ButtonDefaults.INSTANCE.m1606textButtonColorsro_MJ88(0L, 0L, 0L, 0L, startRestartGroup, 24576, 15);
                                i3 &= -57345;
                            } else {
                                buttonColors2 = obj;
                            }
                            Object obj6 = i5 == 0 ? null : obj2;
                            if (i6 != 0) {
                                obj3 = null;
                            }
                            PaddingValues textButtonContentPadding = i7 == 0 ? ButtonDefaults.INSTANCE.getTextButtonContentPadding() : paddingValues;
                            if (i8 == 0) {
                                startRestartGroup.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.Companion.getEmpty()) {
                                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceableGroup();
                                paddingValues2 = textButtonContentPadding;
                                modifier2 = companion;
                                mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                                paddingValues2 = textButtonContentPadding;
                                modifier2 = companion;
                            }
                            z2 = z4;
                            shape3 = shape2;
                            obj4 = buttonColors2;
                            borderStroke2 = obj3;
                            obj5 = obj6;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            modifier2 = modifier;
                            z2 = z;
                            shape3 = shape;
                            paddingValues2 = paddingValues;
                            mutableInteractionSource2 = mutableInteractionSource;
                            borderStroke2 = obj3;
                            obj4 = obj;
                            obj5 = obj2;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2106428362, i3, -1, "androidx.compose.material3.TextButton (Button.kt:405)");
                        }
                        composer2 = startRestartGroup;
                        Button(onClick, modifier2, z2, shape3, obj4, obj5, borderStroke2, paddingValues2, mutableInteractionSource2, content, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (i3 & 3670016) | (i3 & 29360128) | (i3 & 234881024) | (i3 & 1879048192), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        z3 = z2;
                        shape4 = shape3;
                        buttonColors3 = obj4;
                        buttonElevation2 = obj5;
                        obj3 = borderStroke2;
                        paddingValues3 = paddingValues2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        z3 = z;
                        shape4 = shape;
                        mutableInteractionSource3 = mutableInteractionSource;
                        buttonColors3 = obj;
                        buttonElevation2 = obj2;
                        composer2 = startRestartGroup;
                        paddingValues3 = paddingValues;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new ButtonKt$TextButton$2(onClick, modifier3, z3, shape4, buttonColors3, buttonElevation2, obj3, paddingValues3, mutableInteractionSource3, content, i, i2));
                    return;
                }
                i9 = C.ENCODING_PCM_32BIT;
                i3 |= i9;
                if ((1533916891 & i3) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i12 == 0) {
                }
                if (i4 == 0) {
                }
                if ((i2 & 8) == 0) {
                }
                if ((i2 & 16) == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 != 0) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                z2 = z4;
                shape3 = shape2;
                obj4 = buttonColors2;
                borderStroke2 = obj3;
                obj5 = obj6;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                composer2 = startRestartGroup;
                Button(onClick, modifier2, z2, shape3, obj4, obj5, borderStroke2, paddingValues2, mutableInteractionSource2, content, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (i3 & 3670016) | (i3 & 29360128) | (i3 & 234881024) | (i3 & 1879048192), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier2;
                z3 = z2;
                shape4 = shape3;
                buttonColors3 = obj4;
                buttonElevation2 = obj5;
                obj3 = borderStroke2;
                paddingValues3 = paddingValues2;
                mutableInteractionSource3 = mutableInteractionSource2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            if ((i & 7168) == 0) {
            }
            if ((i & 57344) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            i8 = i2 & 256;
            if (i8 != 0) {
            }
            if ((i2 & 512) == 0) {
            }
            i3 |= i9;
            if ((1533916891 & i3) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i12 == 0) {
            }
            if (i4 == 0) {
            }
            if ((i2 & 8) == 0) {
            }
            if ((i2 & 16) == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 != 0) {
            }
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            z2 = z4;
            shape3 = shape2;
            obj4 = buttonColors2;
            borderStroke2 = obj3;
            obj5 = obj6;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            composer2 = startRestartGroup;
            Button(onClick, modifier2, z2, shape3, obj4, obj5, borderStroke2, paddingValues2, mutableInteractionSource2, content, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (i3 & 3670016) | (i3 & 29360128) | (i3 & 234881024) | (i3 & 1879048192), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier2;
            z3 = z2;
            shape4 = shape3;
            buttonColors3 = obj4;
            buttonElevation2 = obj5;
            obj3 = borderStroke2;
            paddingValues3 = paddingValues2;
            mutableInteractionSource3 = mutableInteractionSource2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        if ((i & 7168) == 0) {
        }
        if ((i & 57344) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        i8 = i2 & 256;
        if (i8 != 0) {
        }
        if ((i2 & 512) == 0) {
        }
        i3 |= i9;
        if ((1533916891 & i3) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i12 == 0) {
        }
        if (i4 == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 != 0) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        z2 = z4;
        shape3 = shape2;
        obj4 = buttonColors2;
        borderStroke2 = obj3;
        obj5 = obj6;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        composer2 = startRestartGroup;
        Button(onClick, modifier2, z2, shape3, obj4, obj5, borderStroke2, paddingValues2, mutableInteractionSource2, content, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (i3 & 3670016) | (i3 & 29360128) | (i3 & 234881024) | (i3 & 1879048192), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier2;
        z3 = z2;
        shape4 = shape3;
        buttonColors3 = obj4;
        buttonElevation2 = obj5;
        obj3 = borderStroke2;
        paddingValues3 = paddingValues2;
        mutableInteractionSource3 = mutableInteractionSource2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
