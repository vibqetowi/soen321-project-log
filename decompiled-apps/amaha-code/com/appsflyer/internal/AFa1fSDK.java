package com.appsflyer.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import com.appsflyer.AFLogger;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
@Deprecated
/* loaded from: classes.dex */
public final class AFa1fSDK {
    public final String[] valueOf;

    /* loaded from: classes.dex */
    public static final class AFa1ySDK implements IInterface {
        private final IBinder valueOf;

        public AFa1ySDK(IBinder iBinder) {
            this.valueOf = iBinder;
        }

        public final boolean AFKeystoreWrapper() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z10 = true;
                obtain.writeInt(1);
                this.valueOf.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() == 0) {
                    z10 = false;
                }
                return z10;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.valueOf;
        }

        public final String valueOf() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.valueOf.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class AFa1zSDK {
        private final boolean AFInAppEventType;
        final String valueOf;

        public AFa1zSDK(String str, boolean z10) {
            this.valueOf = str;
            this.AFInAppEventType = z10;
        }

        public final boolean AFInAppEventParameterName() {
            return this.AFInAppEventType;
        }
    }

    public AFa1fSDK() {
    }

    public AFa1fSDK(String... strArr) {
        if (strArr != null && strArr.length != 0) {
            Pattern compile = Pattern.compile("[\\w]{1,45}");
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                if (str != null && compile.matcher(str).matches()) {
                    arrayList.add(str.toLowerCase());
                } else {
                    AFLogger.afWarnLog("Invalid partner name: ".concat(String.valueOf(str)));
                }
            }
            if (arrayList.contains("all")) {
                this.valueOf = new String[]{"all"};
                return;
            } else if (!arrayList.isEmpty()) {
                this.valueOf = (String[]) arrayList.toArray(new String[0]);
                return;
            } else {
                this.valueOf = null;
                return;
            }
        }
        this.valueOf = null;
    }

    public static AFa1zSDK AFKeystoreWrapper(Context context) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            AFa1wSDK aFa1wSDK = new AFa1wSDK((byte) 0);
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            try {
                if (context.bindService(intent, aFa1wSDK, 1)) {
                    if (!aFa1wSDK.AFKeystoreWrapper) {
                        aFa1wSDK.AFKeystoreWrapper = true;
                        IBinder poll = aFa1wSDK.AFInAppEventParameterName.poll(10L, TimeUnit.SECONDS);
                        if (poll != null) {
                            AFa1ySDK aFa1ySDK = new AFa1ySDK(poll);
                            return new AFa1zSDK(aFa1ySDK.valueOf(), aFa1ySDK.AFKeystoreWrapper());
                        }
                        throw new TimeoutException("Timed out waiting for the service connection");
                    }
                    throw new IllegalStateException("Cannot call get on this connection more than once");
                }
                context.unbindService(aFa1wSDK);
                throw new IOException("Google Play connection failed");
            } finally {
                context.unbindService(aFa1wSDK);
            }
        }
        throw new IllegalStateException("Cannot be called from the main thread");
    }

    /* loaded from: classes.dex */
    public static final class AFa1wSDK implements ServiceConnection {
        final LinkedBlockingQueue<IBinder> AFInAppEventParameterName;
        boolean AFKeystoreWrapper;

        private AFa1wSDK() {
            this.AFInAppEventParameterName = new LinkedBlockingQueue<>(1);
            this.AFKeystoreWrapper = false;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.AFInAppEventParameterName.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        public /* synthetic */ AFa1wSDK(byte b10) {
            this();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }
}
