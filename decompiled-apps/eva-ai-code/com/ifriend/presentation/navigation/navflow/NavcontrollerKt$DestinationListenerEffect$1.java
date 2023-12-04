package com.ifriend.presentation.navigation.navflow;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.navigation.NavController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: navcontroller.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/DisposableEffectResult;", "Landroidx/compose/runtime/DisposableEffectScope;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class NavcontrollerKt$DestinationListenerEffect$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ NavController.OnDestinationChangedListener $onChangedDestination;
    final /* synthetic */ NavController $this_DestinationListenerEffect;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavcontrollerKt$DestinationListenerEffect$1(NavController navController, NavController.OnDestinationChangedListener onDestinationChangedListener) {
        super(1);
        this.$this_DestinationListenerEffect = navController;
        this.$onChangedDestination = onDestinationChangedListener;
    }

    @Override // kotlin.jvm.functions.Function1
    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        this.$this_DestinationListenerEffect.addOnDestinationChangedListener(this.$onChangedDestination);
        final NavController navController = this.$this_DestinationListenerEffect;
        final NavController.OnDestinationChangedListener onDestinationChangedListener = this.$onChangedDestination;
        return new DisposableEffectResult() { // from class: com.ifriend.presentation.navigation.navflow.NavcontrollerKt$DestinationListenerEffect$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                NavController.this.removeOnDestinationChangedListener(onDestinationChangedListener);
            }
        };
    }
}
