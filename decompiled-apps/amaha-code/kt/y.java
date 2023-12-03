package kt;

import ht.h;
/* compiled from: LazyClassReceiverParameterDescriptor.java */
/* loaded from: classes2.dex */
public final class y extends d {

    /* renamed from: w  reason: collision with root package name */
    public final gt.e f23928w;

    /* renamed from: x  reason: collision with root package name */
    public final qu.c f23929x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(b bVar) {
        super(h.a.f19495a);
        if (bVar != null) {
            this.f23928w = bVar;
            this.f23929x = new qu.c(bVar);
            return;
        }
        I(0);
        throw null;
    }

    public static /* synthetic */ void I(int i6) {
        String str;
        int i10;
        if (i6 != 1 && i6 != 2) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i6 != 1 && i6 != 2) {
            i10 = 3;
        } else {
            i10 = 2;
        }
        Object[] objArr = new Object[i10];
        if (i6 != 1 && i6 != 2) {
            if (i6 != 3) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "newOwner";
            }
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        }
        if (i6 != 1) {
            if (i6 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
            } else {
                objArr[1] = "getContainingDeclaration";
            }
        } else {
            objArr[1] = "getValue";
        }
        if (i6 != 1 && i6 != 2) {
            if (i6 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String format = String.format(str, objArr);
        if (i6 == 1 || i6 == 2) {
            throw new IllegalStateException(format);
        }
    }

    @Override // gt.j
    public final gt.j c() {
        gt.e eVar = this.f23928w;
        if (eVar != null) {
            return eVar;
        }
        I(2);
        throw null;
    }

    @Override // gt.n0
    public final qu.d getValue() {
        qu.c cVar = this.f23929x;
        if (cVar != null) {
            return cVar;
        }
        I(1);
        throw null;
    }

    @Override // kt.p
    public final String toString() {
        return "class " + this.f23928w.getName() + "::this";
    }
}
