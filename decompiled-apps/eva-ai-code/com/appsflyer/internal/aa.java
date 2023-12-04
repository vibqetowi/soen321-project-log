package com.appsflyer.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageItemInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.appsflyer.AFLogger;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
@Deprecated
/* loaded from: classes2.dex */
public final class aa {
    public final Context AFInAppEventParameterName;
    private Bundle valueOf;

    aa() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static e AFKeystoreWrapper(Context context) throws Exception {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        context.getPackageManager().getPackageInfo("com.android.vending", 0);
        a aVar = new a((byte) 0);
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        try {
            if (!context.bindService(intent, aVar, 1)) {
                if (context != null) {
                    context.unbindService(aVar);
                }
                throw new IOException("Google Play connection failed");
            } else if (aVar.AFKeystoreWrapper) {
                throw new IllegalStateException("Cannot call get on this connection more than once");
            } else {
                aVar.AFKeystoreWrapper = true;
                IBinder poll = aVar.valueOf.poll(10L, TimeUnit.SECONDS);
                if (poll != null) {
                    c cVar = new c(poll);
                    return new e(cVar.AFInAppEventType(), cVar.values());
                }
                throw new TimeoutException("Timed out waiting for the service connection");
            }
        } finally {
            if (context != null) {
                context.unbindService(aVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class e {
        final String AFInAppEventParameterName;
        private final boolean valueOf;

        e(String str, boolean z) {
            this.AFInAppEventParameterName = str;
            this.valueOf = z;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final boolean AFKeystoreWrapper() {
            return this.valueOf;
        }
    }

    /* loaded from: classes2.dex */
    static final class a implements ServiceConnection {
        boolean AFKeystoreWrapper;
        final LinkedBlockingQueue<IBinder> valueOf;

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }

        private a() {
            this.valueOf = new LinkedBlockingQueue<>(1);
            this.AFKeystoreWrapper = false;
        }

        /* synthetic */ a(byte b) {
            this();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.valueOf.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class c implements IInterface {
        private final IBinder AFKeystoreWrapper;

        c(IBinder iBinder) {
            this.AFKeystoreWrapper = iBinder;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.AFKeystoreWrapper;
        }

        public final String AFInAppEventType() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.AFKeystoreWrapper.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        final boolean values() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                obtain.writeInt(1);
                this.AFKeystoreWrapper.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readInt() != 0;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    public aa(Context context) {
        this.valueOf = null;
        this.AFInAppEventParameterName = context.getApplicationContext();
    }

    public final String AFInAppEventParameterName(String str) {
        Object obj;
        try {
            if (this.valueOf == null) {
                this.valueOf = ((PackageItemInfo) this.AFInAppEventParameterName.getPackageManager().getApplicationInfo(this.AFInAppEventParameterName.getPackageName(), 128)).metaData;
            }
            Bundle bundle = this.valueOf;
            if (bundle == null || (obj = bundle.get(str)) == null) {
                return null;
            }
            return obj.toString();
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Could not load manifest metadata!");
            sb.append(th.getMessage());
            AFLogger.valueOf(sb.toString(), th);
            return null;
        }
    }
}
