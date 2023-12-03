package fe;

import ag.a;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.protobuf.l1;
import fe.k;
import he.f0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import oe.e;
import rf.a;
import rf.n;
import rf.s;
/* compiled from: UserDataReader.java */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public final ke.f f15017a;

    public w(ke.f fVar) {
        this.f15017a = fVar;
    }

    public static rf.s g(sc.h hVar) {
        s.a j02 = rf.s.j0();
        l1.a R = l1.R();
        R.u();
        l1.M((l1) R.f10073v, hVar.f31450u);
        R.u();
        l1.N((l1) R.f10073v, (hVar.f31451v / 1000) * 1000);
        j02.B(R);
        return j02.r();
    }

    public final ke.o a(Object obj, w4.l lVar) {
        if (!obj.getClass().isArray()) {
            rf.s c10 = c(oe.e.h(obj, e.c.f27415d), lVar);
            if (c10.i0() == 11) {
                return new ke.o(c10);
            }
            throw new IllegalArgumentException("Invalid data. Data must be a Map<String, Object> or a suitable POJO object, but it was of type: ".concat(oe.n.i(obj)));
        }
        throw new IllegalArgumentException("Invalid data. Data must be a Map<String, Object> or a suitable POJO object, but it was an array");
    }

    public final ArrayList b() {
        new s1.s(f0.Argument);
        throw null;
    }

    public final rf.s c(Object obj, w4.l lVar) {
        ke.m d10;
        boolean z10 = obj instanceof Map;
        Object obj2 = lVar.f36416c;
        boolean z11 = true;
        if (z10) {
            Map map = (Map) obj;
            if (map.isEmpty()) {
                ke.m mVar = (ke.m) lVar.f36417d;
                if (mVar != null && !mVar.isEmpty()) {
                    ((Set) ((s1.s) obj2).f31225w).add((ke.m) lVar.f36417d);
                }
                s.a j02 = rf.s.j0();
                j02.A(rf.n.N());
                return j02.r();
            }
            n.a S = rf.n.S();
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getKey() instanceof String) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    ke.m mVar2 = (ke.m) lVar.f36417d;
                    if (mVar2 == null) {
                        d10 = null;
                    } else {
                        d10 = mVar2.d(str);
                    }
                    w4.l lVar2 = new w4.l((s1.s) obj2, d10, false);
                    if (!str.isEmpty()) {
                        if (lVar2.d() && str.startsWith("__") && str.endsWith("__")) {
                            throw lVar2.c("Document fields cannot begin and end with \"__\"");
                        }
                        rf.s c10 = c(value, lVar2);
                        if (c10 != null) {
                            S.x(c10, str);
                        }
                    } else {
                        throw lVar2.c("Document fields must not be empty");
                    }
                } else {
                    throw lVar.c(String.format("Non-String Map key (%s) is not allowed", entry.getValue()));
                }
            }
            s.a j03 = rf.s.j0();
            j03.z(S);
            return j03.r();
        } else if (obj instanceof k) {
            k kVar = (k) obj;
            if (lVar.d()) {
                Object obj3 = lVar.f36417d;
                ke.m mVar3 = (ke.m) obj3;
                if (mVar3 != null) {
                    if (kVar instanceof k.c) {
                        if (((f0) ((s1.s) obj2).f31224v) == f0.MergeSet) {
                            ((Set) ((s1.s) obj2).f31225w).add((ke.m) obj3);
                        } else if (((f0) ((s1.s) obj2).f31224v) == f0.Update) {
                            if (((ke.m) obj3).p() <= 0) {
                                z11 = false;
                            }
                            ca.a.u0(z11, "FieldValue.delete() at the top level should have already been handled.", new Object[0]);
                            throw lVar.c("FieldValue.delete() can only appear at the top level of your update data");
                        } else {
                            throw lVar.c("FieldValue.delete() can only be used with update() and set() with SetOptions.merge()");
                        }
                    } else if (kVar instanceof k.e) {
                        lVar.a(mVar3, le.m.f24230a);
                    } else if (!(kVar instanceof k.b)) {
                        if (!(kVar instanceof k.a)) {
                            if (kVar instanceof k.d) {
                                ((k.d) kVar).getClass();
                                lVar.a((ke.m) lVar.f36417d, new le.i(e(null, false)));
                            } else {
                                ca.a.V("Unknown FieldValue type: %s", oe.n.i(kVar));
                                throw null;
                            }
                        } else {
                            ((k.a) kVar).getClass();
                            b();
                            throw null;
                        }
                    } else {
                        ((k.b) kVar).getClass();
                        b();
                        throw null;
                    }
                    return null;
                }
                throw lVar.c(String.format("%s() is not currently supported inside arrays", kVar.a()));
            }
            throw lVar.c(String.format("%s() can only be used with set() and update()", kVar.a()));
        } else {
            ke.m mVar4 = (ke.m) lVar.f36417d;
            if (mVar4 != null) {
                ((Set) ((s1.s) obj2).f31225w).add(mVar4);
            }
            if (obj instanceof List) {
                if (lVar.f36415b && ((f0) ((s1.s) obj2).f31224v) != f0.ArrayArgument) {
                    throw lVar.c("Nested arrays are not supported");
                }
                a.C0520a S2 = rf.a.S();
                for (Object obj4 : (List) obj) {
                    rf.s c11 = c(obj4, new w4.l((s1.s) obj2, null, true));
                    if (c11 == null) {
                        s.a j04 = rf.s.j0();
                        j04.u();
                        rf.s.T((rf.s) j04.f10073v);
                        c11 = j04.r();
                    }
                    S2.u();
                    rf.a.M((rf.a) S2.f10073v, c11);
                }
                s.a j05 = rf.s.j0();
                j05.x(S2);
                return j05.r();
            } else if (obj == null) {
                s.a j06 = rf.s.j0();
                j06.u();
                rf.s.T((rf.s) j06.f10073v);
                return j06.r();
            } else if (obj instanceof Integer) {
                s.a j07 = rf.s.j0();
                long intValue = ((Integer) obj).intValue();
                j07.u();
                rf.s.V((rf.s) j07.f10073v, intValue);
                return j07.r();
            } else if (obj instanceof Long) {
                s.a j08 = rf.s.j0();
                long longValue = ((Long) obj).longValue();
                j08.u();
                rf.s.V((rf.s) j08.f10073v, longValue);
                return j08.r();
            } else if (obj instanceof Float) {
                s.a j09 = rf.s.j0();
                j09.y(((Float) obj).doubleValue());
                return j09.r();
            } else if (obj instanceof Double) {
                s.a j010 = rf.s.j0();
                j010.y(((Double) obj).doubleValue());
                return j010.r();
            } else if (obj instanceof Boolean) {
                s.a j011 = rf.s.j0();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                j011.u();
                rf.s.U((rf.s) j011.f10073v, booleanValue);
                return j011.r();
            } else if (obj instanceof String) {
                s.a j012 = rf.s.j0();
                j012.u();
                rf.s.N((rf.s) j012.f10073v, (String) obj);
                return j012.r();
            } else if (obj instanceof Date) {
                return g(new sc.h((Date) obj));
            } else {
                if (obj instanceof sc.h) {
                    return g((sc.h) obj);
                }
                if (obj instanceof m) {
                    m mVar5 = (m) obj;
                    s.a j013 = rf.s.j0();
                    a.C0011a R = ag.a.R();
                    R.u();
                    ag.a.M((ag.a) R.f10073v, mVar5.f15003u);
                    R.u();
                    ag.a.N((ag.a) R.f10073v, mVar5.f15004v);
                    j013.u();
                    rf.s.Q((rf.s) j013.f10073v, R.r());
                    return j013.r();
                } else if (obj instanceof a) {
                    s.a j014 = rf.s.j0();
                    j014.u();
                    rf.s.O((rf.s) j014.f10073v, ((a) obj).f14978u);
                    return j014.r();
                } else if (obj instanceof com.google.firebase.firestore.a) {
                    com.google.firebase.firestore.a aVar = (com.google.firebase.firestore.a) obj;
                    ke.f fVar = this.f15017a;
                    FirebaseFirestore firebaseFirestore = aVar.f9626b;
                    if (firebaseFirestore != null) {
                        ke.f fVar2 = firebaseFirestore.f9611b;
                        if (!fVar2.equals(fVar)) {
                            throw lVar.c(String.format("Document reference is for database %s/%s but should be for database %s/%s", fVar2.f23269u, fVar2.f23270v, fVar.f23269u, fVar.f23270v));
                        }
                    }
                    s.a j015 = rf.s.j0();
                    String format = String.format("projects/%s/databases/%s/documents/%s", fVar.f23269u, fVar.f23270v, aVar.f9625a.f23275u.h());
                    j015.u();
                    rf.s.P((rf.s) j015.f10073v, format);
                    return j015.r();
                } else if (obj.getClass().isArray()) {
                    throw lVar.c("Arrays are not supported; use a List instead");
                } else {
                    throw lVar.c("Unsupported type: ".concat(oe.n.i(obj)));
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0062, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final s1.s d(Object obj, le.d dVar) {
        boolean z10;
        boolean z11;
        ke.m next;
        s1.s sVar = new s1.s(f0.MergeSet);
        ke.o a10 = a(obj, new w4.l(sVar, ke.m.f23284w));
        if (dVar != null) {
            Set<ke.m> set = dVar.f24212a;
            Iterator<ke.m> it = set.iterator();
            do {
                z10 = false;
                if (it.hasNext()) {
                    next = it.next();
                    Iterator it2 = ((Set) sVar.f31225w).iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (next.n((ke.m) it2.next())) {
                                break;
                            }
                        } else {
                            Iterator it3 = ((ArrayList) sVar.f31226x).iterator();
                            while (it3.hasNext()) {
                                if (next.n(((le.e) it3.next()).f24213a)) {
                                }
                            }
                            continue;
                        }
                    }
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator it4 = ((ArrayList) sVar.f31226x).iterator();
                    while (it4.hasNext()) {
                        le.e eVar = (le.e) it4.next();
                        ke.m mVar = eVar.f24213a;
                        Iterator<ke.m> it5 = set.iterator();
                        while (true) {
                            if (it5.hasNext()) {
                                if (it5.next().n(mVar)) {
                                    z11 = true;
                                    break;
                                }
                            } else {
                                z11 = false;
                                break;
                            }
                        }
                        if (z11) {
                            arrayList.add(eVar);
                        }
                    }
                    return new s1.s(16, a10, dVar, Collections.unmodifiableList(arrayList));
                }
            } while (z10);
            throw new IllegalArgumentException("Field '" + next.h() + "' is specified in your field mask but not in your input data.");
        }
        return new s1.s(16, a10, new le.d((Set) sVar.f31225w), Collections.unmodifiableList((ArrayList) sVar.f31226x));
    }

    public final rf.s e(Object obj, boolean z10) {
        f0 f0Var;
        boolean z11;
        if (z10) {
            f0Var = f0.ArrayArgument;
        } else {
            f0Var = f0.Argument;
        }
        s1.s sVar = new s1.s(f0Var);
        rf.s c10 = c(oe.e.h(obj, e.c.f27415d), new w4.l(sVar, ke.m.f23284w));
        if (c10 != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        ca.a.u0(z11, "Parsed data should not be null.", new Object[0]);
        ca.a.u0(((ArrayList) sVar.f31226x).isEmpty(), "Field transforms should have been disallowed.", new Object[0]);
        return c10;
    }

    public final s1.s f(Object obj) {
        s1.s sVar = new s1.s(f0.Set);
        return new s1.s(16, a(obj, new w4.l(sVar, ke.m.f23284w)), null, Collections.unmodifiableList((ArrayList) sVar.f31226x));
    }
}
