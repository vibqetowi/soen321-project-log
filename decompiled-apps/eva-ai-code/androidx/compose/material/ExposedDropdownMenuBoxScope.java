package androidx.compose.material;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.material.internal.ExposedDropdownMenuPopupKt;
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
import androidx.profileinstaller.ProfileVerifier;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ExposedDropdownMenu.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001JU\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0017¢\u0006\u0002\u0010\u0011J\u0016\u0010\u0012\u001a\u00020\t*\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0003"}, d2 = {"Landroidx/compose/material/ExposedDropdownMenuBoxScope;", "", "ExposedDropdownMenu", "", "expanded", "", "onDismissRequest", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "scrollState", "Landroidx/compose/foundation/ScrollState;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "exposedDropdownSize", "matchTextFieldWidth", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ExposedDropdownMenuBoxScope {
    void ExposedDropdownMenu(boolean z, Function0<Unit> function0, Modifier modifier, ScrollState scrollState, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i, int i2);

    Modifier exposedDropdownSize(Modifier modifier, boolean z);

    /* compiled from: ExposedDropdownMenu.kt */
    /* renamed from: androidx.compose.material.ExposedDropdownMenuBoxScope$-CC */
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
        /* JADX WARN: Removed duplicated region for block: B:155:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:163:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:166:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:167:0x0091  */
        /* JADX WARN: Removed duplicated region for block: B:176:0x00a7  */
        /* JADX WARN: Removed duplicated region for block: B:177:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:200:0x00f6  */
        /* JADX WARN: Removed duplicated region for block: B:201:0x00fb  */
        /* JADX WARN: Removed duplicated region for block: B:204:0x0100  */
        /* JADX WARN: Removed duplicated region for block: B:205:0x010b  */
        /* JADX WARN: Removed duplicated region for block: B:209:0x0118  */
        /* JADX WARN: Removed duplicated region for block: B:212:0x0136  */
        /* JADX WARN: Removed duplicated region for block: B:221:0x017c  */
        /* JADX WARN: Removed duplicated region for block: B:230:0x0220  */
        /* JADX WARN: Type inference failed for: r2v5 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static void $default$ExposedDropdownMenu(ExposedDropdownMenuBoxScope _this, boolean z, Function0 onDismissRequest, Modifier modifier, ScrollState scrollState, Function3 content, Composer composer, int i, int i2) {
            int i3;
            Object obj;
            ScrollState scrollState2;
            Object obj2;
            Object obj3;
            ScrollState rememberScrollState;
            Object rememberedValue;
            MutableTransitionState mutableTransitionState;
            Object rememberedValue2;
            boolean changed;
            ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1 rememberedValue3;
            Composer composer2;
            Modifier modifier2;
            ScrollState scrollState3;
            int i4;
            Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
            Intrinsics.checkNotNullParameter(content, "content");
            Composer startRestartGroup = composer.startRestartGroup(1081438217);
            ComposerKt.sourceInformation(startRestartGroup, "C(ExposedDropdownMenu)P(1,3,2,4)236@9131L21,248@9631L42,252@9833L51,253@9924L7,257@10071L139,261@10224L491:ExposedDropdownMenu.kt#jmzs0o");
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
            int i5 = i2 & 4;
            if (i5 != 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                obj = modifier;
                i3 |= startRestartGroup.changed(obj) ? 256 : 128;
                if ((i & 7168) != 0) {
                    if ((i2 & 8) == 0) {
                        scrollState2 = scrollState;
                        if (startRestartGroup.changed(scrollState2)) {
                            i4 = 2048;
                            i3 |= i4;
                        }
                    } else {
                        scrollState2 = scrollState;
                    }
                    i4 = 1024;
                    i3 |= i4;
                } else {
                    scrollState2 = scrollState;
                }
                if ((i2 & 16) == 0) {
                    i3 |= 24576;
                } else if ((57344 & i) == 0) {
                    i3 |= startRestartGroup.changedInstance(content) ? 16384 : 8192;
                }
                if ((i2 & 32) == 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((458752 & i) == 0) {
                    i3 |= startRestartGroup.changed(_this) ? 131072 : 65536;
                }
                if ((374491 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        Modifier.Companion companion = i5 == 0 ? Modifier.Companion : obj;
                        if ((i2 & 8) == 0) {
                            i3 &= -7169;
                            obj3 = companion;
                            rememberScrollState = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1081438217, i3, -1, "androidx.compose.material.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:232)");
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
                                ExposedDropdownMenuPopupKt.ExposedDropdownMenuPopup(onDismissRequest, new DropdownMenuPositionProvider(m5678getZeroRKDOV3M, density, rememberedValue3, null), ComposableLambdaKt.composableLambda(startRestartGroup, -1167205969, true, new ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1(mutableTransitionState, mutableState, rememberScrollState, _this, obj3, content, i3)), startRestartGroup, ((i3 >> 3) & 14) | 384, 0);
                            } else {
                                composer2 = startRestartGroup;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = obj3;
                            scrollState3 = rememberScrollState;
                        } else {
                            obj2 = companion;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        obj2 = obj;
                    }
                    rememberScrollState = scrollState2;
                    obj3 = obj2;
                    startRestartGroup.endDefaults();
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
                    ExposedDropdownMenuPopupKt.ExposedDropdownMenuPopup(onDismissRequest, new DropdownMenuPositionProvider(m5678getZeroRKDOV3M2, density2, rememberedValue3, null), ComposableLambdaKt.composableLambda(startRestartGroup, -1167205969, true, new ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1(mutableTransitionState, mutableState2, rememberScrollState, _this, obj3, content, i3)), startRestartGroup, ((i3 >> 3) & 14) | 384, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = obj3;
                    scrollState3 = rememberScrollState;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    scrollState3 = scrollState2;
                    composer2 = startRestartGroup;
                    modifier2 = obj;
                }
                ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2(_this, z, onDismissRequest, modifier2, scrollState3, content, i, i2));
                return;
            }
            obj = modifier;
            if ((i & 7168) != 0) {
            }
            if ((i2 & 16) == 0) {
            }
            if ((i2 & 32) == 0) {
            }
            if ((374491 & i3) == 74898) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i5 == 0) {
            }
            if ((i2 & 8) == 0) {
            }
        }
    }

    /* compiled from: ExposedDropdownMenu.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static void ExposedDropdownMenu(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, boolean z, Function0<Unit> onDismissRequest, Modifier modifier, ScrollState scrollState, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
            Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
            Intrinsics.checkNotNullParameter(content, "content");
            CC.$default$ExposedDropdownMenu(exposedDropdownMenuBoxScope, z, onDismissRequest, modifier, scrollState, content, composer, i, i2);
        }
    }
}
