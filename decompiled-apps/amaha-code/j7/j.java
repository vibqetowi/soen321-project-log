package j7;

import android.content.Context;
import d7.h;
import d7.p;
import d7.s;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;
import l7.a;
/* compiled from: Uploader.java */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final Context f21724a;

    /* renamed from: b  reason: collision with root package name */
    public final e7.e f21725b;

    /* renamed from: c  reason: collision with root package name */
    public final k7.d f21726c;

    /* renamed from: d  reason: collision with root package name */
    public final m f21727d;

    /* renamed from: e  reason: collision with root package name */
    public final Executor f21728e;
    public final l7.a f;

    /* renamed from: g  reason: collision with root package name */
    public final m7.a f21729g;

    /* renamed from: h  reason: collision with root package name */
    public final m7.a f21730h;

    /* renamed from: i  reason: collision with root package name */
    public final k7.c f21731i;

    public j(Context context, e7.e eVar, k7.d dVar, m mVar, Executor executor, l7.a aVar, m7.a aVar2, m7.a aVar3, k7.c cVar) {
        this.f21724a = context;
        this.f21725b = eVar;
        this.f21726c = dVar;
        this.f21727d = mVar;
        this.f21728e = executor;
        this.f = aVar;
        this.f21729g = aVar2;
        this.f21730h = aVar3;
        this.f21731i = cVar;
    }

    public final void a(final s sVar, int i6) {
        boolean z10;
        e7.b a10;
        e7.l a11 = this.f21725b.a(sVar.b());
        new e7.b(1, 0L);
        long j10 = 0;
        while (true) {
            boolean z11 = false;
            a.InterfaceC0377a interfaceC0377a = new a.InterfaceC0377a(this) { // from class: j7.g

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ j f21714v;

                {
                    this.f21714v = this;
                }

                @Override // l7.a.InterfaceC0377a
                public final Object g() {
                    int i10 = r3;
                    s sVar2 = sVar;
                    j jVar = this.f21714v;
                    switch (i10) {
                        case 0:
                            return Boolean.valueOf(jVar.f21726c.x(sVar2));
                        default:
                            return jVar.f21726c.H0(sVar2);
                    }
                }
            };
            l7.a aVar = this.f;
            if (((Boolean) aVar.e(interfaceC0377a)).booleanValue()) {
                Iterable<k7.i> iterable = (Iterable) aVar.e(new a.InterfaceC0377a(this) { // from class: j7.g

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ j f21714v;

                    {
                        this.f21714v = this;
                    }

                    @Override // l7.a.InterfaceC0377a
                    public final Object g() {
                        int i10 = r3;
                        s sVar2 = sVar;
                        j jVar = this.f21714v;
                        switch (i10) {
                            case 0:
                                return Boolean.valueOf(jVar.f21726c.x(sVar2));
                            default:
                                return jVar.f21726c.H0(sVar2);
                        }
                    }
                });
                if (!iterable.iterator().hasNext()) {
                    return;
                }
                if (a11 == null) {
                    h7.a.a("Uploader", "Unknown backend for %s, deleting event batch for it...", sVar);
                    a10 = new e7.b(3, -1L);
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (k7.i iVar : iterable) {
                        arrayList.add(iVar.a());
                    }
                    if (sVar.c() != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        k7.c cVar = this.f21731i;
                        Objects.requireNonNull(cVar);
                        g7.a aVar2 = (g7.a) aVar.e(new f0.b(10, cVar));
                        h.a aVar3 = new h.a();
                        aVar3.f = new HashMap();
                        aVar3.f12234d = Long.valueOf(this.f21729g.a());
                        aVar3.f12235e = Long.valueOf(this.f21730h.a());
                        aVar3.d("GDT_CLIENT_METRICS");
                        a7.b bVar = new a7.b("proto");
                        aVar2.getClass();
                        de.f fVar = p.f12256a;
                        fVar.getClass();
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            fVar.a(aVar2, byteArrayOutputStream);
                        } catch (IOException unused) {
                        }
                        aVar3.c(new d7.m(bVar, byteArrayOutputStream.toByteArray()));
                        arrayList.add(a11.b(aVar3.b()));
                    }
                    a10 = a11.a(new e7.a(arrayList, sVar.c()));
                }
                if (a10.f13812a == 2) {
                    aVar.e(new h(this, iterable, sVar, j10));
                    this.f21727d.b(sVar, i6 + 1, true);
                    return;
                }
                aVar.e(new dd.a(this, 5, iterable));
                int i10 = a10.f13812a;
                if (i10 == 1) {
                    j10 = Math.max(j10, a10.f13813b);
                    if (sVar.c() != null) {
                        z11 = true;
                    }
                    if (z11) {
                        aVar.e(new f0.b(9, this));
                    }
                } else if (i10 == 4) {
                    HashMap hashMap = new HashMap();
                    for (k7.i iVar2 : iterable) {
                        String g5 = iVar2.a().g();
                        if (!hashMap.containsKey(g5)) {
                            hashMap.put(g5, 1);
                        } else {
                            hashMap.put(g5, Integer.valueOf(((Integer) hashMap.get(g5)).intValue() + 1));
                        }
                    }
                    aVar.e(new dd.a(this, 6, hashMap));
                }
            } else {
                aVar.e(new i(j10, this, sVar));
                return;
            }
        }
    }
}
