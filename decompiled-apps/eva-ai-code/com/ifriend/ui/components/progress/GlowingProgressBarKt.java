package com.ifriend.ui.components.progress;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.SliderKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import com.ifriend.ui.theme.AppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: GlowingProgressBar.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aA\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\u0001H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\r\u0010\u000f\u001a\u00020\u0004H\u0003¢\u0006\u0002\u0010\u0010\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0011²\u0006\n\u0010\u0012\u001a\u00020\u000bX\u008a\u0084\u0002²\u0006\n\u0010\u0005\u001a\u00020\u0006X\u008a\u008e\u0002"}, d2 = {"defaultBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "J", "GlowingProgressBar", "", "progress", "", "modifier", "Landroidx/compose/ui/Modifier;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "Landroidx/compose/ui/unit/Dp;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "GlowingProgressBar-ww6aTOc", "(FLandroidx/compose/ui/Modifier;Landroidx/compose/animation/core/AnimationSpec;JLandroidx/compose/runtime/Composer;II)V", "GlowingProgressBarPreview", "(Landroidx/compose/runtime/Composer;I)V", "common_ui_release", "animatedProgressWidth"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GlowingProgressBarKt {
    private static final long defaultBackgroundColor = ColorKt.Color(450747869);

    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b7  */
    /* renamed from: GlowingProgressBar-ww6aTOc  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m7058GlowingProgressBarww6aTOc(float f, Modifier modifier, AnimationSpec<Dp> animationSpec, long j, Composer composer, int i, int i2) {
        int i3;
        Modifier.Companion companion;
        int i4;
        int i5;
        long j2;
        AnimationSpec<Dp> animationSpec2;
        Modifier modifier2;
        long j3;
        int currentCompositeKeyHash;
        Composer m2893constructorimpl;
        AnimationSpec<Dp> animationSpec3;
        long j4;
        Composer startRestartGroup = composer.startRestartGroup(925329256);
        ComposerKt.sourceInformation(startRestartGroup, "C(GlowingProgressBar)P(3,2!,1:c#ui.graphics.Color)");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            companion = modifier;
            i3 |= startRestartGroup.changed(companion) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 != 0) {
                i3 |= 128;
            }
            i5 = i2 & 8;
            if (i5 == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                j2 = j;
                i3 |= startRestartGroup.changed(j2) ? 2048 : 1024;
                if (i4 == 4 || (i3 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        if (i6 != 0) {
                            companion = Modifier.Companion;
                        }
                        TweenSpec tween$default = i4 != 0 ? AnimationSpecKt.tween$default(500, 0, EasingKt.getFastOutSlowInEasing(), 2, null) : animationSpec;
                        if (i5 != 0) {
                            animationSpec2 = tween$default;
                            modifier2 = companion;
                            j3 = defaultBackgroundColor;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(925329256, i, -1, "com.ifriend.ui.components.progress.GlowingProgressBar (GlowingProgressBar.kt:44)");
                            }
                            Modifier m420backgroundbw27NRU = BackgroundKt.m420backgroundbw27NRU(modifier2, j3, RoundedCornerShapeKt.getCircleShape());
                            startRestartGroup.startReplaceableGroup(733328855);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
                            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
                            startRestartGroup.startReplaceableGroup(-1323940314);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m420backgroundbw27NRU);
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (!startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(constructor);
                            } else {
                                startRestartGroup.useNode();
                            }
                            m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
                            Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                            Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                            if (!m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
                            startRestartGroup.startReplaceableGroup(2058660585);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(startRestartGroup, -2030345716, true, new GlowingProgressBarKt$GlowingProgressBar$1$1(f, animationSpec2)), startRestartGroup, 3078, 6);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endNode();
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            companion = modifier2;
                            animationSpec3 = animationSpec2;
                            j4 = j3;
                        } else {
                            animationSpec2 = tween$default;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        animationSpec2 = animationSpec;
                    }
                    modifier2 = companion;
                    j3 = j2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Modifier m420backgroundbw27NRU2 = BackgroundKt.m420backgroundbw27NRU(modifier2, j3, RoundedCornerShapeKt.getCircleShape());
                    startRestartGroup.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
                    MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
                    startRestartGroup.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m420backgroundbw27NRU2);
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
                    }
                    m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
                    Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                    if (!m2893constructorimpl.getInserting()) {
                    }
                    m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                    modifierMaterializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
                    startRestartGroup.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(startRestartGroup, -2030345716, true, new GlowingProgressBarKt$GlowingProgressBar$1$1(f, animationSpec2)), startRestartGroup, 3078, 6);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    companion = modifier2;
                    animationSpec3 = animationSpec2;
                    j4 = j3;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    animationSpec3 = animationSpec;
                    j4 = j2;
                }
                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new GlowingProgressBarKt$GlowingProgressBar$2(f, companion, animationSpec3, j4, i, i2));
                return;
            }
            j2 = j;
            if (i4 == 4) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i6 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
        }
        companion = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        j2 = j;
        if (i4 == 4) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i6 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    public static final void GlowingProgressBarPreview(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1027091421);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1027091421, i, -1, "com.ifriend.ui.components.progress.GlowingProgressBarPreview (GlowingProgressBar.kt:87)");
            }
            Modifier m421backgroundbw27NRU$default = BackgroundKt.m421backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), Color.Companion.m3320getDarkGray0d7_KjU(), null, 2, null);
            startRestartGroup.startReplaceableGroup(-483455358);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Column)P(2,3,1)75@3779L61,76@3845L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m421backgroundbw27NRU$default);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
            Updater.m2900setimpl(m2893constructorimpl, columnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 276693570, "C77@3893L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.01f);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            MutableFloatState mutableFloatState = (MutableFloatState) rememberedValue;
            SpacerKt.Spacer(SizeKt.m781height3ABfNKs(Modifier.Companion, AppTheme.INSTANCE.getDimensions(startRestartGroup, 6).m7172getLargeD9Ej5fM()), startRestartGroup, 0);
            float f = 32;
            m7058GlowingProgressBarww6aTOc(GlowingProgressBarPreview$lambda$5$lambda$2(mutableFloatState), SizeKt.fillMaxWidth$default(SizeKt.m781height3ABfNKs(PaddingKt.m750paddingVpY3zN4$default(Modifier.Companion, Dp.m5607constructorimpl(f), 0.0f, 2, null), Dp.m5607constructorimpl(6)), 0.0f, 1, null), null, 0L, startRestartGroup, 48, 12);
            SpacerKt.Spacer(SizeKt.m781height3ABfNKs(Modifier.Companion, AppTheme.INSTANCE.getDimensions(startRestartGroup, 6).m7172getLargeD9Ej5fM()), startRestartGroup, 0);
            float GlowingProgressBarPreview$lambda$5$lambda$2 = GlowingProgressBarPreview$lambda$5$lambda$2(mutableFloatState);
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(mutableFloatState);
            GlowingProgressBarKt$GlowingProgressBarPreview$1$1$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new GlowingProgressBarKt$GlowingProgressBarPreview$1$1$1(mutableFloatState);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            SliderKt.Slider(GlowingProgressBarPreview$lambda$5$lambda$2, rememberedValue2, SizeKt.fillMaxWidth$default(PaddingKt.m748padding3ABfNKs(Modifier.Companion, Dp.m5607constructorimpl(f)), 0.0f, 1, null), false, null, 0, null, null, null, startRestartGroup, 384, 504);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
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
        endRestartGroup.updateScope(new GlowingProgressBarKt$GlowingProgressBarPreview$2(i));
    }

    private static final float GlowingProgressBarPreview$lambda$5$lambda$2(MutableFloatState mutableFloatState) {
        return mutableFloatState.getFloatValue();
    }
}
