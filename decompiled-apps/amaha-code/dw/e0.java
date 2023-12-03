package dw;

import j$.util.Objects;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Map;
import java.util.NoSuchElementException;
/* compiled from: Utils.java */
/* loaded from: classes2.dex */
public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Type[] f13554a = new Type[0];

    /* compiled from: Utils.java */
    /* loaded from: classes2.dex */
    public static final class a implements GenericArrayType {

        /* renamed from: u  reason: collision with root package name */
        public final Type f13555u;

        public a(Type type) {
            this.f13555u = type;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof GenericArrayType) && e0.b(this, (GenericArrayType) obj)) {
                return true;
            }
            return false;
        }

        @Override // java.lang.reflect.GenericArrayType
        public final Type getGenericComponentType() {
            return this.f13555u;
        }

        public final int hashCode() {
            return this.f13555u.hashCode();
        }

        public final String toString() {
            return e0.n(this.f13555u) + "[]";
        }
    }

    /* compiled from: Utils.java */
    /* loaded from: classes2.dex */
    public static final class b implements ParameterizedType {

        /* renamed from: u  reason: collision with root package name */
        public final Type f13556u;

        /* renamed from: v  reason: collision with root package name */
        public final Type f13557v;

        /* renamed from: w  reason: collision with root package name */
        public final Type[] f13558w;

        public b(Type type, Type type2, Type... typeArr) {
            boolean z10;
            if (type2 instanceof Class) {
                if (type == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 != (((Class) type2).getEnclosingClass() == null)) {
                    throw new IllegalArgumentException();
                }
            }
            for (Type type3 : typeArr) {
                Objects.requireNonNull(type3, "typeArgument == null");
                e0.a(type3);
            }
            this.f13556u = type;
            this.f13557v = type2;
            this.f13558w = (Type[]) typeArr.clone();
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof ParameterizedType) && e0.b(this, (ParameterizedType) obj)) {
                return true;
            }
            return false;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type[] getActualTypeArguments() {
            return (Type[]) this.f13558w.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getOwnerType() {
            return this.f13556u;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getRawType() {
            return this.f13557v;
        }

        public final int hashCode() {
            int i6;
            int hashCode = Arrays.hashCode(this.f13558w) ^ this.f13557v.hashCode();
            Type type = this.f13556u;
            if (type != null) {
                i6 = type.hashCode();
            } else {
                i6 = 0;
            }
            return hashCode ^ i6;
        }

        public final String toString() {
            Type[] typeArr = this.f13558w;
            int length = typeArr.length;
            Type type = this.f13557v;
            if (length == 0) {
                return e0.n(type);
            }
            StringBuilder sb2 = new StringBuilder((typeArr.length + 1) * 30);
            sb2.append(e0.n(type));
            sb2.append("<");
            sb2.append(e0.n(typeArr[0]));
            for (int i6 = 1; i6 < typeArr.length; i6++) {
                sb2.append(", ");
                sb2.append(e0.n(typeArr[i6]));
            }
            sb2.append(">");
            return sb2.toString();
        }
    }

    /* compiled from: Utils.java */
    /* loaded from: classes2.dex */
    public static final class c implements WildcardType {

        /* renamed from: u  reason: collision with root package name */
        public final Type f13559u;

        /* renamed from: v  reason: collision with root package name */
        public final Type f13560v;

        public c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length <= 1) {
                if (typeArr.length == 1) {
                    if (typeArr2.length == 1) {
                        Type type = typeArr2[0];
                        type.getClass();
                        e0.a(type);
                        if (typeArr[0] == Object.class) {
                            this.f13560v = typeArr2[0];
                            this.f13559u = Object.class;
                            return;
                        }
                        throw new IllegalArgumentException();
                    }
                    Type type2 = typeArr[0];
                    type2.getClass();
                    e0.a(type2);
                    this.f13560v = null;
                    this.f13559u = typeArr[0];
                    return;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof WildcardType) && e0.b(this, (WildcardType) obj)) {
                return true;
            }
            return false;
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getLowerBounds() {
            Type type = this.f13560v;
            return type != null ? new Type[]{type} : e0.f13554a;
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getUpperBounds() {
            return new Type[]{this.f13559u};
        }

        public final int hashCode() {
            int i6;
            Type type = this.f13560v;
            if (type != null) {
                i6 = type.hashCode() + 31;
            } else {
                i6 = 1;
            }
            return i6 ^ (this.f13559u.hashCode() + 31);
        }

        public final String toString() {
            Type type = this.f13560v;
            if (type != null) {
                return "? super " + e0.n(type);
            }
            Type type2 = this.f13559u;
            if (type2 == Object.class) {
                return "?";
            }
            return "? extends " + e0.n(type2);
        }
    }

    public static void a(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    public static boolean b(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            if ((ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                return true;
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return b(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        } else if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            if (Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                return true;
            }
            return false;
        } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        } else {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            if (typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName())) {
                return true;
            }
            return false;
        }
    }

    public static Type c(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i6 = 0; i6 < length; i6++) {
                Class<?> cls3 = interfaces[i6];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i6];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return c(cls.getGenericInterfaces()[i6], interfaces[i6], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return c(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Type d(int i6, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i6 >= 0 && i6 < actualTypeArguments.length) {
            Type type = actualTypeArguments[i6];
            if (type instanceof WildcardType) {
                return ((WildcardType) type).getUpperBounds()[0];
            }
            return type;
        }
        StringBuilder u10 = defpackage.c.u("Index ", i6, " not in range [0,");
        u10.append(actualTypeArguments.length);
        u10.append(") for ");
        u10.append(parameterizedType);
        throw new IllegalArgumentException(u10.toString());
    }

    public static Class<?> e(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(e(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return e(((WildcardType) type).getUpperBounds()[0]);
            }
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
        }
    }

    public static Type f(Type type, Class cls) {
        if (Map.class.isAssignableFrom(cls)) {
            return l(type, cls, c(type, cls, Map.class));
        }
        throw new IllegalArgumentException();
    }

    public static boolean g(Type type) {
        String name;
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (g(type2)) {
                    return true;
                }
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            return g(((GenericArrayType) type).getGenericComponentType());
        } else {
            if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
                return true;
            }
            if (type == null) {
                name = "null";
            } else {
                name = type.getClass().getName();
            }
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
        }
    }

    public static boolean h(Annotation[] annotationArr, Class<? extends Annotation> cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    public static IllegalArgumentException i(Method method, Exception exc, String str, Object... objArr) {
        StringBuilder d10 = v.g.d(String.format(str, objArr), "\n    for method ");
        d10.append(method.getDeclaringClass().getSimpleName());
        d10.append(".");
        d10.append(method.getName());
        return new IllegalArgumentException(d10.toString(), exc);
    }

    public static IllegalArgumentException j(Method method, int i6, String str, Object... objArr) {
        StringBuilder d10 = v.g.d(str, " (parameter #");
        d10.append(i6 + 1);
        d10.append(")");
        return i(method, null, d10.toString(), objArr);
    }

    public static IllegalArgumentException k(Method method, Exception exc, int i6, String str, Object... objArr) {
        StringBuilder d10 = v.g.d(str, " (parameter #");
        d10.append(i6 + 1);
        d10.append(")");
        return i(method, exc, d10.toString(), objArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r10 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043 A[LOOP:0: B:2:0x0000->B:24:0x0043, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0042 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Type l(Type type, Class<?> cls, Type type2) {
        TypeVariable typeVariable;
        boolean z10;
        Class cls2;
        TypeVariable typeVariable2;
        while (true) {
            int i6 = 0;
            if (typeVariable instanceof TypeVariable) {
                TypeVariable typeVariable3 = (TypeVariable) typeVariable;
                GenericDeclaration genericDeclaration = typeVariable3.getGenericDeclaration();
                if (genericDeclaration instanceof Class) {
                    cls2 = (Class) genericDeclaration;
                } else {
                    cls2 = null;
                }
                if (cls2 != null) {
                    Type c10 = c(type, cls, cls2);
                    if (c10 instanceof ParameterizedType) {
                        TypeVariable[] typeParameters = cls2.getTypeParameters();
                        while (i6 < typeParameters.length) {
                            if (typeVariable3.equals(typeParameters[i6])) {
                                typeVariable2 = ((ParameterizedType) c10).getActualTypeArguments()[i6];
                                if (typeVariable2 != typeVariable3) {
                                    return typeVariable2;
                                }
                                typeVariable = typeVariable2;
                            } else {
                                i6++;
                            }
                        }
                        throw new NoSuchElementException();
                    }
                }
                typeVariable2 = typeVariable3;
                if (typeVariable2 != typeVariable3) {
                }
            } else {
                if (typeVariable instanceof Class) {
                    Class cls3 = (Class) typeVariable;
                    if (cls3.isArray()) {
                        Class<?> componentType = cls3.getComponentType();
                        Type l2 = l(type, cls, componentType);
                        if (componentType != l2) {
                            return new a(l2);
                        }
                        return cls3;
                    }
                }
                if (typeVariable instanceof GenericArrayType) {
                    GenericArrayType genericArrayType = (GenericArrayType) typeVariable;
                    Type genericComponentType = genericArrayType.getGenericComponentType();
                    Type l10 = l(type, cls, genericComponentType);
                    if (genericComponentType != l10) {
                        return new a(l10);
                    }
                    return genericArrayType;
                } else if (typeVariable instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) typeVariable;
                    Type ownerType = parameterizedType.getOwnerType();
                    Type l11 = l(type, cls, ownerType);
                    if (l11 != ownerType) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length = actualTypeArguments.length;
                    while (i6 < length) {
                        Type l12 = l(type, cls, actualTypeArguments[i6]);
                        if (l12 != actualTypeArguments[i6]) {
                            if (!z10) {
                                actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                z10 = true;
                            }
                            actualTypeArguments[i6] = l12;
                        }
                        i6++;
                    }
                    if (z10) {
                        return new b(l11, parameterizedType.getRawType(), actualTypeArguments);
                    }
                    return parameterizedType;
                } else {
                    boolean z11 = typeVariable instanceof WildcardType;
                    WildcardType wildcardType = typeVariable;
                    if (z11) {
                        WildcardType wildcardType2 = (WildcardType) typeVariable;
                        Type[] lowerBounds = wildcardType2.getLowerBounds();
                        Type[] upperBounds = wildcardType2.getUpperBounds();
                        if (lowerBounds.length == 1) {
                            Type l13 = l(type, cls, lowerBounds[0]);
                            wildcardType = wildcardType2;
                            if (l13 != lowerBounds[0]) {
                                return new c(new Type[]{Object.class}, new Type[]{l13});
                            }
                        } else {
                            wildcardType = wildcardType2;
                            if (upperBounds.length == 1) {
                                Type l14 = l(type, cls, upperBounds[0]);
                                wildcardType = wildcardType2;
                                if (l14 != upperBounds[0]) {
                                    return new c(new Type[]{l14}, f13554a);
                                }
                            }
                        }
                    }
                    return wildcardType;
                }
            }
        }
    }

    public static void m(Throwable th2) {
        if (!(th2 instanceof VirtualMachineError)) {
            if (!(th2 instanceof ThreadDeath)) {
                if (!(th2 instanceof LinkageError)) {
                    return;
                }
                throw ((LinkageError) th2);
            }
            throw ((ThreadDeath) th2);
        }
        throw ((VirtualMachineError) th2);
    }

    public static String n(Type type) {
        if (type instanceof Class) {
            return ((Class) type).getName();
        }
        return type.toString();
    }
}
