package ys;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: TypesJVM.kt */
/* loaded from: classes2.dex */
public final class r implements ParameterizedType, Type {

    /* renamed from: u  reason: collision with root package name */
    public final Class<?> f38983u;

    /* renamed from: v  reason: collision with root package name */
    public final Type f38984v;

    /* renamed from: w  reason: collision with root package name */
    public final Type[] f38985w;

    /* compiled from: TypesJVM.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a extends kotlin.jvm.internal.g implements ss.l<Type, String> {

        /* renamed from: u  reason: collision with root package name */
        public static final a f38986u = new a();

        public a() {
            super(1, t.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
        }

        @Override // ss.l
        public final String invoke(Type type) {
            Type p02 = type;
            kotlin.jvm.internal.i.g(p02, "p0");
            return t.a(p02);
        }
    }

    public r(Class cls, Type type, ArrayList arrayList) {
        this.f38983u = cls;
        this.f38984v = type;
        this.f38985w = (Type[]) arrayList.toArray(new Type[0]);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            if (kotlin.jvm.internal.i.b(this.f38983u, parameterizedType.getRawType()) && kotlin.jvm.internal.i.b(this.f38984v, parameterizedType.getOwnerType())) {
                if (Arrays.equals(this.f38985w, parameterizedType.getActualTypeArguments())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return this.f38985w;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f38984v;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f38983u;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        boolean z10;
        StringBuilder sb2 = new StringBuilder();
        Class<?> cls = this.f38983u;
        Type type = this.f38984v;
        if (type != null) {
            sb2.append(t.a(type));
            sb2.append("$");
            sb2.append(cls.getSimpleName());
        } else {
            sb2.append(t.a(cls));
        }
        Type[] typeArr = this.f38985w;
        if (typeArr.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            is.k.X1(typeArr, sb2, ", ", "<", ">", -1, "...", a.f38986u);
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.i.f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public final int hashCode() {
        int i6;
        int hashCode = this.f38983u.hashCode();
        Type type = this.f38984v;
        if (type != null) {
            i6 = type.hashCode();
        } else {
            i6 = 0;
        }
        return (hashCode ^ i6) ^ Arrays.hashCode(this.f38985w);
    }

    public final String toString() {
        return getTypeName();
    }
}
