package zt;

import zt.b;
/* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
/* loaded from: classes2.dex */
public final class c extends b.a {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b.C0687b f39863b;

    public c(b.C0687b c0687b) {
        this.f39863b = c0687b;
    }

    @Override // zt.b.a
    public final void f(String[] strArr) {
        if (strArr != null) {
            b.this.f39855d = strArr;
            return;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1", "visitEnd"));
    }
}
