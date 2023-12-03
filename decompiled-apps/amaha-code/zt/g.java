package zt;

import zt.b;
/* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
/* loaded from: classes2.dex */
public final class g extends b.a {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b.d f39867b;

    public g(b.d dVar) {
        this.f39867b = dVar;
    }

    @Override // zt.b.a
    public final void f(String[] strArr) {
        if (strArr != null) {
            b.this.f39856e = strArr;
            return;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2", "visitEnd"));
    }
}
