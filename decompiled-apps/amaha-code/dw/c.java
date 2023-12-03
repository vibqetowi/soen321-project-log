package dw;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
/* compiled from: CallAdapter.java */
/* loaded from: classes2.dex */
public interface c<R, T> {

    /* compiled from: CallAdapter.java */
    /* loaded from: classes2.dex */
    public static abstract class a {
        public abstract c a(Type type, Annotation[] annotationArr);
    }

    Object a(r rVar);

    Type b();
}
