package vr;

import java.net.SocketAddress;
import java.util.List;
import java.util.concurrent.TimeUnit;
import vr.c1;
/* compiled from: InternalSubchannel.java */
/* loaded from: classes2.dex */
public final class f1 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ List f35601u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ c1 f35602v;

    /* compiled from: InternalSubchannel.java */
    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            c1 c1Var = f1.this.f35602v;
            g2 g2Var = c1Var.r;
            c1Var.f35454q = null;
            c1Var.r = null;
            g2Var.h(tr.i0.f33488m.g("InternalSubchannel closed transport due to address change"));
        }
    }

    public f1(c1 c1Var, List list) {
        this.f35602v = c1Var;
        this.f35601u = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        g2 g2Var;
        c1.d dVar = this.f35602v.f35449l;
        SocketAddress socketAddress = dVar.f35468a.get(dVar.f35469b).f20452a.get(dVar.f35470c);
        c1.d dVar2 = this.f35602v.f35449l;
        dVar2.f35468a = this.f35601u;
        dVar2.a();
        this.f35602v.f35450m = this.f35601u;
        tr.j jVar = this.f35602v.f35459w.f33510a;
        tr.j jVar2 = tr.j.READY;
        if (jVar == jVar2 || this.f35602v.f35459w.f33510a == tr.j.CONNECTING) {
            c1.d dVar3 = this.f35602v.f35449l;
            boolean z10 = false;
            int i6 = 0;
            while (true) {
                if (i6 < dVar3.f35468a.size()) {
                    int indexOf = dVar3.f35468a.get(i6).f20452a.indexOf(socketAddress);
                    if (indexOf == -1) {
                        i6++;
                    } else {
                        dVar3.f35469b = i6;
                        dVar3.f35470c = indexOf;
                        z10 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (!z10) {
                if (this.f35602v.f35459w.f33510a == jVar2) {
                    g2Var = this.f35602v.f35458v;
                    this.f35602v.f35458v = null;
                    this.f35602v.f35449l.a();
                    c1.b(this.f35602v, tr.j.IDLE);
                    if (g2Var == null) {
                        c1 c1Var = this.f35602v;
                        if (c1Var.f35454q != null) {
                            c1Var.r.h(tr.i0.f33488m.g("InternalSubchannel closed transport early due to address change"));
                            this.f35602v.f35454q.a();
                            c1 c1Var2 = this.f35602v;
                            c1Var2.f35454q = null;
                            c1Var2.r = null;
                        }
                        c1 c1Var3 = this.f35602v;
                        c1Var3.r = g2Var;
                        c1Var3.f35454q = c1Var3.f35448k.c(c1Var3.f35444g, new a(), 5L, TimeUnit.SECONDS);
                        return;
                    }
                    return;
                }
                this.f35602v.f35457u.h(tr.i0.f33488m.g("InternalSubchannel closed pending transport due to address change"));
                c1 c1Var4 = this.f35602v;
                c1Var4.f35457u = null;
                c1Var4.f35449l.a();
                c1.i(this.f35602v);
            }
        }
        g2Var = null;
        if (g2Var == null) {
        }
    }
}
