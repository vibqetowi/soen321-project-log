package wu;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
/* compiled from: AbstractClassTypeConstructor.java */
/* loaded from: classes2.dex */
public abstract class b extends f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(vu.l lVar) {
        super(lVar);
        if (lVar != null) {
        } else {
            n(0);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void n(int i6) {
        String str;
        int i10;
        String format;
        if (i6 != 1 && i6 != 3 && i6 != 4) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i6 != 1 && i6 != 3 && i6 != 4) {
            i10 = 3;
        } else {
            i10 = 2;
        }
        Object[] objArr = new Object[i10];
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3 && i6 != 4) {
                    objArr[0] = "storageManager";
                }
            } else {
                objArr[0] = "classifier";
            }
            if (i6 == 1) {
                if (i6 != 3 && i6 != 4) {
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
                } else {
                    objArr[1] = "getAdditionalNeighboursInSupertypeGraph";
                }
            } else {
                objArr[1] = "getBuiltIns";
            }
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3 && i6 != 4) {
                        objArr[2] = "<init>";
                    }
                } else {
                    objArr[2] = "isSameClassifier";
                }
            }
            format = String.format(str, objArr);
            if (i6 != 1 || i6 == 3 || i6 == 4) {
                throw new IllegalStateException(format);
            }
            throw new IllegalArgumentException(format);
        }
        objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        if (i6 == 1) {
        }
        if (i6 != 1) {
        }
        format = String.format(str, objArr);
        if (i6 != 1) {
        }
        throw new IllegalStateException(format);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
        if (kotlin.jvm.internal.i.b(((gt.d0) r0).e(), ((gt.d0) r6).e()) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006f, code lost:
        r6 = true;
     */
    @Override // wu.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(gt.g gVar) {
        boolean z10;
        if (!(gVar instanceof gt.e)) {
            return false;
        }
        gt.e first = a();
        kotlin.jvm.internal.i.g(first, "first");
        if (kotlin.jvm.internal.i.b(first.getName(), gVar.getName())) {
            gt.j c10 = first.c();
            gt.j c11 = gVar.c();
            while (true) {
                if (c10 != null && c11 != null) {
                    if (c10 instanceof gt.a0) {
                        z10 = c11 instanceof gt.a0;
                        break;
                    } else if (!(c11 instanceof gt.a0)) {
                        if (c10 instanceof gt.d0) {
                            if (c11 instanceof gt.d0) {
                            }
                        } else if ((c11 instanceof gt.d0) || !kotlin.jvm.internal.i.b(c10.getName(), c11.getName())) {
                            break;
                        } else {
                            c10 = c10.c();
                            c11 = c11.c();
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z10 = false;
        if (!z10) {
            return false;
        }
        return true;
    }

    @Override // wu.f
    public final b0 h() {
        if (dt.j.I(a())) {
            return null;
        }
        return o().f();
    }

    @Override // wu.f
    public final Collection i() {
        gt.j c10 = a().c();
        if (!(c10 instanceof gt.e)) {
            List emptyList = Collections.emptyList();
            if (emptyList != null) {
                return emptyList;
            }
            n(3);
            throw null;
        }
        dv.d dVar = new dv.d();
        gt.e eVar = (gt.e) c10;
        dVar.add(eVar.r());
        eVar.U();
        return dVar;
    }

    @Override // wu.x0
    public final dt.j o() {
        dt.j e10 = mu.a.e(a());
        if (e10 != null) {
            return e10;
        }
        n(1);
        throw null;
    }

    @Override // wu.l, wu.x0
    /* renamed from: p */
    public abstract gt.e a();
}
