package com.bumptech.glide.manager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import android.util.Log;
import com.bumptech.glide.manager.ConnectivityMonitor;
import com.bumptech.glide.util.GlideSuppliers;
import com.bumptech.glide.util.Util;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes2.dex */
final class SingletonConnectivityReceiver {
    private static final String TAG = "ConnectivityMonitor";
    private static volatile SingletonConnectivityReceiver instance;
    private final FrameworkConnectivityMonitor frameworkConnectivityMonitor;
    private boolean isRegistered;
    final Set<ConnectivityMonitor.ConnectivityListener> listeners = new HashSet();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public interface FrameworkConnectivityMonitor {
        boolean register();

        void unregister();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static SingletonConnectivityReceiver get(Context context) {
        if (instance == null) {
            synchronized (SingletonConnectivityReceiver.class) {
                if (instance == null) {
                    instance = new SingletonConnectivityReceiver(context.getApplicationContext());
                }
            }
        }
        return instance;
    }

    static void reset() {
        instance = null;
    }

    private SingletonConnectivityReceiver(final Context context) {
        FrameworkConnectivityMonitor frameworkConnectivityMonitorPreApi24;
        GlideSuppliers.GlideSupplier memorize = GlideSuppliers.memorize(new GlideSuppliers.GlideSupplier<ConnectivityManager>() { // from class: com.bumptech.glide.manager.SingletonConnectivityReceiver.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.bumptech.glide.util.GlideSuppliers.GlideSupplier
            public ConnectivityManager get() {
                return (ConnectivityManager) context.getSystemService("connectivity");
            }
        });
        ConnectivityMonitor.ConnectivityListener connectivityListener = new ConnectivityMonitor.ConnectivityListener() { // from class: com.bumptech.glide.manager.SingletonConnectivityReceiver.2
            @Override // com.bumptech.glide.manager.ConnectivityMonitor.ConnectivityListener
            public void onConnectivityChanged(boolean z) {
                ArrayList<ConnectivityMonitor.ConnectivityListener> arrayList;
                synchronized (SingletonConnectivityReceiver.this) {
                    arrayList = new ArrayList(SingletonConnectivityReceiver.this.listeners);
                }
                for (ConnectivityMonitor.ConnectivityListener connectivityListener2 : arrayList) {
                    connectivityListener2.onConnectivityChanged(z);
                }
            }
        };
        if (Build.VERSION.SDK_INT >= 24) {
            frameworkConnectivityMonitorPreApi24 = new FrameworkConnectivityMonitorPostApi24(memorize, connectivityListener);
        } else {
            frameworkConnectivityMonitorPreApi24 = new FrameworkConnectivityMonitorPreApi24(context, memorize, connectivityListener);
        }
        this.frameworkConnectivityMonitor = frameworkConnectivityMonitorPreApi24;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void register(ConnectivityMonitor.ConnectivityListener connectivityListener) {
        this.listeners.add(connectivityListener);
        maybeRegisterReceiver();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void unregister(ConnectivityMonitor.ConnectivityListener connectivityListener) {
        this.listeners.remove(connectivityListener);
        maybeUnregisterReceiver();
    }

    private void maybeRegisterReceiver() {
        if (this.isRegistered || this.listeners.isEmpty()) {
            return;
        }
        this.isRegistered = this.frameworkConnectivityMonitor.register();
    }

    private void maybeUnregisterReceiver() {
        if (this.isRegistered && this.listeners.isEmpty()) {
            this.frameworkConnectivityMonitor.unregister();
            this.isRegistered = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class FrameworkConnectivityMonitorPostApi24 implements FrameworkConnectivityMonitor {
        private final GlideSuppliers.GlideSupplier<ConnectivityManager> connectivityManager;
        boolean isConnected;
        final ConnectivityMonitor.ConnectivityListener listener;
        private final ConnectivityManager.NetworkCallback networkCallback = new AnonymousClass1();

        /* renamed from: com.bumptech.glide.manager.SingletonConnectivityReceiver$FrameworkConnectivityMonitorPostApi24$1  reason: invalid class name */
        /* loaded from: classes2.dex */
        class AnonymousClass1 extends ConnectivityManager.NetworkCallback {
            AnonymousClass1() {
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                postOnConnectivityChange(true);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                postOnConnectivityChange(false);
            }

            private void postOnConnectivityChange(final boolean z) {
                Util.postOnUiThread(new Runnable() { // from class: com.bumptech.glide.manager.SingletonConnectivityReceiver.FrameworkConnectivityMonitorPostApi24.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AnonymousClass1.this.onConnectivityChange(z);
                    }
                });
            }

            void onConnectivityChange(boolean z) {
                Util.assertMainThread();
                boolean z2 = FrameworkConnectivityMonitorPostApi24.this.isConnected;
                FrameworkConnectivityMonitorPostApi24.this.isConnected = z;
                if (z2 != z) {
                    FrameworkConnectivityMonitorPostApi24.this.listener.onConnectivityChanged(z);
                }
            }
        }

        FrameworkConnectivityMonitorPostApi24(GlideSuppliers.GlideSupplier<ConnectivityManager> glideSupplier, ConnectivityMonitor.ConnectivityListener connectivityListener) {
            this.connectivityManager = glideSupplier;
            this.listener = connectivityListener;
        }

        @Override // com.bumptech.glide.manager.SingletonConnectivityReceiver.FrameworkConnectivityMonitor
        public boolean register() {
            this.isConnected = this.connectivityManager.get().getActiveNetwork() != null;
            try {
                this.connectivityManager.get().registerDefaultNetworkCallback(this.networkCallback);
                return true;
            } catch (RuntimeException e) {
                if (Log.isLoggable(SingletonConnectivityReceiver.TAG, 5)) {
                    Log.w(SingletonConnectivityReceiver.TAG, "Failed to register callback", e);
                }
                return false;
            }
        }

        @Override // com.bumptech.glide.manager.SingletonConnectivityReceiver.FrameworkConnectivityMonitor
        public void unregister() {
            this.connectivityManager.get().unregisterNetworkCallback(this.networkCallback);
        }
    }

    /* loaded from: classes2.dex */
    private static final class FrameworkConnectivityMonitorPreApi24 implements FrameworkConnectivityMonitor {
        private final GlideSuppliers.GlideSupplier<ConnectivityManager> connectivityManager;
        private final BroadcastReceiver connectivityReceiver = new BroadcastReceiver() { // from class: com.bumptech.glide.manager.SingletonConnectivityReceiver.FrameworkConnectivityMonitorPreApi24.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                boolean z = FrameworkConnectivityMonitorPreApi24.this.isConnected;
                FrameworkConnectivityMonitorPreApi24 frameworkConnectivityMonitorPreApi24 = FrameworkConnectivityMonitorPreApi24.this;
                frameworkConnectivityMonitorPreApi24.isConnected = frameworkConnectivityMonitorPreApi24.isConnected();
                if (z != FrameworkConnectivityMonitorPreApi24.this.isConnected) {
                    if (Log.isLoggable(SingletonConnectivityReceiver.TAG, 3)) {
                        Log.d(SingletonConnectivityReceiver.TAG, "connectivity changed, isConnected: " + FrameworkConnectivityMonitorPreApi24.this.isConnected);
                    }
                    FrameworkConnectivityMonitorPreApi24.this.listener.onConnectivityChanged(FrameworkConnectivityMonitorPreApi24.this.isConnected);
                }
            }
        };
        private final Context context;
        boolean isConnected;
        final ConnectivityMonitor.ConnectivityListener listener;

        FrameworkConnectivityMonitorPreApi24(Context context, GlideSuppliers.GlideSupplier<ConnectivityManager> glideSupplier, ConnectivityMonitor.ConnectivityListener connectivityListener) {
            this.context = context.getApplicationContext();
            this.connectivityManager = glideSupplier;
            this.listener = connectivityListener;
        }

        @Override // com.bumptech.glide.manager.SingletonConnectivityReceiver.FrameworkConnectivityMonitor
        public boolean register() {
            this.isConnected = isConnected();
            try {
                this.context.registerReceiver(this.connectivityReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                return true;
            } catch (SecurityException e) {
                if (Log.isLoggable(SingletonConnectivityReceiver.TAG, 5)) {
                    Log.w(SingletonConnectivityReceiver.TAG, "Failed to register", e);
                    return false;
                }
                return false;
            }
        }

        @Override // com.bumptech.glide.manager.SingletonConnectivityReceiver.FrameworkConnectivityMonitor
        public void unregister() {
            this.context.unregisterReceiver(this.connectivityReceiver);
        }

        boolean isConnected() {
            try {
                NetworkInfo activeNetworkInfo = this.connectivityManager.get().getActiveNetworkInfo();
                return activeNetworkInfo != null && activeNetworkInfo.isConnected();
            } catch (RuntimeException e) {
                if (Log.isLoggable(SingletonConnectivityReceiver.TAG, 5)) {
                    Log.w(SingletonConnectivityReceiver.TAG, "Failed to determine connectivity status when connectivity changed", e);
                }
                return true;
            }
        }
    }
}
