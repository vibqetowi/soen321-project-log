package w2;

import androidx.work.impl.WorkDatabase;
import androidx.work.s;
import androidx.work.u;
import java.util.LinkedList;
import n2.a0;
import n2.d0;
/* compiled from: CancelWorkRunnable.java */
/* loaded from: classes.dex */
public abstract class d implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final n2.m f36289u = new n2.m();

    public static void a(a0 a0Var, String str) {
        d0 d0Var;
        boolean z10;
        WorkDatabase workDatabase = a0Var.f25794c;
        v2.t u10 = workDatabase.u();
        v2.b p10 = workDatabase.p();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            u.a o10 = u10.o(str2);
            if (o10 != u.a.SUCCEEDED && o10 != u.a.FAILED) {
                u10.h(u.a.CANCELLED, str2);
            }
            linkedList.addAll(p10.b(str2));
        }
        n2.p pVar = a0Var.f;
        synchronized (pVar.F) {
            androidx.work.q d10 = androidx.work.q.d();
            String str3 = n2.p.G;
            d10.a(str3, "Processor cancelling " + str);
            pVar.D.add(str);
            d0Var = (d0) pVar.f25844z.remove(str);
            if (d0Var != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (d0Var == null) {
                d0Var = (d0) pVar.A.remove(str);
            }
            if (d0Var != null) {
                pVar.B.remove(str);
            }
        }
        n2.p.d(d0Var, str);
        if (z10) {
            pVar.l();
        }
        for (n2.r rVar : a0Var.f25796e) {
            rVar.d(str);
        }
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        n2.m mVar = this.f36289u;
        try {
            b();
            mVar.a(androidx.work.s.f3336a);
        } catch (Throwable th2) {
            mVar.a(new s.a.C0044a(th2));
        }
    }
}
