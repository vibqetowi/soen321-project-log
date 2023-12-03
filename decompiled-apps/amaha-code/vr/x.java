package vr;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
/* compiled from: ConnectivityStateManager.java */
/* loaded from: classes2.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<a> f36109a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public volatile tr.j f36110b = tr.j.IDLE;

    /* compiled from: ConnectivityStateManager.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Runnable f36111a;

        /* renamed from: b  reason: collision with root package name */
        public final Executor f36112b;

        public a(Runnable runnable, Executor executor) {
            this.f36111a = runnable;
            this.f36112b = executor;
        }
    }

    public final void a(tr.j jVar) {
        sc.b.w(jVar, "newState");
        if (this.f36110b != jVar && this.f36110b != tr.j.SHUTDOWN) {
            this.f36110b = jVar;
            if (this.f36109a.isEmpty()) {
                return;
            }
            ArrayList<a> arrayList = this.f36109a;
            this.f36109a = new ArrayList<>();
            Iterator<a> it = arrayList.iterator();
            while (it.hasNext()) {
                a next = it.next();
                next.f36112b.execute(next.f36111a);
            }
        }
    }
}
