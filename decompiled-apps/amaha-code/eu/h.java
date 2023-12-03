package eu;

import au.b;
import au.k;
import au.m;
import au.p;
import au.t;
import cu.b;
import du.a;
import eu.d;
import gu.g;
import gu.n;
import is.u;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
/* compiled from: JvmProtoBufUtil.kt */
/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final gu.e f14568a;

    static {
        gu.e eVar = new gu.e();
        eVar.a(du.a.f13436a);
        eVar.a(du.a.f13437b);
        eVar.a(du.a.f13438c);
        eVar.a(du.a.f13439d);
        eVar.a(du.a.f13440e);
        eVar.a(du.a.f);
        eVar.a(du.a.f13441g);
        eVar.a(du.a.f13442h);
        eVar.a(du.a.f13443i);
        eVar.a(du.a.f13444j);
        eVar.a(du.a.f13445k);
        eVar.a(du.a.f13446l);
        eVar.a(du.a.f13447m);
        eVar.a(du.a.f13448n);
        f14568a = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static d.b a(au.c proto, cu.c nameResolver, cu.e typeTable) {
        String str;
        String m22;
        boolean z10;
        i.g(proto, "proto");
        i.g(nameResolver, "nameResolver");
        i.g(typeTable, "typeTable");
        g.e<au.c, a.b> constructorSignature = du.a.f13436a;
        i.f(constructorSignature, "constructorSignature");
        a.b bVar = (a.b) kotlin.jvm.internal.h.w(proto, constructorSignature);
        boolean z11 = false;
        if (bVar != null) {
            if ((bVar.f13459v & 1) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                str = nameResolver.getString(bVar.f13460w);
                if (bVar != null) {
                    if ((bVar.f13459v & 2) == 2) {
                        z11 = true;
                    }
                    if (z11) {
                        m22 = nameResolver.getString(bVar.f13461x);
                        return new d.b(str, m22);
                    }
                }
                List<t> list = proto.f3682y;
                i.f(list, "proto.valueParameterList");
                ArrayList arrayList = new ArrayList(is.i.H1(list, 10));
                for (t it : list) {
                    i.f(it, "it");
                    String e10 = e(ca.a.z1(it, typeTable), nameResolver);
                    if (e10 == null) {
                        return null;
                    }
                    arrayList.add(e10);
                }
                m22 = u.m2(arrayList, "", "(", ")V", null, 56);
                return new d.b(str, m22);
            }
        }
        str = "<init>";
        if (bVar != null) {
        }
        List<t> list2 = proto.f3682y;
        i.f(list2, "proto.valueParameterList");
        ArrayList arrayList2 = new ArrayList(is.i.H1(list2, 10));
        while (r10.hasNext()) {
        }
        m22 = u.m2(arrayList2, "", "(", ")V", null, 56);
        return new d.b(str, m22);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0063 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static d.a b(m proto, cu.c nameResolver, cu.e typeTable, boolean z10) {
        boolean z11;
        a.C0198a c0198a;
        int i6;
        String e10;
        boolean z12;
        i.g(proto, "proto");
        i.g(nameResolver, "nameResolver");
        i.g(typeTable, "typeTable");
        g.e<m, a.c> propertySignature = du.a.f13439d;
        i.f(propertySignature, "propertySignature");
        a.c cVar = (a.c) kotlin.jvm.internal.h.w(proto, propertySignature);
        if (cVar == null) {
            return null;
        }
        boolean z13 = true;
        if ((cVar.f13468v & 1) == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            c0198a = cVar.f13469w;
        } else {
            c0198a = null;
        }
        if (c0198a == null && z10) {
            return null;
        }
        if (c0198a != null) {
            if ((c0198a.f13450v & 1) == 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                i6 = c0198a.f13451w;
                if (c0198a != null) {
                    if ((c0198a.f13450v & 2) != 2) {
                        z13 = false;
                    }
                    if (z13) {
                        e10 = nameResolver.getString(c0198a.f13452x);
                        return new d.a(nameResolver.getString(i6), e10);
                    }
                }
                e10 = e(ca.a.k1(proto, typeTable), nameResolver);
                if (e10 == null) {
                    return null;
                }
                return new d.a(nameResolver.getString(i6), e10);
            }
        }
        i6 = proto.f3771z;
        if (c0198a != null) {
        }
        e10 = e(ca.a.k1(proto, typeTable), nameResolver);
        if (e10 == null) {
        }
        return new d.a(nameResolver.getString(i6), e10);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[LOOP:0: B:18:0x0060->B:20:0x0066, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static d.b c(au.h proto, cu.c nameResolver, cu.e typeTable) {
        int i6;
        Iterator it;
        String e10;
        String concat;
        boolean z10;
        i.g(proto, "proto");
        i.g(nameResolver, "nameResolver");
        i.g(typeTable, "typeTable");
        g.e<au.h, a.b> methodSignature = du.a.f13437b;
        i.f(methodSignature, "methodSignature");
        a.b bVar = (a.b) kotlin.jvm.internal.h.w(proto, methodSignature);
        boolean z11 = false;
        if (bVar != null) {
            if ((bVar.f13459v & 1) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i6 = bVar.f13460w;
                if (bVar != null) {
                    if ((bVar.f13459v & 2) == 2) {
                        z11 = true;
                    }
                    if (z11) {
                        concat = nameResolver.getString(bVar.f13461x);
                        return new d.b(nameResolver.getString(i6), concat);
                    }
                }
                List Q0 = ca.a.Q0(ca.a.d1(proto, typeTable));
                List<t> list = proto.I;
                i.f(list, "proto.valueParameterList");
                ArrayList arrayList = new ArrayList(is.i.H1(list, 10));
                for (t it2 : list) {
                    i.f(it2, "it");
                    arrayList.add(ca.a.z1(it2, typeTable));
                }
                ArrayList u22 = u.u2(arrayList, Q0);
                ArrayList arrayList2 = new ArrayList(is.i.H1(u22, 10));
                it = u22.iterator();
                while (it.hasNext()) {
                    String e11 = e((p) it.next(), nameResolver);
                    if (e11 == null) {
                        return null;
                    }
                    arrayList2.add(e11);
                }
                e10 = e(ca.a.j1(proto, typeTable), nameResolver);
                if (e10 != null) {
                    return null;
                }
                concat = u.m2(arrayList2, "", "(", ")", null, 56).concat(e10);
                return new d.b(nameResolver.getString(i6), concat);
            }
        }
        i6 = proto.f3743z;
        if (bVar != null) {
        }
        List Q02 = ca.a.Q0(ca.a.d1(proto, typeTable));
        List<t> list2 = proto.I;
        i.f(list2, "proto.valueParameterList");
        ArrayList arrayList3 = new ArrayList(is.i.H1(list2, 10));
        while (r1.hasNext()) {
        }
        ArrayList u222 = u.u2(arrayList3, Q02);
        ArrayList arrayList22 = new ArrayList(is.i.H1(u222, 10));
        it = u222.iterator();
        while (it.hasNext()) {
        }
        e10 = e(ca.a.j1(proto, typeTable), nameResolver);
        if (e10 != null) {
        }
    }

    public static final boolean d(m proto) {
        i.g(proto, "proto");
        b.a aVar = c.f14558a;
        b.a aVar2 = c.f14558a;
        Object k10 = proto.k(du.a.f13440e);
        i.f(k10, "proto.getExtension(JvmProtoBuf.flags)");
        Boolean c10 = aVar2.c(((Number) k10).intValue());
        i.f(c10, "JvmFlags.IS_MOVED_FROM_I…nsion(JvmProtoBuf.flags))");
        return c10.booleanValue();
    }

    public static String e(p pVar, cu.c cVar) {
        if (pVar.q()) {
            return b.b(cVar.a(pVar.C));
        }
        return null;
    }

    public static final hs.f<f, au.b> f(String[] strArr, String[] strArr2) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(a.b(strArr));
        f g5 = g(byteArrayInputStream, strArr2);
        b.a aVar = au.b.e0;
        aVar.getClass();
        gu.d dVar = new gu.d(byteArrayInputStream);
        n nVar = (n) aVar.a(dVar, f14568a);
        try {
            dVar.a(0);
            gu.b.b(nVar);
            return new hs.f<>(g5, (au.b) nVar);
        } catch (InvalidProtocolBufferException e10) {
            e10.f23476u = nVar;
            throw e10;
        }
    }

    public static f g(ByteArrayInputStream byteArrayInputStream, String[] strArr) {
        a.d dVar = (a.d) a.d.B.c(byteArrayInputStream, f14568a);
        i.f(dVar, "parseDelimitedFrom(this, EXTENSION_REGISTRY)");
        return new f(dVar, strArr);
    }

    public static final hs.f<f, k> h(String[] strArr, String[] strArr2) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(a.b(strArr));
        f g5 = g(byteArrayInputStream, strArr2);
        k.a aVar = k.F;
        aVar.getClass();
        gu.d dVar = new gu.d(byteArrayInputStream);
        n nVar = (n) aVar.a(dVar, f14568a);
        try {
            dVar.a(0);
            gu.b.b(nVar);
            return new hs.f<>(g5, (k) nVar);
        } catch (InvalidProtocolBufferException e10) {
            e10.f23476u = nVar;
            throw e10;
        }
    }
}
