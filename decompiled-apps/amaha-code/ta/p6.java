package ta;

import com.google.android.gms.internal.measurement.x8;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import t.g;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class p6 {

    /* renamed from: a  reason: collision with root package name */
    public final String f32812a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f32813b;

    /* renamed from: c  reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.a3 f32814c;

    /* renamed from: d  reason: collision with root package name */
    public final BitSet f32815d;

    /* renamed from: e  reason: collision with root package name */
    public final BitSet f32816e;
    public final Map f;

    /* renamed from: g  reason: collision with root package name */
    public final t.b f32817g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ b f32818h;

    public /* synthetic */ p6(b bVar, String str) {
        this.f32818h = bVar;
        this.f32812a = str;
        this.f32813b = true;
        this.f32815d = new BitSet();
        this.f32816e = new BitSet();
        this.f = new t.b();
        this.f32817g = new t.b();
    }

    public final com.google.android.gms.internal.measurement.i2 a(int i6) {
        ArrayList arrayList;
        List list;
        com.google.android.gms.internal.measurement.h2 v10 = com.google.android.gms.internal.measurement.i2.v();
        v10.i();
        com.google.android.gms.internal.measurement.i2.z((com.google.android.gms.internal.measurement.i2) v10.f8613v, i6);
        v10.i();
        com.google.android.gms.internal.measurement.i2.C((com.google.android.gms.internal.measurement.i2) v10.f8613v, this.f32813b);
        com.google.android.gms.internal.measurement.a3 a3Var = this.f32814c;
        if (a3Var != null) {
            v10.i();
            com.google.android.gms.internal.measurement.i2.B((com.google.android.gms.internal.measurement.i2) v10.f8613v, a3Var);
        }
        com.google.android.gms.internal.measurement.z2 z10 = com.google.android.gms.internal.measurement.a3.z();
        ArrayList D = f6.D(this.f32815d);
        z10.i();
        com.google.android.gms.internal.measurement.a3.J((com.google.android.gms.internal.measurement.a3) z10.f8613v, D);
        ArrayList D2 = f6.D(this.f32816e);
        z10.i();
        com.google.android.gms.internal.measurement.a3.H((com.google.android.gms.internal.measurement.a3) z10.f8613v, D2);
        Map map = this.f;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(map.size());
            for (Integer num : map.keySet()) {
                int intValue = num.intValue();
                Long l2 = (Long) map.get(Integer.valueOf(intValue));
                if (l2 != null) {
                    com.google.android.gms.internal.measurement.j2 w10 = com.google.android.gms.internal.measurement.k2.w();
                    w10.i();
                    com.google.android.gms.internal.measurement.k2.y((com.google.android.gms.internal.measurement.k2) w10.f8613v, intValue);
                    long longValue = l2.longValue();
                    w10.i();
                    com.google.android.gms.internal.measurement.k2.z((com.google.android.gms.internal.measurement.k2) w10.f8613v, longValue);
                    arrayList.add((com.google.android.gms.internal.measurement.k2) w10.f());
                }
            }
        }
        if (arrayList != null) {
            z10.i();
            com.google.android.gms.internal.measurement.a3.L((com.google.android.gms.internal.measurement.a3) z10.f8613v, arrayList);
        }
        t.b bVar = this.f32817g;
        if (bVar == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList2 = new ArrayList(bVar.f32260w);
            Iterator it = ((g.c) bVar.keySet()).iterator();
            while (it.hasNext()) {
                Integer num2 = (Integer) it.next();
                com.google.android.gms.internal.measurement.b3 x10 = com.google.android.gms.internal.measurement.c3.x();
                int intValue2 = num2.intValue();
                x10.i();
                com.google.android.gms.internal.measurement.c3.A((com.google.android.gms.internal.measurement.c3) x10.f8613v, intValue2);
                List list2 = (List) bVar.getOrDefault(num2, null);
                if (list2 != null) {
                    Collections.sort(list2);
                    x10.i();
                    com.google.android.gms.internal.measurement.c3.B((com.google.android.gms.internal.measurement.c3) x10.f8613v, list2);
                }
                arrayList2.add((com.google.android.gms.internal.measurement.c3) x10.f());
            }
            list = arrayList2;
        }
        z10.i();
        com.google.android.gms.internal.measurement.a3.O((com.google.android.gms.internal.measurement.a3) z10.f8613v, list);
        v10.i();
        com.google.android.gms.internal.measurement.i2.A((com.google.android.gms.internal.measurement.i2) v10.f8613v, (com.google.android.gms.internal.measurement.a3) z10.f());
        return (com.google.android.gms.internal.measurement.i2) v10.f();
    }

    public final void b(r6 r6Var) {
        int u10;
        boolean z10;
        int i6 = r6Var.f32855g;
        com.google.android.gms.internal.measurement.w5 w5Var = r6Var.f32857i;
        switch (i6) {
            case 0:
                u10 = ((com.google.android.gms.internal.measurement.n1) w5Var).v();
                break;
            default:
                u10 = ((com.google.android.gms.internal.measurement.u1) w5Var).u();
                break;
        }
        Boolean bool = r6Var.f32870c;
        if (bool != null) {
            this.f32816e.set(u10, bool.booleanValue());
        }
        Boolean bool2 = r6Var.f32871d;
        if (bool2 != null) {
            this.f32815d.set(u10, bool2.booleanValue());
        }
        if (r6Var.f32872e != null) {
            Integer valueOf = Integer.valueOf(u10);
            Map map = this.f;
            Long l2 = (Long) map.get(valueOf);
            long longValue = r6Var.f32872e.longValue() / 1000;
            if (l2 == null || longValue > l2.longValue()) {
                map.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (r6Var.f != null) {
            t.b bVar = this.f32817g;
            Integer valueOf2 = Integer.valueOf(u10);
            List list = (List) bVar.getOrDefault(valueOf2, null);
            if (list == null) {
                list = new ArrayList();
                bVar.put(valueOf2, list);
            }
            boolean z11 = false;
            switch (i6) {
                case 0:
                    z10 = false;
                    break;
                default:
                    z10 = true;
                    break;
            }
            if (z10) {
                list.clear();
            }
            x8.b();
            b bVar2 = this.f32818h;
            f fVar = bVar2.f32943u.A;
            i2 i2Var = j2.W;
            String str = this.f32812a;
            if (fVar.q(str, i2Var)) {
                switch (i6) {
                    case 0:
                        z11 = ((com.google.android.gms.internal.measurement.n1) w5Var).H();
                        break;
                }
                if (z11) {
                    list.clear();
                }
            }
            x8.b();
            if (bVar2.f32943u.A.q(str, i2Var)) {
                Long valueOf3 = Long.valueOf(r6Var.f.longValue() / 1000);
                if (!list.contains(valueOf3)) {
                    list.add(valueOf3);
                    return;
                }
                return;
            }
            list.add(Long.valueOf(r6Var.f.longValue() / 1000));
        }
    }

    public p6(b bVar, String str, com.google.android.gms.internal.measurement.a3 a3Var, BitSet bitSet, BitSet bitSet2, t.b bVar2, t.b bVar3) {
        this.f32818h = bVar;
        this.f32812a = str;
        this.f32815d = bitSet;
        this.f32816e = bitSet2;
        this.f = bVar2;
        this.f32817g = new t.b();
        Iterator it = ((g.c) bVar3.keySet()).iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) bVar3.getOrDefault(num, null));
            this.f32817g.put(num, arrayList);
        }
        this.f32813b = false;
        this.f32814c = a3Var;
    }
}
