package mt;

import gv.n;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.i;
import yt.b;
import yt.h;
import yt.o;
import zt.a;
/* compiled from: ReflectKotlinClass.kt */
/* loaded from: classes2.dex */
public final class c implements o {

    /* renamed from: a  reason: collision with root package name */
    public final Class<?> f25737a;

    /* renamed from: b  reason: collision with root package name */
    public final zt.a f25738b;

    /* compiled from: ReflectKotlinClass.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
            if (r0.f39855d == null) goto L31;
         */
        /* JADX WARN: Removed duplicated region for block: B:32:0x006c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x006d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static c a(Class klass) {
            zt.a aVar;
            boolean z10;
            i.g(klass, "klass");
            zt.b bVar = new zt.b();
            hc.d.X(klass, bVar);
            if (bVar.f39857g != null && bVar.f39852a != null) {
                int[] iArr = bVar.f39852a;
                boolean z11 = true;
                if ((bVar.f39854c & 8) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                eu.e eVar = new eu.e(iArr, z10);
                if (!eVar.c()) {
                    bVar.f = bVar.f39855d;
                    bVar.f39855d = null;
                } else {
                    a.EnumC0686a enumC0686a = bVar.f39857g;
                    if (enumC0686a != a.EnumC0686a.CLASS && enumC0686a != a.EnumC0686a.FILE_FACADE && enumC0686a != a.EnumC0686a.MULTIFILE_CLASS_PART) {
                        z11 = false;
                    }
                    if (z11) {
                    }
                }
                String[] strArr = bVar.f39858h;
                if (strArr != null) {
                    eu.a.b(strArr);
                }
                aVar = new zt.a(bVar.f39857g, eVar, bVar.f39855d, bVar.f, bVar.f39856e, bVar.f39853b, bVar.f39854c);
                if (aVar != null) {
                    return null;
                }
                return new c(klass, aVar);
            }
            aVar = null;
            if (aVar != null) {
            }
        }
    }

    public c() {
        throw null;
    }

    public c(Class cls, zt.a aVar) {
        this.f25737a = cls;
        this.f25738b = aVar;
    }

    @Override // yt.o
    public final zt.a a() {
        return this.f25738b;
    }

    @Override // yt.o
    public final void b(yt.b bVar) {
        String str;
        String str2;
        String str3;
        boolean z10;
        Class<?> klass = this.f25737a;
        i.g(klass, "klass");
        Method[] declaredMethods = klass.getDeclaredMethods();
        i.f(declaredMethods, "klass.declaredMethods");
        int length = declaredMethods.length;
        int i6 = 0;
        while (true) {
            str = "annotations";
            str2 = "parameterType";
            str3 = "sb.toString()";
            if (i6 >= length) {
                break;
            }
            Method method = declaredMethods[i6];
            fu.e j10 = fu.e.j(method.getName());
            StringBuilder sb2 = new StringBuilder("(");
            Class<?>[] parameterTypes = method.getParameterTypes();
            i.f(parameterTypes, "method.parameterTypes");
            for (Class<?> parameterType : parameterTypes) {
                i.f(parameterType, "parameterType");
                sb2.append(nt.d.b(parameterType));
            }
            sb2.append(")");
            Class<?> returnType = method.getReturnType();
            i.f(returnType, "method.returnType");
            sb2.append(nt.d.b(returnType));
            String sb3 = sb2.toString();
            i.f(sb3, "sb.toString()");
            b.a b10 = bVar.b(j10, sb3);
            Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
            i.f(declaredAnnotations, "method.declaredAnnotations");
            for (Annotation annotation : declaredAnnotations) {
                i.f(annotation, "annotation");
                hc.d.c0(b10, annotation);
            }
            Annotation[][] parameterAnnotations = method.getParameterAnnotations();
            i.f(parameterAnnotations, "method.parameterAnnotations");
            Annotation[][] annotationArr = parameterAnnotations;
            int length2 = annotationArr.length;
            for (int i10 = 0; i10 < length2; i10++) {
                Annotation[] annotations = annotationArr[i10];
                i.f(annotations, "annotations");
                int length3 = annotations.length;
                int i11 = 0;
                while (i11 < length3) {
                    Annotation annotation2 = annotations[i11];
                    Class C = sp.b.C(sp.b.r(annotation2));
                    Method[] methodArr = declaredMethods;
                    h c10 = b10.c(i10, nt.d.a(C), new mt.a(annotation2));
                    if (c10 != null) {
                        hc.d.d0(c10, annotation2, C);
                    }
                    i11++;
                    declaredMethods = methodArr;
                }
            }
            b10.a();
            i6++;
            declaredMethods = declaredMethods;
        }
        Constructor<?>[] declaredConstructors = klass.getDeclaredConstructors();
        i.f(declaredConstructors, "klass.declaredConstructors");
        int length4 = declaredConstructors.length;
        int i12 = 0;
        while (i12 < length4) {
            Constructor<?> constructor = declaredConstructors[i12];
            fu.e eVar = fu.g.f15937e;
            i.f(constructor, "constructor");
            StringBuilder sb4 = new StringBuilder("(");
            Class<?>[] parameterTypes2 = constructor.getParameterTypes();
            i.f(parameterTypes2, "constructor.parameterTypes");
            int length5 = parameterTypes2.length;
            int i13 = 0;
            while (i13 < length5) {
                Constructor<?>[] constructorArr = declaredConstructors;
                Class<?> cls = parameterTypes2[i13];
                i.f(cls, str2);
                sb4.append(nt.d.b(cls));
                i13++;
                declaredConstructors = constructorArr;
            }
            Constructor<?>[] constructorArr2 = declaredConstructors;
            sb4.append(")V");
            String sb5 = sb4.toString();
            i.f(sb5, str3);
            b.a b11 = bVar.b(eVar, sb5);
            Annotation[] declaredAnnotations2 = constructor.getDeclaredAnnotations();
            i.f(declaredAnnotations2, "constructor.declaredAnnotations");
            for (Annotation annotation3 : declaredAnnotations2) {
                i.f(annotation3, "annotation");
                hc.d.c0(b11, annotation3);
            }
            Annotation[][] parameterAnnotations2 = constructor.getParameterAnnotations();
            i.f(parameterAnnotations2, "parameterAnnotations");
            if (parameterAnnotations2.length == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                int length6 = constructor.getParameterTypes().length - parameterAnnotations2.length;
                int length7 = parameterAnnotations2.length;
                int i14 = 0;
                while (i14 < length7) {
                    Annotation[] annotationArr2 = parameterAnnotations2[i14];
                    i.f(annotationArr2, str);
                    int length8 = annotationArr2.length;
                    int i15 = length4;
                    int i16 = 0;
                    while (i16 < length8) {
                        Annotation[][] annotationArr3 = parameterAnnotations2;
                        Annotation annotation4 = annotationArr2[i16];
                        String str4 = str;
                        Class C2 = sp.b.C(sp.b.r(annotation4));
                        String str5 = str2;
                        int i17 = length6;
                        String str6 = str3;
                        h c11 = b11.c(i14 + length6, nt.d.a(C2), new mt.a(annotation4));
                        if (c11 != null) {
                            hc.d.d0(c11, annotation4, C2);
                        }
                        i16++;
                        parameterAnnotations2 = annotationArr3;
                        str2 = str5;
                        str = str4;
                        length6 = i17;
                        str3 = str6;
                    }
                    i14++;
                    length4 = i15;
                }
            }
            b11.a();
            i12++;
            declaredConstructors = constructorArr2;
            length4 = length4;
            str2 = str2;
            str = str;
            str3 = str3;
        }
        Field[] declaredFields = klass.getDeclaredFields();
        i.f(declaredFields, "klass.declaredFields");
        for (Field field : declaredFields) {
            fu.e j11 = fu.e.j(field.getName());
            Class<?> type = field.getType();
            i.f(type, "field.type");
            b.C0660b a10 = bVar.a(j11, nt.d.b(type));
            Annotation[] declaredAnnotations3 = field.getDeclaredAnnotations();
            i.f(declaredAnnotations3, "field.declaredAnnotations");
            for (Annotation annotation5 : declaredAnnotations3) {
                i.f(annotation5, "annotation");
                hc.d.c0(a10, annotation5);
            }
            a10.a();
        }
    }

    @Override // yt.o
    public final void c(o.c cVar) {
        hc.d.X(this.f25737a, cVar);
    }

    @Override // yt.o
    public final String d() {
        return n.E0(this.f25737a.getName(), '.', '/').concat(".class");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (i.b(this.f25737a, ((c) obj).f25737a)) {
                return true;
            }
        }
        return false;
    }

    @Override // yt.o
    public final fu.b g() {
        return nt.d.a(this.f25737a);
    }

    public final int hashCode() {
        return this.f25737a.hashCode();
    }

    public final String toString() {
        return c.class.getName() + ": " + this.f25737a;
    }
}
