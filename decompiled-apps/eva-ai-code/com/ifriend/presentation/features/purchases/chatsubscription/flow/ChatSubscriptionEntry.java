package com.ifriend.presentation.features.purchases.chatsubscription.flow;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.compose.NavHostKt;
import com.facebook.internal.NativeProtocol;
import com.ifriend.presentation.common.observers.appevents.params.BuyChatSubscriptionBillingUiParams;
import com.ifriend.presentation.navigation.FeatureRoute;
import com.ifriend.presentation.navigation.destination.ChatSubscriptionDestination;
import com.ifriend.ui.navigation.AppnavigationKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatSubscriptionEntry.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J7\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0010\u0010\f\u001a\f\u0012\u0004\u0012\u00020\b0\rj\u0002`\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0003¢\u0006\u0002\u0010\u0011J!\u0010\u0012\u001a\u00020\b2\u0010\u0010\u0014\u001a\f\u0012\u0004\u0012\u00020\b0\rj\u0002`\u000eR\u00020\u0013¢\u0006\u0002\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0016²\u0006\n\u0010\u0017\u001a\u00020\u0018X\u008a\u0084\u0002"}, d2 = {"Lcom/ifriend/presentation/features/purchases/chatsubscription/flow/ChatSubscriptionEntry;", "Lcom/ifriend/presentation/navigation/FeatureRoute;", "()V", "featureRoute", "", "getFeatureRoute", "()Ljava/lang/String;", "ChatSubscriptionNavHost", "", "featureNavController", "Landroidx/navigation/NavHostController;", "startDestination", "onFeatureBackClick", "Lkotlin/Function0;", "Lcom/ifriend/ui/tools/OnClick;", NativeProtocol.WEB_DIALOG_PARAMS, "Lcom/ifriend/presentation/common/observers/appevents/params/BuyChatSubscriptionBillingUiParams;", "(Landroidx/navigation/NavHostController;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/ifriend/presentation/common/observers/appevents/params/BuyChatSubscriptionBillingUiParams;Landroidx/compose/runtime/Composer;I)V", "featureNavigation", "Landroidx/navigation/NavGraphBuilder;", "onBackClick", "(Landroidx/navigation/NavGraphBuilder;Lkotlin/jvm/functions/Function0;)V", "presentation_release", "uiState", "Lcom/ifriend/presentation/features/purchases/chatsubscription/flow/viewmodel/ChatFlowSubscriptionViewModel$UiState;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatSubscriptionEntry implements FeatureRoute {
    public static final int $stable = 0;
    private final String featureRoute = ChatSubscriptionDestination.RouteFlow.INSTANCE.getRoute();

    @Override // com.ifriend.presentation.navigation.FeatureRoute
    public String getFeatureRoute() {
        return this.featureRoute;
    }

    public final void featureNavigation(NavGraphBuilder context_receiver_0, Function0<Unit> onBackClick) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        AppnavigationKt.nonAnimationComposable$default(context_receiver_0, getFeatureRoute(), null, null, ComposableLambdaKt.composableLambdaInstance(26411735, true, new ChatSubscriptionEntry$featureNavigation$1(onBackClick, this)), 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ChatSubscriptionNavHost(NavHostController navHostController, String str, Function0<Unit> function0, BuyChatSubscriptionBillingUiParams buyChatSubscriptionBillingUiParams, Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-126342840);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-126342840, i, -1, "com.ifriend.presentation.features.purchases.chatsubscription.flow.ChatSubscriptionEntry.ChatSubscriptionNavHost (ChatSubscriptionEntry.kt:139)");
        }
        NavHostKt.NavHost(navHostController, str, SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), null, null, null, null, null, null, new ChatSubscriptionEntry$ChatSubscriptionNavHost$1(buyChatSubscriptionBillingUiParams, function0, i, navHostController), startRestartGroup, (i & 112) | 392, 504);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new ChatSubscriptionEntry$ChatSubscriptionNavHost$2(this, navHostController, str, function0, buyChatSubscriptionBillingUiParams, i));
    }
}
