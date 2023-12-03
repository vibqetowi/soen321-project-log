package gd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p000firebaseauthapi.jf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* loaded from: classes.dex */
public final class k0 extends fd.f {
    public static final Parcelable.Creator<k0> CREATOR = new l0();
    public String A;
    public Boolean B;
    public m0 C;
    public boolean D;
    public fd.x E;
    public q F;

    /* renamed from: u  reason: collision with root package name */
    public jf f16425u;

    /* renamed from: v  reason: collision with root package name */
    public h0 f16426v;

    /* renamed from: w  reason: collision with root package name */
    public final String f16427w;

    /* renamed from: x  reason: collision with root package name */
    public final String f16428x;

    /* renamed from: y  reason: collision with root package name */
    public List f16429y;

    /* renamed from: z  reason: collision with root package name */
    public List f16430z;

    public k0(sc.e eVar, ArrayList arrayList) {
        v9.o.h(eVar);
        eVar.b();
        this.f16427w = eVar.f31433b;
        this.f16428x = "com.google.firebase.auth.internal.DefaultFirebaseUser";
        this.A = "2";
        o0(arrayList);
    }

    @Override // fd.q
    public final String J() {
        return this.f16426v.f16416v;
    }

    @Override // fd.f
    public final String f0() {
        return this.f16426v.f16419y;
    }

    @Override // fd.f
    public final /* synthetic */ d g0() {
        return new d(this);
    }

    @Override // fd.f
    public final List<? extends fd.q> h0() {
        return this.f16429y;
    }

    @Override // fd.f
    public final String i0() {
        String str;
        Map map;
        jf jfVar = this.f16425u;
        if (jfVar == null || (str = jfVar.f7923v) == null || (map = (Map) o.a(str).f14955b.get("firebase")) == null) {
            return null;
        }
        return (String) map.get("tenant");
    }

    @Override // fd.f
    public final String j0() {
        return this.f16426v.f16415u;
    }

    @Override // fd.f
    public final boolean k0() {
        String str;
        Boolean bool = this.B;
        if (bool == null || bool.booleanValue()) {
            jf jfVar = this.f16425u;
            if (jfVar != null) {
                Map map = (Map) o.a(jfVar.f7923v).f14955b.get("firebase");
                if (map != null) {
                    str = (String) map.get("sign_in_provider");
                } else {
                    str = null;
                }
            } else {
                str = "";
            }
            boolean z10 = false;
            if (this.f16429y.size() <= 1 && (str == null || !str.equals("custom"))) {
                z10 = true;
            }
            this.B = Boolean.valueOf(z10);
        }
        return this.B.booleanValue();
    }

    @Override // fd.f
    public final sc.e m0() {
        return sc.e.f(this.f16427w);
    }

    @Override // fd.f
    public final k0 n0() {
        this.B = Boolean.FALSE;
        return this;
    }

    @Override // fd.f
    public final synchronized k0 o0(List list) {
        v9.o.h(list);
        this.f16429y = new ArrayList(list.size());
        this.f16430z = new ArrayList(list.size());
        for (int i6 = 0; i6 < list.size(); i6++) {
            fd.q qVar = (fd.q) list.get(i6);
            if (qVar.J().equals("firebase")) {
                this.f16426v = (h0) qVar;
            } else {
                this.f16430z.add(qVar.J());
            }
            this.f16429y.add((h0) qVar);
        }
        if (this.f16426v == null) {
            this.f16426v = (h0) this.f16429y.get(0);
        }
        return this;
    }

    @Override // fd.f
    public final jf p0() {
        return this.f16425u;
    }

    @Override // fd.f
    public final String q0() {
        return this.f16425u.f7923v;
    }

    @Override // fd.f
    public final String r0() {
        return this.f16425u.g0();
    }

    @Override // fd.f
    public final List s0() {
        return this.f16430z;
    }

    @Override // fd.f
    public final void t0(jf jfVar) {
        v9.o.h(jfVar);
        this.f16425u = jfVar;
    }

    @Override // fd.f
    public final void u0(ArrayList arrayList) {
        q qVar;
        if (arrayList.isEmpty()) {
            qVar = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                fd.j jVar = (fd.j) it.next();
                if (jVar instanceof fd.n) {
                    arrayList2.add((fd.n) jVar);
                }
            }
            qVar = new q(arrayList2);
        }
        this.F = qVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.w0(parcel, 1, this.f16425u, i6);
        hc.d.w0(parcel, 2, this.f16426v, i6);
        hc.d.x0(parcel, 3, this.f16427w);
        hc.d.x0(parcel, 4, this.f16428x);
        hc.d.A0(parcel, 5, this.f16429y);
        hc.d.y0(parcel, 6, this.f16430z);
        hc.d.x0(parcel, 7, this.A);
        Boolean valueOf = Boolean.valueOf(k0());
        if (valueOf != null) {
            parcel.writeInt(262152);
            parcel.writeInt(valueOf.booleanValue() ? 1 : 0);
        }
        hc.d.w0(parcel, 9, this.C, i6);
        hc.d.o0(parcel, 10, this.D);
        hc.d.w0(parcel, 11, this.E, i6);
        hc.d.w0(parcel, 12, this.F, i6);
        hc.d.C0(parcel, B0);
    }

    public k0(jf jfVar, h0 h0Var, String str, String str2, ArrayList arrayList, ArrayList arrayList2, String str3, Boolean bool, m0 m0Var, boolean z10, fd.x xVar, q qVar) {
        this.f16425u = jfVar;
        this.f16426v = h0Var;
        this.f16427w = str;
        this.f16428x = str2;
        this.f16429y = arrayList;
        this.f16430z = arrayList2;
        this.A = str3;
        this.B = bool;
        this.C = m0Var;
        this.D = z10;
        this.E = xVar;
        this.F = qVar;
    }
}
