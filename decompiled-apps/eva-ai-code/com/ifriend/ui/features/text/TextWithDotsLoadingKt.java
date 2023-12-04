package com.ifriend.ui.features.text;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.material3.TextKt;
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
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import com.ifriend.ui.components.progress.dots.DotsLoadingKt;
import com.ifriend.ui.theme.AppFontFamily;
import com.ifriend.ui.theme.AppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: TextWithDotsLoading.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\u001a1\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u0084\u0002²\u0006\n\u0010\u000e\u001a\u00020\rX\u008a\u0084\u0002"}, d2 = {"TextWithDotsLoading", "", "modifier", "Landroidx/compose/ui/Modifier;", "text", "", "isLoading", "", "style", "Landroidx/compose/ui/text/TextStyle;", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;ZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;II)V", "common_ui_release", "textAlpha", "", "progressAlpha"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TextWithDotsLoadingKt {
    /* JADX WARN: Removed duplicated region for block: B:69:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TextWithDotsLoading(Modifier modifier, String text, boolean z, TextStyle textStyle, Composer composer, int i, int i2) {
        Object obj;
        int i3;
        Object obj2;
        Object obj3;
        TextStyle textStyle2;
        int i4;
        int currentCompositeKeyHash;
        Composer m2893constructorimpl;
        Composer composer2;
        TextStyle textStyle3;
        int i5;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer startRestartGroup = composer.startRestartGroup(432827800);
        ComposerKt.sourceInformation(startRestartGroup, "C(TextWithDotsLoading)P(1,3)");
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            obj = modifier;
        } else if ((i & 14) == 0) {
            obj = modifier;
            i3 = (startRestartGroup.changed(obj) ? 4 : 2) | i;
        } else {
            obj = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(text) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            if ((i2 & 8) == 0) {
                obj2 = textStyle;
                if (startRestartGroup.changed(obj2)) {
                    i5 = 2048;
                    i3 |= i5;
                }
            } else {
                obj2 = textStyle;
            }
            i5 = 1024;
            i3 |= i5;
        } else {
            obj2 = textStyle;
        }
        if ((i3 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                Modifier.Companion companion = i6 != 0 ? Modifier.Companion : obj;
                if ((i2 & 8) != 0) {
                    long sp = TextUnitKt.getSp(16);
                    long sp2 = TextUnitKt.getSp(16);
                    obj3 = companion;
                    textStyle2 = new TextStyle(AppTheme.INSTANCE.getColors(startRestartGroup, 6).m7108getTextPrimary0d7_KjU(), sp, FontWeight.Companion.getMedium(), (FontStyle) null, (FontSynthesis) null, AppFontFamily.INSTANCE.getGeneralSans(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, sp2, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646104, (DefaultConstructorMarker) null);
                    i4 = i3 & (-7169);
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(432827800, i4, -1, "com.ifriend.ui.features.text.TextWithDotsLoading (TextWithDotsLoading.kt:34)");
                    }
                    int i7 = i4 & 14;
                    startRestartGroup.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
                    int i8 = i7 >> 3;
                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, (i8 & 112) | (i8 & 14));
                    startRestartGroup.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(obj3);
                    int i9 = ((((i7 << 3) & 112) << 9) & 7168) | 6;
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
                    modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i9 >> 3) & 112));
                    startRestartGroup.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    int i10 = i4;
                    TextKt.m2145Text4IGK_g(text, boxScopeInstance.align(AlphaKt.alpha(Modifier.Companion, TextWithDotsLoading$lambda$2$lambda$0(AnimateAsStateKt.animateFloatAsState(z ? 1.0f : 0.0f, AnimationSpecKt.tween$default(AppTheme.INSTANCE.getAnimationDuration(startRestartGroup, 6).getLong(), 0, EasingKt.getLinearEasing(), 2, null), 0.0f, "", null, startRestartGroup, CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, 20))), Alignment.Companion.getCenter()), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle2, startRestartGroup, (i10 >> 3) & 14, ((i10 << 9) & 3670016) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, 57340);
                    composer2 = startRestartGroup;
                    DotsLoadingKt.m7061DotsLoadingFadeDDuSU3M(DotsLoadingKt.rememberDotsLoading(composer2, 0), boxScopeInstance.align(AlphaKt.alpha(Modifier.Companion, TextWithDotsLoading$lambda$2$lambda$1(AnimateAsStateKt.animateFloatAsState(!z ? 1.0f : 0.0f, AnimationSpecKt.tween$default(AppTheme.INSTANCE.getAnimationDuration(composer2, 6).getLong(), 0, EasingKt.getLinearEasing(), 2, null), 0.0f, "", null, composer2, CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, 20))), Alignment.Companion.getCenter()), 0, Dp.m5607constructorimpl(4), AppTheme.INSTANCE.getColors(composer2, 6).m7100getLight0d7_KjU(), 0, null, composer2, 3080, 100);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    textStyle3 = textStyle2;
                } else {
                    obj3 = companion;
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                obj3 = obj;
            }
            i4 = i3;
            textStyle2 = obj2;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i72 = i4 & 14;
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
            int i82 = i72 >> 3;
            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, (i82 & 112) | (i82 & 14));
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(obj3);
            int i92 = ((((i72 << 3) & 112) << 9) & 7168) | 6;
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
            modifierMaterializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i92 >> 3) & 112));
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            int i102 = i4;
            TextKt.m2145Text4IGK_g(text, boxScopeInstance2.align(AlphaKt.alpha(Modifier.Companion, TextWithDotsLoading$lambda$2$lambda$0(AnimateAsStateKt.animateFloatAsState(z ? 1.0f : 0.0f, AnimationSpecKt.tween$default(AppTheme.INSTANCE.getAnimationDuration(startRestartGroup, 6).getLong(), 0, EasingKt.getLinearEasing(), 2, null), 0.0f, "", null, startRestartGroup, CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, 20))), Alignment.Companion.getCenter()), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle2, startRestartGroup, (i102 >> 3) & 14, ((i102 << 9) & 3670016) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, 57340);
            composer2 = startRestartGroup;
            DotsLoadingKt.m7061DotsLoadingFadeDDuSU3M(DotsLoadingKt.rememberDotsLoading(composer2, 0), boxScopeInstance2.align(AlphaKt.alpha(Modifier.Companion, TextWithDotsLoading$lambda$2$lambda$1(AnimateAsStateKt.animateFloatAsState(!z ? 1.0f : 0.0f, AnimationSpecKt.tween$default(AppTheme.INSTANCE.getAnimationDuration(composer2, 6).getLong(), 0, EasingKt.getLinearEasing(), 2, null), 0.0f, "", null, composer2, CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, 20))), Alignment.Companion.getCenter()), 0, Dp.m5607constructorimpl(4), AppTheme.INSTANCE.getColors(composer2, 6).m7100getLight0d7_KjU(), 0, null, composer2, 3080, 100);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
            }
            textStyle3 = textStyle2;
        } else {
            startRestartGroup.skipToGroupEnd();
            obj3 = obj;
            textStyle3 = obj2;
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new TextWithDotsLoadingKt$TextWithDotsLoading$2(obj3, text, z, textStyle3, i, i2));
    }

    private static final float TextWithDotsLoading$lambda$2$lambda$0(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final float TextWithDotsLoading$lambda$2$lambda$1(State<Float> state) {
        return state.getValue().floatValue();
    }
}
