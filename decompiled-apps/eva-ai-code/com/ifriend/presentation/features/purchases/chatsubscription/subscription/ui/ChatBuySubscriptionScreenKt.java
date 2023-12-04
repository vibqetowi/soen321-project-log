package com.ifriend.presentation.features.purchases.chatsubscription.subscription.ui;

import android.app.Activity;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ifriend.billing.api.logic.AppLaunchBillingFlow;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import com.ifriend.presentation.R;
import com.ifriend.presentation.common.uistate.UiStateDelegateExKt;
import com.ifriend.presentation.features.profile.header.model.ChatHeaderUiState;
import com.ifriend.presentation.features.purchases.chatsubscription.subscription.viewmodel.ChatBuySubscriptionViewModel;
import com.ifriend.ui.components.buttons.AppTranslucentButtonKt;
import com.ifriend.ui.components.progress.IndeterminateProgressKt;
import com.ifriend.ui.features.chat.ChatHeaderContentKt;
import com.ifriend.ui.features.interests.ChatInterestsKt;
import com.ifriend.ui.features.purchases.PurchaseKt;
import com.ifriend.ui.theme.AppTheme;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowCollector;
/* compiled from: ChatBuySubscriptionScreen.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001aA\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0010\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u00030\tj\u0002`\n2\u0010\u0010\u000b\u001a\f\u0012\u0004\u0012\u00020\u00030\tj\u0002`\nH\u0007¢\u0006\u0002\u0010\f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u0084\u0002²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u0084\u0002"}, d2 = {"FACTOR_SCROLLABLE_CONTENT_PADDING", "", "ChatBuySubscriptionScreen", "", "viewModel", "Lcom/ifriend/presentation/features/purchases/chatsubscription/subscription/viewmodel/ChatBuySubscriptionViewModel;", "appLaunchBillingFlow", "Lcom/ifriend/billing/api/logic/AppLaunchBillingFlow;", "onBackClick", "Lkotlin/Function0;", "Lcom/ifriend/ui/tools/OnClick;", "onQuestionClick", "(Lcom/ifriend/presentation/features/purchases/chatsubscription/subscription/viewmodel/ChatBuySubscriptionViewModel;Lcom/ifriend/billing/api/logic/AppLaunchBillingFlow;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "presentation_release", "state", "Lcom/ifriend/presentation/features/purchases/chatsubscription/subscription/viewmodel/ChatBuySubscriptionViewModel$UiState;", "chatHeaderState", "Lcom/ifriend/presentation/features/profile/header/model/ChatHeaderUiState;"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatBuySubscriptionScreenKt {
    private static final float FACTOR_SCROLLABLE_CONTENT_PADDING = 0.6f;

    public static final void ChatBuySubscriptionScreen(final ChatBuySubscriptionViewModel viewModel, final AppLaunchBillingFlow appLaunchBillingFlow, final Function0<Unit> onBackClick, Function0<Unit> onQuestionClick, Composer composer, int i) {
        State state;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(appLaunchBillingFlow, "appLaunchBillingFlow");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Intrinsics.checkNotNullParameter(onQuestionClick, "onQuestionClick");
        Composer startRestartGroup = composer.startRestartGroup(1472841375);
        ComposerKt.sourceInformation(startRestartGroup, "C(ChatBuySubscriptionScreen)P(3)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1472841375, i, -1, "com.ifriend.presentation.features.purchases.chatsubscription.subscription.ui.ChatBuySubscriptionScreen (ChatBuySubscriptionScreen.kt:59)");
        }
        ChatBuySubscriptionViewModel chatBuySubscriptionViewModel = viewModel;
        State collectUiState = UiStateDelegateExKt.collectUiState(chatBuySubscriptionViewModel, null, startRestartGroup, 8, 1);
        State collectAsState = SnapshotStateKt.collectAsState(viewModel.getChatHeaderState(), null, startRestartGroup, 8, 1);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Intrinsics.checkNotNull(consume, "null cannot be cast to non-null type android.app.Activity");
        final Activity activity = (Activity) consume;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume2 = startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final LifecycleOwner lifecycleOwner = (LifecycleOwner) consume2;
        UiStateDelegateExKt.CollectEventEffect(chatBuySubscriptionViewModel, new Object[0], null, null, new FlowCollector<ChatBuySubscriptionViewModel.Event>() { // from class: com.ifriend.presentation.features.purchases.chatsubscription.subscription.ui.ChatBuySubscriptionScreenKt$ChatBuySubscriptionScreen$1
            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(ChatBuySubscriptionViewModel.Event event, Continuation continuation) {
                return emit2(event, (Continuation<? super Unit>) continuation);
            }

            /* renamed from: emit  reason: avoid collision after fix types in other method */
            public final Object emit2(ChatBuySubscriptionViewModel.Event event, Continuation<? super Unit> continuation) {
                if (Intrinsics.areEqual(event, ChatBuySubscriptionViewModel.Event.CloseFeature.INSTANCE)) {
                    onBackClick.invoke();
                } else if (!(event instanceof ChatBuySubscriptionViewModel.Event.LaunchBillingFlow)) {
                    throw new NoWhenBranchMatchedException();
                } else {
                    BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new ChatBuySubscriptionScreenKt$ChatBuySubscriptionScreen$1$emit$2(appLaunchBillingFlow, activity, event, viewModel, null), 3, null);
                }
                return Unit.INSTANCE;
            }
        }, startRestartGroup, 72, 6);
        long m6984getGradientColor0d7_KjU = ChatBuySubscriptionScreen$lambda$0(collectUiState).m6984getGradientColor0d7_KjU();
        Modifier background$default = BackgroundKt.background$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), Brush.Companion.m3249verticalGradient8A3gB4$default(Brush.Companion, new Pair[]{TuplesKt.to(Float.valueOf(0.0f), Color.m3281boximpl(m6984getGradientColor0d7_KjU)), TuplesKt.to(Float.valueOf(0.2f), Color.m3281boximpl(m6984getGradientColor0d7_KjU)), TuplesKt.to(Float.valueOf(0.5f), Color.m3281boximpl(Color.Companion.m3326getTransparent0d7_KjU())), TuplesKt.to(Float.valueOf(1.0f), Color.m3281boximpl(Color.Companion.m3326getTransparent0d7_KjU()))}, Float.POSITIVE_INFINITY, 0.0f, 0, 8, (Object) null), null, 0.0f, 6, null);
        startRestartGroup.startReplaceableGroup(733328855);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(background$default);
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
        Modifier systemBarsPadding = WindowInsetsPadding_androidKt.systemBarsPadding(PaddingKt.m752paddingqDBjuR0$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), 0.0f, AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7168getExtraSmallD9Ej5fM(), 0.0f, 0.0f, 13, null));
        startRestartGroup.startReplaceableGroup(-483455358);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Column)P(2,3,1)75@3779L61,76@3845L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(systemBarsPadding);
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
        Updater.m2900setimpl(m2893constructorimpl2, columnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m2900setimpl(m2893constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (m2893constructorimpl2.getInserting() || !Intrinsics.areEqual(m2893constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            m2893constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m2893constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        modifierMaterializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 276693570, "C77@3893L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        ChatHeaderContentKt.ChatHeaderContent(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), ChatBuySubscriptionScreen$lambda$1(collectAsState).getAnimatedAvatarState(), ChatBuySubscriptionScreen$lambda$1(collectAsState).getTitle(), ChatBuySubscriptionScreen$lambda$1(collectAsState).getLvlLabel(), ChatBuySubscriptionScreen$lambda$1(collectAsState).getLvlProgress(), ChatBuySubscriptionScreen$lambda$1(collectAsState).isVisibleLvlProgress(), ChatBuySubscriptionScreen$lambda$1(collectAsState).isVisibleUpdateIndicator(), ChatBuySubscriptionScreen$lambda$1(collectAsState).isVisibleVerified(), true, false, "", null, null, null, null, null, onBackClick, ComposableLambdaKt.composableLambda(startRestartGroup, 69420654, true, new ChatBuySubscriptionScreenKt$ChatBuySubscriptionScreen$2$1$1(onQuestionClick, i)), startRestartGroup, 905969734, ((i << 12) & 3670016) | 12582918, 63488);
        ChatInterestsKt.InterestsRow(ChatBuySubscriptionScreen$lambda$0(collectUiState).getInterestsLabels(), SizeKt.fillMaxWidth$default(PaddingKt.m752paddingqDBjuR0$default(Modifier.Companion, 0.0f, AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7167getExtraMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), 0.0f, 1, null), startRestartGroup, 8);
        if (ChatBuySubscriptionScreen$lambda$0(collectUiState).getOffers().isEmpty()) {
            startRestartGroup.startReplaceableGroup(1178175543);
            SpacerKt.Spacer(ColumnScope.CC.weight$default(columnScopeInstance, Modifier.Companion, 1.0f, false, 2, null), startRestartGroup, 0);
            startRestartGroup.endReplaceableGroup();
            state = collectUiState;
        } else {
            startRestartGroup.startReplaceableGroup(1178175619);
            state = collectUiState;
            BoxWithConstraintsKt.BoxWithConstraints(ColumnScope.CC.weight$default(columnScopeInstance, Modifier.Companion, 1.0f, false, 2, null), null, false, ComposableLambdaKt.composableLambda(startRestartGroup, 1501013653, true, new ChatBuySubscriptionScreenKt$ChatBuySubscriptionScreen$2$1$2(state)), startRestartGroup, CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, 6);
            startRestartGroup.endReplaceableGroup();
        }
        LazyGridDslKt.LazyVerticalGrid(new GridCells.Fixed(3), PaddingKt.m752paddingqDBjuR0$default(PaddingKt.m750paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7176getSmallD9Ej5fM(), 0.0f, 2, null), 0.0f, AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7175getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, false, Arrangement.INSTANCE.m655spacedBy0680j_4(Dp.m5607constructorimpl(0)), Arrangement.INSTANCE.m655spacedBy0680j_4(Dp.m5607constructorimpl(15)), null, false, new ChatBuySubscriptionScreenKt$ChatBuySubscriptionScreen$2$1$3(state, viewModel), startRestartGroup, 1769472, 412);
        startRestartGroup.startReplaceableGroup(1178178194);
        if (!ChatBuySubscriptionScreen$lambda$0(state).getOffers().isEmpty()) {
            AppTranslucentButtonKt.AppTranslucentButton(PaddingKt.m750paddingVpY3zN4$default(PaddingKt.m752paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0.0f, AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7167getExtraMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7175getMediumD9Ej5fM(), 0.0f, 2, null), false, null, null, null, new ChatBuySubscriptionScreenKt$ChatBuySubscriptionScreen$2$1$4(viewModel), ComposableLambdaKt.composableLambda(startRestartGroup, 1515444402, true, new ChatBuySubscriptionScreenKt$ChatBuySubscriptionScreen$2$1$5(state)), startRestartGroup, 1572864, 30);
        }
        startRestartGroup.endReplaceableGroup();
        PurchaseKt.PurchaseSubscriptionScreenFooter(PaddingKt.m750paddingVpY3zN4$default(PaddingKt.m752paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0.0f, AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7175getMediumD9Ej5fM(), 0.0f, AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7178getSmallestD9Ej5fM(), 5, null), AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7175getMediumD9Ej5fM(), 0.0f, 2, null), StringResources_androidKt.stringResource(R.string.buy_subscriotion__subscription_footer_message, startRestartGroup, 0), new ChatBuySubscriptionScreenKt$ChatBuySubscriptionScreen$2$1$6(viewModel), new ChatBuySubscriptionScreenKt$ChatBuySubscriptionScreen$2$1$8(viewModel), new ChatBuySubscriptionScreenKt$ChatBuySubscriptionScreen$2$1$7(viewModel), startRestartGroup, 0, 0);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(-1384229022);
        if (ChatBuySubscriptionScreen$lambda$0(state).isLoading()) {
            IndeterminateProgressKt.m7059IndeterminateProgresssW7UJKQ(boxScopeInstance.matchParentSize(Modifier.Companion), 0L, null, null, startRestartGroup, 0, 14);
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
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new ChatBuySubscriptionScreenKt$ChatBuySubscriptionScreen$3(viewModel, appLaunchBillingFlow, onBackClick, onQuestionClick, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChatBuySubscriptionViewModel.UiState ChatBuySubscriptionScreen$lambda$0(State<ChatBuySubscriptionViewModel.UiState> state) {
        return state.getValue();
    }

    private static final ChatHeaderUiState ChatBuySubscriptionScreen$lambda$1(State<ChatHeaderUiState> state) {
        return state.getValue();
    }
}
