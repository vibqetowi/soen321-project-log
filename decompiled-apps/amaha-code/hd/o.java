package hd;

import java.lang.annotation.Annotation;
/* compiled from: Qualified.java */
/* loaded from: classes.dex */
public final class o<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Class<? extends Annotation> f17438a;

    /* renamed from: b  reason: collision with root package name */
    public final Class<T> f17439b;

    /* compiled from: Qualified.java */
    /* loaded from: classes.dex */
    public @interface a {
    }

    public o(Class<? extends Annotation> cls, Class<T> cls2) {
        this.f17438a = cls;
        this.f17439b = cls2;
    }

    public static <T> o<T> a(Class<T> cls) {
        return new o<>(a.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        if (!this.f17439b.equals(oVar.f17439b)) {
            return false;
        }
        return this.f17438a.equals(oVar.f17438a);
    }

    public final int hashCode() {
        return this.f17438a.hashCode() + (this.f17439b.hashCode() * 31);
    }

    public final String toString() {
        Class<T> cls = this.f17439b;
        Class<? extends Annotation> cls2 = this.f17438a;
        if (cls2 == a.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
