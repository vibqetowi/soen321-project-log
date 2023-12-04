package com.ifriend.presentation.features.home.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import com.ifriend.presentation.common.uistate.UiStateDelegateExKt;
import com.ifriend.presentation.common.uistate.ViewModelExtKt;
import com.ifriend.presentation.features.home.navigation.HomeNavigator;
import com.ifriend.presentation.features.home.viewmodel.HomeViewModel;
import com.ifriend.ui.theme.AppColors;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.FlowCollector;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HomeScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HomeScreenKt$HomeScreen$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ HomeNavigator $homeNavigator;
    final /* synthetic */ boolean $isConfirmEmailVisible;
    final /* synthetic */ HomeViewModel $viewModel;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeScreenKt$HomeScreen$1(HomeViewModel homeViewModel, boolean z, HomeNavigator homeNavigator, int i) {
        super(2);
        this.$viewModel = homeViewModel;
        this.$isConfirmEmailVisible = z;
        this.$homeNavigator = homeNavigator;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-806693798, i, -1, "com.ifriend.presentation.features.home.ui.HomeScreen.<anonymous> (HomeScreen.kt:61)");
            }
            Modifier statusBarsPadding = WindowInsetsPadding_androidKt.statusBarsPadding(BackgroundKt.background$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), AppColors.Companion.getBackgroundColorGradient(), null, 0.0f, 6, null));
            HomeViewModel homeViewModel = this.$viewModel;
            boolean z = this.$isConfirmEmailVisible;
            final HomeNavigator homeNavigator = this.$homeNavigator;
            int i2 = this.$$dirty;
            composer.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(composer, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
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
            Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(composer, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            HomeViewModel homeViewModel2 = homeViewModel;
            State collectUiState = UiStateDelegateExKt.collectUiState(homeViewModel2, null, composer, 8, 1);
            composer.startReplaceableGroup(539797017);
            UiStateDelegateExKt.CollectEventEffect(homeViewModel2, new Object[0], null, null, new FlowCollector<HomeViewModel.Event>() { // from class: com.ifriend.presentation.features.home.ui.HomeScreenKt$HomeScreen$1$1$1$1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(HomeViewModel.Event event, Continuation continuation) {
                    return emit2(event, (Continuation<? super Unit>) continuation);
                }

                /* renamed from: emit  reason: avoid collision after fix types in other method */
                public final Object emit2(HomeViewModel.Event event, Continuation<? super Unit> continuation) {
                    if (event instanceof HomeViewModel.Event.GoToChat) {
                        HomeNavigator.this.getGoToChat().invoke(((HomeViewModel.Event.GoToChat) event).getChatId());
                    } else if (!(event instanceof HomeViewModel.Event.GoToChatsStore)) {
                        throw new NoWhenBranchMatchedException();
                    } else {
                        HomeNavigator.this.getGoToChatsStore().invoke(((HomeViewModel.Event.GoToChatsStore) event).getChatId());
                    }
                    return Unit.INSTANCE;
                }
            }, composer, 72, 6);
            ViewModelExtKt.RegisterObserverEffect(homeViewModel, null, new Object[0], composer, 520, 1);
            composer.endReplaceableGroup();
            HomeScreenKt.HomeContent(homeViewModel, invoke$lambda$2$lambda$0(collectUiState), z, homeNavigator.getGoToConfirmEmail(), composer, ((i2 << 3) & 896) | 8);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    private static final HomeViewModel.UiState invoke$lambda$2$lambda$0(State<HomeViewModel.UiState> state) {
        return state.getValue();
    }
}
