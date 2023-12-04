package com.ifriend.ui.components.bubble;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.DurationBasedAnimationSpec;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpOffset;
import com.ifriend.common_utils.extensions.FloatKt;
import com.ifriend.ui.components.brush.LinearGradientKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AnimatedBubbles.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aC\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a3\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\u000eH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\r\u0010\u0017\u001a\u00020\u0004H\u0003¢\u0006\u0002\u0010\u0018\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0019²\u0006\n\u0010\u001a\u001a\u00020\u000eX\u008a\u0084\u0002"}, d2 = {"colors", "", "Landroidx/compose/ui/graphics/Color;", "AnimatedBubble", "", "brush", "Landroidx/compose/ui/graphics/Brush;", "bubbleSize", "Landroidx/compose/ui/unit/Dp;", "animationRadius", "animationOffset", "Landroidx/compose/ui/unit/DpOffset;", "animation", "Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "", "AnimatedBubble-AAERXIQ", "(Landroidx/compose/ui/graphics/Brush;FFJLandroidx/compose/animation/core/DurationBasedAnimationSpec;Landroidx/compose/runtime/Composer;I)V", "AnimatedBubbles", "modifier", "Landroidx/compose/ui/Modifier;", "alpha", "AnimatedBubbles-uFdPcIQ", "(Landroidx/compose/ui/Modifier;FFLandroidx/compose/runtime/Composer;II)V", "AnimatedBubblesPreview", "(Landroidx/compose/runtime/Composer;I)V", "common_ui_release", "animatedAngle"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AnimatedBubblesKt {
    private static final List<Color> colors = CollectionsKt.listOf((Object[]) new Color[]{Color.m3281boximpl(ColorKt.Color(1426094847)), Color.m3281boximpl(ColorKt.Color(1441020853))});

    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* renamed from: AnimatedBubbles-uFdPcIQ  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m7020AnimatedBubblesuFdPcIQ(Modifier modifier, float f, float f2, Composer composer, int i, int i2) {
        Object obj;
        int i3;
        float f3;
        int i4;
        float f4;
        float f5;
        int currentCompositeKeyHash;
        Composer m2893constructorimpl;
        ArrayList arrayList;
        float f6;
        float f7;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-1261748075);
        ComposerKt.sourceInformation(startRestartGroup, "C(AnimatedBubbles)P(2,1:c#ui.unit.Dp)");
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            obj = modifier;
        } else if ((i & 14) == 0) {
            Object obj2 = modifier;
            i3 = (startRestartGroup.changed(obj2) ? 4 : 2) | i;
            obj = obj2;
        } else {
            obj = modifier;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            f3 = f;
            i3 |= startRestartGroup.changed(f3) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                f4 = f2;
                i3 |= startRestartGroup.changed(f4) ? 256 : 128;
                if ((i3 & 731) == 146 || !startRestartGroup.getSkipping()) {
                    Modifier.Companion companion = i5 != 0 ? Modifier.Companion : obj;
                    float m5607constructorimpl = i6 != 0 ? Dp.m5607constructorimpl(100) : f3;
                    f5 = i4 != 0 ? 1.0f : f4;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1261748075, i3, -1, "com.ifriend.ui.components.bubble.AnimatedBubbles (AnimatedBubbles.kt:38)");
                    }
                    int i7 = i3 & 14;
                    startRestartGroup.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
                    int i8 = i7 >> 3;
                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, (i8 & 112) | (i8 & 14));
                    startRestartGroup.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
                    int i9 = ((((i7 << 3) & 112) << 9) & 7168) | 6;
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
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
                    modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i9 >> 3) & 112));
                    startRestartGroup.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    if (!(f5 == 1.0f)) {
                        List<Color> list = colors;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                        for (Color color : list) {
                            long m3301unboximpl = color.m3301unboximpl();
                            arrayList2.add(Color.m3281boximpl(Color.m3290copywmQWz5c$default(m3301unboximpl, Color.m3293getAlphaimpl(m3301unboximpl) * f5, 0.0f, 0.0f, 0.0f, 14, null)));
                        }
                        arrayList = arrayList2;
                    } else {
                        arrayList = colors;
                    }
                    List<Color> list2 = arrayList;
                    float f8 = 5;
                    Modifier modifier2 = companion;
                    int i10 = (i3 & 112) | 3456;
                    m7019AnimatedBubbleAAERXIQ(LinearGradientKt.m7018linearGradienteBVf0pg$default(Brush.Companion, list2, null, 0, 225.0f, false, 22, null), m5607constructorimpl, Dp.m5607constructorimpl(f8), DpKt.m5628DpOffsetYgX7TsA(Dp.m5607constructorimpl(0), Dp.m5607constructorimpl(1)), AnimationSpecKt.tween$default(2000, 0, EasingKt.getLinearEasing(), 2, null), startRestartGroup, i10);
                    float f9 = 2;
                    m7019AnimatedBubbleAAERXIQ(LinearGradientKt.m7018linearGradienteBVf0pg$default(Brush.Companion, list2, null, 0, 135.0f, false, 22, null), m5607constructorimpl, Dp.m5607constructorimpl(7), DpKt.m5628DpOffsetYgX7TsA(Dp.m5607constructorimpl(f9), Dp.m5607constructorimpl(f9)), AnimationSpecKt.tween$default(3000, 0, EasingKt.getLinearEasing(), 2, null), startRestartGroup, i10);
                    float f10 = 3;
                    m7019AnimatedBubbleAAERXIQ(LinearGradientKt.m7018linearGradienteBVf0pg$default(Brush.Companion, list2, null, 0, 315.0f, false, 22, null), m5607constructorimpl, Dp.m5607constructorimpl(f8), DpKt.m5628DpOffsetYgX7TsA(Dp.m5607constructorimpl(f10), Dp.m5607constructorimpl(f10)), AnimationSpecKt.tween$default(4000, 0, EasingKt.getLinearEasing(), 2, null), startRestartGroup, i10);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    obj = modifier2;
                    f6 = m5607constructorimpl;
                    f7 = f5;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    f6 = f3;
                    f7 = f4;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new AnimatedBubblesKt$AnimatedBubbles$2(obj, f6, f7, i, i2));
                return;
            }
            f4 = f2;
            if ((i3 & 731) == 146) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int i72 = i3 & 14;
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
            int i82 = i72 >> 3;
            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, (i82 & 112) | (i82 & 14));
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion);
            int i92 = ((((i72 << 3) & 112) << 9) & 7168) | 6;
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
            Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (!m2893constructorimpl.getInserting()) {
            }
            m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
            modifierMaterializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i92 >> 3) & 112));
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            if (!(f5 == 1.0f)) {
            }
            List<Color> list22 = arrayList;
            float f82 = 5;
            Modifier modifier22 = companion;
            int i102 = (i3 & 112) | 3456;
            m7019AnimatedBubbleAAERXIQ(LinearGradientKt.m7018linearGradienteBVf0pg$default(Brush.Companion, list22, null, 0, 225.0f, false, 22, null), m5607constructorimpl, Dp.m5607constructorimpl(f82), DpKt.m5628DpOffsetYgX7TsA(Dp.m5607constructorimpl(0), Dp.m5607constructorimpl(1)), AnimationSpecKt.tween$default(2000, 0, EasingKt.getLinearEasing(), 2, null), startRestartGroup, i102);
            float f92 = 2;
            m7019AnimatedBubbleAAERXIQ(LinearGradientKt.m7018linearGradienteBVf0pg$default(Brush.Companion, list22, null, 0, 135.0f, false, 22, null), m5607constructorimpl, Dp.m5607constructorimpl(7), DpKt.m5628DpOffsetYgX7TsA(Dp.m5607constructorimpl(f92), Dp.m5607constructorimpl(f92)), AnimationSpecKt.tween$default(3000, 0, EasingKt.getLinearEasing(), 2, null), startRestartGroup, i102);
            float f102 = 3;
            m7019AnimatedBubbleAAERXIQ(LinearGradientKt.m7018linearGradienteBVf0pg$default(Brush.Companion, list22, null, 0, 315.0f, false, 22, null), m5607constructorimpl, Dp.m5607constructorimpl(f82), DpKt.m5628DpOffsetYgX7TsA(Dp.m5607constructorimpl(f102), Dp.m5607constructorimpl(f102)), AnimationSpecKt.tween$default(4000, 0, EasingKt.getLinearEasing(), 2, null), startRestartGroup, i102);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
            }
            obj = modifier22;
            f6 = m5607constructorimpl;
            f7 = f5;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        f3 = f;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        f4 = f2;
        if ((i3 & 731) == 146) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i4 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        int i722 = i3 & 14;
        startRestartGroup.startReplaceableGroup(733328855);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
        int i822 = i722 >> 3;
        MeasurePolicy rememberBoxMeasurePolicy22 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, (i822 & 112) | (i822 & 14));
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor22 = ComposeUiNode.Companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(companion);
        int i922 = ((((i722 << 3) & 112) << 9) & 7168) | 6;
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
        Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy22, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap22, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (!m2893constructorimpl.getInserting()) {
        }
        m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
        modifierMaterializerOf22.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i922 >> 3) & 112));
        startRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
        if (!(f5 == 1.0f)) {
        }
        List<Color> list222 = arrayList;
        float f822 = 5;
        Modifier modifier222 = companion;
        int i1022 = (i3 & 112) | 3456;
        m7019AnimatedBubbleAAERXIQ(LinearGradientKt.m7018linearGradienteBVf0pg$default(Brush.Companion, list222, null, 0, 225.0f, false, 22, null), m5607constructorimpl, Dp.m5607constructorimpl(f822), DpKt.m5628DpOffsetYgX7TsA(Dp.m5607constructorimpl(0), Dp.m5607constructorimpl(1)), AnimationSpecKt.tween$default(2000, 0, EasingKt.getLinearEasing(), 2, null), startRestartGroup, i1022);
        float f922 = 2;
        m7019AnimatedBubbleAAERXIQ(LinearGradientKt.m7018linearGradienteBVf0pg$default(Brush.Companion, list222, null, 0, 135.0f, false, 22, null), m5607constructorimpl, Dp.m5607constructorimpl(7), DpKt.m5628DpOffsetYgX7TsA(Dp.m5607constructorimpl(f922), Dp.m5607constructorimpl(f922)), AnimationSpecKt.tween$default(3000, 0, EasingKt.getLinearEasing(), 2, null), startRestartGroup, i1022);
        float f1022 = 3;
        m7019AnimatedBubbleAAERXIQ(LinearGradientKt.m7018linearGradienteBVf0pg$default(Brush.Companion, list222, null, 0, 315.0f, false, 22, null), m5607constructorimpl, Dp.m5607constructorimpl(f822), DpKt.m5628DpOffsetYgX7TsA(Dp.m5607constructorimpl(f1022), Dp.m5607constructorimpl(f1022)), AnimationSpecKt.tween$default(4000, 0, EasingKt.getLinearEasing(), 2, null), startRestartGroup, i1022);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        obj = modifier222;
        f6 = m5607constructorimpl;
        f7 = f5;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AnimatedBubble-AAERXIQ  reason: not valid java name */
    public static final void m7019AnimatedBubbleAAERXIQ(Brush brush, float f, float f2, long j, DurationBasedAnimationSpec<Float> durationBasedAnimationSpec, Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(1202350214);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1202350214, i, -1, "com.ifriend.ui.components.bubble.AnimatedBubble (AnimatedBubbles.kt:92)");
        }
        State<Float> animateFloat = InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition("AnimatedBubble::infiniteTransition", startRestartGroup, 6, 0), 360.0f, 0.0f, AnimationSpecKt.m352infiniteRepeatable9IiC70o$default(durationBasedAnimationSpec, null, 0L, 6, null), "AnimatedBubble::animatedAngle", startRestartGroup, InfiniteTransition.$stable | 25008 | (InfiniteRepeatableSpec.$stable << 9), 0);
        Modifier m708offsetVpY3zN4 = OffsetKt.m708offsetVpY3zN4(SizeKt.m795size3ABfNKs(Modifier.Companion, f), Dp.m5607constructorimpl(Dp.m5607constructorimpl(((float) Math.cos(FloatKt.toRadians(AnimatedBubble_AAERXIQ$lambda$2(animateFloat)))) * f2) + DpOffset.m5668getXD9Ej5fM(j)), Dp.m5607constructorimpl(Dp.m5607constructorimpl(((float) Math.sin(FloatKt.toRadians(AnimatedBubble_AAERXIQ$lambda$2(animateFloat)))) * f2) + DpOffset.m5670getYD9Ej5fM(j)));
        Dp m5605boximpl = Dp.m5605boximpl(f);
        startRestartGroup.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
        boolean changed = startRestartGroup.changed(m5605boximpl) | startRestartGroup.changed(brush);
        AnimatedBubblesKt$AnimatedBubble$1$1 rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new AnimatedBubblesKt$AnimatedBubble$1$1(brush, f);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        CanvasKt.Canvas(m708offsetVpY3zN4, (Function1) rememberedValue, startRestartGroup, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new AnimatedBubblesKt$AnimatedBubble$2(brush, f, f2, j, durationBasedAnimationSpec, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AnimatedBubblesPreview(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1339650388);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1339650388, i, -1, "com.ifriend.ui.components.bubble.AnimatedBubblesPreview (AnimatedBubbles.kt:128)");
            }
            Alignment center = Alignment.Companion.getCenter();
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxSize$default);
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
            Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier m795size3ABfNKs = SizeKt.m795size3ABfNKs(Modifier.Companion, Dp.m5607constructorimpl(50));
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m795size3ABfNKs);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2893constructorimpl2 = Updater.m2893constructorimpl(startRestartGroup);
            Updater.m2900setimpl(m2893constructorimpl2, rememberBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (m2893constructorimpl2.getInserting() || !Intrinsics.areEqual(m2893constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m2893constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m2893constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            m7020AnimatedBubblesuFdPcIQ(null, 0.0f, 0.0f, startRestartGroup, 0, 7);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
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
        endRestartGroup.updateScope(new AnimatedBubblesKt$AnimatedBubblesPreview$2(i));
    }

    private static final float AnimatedBubble_AAERXIQ$lambda$2(State<Float> state) {
        return state.getValue().floatValue();
    }
}
