package fe;

import com.google.firebase.firestore.FirebaseFirestore;
import com.google.protobuf.l1;
import fe.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import r1.b0;
/* compiled from: UserDataWriter.java */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public final FirebaseFirestore f15018a;

    /* renamed from: b  reason: collision with root package name */
    public final g.a f15019b;

    public x(FirebaseFirestore firebaseFirestore) {
        g.a aVar = g.a.NONE;
        this.f15018a = firebaseFirestore;
        this.f15019b = aVar;
    }

    public final HashMap a(Map map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            hashMap.put((String) entry.getKey(), b((rf.s) entry.getValue()));
        }
        return hashMap;
    }

    public final Object b(rf.s sVar) {
        rf.s b10;
        boolean z10;
        switch (ke.t.m(sVar)) {
            case 0:
                return null;
            case 1:
                return Boolean.valueOf(sVar.Y());
            case 2:
                if (v.h.b(sVar.i0(), 3)) {
                    return Long.valueOf(sVar.d0());
                }
                return Double.valueOf(sVar.b0());
            case 3:
                l1 h02 = sVar.h0();
                return new sc.h(h02.P(), h02.Q());
            case 4:
                int ordinal = this.f15019b.ordinal();
                if (ordinal != 1) {
                    if (ordinal != 2 || (b10 = ke.q.b(sVar)) == null) {
                        return null;
                    }
                    return b(b10);
                }
                l1 a10 = ke.q.a(sVar);
                return new sc.h(a10.P(), a10.Q());
            case 5:
                return sVar.g0();
            case 6:
                com.google.protobuf.h Z = sVar.Z();
                ca.a.w(Z, "Provided ByteString must not be null.");
                return new a(Z);
            case 7:
                ke.p u10 = ke.p.u(sVar.f0());
                if (u10.p() > 3 && u10.l(0).equals("projects") && u10.l(2).equals("databases")) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ca.a.u0(z10, "Tried to parse an invalid resource name: %s", u10);
                String l2 = u10.l(1);
                String l10 = u10.l(3);
                ke.f fVar = new ke.f(l2, l10);
                ke.i h10 = ke.i.h(sVar.f0());
                FirebaseFirestore firebaseFirestore = this.f15018a;
                ke.f fVar2 = firebaseFirestore.f9611b;
                if (!fVar.equals(fVar2)) {
                    kc.f.A(2, "DocumentSnapshot", "Document %s contains a document reference within a different database (%s/%s) which is not supported. It will be treated as a reference in the current database (%s/%s) instead.", h10.f23275u, l2, l10, fVar2.f23269u, fVar2.f23270v);
                }
                return new com.google.firebase.firestore.a(h10, firebaseFirestore);
            case 8:
                return new m(sVar.c0().P(), sVar.c0().Q());
            case 9:
                rf.a X = sVar.X();
                ArrayList arrayList = new ArrayList(X.R());
                for (rf.s sVar2 : X.p()) {
                    arrayList.add(b(sVar2));
                }
                return arrayList;
            case 10:
                return a(sVar.e0().P());
            default:
                ca.a.V("Unknown value type: ".concat(b0.e(sVar.i0())), new Object[0]);
                throw null;
        }
    }
}
