package androidx.compose.material;

import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: SwipeToDismiss.kt */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0081\u0001\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e0\r2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00040\r¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00122\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00040\r¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0002\u0010\u0014\u001a\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0002\u001a-\u0010\u0019\u001a\u00020\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u00172\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001c0\rH\u0007¢\u0006\u0002\u0010\u001d\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"DISMISS_THRESHOLD", "Landroidx/compose/ui/unit/Dp;", "F", "SwipeToDismiss", "", "state", "Landroidx/compose/material/DismissState;", "modifier", "Landroidx/compose/ui/Modifier;", "directions", "", "Landroidx/compose/material/DismissDirection;", "dismissThresholds", "Lkotlin/Function1;", "Landroidx/compose/material/ThresholdConfig;", "background", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "dismissContent", "(Landroidx/compose/material/DismissState;Landroidx/compose/ui/Modifier;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "getDismissDirection", "from", "Landroidx/compose/material/DismissValue;", "to", "rememberDismissState", "initialValue", "confirmStateChange", "", "(Landroidx/compose/material/DismissValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/DismissState;", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SwipeToDismissKt {
    private static final float DISMISS_THRESHOLD = Dp.m5607constructorimpl(56);

    public static final DismissState rememberDismissState(DismissValue dismissValue, Function1<? super DismissValue, Boolean> function1, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1753522702);
        ComposerKt.sourceInformation(composer, "C(rememberDismissState)P(1)152@5427L62,152@5362L127:SwipeToDismiss.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            dismissValue = DismissValue.Default;
        }
        if ((i2 & 2) != 0) {
            function1 = SwipeToDismissKt$rememberDismissState$1.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1753522702, i, -1, "androidx.compose.material.rememberDismissState (SwipeToDismiss.kt:148)");
        }
        Object[] objArr = new Object[0];
        Saver<DismissState, DismissValue> Saver = DismissState.Companion.Saver(function1);
        composer.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1,2):Composables.kt#9igjgp");
        boolean changed = composer.changed(dismissValue) | composer.changed(function1);
        SwipeToDismissKt$rememberDismissState$2$1 rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new SwipeToDismissKt$rememberDismissState$2$1(dismissValue, function1);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        DismissState dismissState = (DismissState) RememberSaveableKt.m2907rememberSaveable(objArr, Saver, (String) null, (Function0<? extends Object>) rememberedValue, composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return dismissState;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SwipeToDismiss(DismissState state, Modifier modifier, Set<? extends DismissDirection> set, Function1<? super DismissDirection, ? extends ThresholdConfig> function1, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> background, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> dismissContent, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        int i5;
        Object obj2;
        int i6;
        int i7;
        Composer composer2;
        Modifier modifier2;
        Set<? extends DismissDirection> set2;
        Function1<? super DismissDirection, ? extends ThresholdConfig> function12;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(dismissContent, "dismissContent");
        Composer startRestartGroup = composer.startRestartGroup(634380143);
        ComposerKt.sourceInformation(startRestartGroup, "C(SwipeToDismiss)P(5,4,1,3)181@6582L1407:SwipeToDismiss.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(state) ? 4 : 2) | i;
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
            if (i4 != 0) {
                i3 |= 128;
            }
            i5 = i2 & 8;
            if (i5 == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                obj2 = function1;
                i3 |= startRestartGroup.changedInstance(obj2) ? 2048 : 1024;
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((57344 & i) == 0) {
                    i3 |= startRestartGroup.changedInstance(background) ? 16384 : 8192;
                }
                if ((i2 & 32) == 0) {
                    if ((458752 & i) == 0) {
                        i6 = startRestartGroup.changedInstance(dismissContent) ? 131072 : 65536;
                    }
                    i7 = i3;
                    if (i4 == 4 || (374491 & i7) != 74898 || !startRestartGroup.getSkipping()) {
                        Modifier.Companion companion = i8 == 0 ? Modifier.Companion : obj;
                        Set<? extends DismissDirection> of = i4 == 0 ? SetsKt.setOf((Object[]) new DismissDirection[]{DismissDirection.EndToStart, DismissDirection.StartToEnd}) : set;
                        SwipeToDismissKt$SwipeToDismiss$1 swipeToDismissKt$SwipeToDismiss$1 = i5 == 0 ? SwipeToDismissKt$SwipeToDismiss$1.INSTANCE : obj2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(634380143, i7, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:172)");
                        }
                        composer2 = startRestartGroup;
                        BoxWithConstraintsKt.BoxWithConstraints(companion, null, false, ComposableLambdaKt.composableLambda(startRestartGroup, 338007641, true, new SwipeToDismissKt$SwipeToDismiss$2(of, swipeToDismissKt$SwipeToDismiss$1, i7, state, background, dismissContent)), startRestartGroup, ((i7 >> 3) & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = companion;
                        set2 = of;
                        function12 = swipeToDismissKt$SwipeToDismiss$1;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        set2 = set;
                        modifier2 = obj;
                        function12 = obj2;
                        composer2 = startRestartGroup;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new SwipeToDismissKt$SwipeToDismiss$3(state, modifier2, set2, function12, background, dismissContent, i, i2));
                    return;
                }
                i6 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i3 |= i6;
                i7 = i3;
                if (i4 == 4) {
                }
                if (i8 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                composer2 = startRestartGroup;
                BoxWithConstraintsKt.BoxWithConstraints(companion, null, false, ComposableLambdaKt.composableLambda(startRestartGroup, 338007641, true, new SwipeToDismissKt$SwipeToDismiss$2(of, swipeToDismissKt$SwipeToDismiss$1, i7, state, background, dismissContent)), startRestartGroup, ((i7 >> 3) & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, 6);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = companion;
                set2 = of;
                function12 = swipeToDismissKt$SwipeToDismiss$1;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            obj2 = function1;
            if ((i2 & 16) != 0) {
            }
            if ((i2 & 32) == 0) {
            }
            i3 |= i6;
            i7 = i3;
            if (i4 == 4) {
            }
            if (i8 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composer2 = startRestartGroup;
            BoxWithConstraintsKt.BoxWithConstraints(companion, null, false, ComposableLambdaKt.composableLambda(startRestartGroup, 338007641, true, new SwipeToDismissKt$SwipeToDismiss$2(of, swipeToDismissKt$SwipeToDismiss$1, i7, state, background, dismissContent)), startRestartGroup, ((i7 >> 3) & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, 6);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = companion;
            set2 = of;
            function12 = swipeToDismissKt$SwipeToDismiss$1;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        obj = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        obj2 = function1;
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) == 0) {
        }
        i3 |= i6;
        i7 = i3;
        if (i4 == 4) {
        }
        if (i8 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        composer2 = startRestartGroup;
        BoxWithConstraintsKt.BoxWithConstraints(companion, null, false, ComposableLambdaKt.composableLambda(startRestartGroup, 338007641, true, new SwipeToDismissKt$SwipeToDismiss$2(of, swipeToDismissKt$SwipeToDismiss$1, i7, state, background, dismissContent)), startRestartGroup, ((i7 >> 3) & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, 6);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = companion;
        set2 = of;
        function12 = swipeToDismissKt$SwipeToDismiss$1;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DismissDirection getDismissDirection(DismissValue dismissValue, DismissValue dismissValue2) {
        if (dismissValue == dismissValue2 && dismissValue == DismissValue.Default) {
            return null;
        }
        if (dismissValue == dismissValue2 && dismissValue == DismissValue.DismissedToEnd) {
            return DismissDirection.StartToEnd;
        }
        if (dismissValue == dismissValue2 && dismissValue == DismissValue.DismissedToStart) {
            return DismissDirection.EndToStart;
        }
        if (dismissValue == DismissValue.Default && dismissValue2 == DismissValue.DismissedToEnd) {
            return DismissDirection.StartToEnd;
        }
        if (dismissValue == DismissValue.Default && dismissValue2 == DismissValue.DismissedToStart) {
            return DismissDirection.EndToStart;
        }
        if (dismissValue == DismissValue.DismissedToEnd && dismissValue2 == DismissValue.Default) {
            return DismissDirection.StartToEnd;
        }
        if (dismissValue == DismissValue.DismissedToStart && dismissValue2 == DismissValue.Default) {
            return DismissDirection.EndToStart;
        }
        return null;
    }
}
