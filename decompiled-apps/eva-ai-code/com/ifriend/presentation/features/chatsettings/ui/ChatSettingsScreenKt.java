package com.ifriend.presentation.features.chatsettings.ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
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
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.google.firebase.messaging.Constants;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import com.ifriend.presentation.features.chatsettings.viewmodel.ChatSettingsViewModel;
import com.ifriend.ui.components.progress.GlowingProgressBarKt;
import com.ifriend.ui.components.surface.AppSurfaceKt;
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
/* compiled from: ChatSettingsScreen.kt */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0004\u001a\u0015\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0004\u001a\u0015\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0004\u001a'\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0010\u0010\f\u001a\f\u0012\u0004\u0012\u00020\u00010\rj\u0002`\u000eH\u0007¢\u0006\u0002\u0010\u000f\u001a\u001d\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0014¨\u0006\u0015²\u0006\n\u0010\u0016\u001a\u00020\u0017X\u008a\u0084\u0002"}, d2 = {"ChatAvatar", "", "avatarUrl", "", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "ChatDescription", "description", "ChatName", "name", "ChatSettingsScreen", "viewModel", "Lcom/ifriend/presentation/features/chatsettings/viewmodel/ChatSettingsViewModel;", "onBackClick", "Lkotlin/Function0;", "Lcom/ifriend/ui/tools/OnClick;", "(Lcom/ifriend/presentation/features/chatsettings/viewmodel/ChatSettingsViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "LevelProgressContent", "progress", "", Constants.ScionAnalytics.PARAM_LABEL, "(FLjava/lang/String;Landroidx/compose/runtime/Composer;I)V", "presentation_release", "state", "Lcom/ifriend/presentation/features/chatsettings/viewmodel/ChatSettingsViewModel$UiState;"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatSettingsScreenKt {
    public static final void ChatSettingsScreen(ChatSettingsViewModel viewModel, Function0<Unit> onBackClick, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Composer startRestartGroup = composer.startRestartGroup(-1006343427);
        ComposerKt.sourceInformation(startRestartGroup, "C(ChatSettingsScreen)P(1)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1006343427, i, -1, "com.ifriend.presentation.features.chatsettings.ui.ChatSettingsScreen (ChatSettingsScreen.kt:50)");
        }
        AppSurfaceKt.m7071AppSurfaceFjzlyU(null, null, 0L, 0L, null, 0.0f, ComposableLambdaKt.composableLambda(startRestartGroup, -771681922, true, new ChatSettingsScreenKt$ChatSettingsScreen$1(viewModel, onBackClick)), startRestartGroup, 1572864, 63);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new ChatSettingsScreenKt$ChatSettingsScreen$2(viewModel, onBackClick, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ChatAvatar(String str, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(806511925);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(806511925, i2, -1, "com.ifriend.presentation.features.chatsettings.ui.ChatAvatar (ChatSettingsScreen.kt:138)");
            }
            BoxWithConstraintsKt.BoxWithConstraints(null, null, false, ComposableLambdaKt.composableLambda(startRestartGroup, 1716767499, true, new ChatSettingsScreenKt$ChatAvatar$1(str, i2)), startRestartGroup, CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, 7);
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
        endRestartGroup.updateScope(new ChatSettingsScreenKt$ChatAvatar$2(str, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ChatName(String str, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-1628348477);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1628348477, i2, -1, "com.ifriend.presentation.features.chatsettings.ui.ChatName (ChatSettingsScreen.kt:155)");
            }
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxWidth$default);
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
            Modifier.Companion companion = Modifier.Companion;
            int m5517getEllipsisgIe3tQ8 = TextOverflow.Companion.m5517getEllipsisgIe3tQ8();
            Modifier.Companion companion2 = companion;
            composer2 = startRestartGroup;
            TextKt.m2145Text4IGK_g(str, (Modifier) companion2, AppTheme.INSTANCE.getColors(startRestartGroup, AppTheme.$stable).m7108getTextPrimary0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, m5517getEllipsisgIe3tQ8, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, TextUnitKt.getSp(24), FontWeight.Companion.getBold(), (FontStyle) null, (FontSynthesis) null, AppFontFamily.INSTANCE.getGhino(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(24), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646105, (DefaultConstructorMarker) null), composer2, (i2 & 14) | 48, 3120, 55288);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
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
        endRestartGroup.updateScope(new ChatSettingsScreenKt$ChatName$2(str, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LevelProgressContent(float f, String str, Composer composer, int i) {
        int i2;
        Composer composer2;
        int i3;
        String str2;
        Composer startRestartGroup = composer.startRestartGroup(-1272348818);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        int i4 = i2;
        if ((i4 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1272348818, i4, -1, "com.ifriend.presentation.features.chatsettings.ui.LevelProgressContent (ChatSettingsScreen.kt:177)");
            }
            startRestartGroup.startReplaceableGroup(-483455358);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Column)P(2,3,1)75@3779L61,76@3845L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(Modifier.Companion);
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
            GlowingProgressBarKt.m7058GlowingProgressBarww6aTOc(f, SizeKt.m802widthInVpY3zN4$default(SizeKt.m781height3ABfNKs(Modifier.Companion, Dp.m5607constructorimpl(6)), 0.0f, Dp.m5607constructorimpl(200), 1, null), null, 0L, startRestartGroup, (i4 & 14) | 48, 12);
            Modifier m752paddingqDBjuR0$default = PaddingKt.m752paddingqDBjuR0$default(Modifier.Companion, 0.0f, AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7178getSmallestD9Ej5fM(), 0.0f, 0.0f, 13, null);
            int m5517getEllipsisgIe3tQ8 = TextOverflow.Companion.m5517getEllipsisgIe3tQ8();
            composer2 = startRestartGroup;
            i3 = i;
            int i5 = (i4 >> 3) & 14;
            str2 = str;
            TextKt.m2145Text4IGK_g(str, m752paddingqDBjuR0$default, AppTheme.INSTANCE.getColors(startRestartGroup, AppTheme.$stable).m7108getTextPrimary0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, m5517getEllipsisgIe3tQ8, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, TextUnitKt.getSp(16), FontWeight.Companion.getBold(), (FontStyle) null, (FontSynthesis) null, AppFontFamily.INSTANCE.getGhino(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(16), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646105, (DefaultConstructorMarker) null), composer2, i5, 3120, 55288);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            str2 = str;
            composer2 = startRestartGroup;
            i3 = i;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new ChatSettingsScreenKt$LevelProgressContent$2(f, str2, i3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ChatDescription(String str, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-961596546);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-961596546, i2, -1, "com.ifriend.presentation.features.chatsettings.ui.ChatDescription (ChatSettingsScreen.kt:202)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier.Companion companion2 = companion;
            composer2 = startRestartGroup;
            TextKt.m2145Text4IGK_g(str, (Modifier) companion2, AppTheme.INSTANCE.getColors(startRestartGroup, AppTheme.$stable).m7108getTextPrimary0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, TextUnitKt.getSp(16), FontWeight.Companion.getNormal(), (FontStyle) null, (FontSynthesis) null, AppFontFamily.INSTANCE.getIbmSans(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(20), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646105, (DefaultConstructorMarker) null), composer2, (i2 & 14) | 48, 0, 65528);
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
        endRestartGroup.updateScope(new ChatSettingsScreenKt$ChatDescription$1(str, i));
    }
}
