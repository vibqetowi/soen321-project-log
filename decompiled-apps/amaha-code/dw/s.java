package dw;

import dw.f;
import j$.util.Optional;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
/* compiled from: OptionalConverterFactory.java */
/* loaded from: classes2.dex */
public final class s extends f.a {

    /* renamed from: a  reason: collision with root package name */
    public static final s f13601a = new s();

    /* compiled from: OptionalConverterFactory.java */
    /* loaded from: classes2.dex */
    public static final class a<T> implements f<lv.e0, Optional<T>> {

        /* renamed from: a  reason: collision with root package name */
        public final f<lv.e0, T> f13602a;

        public a(f<lv.e0, T> fVar) {
            this.f13602a = fVar;
        }

        @Override // dw.f
        public final Object a(lv.e0 e0Var) {
            return Optional.ofNullable(this.f13602a.a(e0Var));
        }
    }

    @Override // dw.f.a
    public final f<lv.e0, ?> b(Type type, Annotation[] annotationArr, a0 a0Var) {
        if (e0.e(type) != Optional.class) {
            return null;
        }
        return new a(a0Var.e(e0.d(0, (ParameterizedType) type), annotationArr));
    }
}
