package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.UserManager;
import android.util.Log;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class u3 implements t3 {

    /* renamed from: c  reason: collision with root package name */
    public static u3 f8619c;

    /* renamed from: a  reason: collision with root package name */
    public final Context f8620a;

    /* renamed from: b  reason: collision with root package name */
    public final k3 f8621b;

    public u3() {
        this.f8620a = null;
        this.f8621b = null;
    }

    public static u3 a(Context context) {
        u3 u3Var;
        u3 u3Var2;
        synchronized (u3.class) {
            if (f8619c == null) {
                if (ca.a.y(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                    u3Var2 = new u3(context);
                } else {
                    u3Var2 = new u3();
                }
                f8619c = u3Var2;
            }
            u3Var = f8619c;
        }
        return u3Var;
    }

    public static synchronized void c() {
        Context context;
        synchronized (u3.class) {
            u3 u3Var = f8619c;
            if (u3Var != null && (context = u3Var.f8620a) != null && u3Var.f8621b != null) {
                context.getContentResolver().unregisterContentObserver(f8619c.f8621b);
            }
            f8619c = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0046, code lost:
        if (r6.isUserRunning(android.os.Process.myUserHandle()) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
        r0 = true;
     */
    @Override // com.google.android.gms.internal.measurement.t3
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String f(String str) {
        boolean z10;
        Object a10;
        boolean z11;
        boolean isUserUnlocked;
        Object systemService;
        Context context = this.f8620a;
        if (context != null) {
            UserManager userManager = n3.f8482a;
            boolean z12 = false;
            if (Build.VERSION.SDK_INT >= 24) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && !n3.f8483b) {
                synchronized (n3.class) {
                    if (!n3.f8483b) {
                        int i6 = 1;
                        while (true) {
                            if (i6 > 2) {
                                break;
                            }
                            if (n3.f8482a == null) {
                                systemService = context.getSystemService(UserManager.class);
                                n3.f8482a = (UserManager) systemService;
                            }
                            UserManager userManager2 = n3.f8482a;
                            if (userManager2 != null) {
                                try {
                                    isUserUnlocked = userManager2.isUserUnlocked();
                                    if (isUserUnlocked) {
                                        break;
                                    }
                                } catch (NullPointerException e10) {
                                    Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e10);
                                    n3.f8482a = null;
                                    i6++;
                                }
                            } else {
                                z11 = true;
                                break;
                            }
                        }
                        z11 = false;
                        if (z11) {
                            n3.f8482a = null;
                        }
                        if (z11) {
                            n3.f8483b = true;
                        }
                        if (!z11) {
                            z12 = true;
                        }
                    }
                }
            }
            if (!z12) {
                try {
                    try {
                        androidx.appcompat.widget.l lVar = new androidx.appcompat.widget.l(this, 23, str);
                        try {
                            a10 = lVar.a();
                        } catch (SecurityException unused) {
                            long clearCallingIdentity = Binder.clearCallingIdentity();
                            try {
                                a10 = lVar.a();
                            } finally {
                                Binder.restoreCallingIdentity(clearCallingIdentity);
                            }
                        }
                        return (String) a10;
                    } catch (SecurityException e11) {
                        e = e11;
                        Log.e("GservicesLoader", "Unable to read GServices for: ".concat(String.valueOf(str)), e);
                        return null;
                    }
                } catch (IllegalStateException e12) {
                    e = e12;
                    Log.e("GservicesLoader", "Unable to read GServices for: ".concat(String.valueOf(str)), e);
                    return null;
                } catch (NullPointerException e13) {
                    e = e13;
                    Log.e("GservicesLoader", "Unable to read GServices for: ".concat(String.valueOf(str)), e);
                    return null;
                }
            }
        }
        return null;
    }

    public u3(Context context) {
        this.f8620a = context;
        k3 k3Var = new k3();
        this.f8621b = k3Var;
        context.getContentResolver().registerContentObserver(m3.f8464a, true, k3Var);
    }
}
