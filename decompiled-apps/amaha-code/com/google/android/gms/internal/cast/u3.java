package com.google.android.gms.internal.cast;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class u3 implements b4 {

    /* renamed from: a  reason: collision with root package name */
    public final b4[] f7647a;

    public u3(b4... b4VarArr) {
        this.f7647a = b4VarArr;
    }

    @Override // com.google.android.gms.internal.cast.b4
    public final boolean a(Class<?> cls) {
        for (int i6 = 0; i6 < 2; i6++) {
            if (this.f7647a[i6].a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.cast.b4
    public final a4 b(Class<?> cls) {
        String str;
        for (int i6 = 0; i6 < 2; i6++) {
            b4 b4Var = this.f7647a[i6];
            if (b4Var.a(cls)) {
                return b4Var.b(cls);
            }
        }
        String name = cls.getName();
        if (name.length() != 0) {
            str = "No factory is available for message type: ".concat(name);
        } else {
            str = new String("No factory is available for message type: ");
        }
        throw new UnsupportedOperationException(str);
    }
}
