package nt;

import gt.c1;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import nt.b;
import nt.c0;
import nt.h;
import vr.b1;
/* compiled from: ReflectJavaClass.kt */
/* loaded from: classes2.dex */
public final class s extends w implements h, c0, wt.g {

    /* renamed from: a  reason: collision with root package name */
    public final Class<?> f26827a;

    public s(Class<?> klass) {
        kotlin.jvm.internal.i.g(klass, "klass");
        this.f26827a = klass;
    }

    @Override // wt.g
    public final boolean D() {
        return this.f26827a.isEnum();
    }

    @Override // wt.g
    public final boolean F() {
        Class<?> clazz = this.f26827a;
        kotlin.jvm.internal.i.g(clazz, "clazz");
        b.a aVar = b.f26785a;
        Boolean bool = null;
        if (aVar == null) {
            try {
                aVar = new b.a(Class.class.getMethod("isSealed", new Class[0]), Class.class.getMethod("getPermittedSubclasses", new Class[0]), Class.class.getMethod("isRecord", new Class[0]), Class.class.getMethod("getRecordComponents", new Class[0]));
            } catch (NoSuchMethodException unused) {
                aVar = new b.a(null, null, null, null);
            }
            b.f26785a = aVar;
        }
        Method method = aVar.f26786a;
        if (method != null) {
            Object invoke = method.invoke(clazz, new Object[0]);
            kotlin.jvm.internal.i.e(invoke, "null cannot be cast to non-null type kotlin.Boolean");
            bool = (Boolean) invoke;
        }
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // wt.g
    public final boolean I() {
        return this.f26827a.isInterface();
    }

    @Override // wt.g
    public final Collection<wt.j> N() {
        Class<?> clazz = this.f26827a;
        kotlin.jvm.internal.i.g(clazz, "clazz");
        b.a aVar = b.f26785a;
        Class[] clsArr = null;
        if (aVar == null) {
            try {
                aVar = new b.a(Class.class.getMethod("isSealed", new Class[0]), Class.class.getMethod("getPermittedSubclasses", new Class[0]), Class.class.getMethod("isRecord", new Class[0]), Class.class.getMethod("getRecordComponents", new Class[0]));
            } catch (NoSuchMethodException unused) {
                aVar = new b.a(null, null, null, null);
            }
            b.f26785a = aVar;
        }
        Method method = aVar.f26787b;
        if (method != null) {
            Object invoke = method.invoke(clazz, new Object[0]);
            kotlin.jvm.internal.i.e(invoke, "null cannot be cast to non-null type kotlin.Array<java.lang.Class<*>>");
            clsArr = (Class[]) invoke;
        }
        if (clsArr != null) {
            ArrayList arrayList = new ArrayList(clsArr.length);
            for (Class cls : clsArr) {
                arrayList.add(new u(cls));
            }
            return arrayList;
        }
        return is.w.f20676u;
    }

    @Override // wt.g
    public final List Q() {
        Class<?>[] declaredClasses = this.f26827a.getDeclaredClasses();
        kotlin.jvm.internal.i.f(declaredClasses, "klass.declaredClasses");
        return ca.a.a1(fv.t.J0(fv.t.H0(fv.t.C0(is.k.P1(declaredClasses), o.f26823u), p.f26824u)));
    }

    @Override // wt.g
    public final Collection<wt.j> c() {
        Class<?> cls = this.f26827a;
        Object obj = Object.class;
        if (kotlin.jvm.internal.i.b(cls, obj)) {
            return is.w.f20676u;
        }
        b1 b1Var = new b1(2);
        Object genericSuperclass = cls.getGenericSuperclass();
        if (genericSuperclass != null) {
            obj = genericSuperclass;
        }
        b1Var.a(obj);
        Type[] genericInterfaces = cls.getGenericInterfaces();
        kotlin.jvm.internal.i.f(genericInterfaces, "klass.genericInterfaces");
        b1Var.b(genericInterfaces);
        List<Type> P0 = ca.a.P0(b1Var.e(new Type[b1Var.d()]));
        ArrayList arrayList = new ArrayList(is.i.H1(P0, 10));
        for (Type type : P0) {
            arrayList.add(new u(type));
        }
        return arrayList;
    }

    @Override // wt.g
    public final fu.c e() {
        fu.c b10 = d.a(this.f26827a).b();
        kotlin.jvm.internal.i.f(b10, "klass.classId.asSingleFqName()");
        return b10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            if (kotlin.jvm.internal.i.b(this.f26827a, ((s) obj).f26827a)) {
                return true;
            }
        }
        return false;
    }

    @Override // wt.d
    public final Collection getAnnotations() {
        return h.a.b(this);
    }

    @Override // nt.c0
    public final int getModifiers() {
        return this.f26827a.getModifiers();
    }

