package w5;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import com.facebook.FacebookException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: AttributionIdentifiers.kt */
/* loaded from: classes.dex */
public final class a {
    public static a f;

    /* renamed from: a  reason: collision with root package name */
    public String f36426a;

    /* renamed from: b  reason: collision with root package name */
    public long f36427b;

    /* renamed from: c  reason: collision with root package name */
    public String f36428c;

    /* renamed from: d  reason: collision with root package name */
    public String f36429d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f36430e;

    /* compiled from: AttributionIdentifiers.kt */
    /* renamed from: w5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0610a {
        /* JADX WARN: Removed duplicated region for block: B:105:0x01d4  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00c3  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00d6 A[Catch: all -> 0x0152, Exception -> 0x01bb, TryCatch #8 {Exception -> 0x01bb, all -> 0x0152, blocks: (B:43:0x00c8, B:45:0x00d6, B:47:0x00da, B:50:0x00e9, B:52:0x0103, B:54:0x0112, B:61:0x0133, B:66:0x0145, B:68:0x0149, B:72:0x0155, B:64:0x013b, B:56:0x011b, B:58:0x012a, B:92:0x01b3, B:93:0x01ba), top: B:114:0x00c8 }] */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0139  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x013b A[Catch: all -> 0x0152, Exception -> 0x01bb, TryCatch #8 {Exception -> 0x01bb, all -> 0x0152, blocks: (B:43:0x00c8, B:45:0x00d6, B:47:0x00da, B:50:0x00e9, B:52:0x0103, B:54:0x0112, B:61:0x0133, B:66:0x0145, B:68:0x0149, B:72:0x0155, B:64:0x013b, B:56:0x011b, B:58:0x012a, B:92:0x01b3, B:93:0x01ba), top: B:114:0x00c8 }] */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0145 A[Catch: all -> 0x0152, Exception -> 0x01bb, TryCatch #8 {Exception -> 0x01bb, all -> 0x0152, blocks: (B:43:0x00c8, B:45:0x00d6, B:47:0x00da, B:50:0x00e9, B:52:0x0103, B:54:0x0112, B:61:0x0133, B:66:0x0145, B:68:0x0149, B:72:0x0155, B:64:0x013b, B:56:0x011b, B:58:0x012a, B:92:0x01b3, B:93:0x01ba), top: B:114:0x00c8 }] */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0149 A[Catch: all -> 0x0152, Exception -> 0x01bb, TryCatch #8 {Exception -> 0x01bb, all -> 0x0152, blocks: (B:43:0x00c8, B:45:0x00d6, B:47:0x00da, B:50:0x00e9, B:52:0x0103, B:54:0x0112, B:61:0x0133, B:66:0x0145, B:68:0x0149, B:72:0x0155, B:64:0x013b, B:56:0x011b, B:58:0x012a, B:92:0x01b3, B:93:0x01ba), top: B:114:0x00c8 }] */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0155 A[Catch: all -> 0x0152, Exception -> 0x01bb, TRY_LEAVE, TryCatch #8 {Exception -> 0x01bb, all -> 0x0152, blocks: (B:43:0x00c8, B:45:0x00d6, B:47:0x00da, B:50:0x00e9, B:52:0x0103, B:54:0x0112, B:61:0x0133, B:66:0x0145, B:68:0x0149, B:72:0x0155, B:64:0x013b, B:56:0x011b, B:58:0x012a, B:92:0x01b3, B:93:0x01ba), top: B:114:0x00c8 }] */
        /* JADX WARN: Removed duplicated region for block: B:92:0x01b3 A[Catch: all -> 0x0152, Exception -> 0x01bb, TRY_ENTER, TryCatch #8 {Exception -> 0x01bb, all -> 0x0152, blocks: (B:43:0x00c8, B:45:0x00d6, B:47:0x00da, B:50:0x00e9, B:52:0x0103, B:54:0x0112, B:61:0x0133, B:66:0x0145, B:68:0x0149, B:72:0x0155, B:64:0x013b, B:56:0x011b, B:58:0x012a, B:92:0x01b3, B:93:0x01ba), top: B:114:0x00c8 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static a a(Context context) {
            a aVar;
            Cursor cursor;
            Uri uri;
            Uri parse;
            PackageManager packageManager;
            String installerPackageName;
            Method s10;
            Object v10;
            boolean booleanValue;
            Cursor cursor2 = null;
            try {
            } catch (Exception unused) {
                e0 e0Var = e0.f36453a;
                h5.p pVar = h5.p.f17269a;
            }
            try {
                try {
                    if (b(context) && (s10 = e0.s("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", Context.class)) != null && (v10 = e0.v(null, s10, context)) != null) {
                        Method r = e0.r(v10.getClass(), "getId", new Class[0]);
                        Method r10 = e0.r(v10.getClass(), "isLimitAdTrackingEnabled", new Class[0]);
                        if (r != null && r10 != null) {
                            aVar = new a();
                            aVar.f36426a = (String) e0.v(v10, r, new Object[0]);
                            Boolean bool = (Boolean) e0.v(v10, r10, new Object[0]);
                            if (bool == null) {
                                booleanValue = false;
                            } else {
                                booleanValue = bool.booleanValue();
                            }
                            aVar.f36430e = booleanValue;
                            if (aVar == null) {
                                if (b(context)) {
                                    c cVar = new c();
                                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                                    intent.setPackage("com.google.android.gms");
                                    try {
                                        try {
                                        } catch (Throwable th2) {
                                            context.unbindService(cVar);
                                            throw th2;
                                        }
                                    } catch (SecurityException unused2) {
                                    }
                                    if (context.bindService(intent, cVar, 1)) {
                                        try {
                                            b bVar = new b(cVar.a());
                                            a aVar2 = new a();
                                            aVar2.f36426a = bVar.v();
                                            aVar2.f36430e = bVar.z();
                                            context.unbindService(cVar);
                                            aVar = aVar2;
                                        } catch (Exception unused3) {
                                            e0 e0Var2 = e0.f36453a;
                                            h5.p pVar2 = h5.p.f17269a;
                                            context.unbindService(cVar);
                                        }
                                        if (aVar == null) {
                                            aVar = new a();
                                        }
                                    }
                                }
                                aVar = null;
                                if (aVar == null) {
                                }
                            }
                            if (kotlin.jvm.internal.i.b(Looper.myLooper(), Looper.getMainLooper())) {
                                a aVar3 = a.f;
                                if (aVar3 != null && System.currentTimeMillis() - aVar3.f36427b < 3600000) {
                                    return aVar3;
                                }
                                String[] strArr = {"aid", "androidid", "limit_tracking"};
                                ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.AttributionIdProvider", 0);
                                ProviderInfo resolveContentProvider2 = context.getPackageManager().resolveContentProvider("com.facebook.wakizashi.provider.AttributionIdProvider", 0);
                                if (resolveContentProvider != null) {
                                    HashSet<String> hashSet = j.f36476a;
                                    String str = resolveContentProvider.packageName;
                                    kotlin.jvm.internal.i.f(str, "contentProviderInfo.packageName");
                                    if (j.a(context, str)) {
                                        parse = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
                                        uri = parse;
                                        packageManager = context.getPackageManager();
                                        if (packageManager == null) {
                                            installerPackageName = null;
                                        } else {
                                            installerPackageName = packageManager.getInstallerPackageName(context.getPackageName());
                                        }
                                        if (installerPackageName != null) {
                                            aVar.f36429d = installerPackageName;
                                        }
                                        if (uri == null) {
                                            aVar.f36427b = System.currentTimeMillis();
                                            a.f = aVar;
                                            return aVar;
                                        }
                                        cursor = context.getContentResolver().query(uri, strArr, null, null, null);
                                        if (cursor != null) {
                                            try {
                                                if (cursor.moveToFirst()) {
                                                    int columnIndex = cursor.getColumnIndex("aid");
                                                    int columnIndex2 = cursor.getColumnIndex("androidid");
                                                    int columnIndex3 = cursor.getColumnIndex("limit_tracking");
                                                    aVar.f36428c = cursor.getString(columnIndex);
                                                    if (columnIndex2 > 0 && columnIndex3 > 0 && aVar.a() == null) {
                                                        aVar.f36426a = cursor.getString(columnIndex2);
                                                        aVar.f36430e = Boolean.parseBoolean(cursor.getString(columnIndex3));
                                                    }
                                                    cursor.close();
                                                    aVar.f36427b = System.currentTimeMillis();
                                                    a.f = aVar;
                                                    return aVar;
                                                }
                                            } catch (Exception e10) {
                                                e = e10;
                                                e0 e0Var3 = e0.f36453a;
                                                a aVar4 = a.f;
                                                kotlin.jvm.internal.i.n(e, "Caught unexpected exception in getAttributionId(): ");
                                                h5.p pVar3 = h5.p.f17269a;
                                                if (cursor != null) {
                                                    cursor.close();
                                                }
                                                return null;
                                            }
                                        }
                                        aVar.f36427b = System.currentTimeMillis();
                                        a.f = aVar;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        return aVar;
                                    }
                                }
                                if (resolveContentProvider2 != null) {
                                    HashSet<String> hashSet2 = j.f36476a;
                                    String str2 = resolveContentProvider2.packageName;
                                    kotlin.jvm.internal.i.f(str2, "wakizashiProviderInfo.packageName");
                                    if (j.a(context, str2)) {
                                        parse = Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider");
                                        uri = parse;
                                        packageManager = context.getPackageManager();
                                        if (packageManager == null) {
                                        }
                                        if (installerPackageName != null) {
                                        }
                                        if (uri == null) {
                                        }
                                    }
                                }
                                uri = null;
                                packageManager = context.getPackageManager();
                                if (packageManager == null) {
                                }
                                if (installerPackageName != null) {
                                }
                                if (uri == null) {
                                }
                            } else {
                                throw new FacebookException("getAttributionIdentifiers cannot be called on the main thread.");
                            }
                        }
                    }
                    if (kotlin.jvm.internal.i.b(Looper.myLooper(), Looper.getMainLooper())) {
                    }
                } catch (Throwable th3) {
                    th = th3;
                    cursor2 = context;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
                cursor = null;
            } catch (Throwable th4) {
                th = th4;
                if (cursor2 != null) {
                }
                throw th;
            }
            aVar = null;
            if (aVar == null) {
            }
        }

        public static boolean b(Context context) {
            Method s10 = e0.s("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
            if (s10 == null) {
                return false;
            }
            Object v10 = e0.v(null, s10, context);
            if ((v10 instanceof Integer) && kotlin.jvm.internal.i.b(v10, 0)) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: AttributionIdentifiers.kt */
    /* loaded from: classes.dex */
    public static final class b implements IInterface {

        /* renamed from: a  reason: collision with root package name */
        public final IBinder f36431a;

        public b(IBinder iBinder) {
            this.f36431a = iBinder;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.f36431a;
        }

        public final String v() {
            Parcel obtain = Parcel.obtain();
            kotlin.jvm.internal.i.f(obtain, "obtain()");
            Parcel obtain2 = Parcel.obtain();
            kotlin.jvm.internal.i.f(obtain2, "obtain()");
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f36431a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public final boolean z() {
            Parcel obtain = Parcel.obtain();
            kotlin.jvm.internal.i.f(obtain, "obtain()");
            Parcel obtain2 = Parcel.obtain();
            kotlin.jvm.internal.i.f(obtain2, "obtain()");
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z10 = true;
                obtain.writeInt(1);
                this.f36431a.transact(2, obtain, obtain2, 0);
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
    }

    public final String a() {
        if (h5.p.h() && h5.g0.a()) {
            return this.f36426a;
        }
        return null;
    }

    /* compiled from: AttributionIdentifiers.kt */
    /* loaded from: classes.dex */
    public static final class c implements ServiceConnection {

        /* renamed from: u  reason: collision with root package name */
        public final AtomicBoolean f36432u = new AtomicBoolean(false);

        /* renamed from: v  reason: collision with root package name */
        public final LinkedBlockingDeque f36433v = new LinkedBlockingDeque();

        public final IBinder a() {
            if (!this.f36432u.compareAndSet(true, true)) {
                Object take = this.f36433v.take();
                kotlin.jvm.internal.i.f(take, "queue.take()");
                return (IBinder) take;
            }
            throw new IllegalStateException("Binder already consumed".toString());
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder != null) {
                try {
                    this.f36433v.put(iBinder);
                } catch (InterruptedException unused) {
                }
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }
}
