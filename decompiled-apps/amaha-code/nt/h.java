package nt;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.util.List;
/* compiled from: ReflectJavaAnnotationOwner.kt */
/* loaded from: classes2.dex */
public interface h extends wt.d {

    /* compiled from: ReflectJavaAnnotationOwner.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static e a(h hVar, fu.c fqName) {
            Annotation[] declaredAnnotations;
            kotlin.jvm.internal.i.g(fqName, "fqName");
            AnnotatedElement z10 = hVar.z();
            if (z10 != null && (declaredAnnotations = z10.getDeclaredAnnotations()) != null) {
                return sp.b.q(declaredAnnotations, fqName);
            }
            return null;
        }

        public static List<e> b(h hVar) {
            Annotation[] declaredAnnotations;
            AnnotatedElement z10 = hVar.z();
            if (z10 != null && (declaredAnnotations = z10.getDeclaredAnnotations()) != null) {
                return sp.b.s(declaredAnnotations);
            }
            return is.w.f20676u;
        }
    }

    AnnotatedElement z();
}
