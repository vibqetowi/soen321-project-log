package ta;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class r2 {

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicReference f32839b = new AtomicReference();

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicReference f32840c = new AtomicReference();

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicReference f32841d = new AtomicReference();

    /* renamed from: a  reason: collision with root package name */
    public final x3 f32842a;

    public r2(x3 x3Var) {
        this.f32842a = x3Var;
    }

    public static final String g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        boolean z10;
        String str2;
        v9.o.h(atomicReference);
        if (strArr.length == strArr2.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        v9.o.b(z10);
        for (int i6 = 0; i6 < strArr.length; i6++) {
            String str3 = strArr[i6];
            if (str == str3 || str.equals(str3)) {
                synchronized (atomicReference) {
                    String[] strArr3 = (String[]) atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    str2 = strArr3[i6];
                    if (str2 == null) {
                        str2 = strArr2[i6] + "(" + strArr[i6] + ")";
                        strArr3[i6] = str2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String a(Object[] objArr) {
        String valueOf;
        if (objArr == null) {
            return "[]";
        }
        StringBuilder c10 = v.h.c("[");
        for (Object obj : objArr) {
            if (obj instanceof Bundle) {
                valueOf = b((Bundle) obj);
            } else {
                valueOf = String.valueOf(obj);
            }
            if (valueOf != null) {
                if (c10.length() != 1) {
                    c10.append(", ");
                }
                c10.append(valueOf);
            }
        }
        c10.append("]");
        return c10.toString();
    }

    public final String b(Bundle bundle) {
        String valueOf;
        if (bundle == null) {
            return null;
        }
        if (!this.f32842a.g()) {
            return bundle.toString();
        }
        StringBuilder c10 = v.h.c("Bundle[{");
        for (String str : bundle.keySet()) {
            if (c10.length() != 8) {
                c10.append(", ");
            }
            c10.append(e(str));
            c10.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                valueOf = a(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                valueOf = a((Object[]) obj);
            } else if (obj instanceof ArrayList) {
                valueOf = a(((ArrayList) obj).toArray());
            } else {
                valueOf = String.valueOf(obj);
            }
            c10.append(valueOf);
        }
        c10.append("}]");
        return c10.toString();
    }

    public final String c(s sVar) {
        String b10;
        x3 x3Var = this.f32842a;
        if (!x3Var.g()) {
            return sVar.toString();
        }
        StringBuilder sb2 = new StringBuilder("origin=");
        sb2.append(sVar.f32860w);
        sb2.append(",name=");
        sb2.append(d(sVar.f32858u));
        sb2.append(",params=");
        q qVar = sVar.f32859v;
        if (qVar == null) {
            b10 = null;
        } else if (!x3Var.g()) {
            b10 = qVar.toString();
        } else {
            b10 = b(qVar.f0());
        }
        sb2.append(b10);
        return sb2.toString();
    }

    public final String d(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f32842a.g()) {
            return str;
        }
        return g(str, kc.f.f23227q0, kc.f.f23225o0, f32839b);
    }

    public final String e(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f32842a.g()) {
            return str;
        }
        return g(str, kotlin.jvm.internal.b0.Y, kotlin.jvm.internal.b0.X, f32840c);
    }

    public final String f(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f32842a.g()) {
            return str;
        }
        if (str.startsWith("_exp_")) {
            return defpackage.b.m("experiment_id(", str, ")");
        }
        return g(str, f6.b.L, f6.b.K, f32841d);
    }
}
