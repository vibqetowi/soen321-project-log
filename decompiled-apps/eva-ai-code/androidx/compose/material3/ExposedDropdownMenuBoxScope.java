package androidx.compose.material3;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.material3.internal.ExposedDropdownMenuPopupKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpOffset;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ExposedDropdownMenu.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001JK\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0017¢\u0006\u0002\u0010\u000fJ\u0016\u0010\u0010\u001a\u00020\t*\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\u0005H&J\f\u0010\u0012\u001a\u00020\t*\u00020\tH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Landroidx/compose/material3/ExposedDropdownMenuBoxScope;", "", "ExposedDropdownMenu", "", "expanded", "", "onDismissRequest", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "exposedDropdownSize", "matchTextFieldWidth", "menuAnchor", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ExposedDropdownMenuBoxScope {
    void ExposedDropdownMenu(boolean z, Function0<Unit> function0, Modifier modifier, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i, int i2);

    Modifier exposedDropdownSize(Modifier modifier, boolean z);

    Modifier menuAnchor(Modifier modifier);

    /* compiled from: ExposedDropdownMenu.kt */
    /* renamed from: androidx.compose.material3.ExposedDropdownMenuBoxScope$-CC  reason: invalid class name */
    /* loaded from: classes.dex */
    public final /* synthetic */ class CC {
        public static /* synthetic */ Modifier exposedDropdownSize$default(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, Modifier modifier, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = true;
                }
                return exposedDropdownMenuBoxScope.exposedDropdownSize(modifier, z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: exposedDropdownSize");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x00bb  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x00c2  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x00ca  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x00e8  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0130  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x01d2  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x01de  */
        /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r2v5 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static void $default$ExposedDropdownMenu(ExposedDropdownMenuBoxScope _this, boolean z, Function0 onDismissRequest, Modifier modifier, Function3 content, Composer composer, int i, int i2) {
            int i3;
            Object obj;
            Modifier.Companion companion;
            Object rememberedValue;
            MutableTransitionState mutableTransitionState;
            Object rememberedValue2;
            boolean changed;
            ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1 rememberedValue3;
            Composer composer2;
            Modifier modifier2;
            ScopeUpdateScope endRestartGroup;
            Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
            Intrinsics.checkNotNullParameter(content, "content");
            Composer startRestartGroup = composer.startRestartGroup(-1658683708);
            ComposerKt.sourceInformation(startRestartGroup, "C(ExposedDropdownMenu)P(1,3,2)259@10868L42,263@11070L51,264@11161L7,268@11308L139,272@11461L444:ExposedDropdownMenu.kt#uh7d8r");
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
                i3 |= startRestartGroup.changedInstance(onDismissRequest) ? 32 : 16;
            }
            int i4 = i2 & 4;
            if (i4 != 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                obj = modifier;
                i3 |= startRestartGroup.changed(obj) ? 256 : 128;
                if ((i2 & 8) == 0) {
                    i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                } else if ((i & 7168) == 0) {
                    i3 |= startRestartGroup.changedInstance(content) ? 2048 : 1024;
                }
                if ((i2 & 16) == 0) {
                    i3 |= 24576;
                } else if ((57344 & i) == 0) {
                    i3 |= startRestartGroup.changed(_this) ? 16384 : 8192;
                }
                if ((46811 & i3) == 9362 || !startRestartGroup.getSkipping()) {
                    companion = i4 == 0 ? Modifier.Companion : obj;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1658683708, i3, -1, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:244)");
                    }
                    startRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new MutableTransitionState(false);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceableGroup();
                    mutableTransitionState = (MutableTransitionState) rememberedValue;
                    mutableTransitionState.setTargetState(Boolean.valueOf(z));
                    if (!((Boolean) mutableTransitionState.getCurrentState()).booleanValue() || ((Boolean) mutableTransitionState.getTargetState()).booleanValue()) {
                        startRestartGroup.startReplaceableGroup(-492369756);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == Composer.Companion.getEmpty()) {
                            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TransformOrigin.m3669boximpl(TransformOrigin.Companion.m3682getCenterSzJe1aQ()), null, 2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        startRestartGroup.endReplaceableGroup();
                        MutableState mutableState = (MutableState) rememberedValue2;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        Density density = (Density) consume;
                        long m5678getZeroRKDOV3M = DpOffset.Companion.m5678getZeroRKDOV3M();
                        startRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        changed = startRestartGroup.changed(mutableState);
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (!changed || rememberedValue3 == Composer.Companion.getEmpty()) {
                            rememberedValue3 = new ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1(mutableState);
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        startRestartGroup.endReplaceableGroup();
                        composer2 = startRestartGroup;
                        ExposedDropdownMenuPopupKt.ExposedDropdownMenuPopup(onDismissRequest, new DropdownMenuPositionProvider(m5678getZeroRKDOV3M, density, rememberedValue3, null), ComposableLambdaKt.composableLambda(startRestartGroup, 395026654, true, new ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1(mutableTransitionState, mutableState, _this, companion, content, i3)), startRestartGroup, ((i3 >> 3) & 14) | 384, 0);
                    } else {
                        composer2 = startRestartGroup;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = companion;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier2 = obj;
                    composer2 = startRestartGroup;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    return;
                }
                endRestartGroup.updateScope(new ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2(_this, z, onDismissRequest, modifier2, content, i, i2));
                return;
            }
            obj = modifier;
            if ((i2 & 8) == 0) {
            }
            if ((i2 & 16) == 0) {
            }
            if ((46811 & i3) == 9362) {
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
            mutableTransitionState = (MutableTransitionState) rememberedValue;
            mutableTransitionState.setTargetState(Boolean.valueOf(z));
            if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
            }
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.Companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            MutableState mutableState2 = (MutableState) rememberedValue2;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density2 = (Density) consume2;
            long m5678getZeroRKDOV3M2 = DpOffset.Companion.m5678getZeroRKDOV3M();
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            changed = startRestartGroup.changed(mutableState2);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue3 = new ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1(mutableState2);
            startRestartGroup.updateRememberedValue(rememberedValue3);
            startRestartGroup.endReplaceableGroup();
            composer2 = startRestartGroup;
            ExposedDropdownMenuPopupKt.ExposedDropdownMenuPopup(onDismissRequest, new DropdownMenuPositionProvider(m5678getZeroRKDOV3M2, density2, rememberedValue3, null), ComposableLambdaKt.composableLambda(startRestartGroup, 395026654, true, new ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1(mutableTransitionState, mutableState2, _this, companion, content, i3)), startRestartGroup, ((i3 >> 3) & 14) | 384, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = companion;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
    }
}
