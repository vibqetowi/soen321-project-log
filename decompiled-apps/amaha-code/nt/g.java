package nt;

import java.lang.annotation.Annotation;
/* compiled from: ReflectJavaAnnotationArguments.kt */
/* loaded from: classes2.dex */
public final class g extends f implements wt.c {

    /* renamed from: b  reason: collision with root package name */
    public final Annotation f26807b;

    public g(fu.e eVar, Annotation annotation) {
        super(eVar);
        this.f26807b = annotation;
    }

    @Override // wt.c
    public final e a() {
        return new e(this.f26807b);
    }
}
