package com.google.android.play.core.ktx;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.play.core.install.InstallState;
import com.google.android.play.core.install.InstallStateUpdatedListener;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: com.google.android.play:app-update-ktx@@2.1.0 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B&\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0016R\"\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/google/android/play/core/ktx/AppUpdatePassthroughListener;", "Lcom/google/android/play/core/install/InstallStateUpdatedListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "disposeAction", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "(Lcom/google/android/play/core/install/InstallStateUpdatedListener;Lkotlin/jvm/functions/Function1;)V", "getDisposeAction", "()Lkotlin/jvm/functions/Function1;", "getListener", "()Lcom/google/android/play/core/install/InstallStateUpdatedListener;", "onStateUpdate", "state", "Lcom/google/android/play/core/install/InstallState;", "java.com.google.android.apps.play.store.sdk.playcore.ktx_playcore_app_update_ktx"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class AppUpdatePassthroughListener implements InstallStateUpdatedListener {
    private final Function1<AppUpdatePassthroughListener, Unit> disposeAction;
    private final InstallStateUpdatedListener listener;

    public final InstallStateUpdatedListener getListener() {
        return this.listener;
    }

    public final Function1<AppUpdatePassthroughListener, Unit> getDisposeAction() {
        return this.disposeAction;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AppUpdatePassthroughListener(InstallStateUpdatedListener listener, Function1<? super AppUpdatePassthroughListener, Unit> disposeAction) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(disposeAction, "disposeAction");
        this.listener = listener;
        this.disposeAction = disposeAction;
    }

    @Override // com.google.android.play.core.listener.StateUpdatedListener
    public final void onStateUpdate(InstallState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.listener.onStateUpdate(state);
        int installStatus = state.installStatus();
        if (installStatus == 0 || installStatus == 11 || installStatus == 5 || installStatus == 6) {
            this.disposeAction.invoke(this);
        }
    }
}
