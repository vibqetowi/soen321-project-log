package com.google.android.gms.dynamite;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.api.internal.d1;
import com.google.android.gms.common.util.DynamiteApi;
import dalvik.system.DelegateLastClassLoader;
import ea.f;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import v9.m;
import v9.o;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public final class DynamiteModule {

    /* renamed from: e  reason: collision with root package name */
    public static Boolean f7452e = null;
    public static String f = null;

    /* renamed from: g  reason: collision with root package name */
    public static boolean f7453g = false;

    /* renamed from: h  reason: collision with root package name */
    public static int f7454h = -1;

    /* renamed from: i  reason: collision with root package name */
    public static Boolean f7455i;

    /* renamed from: m  reason: collision with root package name */
    public static ea.e f7459m;

    /* renamed from: n  reason: collision with root package name */
    public static f f7460n;

    /* renamed from: a  reason: collision with root package name */
    public final Context f7461a;

    /* renamed from: j  reason: collision with root package name */
    public static final ThreadLocal f7456j = new ThreadLocal();

    /* renamed from: k  reason: collision with root package name */
    public static final d1 f7457k = new d1(1);

    /* renamed from: l  reason: collision with root package name */
    public static final com.google.android.gms.dynamite.a f7458l = new com.google.android.gms.dynamite.a();

    /* renamed from: b  reason: collision with root package name */
    public static final b f7449b = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final c f7450c = new c();

    /* renamed from: d  reason: collision with root package name */
    public static final d f7451d = new d();

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    @DynamiteApi
    /* loaded from: classes.dex */
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    /* loaded from: classes.dex */
    public static class LoadingException extends Exception {
        public /* synthetic */ LoadingException(String str) {
            super(str);
        }

        public /* synthetic */ LoadingException(String str, Throwable th2) {
            super(str, th2);
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    /* loaded from: classes.dex */
    public interface a {

        /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public interface InterfaceC0145a {
            int a(Context context, String str, boolean z10);

            int b(Context context, String str);
        }

        /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
        /* loaded from: classes.dex */
        public static class b {

            /* renamed from: a  reason: collision with root package name */
            public int f7462a = 0;

            /* renamed from: b  reason: collision with root package name */
            public int f7463b = 0;

            /* renamed from: c  reason: collision with root package name */
            public int f7464c = 0;
        }

        b a(Context context, String str, InterfaceC0145a interfaceC0145a);
    }

    public DynamiteModule(Context context) {
        o.h(context);
        this.f7461a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            Class<?> loadClass = classLoader.loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (!m.a(declaredField.get(null), str)) {
                String valueOf = String.valueOf(declaredField.get(null));
                Log.e("DynamiteModule", "Module descriptor id '" + valueOf + "' didn't match expected id '" + str + "'");
                return 0;
            }
            return declaredField2.getInt(null);
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e10) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e10.getMessage())));
            return 0;
        }
    }

    public static DynamiteModule c(Context context, a aVar, String str) {
        Boolean bool;
        da.a V1;
        DynamiteModule dynamiteModule;
        f fVar;
        boolean z10;
        Boolean valueOf;
        da.a V12;
        ThreadLocal threadLocal = f7456j;
        ea.d dVar = (ea.d) threadLocal.get();
        ea.d dVar2 = new ea.d(0);
        threadLocal.set(dVar2);
        d1 d1Var = f7457k;
        long longValue = ((Long) d1Var.get()).longValue();
        try {
            d1Var.set(Long.valueOf(SystemClock.elapsedRealtime()));
            a.b a10 = aVar.a(context, str, f7458l);
            int i6 = a10.f7462a;
            int i10 = a10.f7463b;
            Log.i("DynamiteModule", "Considering local module " + str + ":" + i6 + " and remote module " + str + ":" + i10);
            int i11 = a10.f7464c;
            if (i11 != 0) {
                if (i11 == -1) {
                    if (a10.f7462a != 0) {
                        i11 = -1;
                    }
                }
                if (i11 != 1 || a10.f7463b != 0) {
                    if (i11 == -1) {
                        Log.i("DynamiteModule", "Selected local version of ".concat(str));
                        DynamiteModule dynamiteModule2 = new DynamiteModule(context.getApplicationContext());
                        if (longValue == 0) {
                            d1Var.remove();
                        } else {
                            d1Var.set(Long.valueOf(longValue));
                        }
                        Cursor cursor = dVar2.f13930a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        threadLocal.set(dVar);
                        return dynamiteModule2;
                    } else if (i11 == 1) {
                        try {
                            int i12 = a10.f7463b;
                            try {
                                synchronized (DynamiteModule.class) {
                                    if (g(context)) {
                                        bool = f7452e;
                                    } else {
                                        throw new LoadingException("Remote loading disabled");
                                    }
                                }
                                if (bool != null) {
                                    if (bool.booleanValue()) {
                                        Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i12);
                                        synchronized (DynamiteModule.class) {
                                            fVar = f7460n;
                                        }
                                        if (fVar != null) {
                                            ea.d dVar3 = (ea.d) threadLocal.get();
                                            if (dVar3 != null && dVar3.f13930a != null) {
                                                Context applicationContext = context.getApplicationContext();
                                                Cursor cursor2 = dVar3.f13930a;
                                                new da.b(null);
                                                synchronized (DynamiteModule.class) {
                                                    if (f7454h >= 2) {
                                                        z10 = true;
                                                    } else {
                                                        z10 = false;
                                                    }
                                                    valueOf = Boolean.valueOf(z10);
                                                }
                                                if (valueOf.booleanValue()) {
                                                    Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                    V12 = fVar.W1(new da.b(applicationContext), str, i12, new da.b(cursor2));
                                                } else {
                                                    Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                    V12 = fVar.V1(new da.b(applicationContext), str, i12, new da.b(cursor2));
                                                }
                                                Context context2 = (Context) da.b.Y1(V12);
                                                if (context2 != null) {
                                                    dynamiteModule = new DynamiteModule(context2);
                                                } else {
                                                    throw new LoadingException("Failed to get module context");
                                                }
                                            } else {
                                                throw new LoadingException("No result cursor");
                                            }
                                        } else {
                                            throw new LoadingException("DynamiteLoaderV2 was not cached.");
                                        }
                                    } else {
                                        Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i12);
                                        ea.e h10 = h(context);
                                        if (h10 != null) {
                                            Parcel v10 = h10.v(h10.z(), 6);
                                            int readInt = v10.readInt();
                                            v10.recycle();
                                            if (readInt >= 3) {
                                                ea.d dVar4 = (ea.d) threadLocal.get();
                                                if (dVar4 != null) {
                                                    V1 = h10.W1(new da.b(context), str, i12, new da.b(dVar4.f13930a));
                                                } else {
                                                    throw new LoadingException("No cached result cursor holder");
                                                }
                                            } else if (readInt == 2) {
                                                Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                V1 = h10.X1(new da.b(context), str, i12);
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                V1 = h10.V1(new da.b(context), str, i12);
                                            }
                                            Object Y1 = da.b.Y1(V1);
                                            if (Y1 != null) {
                                                dynamiteModule = new DynamiteModule((Context) Y1);
                                            } else {
                                                throw new LoadingException("Failed to load remote module.");
                                            }
                                        } else {
                                            throw new LoadingException("Failed to create IDynamiteLoader.");
                                        }
                                    }
                                    if (longValue == 0) {
                                        d1Var.remove();
                                    } else {
                                        d1Var.set(Long.valueOf(longValue));
                                    }
                                    Cursor cursor3 = dVar2.f13930a;
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                    threadLocal.set(dVar);
                                    return dynamiteModule;
                                }
                                throw new LoadingException("Failed to determine which loading route to use.");
                            } catch (RemoteException e10) {
                                throw new LoadingException("Failed to load remote module.", e10);
                            } catch (LoadingException e11) {
                                throw e11;
                            } catch (Throwable th2) {
                                try {
                                    o.h(context);
                                } catch (Exception e12) {
                                    Log.e("CrashUtils", "Error adding exception to DropBox!", e12);
                                }
                                throw new LoadingException("Failed to load remote module.", th2);
                            }
                        } catch (LoadingException e13) {
                            String message = e13.getMessage();
                            Log.w("DynamiteModule", "Failed to load remote module: " + message);
                            int i13 = a10.f7462a;
                            if (i13 != 0 && aVar.a(context, str, new e(i13)).f7464c == -1) {
                                Log.i("DynamiteModule", "Selected local version of ".concat(str));
                                DynamiteModule dynamiteModule3 = new DynamiteModule(context.getApplicationContext());
                                if (longValue == 0) {
                                    f7457k.remove();
                                } else {
                                    f7457k.set(Long.valueOf(longValue));
                                }
                                Cursor cursor4 = dVar2.f13930a;
                                if (cursor4 != null) {
                                    cursor4.close();
                                }
                                f7456j.set(dVar);
                                return dynamiteModule3;
                            }
                            throw new LoadingException("Remote load failed. No local fallback found.", e13);
                        }
                    } else {
                        throw new LoadingException("VersionPolicy returned invalid code:" + i11);
                    }
                }
            }
            int i14 = a10.f7462a;
            int i15 = a10.f7463b;
            throw new LoadingException("No acceptable module " + str + " found. Local version is " + i14 + " and remote version is " + i15 + ".");
        } catch (Throwable th3) {
            if (longValue == 0) {
                f7457k.remove();
            } else {
                f7457k.set(Long.valueOf(longValue));
            }
            Cursor cursor5 = dVar2.f13930a;
            if (cursor5 != null) {
                cursor5.close();
            }
            f7456j.set(dVar);
            throw th3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x016e, code lost:
        if (r2 != false) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int d(Context context, String str, boolean z10) {
        Field declaredField;
        Throwable th2;
        Cursor cursor;
        RemoteException e10;
        int readInt;
        Cursor cursor2;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = f7452e;
                boolean z11 = true;
                Cursor cursor3 = null;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e11) {
                        Log.w("DynamiteModule", "Failed to load module via V2: " + e11.toString());
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader == ClassLoader.getSystemClassLoader()) {
                            bool = Boolean.FALSE;
                        } else if (classLoader != null) {
                            try {
                                f(classLoader);
                            } catch (LoadingException unused) {
                            }
                            bool = Boolean.TRUE;
                        } else if (!g(context)) {
                            return 0;
                        } else {
                            if (!f7453g) {
                                Boolean bool2 = Boolean.TRUE;
                                if (!bool2.equals(null)) {
                                    try {
                                        int e12 = e(context, str, z10, true);
                                        String str2 = f;
                                        if (str2 != null && !str2.isEmpty()) {
                                            ClassLoader a10 = ea.b.a();
                                            if (a10 == null) {
                                                if (Build.VERSION.SDK_INT >= 29) {
                                                    String str3 = f;
                                                    o.h(str3);
                                                    a10 = new DelegateLastClassLoader(str3, ClassLoader.getSystemClassLoader());
                                                } else {
                                                    String str4 = f;
                                                    o.h(str4);
                                                    a10 = new ea.c(ClassLoader.getSystemClassLoader(), str4);
                                                }
                                            }
                                            f(a10);
                                            declaredField.set(null, a10);
                                            f7452e = bool2;
                                            return e12;
                                        }
                                        return e12;
                                    } catch (LoadingException unused2) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                            bool = Boolean.FALSE;
                        }
                        f7452e = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return e(context, str, z10, false);
                    } catch (LoadingException e13) {
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e13.getMessage());
                        return 0;
                    }
                }
                ea.e h10 = h(context);
                try {
                    if (h10 == null) {
                        return 0;
                    }
                    try {
                        Parcel v10 = h10.v(h10.z(), 6);
                        int readInt2 = v10.readInt();
                        v10.recycle();
                        if (readInt2 >= 3) {
                            ThreadLocal threadLocal = f7456j;
                            ea.d dVar = (ea.d) threadLocal.get();
                            if (dVar != null && (cursor2 = dVar.f13930a) != null) {
                                return cursor2.getInt(0);
                            }
                            cursor = (Cursor) da.b.Y1(h10.Y1(new da.b(context), str, z10, ((Long) f7457k.get()).longValue()));
                            if (cursor != null) {
                                try {
                                    if (cursor.moveToFirst()) {
                                        readInt = cursor.getInt(0);
                                        if (readInt > 0) {
                                            ea.d dVar2 = (ea.d) threadLocal.get();
                                            if (dVar2 != null && dVar2.f13930a == null) {
                                                dVar2.f13930a = cursor;
                                            } else {
                                                z11 = false;
                                            }
                                        }
                                        cursor3 = cursor;
                                        if (cursor3 != null) {
                                            cursor3.close();
                                        }
                                    }
                                } catch (RemoteException e14) {
                                    e10 = e14;
                                    cursor3 = cursor;
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e10.getMessage());
                                    if (cursor3 == null) {
                                        return 0;
                                    }
                                    cursor3.close();
                                    return 0;
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    throw th2;
                                }
                            }
                            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                            if (cursor == null) {
                                return 0;
                            }
                            cursor.close();
                            return 0;
                        } else if (readInt2 == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                            da.b bVar = new da.b(context);
                            Parcel z12 = h10.z();
                            ma.a.c(z12, bVar);
                            z12.writeString(str);
                            z12.writeInt(z10 ? 1 : 0);
                            Parcel v11 = h10.v(z12, 5);
                            readInt = v11.readInt();
                            v11.recycle();
                        } else {
                            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                            da.b bVar2 = new da.b(context);
                            Parcel z13 = h10.z();
                            ma.a.c(z13, bVar2);
                            z13.writeString(str);
                            z13.writeInt(z10 ? 1 : 0);
                            Parcel v12 = h10.v(z13, 3);
                            readInt = v12.readInt();
                            v12.recycle();
                        }
                        return readInt;
                    } catch (RemoteException e15) {
                        e10 = e15;
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    cursor = null;
                }
            }
        } catch (Throwable th5) {
            try {
                o.h(context);
            } catch (Exception e16) {
                Log.e("CrashUtils", "Error adding exception to DropBox!", e16);
            }
            throw th5;
        }
    }

    public static int e(Context context, String str, boolean z10, boolean z11) {
        Exception e10;
        boolean z12;
        Cursor cursor = null;
        try {
            long longValue = ((Long) f7457k.get()).longValue();
            ContentResolver contentResolver = context.getContentResolver();
            String str2 = "api_force_staging";
            boolean z13 = true;
            if (true != z10) {
                str2 = "api";
            }
            Cursor query = contentResolver.query(new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(str2).appendPath(str).appendQueryParameter("requestStartTime", String.valueOf(longValue)).build(), null, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        boolean z14 = false;
                        int i6 = query.getInt(0);
                        if (i6 > 0) {
                            synchronized (DynamiteModule.class) {
                                f = query.getString(2);
                                int columnIndex = query.getColumnIndex("loaderVersion");
                                if (columnIndex >= 0) {
                                    f7454h = query.getInt(columnIndex);
                                }
                                int columnIndex2 = query.getColumnIndex("disableStandaloneDynamiteLoader2");
                                if (columnIndex2 >= 0) {
                                    if (query.getInt(columnIndex2) != 0) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    f7453g = z12;
                                } else {
                                    z12 = false;
                                }
                            }
                            ea.d dVar = (ea.d) f7456j.get();
                            if (dVar != null && dVar.f13930a == null) {
                                dVar.f13930a = query;
                            } else {
                                z13 = false;
                            }
                            if (!z13) {
                                cursor = query;
                            }
                            z14 = z12;
                        } else {
                            cursor = query;
                        }
                        if (z11 && z14) {
                            try {
                                try {
                                    throw new LoadingException("forcing fallback to container DynamiteLoader impl");
                                } catch (Exception e11) {
                                    e10 = e11;
                                    if (e10 instanceof LoadingException) {
                                        throw e10;
                                    }
                                    throw new LoadingException("V2 version check failed", e10);
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                th = th;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        }
                        if (cursor != null) {
                            cursor.close();
                        }
                        return i6;
                    }
                } catch (Exception e12) {
                    e10 = e12;
                } catch (Throwable th3) {
                    th = th3;
                    cursor = query;
                }
            }
            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
            throw new LoadingException("Failed to connect to dynamite module ContentResolver.");
        } catch (Exception e13) {
            e10 = e13;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static void f(ClassLoader classLoader) {
        f fVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                fVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof f) {
                    fVar = (f) queryLocalInterface;
                } else {
                    fVar = new f(iBinder);
                }
            }
            f7460n = fVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            throw new LoadingException("Failed to instantiate dynamite loader", e10);
        }
    }

    public static boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f7455i)) {
            return true;
        }
        boolean z10 = false;
        if (f7455i == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (s9.f.f31339b.b(10000000, context) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z10 = true;
            }
            Boolean valueOf = Boolean.valueOf(z10);
            f7455i = valueOf;
            z10 = valueOf.booleanValue();
            if (z10 && resolveContentProvider != null && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f7453g = true;
            }
        }
        if (!z10) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z10;
    }

    public static ea.e h(Context context) {
        ea.e eVar;
        synchronized (DynamiteModule.class) {
            ea.e eVar2 = f7459m;
            if (eVar2 != null) {
                return eVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    eVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    if (queryLocalInterface instanceof ea.e) {
                        eVar = (ea.e) queryLocalInterface;
                    } else {
                        eVar = new ea.e(iBinder);
                    }
                }
                if (eVar != null) {
                    f7459m = eVar;
                    return eVar;
                }
            } catch (Exception e10) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e10.getMessage());
            }
            return null;
        }
    }

    public final IBinder b(String str) {
        try {
            return (IBinder) this.f7461a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e10) {
            throw new LoadingException("Failed to instantiate module class: ".concat(str), e10);
        }
    }
}
