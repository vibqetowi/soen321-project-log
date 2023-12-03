package b9;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: BandwidthMeter.java */
/* loaded from: classes.dex */
public interface b {

    /* compiled from: BandwidthMeter.java */
    /* loaded from: classes.dex */
    public interface a {

        /* compiled from: BandwidthMeter.java */
        /* renamed from: b9.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0079a {

            /* renamed from: a  reason: collision with root package name */
            public final CopyOnWriteArrayList<C0080a> f4111a = new CopyOnWriteArrayList<>();

            /* compiled from: BandwidthMeter.java */
            /* renamed from: b9.b$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0080a {

                /* renamed from: a  reason: collision with root package name */
                public final Handler f4112a;

                /* renamed from: b  reason: collision with root package name */
                public final a f4113b;

                /* renamed from: c  reason: collision with root package name */
                public boolean f4114c;

                public C0080a(Handler handler, a aVar) {
                    this.f4112a = handler;
                    this.f4113b = aVar;
                }
            }

            public final void a(a aVar) {
                CopyOnWriteArrayList<C0080a> copyOnWriteArrayList = this.f4111a;
                Iterator<C0080a> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    C0080a next = it.next();
                    if (next.f4113b == aVar) {
                        next.f4114c = true;
                        copyOnWriteArrayList.remove(next);
                    }
                }
            }
        }
    }

    void c(Handler handler, a aVar);

    k d();

    void e(p7.n nVar);
}
