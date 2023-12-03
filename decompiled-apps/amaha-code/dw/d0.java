package dw;

import java.lang.annotation.Annotation;
/* compiled from: SkipCallbackExecutorImpl.java */
/* loaded from: classes2.dex */
public final class d0 implements c0 {

    /* renamed from: a  reason: collision with root package name */
    public static final d0 f13547a = new d0();

    @Override // java.lang.annotation.Annotation
    public final Class<? extends Annotation> annotationType() {
        return c0.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        return obj instanceof c0;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@" + c0.class.getName() + "()";
    }
}
