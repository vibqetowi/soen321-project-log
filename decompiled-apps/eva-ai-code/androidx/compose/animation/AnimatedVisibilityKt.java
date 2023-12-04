package androidx.compose.animation;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.exifinterface.media.ExifInterface;
import androidx.profileinstaller.ProfileVerifier;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AnimatedVisibility.kt */
@Metadata(d1 = {"\u0000h\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001ak\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0003¢\u0006\u0002\u0010\u0012\u001aR\u0010\u0000\u001a\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0083\b¢\u0006\u0002\u0010\u0014\u001aa\u0010\u0015\u001a\u00020\u00012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00172\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010\u001a\u001aJ\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u00072\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u001c¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u001d\u001a[\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010\u001e\u001am\u0010\u0015\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010\u001f\u001ae\u0010\u0015\u001a\u00020\u0001*\u00020 2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00172\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010!\u001a_\u0010\u0015\u001a\u00020\u0001*\u00020 2\u0006\u0010\u0005\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010\"\u001ae\u0010\u0015\u001a\u00020\u0001*\u00020#2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00172\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010$\u001a_\u0010\u0015\u001a\u00020\u0001*\u00020#2\u0006\u0010\u0005\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010%\u001a9\u0010&\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010'\u001a\u0002H\u0002H\u0003¢\u0006\u0002\u0010(¨\u0006)"}, d2 = {"AnimatedEnterExitImpl", "", ExifInterface.GPS_DIRECTION_TRUE, "transition", "Landroidx/compose/animation/core/Transition;", "visible", "Lkotlin/Function1;", "", "modifier", "Landroidx/compose/ui/Modifier;", "enter", "Landroidx/compose/animation/EnterTransition;", "exit", "Landroidx/compose/animation/ExitTransition;", FirebaseAnalytics.Param.CONTENT, "Landroidx/compose/animation/AnimatedVisibilityScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/animation/EnterExitState;", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "AnimatedVisibility", "visibleState", "Landroidx/compose/animation/core/MutableTransitionState;", Constants.ScionAnalytics.PARAM_LABEL, "", "(Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "initiallyVisible", "Lkotlin/Function0;", "(ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "(ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/ColumnScope;", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/foundation/layout/ColumnScope;ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/RowScope;", "(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/foundation/layout/RowScope;ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "targetEnterExit", "targetState", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/EnterExitState;", "animation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnimatedVisibilityKt {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AnimatedVisibility(boolean z, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        Object obj2;
        int i5;
        Object obj3;
        int i6;
        Object obj4;
        int i7;
        Modifier modifier2;
        String str2;
        ExitTransition exitTransition2;
        EnterTransition enterTransition2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(2088733774);
        ComposerKt.sourceInformation(startRestartGroup, "C(AnimatedVisibility)P(5,4,1,2,3)127@6727L32,128@6764L73:AnimatedVisibility.kt#xbi5r1");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            obj = modifier;
            i3 |= startRestartGroup.changed(obj) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                obj2 = enterTransition;
                i3 |= startRestartGroup.changed(obj2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                } else if ((i & 7168) == 0) {
                    obj3 = exitTransition;
                    i3 |= startRestartGroup.changed(obj3) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 57344) == 0) {
                        obj4 = str;
                        i3 |= startRestartGroup.changed(obj4) ? 16384 : 8192;
                        if ((i2 & 32) == 0) {
                            if ((i & 458752) == 0) {
                                i7 = startRestartGroup.changedInstance(content) ? 131072 : 65536;
                            }
                            if ((374491 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                                Modifier.Companion companion = i8 == 0 ? Modifier.Companion : obj;
                                EnterTransition plus = i4 == 0 ? EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null)) : obj2;
                                ExitTransition plus2 = i5 == 0 ? EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)) : obj3;
                                if (i6 != 0) {
                                    obj4 = "AnimatedVisibility";
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(2088733774, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                                }
                                int i9 = i3 << 3;
                                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), obj4, startRestartGroup, (i3 & 14) | ((i3 >> 9) & 112), 0), AnimatedVisibilityKt$AnimatedVisibility$1.INSTANCE, companion, plus, plus2, content, startRestartGroup, (i9 & 57344) | (i9 & 896) | 48 | (i9 & 7168) | (i3 & 458752));
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier2 = companion;
                                str2 = obj4;
                                exitTransition2 = plus2;
                                enterTransition2 = plus;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier2 = obj;
                                enterTransition2 = obj2;
                                exitTransition2 = obj3;
                                str2 = obj4;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup != null) {
                                return;
                            }
                            endRestartGroup.updateScope(new AnimatedVisibilityKt$AnimatedVisibility$2(z, modifier2, enterTransition2, exitTransition2, str2, content, i, i2));
                            return;
                        }
                        i7 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        i3 |= i7;
                        if ((374491 & i3) == 74898) {
                        }
                        if (i8 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i92 = i3 << 3;
                        AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), obj4, startRestartGroup, (i3 & 14) | ((i3 >> 9) & 112), 0), AnimatedVisibilityKt$AnimatedVisibility$1.INSTANCE, companion, plus, plus2, content, startRestartGroup, (i92 & 57344) | (i92 & 896) | 48 | (i92 & 7168) | (i3 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier2 = companion;
                        str2 = obj4;
                        exitTransition2 = plus2;
                        enterTransition2 = plus;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    obj4 = str;
                    if ((i2 & 32) == 0) {
                    }
                    i3 |= i7;
                    if ((374491 & i3) == 74898) {
                    }
                    if (i8 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i922 = i3 << 3;
                    AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), obj4, startRestartGroup, (i3 & 14) | ((i3 >> 9) & 112), 0), AnimatedVisibilityKt$AnimatedVisibility$1.INSTANCE, companion, plus, plus2, content, startRestartGroup, (i922 & 57344) | (i922 & 896) | 48 | (i922 & 7168) | (i3 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = companion;
                    str2 = obj4;
                    exitTransition2 = plus2;
                    enterTransition2 = plus;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                obj3 = exitTransition;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                obj4 = str;
                if ((i2 & 32) == 0) {
                }
                i3 |= i7;
                if ((374491 & i3) == 74898) {
                }
                if (i8 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                int i9222 = i3 << 3;
                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), obj4, startRestartGroup, (i3 & 14) | ((i3 >> 9) & 112), 0), AnimatedVisibilityKt$AnimatedVisibility$1.INSTANCE, companion, plus, plus2, content, startRestartGroup, (i9222 & 57344) | (i9222 & 896) | 48 | (i9222 & 7168) | (i3 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = companion;
                str2 = obj4;
                exitTransition2 = plus2;
                enterTransition2 = plus;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            obj2 = enterTransition;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            obj3 = exitTransition;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            obj4 = str;
            if ((i2 & 32) == 0) {
            }
            i3 |= i7;
            if ((374491 & i3) == 74898) {
            }
            if (i8 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int i92222 = i3 << 3;
            AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), obj4, startRestartGroup, (i3 & 14) | ((i3 >> 9) & 112), 0), AnimatedVisibilityKt$AnimatedVisibility$1.INSTANCE, companion, plus, plus2, content, startRestartGroup, (i92222 & 57344) | (i92222 & 896) | 48 | (i92222 & 7168) | (i3 & 458752));
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = companion;
            str2 = obj4;
            exitTransition2 = plus2;
            enterTransition2 = plus;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        obj = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        obj2 = enterTransition;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        obj3 = exitTransition;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        obj4 = str;
        if ((i2 & 32) == 0) {
        }
        i3 |= i7;
        if ((374491 & i3) == 74898) {
        }
        if (i8 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        int i922222 = i3 << 3;
        AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), obj4, startRestartGroup, (i3 & 14) | ((i3 >> 9) & 112), 0), AnimatedVisibilityKt$AnimatedVisibility$1.INSTANCE, companion, plus, plus2, content, startRestartGroup, (i922222 & 57344) | (i922222 & 896) | 48 | (i922222 & 7168) | (i3 & 458752));
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = companion;
        str2 = obj4;
        exitTransition2 = plus2;
        enterTransition2 = plus;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AnimatedVisibility(RowScope rowScope, boolean z, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        Object obj2;
        int i5;
        Object obj3;
        int i6;
        Object obj4;
        int i7;
        ExitTransition exitTransition2;
        String str2;
        EnterTransition enterTransition2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(rowScope, "<this>");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1741346906);
        ComposerKt.sourceInformation(startRestartGroup, "C(AnimatedVisibility)P(5,4,1,2,3)202@11021L32,203@11058L73:AnimatedVisibility.kt#xbi5r1");
        if ((i2 & 1) != 0) {
            i3 = i | 48;
        } else if ((i & 112) == 0) {
            i3 = (startRestartGroup.changed(z) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            obj = modifier;
            i3 |= startRestartGroup.changed(obj) ? 256 : 128;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                obj2 = enterTransition;
                i3 |= startRestartGroup.changed(obj2) ? 2048 : 1024;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 57344) == 0) {
                    obj3 = exitTransition;
                    i3 |= startRestartGroup.changed(obj3) ? 16384 : 8192;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        obj4 = str;
                    } else {
                        obj4 = str;
                        if ((i & 458752) == 0) {
                            i3 |= startRestartGroup.changed(obj4) ? 131072 : 65536;
                        }
                    }
                    if ((i2 & 32) != 0) {
                        if ((i & 3670016) == 0) {
                            i7 = startRestartGroup.changedInstance(content) ? 1048576 : 524288;
                        }
                        if ((i3 & 2995921) == 599184 || !startRestartGroup.getSkipping()) {
                            Modifier.Companion companion = i8 != 0 ? Modifier.Companion : obj;
                            EnterTransition plus = i4 != 0 ? EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null)) : obj2;
                            if (i5 != 0) {
                                obj3 = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null));
                            }
                            if (i6 != 0) {
                                obj4 = "AnimatedVisibility";
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1741346906, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)");
                            }
                            int i9 = i3 >> 3;
                            AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), obj4, startRestartGroup, (i9 & 14) | ((i3 >> 12) & 112), 0), AnimatedVisibilityKt$AnimatedVisibility$3.INSTANCE, companion, plus, obj3, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i9 & 458752));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            exitTransition2 = obj3;
                            str2 = obj4;
                            obj = companion;
                            enterTransition2 = plus;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            enterTransition2 = obj2;
                            exitTransition2 = obj3;
                            str2 = obj4;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new AnimatedVisibilityKt$AnimatedVisibility$4(rowScope, z, obj, enterTransition2, exitTransition2, str2, content, i, i2));
                        return;
                    }
                    i7 = 1572864;
                    i3 |= i7;
                    if ((i3 & 2995921) == 599184) {
                    }
                    if (i8 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i92 = i3 >> 3;
                    AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), obj4, startRestartGroup, (i92 & 14) | ((i3 >> 12) & 112), 0), AnimatedVisibilityKt$AnimatedVisibility$3.INSTANCE, companion, plus, obj3, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i92 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    exitTransition2 = obj3;
                    str2 = obj4;
                    obj = companion;
                    enterTransition2 = plus;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                obj3 = exitTransition;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                if ((i2 & 32) != 0) {
                }
                i3 |= i7;
                if ((i3 & 2995921) == 599184) {
                }
                if (i8 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                int i922 = i3 >> 3;
                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), obj4, startRestartGroup, (i922 & 14) | ((i3 >> 12) & 112), 0), AnimatedVisibilityKt$AnimatedVisibility$3.INSTANCE, companion, plus, obj3, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i922 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                }
                exitTransition2 = obj3;
                str2 = obj4;
                obj = companion;
                enterTransition2 = plus;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            obj2 = enterTransition;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            obj3 = exitTransition;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            if ((i2 & 32) != 0) {
            }
            i3 |= i7;
            if ((i3 & 2995921) == 599184) {
            }
            if (i8 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int i9222 = i3 >> 3;
            AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), obj4, startRestartGroup, (i9222 & 14) | ((i3 >> 12) & 112), 0), AnimatedVisibilityKt$AnimatedVisibility$3.INSTANCE, companion, plus, obj3, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i9222 & 458752));
            if (ComposerKt.isTraceInProgress()) {
            }
            exitTransition2 = obj3;
            str2 = obj4;
            obj = companion;
            enterTransition2 = plus;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        obj = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        obj2 = enterTransition;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        obj3 = exitTransition;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        if ((i2 & 32) != 0) {
        }
        i3 |= i7;
        if ((i3 & 2995921) == 599184) {
        }
        if (i8 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        int i92222 = i3 >> 3;
        AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), obj4, startRestartGroup, (i92222 & 14) | ((i3 >> 12) & 112), 0), AnimatedVisibilityKt$AnimatedVisibility$3.INSTANCE, companion, plus, obj3, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i92222 & 458752));
        if (ComposerKt.isTraceInProgress()) {
        }
        exitTransition2 = obj3;
        str2 = obj4;
        obj = companion;
        enterTransition2 = plus;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AnimatedVisibility(ColumnScope columnScope, boolean z, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        Object obj2;
        int i5;
        Object obj3;
        int i6;
        Object obj4;
        int i7;
        ExitTransition exitTransition2;
        String str2;
        EnterTransition enterTransition2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1766503102);
        ComposerKt.sourceInformation(startRestartGroup, "C(AnimatedVisibility)P(5,4,1,2,3)275@15293L32,276@15330L73:AnimatedVisibility.kt#xbi5r1");
        if ((i2 & 1) != 0) {
            i3 = i | 48;
        } else if ((i & 112) == 0) {
            i3 = (startRestartGroup.changed(z) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            obj = modifier;
            i3 |= startRestartGroup.changed(obj) ? 256 : 128;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                obj2 = enterTransition;
                i3 |= startRestartGroup.changed(obj2) ? 2048 : 1024;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 57344) == 0) {
                    obj3 = exitTransition;
                    i3 |= startRestartGroup.changed(obj3) ? 16384 : 8192;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        obj4 = str;
                    } else {
                        obj4 = str;
                        if ((i & 458752) == 0) {
                            i3 |= startRestartGroup.changed(obj4) ? 131072 : 65536;
                        }
                    }
                    if ((i2 & 32) != 0) {
                        if ((i & 3670016) == 0) {
                            i7 = startRestartGroup.changedInstance(content) ? 1048576 : 524288;
                        }
                        if ((i3 & 2995921) == 599184 || !startRestartGroup.getSkipping()) {
                            Modifier.Companion companion = i8 != 0 ? Modifier.Companion : obj;
                            EnterTransition plus = i4 != 0 ? EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null)) : obj2;
                            if (i5 != 0) {
                                obj3 = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null));
                            }
                            if (i6 != 0) {
                                obj4 = "AnimatedVisibility";
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1766503102, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)");
                            }
                            int i9 = i3 >> 3;
                            AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), obj4, startRestartGroup, (i9 & 14) | ((i3 >> 12) & 112), 0), AnimatedVisibilityKt$AnimatedVisibility$5.INSTANCE, companion, plus, obj3, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i9 & 458752));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            exitTransition2 = obj3;
                            str2 = obj4;
                            obj = companion;
                            enterTransition2 = plus;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            enterTransition2 = obj2;
                            exitTransition2 = obj3;
                            str2 = obj4;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new AnimatedVisibilityKt$AnimatedVisibility$6(columnScope, z, obj, enterTransition2, exitTransition2, str2, content, i, i2));
                        return;
                    }
                    i7 = 1572864;
                    i3 |= i7;
                    if ((i3 & 2995921) == 599184) {
                    }
                    if (i8 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i92 = i3 >> 3;
                    AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), obj4, startRestartGroup, (i92 & 14) | ((i3 >> 12) & 112), 0), AnimatedVisibilityKt$AnimatedVisibility$5.INSTANCE, companion, plus, obj3, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i92 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    exitTransition2 = obj3;
                    str2 = obj4;
                    obj = companion;
                    enterTransition2 = plus;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                obj3 = exitTransition;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                if ((i2 & 32) != 0) {
                }
                i3 |= i7;
                if ((i3 & 2995921) == 599184) {
                }
                if (i8 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                int i922 = i3 >> 3;
                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), obj4, startRestartGroup, (i922 & 14) | ((i3 >> 12) & 112), 0), AnimatedVisibilityKt$AnimatedVisibility$5.INSTANCE, companion, plus, obj3, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i922 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                }
                exitTransition2 = obj3;
                str2 = obj4;
                obj = companion;
                enterTransition2 = plus;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            obj2 = enterTransition;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            obj3 = exitTransition;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            if ((i2 & 32) != 0) {
            }
            i3 |= i7;
            if ((i3 & 2995921) == 599184) {
            }
            if (i8 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int i9222 = i3 >> 3;
            AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), obj4, startRestartGroup, (i9222 & 14) | ((i3 >> 12) & 112), 0), AnimatedVisibilityKt$AnimatedVisibility$5.INSTANCE, companion, plus, obj3, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i9222 & 458752));
            if (ComposerKt.isTraceInProgress()) {
            }
            exitTransition2 = obj3;
            str2 = obj4;
            obj = companion;
            enterTransition2 = plus;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        obj = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        obj2 = enterTransition;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        obj3 = exitTransition;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        if ((i2 & 32) != 0) {
        }
        i3 |= i7;
        if ((i3 & 2995921) == 599184) {
        }
        if (i8 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        int i92222 = i3 >> 3;
        AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), obj4, startRestartGroup, (i92222 & 14) | ((i3 >> 12) & 112), 0), AnimatedVisibilityKt$AnimatedVisibility$5.INSTANCE, companion, plus, obj3, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i92222 & 458752));
        if (ComposerKt.isTraceInProgress()) {
        }
        exitTransition2 = obj3;
        str2 = obj4;
        obj = companion;
        enterTransition2 = plus;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AnimatedVisibility(MutableTransitionState<Boolean> visibleState, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        Object obj2;
        int i5;
        Object obj3;
        int i6;
        Object obj4;
        int i7;
        Modifier modifier2;
        String str2;
        ExitTransition exitTransition2;
        EnterTransition enterTransition2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(visibleState, "visibleState");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-222898426);
        ComposerKt.sourceInformation(startRestartGroup, "C(AnimatedVisibility)P(5,4,1,2,3)381@20708L37,382@20750L73:AnimatedVisibility.kt#xbi5r1");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(visibleState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            obj = modifier;
            i3 |= startRestartGroup.changed(obj) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                obj2 = enterTransition;
                i3 |= startRestartGroup.changed(obj2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                } else if ((i & 7168) == 0) {
                    obj3 = exitTransition;
                    i3 |= startRestartGroup.changed(obj3) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 57344) == 0) {
                        obj4 = str;
                        i3 |= startRestartGroup.changed(obj4) ? 16384 : 8192;
                        if ((i2 & 32) == 0) {
                            if ((i & 458752) == 0) {
                                i7 = startRestartGroup.changedInstance(content) ? 131072 : 65536;
                            }
                            if ((374491 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                                Modifier.Companion companion = i8 == 0 ? Modifier.Companion : obj;
                                EnterTransition plus = i4 == 0 ? EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null)) : obj2;
                                ExitTransition plus2 = i5 == 0 ? EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null)) : obj3;
                                if (i6 != 0) {
                                    obj4 = "AnimatedVisibility";
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-222898426, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                                }
                                int i9 = i3 << 3;
                                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, obj4, startRestartGroup, MutableTransitionState.$stable | (i3 & 14) | ((i3 >> 9) & 112), 0), AnimatedVisibilityKt$AnimatedVisibility$7.INSTANCE, companion, plus, plus2, content, startRestartGroup, (i9 & 57344) | (i9 & 896) | 48 | (i9 & 7168) | (i3 & 458752));
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier2 = companion;
                                str2 = obj4;
                                exitTransition2 = plus2;
                                enterTransition2 = plus;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier2 = obj;
                                enterTransition2 = obj2;
                                exitTransition2 = obj3;
                                str2 = obj4;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup != null) {
                                return;
                            }
                            endRestartGroup.updateScope(new AnimatedVisibilityKt$AnimatedVisibility$8(visibleState, modifier2, enterTransition2, exitTransition2, str2, content, i, i2));
                            return;
                        }
                        i7 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        i3 |= i7;
                        if ((374491 & i3) == 74898) {
                        }
                        if (i8 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i92 = i3 << 3;
                        AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, obj4, startRestartGroup, MutableTransitionState.$stable | (i3 & 14) | ((i3 >> 9) & 112), 0), AnimatedVisibilityKt$AnimatedVisibility$7.INSTANCE, companion, plus, plus2, content, startRestartGroup, (i92 & 57344) | (i92 & 896) | 48 | (i92 & 7168) | (i3 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier2 = companion;
                        str2 = obj4;
                        exitTransition2 = plus2;
                        enterTransition2 = plus;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    obj4 = str;
                    if ((i2 & 32) == 0) {
                    }
                    i3 |= i7;
                    if ((374491 & i3) == 74898) {
                    }
                    if (i8 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i922 = i3 << 3;
                    AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, obj4, startRestartGroup, MutableTransitionState.$stable | (i3 & 14) | ((i3 >> 9) & 112), 0), AnimatedVisibilityKt$AnimatedVisibility$7.INSTANCE, companion, plus, plus2, content, startRestartGroup, (i922 & 57344) | (i922 & 896) | 48 | (i922 & 7168) | (i3 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = companion;
                    str2 = obj4;
                    exitTransition2 = plus2;
                    enterTransition2 = plus;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                obj3 = exitTransition;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                obj4 = str;
                if ((i2 & 32) == 0) {
                }
                i3 |= i7;
                if ((374491 & i3) == 74898) {
                }
                if (i8 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                int i9222 = i3 << 3;
                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, obj4, startRestartGroup, MutableTransitionState.$stable | (i3 & 14) | ((i3 >> 9) & 112), 0), AnimatedVisibilityKt$AnimatedVisibility$7.INSTANCE, companion, plus, plus2, content, startRestartGroup, (i9222 & 57344) | (i9222 & 896) | 48 | (i9222 & 7168) | (i3 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = companion;
                str2 = obj4;
                exitTransition2 = plus2;
                enterTransition2 = plus;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            obj2 = enterTransition;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            obj3 = exitTransition;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            obj4 = str;
            if ((i2 & 32) == 0) {
            }
            i3 |= i7;
            if ((374491 & i3) == 74898) {
            }
            if (i8 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int i92222 = i3 << 3;
            AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, obj4, startRestartGroup, MutableTransitionState.$stable | (i3 & 14) | ((i3 >> 9) & 112), 0), AnimatedVisibilityKt$AnimatedVisibility$7.INSTANCE, companion, plus, plus2, content, startRestartGroup, (i92222 & 57344) | (i92222 & 896) | 48 | (i92222 & 7168) | (i3 & 458752));
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = companion;
            str2 = obj4;
            exitTransition2 = plus2;
            enterTransition2 = plus;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        obj = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        obj2 = enterTransition;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        obj3 = exitTransition;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        obj4 = str;
        if ((i2 & 32) == 0) {
        }
        i3 |= i7;
        if ((374491 & i3) == 74898) {
        }
        if (i8 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        int i922222 = i3 << 3;
        AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, obj4, startRestartGroup, MutableTransitionState.$stable | (i3 & 14) | ((i3 >> 9) & 112), 0), AnimatedVisibilityKt$AnimatedVisibility$7.INSTANCE, companion, plus, plus2, content, startRestartGroup, (i922222 & 57344) | (i922222 & 896) | 48 | (i922222 & 7168) | (i3 & 458752));
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = companion;
        str2 = obj4;
        exitTransition2 = plus2;
        enterTransition2 = plus;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AnimatedVisibility(RowScope rowScope, MutableTransitionState<Boolean> visibleState, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        Object obj2;
        int i5;
        Object obj3;
        int i6;
        Object obj4;
        int i7;
        Modifier modifier2;
        String str2;
        EnterTransition enterTransition2;
        ExitTransition exitTransition2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(rowScope, "<this>");
        Intrinsics.checkNotNullParameter(visibleState, "visibleState");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(836509870);
        ComposerKt.sourceInformation(startRestartGroup, "C(AnimatedVisibility)P(5,4,1,2,3)456@25058L37,457@25100L73:AnimatedVisibility.kt#xbi5r1");
        if ((i2 & 1) != 0) {
            i3 = i | 48;
        } else if ((i & 112) == 0) {
            i3 = (startRestartGroup.changed(visibleState) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            obj = modifier;
            i3 |= startRestartGroup.changed(obj) ? 256 : 128;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                obj2 = enterTransition;
                i3 |= startRestartGroup.changed(obj2) ? 2048 : 1024;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 57344) == 0) {
                    obj3 = exitTransition;
                    i3 |= startRestartGroup.changed(obj3) ? 16384 : 8192;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        obj4 = str;
                    } else {
                        obj4 = str;
                        if ((i & 458752) == 0) {
                            i3 |= startRestartGroup.changed(obj4) ? 131072 : 65536;
                        }
                    }
                    if ((i2 & 32) != 0) {
                        if ((i & 3670016) == 0) {
                            i7 = startRestartGroup.changedInstance(content) ? 1048576 : 524288;
                        }
                        if ((i3 & 2995921) == 599184 || !startRestartGroup.getSkipping()) {
                            Modifier.Companion companion = i8 != 0 ? Modifier.Companion : obj;
                            EnterTransition plus = i4 != 0 ? EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null)) : obj2;
                            ExitTransition plus2 = i5 != 0 ? EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)) : obj3;
                            if (i6 != 0) {
                                obj4 = "AnimatedVisibility";
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(836509870, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                            }
                            int i9 = i3 >> 3;
                            AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, obj4, startRestartGroup, MutableTransitionState.$stable | (i9 & 14) | ((i3 >> 12) & 112), 0), AnimatedVisibilityKt$AnimatedVisibility$9.INSTANCE, companion, plus, plus2, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i9 & 458752));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = companion;
                            str2 = obj4;
                            enterTransition2 = plus;
                            exitTransition2 = plus2;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = obj;
                            enterTransition2 = obj2;
                            exitTransition2 = obj3;
                            str2 = obj4;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new AnimatedVisibilityKt$AnimatedVisibility$10(rowScope, visibleState, modifier2, enterTransition2, exitTransition2, str2, content, i, i2));
                        return;
                    }
                    i7 = 1572864;
                    i3 |= i7;
                    if ((i3 & 2995921) == 599184) {
                    }
                    if (i8 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i92 = i3 >> 3;
                    AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, obj4, startRestartGroup, MutableTransitionState.$stable | (i92 & 14) | ((i3 >> 12) & 112), 0), AnimatedVisibilityKt$AnimatedVisibility$9.INSTANCE, companion, plus, plus2, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i92 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = companion;
                    str2 = obj4;
                    enterTransition2 = plus;
                    exitTransition2 = plus2;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                obj3 = exitTransition;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                if ((i2 & 32) != 0) {
                }
                i3 |= i7;
                if ((i3 & 2995921) == 599184) {
                }
                if (i8 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                int i922 = i3 >> 3;
                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, obj4, startRestartGroup, MutableTransitionState.$stable | (i922 & 14) | ((i3 >> 12) & 112), 0), AnimatedVisibilityKt$AnimatedVisibility$9.INSTANCE, companion, plus, plus2, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i922 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = companion;
                str2 = obj4;
                enterTransition2 = plus;
                exitTransition2 = plus2;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            obj2 = enterTransition;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            obj3 = exitTransition;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            if ((i2 & 32) != 0) {
            }
            i3 |= i7;
            if ((i3 & 2995921) == 599184) {
            }
            if (i8 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int i9222 = i3 >> 3;
            AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, obj4, startRestartGroup, MutableTransitionState.$stable | (i9222 & 14) | ((i3 >> 12) & 112), 0), AnimatedVisibilityKt$AnimatedVisibility$9.INSTANCE, companion, plus, plus2, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i9222 & 458752));
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = companion;
            str2 = obj4;
            enterTransition2 = plus;
            exitTransition2 = plus2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        obj = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        obj2 = enterTransition;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        obj3 = exitTransition;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        if ((i2 & 32) != 0) {
        }
        i3 |= i7;
        if ((i3 & 2995921) == 599184) {
        }
        if (i8 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        int i92222 = i3 >> 3;
        AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, obj4, startRestartGroup, MutableTransitionState.$stable | (i92222 & 14) | ((i3 >> 12) & 112), 0), AnimatedVisibilityKt$AnimatedVisibility$9.INSTANCE, companion, plus, plus2, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i92222 & 458752));
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = companion;
        str2 = obj4;
        enterTransition2 = plus;
        exitTransition2 = plus2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AnimatedVisibility(ColumnScope columnScope, MutableTransitionState<Boolean> visibleState, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        Object obj2;
        int i5;
        Object obj3;
        int i6;
        Object obj4;
        int i7;
        Modifier modifier2;
        String str2;
        EnterTransition enterTransition2;
        ExitTransition exitTransition2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        Intrinsics.checkNotNullParameter(visibleState, "visibleState");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-850656618);
        ComposerKt.sourceInformation(startRestartGroup, "C(AnimatedVisibility)P(5,4,1,2,3)532@29500L37,533@29542L73:AnimatedVisibility.kt#xbi5r1");
        if ((i2 & 1) != 0) {
            i3 = i | 48;
        } else if ((i & 112) == 0) {
            i3 = (startRestartGroup.changed(visibleState) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            obj = modifier;
            i3 |= startRestartGroup.changed(obj) ? 256 : 128;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                obj2 = enterTransition;
                i3 |= startRestartGroup.changed(obj2) ? 2048 : 1024;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 57344) == 0) {
                    obj3 = exitTransition;
                    i3 |= startRestartGroup.changed(obj3) ? 16384 : 8192;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        obj4 = str;
                    } else {
                        obj4 = str;
                        if ((i & 458752) == 0) {
                            i3 |= startRestartGroup.changed(obj4) ? 131072 : 65536;
                        }
                    }
                    if ((i2 & 32) != 0) {
                        if ((i & 3670016) == 0) {
                            i7 = startRestartGroup.changedInstance(content) ? 1048576 : 524288;
                        }
                        if ((i3 & 2995921) == 599184 || !startRestartGroup.getSkipping()) {
                            Modifier.Companion companion = i8 != 0 ? Modifier.Companion : obj;
                            EnterTransition plus = i4 != 0 ? EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null)) : obj2;
                            ExitTransition plus2 = i5 != 0 ? EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)) : obj3;
                            if (i6 != 0) {
                                obj4 = "AnimatedVisibility";
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-850656618, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)");
                            }
                            int i9 = i3 >> 3;
                            AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, obj4, startRestartGroup, MutableTransitionState.$stable | (i9 & 14) | ((i3 >> 12) & 112), 0), AnimatedVisibilityKt$AnimatedVisibility$11.INSTANCE, companion, plus, plus2, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i9 & 458752));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = companion;
                            str2 = obj4;
                            enterTransition2 = plus;
                            exitTransition2 = plus2;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = obj;
                            enterTransition2 = obj2;
                            exitTransition2 = obj3;
                            str2 = obj4;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new AnimatedVisibilityKt$AnimatedVisibility$12(columnScope, visibleState, modifier2, enterTransition2, exitTransition2, str2, content, i, i2));
                        return;
                    }
                    i7 = 1572864;
                    i3 |= i7;
                    if ((i3 & 2995921) == 599184) {
                    }
                    if (i8 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i92 = i3 >> 3;
                    AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, obj4, startRestartGroup, MutableTransitionState.$stable | (i92 & 14) | ((i3 >> 12) & 112), 0), AnimatedVisibilityKt$AnimatedVisibility$11.INSTANCE, companion, plus, plus2, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i92 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = companion;
                    str2 = obj4;
                    enterTransition2 = plus;
                    exitTransition2 = plus2;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                obj3 = exitTransition;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                if ((i2 & 32) != 0) {
                }
                i3 |= i7;
                if ((i3 & 2995921) == 599184) {
                }
                if (i8 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                int i922 = i3 >> 3;
                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, obj4, startRestartGroup, MutableTransitionState.$stable | (i922 & 14) | ((i3 >> 12) & 112), 0), AnimatedVisibilityKt$AnimatedVisibility$11.INSTANCE, companion, plus, plus2, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i922 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = companion;
                str2 = obj4;
                enterTransition2 = plus;
                exitTransition2 = plus2;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            obj2 = enterTransition;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            obj3 = exitTransition;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            if ((i2 & 32) != 0) {
            }
            i3 |= i7;
            if ((i3 & 2995921) == 599184) {
            }
            if (i8 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int i9222 = i3 >> 3;
            AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, obj4, startRestartGroup, MutableTransitionState.$stable | (i9222 & 14) | ((i3 >> 12) & 112), 0), AnimatedVisibilityKt$AnimatedVisibility$11.INSTANCE, companion, plus, plus2, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i9222 & 458752));
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = companion;
            str2 = obj4;
            enterTransition2 = plus;
            exitTransition2 = plus2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        obj = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        obj2 = enterTransition;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        obj3 = exitTransition;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        if ((i2 & 32) != 0) {
        }
        i3 |= i7;
        if ((i3 & 2995921) == 599184) {
        }
        if (i8 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        int i92222 = i3 >> 3;
        AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, obj4, startRestartGroup, MutableTransitionState.$stable | (i92222 & 14) | ((i3 >> 12) & 112), 0), AnimatedVisibilityKt$AnimatedVisibility$11.INSTANCE, companion, plus, plus2, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i92222 & 458752));
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = companion;
        str2 = obj4;
        enterTransition2 = plus;
        exitTransition2 = plus2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> void AnimatedVisibility(Transition<T> transition, Function1<? super T, Boolean> visible, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        Object obj2;
        int i5;
        Object obj3;
        int i6;
        ExitTransition exitTransition2;
        EnterTransition enterTransition2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(visible, "visible");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1031950689);
        ComposerKt.sourceInformation(startRestartGroup, "C(AnimatedVisibility)P(4,3,1,2)606@33860L68:AnimatedVisibility.kt#xbi5r1");
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(transition) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changedInstance(visible) ? 32 : 16;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            obj = modifier;
            i3 |= startRestartGroup.changed(obj) ? 256 : 128;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                obj2 = enterTransition;
                i3 |= startRestartGroup.changed(obj2) ? 2048 : 1024;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 57344) == 0) {
                    obj3 = exitTransition;
                    i3 |= startRestartGroup.changed(obj3) ? 16384 : 8192;
                    if ((i2 & 16) != 0) {
                        if ((i & 458752) == 0) {
                            i6 = startRestartGroup.changedInstance(content) ? 131072 : 65536;
                        }
                        if ((374491 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                            Modifier.Companion companion = i7 != 0 ? Modifier.Companion : obj;
                            EnterTransition plus = i4 != 0 ? EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null)) : obj2;
                            if (i5 != 0) {
                                obj3 = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1031950689, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)");
                            }
                            AnimatedEnterExitImpl(transition, visible, companion, plus, obj3, content, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            exitTransition2 = obj3;
                            obj = companion;
                            enterTransition2 = plus;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            enterTransition2 = obj2;
                            exitTransition2 = obj3;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new AnimatedVisibilityKt$AnimatedVisibility$13(transition, visible, obj, enterTransition2, exitTransition2, content, i, i2));
                        return;
                    }
                    i6 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    i3 |= i6;
                    if ((374491 & i3) == 74898) {
                    }
                    if (i7 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    AnimatedEnterExitImpl(transition, visible, companion, plus, obj3, content, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    exitTransition2 = obj3;
                    obj = companion;
                    enterTransition2 = plus;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                obj3 = exitTransition;
                if ((i2 & 16) != 0) {
                }
                i3 |= i6;
                if ((374491 & i3) == 74898) {
                }
                if (i7 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                AnimatedEnterExitImpl(transition, visible, companion, plus, obj3, content, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                }
                exitTransition2 = obj3;
                obj = companion;
                enterTransition2 = plus;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            obj2 = enterTransition;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            obj3 = exitTransition;
            if ((i2 & 16) != 0) {
            }
            i3 |= i6;
            if ((374491 & i3) == 74898) {
            }
            if (i7 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            AnimatedEnterExitImpl(transition, visible, companion, plus, obj3, content, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
            if (ComposerKt.isTraceInProgress()) {
            }
            exitTransition2 = obj3;
            obj = companion;
            enterTransition2 = plus;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        obj = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        obj2 = enterTransition;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        obj3 = exitTransition;
        if ((i2 & 16) != 0) {
        }
        i3 |= i6;
        if ((374491 & i3) == 74898) {
        }
        if (i7 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        AnimatedEnterExitImpl(transition, visible, companion, plus, obj3, content, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
        if (ComposerKt.isTraceInProgress()) {
        }
        exitTransition2 = obj3;
        obj = companion;
        enterTransition2 = plus;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    @Deprecated(message = "AnimatedVisibility no longer accepts initiallyVisible as a parameter, please use AnimatedVisibility(MutableTransitionState, Modifier, ...) API instead", replaceWith = @ReplaceWith(expression = "AnimatedVisibility(transitionState = remember { MutableTransitionState(initiallyVisible) }\n.apply { targetState = visible },\nmodifier = modifier,\nenter = enter,\nexit = exit) {\ncontent() \n}", imports = {"androidx.compose.animation.core.MutableTransitionState"}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AnimatedVisibility(boolean z, Modifier modifier, EnterTransition enter, ExitTransition exit, boolean z2, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        Object rememberedValue;
        Modifier modifier2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(enter, "enter");
        Intrinsics.checkNotNullParameter(exit, "exit");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1121582420);
        ComposerKt.sourceInformation(startRestartGroup, "C(AnimatedVisibility)P(5,4,1,2,3)*709@38686L53,708@38647L214:AnimatedVisibility.kt#xbi5r1");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            obj = modifier;
            i3 |= startRestartGroup.changed(obj) ? 32 : 16;
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                i3 |= startRestartGroup.changed(enter) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                i3 |= startRestartGroup.changed(exit) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                i3 |= startRestartGroup.changed(z2) ? 16384 : 8192;
            }
            if ((i2 & 32) == 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((458752 & i) == 0) {
                i3 |= startRestartGroup.changedInstance(content) ? 131072 : 65536;
            }
            if ((374491 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                Modifier.Companion companion = i4 == 0 ? Modifier.Companion : obj;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1121582420, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:701)");
                }
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new MutableTransitionState(Boolean.valueOf(z2));
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                MutableTransitionState mutableTransitionState = (MutableTransitionState) rememberedValue;
                mutableTransitionState.setTargetState(Boolean.valueOf(z));
                AnimatedVisibility(mutableTransitionState, companion, enter, exit, (String) null, ComposableLambdaKt.composableLambda(startRestartGroup, 1996320812, true, new AnimatedVisibilityKt$AnimatedVisibility$16(content, i3)), startRestartGroup, MutableTransitionState.$stable | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i3 & 112) | (i3 & 896) | (i3 & 7168), 16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = companion;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier2 = obj;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new AnimatedVisibilityKt$AnimatedVisibility$17(z, modifier2, enter, exit, z2, content, i, i2));
            return;
        }
        obj = modifier;
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if ((374491 & i3) == 74898) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        MutableTransitionState mutableTransitionState2 = (MutableTransitionState) rememberedValue;
        mutableTransitionState2.setTargetState(Boolean.valueOf(z));
        AnimatedVisibility(mutableTransitionState2, companion, enter, exit, (String) null, ComposableLambdaKt.composableLambda(startRestartGroup, 1996320812, true, new AnimatedVisibilityKt$AnimatedVisibility$16(content, i3)), startRestartGroup, MutableTransitionState.$stable | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i3 & 112) | (i3 & 896) | (i3 & 7168), 16);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = companion;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> void AnimatedEnterExitImpl(Transition<T> transition, Function1<? super T, Boolean> function1, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(808253933);
        ComposerKt.sourceInformation(startRestartGroup, "C(AnimatedEnterExitImpl)P(4,5,3,1,2)734@39380L85,739@39603L116,743@39761L270,743@39729L302,752@40041L165:AnimatedVisibility.kt#xbi5r1");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(transition) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changed(enterTransition) ? 2048 : 1024;
        }
        if ((i & 57344) == 0) {
            i2 |= startRestartGroup.changed(exitTransition) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function3) ? 131072 : 65536;
        }
        int i3 = i2;
        if ((374491 & i3) != 74898 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(808253933, i3, -1, "androidx.compose.animation.AnimatedEnterExitImpl (AnimatedVisibility.kt:726)");
            }
            int i4 = i3 & 14;
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(transition);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(function1.invoke(transition.getCurrentState()), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            MutableState mutableState = (MutableState) rememberedValue;
            if (function1.invoke(transition.getTargetState()).booleanValue() || ((Boolean) mutableState.getValue()).booleanValue() || transition.isSeeking()) {
                int i5 = i4 | 48;
                startRestartGroup.startReplaceableGroup(1215497572);
                ComposerKt.sourceInformation(startRestartGroup, "CC(createChildTransition)786@31174L36,787@31234L74,788@31331L39,789@31382L63:Transition.kt#pdpnli");
                int i6 = i5 & 14;
                startRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                boolean changed2 = startRestartGroup.changed(transition);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = transition.getCurrentState();
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceableGroup();
                if (transition.isSeeking()) {
                    rememberedValue2 = transition.getCurrentState();
                }
                int i7 = (i5 >> 3) & 112;
                startRestartGroup.startReplaceableGroup(-1220581778);
                ComposerKt.sourceInformation(startRestartGroup, "C740@39681L28:AnimatedVisibility.kt#xbi5r1");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1220581778, i7, -1, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:739)");
                }
                int i8 = i4 | (i3 & 112) | ((i7 << 6) & 896);
                EnterExitState targetEnterExit = targetEnterExit(transition, function1, rememberedValue2, startRestartGroup, i8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                startRestartGroup.endReplaceableGroup();
                T targetState = transition.getTargetState();
                startRestartGroup.startReplaceableGroup(-1220581778);
                ComposerKt.sourceInformation(startRestartGroup, "C740@39681L28:AnimatedVisibility.kt#xbi5r1");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1220581778, i7, -1, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:739)");
                }
                EnterExitState targetEnterExit2 = targetEnterExit(transition, function1, targetState, startRestartGroup, i8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                startRestartGroup.endReplaceableGroup();
                Transition createChildTransitionInternal = androidx.compose.animation.core.TransitionKt.createChildTransitionInternal(transition, targetEnterExit, targetEnterExit2, "EnterExitTransition", startRestartGroup, i6 | ((i5 << 6) & 7168));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                boolean changed3 = startRestartGroup.changed(createChildTransitionInternal) | startRestartGroup.changed(mutableState);
                AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1 rememberedValue3 = startRestartGroup.rememberedValue();
                if (changed3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                    rememberedValue3 = new AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1(createChildTransitionInternal, mutableState, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                startRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(createChildTransitionInternal, (Function2) rememberedValue3, startRestartGroup, 64);
                int i9 = i3 >> 3;
                int i10 = (i9 & 57344) | (i9 & 112) | (i9 & 896) | (i9 & 7168);
                startRestartGroup.startReplaceableGroup(-1967270694);
                ComposerKt.sourceInformation(startRestartGroup, "CC(AnimatedEnterExitImpl)P(4,3,1,2)777@40847L64,780@41019L39,781@41089L50,778@40920L229:AnimatedVisibility.kt#xbi5r1");
                if (createChildTransitionInternal.getCurrentState() == EnterExitState.Visible || createChildTransitionInternal.getTargetState() == EnterExitState.Visible) {
                    int i11 = i10 & 14;
                    startRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    boolean changed4 = startRestartGroup.changed(createChildTransitionInternal);
                    Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if (changed4 || rememberedValue4 == Composer.Companion.getEmpty()) {
                        rememberedValue4 = new AnimatedVisibilityScopeImpl(createChildTransitionInternal);
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    startRestartGroup.endReplaceableGroup();
                    AnimatedVisibilityScopeImpl animatedVisibilityScopeImpl = (AnimatedVisibilityScopeImpl) rememberedValue4;
                    int i12 = i10 >> 3;
                    composer2 = startRestartGroup;
                    Modifier then = modifier.then(EnterExitTransitionKt.createModifier(createChildTransitionInternal, enterTransition, exitTransition, "Built-in", startRestartGroup, i11 | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | (i12 & 112) | (i12 & 896)));
                    composer2.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(composer2, "CC(remember):Composables.kt#9igjgp");
                    Object rememberedValue5 = composer2.rememberedValue();
                    if (rememberedValue5 == Composer.Companion.getEmpty()) {
                        rememberedValue5 = new AnimatedEnterExitMeasurePolicy(animatedVisibilityScopeImpl);
                        composer2.updateRememberedValue(rememberedValue5);
                    }
                    composer2.endReplaceableGroup();
                    MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue5;
                    composer2.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(then);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer m2893constructorimpl = Updater.m2893constructorimpl(composer2);
                    Updater.m2900setimpl(m2893constructorimpl, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                    if (m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composer2, -174037743, "C779@40958L9:AnimatedVisibility.kt#xbi5r1");
                    function3.invoke(animatedVisibilityScopeImpl, composer2, Integer.valueOf(((i10 >> 9) & 112) | 8));
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                } else {
                    composer2 = startRestartGroup;
                }
                composer2.endReplaceableGroup();
            } else {
                composer2 = startRestartGroup;
            }
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
        endRestartGroup.updateScope(new AnimatedVisibilityKt$AnimatedEnterExitImpl$2(transition, function1, modifier, enterTransition, exitTransition, function3, i));
    }

    private static final void AnimatedEnterExitImpl(Transition<EnterExitState> transition, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i) {
        composer.startReplaceableGroup(-1967270694);
        ComposerKt.sourceInformation(composer, "CC(AnimatedEnterExitImpl)P(4,3,1,2)777@40847L64,780@41019L39,781@41089L50,778@40920L229:AnimatedVisibility.kt#xbi5r1");
        if (transition.getCurrentState() == EnterExitState.Visible || transition.getTargetState() == EnterExitState.Visible) {
            int i2 = i & 14;
            composer.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed = composer.changed(transition);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new AnimatedVisibilityScopeImpl(transition);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            AnimatedVisibilityScopeImpl animatedVisibilityScopeImpl = (AnimatedVisibilityScopeImpl) rememberedValue;
            int i3 = i >> 3;
            Modifier then = modifier.then(EnterExitTransitionKt.createModifier(transition, enterTransition, exitTransition, "Built-in", composer, i2 | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | (i3 & 112) | (i3 & 896)));
            composer.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new AnimatedEnterExitMeasurePolicy(animatedVisibilityScopeImpl);
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue2;
            composer.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composer, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(then);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m2893constructorimpl = Updater.m2893constructorimpl(composer);
            Updater.m2900setimpl(m2893constructorimpl, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(composer, -174037743, "C779@40958L9:AnimatedVisibility.kt#xbi5r1");
            function3.invoke(animatedVisibilityScopeImpl, composer, Integer.valueOf(((i >> 9) & 112) | 8));
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
        }
        composer.endReplaceableGroup();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> EnterExitState targetEnterExit(Transition<T> transition, Function1<? super T, Boolean> function1, T t, Composer composer, int i) {
        EnterExitState enterExitState;
        composer.startReplaceableGroup(361571134);
        ComposerKt.sourceInformation(composer, "C(targetEnterExit)P(1):AnimatedVisibility.kt#xbi5r1");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(361571134, i, -1, "androidx.compose.animation.targetEnterExit (AnimatedVisibility.kt:830)");
        }
        composer.startMovableGroup(-721837504, transition);
        ComposerKt.sourceInformation(composer, "846@43297L34");
        if (transition.isSeeking()) {
            if (function1.invoke(t).booleanValue()) {
                enterExitState = EnterExitState.Visible;
            } else if (function1.invoke(transition.getCurrentState()).booleanValue()) {
                enterExitState = EnterExitState.PostExit;
            } else {
                enterExitState = EnterExitState.PreEnter;
            }
        } else {
            composer.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            MutableState mutableState = (MutableState) rememberedValue;
            if (function1.invoke(transition.getCurrentState()).booleanValue()) {
                mutableState.setValue(true);
            }
            if (function1.invoke(t).booleanValue()) {
                enterExitState = EnterExitState.Visible;
            } else if (((Boolean) mutableState.getValue()).booleanValue()) {
                enterExitState = EnterExitState.PostExit;
            } else {
                enterExitState = EnterExitState.PreEnter;
            }
        }
        composer.endMovableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return enterExitState;
    }
}
