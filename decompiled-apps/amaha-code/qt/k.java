package qt;
/* compiled from: SignaturePropagator.java */
/* loaded from: classes2.dex */
public interface k {

    /* renamed from: a  reason: collision with root package name */
    public static final a f30134a = new a();

    /* compiled from: SignaturePropagator.java */
    /* loaded from: classes2.dex */
    public static class a implements k {
        public static /* synthetic */ void a(int i6) {
            Object[] objArr = new Object[3];
            switch (i6) {
                case 1:
                    objArr[0] = "owner";
                    break;
                case 2:
                    objArr[0] = "returnType";
                    break;
                case 3:
                    objArr[0] = "valueParameters";
                    break;
                case 4:
                    objArr[0] = "typeParameters";
                    break;
                case 5:
                    objArr[0] = "descriptor";
                    break;
                case 6:
                    objArr[0] = "signatureErrors";
                    break;
                default:
                    objArr[0] = "method";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
            if (i6 != 5 && i6 != 6) {
                objArr[2] = "resolvePropagatedSignature";
            } else {
                objArr[2] = "reportSignatureErrors";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    }

    /* compiled from: SignaturePropagator.java */
    /* loaded from: classes2.dex */
    public static class b {
        public static /* synthetic */ void a(int i6) {
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
                    objArr[0] = "valueParameters";
                    break;
                case 2:
                    objArr[0] = "typeParameters";
                    break;
                case 3:
                    objArr[0] = "signatureErrors";
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
                    break;
                default:
                    objArr[0] = "returnType";
                    break;
            }
            if (i6 != 4) {
                if (i6 != 5) {
                    if (i6 != 6) {
                        if (i6 != 7) {
                            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
                        } else {
                            objArr[1] = "getErrors";
                        }
                    } else {
                        objArr[1] = "getTypeParameters";
                    }
                } else {
                    objArr[1] = "getValueParameters";
                }
            } else {
                objArr[1] = "getReturnType";
            }
            if (i6 != 4 && i6 != 5 && i6 != 6 && i6 != 7) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i6 == 4 || i6 == 5 || i6 == 6 || i6 == 7) {
                throw new IllegalStateException(format);
            }
        }
    }
}
