package com.ifriend.presentation.features.onboarding.flow.navigation;

import android.os.Bundle;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
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
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.ColorPainter;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.ViewModelKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavGraphBuilderKt;
import androidx.navigation.compose.NavHostControllerKt;
import androidx.navigation.compose.NavHostKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.domain.onboarding.model.OnboardingStep;
import com.ifriend.presentation.common.uistate.UiStateDelegateExKt;
import com.ifriend.presentation.extensions.NavigationExtKt;
import com.ifriend.presentation.features.app.di.AppViewModelProvider;
import com.ifriend.presentation.features.app.di.AppViewModelProviderKt;
import com.ifriend.presentation.features.onboarding.flow.viewmodel.OnboardingFlowViewModel;
import com.ifriend.presentation.features.onboarding.steps.view.common.OnboardingHeaderKt;
import com.ifriend.presentation.features.onboarding.steps.viewmodel.factory.OnboardingStepViewModelFactory;
import com.ifriend.presentation.navigation.FeatureRoute;
import com.ifriend.presentation.navigation.destination.OnboardingDestination;
import com.ifriend.ui.components.brush.LinearGradientKt;
import com.ifriend.ui.components.image.AppAsyncImageKt;
import com.ifriend.ui.progress.MultiPartProgressState;
import com.ifriend.ui.theme.AppTheme;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
/* compiled from: OnboardingNavigationEntry.kt */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J%\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\u0012J'\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00152\u0010\u0010\u0016\u001a\f\u0012\u0004\u0012\u00020\f0\u0017j\u0002`\u0018H\u0007¢\u0006\u0002\u0010\u0019JA\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001d2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\u001f2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f0\u001fH\u0002R\u00020\u001b¢\u0006\u0002\u0010!J=\u0010\"\u001a\u00020\f*\u00020\u001b2\u0006\u0010#\u001a\u00020\b2\"\u0010$\u001a\u001e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\f0%¢\u0006\u0002\b(¢\u0006\u0002\b)H\u0002¢\u0006\u0002\u0010*J\f\u0010+\u001a\u00020,*\u00020-H\u0002R\u0014\u0010\u0003\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006.²\u0006\n\u0010/\u001a\u000200X\u008a\u0084\u0002²\u0006\n\u0010\r\u001a\u00020\u000eX\u008a\u008e\u0002²\u0006\n\u00101\u001a\u000202X\u008a\u0084\u0002²\u0006\n\u00101\u001a\u000203X\u008a\u0084\u0002²\u0006\n\u00101\u001a\u000203X\u008a\u0084\u0002²\u0006\n\u00101\u001a\u000204X\u008a\u0084\u0002²\u0006\n\u00101\u001a\u000204X\u008a\u0084\u0002²\u0006\n\u00101\u001a\u000204X\u008a\u0084\u0002²\u0006\n\u00101\u001a\u000204X\u008a\u0084\u0002²\u0006\n\u00101\u001a\u000205X\u008a\u0084\u0002²\u0006\n\u00101\u001a\u000206X\u008a\u0084\u0002²\u0006\n\u00101\u001a\u000203X\u008a\u0084\u0002²\u0006\n\u00101\u001a\u000202X\u008a\u0084\u0002²\u0006\n\u00101\u001a\u000206X\u008a\u0084\u0002²\u0006\n\u00101\u001a\u000204X\u008a\u0084\u0002²\u0006\n\u00101\u001a\u000207X\u008a\u0084\u0002²\u0006\n\u00101\u001a\u000203X\u008a\u0084\u0002²\u0006\n\u00101\u001a\u000204X\u008a\u0084\u0002²\u0006\n\u00101\u001a\u000208X\u008a\u0084\u0002²\u0006\n\u00101\u001a\u000204X\u008a\u0084\u0002"}, d2 = {"Lcom/ifriend/presentation/features/onboarding/flow/navigation/OnboardingNavigationEntry;", "Lcom/ifriend/presentation/navigation/FeatureRoute;", "()V", "backgroundGradient", "Landroidx/compose/ui/graphics/Brush;", "getBackgroundGradient", "()Landroidx/compose/ui/graphics/Brush;", "featureRoute", "", "getFeatureRoute", "()Ljava/lang/String;", "BotPagerBackground", "", "isVisibleBackground", "", "avatarOffset", "", "avatar", "(ZFLjava/lang/String;Landroidx/compose/runtime/Composer;I)V", "OnboardingFlow", "featureViewModel", "Lcom/ifriend/presentation/features/onboarding/flow/viewmodel/OnboardingFlowViewModel;", "finishFeature", "Lkotlin/Function0;", "Lcom/ifriend/ui/tools/OnClick;", "(Lcom/ifriend/presentation/features/onboarding/flow/viewmodel/OnboardingFlowViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "featureNavigation", "Landroidx/navigation/NavGraphBuilder;", "factory", "Lcom/ifriend/presentation/features/onboarding/steps/viewmodel/factory/OnboardingStepViewModelFactory;", "onBotPagerOffsetChange", "Lkotlin/Function1;", "onBotAvatarChange", "(Landroidx/navigation/NavGraphBuilder;Lcom/ifriend/presentation/features/onboarding/steps/viewmodel/factory/OnboardingStepViewModelFactory;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "onboardingComposable", "route", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function2;", "Landroidx/compose/animation/AnimatedContentScope;", "Landroidx/navigation/NavBackStackEntry;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Lkotlin/jvm/functions/Function4;)V", "toDestination", "Lcom/ifriend/presentation/navigation/destination/OnboardingDestination;", "Lcom/ifriend/domain/onboarding/model/OnboardingStep;", "presentation_release", "viewState", "Lcom/ifriend/presentation/features/onboarding/flow/viewmodel/OnboardingFlowViewModel$UiState;", "state", "Lcom/ifriend/presentation/features/onboarding/steps/view/textfield/OnboardingTextFieldState;", "Lcom/ifriend/presentation/features/onboarding/steps/view/info/OnboardingInfoState;", "Lcom/ifriend/presentation/features/onboarding/steps/view/selector/OnboardingSelectorState;", "Lcom/ifriend/presentation/features/onboarding/steps/view/chip/OnboardingChipState;", "Lcom/ifriend/presentation/features/onboarding/steps/view/wheel/OnboardingWheelState;", "Lcom/ifriend/presentation/features/onboarding/steps/view/selectbot/OnboardingBotPagerState;", "Lcom/ifriend/presentation/features/onboarding/steps/view/grid/OnboardingGridState;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnboardingNavigationEntry implements FeatureRoute {
    public static final int $stable = 0;
    private final String featureRoute = OnboardingDestination.Route.INSTANCE.getDestination();

    private final Brush getBackgroundGradient() {
        return LinearGradientKt.m7018linearGradienteBVf0pg$default(Brush.Companion, CollectionsKt.listOf((Object[]) new Color[]{Color.m3281boximpl(ColorKt.Color(3863958936L)), Color.m3281boximpl(ColorKt.Color(3862377822L)), Color.m3281boximpl(ColorKt.Color(3858759680L))}), null, 0, 325.0f, false, 22, null);
    }

    @Override // com.ifriend.presentation.navigation.FeatureRoute
    public String getFeatureRoute() {
        return this.featureRoute;
    }

    public final void OnboardingFlow(OnboardingFlowViewModel featureViewModel, final Function0<Unit> finishFeature, Composer composer, int i) {
        float f;
        Composer composer2;
        Intrinsics.checkNotNullParameter(featureViewModel, "featureViewModel");
        Intrinsics.checkNotNullParameter(finishFeature, "finishFeature");
        Composer startRestartGroup = composer.startRestartGroup(2001534338);
        ComposerKt.sourceInformation(startRestartGroup, "C(OnboardingFlow)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2001534338, i, -1, "com.ifriend.presentation.features.onboarding.flow.navigation.OnboardingNavigationEntry.OnboardingFlow (OnboardingNavigationEntry.kt:102)");
        }
        Modifier statusBarsPadding = WindowInsetsPadding_androidKt.statusBarsPadding(BackgroundKt.background$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), getBackgroundGradient(), null, 0.0f, 6, null));
        startRestartGroup.startReplaceableGroup(733328855);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(statusBarsPadding);
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
        OnboardingFlowViewModel onboardingFlowViewModel = featureViewModel;
        State collectUiState = UiStateDelegateExKt.collectUiState(onboardingFlowViewModel, null, startRestartGroup, 8, 1);
        OnboardingStep startStep = OnboardingFlow$lambda$8$lambda$0(collectUiState).getStartStep();
        startRestartGroup.startReplaceableGroup(-317602619);
        if (startStep == null) {
            f = 0.0f;
            composer2 = startRestartGroup;
        } else {
            final NavHostController rememberNavController = NavHostControllerKt.rememberNavController(new Navigator[0], startRestartGroup, 8);
            BackHandlerKt.BackHandler(false, new OnboardingNavigationEntry$OnboardingFlow$1$1$1(featureViewModel), startRestartGroup, 0, 1);
            UiStateDelegateExKt.CollectEventEffect(onboardingFlowViewModel, new Object[0], null, null, new FlowCollector<OnboardingFlowViewModel.Event>() { // from class: com.ifriend.presentation.features.onboarding.flow.navigation.OnboardingNavigationEntry$OnboardingFlow$1$1$2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(OnboardingFlowViewModel.Event event, Continuation continuation) {
                    return emit2(event, (Continuation<? super Unit>) continuation);
                }

                /* renamed from: emit  reason: avoid collision after fix types in other method */
                public final Object emit2(OnboardingFlowViewModel.Event event, Continuation<? super Unit> continuation) {
                    OnboardingDestination destination;
                    if (event instanceof OnboardingFlowViewModel.Event.NavigateToStep) {
                        NavHostController navHostController = NavHostController.this;
                        destination = this.toDestination(((OnboardingFlowViewModel.Event.NavigateToStep) event).getStep());
                        NavController.navigate$default(navHostController, destination.getDestination(), null, null, 6, null);
                    } else if ((event instanceof OnboardingFlowViewModel.Event.NavigateUp) && !NavHostController.this.navigateUp()) {
                        finishFeature.invoke();
                    }
                    return Unit.INSTANCE;
                }
            }, startRestartGroup, 72, 6);
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            final MutableState mutableState = (MutableState) rememberedValue;
            NavigationExtKt.DestinationListenerEffect(rememberNavController, new Object[0], new NavController.OnDestinationChangedListener() { // from class: com.ifriend.presentation.features.onboarding.flow.navigation.OnboardingNavigationEntry$OnboardingFlow$1$1$3
                @Override // androidx.navigation.NavController.OnDestinationChangedListener
                public final void onDestinationChanged(NavController navController, NavDestination dest, Bundle bundle) {
                    Intrinsics.checkNotNullParameter(navController, "<anonymous parameter 0>");
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    OnboardingNavigationEntry.OnboardingFlow$lambda$8$lambda$7$lambda$3(mutableState, Intrinsics.areEqual(dest.getRoute(), OnboardingDestination.BotsPager.INSTANCE.getDestination()));
                }
            }, startRestartGroup, 72);
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            MutableState mutableState2 = (MutableState) rememberedValue2;
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            MutableFloatState mutableFloatState = (MutableFloatState) rememberedValue3;
            BotPagerBackground(OnboardingFlow$lambda$8$lambda$7$lambda$2(mutableState), mutableFloatState.getFloatValue(), (String) mutableState2.getValue(), startRestartGroup, (i << 3) & 7168);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(AppViewModelProviderKt.getLocalAppViewModelProvider());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            OnboardingStepViewModelFactory create = ((AppViewModelProvider) consume).provideOnboardingStepViewModelFactory().create(ViewModelKt.getViewModelScope(featureViewModel), featureViewModel.getOnboardingEventsFlow());
            startRestartGroup.startReplaceableGroup(-483455358);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Column)P(2,3,1)75@3779L61,76@3845L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(Modifier.Companion);
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
            SpacerKt.Spacer(SizeKt.m781height3ABfNKs(Modifier.Companion, AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7175getMediumD9Ej5fM()), startRestartGroup, 0);
            OnboardingHeaderKt.OnboardingHeader(OnboardingFlow$lambda$8$lambda$0(collectUiState).getProgress(), new OnboardingNavigationEntry$OnboardingFlow$1$1$4$1(featureViewModel), OnboardingFlow$lambda$8$lambda$0(collectUiState).isVisibleBack(), startRestartGroup, MultiPartProgressState.$stable);
            f = 0.0f;
            composer2 = startRestartGroup;
            NavHostKt.NavHost(rememberNavController, toDestination(startStep).getDestination(), null, null, null, null, null, null, null, new OnboardingNavigationEntry$OnboardingFlow$1$1$4$2(mutableState2, mutableFloatState, this, create), composer2, 8, TypedValues.PositionType.TYPE_CURVE_FIT);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            Unit unit = Unit.INSTANCE;
            Unit unit2 = Unit.INSTANCE;
        }
        composer2.endReplaceableGroup();
        Composer composer3 = composer2;
        AnimatedVisibilityKt.AnimatedVisibility(OnboardingFlow$lambda$8$lambda$0(collectUiState).isError(), (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, f, 3, null), EnterExitTransitionKt.fadeOut$default(null, f, 3, null), (String) null, ComposableLambdaKt.composableLambda(composer2, -1075523356, true, new OnboardingNavigationEntry$OnboardingFlow$1$2(featureViewModel)), composer3, 200064, 18);
        AnimatedVisibilityKt.AnimatedVisibility(OnboardingFlow$lambda$8$lambda$0(collectUiState).isLoading(), (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, f, 3, null), EnterExitTransitionKt.fadeOut$default(null, f, 3, null), (String) null, ComposableSingletons$OnboardingNavigationEntryKt.INSTANCE.m6932getLambda1$presentation_release(), composer3, 200064, 18);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new OnboardingNavigationEntry$OnboardingFlow$2(this, featureViewModel, finishFeature, i));
    }

    private static final boolean OnboardingFlow$lambda$8$lambda$7$lambda$2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OnboardingFlow$lambda$8$lambda$7$lambda$3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void BotPagerBackground(boolean z, float f, String str, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1413658303);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1413658303, i2, -1, "com.ifriend.presentation.features.onboarding.flow.navigation.OnboardingNavigationEntry.BotPagerBackground (OnboardingNavigationEntry.kt:199)");
            }
            if (z) {
                AppAsyncImageKt.AppAsyncImage(str, AlphaKt.alpha(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), MathHelpersKt.lerp(0.0f, 0.3f, 1.0f - f)), null, null, null, new ColorPainter(Color.Companion.m3326getTransparent0d7_KjU(), null), new ColorPainter(Color.Companion.m3326getTransparent0d7_KjU(), null), startRestartGroup, ((i2 >> 6) & 14) | 2359296, 28);
            }
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
        endRestartGroup.updateScope(new OnboardingNavigationEntry$BotPagerBackground$1(this, z, f, str, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void featureNavigation(NavGraphBuilder navGraphBuilder, OnboardingStepViewModelFactory onboardingStepViewModelFactory, Function1<? super Float, Unit> function1, Function1<? super String, Unit> function12) {
        onboardingComposable(navGraphBuilder, OnboardingDestination.UserName.INSTANCE.getDestination(), ComposableLambdaKt.composableLambdaInstance(515475535, true, new OnboardingNavigationEntry$featureNavigation$1(onboardingStepViewModelFactory)));
        onboardingComposable(navGraphBuilder, OnboardingDestination.Welcome.INSTANCE.getDestination(), ComposableLambdaKt.composableLambdaInstance(58406584, true, new OnboardingNavigationEntry$featureNavigation$2(onboardingStepViewModelFactory)));
        onboardingComposable(navGraphBuilder, OnboardingDestination.LetUsKnowMore.INSTANCE.getDestination(), ComposableLambdaKt.composableLambdaInstance(503943895, true, new OnboardingNavigationEntry$featureNavigation$3(onboardingStepViewModelFactory)));
        onboardingComposable(navGraphBuilder, OnboardingDestination.UserGender.INSTANCE.getDestination(), ComposableLambdaKt.composableLambdaInstance(949481206, true, new OnboardingNavigationEntry$featureNavigation$4(onboardingStepViewModelFactory)));
        onboardingComposable(navGraphBuilder, OnboardingDestination.AskEveryDay.INSTANCE.getDestination(), ComposableLambdaKt.composableLambdaInstance(1395018517, true, new OnboardingNavigationEntry$featureNavigation$5(onboardingStepViewModelFactory)));
        onboardingComposable(navGraphBuilder, OnboardingDestination.BotVoice.INSTANCE.getDestination(), ComposableLambdaKt.composableLambdaInstance(1840555828, true, new OnboardingNavigationEntry$featureNavigation$6(onboardingStepViewModelFactory)));
        onboardingComposable(navGraphBuilder, OnboardingDestination.BotPersonality.INSTANCE.getDestination(), ComposableLambdaKt.composableLambdaInstance(-2008874157, true, new OnboardingNavigationEntry$featureNavigation$7(onboardingStepViewModelFactory)));
        onboardingComposable(navGraphBuilder, OnboardingDestination.UserInterests.INSTANCE.getDestination(), ComposableLambdaKt.composableLambdaInstance(-1563336846, true, new OnboardingNavigationEntry$featureNavigation$8(onboardingStepViewModelFactory)));
        onboardingComposable(navGraphBuilder, OnboardingDestination.UserBirthDate.INSTANCE.getDestination(), ComposableLambdaKt.composableLambdaInstance(-1117799535, true, new OnboardingNavigationEntry$featureNavigation$9(onboardingStepViewModelFactory)));
        onboardingComposable(navGraphBuilder, OnboardingDestination.LastStep.INSTANCE.getDestination(), ComposableLambdaKt.composableLambdaInstance(-672262224, true, new OnboardingNavigationEntry$featureNavigation$10(onboardingStepViewModelFactory)));
        onboardingComposable(navGraphBuilder, OnboardingDestination.BotName.INSTANCE.getDestination(), ComposableLambdaKt.composableLambdaInstance(255599916, true, new OnboardingNavigationEntry$featureNavigation$11(onboardingStepViewModelFactory)));
        onboardingComposable(navGraphBuilder, OnboardingDestination.BotAge.INSTANCE.getDestination(), ComposableLambdaKt.composableLambdaInstance(701137227, true, new OnboardingNavigationEntry$featureNavigation$12(onboardingStepViewModelFactory)));
        onboardingComposable(navGraphBuilder, OnboardingDestination.BotGender.INSTANCE.getDestination(), ComposableLambdaKt.composableLambdaInstance(1146674538, true, new OnboardingNavigationEntry$featureNavigation$13(onboardingStepViewModelFactory)));
        onboardingComposable(navGraphBuilder, OnboardingDestination.BotsPager.INSTANCE.getDestination(), ComposableLambdaKt.composableLambdaInstance(1592211849, true, new OnboardingNavigationEntry$featureNavigation$14(onboardingStepViewModelFactory, function12, function1)));
        onboardingComposable(navGraphBuilder, OnboardingDestination.Awesome.INSTANCE.getDestination(), ComposableLambdaKt.composableLambdaInstance(2037749160, true, new OnboardingNavigationEntry$featureNavigation$15(onboardingStepViewModelFactory)));
        onboardingComposable(navGraphBuilder, OnboardingDestination.BotJokes.INSTANCE.getDestination(), ComposableLambdaKt.composableLambdaInstance(-1811680825, true, new OnboardingNavigationEntry$featureNavigation$16(onboardingStepViewModelFactory)));
        onboardingComposable(navGraphBuilder, OnboardingDestination.UserFavoriteTopic.INSTANCE.getDestination(), ComposableLambdaKt.composableLambdaInstance(-1366143514, true, new OnboardingNavigationEntry$featureNavigation$17(onboardingStepViewModelFactory)));
        onboardingComposable(navGraphBuilder, OnboardingDestination.BotCharacter.INSTANCE.getDestination(), ComposableLambdaKt.composableLambdaInstance(-920606203, true, new OnboardingNavigationEntry$featureNavigation$18(onboardingStepViewModelFactory)));
    }

    private final void onboardingComposable(NavGraphBuilder navGraphBuilder, String str, Function4<? super AnimatedContentScope, ? super NavBackStackEntry, ? super Composer, ? super Integer, Unit> function4) {
        NavGraphBuilderKt.composable$default(navGraphBuilder, str, null, null, OnboardingNavigationEntry$onboardingComposable$1.INSTANCE, OnboardingNavigationEntry$onboardingComposable$2.INSTANCE, null, null, function4, 102, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OnboardingDestination toDestination(OnboardingStep onboardingStep) {
        if (Intrinsics.areEqual(onboardingStep, OnboardingStep.UserName.INSTANCE)) {
            return OnboardingDestination.UserName.INSTANCE;
        }
        if (Intrinsics.areEqual(onboardingStep, OnboardingStep.Welcome.INSTANCE)) {
            return OnboardingDestination.Welcome.INSTANCE;
        }
        if (Intrinsics.areEqual(onboardingStep, OnboardingStep.LetUsKnowMore.INSTANCE)) {
            return OnboardingDestination.LetUsKnowMore.INSTANCE;
        }
        if (Intrinsics.areEqual(onboardingStep, OnboardingStep.UserGender.INSTANCE)) {
            return OnboardingDestination.UserGender.INSTANCE;
        }
        if (Intrinsics.areEqual(onboardingStep, OnboardingStep.AskEveryDay.INSTANCE)) {
            return OnboardingDestination.AskEveryDay.INSTANCE;
        }
        if (Intrinsics.areEqual(onboardingStep, OnboardingStep.BotVoice.INSTANCE)) {
            return OnboardingDestination.BotVoice.INSTANCE;
        }
        if (Intrinsics.areEqual(onboardingStep, OnboardingStep.BotPersonality.INSTANCE)) {
            return OnboardingDestination.BotPersonality.INSTANCE;
        }
        if (Intrinsics.areEqual(onboardingStep, OnboardingStep.UserInterests.INSTANCE)) {
            return OnboardingDestination.UserInterests.INSTANCE;
        }
        if (Intrinsics.areEqual(onboardingStep, OnboardingStep.UserBirthDate.INSTANCE)) {
            return OnboardingDestination.UserBirthDate.INSTANCE;
        }
        if (Intrinsics.areEqual(onboardingStep, OnboardingStep.LastStep.INSTANCE)) {
            return OnboardingDestination.LastStep.INSTANCE;
        }
        if (Intrinsics.areEqual(onboardingStep, OnboardingStep.BotName.INSTANCE)) {
            return OnboardingDestination.BotName.INSTANCE;
        }
        if (Intrinsics.areEqual(onboardingStep, OnboardingStep.BotAge.INSTANCE)) {
            return OnboardingDestination.BotAge.INSTANCE;
        }
        if (Intrinsics.areEqual(onboardingStep, OnboardingStep.BotGender.INSTANCE)) {
            return OnboardingDestination.BotGender.INSTANCE;
        }
        if (Intrinsics.areEqual(onboardingStep, OnboardingStep.BotsPager.INSTANCE)) {
            return OnboardingDestination.BotsPager.INSTANCE;
        }
        if (Intrinsics.areEqual(onboardingStep, OnboardingStep.Awesome.INSTANCE)) {
            return OnboardingDestination.Awesome.INSTANCE;
        }
        if (Intrinsics.areEqual(onboardingStep, OnboardingStep.BotCharacter.INSTANCE)) {
            return OnboardingDestination.BotCharacter.INSTANCE;
        }
        if (Intrinsics.areEqual(onboardingStep, OnboardingStep.BotJokes.INSTANCE)) {
            return OnboardingDestination.BotJokes.INSTANCE;
        }
        if (Intrinsics.areEqual(onboardingStep, OnboardingStep.UserFavoriteTopic.INSTANCE)) {
            return OnboardingDestination.UserFavoriteTopic.INSTANCE;
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final OnboardingFlowViewModel.UiState OnboardingFlow$lambda$8$lambda$0(State<OnboardingFlowViewModel.UiState> state) {
        return state.getValue();
    }
}
