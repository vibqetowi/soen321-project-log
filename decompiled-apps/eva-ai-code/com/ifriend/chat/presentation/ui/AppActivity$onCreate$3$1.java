package com.ifriend.chat.presentation.ui;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.ifriend.presentation.features.app.viewmodel.AppViewModel;
import com.ifriend.presentation.features.update.model.InAppUpdateState;
import com.ifriend.presentation.features.update.view.InAppUpdatePopupKt;
import com.ifriend.ui.components.progress.IndeterminateProgressKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: AppActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AppActivity$onCreate$3$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ AppActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppActivity$onCreate$3$1(AppActivity appActivity) {
        super(2);
        this.this$0 = appActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        AppViewModel viewModel;
        AppViewModel viewModel2;
        AppViewModel viewModel3;
        AppViewModel viewModel4;
        AppViewModel viewModel5;
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-999391745, i, -1, "com.ifriend.chat.presentation.ui.AppActivity.onCreate.<anonymous>.<anonymous> (AppActivity.kt:216)");
            }
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
            AppActivity appActivity = this.this$0;
            composer.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(composer, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
            composer.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composer, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxSize$default);
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
            viewModel = appActivity.getViewModel();
            State collectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(viewModel.getInAppUpdateState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer, 8, 7);
            viewModel2 = appActivity.getViewModel();
            State collectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(viewModel2.getUiStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer, 8, 7);
            boolean isVisible = invoke$lambda$2$lambda$0(collectAsStateWithLifecycle).isVisible();
            boolean canClose = invoke$lambda$2$lambda$0(collectAsStateWithLifecycle).getCanClose();
            viewModel3 = appActivity.getViewModel();
            viewModel4 = appActivity.getViewModel();
            InAppUpdatePopupKt.InAppUpdatesPopup(isVisible, canClose, new AppActivity$onCreate$3$1$1$1(viewModel3), new AppActivity$onCreate$3$1$1$2(viewModel4), composer, 0);
            boolean isVisibleSnackbar = invoke$lambda$2$lambda$0(collectAsStateWithLifecycle).isVisibleSnackbar();
            viewModel5 = appActivity.getViewModel();
            InAppUpdatePopupKt.InAppUpdateDownloadedSnackbar(isVisibleSnackbar, new AppActivity$onCreate$3$1$1$3(viewModel5), composer, 0);
            composer.startReplaceableGroup(-1138635931);
            if (invoke$lambda$2$lambda$1(collectAsStateWithLifecycle2).isLoading()) {
                IndeterminateProgressKt.m7059IndeterminateProgresssW7UJKQ(boxScopeInstance.matchParentSize(Modifier.Companion), 0L, null, null, composer, 0, 14);
            }
            composer.endReplaceableGroup();
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

    private static final InAppUpdateState invoke$lambda$2$lambda$0(State<InAppUpdateState> state) {
        return state.getValue();
    }

    private static final AppViewModel.UiState invoke$lambda$2$lambda$1(State<AppViewModel.UiState> state) {
        return state.getValue();
    }
}
