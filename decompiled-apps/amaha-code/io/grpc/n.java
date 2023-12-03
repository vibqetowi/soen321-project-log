package io.grpc;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.common.collect.m0;
import com.google.common.collect.t;
import io.grpc.l;
import io.grpc.p;
import java.net.URI;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.logging.Logger;
/* compiled from: NameResolverRegistry.java */
/* loaded from: classes2.dex */
public final class n {

    /* renamed from: e  reason: collision with root package name */
    public static final Logger f20496e = Logger.getLogger(n.class.getName());
    public static n f;

    /* renamed from: a  reason: collision with root package name */
    public final a f20497a = new a();

    /* renamed from: b  reason: collision with root package name */
    public String f20498b = "unknown";

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashSet<m> f20499c = new LinkedHashSet<>();

    /* renamed from: d  reason: collision with root package name */
    public t<String, m> f20500d = m0.A;

    /* compiled from: NameResolverRegistry.java */
    /* loaded from: classes2.dex */
    public final class a extends l.c {
        public a() {
        }

        @Override // io.grpc.l.c
        public final String a() {
            String str;
            synchronized (n.this) {
                str = n.this.f20498b;
            }
            return str;
        }

        @Override // io.grpc.l.c
        public final l b(URI uri, l.a aVar) {
            t<String, m> tVar;
            n nVar = n.this;
            synchronized (nVar) {
                tVar = nVar.f20500d;
            }
            m mVar = (m) ((m0) tVar).get(uri.getScheme());
            if (mVar == null) {
                return null;
            }
            return mVar.b(uri, aVar);
        }
    }

    /* compiled from: NameResolverRegistry.java */
    /* loaded from: classes2.dex */
    public static final class b implements p.a<m> {
        @Override // io.grpc.p.a
        public final boolean a(m mVar) {
            return mVar.c();
        }

        @Override // io.grpc.p.a
        public final int b(m mVar) {
            return mVar.d();
        }
    }

    public final synchronized void a(m mVar) {
        sc.b.s("isAvailable() returned false", mVar.c());
        this.f20499c.add(mVar);
    }

    public final synchronized void b() {
        HashMap hashMap = new HashMap();
        String str = "unknown";
        Iterator<m> it = this.f20499c.iterator();
        int i6 = LinearLayoutManager.INVALID_OFFSET;
        while (it.hasNext()) {
            m next = it.next();
            String a10 = next.a();
            m mVar = (m) hashMap.get(a10);
            if (mVar == null || mVar.d() < next.d()) {
                hashMap.put(a10, next);
            }
            if (i6 < next.d()) {
                i6 = next.d();
                str = next.a();
            }
        }
        this.f20500d = t.a(hashMap);
        this.f20498b = str;
    }
}
