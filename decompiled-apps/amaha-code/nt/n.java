package nt;

import java.lang.reflect.Field;
/* compiled from: ReflectJavaClass.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class n extends kotlin.jvm.internal.f implements ss.l<Field, y> {

    /* renamed from: u  reason: collision with root package name */
    public static final n f26822u = new n();

    public n() {
        super(1);
    }

    @Override // kotlin.jvm.internal.a, ys.c
    public final String getName() {
        return "<init>";
    }

    @Override // kotlin.jvm.internal.a
    public final ys.f getOwner() {
        return kotlin.jvm.internal.y.a(y.class);
    }

    @Override // kotlin.jvm.internal.a
    public final String getSignature() {
        return "<init>(Ljava/lang/reflect/Field;)V";
    }

    @Override // ss.l
    public final y invoke(Field field) {
        Field p02 = field;
        kotlin.jvm.internal.i.g(p02, "p0");
        return new y(p02);
    }
}
