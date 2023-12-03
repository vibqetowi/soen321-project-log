package pt;

import gt.p;
import java.util.HashMap;
/* compiled from: JavaDescriptorVisibilities.java */
/* loaded from: classes2.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static final a f28954a;

    /* renamed from: b  reason: collision with root package name */
    public static final b f28955b;

    /* renamed from: c  reason: collision with root package name */
    public static final c f28956c;

    /* renamed from: d  reason: collision with root package name */
    public static final HashMap f28957d;

    /* compiled from: JavaDescriptorVisibilities.java */
    /* loaded from: classes2.dex */
    public static class a extends gt.o {
        public a(lt.a aVar) {
            super(aVar);
        }

        public static /* synthetic */ void e(int i6) {
            Object[] objArr = new Object[3];
            if (i6 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // gt.q
        public final boolean c(p.b bVar, gt.n nVar, gt.j jVar) {
            if (jVar != null) {
                return t.c(nVar, jVar);
            }
            e(1);
            throw null;
        }
    }

    /* compiled from: JavaDescriptorVisibilities.java */
    /* loaded from: classes2.dex */
    public static class b extends gt.o {
        public b(lt.c cVar) {
            super(cVar);
        }

        public static /* synthetic */ void e(int i6) {
            Object[] objArr = new Object[3];
            if (i6 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // gt.q
        public final boolean c(p.b bVar, gt.n nVar, gt.j jVar) {
            if (jVar != null) {
                return t.b(bVar, nVar, jVar);
            }
            e(1);
            throw null;
        }
    }

    /* compiled from: JavaDescriptorVisibilities.java */
    /* loaded from: classes2.dex */
    public static class c extends gt.o {
        public c(lt.b bVar) {
            super(bVar);
        }

        public static /* synthetic */ void e(int i6) {
            Object[] objArr = new Object[3];
            if (i6 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // gt.q
        public final boolean c(p.b bVar, gt.n nVar, gt.j jVar) {
            if (jVar != null) {
                return t.b(bVar, nVar, jVar);
            }
            e(1);
            throw null;
        }
    }

    static {
        a aVar = new a(lt.a.f24524c);
        f28954a = aVar;
        b bVar = new b(lt.c.f24526c);
        f28955b = bVar;
        c cVar = new c(lt.b.f24525c);
        f28956c = cVar;
        HashMap hashMap = new HashMap();
        f28957d = hashMap;
        hashMap.put(aVar.f16793a, aVar);
        hashMap.put(bVar.f16793a, bVar);
        hashMap.put(cVar.f16793a, cVar);
    }

    public static /* synthetic */ void a(int i6) {
        String str;
        int i10;
        if (i6 != 5 && i6 != 6) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i6 != 5 && i6 != 6) {
            i10 = 3;
        } else {
            i10 = 2;
        }
        Object[] objArr = new Object[i10];
        switch (i6) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i6 != 5 && i6 != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        } else {
            objArr[1] = "toDescriptorVisibility";
        }
        if (i6 != 2 && i6 != 3) {
            if (i6 != 4) {
                if (i6 != 5 && i6 != 6) {
                    objArr[2] = "isVisibleForProtectedAndPackage";
                }
            } else {
                objArr[2] = "toDescriptorVisibility";
            }
        } else {
            objArr[2] = "areInSamePackage";
        }
        String format = String.format(str, objArr);
        if (i6 == 5 || i6 == 6) {
            throw new IllegalStateException(format);
        }
    }

    public static boolean b(p.b bVar, gt.n nVar, gt.j jVar) {
        if (jVar != null) {
            if (c(iu.g.v(nVar), jVar)) {
                return true;
            }
            return gt.p.f16802c.c(bVar, nVar, jVar);
        }
        a(1);
        throw null;
    }

    public static boolean c(gt.j jVar, gt.j jVar2) {
        if (jVar != null) {
            if (jVar2 != null) {
                gt.d0 d0Var = (gt.d0) iu.g.i(jVar, gt.d0.class, false);
                gt.d0 d0Var2 = (gt.d0) iu.g.i(jVar2, gt.d0.class, false);
                if (d0Var2 == null || d0Var == null || !d0Var.e().equals(d0Var2.e())) {
                    return false;
                }
                return true;
            }
            a(3);
            throw null;
        }
        a(2);
        throw null;
    }
}
