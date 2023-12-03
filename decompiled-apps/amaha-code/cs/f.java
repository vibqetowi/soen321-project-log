package cs;

import com.google.common.collect.o;
import com.google.common.collect.s;
import io.grpc.a;
import io.grpc.c;
import io.grpc.h;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import tr.i0;
import tr.k;
import tr.k0;
import tr.l0;
import vr.b3;
import vr.j3;
/* compiled from: OutlierDetectionLoadBalancer.java */
/* loaded from: classes2.dex */
public final class f extends io.grpc.h {

    /* renamed from: j  reason: collision with root package name */
    public static final a.b<a> f11952j = new a.b<>("addressTrackerKey");

    /* renamed from: c  reason: collision with root package name */
    public final b f11953c;

    /* renamed from: d  reason: collision with root package name */
    public final l0 f11954d;

    /* renamed from: e  reason: collision with root package name */
    public final cs.d f11955e;
    public final j3 f;

    /* renamed from: g  reason: collision with root package name */
    public final ScheduledExecutorService f11956g;

    /* renamed from: h  reason: collision with root package name */
    public l0.b f11957h;

    /* renamed from: i  reason: collision with root package name */
    public Long f11958i;

    /* compiled from: OutlierDetectionLoadBalancer.java */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public C0178f f11959a;

        /* renamed from: d  reason: collision with root package name */
        public Long f11962d;

        /* renamed from: e  reason: collision with root package name */
        public int f11963e;

        /* renamed from: b  reason: collision with root package name */
        public volatile C0177a f11960b = new C0177a();

        /* renamed from: c  reason: collision with root package name */
        public C0177a f11961c = new C0177a();
        public final HashSet f = new HashSet();

        /* compiled from: OutlierDetectionLoadBalancer.java */
        /* renamed from: cs.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static class C0177a {

            /* renamed from: a  reason: collision with root package name */
            public final AtomicLong f11964a = new AtomicLong();

