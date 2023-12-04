package com.ifriend.ui.components.effects;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Lifecycle.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/DisposableEffectResult;", "Landroidx/compose/runtime/DisposableEffectScope;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LifecycleKt$OnLifecycleEventEffect$1$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ State<Function1<Lifecycle.Event, Unit>> $eventHandler$delegate;
    final /* synthetic */ State<LifecycleOwner> $lifecycleOwner$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LifecycleKt$OnLifecycleEventEffect$1$1(State<? extends LifecycleOwner> state, State<? extends Function1<? super Lifecycle.Event, Unit>> state2) {
        super(1);
        this.$lifecycleOwner$delegate = state;
        this.$eventHandler$delegate = state2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
        LifecycleOwner OnLifecycleEventEffect$lambda$1;
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        OnLifecycleEventEffect$lambda$1 = LifecycleKt.OnLifecycleEventEffect$lambda$1(this.$lifecycleOwner$delegate);
        final Lifecycle lifecycle = OnLifecycleEventEffect$lambda$1.getLifecycle();
        final State<Function1<Lifecycle.Event, Unit>> state = this.$eventHandler$delegate;
        final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.ifriend.ui.components.effects.LifecycleKt$OnLifecycleEventEffect$1$1$observer$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                Function1 OnLifecycleEventEffect$lambda$0;
                Intrinsics.checkNotNullParameter(lifecycleOwner, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(event, "event");
                OnLifecycleEventEffect$lambda$0 = LifecycleKt.OnLifecycleEventEffect$lambda$0(state);
                OnLifecycleEventEffect$lambda$0.invoke(event);
            }
        };
        lifecycle.addObserver(lifecycleEventObserver);
        return new DisposableEffectResult() { // from class: com.ifriend.ui.components.effects.LifecycleKt$OnLifecycleEventEffect$1$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                Lifecycle.this.removeObserver(lifecycleEventObserver);
            }
        };
    }
}
