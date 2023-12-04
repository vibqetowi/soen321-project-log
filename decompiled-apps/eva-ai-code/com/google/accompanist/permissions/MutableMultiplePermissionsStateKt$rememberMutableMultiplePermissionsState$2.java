package com.google.accompanist.permissions;

import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: MutableMultiplePermissionsState.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/DisposableEffectResult;", "Landroidx/compose/runtime/DisposableEffectScope;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class MutableMultiplePermissionsStateKt$rememberMutableMultiplePermissionsState$2 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ ManagedActivityResultLauncher<String[], Map<String, Boolean>> $launcher;
    final /* synthetic */ MutableMultiplePermissionsState $multiplePermissionsState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableMultiplePermissionsStateKt$rememberMutableMultiplePermissionsState$2(MutableMultiplePermissionsState mutableMultiplePermissionsState, ManagedActivityResultLauncher<String[], Map<String, Boolean>> managedActivityResultLauncher) {
        super(1);
        this.$multiplePermissionsState = mutableMultiplePermissionsState;
        this.$launcher = managedActivityResultLauncher;
    }

    @Override // kotlin.jvm.functions.Function1
    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        this.$multiplePermissionsState.setLauncher$permissions_release(this.$launcher);
        final MutableMultiplePermissionsState mutableMultiplePermissionsState = this.$multiplePermissionsState;
        return new DisposableEffectResult() { // from class: com.google.accompanist.permissions.MutableMultiplePermissionsStateKt$rememberMutableMultiplePermissionsState$2$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                MutableMultiplePermissionsState.this.setLauncher$permissions_release(null);
            }
        };
    }
}
