package com.ifriend.presentation.features.purchases.chatsubscription.flow;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
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
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavHostControllerKt;
import coil.ImageLoader;
import coil.compose.AsyncImagePainterKt;
import coil.request.CachePolicy;
import coil.request.ImageRequest;
import com.ifriend.presentation.common.observers.appevents.params.BuyChatSubscriptionBillingUiParams;
import com.ifriend.presentation.common.uistate.UiStateDelegateExKt;
import com.ifriend.presentation.extensions.SerializeobjectKt;
import com.ifriend.presentation.features.app.di.AppViewModelProvider;
import com.ifriend.presentation.features.app.di.AppViewModelProviderKt;
import com.ifriend.presentation.features.purchases.chatsubscription.flow.viewmodel.ChatFlowSubscriptionViewModel;
import com.ifriend.presentation.features.purchases.chatsubscription.flow.viewmodel.ChatFlowSubscriptionViewModelFactory;
import com.ifriend.presentation.navigation.destination.ChatSubscriptionDestination;
import com.ifriend.ui.components.providers.AppLocalProviderKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatSubscriptionEntry.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedVisibilityScope;", "backStackEntry", "Landroidx/navigation/NavBackStackEntry;", "invoke", "(Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatSubscriptionEntry$featureNavigation$1 extends Lambda implements Function4<AnimatedVisibilityScope, NavBackStackEntry, Composer, Integer, Unit> {
    final /* synthetic */ Function0<Unit> $onBackClick;
    final /* synthetic */ ChatSubscriptionEntry this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatSubscriptionEntry$featureNavigation$1(Function0<Unit> function0, ChatSubscriptionEntry chatSubscriptionEntry) {
        super(4);
        this.$onBackClick = function0;
        this.this$0 = chatSubscriptionEntry;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, navBackStackEntry, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedVisibilityScope nonAnimationComposable, NavBackStackEntry backStackEntry, Composer composer, int i) {
        CreationExtras.Empty empty;
        Intrinsics.checkNotNullParameter(nonAnimationComposable, "$this$nonAnimationComposable");
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(26411735, i, -1, "com.ifriend.presentation.features.purchases.chatsubscription.flow.ChatSubscriptionEntry.featureNavigation.<anonymous> (ChatSubscriptionEntry.kt:58)");
        }
        Bundle arguments = backStackEntry.getArguments();
        String string = arguments != null ? arguments.getString(ChatSubscriptionDestination.RouteFlow.ChatArgs) : null;
        if (string == null) {
            string = "";
        }
        Json provideJson = SerializeobjectKt.getProvideJson();
        BuyChatSubscriptionBillingUiParams buyChatSubscriptionBillingUiParams = (BuyChatSubscriptionBillingUiParams) provideJson.decodeFromString(SerializersKt.serializer(provideJson.getSerializersModule(), Reflection.typeOf(BuyChatSubscriptionBillingUiParams.class)), string);
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(AppViewModelProviderKt.getLocalAppViewModelProvider());
        ComposerKt.sourceInformationMarkerEnd(composer);
        ChatFlowSubscriptionViewModelFactory create = ((AppViewModelProvider) consume).provideChatFlowSubscriptionViewModelFactory().create(buyChatSubscriptionBillingUiParams.getChatId());
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
        ViewModel viewModel = ViewModelKt.viewModel(ChatFlowSubscriptionViewModel.class, current, null, create, empty, composer, 36936, 0);
        composer.endReplaceableGroup();
        ChatFlowSubscriptionViewModel chatFlowSubscriptionViewModel = (ChatFlowSubscriptionViewModel) viewModel;
        NavHostController rememberNavController = NavHostControllerKt.rememberNavController(new Navigator[0], composer, 8);
        Function0<Unit> function0 = this.$onBackClick;
        composer.startReplaceableGroup(92232837);
        ComposerKt.sourceInformation(composer, "CC(rememberAction)");
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        ChatSubscriptionEntry$featureNavigation$1$invoke$$inlined$rememberAction$1 rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new ChatSubscriptionEntry$featureNavigation$1$invoke$$inlined$rememberAction$1(rememberNavController, function0);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Function0 function02 = (Function0) rememberedValue;
        composer.endReplaceableGroup();
        State collectUiState = UiStateDelegateExKt.collectUiState(chatFlowSubscriptionViewModel, null, composer, 8, 1);
        Modifier m421backgroundbw27NRU$default = BackgroundKt.m421backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), Color.Companion.m3317getBlack0d7_KjU(), null, 2, null);
        ChatSubscriptionEntry chatSubscriptionEntry = this.this$0;
        composer.startReplaceableGroup(733328855);
        ComposerKt.sourceInformation(composer, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
        composer.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(composer, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m421backgroundbw27NRU$default);
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
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume2 = composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        ComposerKt.sourceInformationMarkerEnd(composer);
        ImageRequest build = new ImageRequest.Builder((Context) consume2).data(invoke$lambda$2(collectUiState).getScreenBackgroundUrl()).diskCachePolicy(CachePolicy.ENABLED).build();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume3 = composer.consume(AppLocalProviderKt.getLocalAppImageLoaderProvider());
        ComposerKt.sourceInformationMarkerEnd(composer);
        ImageKt.Image(AsyncImagePainterKt.m6162rememberAsyncImagePainter5jETZwI(build, (ImageLoader) consume3, null, null, null, 0, composer, 72, 60), "", boxScopeInstance.align(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Alignment.Companion.getBottomCenter()), Alignment.Companion.getTopCenter(), ContentScale.Companion.getFillWidth(), 0.0f, (ColorFilter) null, composer, 27696, 96);
        long m6966getGradientColor0d7_KjU = invoke$lambda$2(collectUiState).m6966getGradientColor0d7_KjU();
        ChatSubscriptionDestination startDestination = invoke$lambda$2(collectUiState).getStartDestination();
        composer.startReplaceableGroup(1546597148);
        if (startDestination != null) {
            Modifier background$default = BackgroundKt.background$default(WindowInsetsPadding_androidKt.statusBarsPadding(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null)), Brush.Companion.m3249verticalGradient8A3gB4$default(Brush.Companion, new Pair[]{TuplesKt.to(Float.valueOf(0.0f), Color.m3281boximpl(m6966getGradientColor0d7_KjU)), TuplesKt.to(Float.valueOf(0.2f), Color.m3281boximpl(m6966getGradientColor0d7_KjU)), TuplesKt.to(Float.valueOf(0.3f), Color.m3281boximpl(Color.Companion.m3326getTransparent0d7_KjU())), TuplesKt.to(Float.valueOf(1.0f), Color.m3281boximpl(Color.Companion.m3326getTransparent0d7_KjU()))}, Float.POSITIVE_INFINITY, 0.0f, 0, 8, (Object) null), null, 0.0f, 6, null);
            composer.startReplaceableGroup(-483455358);
            ComposerKt.sourceInformation(composer, "CC(Column)P(2,3,1)75@3779L61,76@3845L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            composer.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composer, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(background$default);
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
            chatSubscriptionEntry.ChatSubscriptionNavHost(rememberNavController, startDestination.getDestination(), function02, buyChatSubscriptionBillingUiParams, composer, 4104);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            Unit unit = Unit.INSTANCE;
            Unit unit2 = Unit.INSTANCE;
        }
        composer.endReplaceableGroup();
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    private static final ChatFlowSubscriptionViewModel.UiState invoke$lambda$2(State<ChatFlowSubscriptionViewModel.UiState> state) {
        return state.getValue();
    }
}
