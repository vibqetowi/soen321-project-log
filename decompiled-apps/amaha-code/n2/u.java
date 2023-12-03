package n2;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* compiled from: WorkContinuationImpl.java */
/* loaded from: classes.dex */
public final class u extends com.android.volley.toolbox.a {
    public static final String E = androidx.work.q.f("WorkContinuationImpl");
    public final ArrayList A;
    public final List<u> B;
    public boolean C;
    public m D;

    /* renamed from: v  reason: collision with root package name */
    public final a0 f25852v;

    /* renamed from: w  reason: collision with root package name */
    public final String f25853w;

    /* renamed from: x  reason: collision with root package name */
    public final androidx.work.f f25854x;

    /* renamed from: y  reason: collision with root package name */
    public final List<? extends androidx.work.w> f25855y;

    /* renamed from: z  reason: collision with root package name */
    public final ArrayList f25856z;

    public u() {
        throw null;
    }

    public u(a0 a0Var, List<? extends androidx.work.w> list) {
        this(a0Var, null, androidx.work.f.KEEP, list, null);
    }

    public static boolean K(u uVar, HashSet hashSet) {
        hashSet.addAll(uVar.f25856z);
        HashSet L = L(uVar);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (L.contains((String) it.next())) {
                return true;
            }
        }
        List<u> list = uVar.B;
        if (list != null && !list.isEmpty()) {
            for (u uVar2 : list) {
                if (K(uVar2, hashSet)) {
                    return true;
                }
            }
        }
        hashSet.removeAll(uVar.f25856z);
        return false;
    }

    public static HashSet L(u uVar) {
        HashSet hashSet = new HashSet();
        List<u> list = uVar.B;
        if (list != null && !list.isEmpty()) {
            for (u uVar2 : list) {
                hashSet.addAll(uVar2.f25856z);
            }
        }
        return hashSet;
    }

    public final androidx.work.s J() {
        if (!this.C) {
            w2.e eVar = new w2.e(this);
            ((y2.b) this.f25852v.f25795d).a(eVar);
            this.D = eVar.f36292v;
        } else {
            androidx.work.q d10 = androidx.work.q.d();
            d10.g(E, "Already enqueued work ids (" + TextUtils.join(", ", this.f25856z) + ")");
        }
        return this.D;
    }

    public final u M(List list) {
        if (list.isEmpty()) {
            return this;
        }
        return new u(this.f25852v, this.f25853w, androidx.work.f.KEEP, list, Collections.singletonList(this));
    }

    public u(a0 a0Var, String str, androidx.work.f fVar, List<? extends androidx.work.w> list, List<u> list2) {
        this.f25852v = a0Var;
        this.f25853w = str;
        this.f25854x = fVar;
        this.f25855y = list;
        this.B = list2;
        this.f25856z = new ArrayList(list.size());
        this.A = new ArrayList();
        if (list2 != null) {
            for (u uVar : list2) {
                this.A.addAll(uVar.A);
            }
        }
        for (int i6 = 0; i6 < list.size(); i6++) {
            String uuid = list.get(i6).f3351a.toString();
            kotlin.jvm.internal.i.f(uuid, "id.toString()");
            this.f25856z.add(uuid);
            this.A.add(uuid);
        }
    }
}
