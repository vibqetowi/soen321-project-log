package nt;
/* compiled from: ReflectJavaClass.kt */
/* loaded from: classes2.dex */
public final class p extends kotlin.jvm.internal.k implements ss.l<Class<?>, fu.e> {

    /* renamed from: u  reason: collision with root package name */
    public static final p f26824u = new p();

    public p() {
        super(1);
    }

    @Override // ss.l
    public final fu.e invoke(Class<?> cls) {
        String simpleName = cls.getSimpleName();
        if (!fu.e.k(simpleName)) {
            simpleName = null;
        }
        if (simpleName == null) {
            return null;
        }
        return fu.e.j(simpleName);
    }
}
