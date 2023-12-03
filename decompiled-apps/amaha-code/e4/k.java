package e4;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: RequestQueue.java */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicInteger f13778a;

    /* renamed from: b  reason: collision with root package name */
    public final HashSet f13779b;

    /* renamed from: c  reason: collision with root package name */
    public final PriorityBlockingQueue<j<?>> f13780c;

    /* renamed from: d  reason: collision with root package name */
    public final PriorityBlockingQueue<j<?>> f13781d;

    /* renamed from: e  reason: collision with root package name */
    public final e4.a f13782e;
    public final g f;

    /* renamed from: g  reason: collision with root package name */
    public final m f13783g;

    /* renamed from: h  reason: collision with root package name */
    public final h[] f13784h;

    /* renamed from: i  reason: collision with root package name */
    public c f13785i;

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList f13786j;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f13787k;

    /* compiled from: RequestQueue.java */
    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    /* compiled from: RequestQueue.java */
    @Deprecated
    /* loaded from: classes.dex */
    public interface b<T> {
        void a();
    }

    public k(com.android.volley.toolbox.d dVar, com.android.volley.toolbox.b bVar) {
        e eVar = new e(new Handler(Looper.getMainLooper()));
        this.f13778a = new AtomicInteger();
        this.f13779b = new HashSet();
        this.f13780c = new PriorityBlockingQueue<>();
        this.f13781d = new PriorityBlockingQueue<>();
        this.f13786j = new ArrayList();
        this.f13787k = new ArrayList();
        this.f13782e = dVar;
        this.f = bVar;
        this.f13784h = new h[4];
        this.f13783g = eVar;
    }

    public final void a(j<?> jVar, int i6) {
        synchronized (this.f13787k) {
            Iterator it = this.f13787k.iterator();
            while (it.hasNext()) {
                ((a) it.next()).a();
            }
        }
    }
}
