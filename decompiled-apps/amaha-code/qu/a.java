package qu;

import wu.b0;
/* compiled from: AbstractReceiverValue.java */
/* loaded from: classes2.dex */
public abstract class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public final b0 f30135a;

    /* renamed from: b  reason: collision with root package name */
    public final d f30136b;

    public a(b0 b0Var, d dVar) {
        if (b0Var != null) {
            this.f30135a = b0Var;
            this.f30136b = dVar == null ? this : dVar;
            return;
        }
        c(0);
        throw null;
    }

    public static /* synthetic */ void c(int i6) {
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
            objArr[0] = "receiverType";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        }
        if (i6 != 1) {
            if (i6 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
            } else {
                objArr[1] = "getOriginal";
            }
        } else {
            objArr[1] = "getType";
        }
        if (i6 != 1 && i6 != 2) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i6 == 1 || i6 == 2) {
            throw new IllegalStateException(format);
        }
    }

    @Override // qu.d
    public final b0 a() {
        b0 b0Var = this.f30135a;
        if (b0Var != null) {
            return b0Var;
        }
        c(1);
        throw null;
    }
}
