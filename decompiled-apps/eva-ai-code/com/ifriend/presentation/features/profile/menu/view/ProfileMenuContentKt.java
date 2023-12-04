package com.ifriend.presentation.features.profile.menu.view;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutKt;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.Measurer;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import com.ifriend.presentation.features.profile.menu.model.ProfileMenuUiState;
import com.ifriend.ui.components.popup.ModalTopSheetKt;
import com.ifriend.ui.theme.AppFontFamily;
import com.ifriend.ui.theme.AppTheme;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ProfileMenuContent.kt */
@Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aK\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0010\u0010\t\u001a\f\u0012\u0004\u0012\u00020\u00060\nj\u0002`\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u0001H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a^\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00142\u0010\u0010\u0015\u001a\f\u0012\u0004\u0012\u00020\u00060\nj\u0002`\u000b25\b\u0002\u0010\u0016\u001a/\u0012\u0004\u0012\u00020\u0018\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0017¢\u0006\u0002\b\u001d¢\u0006\u0002\b\u001eH\u0003¢\u0006\u0002\u0010\u001f\u001a\u001d\u0010 \u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010!\u001a\u00020\"H\u0003¢\u0006\u0002\u0010#\u001a\r\u0010$\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010%\u001a\u001f\u0010&\u001a\u00020\u00062\u0010\u0010\u0015\u001a\f\u0012\u0004\u0012\u00020\u00060\nj\u0002`\u000bH\u0003¢\u0006\u0002\u0010'\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0004\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"circleIndicatorColor", "Landroidx/compose/ui/graphics/Color;", "J", "defaultBackgroundColor", "defaultScrimColor", "ProfileMenuContent", "", "state", "Lcom/ifriend/presentation/features/profile/menu/model/ProfileMenuUiState;", "onDismiss", "Lkotlin/Function0;", "Lcom/ifriend/ui/tools/OnClick;", "navigator", "Lcom/ifriend/presentation/features/profile/menu/view/ProfileMenuNavigator;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "scrimColor", "ProfileMenuContent-jA1GFJw", "(Lcom/ifriend/presentation/features/profile/menu/model/ProfileMenuUiState;Lkotlin/jvm/functions/Function0;Lcom/ifriend/presentation/features/profile/menu/view/ProfileMenuNavigator;JJLandroidx/compose/runtime/Composer;II)V", "ProfileMenuItem", "text", "", "onClick", "indicator", "Lkotlin/Function2;", "Landroidx/constraintlayout/compose/ConstraintLayoutScope;", "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "Lkotlin/ParameterName;", "name", "textRef", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "ProfileMenuItemText", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "ProfileMenuPreview", "(Landroidx/compose/runtime/Composer;I)V", "UpgradeItem", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "presentation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProfileMenuContentKt {
    private static final long circleIndicatorColor = ColorKt.Color(4294914387L);
    private static final long defaultScrimColor = ColorKt.Color(2150511929L);
    private static final long defaultBackgroundColor = ColorKt.Color(3858759680L);

    /* JADX WARN: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* renamed from: ProfileMenuContent-jA1GFJw  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m6951ProfileMenuContentjA1GFJw(ProfileMenuUiState state, Function0<Unit> onDismiss, ProfileMenuNavigator navigator, long j, long j2, Composer composer, int i, int i2) {
        int i3;
        long j3;
        int i4;
        long j4;
        int i5;
        Composer composer2;
        long j5;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Composer startRestartGroup = composer.startRestartGroup(-109324504);
        ComposerKt.sourceInformation(startRestartGroup, "C(ProfileMenuContent)P(4,2,1,0:c#ui.graphics.Color,3:c#ui.graphics.Color)");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changedInstance(onDismiss) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(navigator) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
        } else if ((i & 7168) == 0) {
            j3 = j;
            i3 |= startRestartGroup.changed(j3) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
                j4 = j2;
            } else {
                j4 = j2;
                if ((57344 & i) == 0) {
                    i3 |= startRestartGroup.changed(j4) ? 16384 : 8192;
                }
            }
            i5 = i3;
            if ((46811 & i5) == 9362 || !startRestartGroup.getSkipping()) {
                long j6 = i6 == 0 ? defaultBackgroundColor : j3;
                long j7 = i4 == 0 ? defaultScrimColor : j4;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-109324504, i5, -1, "com.ifriend.presentation.features.profile.menu.view.ProfileMenuContent (ProfileMenuContent.kt:68)");
                }
                composer2 = startRestartGroup;
                ModalTopSheetKt.m7056ModalTopSheetcf5BqRc(state.isMenuVisible(), onDismiss, j7, ComposableLambdaKt.composableLambda(startRestartGroup, -1993311402, true, new ProfileMenuContentKt$ProfileMenuContent$1(j6, state, onDismiss, navigator, i5)), composer2, (i5 & 112) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | ((i5 >> 6) & 896), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j5 = j6;
                j4 = j7;
            } else {
                startRestartGroup.skipToGroupEnd();
                j5 = j3;
                composer2 = startRestartGroup;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new ProfileMenuContentKt$ProfileMenuContent$2(state, onDismiss, navigator, j5, j4, i, i2));
            return;
        }
        j3 = j;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        i5 = i3;
        if ((46811 & i5) == 9362) {
        }
        if (i6 == 0) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        composer2 = startRestartGroup;
        ModalTopSheetKt.m7056ModalTopSheetcf5BqRc(state.isMenuVisible(), onDismiss, j7, ComposableLambdaKt.composableLambda(startRestartGroup, -1993311402, true, new ProfileMenuContentKt$ProfileMenuContent$1(j6, state, onDismiss, navigator, i5)), composer2, (i5 & 112) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | ((i5 >> 6) & 896), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        j5 = j6;
        j4 = j7;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ProfileMenuItem(String str, Function0<Unit> function0, Function4<? super ConstraintLayoutScope, ? super ConstrainedLayoutReference, ? super Composer, ? super Integer, Unit> function4, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        Object rememberedValue;
        Object rememberedValue2;
        Object rememberedValue3;
        Function4<? super ConstraintLayoutScope, ? super ConstrainedLayoutReference, ? super Composer, ? super Integer, Unit> function42;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-1784933201);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            obj = function4;
            i3 |= startRestartGroup.changedInstance(obj) ? 256 : 128;
            i4 = i3;
            if ((i4 & 731) == 146 || !startRestartGroup.getSkipping()) {
                Object obj2 = i5 == 0 ? null : obj;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1784933201, i4, -1, "com.ifriend.presentation.features.profile.menu.view.ProfileMenuItem (ProfileMenuContent.kt:174)");
                }
                Modifier m454clickableXHw0xAI$default = ClickableKt.m454clickableXHw0xAI$default(PaddingKt.m750paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0.0f, AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7175getMediumD9Ej5fM(), 1, null), false, null, null, function0, 7, null);
                startRestartGroup.startReplaceableGroup(-270267587);
                ComposerKt.sourceInformation(startRestartGroup, "C(ConstraintLayout)P(1,2)");
                startRestartGroup.startReplaceableGroup(-3687241);
                ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new Measurer();
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                Measurer measurer = (Measurer) rememberedValue;
                startRestartGroup.startReplaceableGroup(-3687241);
                ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = new ConstraintLayoutScope();
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceableGroup();
                ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) rememberedValue2;
                startRestartGroup.startReplaceableGroup(-3687241);
                ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == Composer.Companion.getEmpty()) {
                    rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                startRestartGroup.endReplaceableGroup();
                Pair<MeasurePolicy, Function0<Unit>> rememberConstraintLayoutMeasurePolicy = ConstraintLayoutKt.rememberConstraintLayoutMeasurePolicy(257, constraintLayoutScope, (MutableState) rememberedValue3, measurer, startRestartGroup, 4544);
                LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(m454clickableXHw0xAI$default, false, new ProfileMenuContentKt$ProfileMenuItem$$inlined$ConstraintLayout$1(measurer), 1, null), ComposableLambdaKt.composableLambda(startRestartGroup, -819894182, true, new ProfileMenuContentKt$ProfileMenuItem$$inlined$ConstraintLayout$2(constraintLayoutScope, 0, rememberConstraintLayoutMeasurePolicy.component2(), str, i4, obj2)), rememberConstraintLayoutMeasurePolicy.component1(), startRestartGroup, 48, 0);
                startRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function42 = obj2;
            } else {
                startRestartGroup.skipToGroupEnd();
                function42 = obj;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new ProfileMenuContentKt$ProfileMenuItem$2(str, function0, function42, i, i2));
            return;
        }
        obj = function4;
        i4 = i3;
        if ((i4 & 731) == 146) {
        }
        if (i5 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Modifier m454clickableXHw0xAI$default2 = ClickableKt.m454clickableXHw0xAI$default(PaddingKt.m750paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0.0f, AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7175getMediumD9Ej5fM(), 1, null), false, null, null, function0, 7, null);
        startRestartGroup.startReplaceableGroup(-270267587);
        ComposerKt.sourceInformation(startRestartGroup, "C(ConstraintLayout)P(1,2)");
        startRestartGroup.startReplaceableGroup(-3687241);
        ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        Measurer measurer2 = (Measurer) rememberedValue;
        startRestartGroup.startReplaceableGroup(-3687241);
        ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.Companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        ConstraintLayoutScope constraintLayoutScope2 = (ConstraintLayoutScope) rememberedValue2;
        startRestartGroup.startReplaceableGroup(-3687241);
        ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == Composer.Companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        Pair<MeasurePolicy, Function0<Unit>> rememberConstraintLayoutMeasurePolicy2 = ConstraintLayoutKt.rememberConstraintLayoutMeasurePolicy(257, constraintLayoutScope2, (MutableState) rememberedValue3, measurer2, startRestartGroup, 4544);
        LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(m454clickableXHw0xAI$default2, false, new ProfileMenuContentKt$ProfileMenuItem$$inlined$ConstraintLayout$1(measurer2), 1, null), ComposableLambdaKt.composableLambda(startRestartGroup, -819894182, true, new ProfileMenuContentKt$ProfileMenuItem$$inlined$ConstraintLayout$2(constraintLayoutScope2, 0, rememberConstraintLayoutMeasurePolicy2.component2(), str, i4, obj2)), rememberConstraintLayoutMeasurePolicy2.component1(), startRestartGroup, 48, 0);
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        function42 = obj2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void UpgradeItem(Function0<Unit> function0, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1572498950);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1572498950, i, -1, "com.ifriend.presentation.features.profile.menu.view.UpgradeItem (ProfileMenuContent.kt:203)");
            }
            Modifier m454clickableXHw0xAI$default = ClickableKt.m454clickableXHw0xAI$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), false, null, null, function0, 7, null);
            startRestartGroup.startReplaceableGroup(-270267587);
            ComposerKt.sourceInformation(startRestartGroup, "C(ConstraintLayout)P(1,2)");
            startRestartGroup.startReplaceableGroup(-3687241);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new Measurer();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            Measurer measurer = (Measurer) rememberedValue;
            startRestartGroup.startReplaceableGroup(-3687241);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new ConstraintLayoutScope();
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) rememberedValue2;
            startRestartGroup.startReplaceableGroup(-3687241);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            Pair<MeasurePolicy, Function0<Unit>> rememberConstraintLayoutMeasurePolicy = ConstraintLayoutKt.rememberConstraintLayoutMeasurePolicy(257, constraintLayoutScope, (MutableState) rememberedValue3, measurer, startRestartGroup, 4544);
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(m454clickableXHw0xAI$default, false, new ProfileMenuContentKt$UpgradeItem$$inlined$ConstraintLayout$1(measurer), 1, null), ComposableLambdaKt.composableLambda(startRestartGroup, -819894182, true, new ProfileMenuContentKt$UpgradeItem$$inlined$ConstraintLayout$2(constraintLayoutScope, 0, rememberConstraintLayoutMeasurePolicy.component2())), rememberConstraintLayoutMeasurePolicy.component1(), startRestartGroup, 48, 0);
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new ProfileMenuContentKt$UpgradeItem$2(function0, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ProfileMenuItemText(String str, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(139470701);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(139470701, i3, -1, "com.ifriend.presentation.features.profile.menu.view.ProfileMenuItemText (ProfileMenuContent.kt:259)");
            }
            FontFamily ibmSans = AppFontFamily.INSTANCE.getIbmSans();
            FontWeight normal = FontWeight.Companion.getNormal();
            composer2 = startRestartGroup;
            TextKt.m2145Text4IGK_g(str, modifier, AppTheme.INSTANCE.getColors(startRestartGroup, AppTheme.$stable).m7108getTextPrimary0d7_KjU(), TextUnitKt.getSp(24), (FontStyle) null, normal, ibmSans, 0L, (TextDecoration) null, TextAlign.m5462boximpl(TextAlign.Companion.m5469getCentere0LSkKk()), 0L, TextOverflow.Companion.m5517getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i3 & 14) | 199680 | (i3 & 112), 3120, 120208);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new ProfileMenuContentKt$ProfileMenuItemText$1(str, modifier, i));
    }

    public static final void ProfileMenuPreview(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(980708099);
        ComposerKt.sourceInformation(startRestartGroup, "C(ProfileMenuPreview)");
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(980708099, i, -1, "com.ifriend.presentation.features.profile.menu.view.ProfileMenuPreview (ProfileMenuContent.kt:275)");
            }
            MaterialThemeKt.MaterialTheme(null, null, null, ComposableSingletons$ProfileMenuContentKt.INSTANCE.m6950getLambda3$presentation_release(), startRestartGroup, CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new ProfileMenuContentKt$ProfileMenuPreview$1(i));
    }
}
