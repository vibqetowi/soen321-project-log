package su;

import au.a;
import dt.n;
import gt.q0;
import gt.z0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ku.k;
/* compiled from: AnnotationDeserializer.kt */
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final gt.a0 f32003a;

    /* renamed from: b  reason: collision with root package name */
    public final gt.c0 f32004b;

    /* compiled from: AnnotationDeserializer.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f32005a;

        static {
            int[] iArr = new int[a.b.c.EnumC0066c.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[9] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[10] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[11] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[12] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f32005a = iArr;
        }
    }

    public f(gt.a0 module, gt.c0 notFoundClasses) {
        kotlin.jvm.internal.i.g(module, "module");
        kotlin.jvm.internal.i.g(notFoundClasses, "notFoundClasses");
        this.f32003a = module;
        this.f32004b = notFoundClasses;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [hs.f] */
    public final ht.d a(au.a proto, cu.c nameResolver) {
        kotlin.jvm.internal.i.g(proto, "proto");
        kotlin.jvm.internal.i.g(nameResolver, "nameResolver");
        gt.e c10 = gt.t.c(this.f32003a, ta.v.w(nameResolver, proto.f3629w), this.f32004b);
        Map map = is.x.f20677u;
        if (proto.f3630x.size() != 0 && !yu.i.f(c10) && iu.g.n(c10, 5)) {
            Collection<gt.d> y10 = c10.y();
            kotlin.jvm.internal.i.f(y10, "annotationClass.constructors");
            gt.d dVar = (gt.d) is.u.z2(y10);
            if (dVar != null) {
                List<z0> i6 = dVar.i();
                kotlin.jvm.internal.i.f(i6, "constructor.valueParameters");
                int P = sp.b.P(is.i.H1(i6, 10));
                if (P < 16) {
                    P = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(P);
                for (Object obj : i6) {
                    linkedHashMap.put(((z0) obj).getName(), obj);
                }
                List<a.b> list = proto.f3630x;
                kotlin.jvm.internal.i.f(list, "proto.argumentList");
                ArrayList arrayList = new ArrayList();
                for (a.b it : list) {
                    kotlin.jvm.internal.i.f(it, "it");
                    z0 z0Var = (z0) linkedHashMap.get(ta.v.x(nameResolver, it.f3635w));
                    ku.g<?> gVar = null;
                    if (z0Var != null) {
                        fu.e x10 = ta.v.x(nameResolver, it.f3635w);
                        wu.b0 a10 = z0Var.a();
                        kotlin.jvm.internal.i.f(a10, "parameter.type");
                        a.b.c cVar = it.f3636x;
                        kotlin.jvm.internal.i.f(cVar, "proto.value");
                        ku.g<?> c11 = c(a10, cVar, nameResolver);
                        if (b(c11, a10, cVar)) {
                            gVar = c11;
                        }
                        if (gVar == null) {
                            String message = "Unexpected argument value: actual type " + cVar.f3644w + " != expected type " + a10;
                            kotlin.jvm.internal.i.g(message, "message");
                            gVar = new k.a(message);
                        }
                        gVar = new hs.f(x10, gVar);
                    }
                    if (gVar != null) {
                        arrayList.add(gVar);
                    }
                }
                map = is.e0.w0(arrayList);
            }
        }
        return new ht.d(c10.r(), map, q0.f16815a);
    }

    public final boolean b(ku.g<?> gVar, wu.b0 b0Var, a.b.c cVar) {
        int i6;
        gt.e eVar;
        boolean z10;
        a.b.c.EnumC0066c enumC0066c = cVar.f3644w;
        if (enumC0066c == null) {
            i6 = -1;
        } else {
            i6 = a.f32005a[enumC0066c.ordinal()];
        }
        if (i6 != 10) {
            gt.a0 a0Var = this.f32003a;
            if (i6 != 13) {
                return kotlin.jvm.internal.i.b(gVar.a(a0Var), b0Var);
            }
            if ((gVar instanceof ku.b) && ((List) ((ku.b) gVar).f23941a).size() == cVar.E.size()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                wu.b0 g5 = a0Var.o().g(b0Var);
                ku.b bVar = (ku.b) gVar;
                Collection collection = (Collection) bVar.f23941a;
                kotlin.jvm.internal.i.g(collection, "<this>");
                xs.f fVar = new xs.f(0, collection.size() - 1);
                if ((fVar instanceof Collection) && ((Collection) fVar).isEmpty()) {
                    return true;
                }
                xs.e it = fVar.iterator();
                while (it.f38001w) {
                    int nextInt = it.nextInt();
                    a.b.c cVar2 = cVar.E.get(nextInt);
                    kotlin.jvm.internal.i.f(cVar2, "value.getArrayElement(i)");
                    if (!b((ku.g) ((List) bVar.f23941a).get(nextInt), g5, cVar2)) {
                    }
                }
                return true;
            }
            throw new IllegalStateException(("Deserialized ArrayValue should have the same number of elements as the original array value: " + gVar).toString());
        }
        gt.g a10 = b0Var.O0().a();
        if (a10 instanceof gt.e) {
            eVar = (gt.e) a10;
        } else {
            eVar = null;
        }
        if (eVar == null) {
            return true;
        }
        fu.e eVar2 = dt.j.f13360e;
        if (dt.j.c(eVar, n.a.P)) {
            return true;
        }
        return false;
    }

    public final ku.g<?> c(wu.b0 b0Var, a.b.c cVar, cu.c nameResolver) {
        int i6;
        ku.g<?> eVar;
        ku.g<?> rVar;
        boolean z10;
        kotlin.jvm.internal.i.g(nameResolver, "nameResolver");
        boolean g5 = ri.e.g(cu.b.M, cVar.G, "IS_UNSIGNED.get(value.flags)");
        a.b.c.EnumC0066c enumC0066c = cVar.f3644w;
        if (enumC0066c == null) {
            i6 = -1;
        } else {
            i6 = a.f32005a[enumC0066c.ordinal()];
        }
        switch (i6) {
            case 1:
                byte b10 = (byte) cVar.f3645x;
                if (g5) {
                    return new ku.v(b10);
                }
                return new ku.d(b10);
            case 2:
                eVar = new ku.e((char) cVar.f3645x);
                break;
            case 3:
                short s10 = (short) cVar.f3645x;
                if (g5) {
                    return new ku.v(s10);
                }
                return new ku.t(s10);
            case 4:
                int i10 = (int) cVar.f3645x;
                if (g5) {
                    eVar = new ku.v(i10);
                    break;
                } else {
                    eVar = new ku.l(i10);
                    break;
                }
            case 5:
                long j10 = cVar.f3645x;
                if (g5) {
                    rVar = new ku.v(j10);
                } else {
                    rVar = new ku.r(j10);
                }
                return rVar;
            case 6:
                eVar = new ku.c(cVar.f3646y);
                break;
            case 7:
                eVar = new ku.c(cVar.f3647z);
                break;
            case 8:
                if (cVar.f3645x != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                eVar = new ku.c(z10);
                break;
            case 9:
                eVar = new ku.u(nameResolver.getString(cVar.A));
                break;
            case 10:
                eVar = new ku.q(ta.v.w(nameResolver, cVar.B), cVar.F);
                break;
            case 11:
                eVar = new ku.j(ta.v.w(nameResolver, cVar.B), ta.v.x(nameResolver, cVar.C));
                break;
            case 12:
                au.a aVar = cVar.D;
                kotlin.jvm.internal.i.f(aVar, "value.annotation");
                eVar = new ku.a(a(aVar, nameResolver));
                break;
            case 13:
                List<a.b.c> list = cVar.E;
                kotlin.jvm.internal.i.f(list, "value.arrayElementList");
                ArrayList arrayList = new ArrayList(is.i.H1(list, 10));
                for (a.b.c it : list) {
                    wu.i0 f = this.f32003a.o().f();
                    kotlin.jvm.internal.i.f(f, "builtIns.anyType");
                    kotlin.jvm.internal.i.f(it, "it");
                    arrayList.add(c(f, it, nameResolver));
                }
                return new o(arrayList, b0Var);
            default:
                StringBuilder sb2 = new StringBuilder("Unsupported annotation argument type: ");
                sb2.append(cVar.f3644w);
                sb2.append(" (expected ");
                sb2.append(b0Var);
                sb2.append(')');
                throw new IllegalStateException(sb2.toString().toString());
        }
        return eVar;
    }
}
