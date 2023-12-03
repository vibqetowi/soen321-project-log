package pt;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
/* compiled from: AbstractAnnotationTypeQualifierResolver.kt */
/* loaded from: classes2.dex */
public abstract class b<TAnnotation> {
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public static final LinkedHashMap f28848c;

    /* renamed from: a  reason: collision with root package name */
    public final y f28849a;

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap<Object, TAnnotation> f28850b;

    static {
        c[] values;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (c cVar : c.values()) {
            String str = cVar.f28860u;
            if (linkedHashMap.get(str) == null) {
                linkedHashMap.put(str, cVar);
            }
        }
        f28848c = linkedHashMap;
    }

    public b(y javaTypeEnhancementState) {
        kotlin.jvm.internal.i.g(javaTypeEnhancementState, "javaTypeEnhancementState");
        this.f28849a = javaTypeEnhancementState;
        this.f28850b = new ConcurrentHashMap<>();
    }

    public abstract ArrayList a(Object obj, boolean z10);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x013d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0015 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final z b(z zVar, Iterable<? extends TAnnotation> annotations) {
        boolean z10;
        EnumMap enumMap;
        EnumMap<c, s> enumMap2;
        s sVar;
        hs.f fVar;
        boolean z11;
        xt.k c10;
        TAnnotation d10;
        TAnnotation tannotation;
        boolean z12;
        s sVar2;
        h0 j10;
        boolean z13;
        boolean z14;
        kotlin.jvm.internal.i.g(annotations, "annotations");
        y yVar = this.f28849a;
        if (yVar.f28968c) {
            return zVar;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<? extends TAnnotation> it = annotations.iterator();
        while (true) {
            z10 = false;
            if (!it.hasNext()) {
                break;
            }
            TAnnotation next = it.next();
            h0 h0Var = h0.WARN;
            h0 h0Var2 = h0.IGNORE;
            s sVar3 = null;
            if (!yVar.f28968c && (sVar2 = (s) d.f28868g.get(e(next))) != null) {
                fu.c e10 = e(next);
                if (e10 != null && d.f.containsKey(e10)) {
                    j10 = yVar.f28967b.invoke(e10);
                } else {
                    j10 = j(next);
                    if (j10 == null) {
                        j10 = yVar.f28966a.f28851a;
                    }
                }
                if (j10 != h0Var2) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z13) {
                    j10 = null;
                }
                if (j10 != null) {
                    if (j10 == h0Var) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    xt.k a10 = xt.k.a(sVar2.f28951a, null, z14, 1);
                    Collection<c> qualifierApplicabilityTypes = sVar2.f28952b;
                    kotlin.jvm.internal.i.g(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
                    sVar = new s(a10, qualifierApplicabilityTypes, sVar2.f28953c);
                    if (sVar == null) {
                        sVar3 = sVar;
                    } else {
                        if (!yVar.f28966a.f28854d && (d10 = d(next, d.f28865c)) != null) {
                            Iterator<TAnnotation> it2 = g(next).iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    tannotation = it2.next();
                                    if (k(tannotation) != null) {
                                        z12 = true;
                                        continue;
                                    } else {
                                        z12 = false;
                                        continue;
                                    }
                                    if (z12) {
                                        break;
                                    }
                                } else {
                                    tannotation = null;
                                    break;
                                }
                            }
                            if (tannotation != null) {
                                ArrayList<String> a11 = a(d10, true);
                                LinkedHashSet linkedHashSet = new LinkedHashSet();
                                for (String str : a11) {
                                    c cVar = (c) f28848c.get(str);
                                    if (cVar != null) {
                                        linkedHashSet.add(cVar);
                                    }
                                }
                                if (linkedHashSet.contains(c.TYPE_USE)) {
                                    linkedHashSet = is.h0.I1(is.h0.G1(is.k.k2(c.values()), c.TYPE_PARAMETER_BOUNDS), linkedHashSet);
                                }
                                fVar = new hs.f(tannotation, linkedHashSet);
                                if (fVar != null) {
                                    Set set = (Set) fVar.f19465v;
                                    h0 j11 = j(next);
                                    A a12 = fVar.f19464u;
                                    if (j11 == null && (j11 = j(a12)) == null) {
                                        j11 = yVar.f28966a.f28851a;
                                    }
                                    j11.getClass();
                                    if (j11 == h0Var2) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (!z11 && (c10 = c(a.f28846u, a12)) != null) {
                                        if (j11 == h0Var) {
                                            z10 = true;
                                        }
                                        sVar3 = new s(xt.k.a(c10, null, z10, 1), set);
                                    }
                                }
                            }
                        }
                        fVar = null;
                        if (fVar != null) {
                        }
                    }
                    if (sVar3 == null) {
                        arrayList.add(sVar3);
                    }
                }
            }
            sVar = null;
            if (sVar == null) {
            }
            if (sVar3 == null) {
            }
        }
        if (arrayList.isEmpty()) {
            return zVar;
        }
        if (zVar != null && (enumMap2 = zVar.f28970a) != null) {
            enumMap = new EnumMap((EnumMap) enumMap2);
        } else {
            enumMap = new EnumMap(c.class);
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            s sVar4 = (s) it3.next();
            for (c cVar2 : sVar4.f28952b) {
                enumMap.put((EnumMap) cVar2, (c) sVar4);
                z10 = true;
            }
        }
        if (z10) {
            return new z(enumMap);
        }
        return zVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final xt.k c(ss.l lVar, Object obj) {
        boolean z10;
        xt.k i6;
        xt.k i10 = i(obj, ((Boolean) lVar.invoke(obj)).booleanValue());
        if (i10 != null) {
            return i10;
        }
        TAnnotation k10 = k(obj);
        if (k10 == null) {
            return null;
        }
        h0 j10 = j(obj);
        if (j10 == null) {
            j10 = this.f28849a.f28966a.f28851a;
        }
        j10.getClass();
        boolean z11 = false;
        if (j10 == h0.IGNORE) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || (i6 = i(k10, ((Boolean) lVar.invoke(k10)).booleanValue())) == null) {
            return null;
        }
        if (j10 == h0.WARN) {
            z11 = true;
        }
        return xt.k.a(i6, null, z11, 1);
    }

    public final TAnnotation d(TAnnotation tannotation, fu.c cVar) {
        for (TAnnotation tannotation2 : g(tannotation)) {
            if (kotlin.jvm.internal.i.b(e(tannotation2), cVar)) {
                return tannotation2;
            }
        }
        return null;
    }

    public abstract fu.c e(TAnnotation tannotation);

    public abstract gt.e f(Object obj);

    public abstract Iterable<TAnnotation> g(TAnnotation tannotation);

    public final boolean h(TAnnotation tannotation, fu.c cVar) {
        Iterable<TAnnotation> g5 = g(tannotation);
        if ((g5 instanceof Collection) && ((Collection) g5).isEmpty()) {
            return false;
        }
        for (TAnnotation tannotation2 : g5) {
            if (kotlin.jvm.internal.i.b(e(tannotation2), cVar)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0070, code lost:
        if (r10.equals("ALWAYS") != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0079, code lost:
        if (r10.equals("UNKNOWN") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0084, code lost:
        if (r10.equals("NEVER") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008d, code lost:
        if (r10.equals("MAYBE") == false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final xt.k i(TAnnotation tannotation, boolean z10) {
        boolean z11;
        boolean z12;
        fu.c e10 = e(tannotation);
        if (e10 == null) {
            return null;
        }
        h0 invoke = this.f28849a.f28967b.invoke(e10);
        invoke.getClass();
        boolean z13 = true;
        if (invoke == h0.IGNORE) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            return null;
        }
        boolean contains = e0.f28889d.contains(e10);
        xt.j jVar = xt.j.NULLABLE;
        if (!contains) {
            boolean contains2 = e0.f28891g.contains(e10);
            xt.j jVar2 = xt.j.NOT_NULL;
            if (!contains2) {
                if (!kotlin.jvm.internal.i.b(e10, e0.f28886a)) {
                    boolean b10 = kotlin.jvm.internal.i.b(e10, e0.f28887b);
                    xt.j jVar3 = xt.j.FORCE_FLEXIBILITY;
                    if (!b10) {
                        if (kotlin.jvm.internal.i.b(e10, e0.f28890e)) {
                            String str = (String) is.u.h2(a(tannotation, false));
                            if (str != null) {
                                switch (str.hashCode()) {
                                    case 73135176:
                                        break;
                                    case 74175084:
                                        break;
                                    case 433141802:
                                        break;
                                    case 1933739535:
                                        break;
                                    default:
                                        return null;
                                }
                            }
                        } else if (!kotlin.jvm.internal.i.b(e10, e0.f28892h)) {
                            if (!kotlin.jvm.internal.i.b(e10, e0.f28893i) && !kotlin.jvm.internal.i.b(e10, e0.f28895k)) {
                                if (!kotlin.jvm.internal.i.b(e10, e0.f28894j)) {
                                    return null;
                                }
                            }
                        }
                    }
                    jVar = jVar3;
                }
            }
            jVar = jVar2;
        }
        if (invoke == h0.WARN) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z12 && !z10) {
            z13 = false;
        }
        return new xt.k(jVar, z13);
    }

    public final h0 j(TAnnotation tannotation) {
        ArrayList a10;
        String str;
        y yVar = this.f28849a;
        h0 h0Var = yVar.f28966a.f28853c.get(e(tannotation));
        if (h0Var != null) {
            return h0Var;
        }
        TAnnotation d10 = d(tannotation, d.f28866d);
        if (d10 != null && (a10 = a(d10, false)) != null && (str = (String) is.u.h2(a10)) != null) {
            h0 h0Var2 = yVar.f28966a.f28852b;
            if (h0Var2 == null) {
                int hashCode = str.hashCode();
                if (hashCode != -2137067054) {
                    if (hashCode != -1838656823) {
                        if (hashCode == 2656902 && str.equals("WARN")) {
                            return h0.WARN;
                        }
                    } else if (str.equals("STRICT")) {
                        return h0.STRICT;
                    }
                } else if (str.equals("IGNORE")) {
                    return h0.IGNORE;
                }
            } else {
                return h0Var2;
            }
        }
        return null;
    }

    public final TAnnotation k(TAnnotation annotation) {
        TAnnotation tannotation;
        kotlin.jvm.internal.i.g(annotation, "annotation");
        if (this.f28849a.f28966a.f28854d) {
            return null;
        }
        if (!is.u.Z1(d.f28869h, e(annotation)) && !h(annotation, d.f28864b)) {
            if (!h(annotation, d.f28863a)) {
                return null;
            }
            ConcurrentHashMap<Object, TAnnotation> concurrentHashMap = this.f28850b;
            gt.e f = f(annotation);
            TAnnotation tannotation2 = concurrentHashMap.get(f);
            if (tannotation2 == null) {
                Iterator<TAnnotation> it = g(annotation).iterator();
                while (true) {
                    if (it.hasNext()) {
                        tannotation = k(it.next());
                        if (tannotation != null) {
                            break;
                        }
                    } else {
                        tannotation = null;
                        break;
                    }
                }
                if (tannotation == null) {
                    return null;
                }
                TAnnotation putIfAbsent = concurrentHashMap.putIfAbsent(f, tannotation);
                if (putIfAbsent != null) {
                    return putIfAbsent;
                }
                return tannotation;
            }
            return tannotation2;
        }
        return annotation;
    }
}
