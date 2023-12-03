package lv;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import lv.h0;
/* compiled from: ConnectionSpec.kt */
/* loaded from: classes2.dex */
public final class j {

    /* renamed from: e  reason: collision with root package name */
    public static final j f24642e;
    public static final j f;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f24643a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f24644b;

    /* renamed from: c  reason: collision with root package name */
    public final String[] f24645c;

    /* renamed from: d  reason: collision with root package name */
    public final String[] f24646d;

    static {
        i iVar = i.r;
        i iVar2 = i.f24639s;
        i iVar3 = i.f24640t;
        i iVar4 = i.f24633l;
        i iVar5 = i.f24635n;
        i iVar6 = i.f24634m;
        i iVar7 = i.f24636o;
        i iVar8 = i.f24638q;
        i iVar9 = i.f24637p;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9};
        i[] iVarArr2 = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, i.f24631j, i.f24632k, i.f24629h, i.f24630i, i.f, i.f24628g, i.f24627e};
        a aVar = new a();
        aVar.c((i[]) Arrays.copyOf(iVarArr, 9));
        h0 h0Var = h0.TLS_1_3;
        h0 h0Var2 = h0.TLS_1_2;
        aVar.f(h0Var, h0Var2);
        aVar.d();
        aVar.a();
        a aVar2 = new a();
        aVar2.c((i[]) Arrays.copyOf(iVarArr2, 16));
        aVar2.f(h0Var, h0Var2);
        aVar2.d();
        f24642e = aVar2.a();
        a aVar3 = new a();
        aVar3.c((i[]) Arrays.copyOf(iVarArr2, 16));
        aVar3.f(h0Var, h0Var2, h0.TLS_1_1, h0.TLS_1_0);
        aVar3.d();
        aVar3.a();
        f = new j(false, false, null, null);
    }

    public j(boolean z10, boolean z11, String[] strArr, String[] strArr2) {
        this.f24643a = z10;
        this.f24644b = z11;
        this.f24645c = strArr;
        this.f24646d = strArr2;
    }

    public final List<i> a() {
        String[] strArr = this.f24645c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(i.f24624b.b(str));
        }
        return is.u.I2(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.f24643a) {
            return false;
        }
        String[] strArr = this.f24646d;
        if (strArr != null && !mv.b.j(strArr, sSLSocket.getEnabledProtocols(), ks.a.f23814u)) {
            return false;
        }
        String[] strArr2 = this.f24645c;
        if (strArr2 != null && !mv.b.j(strArr2, sSLSocket.getEnabledCipherSuites(), i.f24625c)) {
            return false;
        }
        return true;
    }

    public final List<h0> c() {
        String[] strArr = this.f24646d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(h0.a.a(str));
        }
        return is.u.I2(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        j jVar = (j) obj;
        boolean z10 = jVar.f24643a;
        boolean z11 = this.f24643a;
        if (z11 != z10) {
            return false;
        }
        if (z11 && (!Arrays.equals(this.f24645c, jVar.f24645c) || !Arrays.equals(this.f24646d, jVar.f24646d) || this.f24644b != jVar.f24644b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        if (this.f24643a) {
            int i6 = 0;
            String[] strArr = this.f24645c;
            if (strArr == null) {
                hashCode = 0;
            } else {
                hashCode = Arrays.hashCode(strArr);
            }
            int i10 = (527 + hashCode) * 31;
            String[] strArr2 = this.f24646d;
            if (strArr2 != null) {
                i6 = Arrays.hashCode(strArr2);
            }
            return ((i10 + i6) * 31) + (!this.f24644b ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        if (!this.f24643a) {
            return "ConnectionSpec()";
        }
        StringBuilder sb2 = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb2.append((Object) Objects.toString(a(), "[all enabled]"));
        sb2.append(", tlsVersions=");
        sb2.append((Object) Objects.toString(c(), "[all enabled]"));
        sb2.append(", supportsTlsExtensions=");
        return defpackage.c.t(sb2, this.f24644b, ')');
    }

    /* compiled from: ConnectionSpec.kt */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f24647a;

        /* renamed from: b  reason: collision with root package name */
        public String[] f24648b;

        /* renamed from: c  reason: collision with root package name */
        public String[] f24649c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f24650d;

        public a() {
            this.f24647a = true;
        }

        public final j a() {
            return new j(this.f24647a, this.f24650d, this.f24648b, this.f24649c);
        }

        public final void b(String... cipherSuites) {
            boolean z10;
            kotlin.jvm.internal.i.g(cipherSuites, "cipherSuites");
            if (this.f24647a) {
                if (cipherSuites.length == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    this.f24648b = (String[]) cipherSuites.clone();
                    return;
                }
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        public final void c(i... cipherSuites) {
            kotlin.jvm.internal.i.g(cipherSuites, "cipherSuites");
            if (this.f24647a) {
                ArrayList arrayList = new ArrayList(cipherSuites.length);
                for (i iVar : cipherSuites) {
                    arrayList.add(iVar.f24641a);
                }
                Object[] array = arrayList.toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    b((String[]) Arrays.copyOf(strArr, strArr.length));
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        public final void d() {
            if (this.f24647a) {
                this.f24650d = true;
                return;
            }
            throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
        }

        public final void e(String... tlsVersions) {
            boolean z10;
            kotlin.jvm.internal.i.g(tlsVersions, "tlsVersions");
            if (this.f24647a) {
                if (tlsVersions.length == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    this.f24649c = (String[]) tlsVersions.clone();
                    return;
                }
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        public final void f(h0... h0VarArr) {
            if (this.f24647a) {
                ArrayList arrayList = new ArrayList(h0VarArr.length);
                for (h0 h0Var : h0VarArr) {
                    arrayList.add(h0Var.f24623u);
                }
                Object[] array = arrayList.toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    e((String[]) Arrays.copyOf(strArr, strArr.length));
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        public a(j jVar) {
            this.f24647a = jVar.f24643a;
            this.f24648b = jVar.f24645c;
            this.f24649c = jVar.f24646d;
            this.f24650d = jVar.f24644b;
        }
    }
}
