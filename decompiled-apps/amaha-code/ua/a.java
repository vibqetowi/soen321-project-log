package ua;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.dynamite.DynamiteModule;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import s9.f;
import s9.h;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final f f33972a = f.f31339b;

    /* renamed from: b  reason: collision with root package name */
    public static final Object f33973b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static Method f33974c;

    /* renamed from: d  reason: collision with root package name */
    public static Method f33975d;

    public static void a(Context context) {
        Context context2;
        Context context3;
        if (context != null) {
            f33972a.getClass();
            AtomicBoolean atomicBoolean = h.f31341a;
            f fVar = f.f31339b;
            int b10 = fVar.b(11925000, context);
            if (b10 != 0) {
                Intent a10 = fVar.a(context, "e", b10);
                Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + b10);
                if (a10 == null) {
                    throw new GooglePlayServicesNotAvailableException();
                }
                throw new GooglePlayServicesRepairableException();
            }
            synchronized (f33973b) {
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    try {
                        context2 = DynamiteModule.c(context, DynamiteModule.f7451d, "com.google.android.gms.providerinstaller.dynamite").f7461a;
                    } catch (DynamiteModule.LoadingException e10) {
                        Log.w("ProviderInstaller", "Failed to load providerinstaller module: ".concat(String.valueOf(e10.getMessage())));
                        context2 = null;
                    }
                    if (context2 == null) {
                        long elapsedRealtime2 = SystemClock.elapsedRealtime();
                        try {
                            context3 = context.createPackageContext("com.google.android.gms", 3);
                        } catch (PackageManager.NameNotFoundException unused) {
                            context3 = null;
                        }
                        if (context3 != null) {
                            try {
                                if (f33975d == null) {
                                    Class<?> cls = Long.TYPE;
                                    f33975d = context3.getClassLoader().loadClass("com.google.android.gms.common.security.ProviderInstallerImpl").getMethod("reportRequestStats", Context.class, cls, cls);
                                }
                                f33975d.invoke(null, context, Long.valueOf(elapsedRealtime), Long.valueOf(elapsedRealtime2));
                            } catch (Exception e11) {
                                Log.w("ProviderInstaller", "Failed to report request stats: ".concat(String.valueOf(e11.getMessage())));
                            }
                        }
                        if (context3 != null) {
                            b(context3, "com.google.android.gms.common.security.ProviderInstallerImpl");
                            return;
                        } else {
                            Log.e("ProviderInstaller", "Failed to get remote context");
                            throw new GooglePlayServicesNotAvailableException();
                        }
                    }
                    b(context2, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
                    return;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        throw new NullPointerException("Context must not be null");
    }

    public static void b(Context context, String str) {
        String message;
        try {
            if (f33974c == null) {
                f33974c = context.getClassLoader().loadClass(str).getMethod("insertProvider", Context.class);
            }
            f33974c.invoke(null, context);
        } catch (Exception e10) {
            Throwable cause = e10.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                if (cause == null) {
                    message = e10.getMessage();
                } else {
                    message = cause.getMessage();
                }
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(message)));
            }
            throw new GooglePlayServicesNotAvailableException();
        }
    }
}
