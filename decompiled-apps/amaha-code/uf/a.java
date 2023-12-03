package uf;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.NoSuchElementException;
/* compiled from: $Gson$Types.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Type[] f34044a = new Type[0];

    /* compiled from: $Gson$Types.java */
    /* renamed from: uf.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0570a implements GenericArrayType, Serializable {

        /* renamed from: u  reason: collision with root package name */
        public final Type f34045u;

        public C0570a(Type type) {
            this.f34045u = a.a(type);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof GenericArrayType) && a.d(this, (GenericArrayType) obj)) {
                return true;
            }
            return false;
        }

        @Override // java.lang.reflect.GenericArrayType
        public final Type getGenericComponentType() {
            return this.f34045u;
        }

        public final int hashCode() {
            return this.f34045u.hashCode();
        }

        public final String toString() {
            return a.i(this.f34045u) + "[]";
        }
    }

    /* compiled from: $Gson$Types.java */
    /* loaded from: classes.dex */
    public static final class b implements ParameterizedType, Serializable {

        /* renamed from: u  reason: collision with root package name */
        public final Type f34046u;

        /* renamed from: v  reason: collision with root package name */
        public final Type f34047v;

        /* renamed from: w  reason: collision with root package name */
        public final Type[] f34048w;

        public b(Type type, Type type2, Type... typeArr) {
            Type a10;
            boolean z10;
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z11 = true;
                if (!Modifier.isStatic(cls.getModifiers()) && cls.getEnclosingClass() != null) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (type == null && !z10) {
                    z11 = false;
                }
                kotlin.jvm.internal.h.m(z11);
            }
            if (type == null) {
                a10 = null;
            } else {
                a10 = a.a(type);
            }
            this.f34046u = a10;
            this.f34047v = a.a(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.f34048w = typeArr2;
            int length = typeArr2.length;
            for (int i6 = 0; i6 < length; i6++) {
                this.f34048w[i6].getClass();
                a.b(this.f34048w[i6]);
                Type[] typeArr3 = this.f34048w;
                typeArr3[i6] = a.a(typeArr3[i6]);
            }
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof ParameterizedType) && a.d(this, (ParameterizedType) obj)) {
                return true;
            }
            return false;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type[] getActualTypeArguments() {
            return (Type[]) this.f34048w.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getOwnerType() {
            return this.f34046u;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getRawType() {
            return this.f34047v;
        }

        public final int hashCode() {
            int i6;
            int hashCode = Arrays.hashCode(this.f34048w) ^ this.f34047v.hashCode();
            Type type = this.f34046u;
            if (type != null) {
                i6 = type.hashCode();
            } else {
                i6 = 0;
            }
            return hashCode ^ i6;
        }

        public final String toString() {
            Type[] typeArr = this.f34048w;
            int length = typeArr.length;
            Type type = this.f34047v;
            if (length == 0) {
                return a.i(type);
            }
            StringBuilder sb2 = new StringBuilder((length + 1) * 30);
            sb2.append(a.i(type));
            sb2.append("<");
            sb2.append(a.i(typeArr[0]));
            for (int i6 = 1; i6 < length; i6++) {
                sb2.append(", ");
                sb2.append(a.i(typeArr[i6]));
            }
            sb2.append(">");
            return sb2.toString();
        }
    }

    /* compiled from: $Gson$Types.java */
    /* loaded from: classes.dex */
    public static final class c implements WildcardType, Serializable {

        /* renamed from: u  reason: collision with root package name */
        public final Type f34049u;

        /* renamed from: v  reason: collision with root package name */
        public final Type f34050v;

        public c(Type[] typeArr, Type[] typeArr2) {
            boolean z10;
            boolean z11;
            if (typeArr2.length <= 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            kotlin.jvm.internal.h.m(z10);
            if (typeArr.length == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            kotlin.jvm.internal.h.m(z11);
            if (typeArr2.length == 1) {
                typeArr2[0].getClass();
                a.b(typeArr2[0]);
                kotlin.jvm.internal.h.m(typeArr[0] == Object.class);
                this.f34050v = a.a(typeArr2[0]);
                this.f34049u = Object.class;
                return;
            }
            typeArr[0].getClass();
            a.b(typeArr[0]);
            this.f34050v = null;
            this.f34049u = a.a(typeArr[0]);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof WildcardType) && a.d(this, (WildcardType) obj)) {
                return true;
            }
            return false;
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getLowerBounds() {
            Type type = this.f34050v;
            return type != null ? new Type[]{type} : a.f34044a;
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getUpperBounds() {
            return new Type[]{this.f34049u};
        }

        public final int hashCode() {
            int i6;
            Type type = this.f34050v;
            if (type != null) {
                i6 = type.hashCode() + 31;
            } else {
                i6 = 1;
            }
            return i6 ^ (this.f34049u.hashCode() + 31);
        }

        public final String toString() {
            Type type = this.f34050v;
            if (type != null) {
                return "? super " + a.i(type);
            }
            Type type2 = this.f34049u;
            if (type2 == Object.class) {
                return "?";
            }
            return "? extends " + a.i(type2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [uf.a$a] */
    public static Type a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                cls = new C0570a(a(cls.getComponentType()));
            }
            return cls;
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            return new C0570a(((GenericArrayType) type).getGenericComponentType());
        } else {
            if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
            }
            return type;
        }
    }

    public static void b(Type type) {
        boolean z10;
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            z10 = false;
        } else {
            z10 = true;
        }
        kotlin.jvm.internal.h.m(z10);
    }

    public static boolean c(Type type, Type type2) {
        if (type != type2 && (type == null || !type.equals(type2))) {
            return false;
        }
        return true;
    }

    public static boolean d(Type type, Type type2) {
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
            if (c(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                return true;
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return d(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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

    public static Type e(Type type, Class<?> cls, Class<?> cls2) {
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
                    return e(cls.getGenericInterfaces()[i6], interfaces[i6], cls2);
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
                    return e(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Class<?> f(Type type) {
        String name;
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            kotlin.jvm.internal.h.m(rawType instanceof Class);
            return (Class) rawType;
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(f(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return f(((WildcardType) type).getUpperBounds()[0]);
            }
            if (type == null) {
                name = "null";
            } else {
                name = type.getClass().getName();
            }
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
        }
    }

    public static Type g(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        kotlin.jvm.internal.h.m(cls2.isAssignableFrom(cls));
        return h(type, cls, e(type, cls, cls2), new HashMap());
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0154, code lost:
        if (r1 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0156, code lost:
        r13.put(r1, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0159, code lost:
        return r12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0154 A[EDGE_INSN: B:92:0x0154->B:85:0x0154 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.reflect.Type, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v3, types: [uf.a$c] */
    /* JADX WARN: Type inference failed for: r12v4, types: [uf.a$c] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.HashMap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Type h(Type type, Class cls, Type type2, HashMap hashMap) {
        Type[] typeArr;
        Type[] typeArr2;
        Type bVar;
        Class cls2;
        TypeVariable typeVariable = null;
        while (true) {
            int i6 = 0;
            if (type2 instanceof TypeVariable) {
                TypeVariable typeVariable2 = type2;
                Type type3 = (Type) hashMap.get(typeVariable2);
                if (type3 != null) {
                    if (type3 != Void.TYPE) {
                        return type3;
                    }
                    return type2;
                }
                hashMap.put(typeVariable2, Void.TYPE);
                if (typeVariable == null) {
                    typeVariable = typeVariable2;
                }
                GenericDeclaration genericDeclaration = typeVariable2.getGenericDeclaration();
                if (genericDeclaration instanceof Class) {
                    cls2 = (Class) genericDeclaration;
                } else {
                    cls2 = null;
                }
                if (cls2 != null) {
                    Type e10 = e(type, cls, cls2);
                    if (e10 instanceof ParameterizedType) {
                        TypeVariable[] typeParameters = cls2.getTypeParameters();
                        int length = typeParameters.length;
                        while (i6 < length) {
                            if (typeVariable2.equals(typeParameters[i6])) {
                                type2 = ((ParameterizedType) e10).getActualTypeArguments()[i6];
                                continue;
                                if (type2 == typeVariable2) {
                                    break;
                                }
                            } else {
                                i6++;
                            }
                        }
                        throw new NoSuchElementException();
                    }
                }
                type2 = typeVariable2;
                continue;
                if (type2 == typeVariable2) {
                }
            } else {
                if (type2 instanceof Class) {
                    Class cls3 = type2;
                    if (cls3.isArray()) {
                        Class<?> componentType = cls3.getComponentType();
                        Type h10 = h(type, cls, componentType, hashMap);
                        if (c(componentType, h10)) {
                            type2 = cls3;
                        } else {
                            bVar = new C0570a(h10);
                            type2 = bVar;
                        }
                    }
                }
                if (type2 instanceof GenericArrayType) {
                    type2 = (GenericArrayType) type2;
                    Type genericComponentType = type2.getGenericComponentType();
                    Type h11 = h(type, cls, genericComponentType, hashMap);
                    if (!c(genericComponentType, h11)) {
                        bVar = new C0570a(h11);
                        type2 = bVar;
                    }
                } else if (type2 instanceof ParameterizedType) {
                    type2 = (ParameterizedType) type2;
                    Type ownerType = type2.getOwnerType();
                    Type h12 = h(type, cls, ownerType, hashMap);
                    boolean z10 = !c(h12, ownerType);
                    Type[] actualTypeArguments = type2.getActualTypeArguments();
                    int length2 = actualTypeArguments.length;
                    while (i6 < length2) {
                        Type h13 = h(type, cls, actualTypeArguments[i6], hashMap);
                        if (!c(h13, actualTypeArguments[i6])) {
                            if (!z10) {
                                actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                z10 = true;
                            }
                            actualTypeArguments[i6] = h13;
                        }
                        i6++;
                    }
                    if (z10) {
                        bVar = new b(h12, type2.getRawType(), actualTypeArguments);
                        type2 = bVar;
                    }
                } else if (type2 instanceof WildcardType) {
                    type2 = (WildcardType) type2;
                    Type[] lowerBounds = type2.getLowerBounds();
                    Type[] upperBounds = type2.getUpperBounds();
                    if (lowerBounds.length == 1) {
                        Type h14 = h(type, cls, lowerBounds[0], hashMap);
                        if (h14 != lowerBounds[0]) {
                            if (h14 instanceof WildcardType) {
                                typeArr2 = ((WildcardType) h14).getLowerBounds();
                            } else {
                                typeArr2 = new Type[]{h14};
                            }
                            type2 = new c(new Type[]{Object.class}, typeArr2);
                        }
                    } else if (upperBounds.length == 1) {
                        Type h15 = h(type, cls, upperBounds[0], hashMap);
                        if (h15 != upperBounds[0]) {
                            if (h15 instanceof WildcardType) {
                                typeArr = ((WildcardType) h15).getUpperBounds();
                            } else {
                                typeArr = new Type[]{h15};
                            }
                            type2 = new c(typeArr, f34044a);
                        }
                    }
                }
            }
        }
    }

    public static String i(Type type) {
        if (type instanceof Class) {
            return ((Class) type).getName();
        }
        return type.toString();
    }
}
