package androidx.compose.material;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Switch.kt */
@Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001aS\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!H\u0007¢\u0006\u0002\u0010\"\u001a?\u0010#\u001a\u00020\u0016*\u00020$2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010 \u001a\u00020!2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020&2\u0006\u0010\u001e\u001a\u00020'H\u0003¢\u0006\u0002\u0010(\u001a1\u0010)\u001a\u00020\u0016*\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u0002H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u00100\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\u0003\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u0013\u0010\u0006\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u000e\u0010\u0007\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u0013\u0010\b\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u0013\u0010\t\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u0013\u0010\n\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u0019\u0010\u000b\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\f\u0010\r\"\u0013\u0010\u000e\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u0013\u0010\u000f\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u0013\u0010\u0010\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u0019\u0010\u0011\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0012\u0010\r\"\u0019\u0010\u0013\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0014\u0010\r\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00061²\u0006\n\u00102\u001a\u00020\u0018X\u008a\u008e\u0002²\u0006\u0018\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u001aX\u008a\u0084\u0002²\u0006\n\u00104\u001a\u00020\u0018X\u008a\u0084\u0002²\u0006\n\u0010+\u001a\u00020,X\u008a\u0084\u0002²\u0006\n\u00105\u001a\u00020,X\u008a\u0084\u0002²\u0006\n\u00106\u001a\u00020,X\u008a\u0084\u0002"}, d2 = {"AnimationSpec", "Landroidx/compose/animation/core/TweenSpec;", "", "DefaultSwitchPadding", "Landroidx/compose/ui/unit/Dp;", "F", "SwitchHeight", "SwitchPositionalThreshold", "SwitchVelocityThreshold", "SwitchWidth", "ThumbDefaultElevation", "ThumbDiameter", "getThumbDiameter", "()F", "ThumbPathLength", "ThumbPressedElevation", "ThumbRippleRadius", "TrackStrokeWidth", "getTrackStrokeWidth", "TrackWidth", "getTrackWidth", "Switch", "", "checked", "", "onCheckedChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "colors", "Landroidx/compose/material/SwitchColors;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/SwitchColors;Landroidx/compose/runtime/Composer;II)V", "SwitchImpl", "Landroidx/compose/foundation/layout/BoxScope;", "thumbValue", "Lkotlin/Function0;", "Landroidx/compose/foundation/interaction/InteractionSource;", "(Landroidx/compose/foundation/layout/BoxScope;ZZLandroidx/compose/material/SwitchColors;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)V", "drawTrack", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "trackColor", "Landroidx/compose/ui/graphics/Color;", "trackWidth", "strokeWidth", "drawTrack-RPmYEkk", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFF)V", "material_release", "forceAnimationCheck", "currentOnCheckedChange", "currentChecked", "thumbColor", "resolvedThumbColor"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SwitchKt {
    private static final TweenSpec<Float> AnimationSpec;
    private static final float DefaultSwitchPadding;
    private static final float SwitchHeight;
    private static final float SwitchPositionalThreshold = 0.7f;
    private static final float SwitchVelocityThreshold;
    private static final float SwitchWidth;
    private static final float ThumbDefaultElevation;
    private static final float ThumbDiameter;
    private static final float ThumbPathLength;
    private static final float ThumbPressedElevation;
    private static final float ThumbRippleRadius;
    private static final float TrackStrokeWidth;
    private static final float TrackWidth;

    /* JADX WARN: Removed duplicated region for block: B:100:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x029b A[LOOP:0: B:115:0x0299->B:116:0x029b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0377 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Switch(boolean z, Function1<? super Boolean, Unit> function1, Modifier modifier, boolean z2, MutableInteractionSource mutableInteractionSource, SwitchColors switchColors, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        boolean z3;
        int i5;
        Object obj2;
        SwitchColors switchColors2;
        MutableInteractionSource mutableInteractionSource2;
        String str;
        int i6;
        Modifier modifier2;
        boolean z4;
        Object obj3;
        SwitchColors switchColors3;
        Object rememberedValue;
        boolean changed;
        Object rememberedValue2;
        boolean changed2;
        SwitchKt$Switch$2$1 rememberedValue3;
        int i7;
        int i8;
        boolean z5;
        SwitchKt$Switch$3$1 rememberedValue4;
        boolean changed3;
        SwitchKt$Switch$4$1 rememberedValue5;
        int i9;
        Composer composer2;
        Modifier.Companion companion;
        Modifier.Companion companion2;
        int currentCompositeKeyHash;
        Composer m2893constructorimpl;
        boolean changed4;
        SwitchKt$Switch$5$1$1 rememberedValue6;
        Composer composer3;
        Modifier modifier3;
        boolean z6;
        MutableInteractionSource mutableInteractionSource3;
        SwitchColors switchColors4;
        ScopeUpdateScope endRestartGroup;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(25866825);
        ComposerKt.sourceInformation(startRestartGroup, "C(Switch)P(!1,5,4,2,3)99@4619L39,100@4702L8,*103@4774L7,108@5156L34,109@5245L7,110@5322L314,118@5671L37,119@5735L29,120@5780L96,120@5769L107,123@5920L315,123@5881L354,132@6285L133,132@6240L178,137@6456L7,152@6897L1004:Switch.kt#jmzs0o");
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
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            obj = modifier;
            i3 |= startRestartGroup.changed(obj) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                z3 = z2;
                i3 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((57344 & i) == 0) {
                    obj2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(obj2) ? 16384 : 8192;
                    if ((i & 458752) != 0) {
                        if ((i2 & 32) == 0) {
                            switchColors2 = switchColors;
                            if (startRestartGroup.changed(switchColors2)) {
                                i10 = 131072;
                                i3 |= i10;
                            }
                        } else {
                            switchColors2 = switchColors;
                        }
                        i10 = 65536;
                        i3 |= i10;
                    } else {
                        switchColors2 = switchColors;
                    }
                    if ((374491 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion3 = i11 == 0 ? Modifier.Companion : obj;
                            boolean z7 = i4 == 0 ? true : z3;
                            if (i5 == 0) {
                                startRestartGroup.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                Object rememberedValue7 = startRestartGroup.rememberedValue();
                                if (rememberedValue7 == Composer.Companion.getEmpty()) {
                                    rememberedValue7 = InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue7);
                                }
                                startRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) rememberedValue7;
                            } else {
                                mutableInteractionSource2 = obj2;
                            }
                            if ((i2 & 32) == 0) {
                                str = "CC(remember):Composables.kt#9igjgp";
                                modifier2 = companion3;
                                z4 = z7;
                                obj3 = mutableInteractionSource2;
                                switchColors3 = SwitchDefaults.INSTANCE.m1483colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, startRestartGroup, 0, 6, AnalyticsListener.EVENT_DRM_KEYS_LOADED);
                                i6 = i3 & (-458753);
                            } else {
                                str = "CC(remember):Composables.kt#9igjgp";
                                i6 = i3;
                                modifier2 = companion3;
                                z4 = z7;
                                obj3 = mutableInteractionSource2;
                                switchColors3 = switchColors2;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            i6 = i3;
                            z4 = z3;
                            obj3 = obj2;
                            switchColors3 = switchColors2;
                            str = "CC(remember):Composables.kt#9igjgp";
                            modifier2 = obj;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(25866825, i6, -1, "androidx.compose.material.Switch (Switch.kt:94)");
                        }
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        float mo588toPx0680j_4 = ((Density) consume).mo588toPx0680j_4(ThumbPathLength);
                        startRestartGroup.startReplaceableGroup(-492369756);
                        ComposerKt.sourceInformation(startRestartGroup, str);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.Companion.getEmpty()) {
                            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        startRestartGroup.endReplaceableGroup();
                        MutableState mutableState = (MutableState) rememberedValue;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume2 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        float mo588toPx0680j_42 = ((Density) consume2).mo588toPx0680j_4(SwitchVelocityThreshold);
                        Float valueOf = Float.valueOf(mo588toPx0680j_42);
                        startRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        changed = startRestartGroup.changed(valueOf);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                            rememberedValue2 = new AnchoredDraggableState(Boolean.valueOf(z), SwitchKt$Switch$anchoredDraggableState$1$1.INSTANCE, new SwitchKt$Switch$anchoredDraggableState$1$2(mo588toPx0680j_42), AnimationSpec, null, 16, null);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        startRestartGroup.endReplaceableGroup();
                        AnchoredDraggableState anchoredDraggableState = (AnchoredDraggableState) rememberedValue2;
                        int i12 = i6 >> 3;
                        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, startRestartGroup, i12 & 14);
                        int i13 = i6 & 14;
                        State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z), startRestartGroup, i13);
                        Float valueOf2 = Float.valueOf(0.0f);
                        Float valueOf3 = Float.valueOf(mo588toPx0680j_4);
                        startRestartGroup.startReplaceableGroup(1618982084);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
                        changed2 = startRestartGroup.changed(anchoredDraggableState) | startRestartGroup.changed(valueOf2) | startRestartGroup.changed(valueOf3);
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (!changed2 || rememberedValue3 == Composer.Companion.getEmpty()) {
                            rememberedValue3 = new SwitchKt$Switch$2$1(anchoredDraggableState, 0.0f, mo588toPx0680j_4);
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        startRestartGroup.endReplaceableGroup();
                        EffectsKt.SideEffect((Function0) rememberedValue3, startRestartGroup, 0);
                        Object[] objArr = {anchoredDraggableState, rememberUpdatedState2, rememberUpdatedState, mutableState};
                        startRestartGroup.startReplaceableGroup(-568225417);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        i8 = 0;
                        z5 = false;
                        for (i7 = 4; i8 < i7; i7 = 4) {
                            z5 |= startRestartGroup.changed(objArr[i8]);
                            i8++;
                        }
                        rememberedValue4 = startRestartGroup.rememberedValue();
                        if (!z5 || rememberedValue4 == Composer.Companion.getEmpty()) {
                            rememberedValue4 = new SwitchKt$Switch$3$1(anchoredDraggableState, rememberUpdatedState2, rememberUpdatedState, mutableState, null);
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        }
                        startRestartGroup.endReplaceableGroup();
                        EffectsKt.LaunchedEffect(anchoredDraggableState, (Function2) rememberedValue4, startRestartGroup, 64);
                        Boolean valueOf4 = Boolean.valueOf(z);
                        Boolean valueOf5 = Boolean.valueOf(Switch$lambda$3(mutableState));
                        Boolean valueOf6 = Boolean.valueOf(z);
                        startRestartGroup.startReplaceableGroup(511388516);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                        changed3 = startRestartGroup.changed(valueOf6) | startRestartGroup.changed(anchoredDraggableState);
                        rememberedValue5 = startRestartGroup.rememberedValue();
                        if (!changed3 || rememberedValue5 == Composer.Companion.getEmpty()) {
                            rememberedValue5 = new SwitchKt$Switch$4$1(z, anchoredDraggableState, null);
                            startRestartGroup.updateRememberedValue(rememberedValue5);
                        }
                        startRestartGroup.endReplaceableGroup();
                        EffectsKt.LaunchedEffect(valueOf4, valueOf5, (Function2) rememberedValue5, startRestartGroup, i13 | 512);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume3 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        boolean z8 = consume3 != LayoutDirection.Rtl;
                        if (function1 == null) {
                            i9 = i12;
                            composer2 = startRestartGroup;
                            companion = ToggleableKt.m984toggleableO2vRcR0(Modifier.Companion, z, obj3, null, z4, Role.m4917boximpl(Role.Companion.m4929getSwitcho7Vup1c()), function1);
                        } else {
                            i9 = i12;
                            composer2 = startRestartGroup;
                            companion = Modifier.Companion;
                        }
                        if (function1 == null) {
                            companion2 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.Companion);
                        } else {
                            companion2 = Modifier.Companion;
                        }
                        Modifier m789requiredSizeVpY3zN4 = SizeKt.m789requiredSizeVpY3zN4(PaddingKt.m748padding3ABfNKs(SizeKt.wrapContentSize$default(AnchoredDraggableKt.anchoredDraggable(modifier2.then(companion2).then(companion), anchoredDraggableState, Orientation.Horizontal, (z4 || function1 == null) ? false : true, z8, obj3), Alignment.Companion.getCenter(), false, 2, null), DefaultSwitchPadding), SwitchWidth, SwitchHeight);
                        composer2.startReplaceableGroup(733328855);
                        ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer2, 0);
                        composer2.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m789requiredSizeVpY3zN4);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (!composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        m2893constructorimpl = Updater.m2893constructorimpl(composer2);
                        Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                        if (!m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer2, -1229337700, "C177@7792L42,173@7637L258:Switch.kt#jmzs0o");
                        boolean booleanValue = ((Boolean) anchoredDraggableState.getTargetValue()).booleanValue();
                        composer2.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                        changed4 = composer2.changed(anchoredDraggableState);
                        rememberedValue6 = composer2.rememberedValue();
                        if (!changed4 || rememberedValue6 == Composer.Companion.getEmpty()) {
                            rememberedValue6 = new SwitchKt$Switch$5$1$1(anchoredDraggableState);
                            composer2.updateRememberedValue(rememberedValue6);
                        }
                        composer2.endReplaceableGroup();
                        composer3 = composer2;
                        Modifier modifier4 = modifier2;
                        SwitchImpl(boxScopeInstance, booleanValue, z4, switchColors3, (Function0) rememberedValue6, obj3, composer3, (i9 & 896) | 6 | ((i6 >> 6) & 7168) | ((i6 << 3) & 458752));
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer3.endReplaceableGroup();
                        composer3.endNode();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        z6 = z4;
                        mutableInteractionSource3 = obj3;
                        switchColors4 = switchColors3;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = obj;
                        composer3 = startRestartGroup;
                        z6 = z3;
                        mutableInteractionSource3 = obj2;
                        switchColors4 = switchColors2;
                    }
                    endRestartGroup = composer3.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new SwitchKt$Switch$6(z, function1, modifier3, z6, mutableInteractionSource3, switchColors4, i, i2));
                    return;
                }
                obj2 = mutableInteractionSource;
                if ((i & 458752) != 0) {
                }
                if ((374491 & i3) == 74898) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i11 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if ((i2 & 32) == 0) {
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume4 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                float mo588toPx0680j_43 = ((Density) consume4).mo588toPx0680j_4(ThumbPathLength);
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, str);
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.Companion.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                MutableState mutableState2 = (MutableState) rememberedValue;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume22 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                float mo588toPx0680j_422 = ((Density) consume22).mo588toPx0680j_4(SwitchVelocityThreshold);
                Float valueOf7 = Float.valueOf(mo588toPx0680j_422);
                startRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                changed = startRestartGroup.changed(valueOf7);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue2 = new AnchoredDraggableState(Boolean.valueOf(z), SwitchKt$Switch$anchoredDraggableState$1$1.INSTANCE, new SwitchKt$Switch$anchoredDraggableState$1$2(mo588toPx0680j_422), AnimationSpec, null, 16, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
                startRestartGroup.endReplaceableGroup();
                AnchoredDraggableState anchoredDraggableState2 = (AnchoredDraggableState) rememberedValue2;
                int i122 = i6 >> 3;
                State rememberUpdatedState3 = SnapshotStateKt.rememberUpdatedState(function1, startRestartGroup, i122 & 14);
                int i132 = i6 & 14;
                State rememberUpdatedState22 = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z), startRestartGroup, i132);
                Float valueOf22 = Float.valueOf(0.0f);
                Float valueOf32 = Float.valueOf(mo588toPx0680j_43);
                startRestartGroup.startReplaceableGroup(1618982084);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
                changed2 = startRestartGroup.changed(anchoredDraggableState2) | startRestartGroup.changed(valueOf22) | startRestartGroup.changed(valueOf32);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changed2) {
                }
                rememberedValue3 = new SwitchKt$Switch$2$1(anchoredDraggableState2, 0.0f, mo588toPx0680j_43);
                startRestartGroup.updateRememberedValue(rememberedValue3);
                startRestartGroup.endReplaceableGroup();
                EffectsKt.SideEffect((Function0) rememberedValue3, startRestartGroup, 0);
                Object[] objArr2 = {anchoredDraggableState2, rememberUpdatedState22, rememberUpdatedState3, mutableState2};
                startRestartGroup.startReplaceableGroup(-568225417);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                i8 = 0;
                z5 = false;
                while (i8 < i7) {
                }
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!z5) {
                }
                rememberedValue4 = new SwitchKt$Switch$3$1(anchoredDraggableState2, rememberUpdatedState22, rememberUpdatedState3, mutableState2, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
                startRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(anchoredDraggableState2, (Function2) rememberedValue4, startRestartGroup, 64);
                Boolean valueOf42 = Boolean.valueOf(z);
                Boolean valueOf52 = Boolean.valueOf(Switch$lambda$3(mutableState2));
                Boolean valueOf62 = Boolean.valueOf(z);
                startRestartGroup.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                changed3 = startRestartGroup.changed(valueOf62) | startRestartGroup.changed(anchoredDraggableState2);
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (!changed3) {
                }
                rememberedValue5 = new SwitchKt$Switch$4$1(z, anchoredDraggableState2, null);
                startRestartGroup.updateRememberedValue(rememberedValue5);
                startRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(valueOf42, valueOf52, (Function2) rememberedValue5, startRestartGroup, i132 | 512);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume32 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (consume32 != LayoutDirection.Rtl) {
                }
                if (function1 == null) {
                }
                if (function1 == null) {
                }
                Modifier m789requiredSizeVpY3zN42 = SizeKt.m789requiredSizeVpY3zN4(PaddingKt.m748padding3ABfNKs(SizeKt.wrapContentSize$default(AnchoredDraggableKt.anchoredDraggable(modifier2.then(companion2).then(companion), anchoredDraggableState2, Orientation.Horizontal, (z4 || function1 == null) ? false : true, z8, obj3), Alignment.Companion.getCenter(), false, 2, null), DefaultSwitchPadding), SwitchWidth, SwitchHeight);
                composer2.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer2, 0);
                composer2.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m789requiredSizeVpY3zN42);
                if (!(composer2.getApplier() instanceof Applier)) {
                }
                composer2.startReusableNode();
                if (!composer2.getInserting()) {
                }
                m2893constructorimpl = Updater.m2893constructorimpl(composer2);
                Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (!m2893constructorimpl.getInserting()) {
                }
                m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                modifierMaterializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(composer2, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer2, -1229337700, "C177@7792L42,173@7637L258:Switch.kt#jmzs0o");
                boolean booleanValue2 = ((Boolean) anchoredDraggableState2.getTargetValue()).booleanValue();
                composer2.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                changed4 = composer2.changed(anchoredDraggableState2);
                rememberedValue6 = composer2.rememberedValue();
                if (!changed4) {
                }
                rememberedValue6 = new SwitchKt$Switch$5$1$1(anchoredDraggableState2);
                composer2.updateRememberedValue(rememberedValue6);
                composer2.endReplaceableGroup();
                composer3 = composer2;
                Modifier modifier42 = modifier2;
                SwitchImpl(boxScopeInstance2, booleanValue2, z4, switchColors3, (Function0) rememberedValue6, obj3, composer3, (i9 & 896) | 6 | ((i6 >> 6) & 7168) | ((i6 << 3) & 458752));
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                composer3.endReplaceableGroup();
                composer3.endNode();
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier42;
                z6 = z4;
                mutableInteractionSource3 = obj3;
                switchColors4 = switchColors3;
                endRestartGroup = composer3.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z3 = z2;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            obj2 = mutableInteractionSource;
            if ((i & 458752) != 0) {
            }
            if ((374491 & i3) == 74898) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i11 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if ((i2 & 32) == 0) {
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume42 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            float mo588toPx0680j_432 = ((Density) consume42).mo588toPx0680j_4(ThumbPathLength);
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, str);
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            MutableState mutableState22 = (MutableState) rememberedValue;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume222 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            float mo588toPx0680j_4222 = ((Density) consume222).mo588toPx0680j_4(SwitchVelocityThreshold);
            Float valueOf72 = Float.valueOf(mo588toPx0680j_4222);
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            changed = startRestartGroup.changed(valueOf72);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue2 = new AnchoredDraggableState(Boolean.valueOf(z), SwitchKt$Switch$anchoredDraggableState$1$1.INSTANCE, new SwitchKt$Switch$anchoredDraggableState$1$2(mo588toPx0680j_4222), AnimationSpec, null, 16, null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceableGroup();
            AnchoredDraggableState anchoredDraggableState22 = (AnchoredDraggableState) rememberedValue2;
            int i1222 = i6 >> 3;
            State rememberUpdatedState32 = SnapshotStateKt.rememberUpdatedState(function1, startRestartGroup, i1222 & 14);
            int i1322 = i6 & 14;
            State rememberUpdatedState222 = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z), startRestartGroup, i1322);
            Float valueOf222 = Float.valueOf(0.0f);
            Float valueOf322 = Float.valueOf(mo588toPx0680j_432);
            startRestartGroup.startReplaceableGroup(1618982084);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
            changed2 = startRestartGroup.changed(anchoredDraggableState22) | startRestartGroup.changed(valueOf222) | startRestartGroup.changed(valueOf322);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changed2) {
            }
            rememberedValue3 = new SwitchKt$Switch$2$1(anchoredDraggableState22, 0.0f, mo588toPx0680j_432);
            startRestartGroup.updateRememberedValue(rememberedValue3);
            startRestartGroup.endReplaceableGroup();
            EffectsKt.SideEffect((Function0) rememberedValue3, startRestartGroup, 0);
            Object[] objArr22 = {anchoredDraggableState22, rememberUpdatedState222, rememberUpdatedState32, mutableState22};
            startRestartGroup.startReplaceableGroup(-568225417);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            i8 = 0;
            z5 = false;
            while (i8 < i7) {
            }
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (!z5) {
            }
            rememberedValue4 = new SwitchKt$Switch$3$1(anchoredDraggableState22, rememberUpdatedState222, rememberUpdatedState32, mutableState22, null);
            startRestartGroup.updateRememberedValue(rememberedValue4);
            startRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(anchoredDraggableState22, (Function2) rememberedValue4, startRestartGroup, 64);
            Boolean valueOf422 = Boolean.valueOf(z);
            Boolean valueOf522 = Boolean.valueOf(Switch$lambda$3(mutableState22));
            Boolean valueOf622 = Boolean.valueOf(z);
            startRestartGroup.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
            changed3 = startRestartGroup.changed(valueOf622) | startRestartGroup.changed(anchoredDraggableState22);
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (!changed3) {
            }
            rememberedValue5 = new SwitchKt$Switch$4$1(z, anchoredDraggableState22, null);
            startRestartGroup.updateRememberedValue(rememberedValue5);
            startRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(valueOf422, valueOf522, (Function2) rememberedValue5, startRestartGroup, i1322 | 512);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume322 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (consume322 != LayoutDirection.Rtl) {
            }
            if (function1 == null) {
            }
            if (function1 == null) {
            }
            Modifier m789requiredSizeVpY3zN422 = SizeKt.m789requiredSizeVpY3zN4(PaddingKt.m748padding3ABfNKs(SizeKt.wrapContentSize$default(AnchoredDraggableKt.anchoredDraggable(modifier2.then(companion2).then(companion), anchoredDraggableState22, Orientation.Horizontal, (z4 || function1 == null) ? false : true, z8, obj3), Alignment.Companion.getCenter(), false, 2, null), DefaultSwitchPadding), SwitchWidth, SwitchHeight);
            composer2.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy22 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer2, 0);
            composer2.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor22 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(m789requiredSizeVpY3zN422);
            if (!(composer2.getApplier() instanceof Applier)) {
            }
            composer2.startReusableNode();
            if (!composer2.getInserting()) {
            }
            m2893constructorimpl = Updater.m2893constructorimpl(composer2);
            Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy22, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap22, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (!m2893constructorimpl.getInserting()) {
            }
            m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
            modifierMaterializerOf22.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer2)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(composer2, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, -1229337700, "C177@7792L42,173@7637L258:Switch.kt#jmzs0o");
            boolean booleanValue22 = ((Boolean) anchoredDraggableState22.getTargetValue()).booleanValue();
            composer2.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
            changed4 = composer2.changed(anchoredDraggableState22);
            rememberedValue6 = composer2.rememberedValue();
            if (!changed4) {
            }
            rememberedValue6 = new SwitchKt$Switch$5$1$1(anchoredDraggableState22);
            composer2.updateRememberedValue(rememberedValue6);
            composer2.endReplaceableGroup();
            composer3 = composer2;
            Modifier modifier422 = modifier2;
            SwitchImpl(boxScopeInstance22, booleanValue22, z4, switchColors3, (Function0) rememberedValue6, obj3, composer3, (i9 & 896) | 6 | ((i6 >> 6) & 7168) | ((i6 << 3) & 458752));
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            composer3.endReplaceableGroup();
            composer3.endNode();
            composer3.endReplaceableGroup();
            composer3.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier422;
            z6 = z4;
            mutableInteractionSource3 = obj3;
            switchColors4 = switchColors3;
            endRestartGroup = composer3.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        obj = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z2;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        obj2 = mutableInteractionSource;
        if ((i & 458752) != 0) {
        }
        if ((374491 & i3) == 74898) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i11 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume422 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        float mo588toPx0680j_4322 = ((Density) consume422).mo588toPx0680j_4(ThumbPathLength);
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, str);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        MutableState mutableState222 = (MutableState) rememberedValue;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume2222 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        float mo588toPx0680j_42222 = ((Density) consume2222).mo588toPx0680j_4(SwitchVelocityThreshold);
        Float valueOf722 = Float.valueOf(mo588toPx0680j_42222);
        startRestartGroup.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        changed = startRestartGroup.changed(valueOf722);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue2 = new AnchoredDraggableState(Boolean.valueOf(z), SwitchKt$Switch$anchoredDraggableState$1$1.INSTANCE, new SwitchKt$Switch$anchoredDraggableState$1$2(mo588toPx0680j_42222), AnimationSpec, null, 16, null);
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceableGroup();
        AnchoredDraggableState anchoredDraggableState222 = (AnchoredDraggableState) rememberedValue2;
        int i12222 = i6 >> 3;
        State rememberUpdatedState322 = SnapshotStateKt.rememberUpdatedState(function1, startRestartGroup, i12222 & 14);
        int i13222 = i6 & 14;
        State rememberUpdatedState2222 = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z), startRestartGroup, i13222);
        Float valueOf2222 = Float.valueOf(0.0f);
        Float valueOf3222 = Float.valueOf(mo588toPx0680j_4322);
        startRestartGroup.startReplaceableGroup(1618982084);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
        changed2 = startRestartGroup.changed(anchoredDraggableState222) | startRestartGroup.changed(valueOf2222) | startRestartGroup.changed(valueOf3222);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changed2) {
        }
        rememberedValue3 = new SwitchKt$Switch$2$1(anchoredDraggableState222, 0.0f, mo588toPx0680j_4322);
        startRestartGroup.updateRememberedValue(rememberedValue3);
        startRestartGroup.endReplaceableGroup();
        EffectsKt.SideEffect((Function0) rememberedValue3, startRestartGroup, 0);
        Object[] objArr222 = {anchoredDraggableState222, rememberUpdatedState2222, rememberUpdatedState322, mutableState222};
        startRestartGroup.startReplaceableGroup(-568225417);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        i8 = 0;
        z5 = false;
        while (i8 < i7) {
        }
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (!z5) {
        }
        rememberedValue4 = new SwitchKt$Switch$3$1(anchoredDraggableState222, rememberUpdatedState2222, rememberUpdatedState322, mutableState222, null);
        startRestartGroup.updateRememberedValue(rememberedValue4);
        startRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(anchoredDraggableState222, (Function2) rememberedValue4, startRestartGroup, 64);
        Boolean valueOf4222 = Boolean.valueOf(z);
        Boolean valueOf5222 = Boolean.valueOf(Switch$lambda$3(mutableState222));
        Boolean valueOf6222 = Boolean.valueOf(z);
        startRestartGroup.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
        changed3 = startRestartGroup.changed(valueOf6222) | startRestartGroup.changed(anchoredDraggableState222);
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (!changed3) {
        }
        rememberedValue5 = new SwitchKt$Switch$4$1(z, anchoredDraggableState222, null);
        startRestartGroup.updateRememberedValue(rememberedValue5);
        startRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(valueOf4222, valueOf5222, (Function2) rememberedValue5, startRestartGroup, i13222 | 512);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume3222 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (consume3222 != LayoutDirection.Rtl) {
        }
        if (function1 == null) {
        }
        if (function1 == null) {
        }
        Modifier m789requiredSizeVpY3zN4222 = SizeKt.m789requiredSizeVpY3zN4(PaddingKt.m748padding3ABfNKs(SizeKt.wrapContentSize$default(AnchoredDraggableKt.anchoredDraggable(modifier2.then(companion2).then(companion), anchoredDraggableState222, Orientation.Horizontal, (z4 || function1 == null) ? false : true, z8, obj3), Alignment.Companion.getCenter(), false, 2, null), DefaultSwitchPadding), SwitchWidth, SwitchHeight);
        composer2.startReplaceableGroup(733328855);
        ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
        MeasurePolicy rememberBoxMeasurePolicy222 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer2, 0);
        composer2.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap222 = composer2.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor222 = ComposeUiNode.Companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf222 = LayoutKt.modifierMaterializerOf(m789requiredSizeVpY3zN4222);
        if (!(composer2.getApplier() instanceof Applier)) {
        }
        composer2.startReusableNode();
        if (!composer2.getInserting()) {
        }
        m2893constructorimpl = Updater.m2893constructorimpl(composer2);
        Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy222, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap222, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (!m2893constructorimpl.getInserting()) {
        }
        m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222);
        modifierMaterializerOf222.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer2)), composer2, 0);
        composer2.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(composer2, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(composer2, -1229337700, "C177@7792L42,173@7637L258:Switch.kt#jmzs0o");
        boolean booleanValue222 = ((Boolean) anchoredDraggableState222.getTargetValue()).booleanValue();
        composer2.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
        changed4 = composer2.changed(anchoredDraggableState222);
        rememberedValue6 = composer2.rememberedValue();
        if (!changed4) {
        }
        rememberedValue6 = new SwitchKt$Switch$5$1$1(anchoredDraggableState222);
        composer2.updateRememberedValue(rememberedValue6);
        composer2.endReplaceableGroup();
        composer3 = composer2;
        Modifier modifier4222 = modifier2;
        SwitchImpl(boxScopeInstance222, booleanValue222, z4, switchColors3, (Function0) rememberedValue6, obj3, composer3, (i9 & 896) | 6 | ((i6 >> 6) & 7168) | ((i6 << 3) & 458752));
        ComposerKt.sourceInformationMarkerEnd(composer3);
        ComposerKt.sourceInformationMarkerEnd(composer3);
        composer3.endReplaceableGroup();
        composer3.endNode();
        composer3.endReplaceableGroup();
        composer3.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier4222;
        z6 = z4;
        mutableInteractionSource3 = obj3;
        switchColors4 = switchColors3;
        endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Switch$lambda$3(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Switch$lambda$4(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SwitchImpl(BoxScope boxScope, boolean z, boolean z2, SwitchColors switchColors, Function0<Float> function0, InteractionSource interactionSource, Composer composer, int i) {
        int i2;
        float f;
        String str;
        long SwitchImpl$lambda$18;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(70908914);
        ComposerKt.sourceInformation(startRestartGroup, "C(SwitchImpl)P(!1,2!1,4)219@8983L46,221@9069L614,221@9035L648,240@9886L28,244@10009L81,241@9919L171,247@10120L28,248@10198L7,*249@10257L7,251@10368L6,250@10307L228,260@10627L43,263@10780L59,257@10540L475:Switch.kt#jmzs0o");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changed(switchColors) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= startRestartGroup.changed(interactionSource) ? 131072 : 65536;
        }
        if ((374491 & i2) != 74898 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(70908914, i2, -1, "androidx.compose.material.SwitchImpl (Switch.kt:212)");
            }
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = SnapshotStateKt.mutableStateListOf();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            SnapshotStateList snapshotStateList = (SnapshotStateList) rememberedValue;
            int i3 = (i2 >> 15) & 14;
            startRestartGroup.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(interactionSource) | startRestartGroup.changed(snapshotStateList);
            SwitchKt$SwitchImpl$1$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new SwitchKt$SwitchImpl$1$1(interactionSource, snapshotStateList, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(interactionSource, (Function2) rememberedValue2, startRestartGroup, i3 | 64);
            if (!snapshotStateList.isEmpty()) {
                f = ThumbPressedElevation;
            } else {
                f = ThumbDefaultElevation;
            }
            float f2 = f;
            int i4 = ((i2 >> 6) & 14) | (i2 & 112) | ((i2 >> 3) & 896);
            State<Color> trackColor = switchColors.trackColor(z2, z, startRestartGroup, i4);
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(boxScope.align(Modifier.Companion, Alignment.Companion.getCenter()), 0.0f, 1, null);
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed2 = startRestartGroup.changed(trackColor);
            SwitchKt$SwitchImpl$2$1 rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new SwitchKt$SwitchImpl$2$1(trackColor);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(fillMaxSize$default, (Function1) rememberedValue3, startRestartGroup, 0);
            State<Color> thumbColor = switchColors.thumbColor(z2, z, startRestartGroup, i4);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(ElevationOverlayKt.getLocalElevationOverlay());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ElevationOverlay elevationOverlay = (ElevationOverlay) consume;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            float m5607constructorimpl = Dp.m5607constructorimpl(((Dp) consume2).m5621unboximpl() + f2);
            startRestartGroup.startReplaceableGroup(-539243578);
            ComposerKt.sourceInformation(startRestartGroup, "252@10443L36");
            if (Color.m3292equalsimpl0(SwitchImpl$lambda$18(thumbColor), MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1313getSurface0d7_KjU()) && elevationOverlay != null) {
                str = "CC(remember)P(1):Composables.kt#9igjgp";
                SwitchImpl$lambda$18 = elevationOverlay.mo1343apply7g2Lkgo(SwitchImpl$lambda$18(thumbColor), m5607constructorimpl, startRestartGroup, 0);
            } else {
                str = "CC(remember)P(1):Composables.kt#9igjgp";
                SwitchImpl$lambda$18 = SwitchImpl$lambda$18(thumbColor);
            }
            startRestartGroup.endReplaceableGroup();
            composer2 = startRestartGroup;
            State<Color> m329animateColorAsStateeuL9pac = SingleValueAnimationKt.m329animateColorAsStateeuL9pac(SwitchImpl$lambda$18, null, null, null, startRestartGroup, 0, 14);
            Modifier align = boxScope.align(Modifier.Companion, Alignment.Companion.getCenterStart());
            composer2.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composer2, str);
            boolean changed3 = composer2.changed(function0);
            SwitchKt$SwitchImpl$3$1 rememberedValue4 = composer2.rememberedValue();
            if (changed3 || rememberedValue4 == Composer.Companion.getEmpty()) {
                rememberedValue4 = new SwitchKt$SwitchImpl$3$1(function0);
                composer2.updateRememberedValue(rememberedValue4);
            }
            composer2.endReplaceableGroup();
            SpacerKt.Spacer(BackgroundKt.m420backgroundbw27NRU(ShadowKt.m2930shadows4CzXII$default(SizeKt.m787requiredSize3ABfNKs(IndicationKt.indication(OffsetKt.offset(align, (Function1) rememberedValue4), interactionSource, RippleKt.m1559rememberRipple9IZ8Weo(false, ThumbRippleRadius, 0L, composer2, 54, 4)), ThumbDiameter), f2, RoundedCornerShapeKt.getCircleShape(), false, 0L, 0L, 24, null), SwitchImpl$lambda$19(m329animateColorAsStateeuL9pac), RoundedCornerShapeKt.getCircleShape()), composer2, 0);
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
        endRestartGroup.updateScope(new SwitchKt$SwitchImpl$4(boxScope, z, z2, switchColors, function0, interactionSource, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawTrack-RPmYEkk  reason: not valid java name */
    public static final void m1485drawTrackRPmYEkk(DrawScope drawScope, long j, float f, float f2) {
        float f3 = f2 / 2;
        DrawScope.CC.m3834drawLineNGM6Ib0$default(drawScope, j, androidx.compose.ui.geometry.OffsetKt.Offset(f3, Offset.m3019getYimpl(drawScope.mo3761getCenterF1C5BW0())), androidx.compose.ui.geometry.OffsetKt.Offset(f - f3, Offset.m3019getYimpl(drawScope.mo3761getCenterF1C5BW0())), f2, StrokeCap.Companion.m3645getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
    }

    public static final float getTrackWidth() {
        return TrackWidth;
    }

    public static final float getTrackStrokeWidth() {
        return TrackStrokeWidth;
    }

    public static final float getThumbDiameter() {
        return ThumbDiameter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1<Boolean, Unit> Switch$lambda$7(State<? extends Function1<? super Boolean, Unit>> state) {
        return (Function1) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Switch$lambda$8(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long SwitchImpl$lambda$16(State<Color> state) {
        return state.getValue().m3301unboximpl();
    }

    private static final long SwitchImpl$lambda$18(State<Color> state) {
        return state.getValue().m3301unboximpl();
    }

    private static final long SwitchImpl$lambda$19(State<Color> state) {
        return state.getValue().m3301unboximpl();
    }

    static {
        float m5607constructorimpl = Dp.m5607constructorimpl(34);
        TrackWidth = m5607constructorimpl;
        TrackStrokeWidth = Dp.m5607constructorimpl(14);
        float m5607constructorimpl2 = Dp.m5607constructorimpl(20);
        ThumbDiameter = m5607constructorimpl2;
        ThumbRippleRadius = Dp.m5607constructorimpl(24);
        DefaultSwitchPadding = Dp.m5607constructorimpl(2);
        SwitchWidth = m5607constructorimpl;
        SwitchHeight = m5607constructorimpl2;
        ThumbPathLength = Dp.m5607constructorimpl(m5607constructorimpl - m5607constructorimpl2);
        AnimationSpec = new TweenSpec<>(100, 0, null, 6, null);
        ThumbDefaultElevation = Dp.m5607constructorimpl(1);
        ThumbPressedElevation = Dp.m5607constructorimpl(6);
        SwitchVelocityThreshold = Dp.m5607constructorimpl(125);
    }
}
