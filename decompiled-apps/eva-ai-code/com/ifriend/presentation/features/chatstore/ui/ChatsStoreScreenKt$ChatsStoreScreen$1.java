package com.ifriend.presentation.features.chatstore.ui;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.ifriend.presentation.common.uistate.UiStateDelegateExKt;
import com.ifriend.presentation.features.chatstore.models.ChatStoreUi;
import com.ifriend.presentation.features.chatstore.viewmodel.ChatsStoreViewModel;
import com.ifriend.ui.components.progress.IndeterminateProgressKt;
import com.ifriend.ui.theme.AppColors;
import com.ifriend.ui.theme.AppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.FlowCollector;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatsStoreScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatsStoreScreenKt$ChatsStoreScreen$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function0<Unit> $onBackClick;
    final /* synthetic */ Function1<String, Unit> $onOpenChat;
    final /* synthetic */ ChatsStoreViewModel $viewModel;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChatsStoreScreenKt$ChatsStoreScreen$1(ChatsStoreViewModel chatsStoreViewModel, Function1<? super String, Unit> function1, Function0<Unit> function0, int i) {
        super(2);
        this.$viewModel = chatsStoreViewModel;
        this.$onOpenChat = function1;
        this.$onBackClick = function0;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r27v0, types: [androidx.compose.runtime.Composer, java.lang.Object] */
    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-508358362, i, -1, "com.ifriend.presentation.features.chatstore.ui.ChatsStoreScreen.<anonymous> (ChatsStoreScreen.kt:70)");
            }
            State collectUiState = UiStateDelegateExKt.collectUiState(this.$viewModel, null, composer, 8, 1);
            composer.startReplaceableGroup(803623323);
            ChatsStoreViewModel chatsStoreViewModel = this.$viewModel;
            final Function1<String, Unit> function1 = this.$onOpenChat;
            UiStateDelegateExKt.CollectEventEffect(chatsStoreViewModel, new Object[0], null, null, new FlowCollector<ChatsStoreViewModel.Event>() { // from class: com.ifriend.presentation.features.chatstore.ui.ChatsStoreScreenKt$ChatsStoreScreen$1$1$1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(ChatsStoreViewModel.Event event, Continuation continuation) {
                    return emit2(event, (Continuation<? super Unit>) continuation);
                }

                /* renamed from: emit  reason: avoid collision after fix types in other method */
                public final Object emit2(ChatsStoreViewModel.Event event, Continuation<? super Unit> continuation) {
                    if (event instanceof ChatsStoreViewModel.Event.GoToChat) {
                        function1.invoke(((ChatsStoreViewModel.Event.GoToChat) event).getChatId());
                    }
                    return Unit.INSTANCE;
                }
            }, composer, 72, 6);
            Unit unit = Unit.INSTANCE;
            composer.endReplaceableGroup();
            ChatStoreLevelPopupKt.ChatStoreLevelPopup(invoke$lambda$0(collectUiState).isVisiblePopup(), new AnonymousClass2(this.$viewModel), composer, 0);
            BoxKt.Box(WindowInsetsPadding_androidKt.statusBarsPadding(BackgroundKt.background$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), AppColors.Companion.getBackgroundColorGradient(), null, 0.0f, 6, null)), composer, 0);
            composer.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            MutableFloatState mutableFloatState = (MutableFloatState) rememberedValue;
            ChatsStoreScreenKt.StoreBackground(invoke$lambda$0(collectUiState).getCurrentChat(), invoke$lambda$3(mutableFloatState), composer, 0);
            Modifier statusBarsPadding = WindowInsetsPadding_androidKt.statusBarsPadding(Modifier.Companion);
            ChatsStoreViewModel chatsStoreViewModel2 = this.$viewModel;
            Function0<Unit> function0 = this.$onBackClick;
            int i2 = this.$$dirty;
            composer.startReplaceableGroup(-483455358);
            ComposerKt.sourceInformation(composer, "CC(Column)P(2,3,1)75@3779L61,76@3845L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            composer.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composer, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(statusBarsPadding);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m2893constructorimpl = Updater.m2893constructorimpl(composer);
            Updater.m2900setimpl(m2893constructorimpl, columnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(composer, 276693570, "C77@3893L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ChatsStoreScreenKt.TopBarContent(function0, new ChatsStoreScreenKt$ChatsStoreScreen$1$3$1(chatsStoreViewModel2), invoke$lambda$0(collectUiState).getNeurons(), composer, (i2 >> 6) & 14);
            SpacerKt.Spacer(SizeKt.m781height3ABfNKs(Modifier.Companion, AppTheme.INSTANCE.getDimensions(composer, AppTheme.$stable).m7175getMediumD9Ej5fM()), composer, 0);
            Modifier weight$default = ColumnScope.CC.weight$default(columnScopeInstance, Modifier.Companion, 1.0f, false, 2, null);
            ChatsStoreViewModel.UiState invoke$lambda$0 = invoke$lambda$0(collectUiState);
            ChatsStoreScreenKt$ChatsStoreScreen$1$3$2 chatsStoreScreenKt$ChatsStoreScreen$1$3$2 = new ChatsStoreScreenKt$ChatsStoreScreen$1$3$2(chatsStoreViewModel2);
            composer.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed = composer.changed(mutableFloatState);
            ChatsStoreScreenKt$ChatsStoreScreen$1$3$3$1 rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new ChatsStoreScreenKt$ChatsStoreScreen$1$3$3$1(mutableFloatState);
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            ChatsStoreScreenKt.SelectChatStorePager(weight$default, invoke$lambda$0, chatsStoreScreenKt$ChatsStoreScreen$1$3$2, rememberedValue2, composer, 0, 0);
            ChatStoreUi currentChat = invoke$lambda$0(collectUiState).getCurrentChat();
            composer.startReplaceableGroup(803624573);
            if (currentChat != null) {
                Modifier navigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(Modifier.Companion);
                composer.startReplaceableGroup(-483455358);
                ComposerKt.sourceInformation(composer, "CC(Column)P(2,3,1)75@3779L61,76@3845L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
                composer.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(composer, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(navigationBarsPadding);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor2);
                } else {
                    composer.useNode();
                }
                Composer m2893constructorimpl2 = Updater.m2893constructorimpl(composer);
                Updater.m2900setimpl(m2893constructorimpl2, columnMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2900setimpl(m2893constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (m2893constructorimpl2.getInserting() || !Intrinsics.areEqual(m2893constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m2893constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m2893constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                modifierMaterializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(composer, 276693570, "C77@3893L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                SpacerKt.Spacer(SizeKt.m781height3ABfNKs(Modifier.Companion, AppTheme.INSTANCE.getDimensions(composer, AppTheme.$stable).m7167getExtraMediumD9Ej5fM()), composer, 0);
                ChatsStoreScreenKt.ChatStoreDescriptionContent(currentChat.getDescription(), composer, 0);
                SpacerKt.Spacer(SizeKt.m781height3ABfNKs(Modifier.Companion, AppTheme.INSTANCE.getDimensions(composer, AppTheme.$stable).m7167getExtraMediumD9Ej5fM()), composer, 0);
                Modifier m783heightInVpY3zN4$default = SizeKt.m783heightInVpY3zN4$default(Modifier.Companion, Dp.m5607constructorimpl((float) AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID), 0.0f, 2, null);
                composer.startReplaceableGroup(-483455358);
                ComposerKt.sourceInformation(composer, "CC(Column)P(2,3,1)75@3779L61,76@3845L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
                composer.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(composer, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(m783heightInVpY3zN4$default);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor3);
                } else {
                    composer.useNode();
                }
                Composer m2893constructorimpl3 = Updater.m2893constructorimpl(composer);
                Updater.m2900setimpl(m2893constructorimpl3, columnMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2900setimpl(m2893constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (m2893constructorimpl3.getInserting() || !Intrinsics.areEqual(m2893constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    m2893constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m2893constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                modifierMaterializerOf3.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(composer, 276693570, "C77@3893L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance3, currentChat.isShowUnlockLevel(), (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composer, 1303766971, true, new ChatsStoreScreenKt$ChatsStoreScreen$1$3$4$1$1(currentChat)), (Composer) composer, 1572870, 30);
                SpacerKt.Spacer(SizeKt.m781height3ABfNKs(Modifier.Companion, AppTheme.INSTANCE.getDimensions(composer, AppTheme.$stable).m7175getMediumD9Ej5fM()), composer, 0);
                AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance3, currentChat.isShowPrice(), (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composer, 259693874, true, new ChatsStoreScreenKt$ChatsStoreScreen$1$3$4$1$2(currentChat, chatsStoreViewModel2)), (Composer) composer, 1572870, 30);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                SpacerKt.Spacer(SizeKt.m781height3ABfNKs(Modifier.Companion, AppTheme.INSTANCE.getDimensions(composer, AppTheme.$stable).m7175getMediumD9Ej5fM()), composer, 0);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
            }
            composer.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            if (invoke$lambda$0(collectUiState).isLoading()) {
                IndeterminateProgressKt.IndeterminateProgressDialog(null, null, composer, 0, 3);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatsStoreScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.chatstore.ui.ChatsStoreScreenKt$ChatsStoreScreen$1$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function0<Unit> {
        AnonymousClass2(Object obj) {
            super(0, obj, ChatsStoreViewModel.class, "onDismissPopup", "onDismissPopup()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((ChatsStoreViewModel) this.receiver).onDismissPopup();
        }
    }

    private static final float invoke$lambda$3(MutableFloatState mutableFloatState) {
        return mutableFloatState.getFloatValue();
    }

    private static final ChatsStoreViewModel.UiState invoke$lambda$0(State<ChatsStoreViewModel.UiState> state) {
        return state.getValue();
    }
}
