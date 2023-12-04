package com.google.accompanist.permissions;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PermissionsUtil.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/DisposableEffectResult;", "Landroidx/compose/runtime/DisposableEffectScope;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PermissionsUtilKt$PermissionsLifecycleCheckerEffect$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ Lifecycle $lifecycle;
    final /* synthetic */ LifecycleEventObserver $permissionsCheckerObserver;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PermissionsUtilKt$PermissionsLifecycleCheckerEffect$1(Lifecycle lifecycle, LifecycleEventObserver lifecycleEventObserver) {
        super(1);
        this.$lifecycle = lifecycle;
        this.$permissionsCheckerObserver = lifecycleEventObserver;
    }

    @Override // kotlin.jvm.functions.Function1
    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        this.$lifecycle.addObserver(this.$permissionsCheckerObserver);
        final Lifecycle lifecycle = this.$lifecycle;
        final LifecycleEventObserver lifecycleEventObserver = this.$permissionsCheckerObserver;
        return new DisposableEffectResult() { // from class: com.google.accompanist.permissions.PermissionsUtilKt$PermissionsLifecycleCheckerEffect$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                Lifecycle.this.removeObserver(lifecycleEventObserver);
            }
        };
    }
}
