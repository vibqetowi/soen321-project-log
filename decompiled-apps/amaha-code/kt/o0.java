package kt;
/* compiled from: ReceiverParameterDescriptorImpl.java */
/* loaded from: classes2.dex */
public final class o0 extends d {

    /* renamed from: w  reason: collision with root package name */
    public final gt.j f23876w;

    /* renamed from: x  reason: collision with root package name */
    public final qu.d f23877x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(gt.j jVar, qu.a aVar, ht.h hVar) {
        super(hVar);
        if (jVar != null) {
            if (hVar != null) {
                this.f23876w = jVar;
                this.f23877x = aVar;
                return;
            }
            I(2);
            throw null;
        }
        I(0);
        throw null;
    }

    public static /* synthetic */ void I(int i6) {
        String str;
        int i10;
        if (i6 != 3 && i6 != 4) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i6 != 3 && i6 != 4) {
            i10 = 3;
        } else {
            i10 = 2;
        }
        Object[] objArr = new Object[i10];
        switch (i6) {
            case 1:
                objArr[0] = "value";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 5:
                objArr[0] = "newOwner";
                break;
            case 6:
                objArr[0] = "outType";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i6 != 3) {
            if (i6 != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
            } else {
                objArr[1] = "getContainingDeclaration";
            }
        } else {
            objArr[1] = "getValue";
        }
        if (i6 != 3 && i6 != 4) {
            if (i6 != 5) {
                if (i6 != 6) {
                    objArr[2] = "<init>";
                } else {
                    objArr[2] = "setOutType";
                }
            } else {
                objArr[2] = "copy";
            }
        }
        String format = String.format(str, objArr);
        if (i6 == 3 || i6 == 4) {
            throw new IllegalStateException(format);
        }
    }

    @Override // gt.j
    public final gt.j c() {
        gt.j jVar = this.f23876w;
        if (jVar != null) {
            return jVar;
        }
        I(4);
        throw null;
    }

    @Override // gt.n0
    public final qu.d getValue() {
        qu.d dVar = this.f23877x;
        if (dVar != null) {
            return dVar;
        }
        I(3);
        throw null;
    }
}
