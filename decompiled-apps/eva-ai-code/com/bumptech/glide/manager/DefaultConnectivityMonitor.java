package com.bumptech.glide.manager;

import android.content.Context;
import com.bumptech.glide.manager.ConnectivityMonitor;
/* loaded from: classes2.dex */
final class DefaultConnectivityMonitor implements ConnectivityMonitor {
    private final Context context;
    final ConnectivityMonitor.ConnectivityListener listener;

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onDestroy() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DefaultConnectivityMonitor(Context context, ConnectivityMonitor.ConnectivityListener connectivityListener) {
        this.context = context.getApplicationContext();
        this.listener = connectivityListener;
    }

    private void register() {
        SingletonConnectivityReceiver.get(this.context).register(this.listener);
    }

    private void unregister() {
        SingletonConnectivityReceiver.get(this.context).unregister(this.listener);
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onStart() {
        register();
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onStop() {
        unregister();
    }
}
