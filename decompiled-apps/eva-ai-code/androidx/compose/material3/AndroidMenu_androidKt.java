package androidx.compose.material3;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingValues;
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
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupProperties;
import androidx.constraintlayout.core.motion.utils.TypedValues;
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
/* compiled from: AndroidMenu.android.kt */
@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ag\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u008e\u0001\u0010\u0013\u001a\u00020\u00012\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\u0002\b\u000f2\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\u0002\b\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001eH\u0007¢\u0006\u0002\u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006 "}, d2 = {"DropdownMenu", "", "expanded", "", "onDismissRequest", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", TypedValues.CycleType.S_WAVE_OFFSET, "Landroidx/compose/ui/unit/DpOffset;", "properties", "Landroidx/compose/ui/window/PopupProperties;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "DropdownMenu-ILWXrKs", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "DropdownMenuItem", "text", "onClick", "leadingIcon", "trailingIcon", "enabled", "colors", "Landroidx/compose/material3/MenuItemColors;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/MenuItemColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidMenu_androidKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01bd  */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* renamed from: DropdownMenu-ILWXrKs  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1569DropdownMenuILWXrKs(boolean z, Function0<Unit> onDismissRequest, Modifier modifier, long j, PopupProperties popupProperties, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        long j2;
        int i5;
        Object obj2;
        int i6;
        int i7;
        Modifier.Companion companion;
        Object rememberedValue;
        MutableTransitionState mutableTransitionState;
        Object rememberedValue2;
        boolean changed;
        AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1 rememberedValue3;
        long j3;
        PopupProperties popupProperties2;
        Modifier modifier2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(354826666);
        ComposerKt.sourceInformation(startRestartGroup, "C(DropdownMenu)P(1,4,2,3:c#ui.unit.DpOffset,5)81@4015L42,85@4205L51,86@4292L7,90@4416L131,94@4557L400:AndroidMenu.android.kt#uh7d8r");
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
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            obj = modifier;
            i3 |= startRestartGroup.changed(obj) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                j2 = j;
            } else {
                j2 = j;
                if ((i & 7168) == 0) {
                    i3 |= startRestartGroup.changed(j2) ? 2048 : 1024;
                }
            }
            i5 = i2 & 16;
            if (i5 == 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                obj2 = popupProperties;
                i3 |= startRestartGroup.changed(obj2) ? 16384 : 8192;
                if ((i2 & 32) == 0) {
                    if ((458752 & i) == 0) {
                        i6 = startRestartGroup.changedInstance(content) ? 131072 : 65536;
                    }
                    i7 = i3;
                    if ((374491 & i7) == 74898 || !startRestartGroup.getSkipping()) {
                        companion = i8 == 0 ? Modifier.Companion : obj;
                        if (i4 != 0) {
                            float f = 0;
                            j2 = DpKt.m5628DpOffsetYgX7TsA(Dp.m5607constructorimpl(f), Dp.m5607constructorimpl(f));
                        }
                        if (i5 != 0) {
                            obj2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(354826666, i7, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:73)");
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
                            startRestartGroup.startReplaceableGroup(1157296644);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                            changed = startRestartGroup.changed(mutableState);
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (!changed || rememberedValue3 == Composer.Companion.getEmpty()) {
                                rememberedValue3 = new AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1(mutableState);
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            startRestartGroup.endReplaceableGroup();
                            AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j2, density, rememberedValue3, null), onDismissRequest, obj2, ComposableLambdaKt.composableLambda(startRestartGroup, -1192563503, true, new AndroidMenu_androidKt$DropdownMenu$1(mutableTransitionState, mutableState, companion, content, i7)), startRestartGroup, (i7 & 112) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | ((i7 >> 6) & 896), 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j3 = j2;
                        popupProperties2 = obj2;
                        modifier2 = companion;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier2 = obj;
                        j3 = j2;
                        popupProperties2 = obj2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new AndroidMenu_androidKt$DropdownMenu$2(z, onDismissRequest, modifier2, j3, popupProperties2, content, i, i2));
                    return;
                }
                i6 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i3 |= i6;
                i7 = i3;
                if ((374491 & i7) == 74898) {
                }
                if (i8 == 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
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
                if (!((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
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
                startRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                changed = startRestartGroup.changed(mutableState2);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue3 = new AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1(mutableState2);
                startRestartGroup.updateRememberedValue(rememberedValue3);
                startRestartGroup.endReplaceableGroup();
                AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j2, density2, rememberedValue3, null), onDismissRequest, obj2, ComposableLambdaKt.composableLambda(startRestartGroup, -1192563503, true, new AndroidMenu_androidKt$DropdownMenu$1(mutableTransitionState, mutableState2, companion, content, i7)), startRestartGroup, (i7 & 112) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | ((i7 >> 6) & 896), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                j3 = j2;
                popupProperties2 = obj2;
                modifier2 = companion;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            obj2 = popupProperties;
            if ((i2 & 32) == 0) {
            }
            i3 |= i6;
            i7 = i3;
            if ((374491 & i7) == 74898) {
            }
            if (i8 == 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
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
            if (!((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
            }
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.Companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            MutableState mutableState22 = (MutableState) rememberedValue2;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume22 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density22 = (Density) consume22;
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            changed = startRestartGroup.changed(mutableState22);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue3 = new AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1(mutableState22);
            startRestartGroup.updateRememberedValue(rememberedValue3);
            startRestartGroup.endReplaceableGroup();
            AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j2, density22, rememberedValue3, null), onDismissRequest, obj2, ComposableLambdaKt.composableLambda(startRestartGroup, -1192563503, true, new AndroidMenu_androidKt$DropdownMenu$1(mutableTransitionState, mutableState22, companion, content, i7)), startRestartGroup, (i7 & 112) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | ((i7 >> 6) & 896), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            j3 = j2;
            popupProperties2 = obj2;
            modifier2 = companion;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        obj = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        obj2 = popupProperties;
        if ((i2 & 32) == 0) {
        }
        i3 |= i6;
        i7 = i3;
        if ((374491 & i7) == 74898) {
        }
        if (i8 == 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
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
        if (!((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
        }
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.Companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        MutableState mutableState222 = (MutableState) rememberedValue2;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume222 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Density density222 = (Density) consume222;
        startRestartGroup.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        changed = startRestartGroup.changed(mutableState222);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue3 = new AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1(mutableState222);
        startRestartGroup.updateRememberedValue(rememberedValue3);
        startRestartGroup.endReplaceableGroup();
        AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j2, density222, rememberedValue3, null), onDismissRequest, obj2, ComposableLambdaKt.composableLambda(startRestartGroup, -1192563503, true, new AndroidMenu_androidKt$DropdownMenu$1(mutableTransitionState, mutableState222, companion, content, i7)), startRestartGroup, (i7 & 112) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | ((i7 >> 6) & 896), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        j3 = j2;
        popupProperties2 = obj2;
        modifier2 = companion;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DropdownMenuItem(Function2<? super Composer, ? super Integer, Unit> text, Function0<Unit> onClick, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, boolean z, MenuItemColors menuItemColors, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Composer composer, int i, int i2) {
        int i3;
        int i4;
        int i5;
        Object obj;
        int i6;
        boolean z2;
        int i7;
        int i8;
        MenuItemColors menuItemColors2;
        MutableInteractionSource mutableInteractionSource2;
        PaddingValues paddingValues2;
        Modifier modifier2;
        Function2<? super Composer, ? super Integer, Unit> function23;
        Object obj2;
        boolean z3;
        MenuItemColors menuItemColors3;
        Composer composer2;
        Modifier modifier3;
        Function2<? super Composer, ? super Integer, Unit> function24;
        Function2<? super Composer, ? super Integer, Unit> function25;
        boolean z4;
        MenuItemColors menuItemColors4;
        PaddingValues paddingValues3;
        MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(1826340448);
        ComposerKt.sourceInformation(startRestartGroup, "C(DropdownMenuItem)P(7,6,5,4,8,2)144@6904L12,146@7049L39,148@7098L319:AndroidMenu.android.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changedInstance(text) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                i3 |= startRestartGroup.changedInstance(function2) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 57344) == 0) {
                    obj = function22;
                    i3 |= startRestartGroup.changedInstance(obj) ? 16384 : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & 458752) == 0) {
                        z2 = z;
                        i3 |= startRestartGroup.changed(z2) ? 131072 : 65536;
                        if ((i & 3670016) == 0) {
                            i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(menuItemColors)) ? 1048576 : 524288;
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
                        if ((i3 & 191739611) == 38347922 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier.Companion companion = i9 != 0 ? Modifier.Companion : modifier;
                                Function2<? super Composer, ? super Integer, Unit> function26 = i4 != 0 ? null : function2;
                                Object obj3 = i5 == 0 ? obj : null;
                                boolean z5 = i6 != 0 ? true : z2;
                                if ((i2 & 64) != 0) {
                                    menuItemColors2 = MenuDefaults.INSTANCE.m1871itemColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 1572864, 63);
                                    i3 &= -3670017;
                                } else {
                                    menuItemColors2 = menuItemColors;
                                }
                                PaddingValues dropdownMenuItemContentPadding = i7 != 0 ? MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding() : paddingValues;
                                if (i8 != 0) {
                                    startRestartGroup.startReplaceableGroup(-492369756);
                                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                    Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.Companion.getEmpty()) {
                                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    paddingValues2 = dropdownMenuItemContentPadding;
                                    modifier2 = companion;
                                    mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                                } else {
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    paddingValues2 = dropdownMenuItemContentPadding;
                                    modifier2 = companion;
                                }
                                function23 = function26;
                                obj2 = obj3;
                                z3 = z5;
                                menuItemColors3 = menuItemColors2;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                                function23 = function2;
                                menuItemColors3 = menuItemColors;
                                paddingValues2 = paddingValues;
                                mutableInteractionSource2 = mutableInteractionSource;
                                obj2 = obj;
                                z3 = z2;
                                modifier2 = modifier;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)");
                            }
                            composer2 = startRestartGroup;
                            MenuKt.DropdownMenuItemContent(text, onClick, modifier2, function23, obj2, z3, menuItemColors3, paddingValues2, mutableInteractionSource2, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752) | (i3 & 3670016) | (i3 & 29360128) | (i3 & 234881024));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier2;
                            function24 = function23;
                            function25 = obj2;
                            z4 = z3;
                            menuItemColors4 = menuItemColors3;
                            paddingValues3 = paddingValues2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            function24 = function2;
                            menuItemColors4 = menuItemColors;
                            mutableInteractionSource3 = mutableInteractionSource;
                            function25 = obj;
                            composer2 = startRestartGroup;
                            z4 = z2;
                            paddingValues3 = paddingValues;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new AndroidMenu_androidKt$DropdownMenuItem$2(text, onClick, modifier3, function24, function25, z4, menuItemColors4, paddingValues3, mutableInteractionSource3, i, i2));
                        return;
                    }
                    z2 = z;
                    if ((i & 3670016) == 0) {
                    }
                    i7 = i2 & 128;
                    if (i7 != 0) {
                    }
                    i8 = i2 & 256;
                    if (i8 != 0) {
                    }
                    if ((i3 & 191739611) == 38347922) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 != 0) {
                    }
                    if ((i2 & 64) != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    function23 = function26;
                    obj2 = obj3;
                    z3 = z5;
                    menuItemColors3 = menuItemColors2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composer2 = startRestartGroup;
                    MenuKt.DropdownMenuItemContent(text, onClick, modifier2, function23, obj2, z3, menuItemColors3, paddingValues2, mutableInteractionSource2, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752) | (i3 & 3670016) | (i3 & 29360128) | (i3 & 234881024));
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier2;
                    function24 = function23;
                    function25 = obj2;
                    z4 = z3;
                    menuItemColors4 = menuItemColors3;
                    paddingValues3 = paddingValues2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                obj = function22;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                z2 = z;
                if ((i & 3670016) == 0) {
                }
                i7 = i2 & 128;
                if (i7 != 0) {
                }
                i8 = i2 & 256;
                if (i8 != 0) {
                }
                if ((i3 & 191739611) == 38347922) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i9 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 == 0) {
                }
                if (i6 != 0) {
                }
                if ((i2 & 64) != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                function23 = function26;
                obj2 = obj3;
                z3 = z5;
                menuItemColors3 = menuItemColors2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                composer2 = startRestartGroup;
                MenuKt.DropdownMenuItemContent(text, onClick, modifier2, function23, obj2, z3, menuItemColors3, paddingValues2, mutableInteractionSource2, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752) | (i3 & 3670016) | (i3 & 29360128) | (i3 & 234881024));
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier2;
                function24 = function23;
                function25 = obj2;
                z4 = z3;
                menuItemColors4 = menuItemColors3;
                paddingValues3 = paddingValues2;
                mutableInteractionSource3 = mutableInteractionSource2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            obj = function22;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            z2 = z;
            if ((i & 3670016) == 0) {
            }
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            i8 = i2 & 256;
            if (i8 != 0) {
            }
            if ((i3 & 191739611) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i9 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 == 0) {
            }
            if (i6 != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            function23 = function26;
            obj2 = obj3;
            z3 = z5;
            menuItemColors3 = menuItemColors2;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            composer2 = startRestartGroup;
            MenuKt.DropdownMenuItemContent(text, onClick, modifier2, function23, obj2, z3, menuItemColors3, paddingValues2, mutableInteractionSource2, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752) | (i3 & 3670016) | (i3 & 29360128) | (i3 & 234881024));
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier2;
            function24 = function23;
            function25 = obj2;
            z4 = z3;
            menuItemColors4 = menuItemColors3;
            paddingValues3 = paddingValues2;
            mutableInteractionSource3 = mutableInteractionSource2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        obj = function22;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        z2 = z;
        if ((i & 3670016) == 0) {
        }
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        i8 = i2 & 256;
        if (i8 != 0) {
        }
        if ((i3 & 191739611) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i9 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 == 0) {
        }
        if (i6 != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        function23 = function26;
        obj2 = obj3;
        z3 = z5;
        menuItemColors3 = menuItemColors2;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        composer2 = startRestartGroup;
        MenuKt.DropdownMenuItemContent(text, onClick, modifier2, function23, obj2, z3, menuItemColors3, paddingValues2, mutableInteractionSource2, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752) | (i3 & 3670016) | (i3 & 29360128) | (i3 & 234881024));
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier2;
        function24 = function23;
        function25 = obj2;
        z4 = z3;
        menuItemColors4 = menuItemColors3;
        paddingValues3 = paddingValues2;
        mutableInteractionSource3 = mutableInteractionSource2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
