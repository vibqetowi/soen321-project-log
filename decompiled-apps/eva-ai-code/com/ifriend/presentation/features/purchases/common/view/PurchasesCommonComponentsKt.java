package com.ifriend.presentation.features.purchases.common.view;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import com.ifriend.ui.components.brush.LinearGradientKt;
import com.ifriend.ui.theme.AppColors;
import com.ifriend.ui.theme.AppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: PurchasesCommonComponents.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\u00050\u000bj\u0002`\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u000f\u001a;\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\u00050\u000bj\u0002`\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u0014\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0015"}, d2 = {"purchaseGradient", "Landroidx/compose/ui/graphics/Brush;", "getPurchaseGradient", "()Landroidx/compose/ui/graphics/Brush;", "PurchaseButton", "", "text", "", "enabled", "", "onClick", "Lkotlin/Function0;", "Lcom/ifriend/ui/tools/OnClick;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ToolbarIconButton", "painter", "Landroidx/compose/ui/graphics/painter/Painter;", "contentDescription", "(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "presentation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PurchasesCommonComponentsKt {
    private static final Brush purchaseGradient = LinearGradientKt.m7018linearGradienteBVf0pg$default(Brush.Companion, CollectionsKt.listOf((Object[]) new Color[]{Color.m3281boximpl(ColorKt.Color(4288976880L)), Color.m3281boximpl(ColorKt.Color(4284640478L))}), null, 0, 315.0f, false, 22, null);

    public static final Brush getPurchaseGradient() {
        return purchaseGradient;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PurchaseButton(String text, boolean z, Function0<Unit> onClick, Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        Composer composer2;
        Modifier modifier2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(-1122360581);
        ComposerKt.sourceInformation(startRestartGroup, "C(PurchaseButton)P(3!1,2)");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changedInstance(onClick) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
        } else if ((i & 7168) == 0) {
            obj = modifier;
            i3 |= startRestartGroup.changed(obj) ? 2048 : 1024;
            if ((i3 & 5851) == 1170 || !startRestartGroup.getSkipping()) {
                Modifier.Companion companion = i4 == 0 ? Modifier.Companion : obj;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1122360581, i3, -1, "com.ifriend.presentation.features.purchases.common.view.PurchaseButton (PurchasesCommonComponents.kt:46)");
                }
                Modifier modifier3 = companion;
                composer2 = startRestartGroup;
                ButtonKt.Button(onClick, SizeKt.m781height3ABfNKs(companion, Dp.m5607constructorimpl(45)), z, AppTheme.INSTANCE.getShapes(startRestartGroup, AppTheme.$stable).getLarge(), ButtonDefaults.INSTANCE.m1595buttonColorsro_MJ88(Color.Companion.m3326getTransparent0d7_KjU(), 0L, 0L, 0L, startRestartGroup, (ButtonDefaults.$stable << 12) | 6, 14), null, null, PaddingKt.m741PaddingValues0680j_4(Dp.m5607constructorimpl(0)), null, ComposableLambdaKt.composableLambda(startRestartGroup, 1454401259, true, new PurchasesCommonComponentsKt$PurchaseButton$1(z, text, i3)), startRestartGroup, ((i3 >> 6) & 14) | 817889280 | ((i3 << 3) & 896), 352);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier2 = obj;
                composer2 = startRestartGroup;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new PurchasesCommonComponentsKt$PurchaseButton$2(text, z, onClick, modifier2, i, i2));
            return;
        }
        obj = modifier;
        if ((i3 & 5851) == 1170) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Modifier modifier32 = companion;
        composer2 = startRestartGroup;
        ButtonKt.Button(onClick, SizeKt.m781height3ABfNKs(companion, Dp.m5607constructorimpl(45)), z, AppTheme.INSTANCE.getShapes(startRestartGroup, AppTheme.$stable).getLarge(), ButtonDefaults.INSTANCE.m1595buttonColorsro_MJ88(Color.Companion.m3326getTransparent0d7_KjU(), 0L, 0L, 0L, startRestartGroup, (ButtonDefaults.$stable << 12) | 6, 14), null, null, PaddingKt.m741PaddingValues0680j_4(Dp.m5607constructorimpl(0)), null, ComposableLambdaKt.composableLambda(startRestartGroup, 1454401259, true, new PurchasesCommonComponentsKt$PurchaseButton$1(z, text, i3)), startRestartGroup, ((i3 >> 6) & 14) | 817889280 | ((i3 << 3) & 896), 352);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = modifier32;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void ToolbarIconButton(Painter painter, String str, Function0<Unit> onClick, Modifier modifier, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(painter, "painter");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(1721222505);
        ComposerKt.sourceInformation(startRestartGroup, "C(ToolbarIconButton)P(3!1,2)");
        Modifier.Companion companion = (i2 & 8) != 0 ? Modifier.Companion : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1721222505, i, -1, "com.ifriend.presentation.features.purchases.common.view.ToolbarIconButton (PurchasesCommonComponents.kt:88)");
        }
        int i3 = (i >> 9) & 14;
        startRestartGroup.startReplaceableGroup(733328855);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
        int i4 = i3 >> 3;
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, (i4 & 112) | (i4 & 14));
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
        int i5 = ((((i3 << 3) & 112) << 9) & 7168) | 6;
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
        modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i5 >> 3) & 112));
        startRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        SurfaceKt.m2070Surfaceo_FOJdg(onClick, SizeKt.m800width3ABfNKs(SizeKt.m781height3ABfNKs(Modifier.Companion, Dp.m5607constructorimpl(40)), Dp.m5607constructorimpl(45)), false, AppTheme.INSTANCE.getShapes(startRestartGroup, AppTheme.$stable).getLarge(), AppColors.Companion.m7141getTranslucentCardColor0d7_KjU(), 0L, 0.0f, 0.0f, null, null, ComposableLambdaKt.composableLambda(startRestartGroup, 1539899128, true, new PurchasesCommonComponentsKt$ToolbarIconButton$1$1(painter, str, i)), startRestartGroup, ((i >> 6) & 14) | 24624, 6, 996);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new PurchasesCommonComponentsKt$ToolbarIconButton$2(painter, str, onClick, companion, i, i2));
    }
}
