package s9;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.errorprone.annotations.RestrictedInheritance;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms/common/testing/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
/* loaded from: classes.dex */
public final class i {

    /* renamed from: c  reason: collision with root package name */
    public static i f31345c;

    /* renamed from: a  reason: collision with root package name */
    public final Context f31346a;

    /* renamed from: b  reason: collision with root package name */
    public volatile String f31347b;

    public i(Context context) {
        this.f31346a = context.getApplicationContext();
    }

    public static i a(Context context) {
        v9.o.h(context);
        synchronized (i.class) {
            if (f31345c == null) {
                t.a(context);
                f31345c = new i(context);
            }
        }
        return f31345c;
    }

    public static final p c(PackageInfo packageInfo, p... pVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        q qVar = new q(packageInfo.signatures[0].toByteArray());
        for (int i6 = 0; i6 < pVarArr.length; i6++) {
            if (pVarArr[i6].equals(qVar)) {
                return pVarArr[i6];
            }
        }
        return null;
    }

    public static final boolean d(PackageInfo packageInfo, boolean z10) {
        p c10;
        if (z10 && packageInfo != null && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo == null || (applicationInfo.flags & 129) == 0) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        if (packageInfo != null && packageInfo.signatures != null) {
            if (z10) {
                c10 = c(packageInfo, s.f31360a);
            } else {
                c10 = c(packageInfo, s.f31360a[0]);
            }
            if (c10 != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int i6) {
        b0 b10;
        int length;
        boolean z10;
        ApplicationInfo applicationInfo;
        PackageManager.NameNotFoundException nameNotFoundException;
        String[] packagesForUid = this.f31346a.getPackageManager().getPackagesForUid(i6);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            b10 = null;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    String str = packagesForUid[i10];
                    if (str == null) {
                        b10 = b0.b("null pkg");
                    } else if (!str.equals(this.f31347b)) {
                        o oVar = t.f31361a;
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            try {
                                t.c();
                                z10 = t.f31363c.g();
                                StrictMode.setThreadPolicy(allowThreadDiskReads);
                            } finally {
                            }
                        } catch (RemoteException | DynamiteModule.LoadingException e10) {
                            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            z10 = false;
                        }
                        if (z10) {
                            boolean a10 = h.a(this.f31346a);
                            allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                            try {
                                v9.o.h(t.f31365e);
                                try {
                                    t.c();
                                    try {
                                        w I1 = t.f31363c.I1(new u(str, a10, false, new da.b(t.f31365e), false));
                                        if (I1.f31371u) {
                                            sc.b.m0(I1.f31374x);
                                            b10 = new b0(true, null, null);
                                        } else {
                                            String str2 = I1.f31372v;
                                            if (sc.b.o0(I1.f31373w) == 4) {
                                                nameNotFoundException = new PackageManager.NameNotFoundException();
                                            } else {
                                                nameNotFoundException = null;
                                            }
                                            if (str2 == null) {
                                                str2 = "error checking package certificate";
                                            }
                                            sc.b.m0(I1.f31374x);
                                            sc.b.o0(I1.f31373w);
                                            b10 = new b0(false, str2, nameNotFoundException);
                                        }
                                    } catch (RemoteException e11) {
                                        Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
                                        b10 = b0.c("module call", e11);
                                    }
                                } catch (DynamiteModule.LoadingException e12) {
                                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e12);
                                    b10 = b0.c("module init: ".concat(String.valueOf(e12.getMessage())), e12);
                                }
                            } finally {
                            }
                        } else {
                            try {
                                PackageInfo packageInfo = this.f31346a.getPackageManager().getPackageInfo(str, 64);
                                boolean a11 = h.a(this.f31346a);
                                if (packageInfo == null) {
                                    b10 = b0.b("null pkg");
                                } else {
                                    Signature[] signatureArr = packageInfo.signatures;
                                    if (signatureArr != null && signatureArr.length == 1) {
                                        q qVar = new q(packageInfo.signatures[0].toByteArray());
                                        String str3 = packageInfo.packageName;
                                        allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                                        try {
                                            b0 b11 = t.b(str3, qVar, a11, false);
                                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                                            if (b11.f31327a && (applicationInfo = packageInfo.applicationInfo) != null && (applicationInfo.flags & 2) != 0) {
                                                allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                                                try {
                                                    b0 b12 = t.b(str3, qVar, false, true);
                                                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                                                    if (b12.f31327a) {
                                                        b10 = b0.b("debuggable release cert app rejected");
                                                    }
                                                } finally {
                                                }
                                            }
                                            b10 = b11;
                                        } finally {
                                        }
                                    } else {
                                        b10 = b0.b("single cert required");
                                    }
                                    if (b10.f31327a) {
                                        this.f31347b = str;
                                    }
                                }
                            } catch (PackageManager.NameNotFoundException e13) {
                                b10 = b0.c("no pkg ".concat(str), e13);
                            }
                        }
                        if (b10.f31327a) {
                        }
                    } else {
                        b10 = b0.f31326d;
                    }
                    if (b10.f31327a) {
                        break;
                    }
                    i10++;
                } else {
                    v9.o.h(b10);
                    break;
                }
            }
        } else {
            b10 = b0.b("no pkgs");
        }
        if (!b10.f31327a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            Throwable th2 = b10.f31329c;
            if (th2 != null) {
                Log.d("GoogleCertificatesRslt", b10.a(), th2);
            } else {
                Log.d("GoogleCertificatesRslt", b10.a());
            }
        }
        return b10.f31327a;
    }
}
