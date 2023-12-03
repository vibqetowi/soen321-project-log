package s9;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;
import v9.l0;
import v9.m0;
import v9.n0;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static final o f31361a;

    /* renamed from: b  reason: collision with root package name */
    public static final o f31362b;

    /* renamed from: c  reason: collision with root package name */
    public static volatile n0 f31363c;

    /* renamed from: d  reason: collision with root package name */
    public static final Object f31364d;

    /* renamed from: e  reason: collision with root package name */
    public static Context f31365e;

    static {
        new o(p.X1("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"), 0);
        new o(p.X1("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"), 1);
        f31361a = new o(p.X1("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"), 2);
        f31362b = new o(p.X1("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"), 3);
        f31364d = new Object();
    }

    public static synchronized void a(Context context) {
        synchronized (t.class) {
            if (f31365e == null) {
                if (context != null) {
                    f31365e = context.getApplicationContext();
                    return;
                }
                return;
            }
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        }
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [s9.n] */
    public static b0 b(final String str, final p pVar, final boolean z10, boolean z11) {
        try {
            c();
            v9.o.h(f31365e);
            try {
                if (f31363c.B0(new y(str, pVar, z10, z11), new da.b(f31365e.getPackageManager()))) {
                    return b0.f31326d;
                }
                return new a0(new Callable() { // from class: s9.n
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        boolean z12;
                        String str2;
                        MessageDigest messageDigest;
                        boolean z13 = z10;
                        String str3 = str;
                        p pVar2 = pVar;
                        if (!z13 && t.b(str3, pVar2, true, false).f31327a) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (true != z12) {
                            str2 = "not allowed";
                        } else {
                            str2 = "debug cert rejected";
                        }
                        Object[] objArr = new Object[5];
                        objArr[0] = str2;
                        objArr[1] = str3;
                        int i6 = 0;
                        while (true) {
                            if (i6 < 2) {
                                try {
                                    messageDigest = MessageDigest.getInstance("SHA-256");
                                } catch (NoSuchAlgorithmException unused) {
                                }
                                if (messageDigest != null) {
                                    break;
                                }
                                i6++;
                            } else {
                                messageDigest = null;
                                break;
                            }
                        }
                        v9.o.h(messageDigest);
                        byte[] digest = messageDigest.digest(pVar2.Y1());
                        int length = digest.length;
                        char[] cArr = new char[length + length];
                        int i10 = 0;
                        for (byte b10 : digest) {
                            int i11 = b10 & 255;
                            int i12 = i10 + 1;
                            char[] cArr2 = f6.b.f14867v;
                            cArr[i10] = cArr2[i11 >>> 4];
                            i10 = i12 + 1;
                            cArr[i12] = cArr2[i11 & 15];
                        }
                        objArr[2] = new String(cArr);
                        objArr[3] = Boolean.valueOf(z13);
                        objArr[4] = "12451000.false";
                        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", objArr);
                    }
                });
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                return b0.c("module call", e10);
            }
        } catch (DynamiteModule.LoadingException e11) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
            return b0.c("module init: ".concat(String.valueOf(e11.getMessage())), e11);
        }
    }

    public static void c() {
        n0 l0Var;
        if (f31363c != null) {
            return;
        }
        v9.o.h(f31365e);
        synchronized (f31364d) {
            if (f31363c == null) {
                IBinder b10 = DynamiteModule.c(f31365e, DynamiteModule.f7451d, "com.google.android.gms.googlecertificates").b("com.google.android.gms.common.GoogleCertificatesImpl");
                int i6 = m0.f34925b;
                if (b10 == null) {
                    l0Var = null;
                } else {
                    IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                    if (queryLocalInterface instanceof n0) {
                        l0Var = (n0) queryLocalInterface;
                    } else {
                        l0Var = new l0(b10);
                    }
                }
                f31363c = l0Var;
            }
        }
    }
}
