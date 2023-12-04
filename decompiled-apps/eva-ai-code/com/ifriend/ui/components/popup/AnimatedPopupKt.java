package com.ifriend.ui.components.popup;

import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Color;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AnimatedPopup.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001ae\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052!\b\u0002\u0010\u0006\u001a\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007¢\u0006\u0002\b\t2\u001d\u0010\n\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\tH\u0007¢\u0006\u0002\u0010\u000b\u001az\u0010\f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u00122\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0018²\u0006\n\u0010\u0019\u001a\u00020\u0003X\u008a\u008e\u0002"}, d2 = {"AnimatedPopup", "", "isVisible", "", "onDismiss", "Lkotlin/Function0;", "scrim", "Lkotlin/Function1;", "Landroidx/compose/animation/core/MutableTransitionState;", "Landroidx/compose/runtime/Composable;", FirebaseAnalytics.Param.CONTENT, "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "FullscreenAnimatedPopup", "scrimColor", "Landroidx/compose/ui/graphics/Color;", "scrimEnter", "Landroidx/compose/animation/EnterTransition;", "scrimExit", "Landroidx/compose/animation/ExitTransition;", "closeOnScrimClick", "contentEnter", "contentExit", "FullscreenAnimatedPopup-IkByU14", "(ZLkotlin/jvm/functions/Function0;JLandroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;ZLandroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "common_ui_release", "internalVisible"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AnimatedPopupKt {
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AnimatedPopup(boolean z, Function0<Unit> onDismiss, Function3<? super MutableTransitionState<Boolean>, ? super Composer, ? super Integer, Unit> function3, Function3<? super MutableTransitionState<Boolean>, ? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        Object rememberedValue;
        MutableState mutableState;
        boolean changed;
        AnimatedPopupKt$AnimatedPopup$1$1 rememberedValue2;
        Function3<? super MutableTransitionState<Boolean>, ? super Composer, ? super Integer, Unit> function32;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1359646470);
        ComposerKt.sourceInformation(startRestartGroup, "C(AnimatedPopup)P(1,2,3)");
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
            i3 |= startRestartGroup.changedInstance(onDismiss) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            obj = function3;
            i3 |= startRestartGroup.changedInstance(obj) ? 256 : 128;
            if ((i2 & 8) == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                i3 |= startRestartGroup.changedInstance(content) ? 2048 : 1024;
            }
            i4 = i3;
            if ((i4 & 5851) == 1170 || !startRestartGroup.getSkipping()) {
                Object obj2 = i5 == 0 ? null : obj;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1359646470, i4, -1, "com.ifriend.ui.components.popup.AnimatedPopup (AnimatedPopup.kt:26)");
                }
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) rememberedValue;
                Boolean valueOf = Boolean.valueOf(z);
                Boolean valueOf2 = Boolean.valueOf(z);
                int i6 = i4 & 14;
                startRestartGroup.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                changed = startRestartGroup.changed(valueOf2) | startRestartGroup.changed(mutableState);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = new AnimatedPopupKt$AnimatedPopup$1$1(z, mutableState, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(valueOf, (Function2) rememberedValue2, startRestartGroup, i6 | 64);
                if (AnimatedPopup$lambda$1(mutableState)) {
                    AppModalPopupKt.AppModalPopup(onDismiss, ComposableLambdaKt.composableLambda(startRestartGroup, -844620457, true, new AnimatedPopupKt$AnimatedPopup$2(obj2, i4, content, z, mutableState)), startRestartGroup, ((i4 >> 3) & 14) | 48);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function32 = obj2;
            } else {
                startRestartGroup.skipToGroupEnd();
                function32 = obj;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new AnimatedPopupKt$AnimatedPopup$3(z, onDismiss, function32, content, i, i2));
            return;
        }
        obj = function3;
        if ((i2 & 8) == 0) {
        }
        i4 = i3;
        if ((i4 & 5851) == 1170) {
        }
        if (i5 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        mutableState = (MutableState) rememberedValue;
        Boolean valueOf3 = Boolean.valueOf(z);
        Boolean valueOf22 = Boolean.valueOf(z);
        int i62 = i4 & 14;
        startRestartGroup.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
        changed = startRestartGroup.changed(valueOf22) | startRestartGroup.changed(mutableState);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue2 = new AnimatedPopupKt$AnimatedPopup$1$1(z, mutableState, null);
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(valueOf3, (Function2) rememberedValue2, startRestartGroup, i62 | 64);
        if (AnimatedPopup$lambda$1(mutableState)) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        function32 = obj2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final boolean AnimatedPopup$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AnimatedPopup$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012a  */
    /* renamed from: FullscreenAnimatedPopup-IkByU14  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m7050FullscreenAnimatedPopupIkByU14(boolean z, Function0<Unit> onDismiss, long j, EnterTransition enterTransition, ExitTransition exitTransition, boolean z2, EnterTransition enterTransition2, ExitTransition exitTransition2, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        int i4;
        Object obj;
        int i5;
        Object obj2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        ExitTransition exitTransition3;
        ExitTransition exitTransition4;
        EnterTransition enterTransition3;
        boolean z3;
        long j2;
        EnterTransition enterTransition4;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-492638636);
        ComposerKt.sourceInformation(startRestartGroup, "C(FullscreenAnimatedPopup)P(4,5,6:c#ui.graphics.Color,7,8!1,2,3)");
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
            i3 |= startRestartGroup.changedInstance(onDismiss) ? 32 : 16;
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(j) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                obj = enterTransition;
                i3 |= startRestartGroup.changed(obj) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((57344 & i) == 0) {
                    obj2 = exitTransition;
                    i3 |= startRestartGroup.changed(obj2) ? 16384 : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & 458752) == 0) {
                        i3 |= startRestartGroup.changed(z2) ? 131072 : 65536;
                    }
                    i7 = i2 & 64;
                    if (i7 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        i3 |= startRestartGroup.changed(enterTransition2) ? 1048576 : 524288;
                    }
                    i8 = i2 & 128;
                    if (i8 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 29360128) == 0) {
                        i3 |= startRestartGroup.changed(exitTransition2) ? 8388608 : 4194304;
                    }
                    if ((i2 & 256) != 0) {
                        if ((234881024 & i) == 0) {
                            i9 = startRestartGroup.changedInstance(content) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                        i10 = i3;
                        if ((191739611 & i10) == 38347922 || !startRestartGroup.getSkipping()) {
                            long m3290copywmQWz5c$default = i11 != 0 ? Color.m3290copywmQWz5c$default(Color.Companion.m3317getBlack0d7_KjU(), 0.95f, 0.0f, 0.0f, 0.0f, 14, null) : j;
                            EnterTransition fadeIn$default = i4 != 0 ? EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null) : obj;
                            if (i5 != 0) {
                                obj2 = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null);
                            }
                            boolean z4 = i6 != 0 ? true : z2;
                            EnterTransition fadeIn$default2 = i7 != 0 ? EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null) : enterTransition2;
                            ExitTransition fadeOut$default = i8 != 0 ? EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null) : exitTransition2;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-492638636, i10, -1, "com.ifriend.ui.components.popup.FullscreenAnimatedPopup (AnimatedPopup.kt:67)");
                            }
                            exitTransition3 = fadeOut$default;
                            EnterTransition enterTransition5 = fadeIn$default2;
                            ExitTransition exitTransition5 = obj2;
                            AnimatedPopup(z, onDismiss, ComposableLambdaKt.composableLambda(startRestartGroup, -738050526, true, new AnimatedPopupKt$FullscreenAnimatedPopup$1(fadeIn$default, obj2, i10, m3290copywmQWz5c$default, z4, onDismiss)), ComposableLambdaKt.composableLambda(startRestartGroup, 1408515939, true, new AnimatedPopupKt$FullscreenAnimatedPopup$2(enterTransition5, exitTransition3, i10, content)), startRestartGroup, (i10 & 14) | 3456 | (i10 & 112), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            exitTransition4 = exitTransition5;
                            enterTransition3 = enterTransition5;
                            z3 = z4;
                            j2 = m3290copywmQWz5c$default;
                            enterTransition4 = fadeIn$default;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            j2 = j;
                            z3 = z2;
                            enterTransition3 = enterTransition2;
                            exitTransition3 = exitTransition2;
                            enterTransition4 = obj;
                            exitTransition4 = obj2;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new AnimatedPopupKt$FullscreenAnimatedPopup$3(z, onDismiss, j2, enterTransition4, exitTransition4, z3, enterTransition3, exitTransition3, content, i, i2));
                        return;
                    }
                    i9 = 100663296;
                    i3 |= i9;
                    i10 = i3;
                    if ((191739611 & i10) == 38347922) {
                    }
                    if (i11 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    exitTransition3 = fadeOut$default;
                    EnterTransition enterTransition52 = fadeIn$default2;
                    ExitTransition exitTransition52 = obj2;
                    AnimatedPopup(z, onDismiss, ComposableLambdaKt.composableLambda(startRestartGroup, -738050526, true, new AnimatedPopupKt$FullscreenAnimatedPopup$1(fadeIn$default, obj2, i10, m3290copywmQWz5c$default, z4, onDismiss)), ComposableLambdaKt.composableLambda(startRestartGroup, 1408515939, true, new AnimatedPopupKt$FullscreenAnimatedPopup$2(enterTransition52, exitTransition3, i10, content)), startRestartGroup, (i10 & 14) | 3456 | (i10 & 112), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    exitTransition4 = exitTransition52;
                    enterTransition3 = enterTransition52;
                    z3 = z4;
                    j2 = m3290copywmQWz5c$default;
                    enterTransition4 = fadeIn$default;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                obj2 = exitTransition;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                i7 = i2 & 64;
                if (i7 == 0) {
                }
                i8 = i2 & 128;
                if (i8 == 0) {
                }
                if ((i2 & 256) != 0) {
                }
                i3 |= i9;
                i10 = i3;
                if ((191739611 & i10) == 38347922) {
                }
                if (i11 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                exitTransition3 = fadeOut$default;
                EnterTransition enterTransition522 = fadeIn$default2;
                ExitTransition exitTransition522 = obj2;
                AnimatedPopup(z, onDismiss, ComposableLambdaKt.composableLambda(startRestartGroup, -738050526, true, new AnimatedPopupKt$FullscreenAnimatedPopup$1(fadeIn$default, obj2, i10, m3290copywmQWz5c$default, z4, onDismiss)), ComposableLambdaKt.composableLambda(startRestartGroup, 1408515939, true, new AnimatedPopupKt$FullscreenAnimatedPopup$2(enterTransition522, exitTransition3, i10, content)), startRestartGroup, (i10 & 14) | 3456 | (i10 & 112), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                exitTransition4 = exitTransition522;
                enterTransition3 = enterTransition522;
                z3 = z4;
                j2 = m3290copywmQWz5c$default;
                enterTransition4 = fadeIn$default;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            obj = enterTransition;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            obj2 = exitTransition;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            i7 = i2 & 64;
            if (i7 == 0) {
            }
            i8 = i2 & 128;
            if (i8 == 0) {
            }
            if ((i2 & 256) != 0) {
            }
            i3 |= i9;
            i10 = i3;
            if ((191739611 & i10) == 38347922) {
            }
            if (i11 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            exitTransition3 = fadeOut$default;
            EnterTransition enterTransition5222 = fadeIn$default2;
            ExitTransition exitTransition5222 = obj2;
            AnimatedPopup(z, onDismiss, ComposableLambdaKt.composableLambda(startRestartGroup, -738050526, true, new AnimatedPopupKt$FullscreenAnimatedPopup$1(fadeIn$default, obj2, i10, m3290copywmQWz5c$default, z4, onDismiss)), ComposableLambdaKt.composableLambda(startRestartGroup, 1408515939, true, new AnimatedPopupKt$FullscreenAnimatedPopup$2(enterTransition5222, exitTransition3, i10, content)), startRestartGroup, (i10 & 14) | 3456 | (i10 & 112), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            exitTransition4 = exitTransition5222;
            enterTransition3 = enterTransition5222;
            z3 = z4;
            j2 = m3290copywmQWz5c$default;
            enterTransition4 = fadeIn$default;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        obj = enterTransition;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        obj2 = exitTransition;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        i7 = i2 & 64;
        if (i7 == 0) {
        }
        i8 = i2 & 128;
        if (i8 == 0) {
        }
        if ((i2 & 256) != 0) {
        }
        i3 |= i9;
        i10 = i3;
        if ((191739611 & i10) == 38347922) {
        }
        if (i11 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        exitTransition3 = fadeOut$default;
        EnterTransition enterTransition52222 = fadeIn$default2;
        ExitTransition exitTransition52222 = obj2;
        AnimatedPopup(z, onDismiss, ComposableLambdaKt.composableLambda(startRestartGroup, -738050526, true, new AnimatedPopupKt$FullscreenAnimatedPopup$1(fadeIn$default, obj2, i10, m3290copywmQWz5c$default, z4, onDismiss)), ComposableLambdaKt.composableLambda(startRestartGroup, 1408515939, true, new AnimatedPopupKt$FullscreenAnimatedPopup$2(enterTransition52222, exitTransition3, i10, content)), startRestartGroup, (i10 & 14) | 3456 | (i10 & 112), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        exitTransition4 = exitTransition52222;
        enterTransition3 = enterTransition52222;
        z3 = z4;
        j2 = m3290copywmQWz5c$default;
        enterTransition4 = fadeIn$default;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
