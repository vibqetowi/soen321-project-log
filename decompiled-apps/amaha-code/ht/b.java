package ht;
/* compiled from: AnnotatedImpl.java */
/* loaded from: classes2.dex */
public class b implements a {

    /* renamed from: u  reason: collision with root package name */
    public final h f19479u;

    public b(h hVar) {
        if (hVar != null) {
            this.f19479u = hVar;
        } else {
            I(0);
            throw null;
        }
    }

    public static /* synthetic */ void I(int i6) {
        String str;
        int i10;
        if (i6 != 1) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i6 != 1) {
            i10 = 3;
        } else {
            i10 = 2;
        }
        Object[] objArr = new Object[i10];
        if (i6 != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i6 != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i6 != 1) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i6 != 1) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // ht.a
    public h getAnnotations() {
        h hVar = this.f19479u;
        if (hVar != null) {
            return hVar;
        }
        I(1);
        throw null;
    }
}
