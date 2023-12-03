package zt;

import zt.b;
/* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
/* loaded from: classes2.dex */
public final class e extends b.a {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b.c f39865b;

    public e(b.c cVar) {
        this.f39865b = cVar;
    }

    @Override // zt.b.a
    public final void f(String[] strArr) {
        if (strArr != null) {
            b.this.f39858h = strArr;
            return;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1", "visitEnd"));
    }
}