    @Override // wt.s
    public final fu.e getName() {
        return fu.e.j(this.f26827a.getSimpleName());
    }

    @Override // wt.y
    public final ArrayList getTypeParameters() {
        TypeVariable<Class<?>>[] typeParameters = this.f26827a.getTypeParameters();
        kotlin.jvm.internal.i.f(typeParameters, "klass.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Class<?>> typeVariable : typeParameters) {
            arrayList.add(new h0(typeVariable));
        }
        return arrayList;
    }

    @Override // wt.r
    public final c1 getVisibility() {
        return c0.a.a(this);
    }

    public final int hashCode() {
        return this.f26827a.hashCode();
    }

    @Override // wt.r
    public final boolean isAbstract() {
        return Modifier.isAbstract(getModifiers());
    }

    @Override // wt.r
    public final boolean isFinal() {
        return Modifier.isFinal(getModifiers());
    }

    @Override // wt.r
    public final boolean j() {
        return Modifier.isStatic(getModifiers());
    }

    @Override // wt.g
    public final List k() {
        Constructor<?>[] declaredConstructors = this.f26827a.getDeclaredConstructors();
        kotlin.jvm.internal.i.f(declaredConstructors, "klass.declaredConstructors");
        return ca.a.a1(fv.t.J0(fv.t.G0(fv.t.C0(is.k.P1(declaredConstructors), k.f26819u), l.f26820u)));
    }

    @Override // wt.d
    public final wt.a l(fu.c cVar) {
        return h.a.a(this, cVar);
    }

    @Override // wt.g
    public final ArrayList n() {
        Class<?> clazz = this.f26827a;
        kotlin.jvm.internal.i.g(clazz, "clazz");
        b.a aVar = b.f26785a;
        Object[] objArr = null;
        if (aVar == null) {
            try {
                aVar = new b.a(Class.class.getMethod("isSealed", new Class[0]), Class.class.getMethod("getPermittedSubclasses", new Class[0]), Class.class.getMethod("isRecord", new Class[0]), Class.class.getMethod("getRecordComponents", new Class[0]));
            } catch (NoSuchMethodException unused) {
                aVar = new b.a(null, null, null, null);
            }
            b.f26785a = aVar;
        }
        Method method = aVar.f26789d;
        if (method != null) {
            objArr = (Object[]) method.invoke(clazz, new Object[0]);
        }
        if (objArr == null) {
            objArr = new Object[0];
        }
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(new f0(obj));
        }
        return arrayList;
    }

    @Override // wt.g
    public final boolean r() {
        return this.f26827a.isAnnotation();
    }

    @Override // wt.g
    public final s s() {
        Class<?> declaringClass = this.f26827a.getDeclaringClass();
        if (declaringClass != null) {
            return new s(declaringClass);
        }
        return null;
    }

    @Override // wt.g
    public final List t() {
        Field[] declaredFields = this.f26827a.getDeclaredFields();
        kotlin.jvm.internal.i.f(declaredFields, "klass.declaredFields");
        return ca.a.a1(fv.t.J0(fv.t.G0(fv.t.C0(is.k.P1(declaredFields), m.f26821u), n.f26822u)));
    }

    public final String toString() {
        return s.class.getName() + ": " + this.f26827a;
    }

    @Override // wt.g
    public final boolean u() {
        Class<?> clazz = this.f26827a;
        kotlin.jvm.internal.i.g(clazz, "clazz");
        b.a aVar = b.f26785a;
        Boolean bool = null;
        if (aVar == null) {
            try {
                aVar = new b.a(Class.class.getMethod("isSealed", new Class[0]), Class.class.getMethod("getPermittedSubclasses", new Class[0]), Class.class.getMethod("isRecord", new Class[0]), Class.class.getMethod("getRecordComponents", new Class[0]));
            } catch (NoSuchMethodException unused) {
                aVar = new b.a(null, null, null, null);
            }
            b.f26785a = aVar;
        }
        Method method = aVar.f26788c;
        if (method != null) {
            Object invoke = method.invoke(clazz, new Object[0]);
            kotlin.jvm.internal.i.e(invoke, "null cannot be cast to non-null type kotlin.Boolean");
            bool = (Boolean) invoke;
        }
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // wt.g
    public final List x() {
        Method[] declaredMethods = this.f26827a.getDeclaredMethods();
        kotlin.jvm.internal.i.f(declaredMethods, "klass.declaredMethods");
        return ca.a.a1(fv.t.J0(fv.t.G0(fv.t.B0(is.k.P1(declaredMethods), new q(this)), r.f26826u)));
    }

    @Override // nt.h
    public final AnnotatedElement z() {
        return this.f26827a;
    }

    @Override // wt.g
    public final void J() {
    }

    @Override // wt.d
    public final void o() {
    }

    @Override // wt.g
    public final void w() {
    }
}
