package he;

import he.c0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* compiled from: EventManager.java */
/* loaded from: classes.dex */
public final class j implements c0.b {

    /* renamed from: a  reason: collision with root package name */
    public final c0 f17528a;

    /* renamed from: c  reason: collision with root package name */
    public final HashSet f17530c = new HashSet();

    /* renamed from: d  reason: collision with root package name */
    public w f17531d = w.UNKNOWN;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f17529b = new HashMap();

    /* compiled from: EventManager.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f17532a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f17533b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f17534c;
    }

    /* compiled from: EventManager.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f17535a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public h0 f17536b;
    }

    public j(c0 c0Var) {
        this.f17528a = c0Var;
        c0Var.f17464n = this;
    }

    public final void a(List<h0> list) {
        boolean z10 = false;
        for (h0 h0Var : list) {
            b bVar = (b) this.f17529b.get(h0Var.f17519a);
            if (bVar != null) {
                Iterator it = bVar.f17535a.iterator();
                while (it.hasNext()) {
                    if (((z) it.next()).a(h0Var)) {
                        z10 = true;
                    }
                }
                bVar.f17536b = h0Var;
            }
        }
        if (z10) {
            b();
        }
    }

    public final void b() {
        Iterator it = this.f17530c.iterator();
        while (it.hasNext()) {
            ((fe.h) it.next()).a(null, null);
        }
    }
}
