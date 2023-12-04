package com.ifriend.presentation.features.purchases.benefits.flow;

import android.content.Context;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.TextKt;
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
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavBackStackEntry;
import androidx.profileinstaller.ProfileVerifier;
import com.ifriend.presentation.R;
import com.ifriend.presentation.common.uistate.UiStateDelegateExKt;
import com.ifriend.presentation.features.app.di.AppViewModelProvider;
import com.ifriend.presentation.features.app.di.AppViewModelProviderKt;
import com.ifriend.presentation.features.purchases.benefits.screen.PremiumBenefitsScreenKt;
import com.ifriend.presentation.features.purchases.benefits.viewmodel.ActivePremiumBenefitsViewModel;
import com.ifriend.presentation.features.purchases.benefits.viewmodel.ActivePremiumBenefitsViewModelFactory;
import com.ifriend.presentation.features.purchases.premium.navigation.BuyPremiumNavigationRootKt;
import com.ifriend.ui.components.modifier.ClickableModifierKt;
import com.ifriend.ui.theme.AppFontFamily;
import com.ifriend.ui.theme.AppTheme;
import com.ifriend.ui.utils.extensions.ContextKt;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.FlowCollector;
/* compiled from: BenefitsPremiumActiveEntry.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedVisibilityScope;", "it", "Landroidx/navigation/NavBackStackEntry;", "invoke", "(Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class BenefitsPremiumActiveEntry$featureNavigation$1 extends Lambda implements Function4<AnimatedVisibilityScope, NavBackStackEntry, Composer, Integer, Unit> {
    final /* synthetic */ Function0<Unit> $closeFeature;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BenefitsPremiumActiveEntry$featureNavigation$1(Function0<Unit> function0) {
        super(4);
        this.$closeFeature = function0;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, navBackStackEntry, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedVisibilityScope nonAnimationComposable, NavBackStackEntry it, Composer composer, int i) {
        CreationExtras.Empty empty;
        Intrinsics.checkNotNullParameter(nonAnimationComposable, "$this$nonAnimationComposable");
        Intrinsics.checkNotNullParameter(it, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(737088068, i, -1, "com.ifriend.presentation.features.purchases.benefits.flow.BenefitsPremiumActiveEntry.featureNavigation.<anonymous> (BenefitsPremiumActiveEntry.kt:53)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(AppViewModelProviderKt.getLocalAppViewModelProvider());
        ComposerKt.sourceInformationMarkerEnd(composer);
        ActivePremiumBenefitsViewModelFactory provideActivePremiumBenefitsViewModelFactory = ((AppViewModelProvider) consume).provideActivePremiumBenefitsViewModelFactory();
        composer.startReplaceableGroup(1729797275);
        ComposerKt.sourceInformation(composer, "CC(viewModel)P(3,2,1)*80@3834L7,90@4209L68:ViewModel.kt#3tja67");
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, 6);
        if (current == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        if (current instanceof HasDefaultViewModelProviderFactory) {
            empty = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
        } else {
            empty = CreationExtras.Empty.INSTANCE;
        }
        ViewModel viewModel = ViewModelKt.viewModel(ActivePremiumBenefitsViewModel.class, current, null, provideActivePremiumBenefitsViewModelFactory, empty, composer, 36936, 0);
        composer.endReplaceableGroup();
        ActivePremiumBenefitsViewModel activePremiumBenefitsViewModel = (ActivePremiumBenefitsViewModel) viewModel;
        ActivePremiumBenefitsViewModel activePremiumBenefitsViewModel2 = activePremiumBenefitsViewModel;
        State collectUiState = UiStateDelegateExKt.collectUiState(activePremiumBenefitsViewModel2, null, composer, 8, 1);
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume2 = composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        ComposerKt.sourceInformationMarkerEnd(composer);
        final Context context = (Context) consume2;
        final Function0<Unit> function0 = this.$closeFeature;
        UiStateDelegateExKt.CollectEventEffect(activePremiumBenefitsViewModel2, new Object[0], null, null, new FlowCollector<ActivePremiumBenefitsViewModel.Event>() { // from class: com.ifriend.presentation.features.purchases.benefits.flow.BenefitsPremiumActiveEntry$featureNavigation$1.1
            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(ActivePremiumBenefitsViewModel.Event event, Continuation continuation) {
                return emit2(event, (Continuation<? super Unit>) continuation);
            }

            /* renamed from: emit  reason: avoid collision after fix types in other method */
            public final Object emit2(ActivePremiumBenefitsViewModel.Event event, Continuation<? super Unit> continuation) {
                if (Intrinsics.areEqual(event, ActivePremiumBenefitsViewModel.Event.OpenManageSubscription.INSTANCE)) {
                    ContextKt.openLink(context, "https://play.google.com/store/account/subscriptions?hl=en&gl=US");
                } else if (Intrinsics.areEqual(event, ActivePremiumBenefitsViewModel.Event.CloseFeature.INSTANCE)) {
                    function0.invoke();
                }
                return Unit.INSTANCE;
            }
        }, composer, 72, 6);
        Modifier background$default = BackgroundKt.background$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), BuyPremiumNavigationRootKt.getPremiumBackgroundGradient(), null, 0.0f, 6, null);
        Function0<Unit> function02 = this.$closeFeature;
        composer.startReplaceableGroup(733328855);
        ComposerKt.sourceInformation(composer, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
        composer.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(composer, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(background$default);
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
        Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
        Modifier navigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(Modifier.Companion);
        composer.startReplaceableGroup(-483455358);
        ComposerKt.sourceInformation(composer, "CC(Column)P(2,3,1)75@3779L61,76@3845L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
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
        Updater.m2900setimpl(m2893constructorimpl2, columnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m2900setimpl(m2893constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (m2893constructorimpl2.getInserting() || !Intrinsics.areEqual(m2893constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            m2893constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m2893constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        modifierMaterializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(composer, 276693570, "C77@3893L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        String upperCase = StringResources_androidKt.stringResource(R.string.premium_benefits__screen_title__premium_active, composer, 0).toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        PremiumBenefitsScreenKt.PremiumBenefits(upperCase, invoke$lambda$0(collectUiState).getBenefits(), function02, WindowInsetsPadding_androidKt.statusBarsPadding(ColumnScope.CC.weight$default(columnScopeInstance, Modifier.Companion, 1.0f, false, 2, null)), composer, 64, 0);
        TextKt.m2145Text4IGK_g(StringResources_androidKt.stringResource(R.string.subscriotion__manage_subscription, composer, 0), ClickableModifierKt.noIndicationClickable$default(PaddingKt.m750paddingVpY3zN4$default(PaddingKt.m752paddingqDBjuR0$default(Modifier.Companion, 0.0f, AppTheme.INSTANCE.getDimensions(composer, AppTheme.$stable).m7178getSmallestD9Ej5fM(), 0.0f, 0.0f, 13, null), AppTheme.INSTANCE.getDimensions(composer, AppTheme.$stable).m7175getMediumD9Ej5fM(), 0.0f, 2, null), false, new BenefitsPremiumActiveEntry$featureNavigation$1$2$1$1(activePremiumBenefitsViewModel), 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, AppTheme.INSTANCE.getTypography(composer, AppTheme.$stable).getTitleItemBold(), composer, 0, 0, 65532);
        Modifier m752paddingqDBjuR0$default = PaddingKt.m752paddingqDBjuR0$default(PaddingKt.m752paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0.0f, AppTheme.INSTANCE.getDimensions(composer, AppTheme.$stable).m7175getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), 0.0f, 0.0f, 0.0f, AppTheme.INSTANCE.getDimensions(composer, AppTheme.$stable).m7167getExtraMediumD9Ej5fM(), 7, null);
        String stringResource = StringResources_androidKt.stringResource(R.string.buy_subscriotion__subscription_footer_message, composer, 0);
        long sp = TextUnitKt.getSp(9);
        FontFamily ghino = AppFontFamily.INSTANCE.getGhino();
        TextKt.m2145Text4IGK_g(stringResource, m752paddingqDBjuR0$default, AppTheme.INSTANCE.getColors(composer, AppTheme.$stable).m7108getTextPrimary0d7_KjU(), sp, (FontStyle) null, FontWeight.Companion.getNormal(), ghino, 0L, (TextDecoration) null, TextAlign.m5462boximpl(TextAlign.Companion.m5469getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 199680, 0, 130448);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        AnimatedVisibilityKt.AnimatedVisibility(invoke$lambda$0(collectUiState).isLoading(), (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableSingletons$BenefitsPremiumActiveEntryKt.INSTANCE.m6952getLambda1$presentation_release(), composer, (int) ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    private static final ActivePremiumBenefitsViewModel.UiState invoke$lambda$0(State<ActivePremiumBenefitsViewModel.UiState> state) {
        return state.getValue();
    }
}
