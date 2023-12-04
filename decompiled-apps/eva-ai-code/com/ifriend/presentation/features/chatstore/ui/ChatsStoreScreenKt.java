package com.ifriend.presentation.features.chatstore.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.ColorPainter;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.util.MathHelpersKt;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import com.ifriend.presentation.features.chatstore.models.ChatStoreUi;
import com.ifriend.presentation.features.chatstore.viewmodel.ChatsStoreViewModel;
import com.ifriend.ui.components.buttons.ButtonWidgetsKt;
import com.ifriend.ui.components.buttons.NeomorphicButtonsKt;
import com.ifriend.ui.components.card.ActionCardKt;
import com.ifriend.ui.components.image.AppAsyncImageKt;
import com.ifriend.ui.components.surface.AppSurfaceKt;
import com.ifriend.ui.components.text.AutoTextSizeKt;
import com.ifriend.ui.features.neurons.NeuronsCardKt;
import com.ifriend.ui.theme.AppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
/* compiled from: ChatsStoreScreen.kt */
@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a/\u0010\u0000\u001a\u00020\u00012\u0010\u0010\u0002\u001a\f\u0012\u0004\u0012\u00020\u00010\u0003j\u0002`\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010\b\u001a\u0015\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010\u000b\u001a\u0015\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010\u000b\u001aE\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0012j\b\u0012\u0004\u0012\u00020\u0006`\u00132\u0010\u0010\u0014\u001a\f\u0012\u0004\u0012\u00020\u00010\u0003j\u0002`\u0004H\u0007¢\u0006\u0002\u0010\u0015\u001aG\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00010\u00122\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00010\u0012H\u0007¢\u0006\u0002\u0010\u001f\u001a\u001f\u0010 \u001a\u00020\u00012\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020\u001eH\u0003¢\u0006\u0002\u0010$\u001a9\u0010%\u001a\u00020\u00012\u0010\u0010\u0014\u001a\f\u0012\u0004\u0012\u00020\u00010\u0003j\u0002`\u00042\u0010\u0010&\u001a\f\u0012\u0004\u0012\u00020\u00010\u0003j\u0002`\u00042\u0006\u0010'\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010(¨\u0006)²\u0006\n\u0010\u0019\u001a\u00020\u001aX\u008a\u0084\u0002²\u0006\n\u0010#\u001a\u00020\u001eX\u008a\u008e\u0002"}, d2 = {"ChatStoreBuyActionContent", "", "onBuyChat", "Lkotlin/Function0;", "Lcom/ifriend/ui/tools/OnClick;", "actionMessage", "", FirebaseAnalytics.Param.PRICE, "(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "ChatStoreDescriptionContent", "description", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "ChatStoreLevelContent", "unlockMessage", "ChatsStoreScreen", "viewModel", "Lcom/ifriend/presentation/features/chatstore/viewmodel/ChatsStoreViewModel;", "onOpenChat", "Lkotlin/Function1;", "Lcom/ifriend/ui/tools/NavigationArgAction;", "onBackClick", "(Lcom/ifriend/presentation/features/chatstore/viewmodel/ChatsStoreViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "SelectChatStorePager", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Lcom/ifriend/presentation/features/chatstore/viewmodel/ChatsStoreViewModel$UiState;", "onPageChanged", "", "onAvatarOffsetChanged", "", "(Landroidx/compose/ui/Modifier;Lcom/ifriend/presentation/features/chatstore/viewmodel/ChatsStoreViewModel$UiState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "StoreBackground", "currentBot", "Lcom/ifriend/presentation/features/chatstore/models/ChatStoreUi;", "avatarOffset", "(Lcom/ifriend/presentation/features/chatstore/models/ChatStoreUi;FLandroidx/compose/runtime/Composer;I)V", "TopBarContent", "onAddNeuronsClick", "neurons", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "presentation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatsStoreScreenKt {
    public static final void ChatsStoreScreen(ChatsStoreViewModel viewModel, Function1<? super String, Unit> onOpenChat, Function0<Unit> onBackClick, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(onOpenChat, "onOpenChat");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Composer startRestartGroup = composer.startRestartGroup(807069575);
        ComposerKt.sourceInformation(startRestartGroup, "C(ChatsStoreScreen)P(2,1)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(807069575, i, -1, "com.ifriend.presentation.features.chatstore.ui.ChatsStoreScreen (ChatsStoreScreen.kt:68)");
        }
        AppSurfaceKt.m7071AppSurfaceFjzlyU(null, null, 0L, 0L, null, 0.0f, ComposableLambdaKt.composableLambda(startRestartGroup, -508358362, true, new ChatsStoreScreenKt$ChatsStoreScreen$1(viewModel, onOpenChat, onBackClick, i)), startRestartGroup, 1572864, 63);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new ChatsStoreScreenKt$ChatsStoreScreen$2(viewModel, onOpenChat, onBackClick, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ChatStoreDescriptionContent(String str, Composer composer, int i) {
        int i2;
        TextStyle m5100copyv2rsoow;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-1641772651);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1641772651, i2, -1, "com.ifriend.presentation.features.chatstore.ui.ChatStoreDescriptionContent (ChatsStoreScreen.kt:143)");
            }
            Modifier m781height3ABfNKs = SizeKt.m781height3ABfNKs(Modifier.Companion, Dp.m5607constructorimpl(88));
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m781height3ABfNKs);
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
            Modifier align = BoxScopeInstance.INSTANCE.align(PaddingKt.m750paddingVpY3zN4$default(PaddingKt.m750paddingVpY3zN4$default(Modifier.Companion, 0.0f, AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7176getSmallD9Ej5fM(), 1, null), AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7172getLargeD9Ej5fM(), 0.0f, 2, null), Alignment.Companion.getBottomCenter());
            m5100copyv2rsoow = r16.m5100copyv2rsoow((r48 & 1) != 0 ? r16.spanStyle.m5041getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? r16.spanStyle.m5042getFontSizeXSAIIZE() : TextUnitKt.getSp(18), (r48 & 4) != 0 ? r16.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? r16.spanStyle.m5043getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? r16.spanStyle.m5044getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? r16.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r16.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r16.spanStyle.m5045getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? r16.spanStyle.m5040getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? r16.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r16.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r16.spanStyle.m5039getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? r16.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r16.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r16.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? r16.paragraphStyle.m4997getTextAlignbuA522U() : null, (r48 & 65536) != 0 ? r16.paragraphStyle.m4999getTextDirectionmmuk1to() : null, (r48 & 131072) != 0 ? r16.paragraphStyle.m4996getLineHeightXSAIIZE() : TextUnitKt.getSp(22), (r48 & 262144) != 0 ? r16.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r16.platformStyle : null, (r48 & 1048576) != 0 ? r16.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? r16.paragraphStyle.m4994getLineBreakLgCVezo() : null, (r48 & 4194304) != 0 ? r16.paragraphStyle.m4992getHyphensEaSxIns() : null, (r48 & 8388608) != 0 ? AppTheme.INSTANCE.getTypography(startRestartGroup, AppTheme.$stable).getTitleItemMedium().paragraphStyle.getTextMotion() : null);
            composer2 = startRestartGroup;
            AutoTextSizeKt.m7073AutoTextSizetoyU4E8(align, str, AppTheme.INSTANCE.getColors(startRestartGroup, AppTheme.$stable).m7108getTextPrimary0d7_KjU(), TextAlign.m5462boximpl(TextAlign.Companion.m5469getCentere0LSkKk()), m5100copyv2rsoow, 0L, 0L, 4, startRestartGroup, ((i2 << 3) & 112) | 12582912, 96);
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
        endRestartGroup.updateScope(new ChatsStoreScreenKt$ChatStoreDescriptionContent$2(str, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ChatStoreLevelContent(String str, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(25854285);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(25854285, i2, -1, "com.ifriend.presentation.features.chatstore.ui.ChatStoreLevelContent (ChatsStoreScreen.kt:165)");
            }
            NeomorphicButtonsKt.m7031NeomorphicDarkLightButtonnSlTg7c(PaddingKt.m750paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(SizeKt.m783heightInVpY3zN4$default(Modifier.Companion, AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7164getButtonHeightD9Ej5fM(), 0.0f, 2, null), 0.0f, 1, null), AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7172getLargeD9Ej5fM(), 0.0f, 2, null), ChatsStoreScreenKt$ChatStoreLevelContent$1.INSTANCE, false, 0.0f, Dp.m5607constructorimpl(-4), ComposableLambdaKt.composableLambda(startRestartGroup, -337300562, true, new ChatsStoreScreenKt$ChatStoreLevelContent$2(str, i2)), startRestartGroup, 221616, 8);
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
        endRestartGroup.updateScope(new ChatsStoreScreenKt$ChatStoreLevelContent$3(str, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ChatStoreBuyActionContent(Function0<Unit> function0, String str, String str2, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-759614322);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-759614322, i2, -1, "com.ifriend.presentation.features.chatstore.ui.ChatStoreBuyActionContent (ChatsStoreScreen.kt:198)");
            }
            composer2 = startRestartGroup;
            ButtonWidgetsKt.m7022AppShadowButtonWithContentBHesuOE(PaddingKt.m750paddingVpY3zN4$default(Modifier.Companion, AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7172getLargeD9Ej5fM(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, 0L, false, function0, 0L, ComposableLambdaKt.composableLambda(startRestartGroup, 1788818306, true, new ChatsStoreScreenKt$ChatStoreBuyActionContent$1(str, i2, str2)), startRestartGroup, ((i2 << 18) & 3670016) | 100663296, FacebookRequestErrorClassification.EC_INVALID_TOKEN);
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
        endRestartGroup.updateScope(new ChatsStoreScreenKt$ChatStoreBuyActionContent$2(function0, str, str2, i));
    }

    public static final void SelectChatStorePager(Modifier modifier, ChatsStoreViewModel.UiState state, Function1<? super Integer, Unit> onPageChanged, Function1<? super Float, Unit> onAvatarOffsetChanged, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Modifier.Companion companion;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onPageChanged, "onPageChanged");
        Intrinsics.checkNotNullParameter(onAvatarOffsetChanged, "onAvatarOffsetChanged");
        Composer startRestartGroup = composer.startRestartGroup(-988359056);
        ComposerKt.sourceInformation(startRestartGroup, "C(SelectChatStorePager)P(!1,3,2)");
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(state) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changedInstance(onPageChanged) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
        } else if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changedInstance(onAvatarOffsetChanged) ? 2048 : 1024;
        }
        int i5 = i3;
        if ((i5 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            companion = i4 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-988359056, i5, -1, "com.ifriend.presentation.features.chatstore.ui.SelectChatStorePager (ChatsStoreScreen.kt:243)");
            }
            if (state.getChatStores().isEmpty()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new ChatsStoreScreenKt$SelectChatStorePager$1(companion, state, onPageChanged, onAvatarOffsetChanged, i, i2));
                return;
            }
            int initPageIndex = state.getInitPageIndex();
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(state);
            ChatsStoreScreenKt$SelectChatStorePager$pagerState$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new ChatsStoreScreenKt$SelectChatStorePager$pagerState$1$1(state);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            PagerState rememberPagerState = PagerStateKt.rememberPagerState(initPageIndex, 0.0f, (Function0) rememberedValue, startRestartGroup, 0, 2);
            startRestartGroup.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
            boolean changed2 = startRestartGroup.changed(rememberPagerState) | startRestartGroup.changed(onPageChanged);
            ChatsStoreScreenKt$SelectChatStorePager$2$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new ChatsStoreScreenKt$SelectChatStorePager$2$1(rememberPagerState, onPageChanged, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(rememberPagerState, (Function2) rememberedValue2, startRestartGroup, 64);
            startRestartGroup.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
            boolean changed3 = startRestartGroup.changed(rememberPagerState) | startRestartGroup.changed(onAvatarOffsetChanged);
            ChatsStoreScreenKt$SelectChatStorePager$3$1 rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new ChatsStoreScreenKt$SelectChatStorePager$3$1(rememberPagerState, onAvatarOffsetChanged, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(rememberPagerState, (Function2) rememberedValue3, startRestartGroup, 64);
            int i6 = i5 & 14;
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
            int i7 = i6 >> 3;
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, (i7 & 112) | (i7 & 14));
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
            int i8 = ((((i6 << 3) & 112) << 9) & 7168) | 6;
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
            modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i8 >> 3) & 112));
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
            SelectChatStorePagerKt.SelectChatStorePager(BoxScopeInstance.INSTANCE.align(Modifier.Companion, Alignment.Companion.getCenter()), rememberPagerState, state.getChatStores(), startRestartGroup, 0, 0);
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
            companion = modifier2;
        }
        ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
        if (endRestartGroup2 == null) {
            return;
        }
        endRestartGroup2.updateScope(new ChatsStoreScreenKt$SelectChatStorePager$5(companion, state, onPageChanged, onAvatarOffsetChanged, i, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void StoreBackground(ChatStoreUi chatStoreUi, float f, Composer composer, int i) {
        int i2;
        String str;
        float f2;
        Composer startRestartGroup = composer.startRestartGroup(1459470896);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(chatStoreUi) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1459470896, i, -1, "com.ifriend.presentation.features.chatstore.ui.StoreBackground (ChatsStoreScreen.kt:274)");
            }
            if (chatStoreUi == null || (str = chatStoreUi.getBackgroundUrl()) == null || !(!StringsKt.isBlank(str))) {
                str = null;
            }
            startRestartGroup.startReplaceableGroup(1605167953);
            if (str == null) {
                f2 = 0.0f;
            } else {
                f2 = 0.0f;
                AppAsyncImageKt.AppAsyncImage(str, AlphaKt.alpha(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), MathHelpersKt.lerp(0.0f, 0.3f, 1.0f - f)), null, null, null, new ColorPainter(Color.Companion.m3326getTransparent0d7_KjU(), null), new ColorPainter(Color.Companion.m3326getTransparent0d7_KjU(), null), startRestartGroup, 2359296, 28);
                Unit unit = Unit.INSTANCE;
            }
            startRestartGroup.endReplaceableGroup();
            BoxKt.Box(BackgroundKt.m421backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.Companion, f2, 1, null), Color.m3290copywmQWz5c$default(ColorKt.Color(4280427042L), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), startRestartGroup, 0);
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
        endRestartGroup.updateScope(new ChatsStoreScreenKt$StoreBackground$3(chatStoreUi, f, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TopBarContent(Function0<Unit> function0, Function0<Unit> function02, String str, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(499837090);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(499837090, i2, -1, "com.ifriend.presentation.features.chatstore.ui.TopBarContent (ChatsStoreScreen.kt:305)");
            }
            Modifier m752paddingqDBjuR0$default = PaddingKt.m752paddingqDBjuR0$default(Modifier.Companion, 0.0f, AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7175getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
            startRestartGroup.startReplaceableGroup(693286680);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Row)P(2,1,3)76@3779L58,77@3842L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m752paddingqDBjuR0$default);
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
            Updater.m2900setimpl(m2893constructorimpl, rowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -326682417, "C78@3887L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            SpacerKt.Spacer(SizeKt.m800width3ABfNKs(Modifier.Companion, AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7176getSmallD9Ej5fM()), startRestartGroup, 0);
            ActionCardKt.CloseActionCard(function0, startRestartGroup, i2 & 14);
            SpacerKt.Spacer(RowScope.CC.weight$default(rowScopeInstance, Modifier.Companion, 1.0f, false, 2, null), startRestartGroup, 0);
            NeuronsCardKt.NeuronsCard(null, str, function02, startRestartGroup, ((i2 >> 3) & 112) | ((i2 << 3) & 896), 1);
            SpacerKt.Spacer(SizeKt.m800width3ABfNKs(Modifier.Companion, AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7175getMediumD9Ej5fM()), startRestartGroup, 0);
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
        endRestartGroup.updateScope(new ChatsStoreScreenKt$TopBarContent$2(function0, function02, str, i));
    }
}
