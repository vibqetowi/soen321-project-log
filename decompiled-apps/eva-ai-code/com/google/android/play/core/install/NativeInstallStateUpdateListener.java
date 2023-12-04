package com.google.android.play.core.install;
/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes2.dex */
final class NativeInstallStateUpdateListener implements InstallStateUpdatedListener {
    NativeInstallStateUpdateListener() {
    }

    @Override // com.google.android.play.core.listener.StateUpdatedListener
    public native void onStateUpdate(InstallState installState);
}
