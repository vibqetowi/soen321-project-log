package io.grpc;

import io.grpc.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import vr.o2;
/* compiled from: LoadBalancerRegistry.java */
/* loaded from: classes2.dex */
public final class j {

    /* renamed from: c  reason: collision with root package name */
    public static final Logger f20479c;

    /* renamed from: d  reason: collision with root package name */
    public static j f20480d;

    /* renamed from: e  reason: collision with root package name */
    public static final List f20481e;

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashSet<i> f20482a = new LinkedHashSet<>();

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashMap<String, i> f20483b = new LinkedHashMap<>();

    /* compiled from: LoadBalancerRegistry.java */
    /* loaded from: classes2.dex */
    public static final class a implements p.a<i> {
        @Override // io.grpc.p.a
        public final boolean a(i iVar) {
            return iVar.d();
        }

        @Override // io.grpc.p.a
        public final int b(i iVar) {
            return iVar.c();
        }
    }

    static {
        Logger logger = Logger.getLogger(j.class.getName());
        f20479c = logger;
        ArrayList arrayList = new ArrayList();
        try {
            int i6 = o2.f35806b;
            arrayList.add(o2.class);
        } catch (ClassNotFoundException e10) {
            logger.log(Level.WARNING, "Unable to find pick-first LoadBalancer", (Throwable) e10);
        }
        try {
            int i10 = cs.i.f12010b;
            arrayList.add(cs.i.class);
        } catch (ClassNotFoundException e11) {
            logger.log(Level.FINE, "Unable to find round-robin LoadBalancer", (Throwable) e11);
        }
        f20481e = Collections.unmodifiableList(arrayList);
    }

    public static synchronized j b() {
        j jVar;
        synchronized (j.class) {
            if (f20480d == null) {
                List<i> a10 = p.a(i.class, f20481e, i.class.getClassLoader(), new a());
                f20480d = new j();
                for (i iVar : a10) {
                    Logger logger = f20479c;
                    logger.fine("Service loader found " + iVar);
                    f20480d.a(iVar);
                }
                f20480d.d();
            }
            jVar = f20480d;
        }
        return jVar;
    }

    public final synchronized void a(i iVar) {
        sc.b.s("isAvailable() returned false", iVar.d());
        this.f20482a.add(iVar);
    }

    public final synchronized i c(String str) {
        LinkedHashMap<String, i> linkedHashMap;
        linkedHashMap = this.f20483b;
        sc.b.w(str, "policy");
        return linkedHashMap.get(str);
    }

    public final synchronized void d() {
        this.f20483b.clear();
        Iterator<i> it = this.f20482a.iterator();
        while (it.hasNext()) {
            i next = it.next();
            String b10 = next.b();
            i iVar = this.f20483b.get(b10);
            if (iVar == null || iVar.c() < next.c()) {
                this.f20483b.put(b10, next);
            }
        }
    }
}
