package com.ifriend.presentation.features.chatcall.flow;

import android.os.Bundle;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavBackStackEntry;
import com.ifriend.presentation.features.app.di.AppViewModelProvider;
import com.ifriend.presentation.features.app.di.AppViewModelProviderKt;
import com.ifriend.presentation.features.chatcall.ui.ChatCallScreenKt;
import com.ifriend.presentation.features.chatcall.viewmodel.ChatCallViewModel;
import com.ifriend.presentation.features.chatcall.viewmodel.ChatCallViewModelFactory;
import com.ifriend.presentation.navigation.destination.ChatCallDestination;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ChatCallEntry.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedVisibilityScope;", "backStackEntry", "Landroidx/navigation/NavBackStackEntry;", "invoke", "(Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ChatCallEntry$featureNavigation$1$1 extends Lambda implements Function4<AnimatedVisibilityScope, NavBackStackEntry, Composer, Integer, Unit> {
    final /* synthetic */ Function0<Unit> $onBackClick;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatCallEntry$featureNavigation$1$1(Function0<Unit> function0) {
        super(4);
        this.$onBackClick = function0;
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
            ComposerKt.traceEventStart(1832828653, i, -1, "com.ifriend.presentation.features.chatcall.flow.ChatCallEntry.featureNavigation.<anonymous>.<anonymous> (ChatCallEntry.kt:27)");
        }
        Bundle arguments = backStackEntry.getArguments();
        String string = arguments != null ? arguments.getString(ChatCallDestination.RouteFlow.ChatId) : null;
        if (string == null) {
            string = "";
        }
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(AppViewModelProviderKt.getLocalAppViewModelProvider());
        ComposerKt.sourceInformationMarkerEnd(composer);
        ChatCallViewModelFactory create = ((AppViewModelProvider) consume).provideChatCallViewModelFactory().create(string);
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
        ViewModel viewModel = ViewModelKt.viewModel(ChatCallViewModel.class, current, null, create, empty, composer, 36936, 0);
        composer.endReplaceableGroup();
        ChatCallScreenKt.ChatCallScreen((ChatCallViewModel) viewModel, this.$onBackClick, composer, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
