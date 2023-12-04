package com.ifriend.ui.components.indicators;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import com.ifriend.ui.theme.AppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AppLinerIndicators.kt */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aU\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"AppLinerIndicators", "", "modifier", "Landroidx/compose/ui/Modifier;", "pageCount", "", "pagerState", "Landroidx/compose/foundation/pager/PagerState;", "selectedColor", "Landroidx/compose/ui/graphics/Color;", "unselectedColor", "indicatorHeight", "Landroidx/compose/ui/unit/Dp;", "indicatorWidth", "AppLinerIndicators-4eDdRP8", "(Landroidx/compose/ui/Modifier;ILandroidx/compose/foundation/pager/PagerState;JJFFLandroidx/compose/runtime/Composer;II)V", "common_ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppLinerIndicatorsKt {
    /* JADX WARN: Removed duplicated region for block: B:102:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x013c  */
    /* renamed from: AppLinerIndicators-4eDdRP8  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m7041AppLinerIndicators4eDdRP8(Modifier modifier, int i, PagerState pagerState, long j, long j2, float f, float f2, Composer composer, int i2, int i3) {
        int i4;
        long j3;
        long j4;
        float f3;
        int i5;
        float f4;
        float m5607constructorimpl;
        int currentCompositeKeyHash;
        Composer m2893constructorimpl;
        int i6;
        RoundedCornerShape rectangleShape;
        RoundedCornerShape m1011RoundedCornerShapea9UjIt4$default;
        ScopeUpdateScope endRestartGroup;
        int i7;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(pagerState, "pagerState");
        Composer startRestartGroup = composer.startRestartGroup(846492358);
        ComposerKt.sourceInformation(startRestartGroup, "C(AppLinerIndicators)P(2,3,4,5:c#ui.graphics.Color,6:c#ui.graphics.Color,0:c#ui.unit.Dp,1:c#ui.unit.Dp)");
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (startRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 896) == 0) {
            i4 |= startRestartGroup.changed(pagerState) ? 256 : 128;
        }
        if ((i2 & 7168) == 0) {
            if ((i3 & 8) == 0) {
                j3 = j;
                if (startRestartGroup.changed(j3)) {
                    i7 = 2048;
                    i4 |= i7;
                }
            } else {
                j3 = j;
            }
            i7 = 1024;
            i4 |= i7;
        } else {
            j3 = j;
        }
        if ((57344 & i2) == 0) {
            j4 = j2;
            i4 |= ((i3 & 16) == 0 && startRestartGroup.changed(j4)) ? 16384 : 8192;
        } else {
            j4 = j2;
        }
        int i8 = i3 & 32;
        if (i8 != 0) {
            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((458752 & i2) == 0) {
            f3 = f;
            i4 |= startRestartGroup.changed(f3) ? 131072 : 65536;
            i5 = i3 & 64;
            if (i5 == 0) {
                i4 |= 1572864;
            } else if ((3670016 & i2) == 0) {
                f4 = f2;
                i4 |= startRestartGroup.changed(f4) ? 1048576 : 524288;
                if ((i4 & 2995931) == 599186 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        if ((i3 & 8) != 0) {
                            j3 = AppTheme.INSTANCE.getColors(startRestartGroup, 6).m7100getLight0d7_KjU();
                        }
                        if ((i3 & 16) != 0) {
                            j4 = Color.m3290copywmQWz5c$default(AppTheme.INSTANCE.getColors(startRestartGroup, 6).m7100getLight0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null);
                        }
                        m5607constructorimpl = i8 != 0 ? Dp.m5607constructorimpl(3) : f3;
                        if (i5 != 0) {
                            f4 = Dp.m5607constructorimpl(14);
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        m5607constructorimpl = f3;
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(846492358, i2, -1, "com.ifriend.ui.components.indicators.AppLinerIndicators (AppLinerIndicators.kt:31)");
                    }
                    Modifier m420backgroundbw27NRU = BackgroundKt.m420backgroundbw27NRU(SizeKt.wrapContentWidth$default(modifier, null, false, 3, null), j4, RoundedCornerShapeKt.getCircleShape());
                    startRestartGroup.startReplaceableGroup(693286680);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(Row)P(2,1,3)76@3779L58,77@3842L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.Companion.getTop(), startRestartGroup, 6);
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
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor);
                    } else {
                        startRestartGroup.useNode();
                    }
                    m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
                    Updater.m2900setimpl(m2893constructorimpl, rowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                    if (!m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
                    startRestartGroup.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -326682417, "C78@3887L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    startRestartGroup.startReplaceableGroup(-2101115154);
                    i6 = 0;
                    while (i6 < i) {
                        boolean z = pagerState.getCurrentPage() == i6;
                        if (pagerState.getCurrentPage() == i6) {
                            m1011RoundedCornerShapea9UjIt4$default = RoundedCornerShapeKt.getCircleShape();
                        } else if (i6 != 0) {
                            if (i6 != i - 1) {
                                rectangleShape = RectangleShapeKt.getRectangleShape();
                            } else {
                                float m5607constructorimpl2 = Dp.m5607constructorimpl(m5607constructorimpl / 2);
                                rectangleShape = RoundedCornerShapeKt.m1011RoundedCornerShapea9UjIt4$default(0.0f, m5607constructorimpl2, m5607constructorimpl2, 0.0f, 9, null);
                            }
                            BoxKt.Box(SizeKt.m797sizeVpY3zN4(BackgroundKt.m420backgroundbw27NRU(ClipKt.clip(Modifier.Companion, rectangleShape), !z ? j3 : Color.Companion.m3326getTransparent0d7_KjU(), rectangleShape), f4, m5607constructorimpl), startRestartGroup, 0);
                            i6++;
                        } else {
                            float m5607constructorimpl3 = Dp.m5607constructorimpl(m5607constructorimpl / 2);
                            m1011RoundedCornerShapea9UjIt4$default = RoundedCornerShapeKt.m1011RoundedCornerShapea9UjIt4$default(m5607constructorimpl3, 0.0f, 0.0f, m5607constructorimpl3, 6, null);
                        }
                        rectangleShape = m1011RoundedCornerShapea9UjIt4$default;
                        BoxKt.Box(SizeKt.m797sizeVpY3zN4(BackgroundKt.m420backgroundbw27NRU(ClipKt.clip(Modifier.Companion, rectangleShape), !z ? j3 : Color.Companion.m3326getTransparent0d7_KjU(), rectangleShape), f4, m5607constructorimpl), startRestartGroup, 0);
                        i6++;
                    }
                    startRestartGroup.endReplaceableGroup();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f3 = m5607constructorimpl;
                } else {
                    startRestartGroup.skipToGroupEnd();
                }
                float f5 = f4;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new AppLinerIndicatorsKt$AppLinerIndicators$2(modifier, i, pagerState, j3, j4, f3, f5, i2, i3));
                return;
            }
            f4 = f2;
            if ((i4 & 2995931) == 599186) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if ((i3 & 8) != 0) {
            }
            if ((i3 & 16) != 0) {
            }
            if (i8 != 0) {
            }
            if (i5 != 0) {
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier m420backgroundbw27NRU2 = BackgroundKt.m420backgroundbw27NRU(SizeKt.wrapContentWidth$default(modifier, null, false, 3, null), j4, RoundedCornerShapeKt.getCircleShape());
            startRestartGroup.startReplaceableGroup(693286680);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Row)P(2,1,3)76@3779L58,77@3842L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.Companion.getTop(), startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m420backgroundbw27NRU2);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
            Updater.m2900setimpl(m2893constructorimpl, rowMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (!m2893constructorimpl.getInserting()) {
            }
            m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
            modifierMaterializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -326682417, "C78@3887L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(-2101115154);
            i6 = 0;
            while (i6 < i) {
            }
            startRestartGroup.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
            }
            f3 = m5607constructorimpl;
            float f52 = f4;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        f3 = f;
        i5 = i3 & 64;
        if (i5 == 0) {
        }
        f4 = f2;
        if ((i4 & 2995931) == 599186) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if ((i3 & 8) != 0) {
        }
        if ((i3 & 16) != 0) {
        }
        if (i8 != 0) {
        }
        if (i5 != 0) {
        }
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        Modifier m420backgroundbw27NRU22 = BackgroundKt.m420backgroundbw27NRU(SizeKt.wrapContentWidth$default(modifier, null, false, 3, null), j4, RoundedCornerShapeKt.getCircleShape());
        startRestartGroup.startReplaceableGroup(693286680);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Row)P(2,1,3)76@3779L58,77@3842L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.Companion.getTop(), startRestartGroup, 6);
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor22 = ComposeUiNode.Companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(m420backgroundbw27NRU22);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
        Updater.m2900setimpl(m2893constructorimpl, rowMeasurePolicy22, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap22, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (!m2893constructorimpl.getInserting()) {
        }
        m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
        modifierMaterializerOf22.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -326682417, "C78@3887L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(-2101115154);
        i6 = 0;
        while (i6 < i) {
        }
        startRestartGroup.endReplaceableGroup();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        f3 = m5607constructorimpl;
        float f522 = f4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
