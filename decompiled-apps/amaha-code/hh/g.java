package hh;

import hs.k;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.i;
import ni.r;
/* compiled from: Logger.kt */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: d */
    public static final hh.a f17610d;

    /* renamed from: a */
    public final String f17611a = "MoEngage";

    /* renamed from: b */
    public final String f17612b;

    /* renamed from: c */
    public final Set<c> f17613c;

    /* compiled from: Logger.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static void a(int i6, Throwable th2, ss.a message) {
            i.g(message, "message");
            hh.a aVar = g.f17610d;
            aVar.getClass();
            try {
                for (c cVar : aVar.f17604a) {
                    if (cVar.b(i6)) {
                        cVar.a(i6, "MoEngage", "", (String) message.invoke(), th2);
                    }
                }
            } catch (Exception unused) {
            }
        }

        public static /* synthetic */ void b(int i6, ss.a aVar, int i10) {
            if ((i10 & 1) != 0) {
                i6 = 5;
            }
            a(i6, null, aVar);
        }
    }

    static {
        new a();
        hh.a aVar = new hh.a(0);
        f17610d = aVar;
        try {
            aVar.f17604a.add(new b());
        } catch (Exception unused) {
        }
    }

    public g(String str, Set set) {
        this.f17612b = str;
        Set<c> synchronizedSet = Collections.synchronizedSet(new LinkedHashSet());
        this.f17613c = synchronizedSet;
        synchronizedSet.addAll(set);
    }

    public static /* synthetic */ void b(g gVar, int i6, ss.a aVar, int i10) {
        if ((i10 & 1) != 0) {
            i6 = 5;
        }
        gVar.a(i6, null, aVar);
    }

    public static final void c(r rVar) {
        a.b(0, rVar, 3);
    }

    public final void a(int i6, Throwable th2, ss.a<String> message) {
        i.g(message, "message");
        try {
            Set<c> adapters = this.f17613c;
            i.f(adapters, "adapters");
            synchronized (adapters) {
                for (c cVar : this.f17613c) {
                    if (cVar.b(i6)) {
                        cVar.a(i6, this.f17611a, this.f17612b, message.invoke(), th2);
                    }
                }
                k kVar = k.f19476a;
            }
        } catch (Exception unused) {
        }
    }
}
