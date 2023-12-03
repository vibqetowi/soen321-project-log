package wu;

import gt.t0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
/* compiled from: ClassTypeConstructorImpl.java */
/* loaded from: classes2.dex */
public final class k extends b {

    /* renamed from: c  reason: collision with root package name */
    public final gt.e f37257c;

    /* renamed from: d  reason: collision with root package name */
    public final List<gt.v0> f37258d;

    /* renamed from: e  reason: collision with root package name */
    public final Collection<b0> f37259e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(gt.e eVar, List<? extends gt.v0> list, Collection<b0> collection, vu.l lVar) {
        super(lVar);
        if (eVar != null) {
            if (list != null) {
                if (collection != null) {
                    if (lVar != null) {
                        this.f37257c = eVar;
                        this.f37258d = Collections.unmodifiableList(new ArrayList(list));
                        this.f37259e = Collections.unmodifiableCollection(collection);
                        return;
                    }
                    n(3);
                    throw null;
                }
                n(2);
                throw null;
            }
            n(1);
            throw null;
        }
        n(0);
        throw null;
    }

    public static /* synthetic */ void n(int i6) {
        String str;
        int i10;
        if (i6 != 4 && i6 != 5 && i6 != 6 && i6 != 7) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i6 != 4 && i6 != 5 && i6 != 6 && i6 != 7) {
            i10 = 3;
        } else {
            i10 = 2;
        }
        Object[] objArr = new Object[i10];
        switch (i6) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i6 != 4) {
            if (i6 != 5) {
                if (i6 != 6) {
                    if (i6 != 7) {
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                    } else {
                        objArr[1] = "getSupertypeLoopChecker";
                    }
                } else {
                    objArr[1] = "computeSupertypes";
                }
            } else {
                objArr[1] = "getDeclarationDescriptor";
            }
        } else {
            objArr[1] = "getParameters";
        }
        if (i6 != 4 && i6 != 5 && i6 != 6 && i6 != 7) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i6 == 4 || i6 == 5 || i6 == 6 || i6 == 7) {
            throw new IllegalStateException(format);
        }
    }

    @Override // wu.x0
    public final boolean d() {
        return true;
    }

    @Override // wu.f
    public final Collection<b0> g() {
        Collection<b0> collection = this.f37259e;
        if (collection != null) {
            return collection;
        }
        n(6);
        throw null;
    }

    @Override // wu.x0
    public final List<gt.v0> getParameters() {
        List<gt.v0> list = this.f37258d;
        if (list != null) {
            return list;
        }
        n(4);
        throw null;
    }

    @Override // wu.f
    public final gt.t0 j() {
        return t0.a.f16820a;
    }

    @Override // wu.b
    public final gt.e p() {
        gt.e eVar = this.f37257c;
        if (eVar != null) {
            return eVar;
        }
        n(5);
        throw null;
    }

    public final String toString() {
        String str = iu.g.g(this.f37257c).f15926a;
        if (str != null) {
            return str;
        }
        fu.d.a(4);
        throw null;
    }
}
