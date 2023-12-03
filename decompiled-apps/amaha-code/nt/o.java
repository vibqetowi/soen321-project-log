package nt;
/* compiled from: ReflectJavaClass.kt */
/* loaded from: classes2.dex */
public final class o extends kotlin.jvm.internal.k implements ss.l<Class<?>, Boolean> {

    /* renamed from: u  reason: collision with root package name */
    public static final o f26823u = new o();

    public o() {
        super(1);
    }

    @Override // ss.l
    public final Boolean invoke(Class<?> cls) {
        boolean z10;
        if (cls.getSimpleName().length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
