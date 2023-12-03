package zt;

import zt.b;
/* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
/* loaded from: classes2.dex */
public final class f extends b.a {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b.d f39866b;

    public f(b.d dVar) {
        this.f39866b = dVar;
    }

    @Override // zt.b.a
    public final void f(String[] strArr) {
        if (strArr != null) {
            b.this.f39855d = strArr;
            return;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1", "visitEnd"));
    }
}