            /* renamed from: b  reason: collision with root package name */
            public final AtomicLong f11965b = new AtomicLong();
        }

        public a(C0178f c0178f) {
            this.f11959a = c0178f;
        }

        public final void a(h hVar) {
            if (d() && !hVar.f11991c) {
                hVar.f11991c = true;
                h.i iVar = hVar.f11993e;
                i0 i0Var = i0.f33488m;
                sc.b.s("The error status must not be OK", true ^ i0Var.e());
                iVar.a(new k(tr.j.TRANSIENT_FAILURE, i0Var));
            } else if (!d() && hVar.f11991c) {
                hVar.f11991c = false;
                k kVar = hVar.f11992d;
                if (kVar != null) {
                    hVar.f11993e.a(kVar);
                }
            }
            hVar.f11990b = this;
            this.f.add(hVar);
        }

        public final void b(long j10) {
            this.f11962d = Long.valueOf(j10);
            this.f11963e++;
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                h hVar = (h) it.next();
                hVar.f11991c = true;
                h.i iVar = hVar.f11993e;
                i0 i0Var = i0.f33488m;
                sc.b.s("The error status must not be OK", !i0Var.e());
                iVar.a(new k(tr.j.TRANSIENT_FAILURE, i0Var));
            }
        }

        public final long c() {
            return this.f11961c.f11965b.get() + this.f11961c.f11964a.get();
        }

        public final boolean d() {
            if (this.f11962d != null) {
                return true;
            }
            return false;
        }

        public final void e() {
            boolean z10;
            if (this.f11962d != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            sc.b.B("not currently ejected", z10);
            this.f11962d = null;
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                h hVar = (h) it.next();
                hVar.f11991c = false;
                k kVar = hVar.f11992d;
                if (kVar != null) {
                    hVar.f11993e.a(kVar);
                }
            }
        }
    }

    /* compiled from: OutlierDetectionLoadBalancer.java */
    /* loaded from: classes2.dex */
    public static class b extends o<SocketAddress, a> {

        /* renamed from: u  reason: collision with root package name */
        public final HashMap f11966u = new HashMap();

        @Override // com.google.common.collect.p
        public final Object a() {
            return this.f11966u;
        }

        @Override // com.google.common.collect.o
        public final Map<SocketAddress, a> b() {
            return this.f11966u;
        }

        public final double c() {
            HashMap hashMap = this.f11966u;
            if (hashMap.isEmpty()) {
                return 0.0d;
            }
            int i6 = 0;
            int i10 = 0;
            for (a aVar : hashMap.values()) {
                i10++;
                if (aVar.d()) {
                    i6++;
                }
            }
            return (i6 / i10) * 100.0d;
        }
    }

    /* compiled from: OutlierDetectionLoadBalancer.java */
    /* loaded from: classes2.dex */
    public class c extends cs.b {

        /* renamed from: a  reason: collision with root package name */
        public final h.c f11967a;

        public c(h.c cVar) {
            this.f11967a = cVar;
        }

        @Override // cs.b, io.grpc.h.c
        public final h.g a(h.a aVar) {
            h.g a10 = this.f11967a.a(aVar);
            f fVar = f.this;
            h hVar = new h(a10);
            List<io.grpc.d> list = aVar.f20464a;
            if (f.g(list) && fVar.f11953c.containsKey(list.get(0).f20452a.get(0))) {
                a aVar2 = fVar.f11953c.get(list.get(0).f20452a.get(0));
                aVar2.a(hVar);
                if (aVar2.f11962d != null) {
                    hVar.f11991c = true;
                    h.i iVar = hVar.f11993e;
                    i0 i0Var = i0.f33488m;
                    sc.b.s("The error status must not be OK", true ^ i0Var.e());
                    iVar.a(new k(tr.j.TRANSIENT_FAILURE, i0Var));
                }
            }
            return hVar;
        }

        @Override // io.grpc.h.c
        public final void f(tr.j jVar, h.AbstractC0310h abstractC0310h) {
            this.f11967a.f(jVar, new g(abstractC0310h));
        }

        @Override // cs.b
        public final h.c g() {
            return this.f11967a;
        }
    }

    /* compiled from: OutlierDetectionLoadBalancer.java */
    /* loaded from: classes2.dex */
    public class d implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final C0178f f11969u;

        public d(C0178f c0178f) {
            this.f11969u = c0178f;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z10;
            f fVar = f.this;
            fVar.f11958i = Long.valueOf(fVar.f.a());
            for (a aVar : f.this.f11953c.f11966u.values()) {
                a.C0177a c0177a = aVar.f11961c;
                c0177a.f11964a.set(0L);
                c0177a.f11965b.set(0L);
                a.C0177a c0177a2 = aVar.f11960b;
                aVar.f11960b = aVar.f11961c;
                aVar.f11961c = c0177a2;
            }
            C0178f c0178f = this.f11969u;
            s.b bVar = s.f9446v;
            s.a aVar2 = new s.a();
            if (c0178f.f11976e != null) {
                aVar2.b(new j(c0178f));
            }
            if (c0178f.f != null) {
                aVar2.b(new e(c0178f));
            }
            s.b listIterator = aVar2.c().listIterator(0);
            while (listIterator.hasNext()) {
                f fVar2 = f.this;
                ((i) listIterator.next()).a(fVar2.f11953c, fVar2.f11958i.longValue());
            }
            f fVar3 = f.this;
            b bVar2 = fVar3.f11953c;
            Long l2 = fVar3.f11958i;
            for (a aVar3 : bVar2.f11966u.values()) {
                if (!aVar3.d()) {
                    int i6 = aVar3.f11963e;
                    aVar3.f11963e = i6 == 0 ? 0 : i6 - 1;
                }
                if (aVar3.d()) {
                    if (l2.longValue() > Math.min(aVar3.f11959a.f11973b.longValue() * aVar3.f11963e, Math.max(aVar3.f11959a.f11973b.longValue(), aVar3.f11959a.f11974c.longValue())) + aVar3.f11962d.longValue()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        aVar3.e();
                    }
                }
            }
        }
    }

    /* compiled from: OutlierDetectionLoadBalancer.java */
    /* loaded from: classes2.dex */
    public static class e implements i {

        /* renamed from: a  reason: collision with root package name */
        public final C0178f f11971a;

        public e(C0178f c0178f) {
            this.f11971a = c0178f;
        }

        @Override // cs.f.i
        public final void a(b bVar, long j10) {
            C0178f c0178f = this.f11971a;
            ArrayList h10 = f.h(bVar, c0178f.f.f11981d.intValue());
            int size = h10.size();
            C0178f.a aVar = c0178f.f;
            if (size >= aVar.f11980c.intValue() && h10.size() != 0) {
                Iterator it = h10.iterator();
                while (it.hasNext()) {
                    a aVar2 = (a) it.next();
                    if (bVar.c() >= c0178f.f11975d.intValue()) {
                        return;
                    }
                    if (aVar2.c() >= aVar.f11981d.intValue()) {
                        if (aVar2.f11961c.f11965b.get() / aVar2.c() > aVar.f11978a.intValue() / 100.0d && new Random().nextInt(100) < aVar.f11979b.intValue()) {
                            aVar2.b(j10);
                        }
                    }
                }
            }
        }
    }

    /* compiled from: OutlierDetectionLoadBalancer.java */
    /* renamed from: cs.f$f  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0178f {

        /* renamed from: a  reason: collision with root package name */
        public final Long f11972a;

        /* renamed from: b  reason: collision with root package name */
        public final Long f11973b;

        /* renamed from: c  reason: collision with root package name */
        public final Long f11974c;

        /* renamed from: d  reason: collision with root package name */
        public final Integer f11975d;

        /* renamed from: e  reason: collision with root package name */
        public final b f11976e;
        public final a f;

        /* renamed from: g  reason: collision with root package name */
        public final b3.b f11977g;

        /* compiled from: OutlierDetectionLoadBalancer.java */
        /* renamed from: cs.f$f$a */
        /* loaded from: classes2.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public final Integer f11978a;

            /* renamed from: b  reason: collision with root package name */
            public final Integer f11979b;

            /* renamed from: c  reason: collision with root package name */
            public final Integer f11980c;

            /* renamed from: d  reason: collision with root package name */
            public final Integer f11981d;

            public a(Integer num, Integer num2, Integer num3, Integer num4) {
                this.f11978a = num;
                this.f11979b = num2;
                this.f11980c = num3;
                this.f11981d = num4;
            }
        }

        /* compiled from: OutlierDetectionLoadBalancer.java */
        /* renamed from: cs.f$f$b */
        /* loaded from: classes2.dex */
        public static class b {

            /* renamed from: a  reason: collision with root package name */
            public final Integer f11982a;

            /* renamed from: b  reason: collision with root package name */
            public final Integer f11983b;

            /* renamed from: c  reason: collision with root package name */
            public final Integer f11984c;

            /* renamed from: d  reason: collision with root package name */
            public final Integer f11985d;

            public b(Integer num, Integer num2, Integer num3, Integer num4) {
                this.f11982a = num;
                this.f11983b = num2;
                this.f11984c = num3;
                this.f11985d = num4;
            }
        }

        public C0178f(Long l2, Long l10, Long l11, Integer num, b bVar, a aVar, b3.b bVar2) {
            this.f11972a = l2;
            this.f11973b = l10;
            this.f11974c = l11;
            this.f11975d = num;
            this.f11976e = bVar;
            this.f = aVar;
            this.f11977g = bVar2;
        }
    }

    /* compiled from: OutlierDetectionLoadBalancer.java */
    /* loaded from: classes2.dex */
    public class g extends h.AbstractC0310h {

        /* renamed from: a  reason: collision with root package name */
        public final h.AbstractC0310h f11986a;

        /* compiled from: OutlierDetectionLoadBalancer.java */
        /* loaded from: classes2.dex */
        public class a extends io.grpc.c {

            /* renamed from: v  reason: collision with root package name */
            public final a f11987v;

            public a(a aVar) {
                this.f11987v = aVar;
            }

            @Override // com.android.volley.toolbox.a
            public final void s(i0 i0Var) {
                a aVar = this.f11987v;
                boolean e10 = i0Var.e();
                C0178f c0178f = aVar.f11959a;
                if (c0178f.f11976e != null || c0178f.f != null) {
                    if (e10) {
                        aVar.f11960b.f11964a.getAndIncrement();
                    } else {
                        aVar.f11960b.f11965b.getAndIncrement();
                    }
                }
            }
        }

        /* compiled from: OutlierDetectionLoadBalancer.java */
        /* loaded from: classes2.dex */
        public class b extends c.a {

            /* renamed from: a  reason: collision with root package name */
            public final a f11988a;

            public b(g gVar, a aVar) {
                this.f11988a = aVar;
            }

            @Override // io.grpc.c.a
            public final io.grpc.c a() {
                return new a(this.f11988a);
            }
        }

        public g(h.AbstractC0310h abstractC0310h) {
            this.f11986a = abstractC0310h;
        }

        @Override // io.grpc.h.AbstractC0310h
        public final h.d a(h.e eVar) {
            h.d a10 = this.f11986a.a(eVar);
            h.g gVar = a10.f20471a;
            if (gVar != null) {
                io.grpc.a c10 = gVar.c();
                return h.d.b(gVar, new b(this, (a) c10.f20427a.get(f.f11952j)));
            }
            return a10;
        }
    }

    /* compiled from: OutlierDetectionLoadBalancer.java */
    /* loaded from: classes2.dex */
    public class h extends cs.c {

        /* renamed from: a  reason: collision with root package name */
        public final h.g f11989a;

        /* renamed from: b  reason: collision with root package name */
        public a f11990b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f11991c;

        /* renamed from: d  reason: collision with root package name */
        public k f11992d;

        /* renamed from: e  reason: collision with root package name */
        public h.i f11993e;

        /* compiled from: OutlierDetectionLoadBalancer.java */
        /* loaded from: classes2.dex */
        public class a implements h.i {

            /* renamed from: a  reason: collision with root package name */
            public final h.i f11994a;

            public a(h.i iVar) {
                this.f11994a = iVar;
            }

            @Override // io.grpc.h.i
            public final void a(k kVar) {
                h hVar = h.this;
                hVar.f11992d = kVar;
                if (!hVar.f11991c) {
                    this.f11994a.a(kVar);
                }
            }
        }

        public h(h.g gVar) {
            this.f11989a = gVar;
        }

        @Override // io.grpc.h.g
        public final io.grpc.a c() {
            a aVar = this.f11990b;
            h.g gVar = this.f11989a;
            if (aVar != null) {
                io.grpc.a c10 = gVar.c();
                c10.getClass();
                a.b<a> bVar = f.f11952j;
                a aVar2 = this.f11990b;
                IdentityHashMap identityHashMap = new IdentityHashMap(1);
                identityHashMap.put(bVar, aVar2);
                for (Map.Entry<a.b<?>, Object> entry : c10.f20427a.entrySet()) {
                    if (!identityHashMap.containsKey(entry.getKey())) {
                        identityHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                return new io.grpc.a(identityHashMap);
            }
            return gVar.c();
        }

        @Override // io.grpc.h.g
        public final void g(h.i iVar) {
            this.f11993e = iVar;
            this.f11989a.g(new a(iVar));
        }

        @Override // io.grpc.h.g
        public final void h(List<io.grpc.d> list) {
            boolean g5 = f.g(b());
            f fVar = f.this;
            if (g5 && f.g(list)) {
                if (fVar.f11953c.containsValue(this.f11990b)) {
                    a aVar = this.f11990b;
                    aVar.getClass();
                    this.f11990b = null;
                    aVar.f.remove(this);
                }
                SocketAddress socketAddress = list.get(0).f20452a.get(0);
                if (fVar.f11953c.containsKey(socketAddress)) {
                    fVar.f11953c.get(socketAddress).a(this);
                }
            } else if (f.g(b()) && !f.g(list)) {
                if (fVar.f11953c.containsKey(a().f20452a.get(0))) {
                    a aVar2 = fVar.f11953c.get(a().f20452a.get(0));
                    aVar2.getClass();
                    this.f11990b = null;
                    aVar2.f.remove(this);
                    a.C0177a c0177a = aVar2.f11960b;
                    c0177a.f11964a.set(0L);
                    c0177a.f11965b.set(0L);
                    a.C0177a c0177a2 = aVar2.f11961c;
                    c0177a2.f11964a.set(0L);
                    c0177a2.f11965b.set(0L);
                }
            } else if (!f.g(b()) && f.g(list)) {
                SocketAddress socketAddress2 = list.get(0).f20452a.get(0);
                if (fVar.f11953c.containsKey(socketAddress2)) {
                    fVar.f11953c.get(socketAddress2).a(this);
                }
            }
            this.f11989a.h(list);
        }
    }

    /* compiled from: OutlierDetectionLoadBalancer.java */
    /* loaded from: classes2.dex */
    public interface i {
        void a(b bVar, long j10);
    }

    /* compiled from: OutlierDetectionLoadBalancer.java */
    /* loaded from: classes2.dex */
    public static class j implements i {

        /* renamed from: a  reason: collision with root package name */
        public final C0178f f11996a;

        public j(C0178f c0178f) {
            boolean z10;
            if (c0178f.f11976e != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            sc.b.s("success rate ejection config is null", z10);
            this.f11996a = c0178f;
        }

        @Override // cs.f.i
        public final void a(b bVar, long j10) {
            C0178f c0178f = this.f11996a;
            ArrayList h10 = f.h(bVar, c0178f.f11976e.f11985d.intValue());
            int size = h10.size();
            C0178f.b bVar2 = c0178f.f11976e;
            if (size >= bVar2.f11984c.intValue() && h10.size() != 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = h10.iterator();
                while (it.hasNext()) {
                    a aVar = (a) it.next();
                    arrayList.add(Double.valueOf(aVar.f11961c.f11964a.get() / aVar.c()));
                }
                Iterator it2 = arrayList.iterator();
                double d10 = 0.0d;
                double d11 = 0.0d;
                while (it2.hasNext()) {
                    d11 += ((Double) it2.next()).doubleValue();
                }
                double size2 = d11 / arrayList.size();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    double doubleValue = ((Double) it3.next()).doubleValue() - size2;
                    d10 += doubleValue * doubleValue;
                }
                double sqrt = size2 - (Math.sqrt(d10 / arrayList.size()) * (bVar2.f11982a.intValue() / 1000.0f));
                Iterator it4 = h10.iterator();
                while (it4.hasNext()) {
                    a aVar2 = (a) it4.next();
                    if (bVar.c() >= c0178f.f11975d.intValue()) {
                        return;
                    }
                    if (aVar2.f11961c.f11964a.get() / aVar2.c() < sqrt && new Random().nextInt(100) < bVar2.f11983b.intValue()) {
                        aVar2.b(j10);
                    }
                }
            }
        }
    }

    public f(h.c cVar) {
        j3.a aVar = j3.f35738a;
        sc.b.w(cVar, "helper");
        this.f11955e = new cs.d(new c(cVar));
        this.f11953c = new b();
        l0 d10 = cVar.d();
        sc.b.w(d10, "syncContext");
        this.f11954d = d10;
        ScheduledExecutorService c10 = cVar.c();
        sc.b.w(c10, "timeService");
        this.f11956g = c10;
        this.f = aVar;
    }

    public static boolean g(List list) {
        Iterator it = list.iterator();
        int i6 = 0;
        while (it.hasNext()) {
            i6 += ((io.grpc.d) it.next()).f20452a.size();
            if (i6 > 1) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList h(b bVar, int i6) {
        ArrayList arrayList = new ArrayList();
        for (a aVar : bVar.values()) {
            if (aVar.c() >= i6) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    @Override // io.grpc.h
    public final boolean a(h.f fVar) {
        boolean z10;
        Long valueOf;
        C0178f c0178f = (C0178f) fVar.f20477c;
        ArrayList arrayList = new ArrayList();
        List<io.grpc.d> list = fVar.f20475a;
        for (io.grpc.d dVar : list) {
            arrayList.addAll(dVar.f20452a);
        }
        b bVar = this.f11953c;
        bVar.keySet().retainAll(arrayList);
        for (a aVar : bVar.f11966u.values()) {
            aVar.f11959a = c0178f;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            SocketAddress socketAddress = (SocketAddress) it.next();
            HashMap hashMap = bVar.f11966u;
            if (!hashMap.containsKey(socketAddress)) {
                hashMap.put(socketAddress, new a(c0178f));
            }
        }
        io.grpc.i iVar = c0178f.f11977g.f35407a;
        cs.d dVar2 = this.f11955e;
        dVar2.getClass();
        sc.b.w(iVar, "newBalancerFactory");
        if (!iVar.equals(dVar2.f11943g)) {
            dVar2.f11944h.f();
            dVar2.f11944h = dVar2.f11940c;
            dVar2.f11943g = null;
            dVar2.f11945i = tr.j.CONNECTING;
            dVar2.f11946j = cs.d.f11939l;
            if (!iVar.equals(dVar2.f11942e)) {
                cs.e eVar = new cs.e(dVar2);
                io.grpc.h a10 = iVar.a(eVar);
                eVar.f11950a = a10;
                dVar2.f11944h = a10;
                dVar2.f11943g = iVar;
                if (!dVar2.f11947k) {
                    dVar2.g();
                }
            }
        }
        if (c0178f.f11976e == null && c0178f.f == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            Long l2 = this.f11958i;
            Long l10 = c0178f.f11972a;
            if (l2 == null) {
                valueOf = l10;
            } else {
                valueOf = Long.valueOf(Math.max(0L, l10.longValue() - (this.f.a() - this.f11958i.longValue())));
            }
            l0.b bVar2 = this.f11957h;
            if (bVar2 != null) {
                bVar2.a();
                for (a aVar2 : bVar.f11966u.values()) {
                    a.C0177a c0177a = aVar2.f11960b;
                    c0177a.f11964a.set(0L);
                    c0177a.f11965b.set(0L);
                    a.C0177a c0177a2 = aVar2.f11961c;
                    c0177a2.f11964a.set(0L);
                    c0177a2.f11965b.set(0L);
                }
            }
            d dVar3 = new d(c0178f);
            long longValue = valueOf.longValue();
            long longValue2 = l10.longValue();
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            ScheduledExecutorService scheduledExecutorService = this.f11956g;
            l0 l0Var = this.f11954d;
            l0Var.getClass();
            l0.a aVar3 = new l0.a(dVar3);
            this.f11957h = new l0.b(aVar3, scheduledExecutorService.scheduleWithFixedDelay(new k0(l0Var, aVar3, dVar3, longValue2), longValue, longValue2, timeUnit));
        } else {
            l0.b bVar3 = this.f11957h;
            if (bVar3 != null) {
                bVar3.a();
                this.f11958i = null;
                for (a aVar4 : bVar.f11966u.values()) {
                    if (aVar4.d()) {
                        aVar4.e();
                    }
                    aVar4.f11963e = 0;
                }
            }
        }
        io.grpc.a aVar5 = io.grpc.a.f20426b;
        dVar2.d(new h.f(list, fVar.f20476b, c0178f.f11977g.f35408b));
        return true;
    }

    @Override // io.grpc.h
    public final void c(i0 i0Var) {
        this.f11955e.c(i0Var);
    }

    @Override // io.grpc.h
    public final void f() {
        this.f11955e.f();
    }
}
