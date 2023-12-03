package p3;

import android.location.Location;
import gv.n;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.i;
import o3.e;
import o3.f;
import s3.a;
import ta.v;
import v3.d;
import w3.j;
/* compiled from: AndroidContextPlugin.kt */
/* loaded from: classes.dex */
public final class a implements j {

    /* renamed from: x  reason: collision with root package name */
    public static final Set<String> f27873x = ca.a.m1("", "9774d56d682e549c", "unknown", "000000000000000", "Android", "DEFACE", "00000000-0000-0000-0000-000000000000");

    /* renamed from: u  reason: collision with root package name */
    public final j.a f27874u = j.a.Before;

    /* renamed from: v  reason: collision with root package name */
    public u3.b f27875v;

    /* renamed from: w  reason: collision with root package name */
    public s3.a f27876w;

    /* compiled from: AndroidContextPlugin.kt */
    /* renamed from: p3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0465a {
        public static boolean a(String str) {
            boolean z10;
            if (str.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 || a.f27873x.contains(str)) {
                return false;
            }
            return true;
        }
    }

    @Override // w3.j
    public final j.a a() {
        return this.f27874u;
    }

    @Override // w3.j
    public final void c(u3.b bVar) {
        this.f27875v = bVar;
    }

    @Override // w3.j
    public final void g(u3.b bVar) {
        c(bVar);
        e eVar = (e) bVar.f33766a;
        this.f27876w = new s3.a(eVar.f27033w, eVar.f27015c);
        String str = (String) i().f33767b.f31226x;
        if (str == null || !C0465a.a(str) || n.z0(str, "S")) {
            if (!eVar.f27030t && eVar.r) {
                s3.a aVar = this.f27876w;
                if (aVar != null) {
                    a.C0531a a10 = aVar.a();
                    i.d(a10);
                    if (!a10.f31264k) {
                        s3.a aVar2 = this.f27876w;
                        if (aVar2 != null) {
                            a.C0531a a11 = aVar2.a();
                            i.d(a11);
                            String str2 = a11.f31255a;
                            if (str2 != null && C0465a.a(str2)) {
                                i().g(str2);
                                return;
                            }
                        } else {
                            i.q("contextProvider");
                            throw null;
                        }
                    }
                } else {
                    i.q("contextProvider");
                    throw null;
                }
            }
            if (eVar.f27029s) {
                s3.a aVar3 = this.f27876w;
                if (aVar3 != null) {
                    a.C0531a a12 = aVar3.a();
                    i.d(a12);
                    String str3 = a12.f31265l;
                    if (str3 != null && C0465a.a(str3)) {
                        i().g(i.n("S", str3));
                        return;
                    }
                } else {
                    i.q("contextProvider");
                    throw null;
                }
            }
            String uuid = UUID.randomUUID().toString();
            i.f(uuid, "randomUUID().toString()");
            i().g(i.n("R", uuid));
        }
    }

    @Override // w3.j
    public final v3.a h(v3.a aVar) {
        d d10;
        v3.e j10;
        String i6;
        HashSet hashSet;
        e eVar = (e) i().f33766a;
        if (aVar.f34778c == null) {
            long currentTimeMillis = System.currentTimeMillis();
            aVar.f34778c = Long.valueOf(currentTimeMillis);
            j().f27000p = currentTimeMillis;
        }
        Long l2 = aVar.f34778c;
        if (l2 != null) {
            long longValue = l2.longValue();
            if (!i.b(aVar.a(), "session_start") && !i.b(aVar.a(), "session_end")) {
                if (!j().f26997m) {
                    j().k(longValue);
                } else {
                    j().i(longValue);
                }
            }
        }
        if (aVar.f == null) {
            aVar.f = UUID.randomUUID().toString();
        }
        if (aVar.B == null) {
            aVar.B = "amplitude-analytics-android/1.3.2";
        }
        if (aVar.f34776a == null) {
            aVar.f34776a = (String) i().f33767b.f31225w;
        }
        if (aVar.f34777b == null) {
            aVar.f34777b = (String) i().f33767b.f31226x;
        }
        aVar.f34780e = j().f26998n;
        int i10 = 0;
        if (aVar.f34779d == null) {
            long j11 = j().f26999o + 1;
            aVar.f34779d = Long.valueOf(j11);
            j().f26999o = j11;
            v.H(i().f33768c, i().f33769d, 0, new b(this, j11, null), 2);
        }
        f fVar = eVar.f27031u;
        if (eVar.f27032v) {
            f fVar2 = new f();
            String[] strArr = f.f27037b;
            while (true) {
                hashSet = fVar2.f27038a;
                if (i10 >= 4) {
                    break;
                }
                String str = strArr[i10];
                i10++;
                hashSet.add(str);
            }
            fVar.getClass();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                fVar.f27038a.add((String) it.next());
            }
        }
        if (fVar.a("version_name")) {
            s3.a aVar2 = this.f27876w;
            if (aVar2 != null) {
                a.C0531a a10 = aVar2.a();
                i.d(a10);
                aVar.f34784j = a10.f31257c;
            } else {
                i.q("contextProvider");
                throw null;
            }
        }
        if (fVar.a("os_name")) {
            s3.a aVar3 = this.f27876w;
            if (aVar3 != null) {
                a.C0531a a11 = aVar3.a();
                i.d(a11);
                aVar.f34786l = a11.f31258d;
            } else {
                i.q("contextProvider");
                throw null;
            }
        }
        if (fVar.a("os_version")) {
            s3.a aVar4 = this.f27876w;
            if (aVar4 != null) {
                a.C0531a a12 = aVar4.a();
                i.d(a12);
                aVar.f34787m = a12.f31259e;
            } else {
                i.q("contextProvider");
                throw null;
            }
        }
        if (fVar.a("device_brand")) {
            s3.a aVar5 = this.f27876w;
            if (aVar5 != null) {
                a.C0531a a13 = aVar5.a();
                i.d(a13);
                aVar.f34788n = a13.f;
            } else {
                i.q("contextProvider");
                throw null;
            }
        }
        if (fVar.a("device_manufacturer")) {
            s3.a aVar6 = this.f27876w;
            if (aVar6 != null) {
                a.C0531a a14 = aVar6.a();
                i.d(a14);
                aVar.f34789o = a14.f31260g;
            } else {
                i.q("contextProvider");
                throw null;
            }
        }
        if (fVar.a("device_model")) {
            s3.a aVar7 = this.f27876w;
            if (aVar7 != null) {
                a.C0531a a15 = aVar7.a();
                i.d(a15);
                aVar.f34790p = a15.f31261h;
            } else {
                i.q("contextProvider");
                throw null;
            }
        }
        if (fVar.a("carrier")) {
            s3.a aVar8 = this.f27876w;
            if (aVar8 != null) {
                a.C0531a a16 = aVar8.a();
                i.d(a16);
                aVar.f34791q = a16.f31262i;
            } else {
                i.q("contextProvider");
                throw null;
            }
        }
        if (fVar.a("country")) {
            s3.a aVar9 = this.f27876w;
            if (aVar9 != null) {
                a.C0531a a17 = aVar9.a();
                i.d(a17);
                aVar.r = a17.f31256b;
            } else {
                i.q("contextProvider");
                throw null;
            }
        }
        if (fVar.a("language")) {
            s3.a aVar10 = this.f27876w;
            if (aVar10 != null) {
                a.C0531a a18 = aVar10.a();
                i.d(a18);
                aVar.A = a18.f31263j;
            } else {
                i.q("contextProvider");
                throw null;
            }
        }
        if (fVar.a("platform")) {
            aVar.f34785k = "Android";
        }
        if (fVar.a("lat_lng")) {
            s3.a aVar11 = this.f27876w;
            if (aVar11 != null) {
                Location c10 = aVar11.c();
                if (c10 != null) {
                    aVar.f34781g = Double.valueOf(c10.getLatitude());
                    aVar.f34782h = Double.valueOf(c10.getLongitude());
                }
            } else {
                i.q("contextProvider");
                throw null;
            }
        }
        if (fVar.a("adid")) {
            s3.a aVar12 = this.f27876w;
            if (aVar12 != null) {
                a.C0531a a19 = aVar12.a();
                i.d(a19);
                String str2 = a19.f31255a;
                if (str2 != null) {
                    aVar.f34797x = str2;
                }
            } else {
                i.q("contextProvider");
                throw null;
            }
        }
        if (fVar.a("app_set_id")) {
            s3.a aVar13 = this.f27876w;
            if (aVar13 != null) {
                a.C0531a a20 = aVar13.a();
                i.d(a20);
                String str3 = a20.f31265l;
                if (str3 != null) {
                    aVar.f34798y = str3;
                }
            } else {
                i.q("contextProvider");
                throw null;
            }
        }
        if (aVar.K == null && (i6 = i().f33766a.i()) != null) {
            aVar.K = i6;
        }
        if (aVar.D == null && (j10 = i().f33766a.j()) != null) {
            aVar.D = new v3.e(j10.f34802a, j10.f34803b, j10.f34804c, j10.f34805d);
        }
        if (aVar.E == null && (d10 = i().f33766a.d()) != null) {
            aVar.E = new d(d10.f34800a, d10.f34801b);
        }
        return aVar;
    }

    public final u3.b i() {
        u3.b bVar = this.f27875v;
        if (bVar != null) {
            return bVar;
        }
        i.q("amplitude");
        throw null;
    }

    public final o3.a j() {
        return (o3.a) i();
    }
}
