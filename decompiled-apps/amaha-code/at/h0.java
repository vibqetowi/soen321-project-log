package at;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.List;
/* compiled from: KTypeImpl.kt */
/* loaded from: classes2.dex */
public final class h0 extends kotlin.jvm.internal.k implements ss.a<Type> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ j0 f3521u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f3522v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ hs.d<List<Type>> f3523w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h0(j0 j0Var, int i6, hs.d<? extends List<? extends Type>> dVar) {
        super(0);
        this.f3521u = j0Var;
        this.f3522v = i6;
        this.f3523w = dVar;
    }

    @Override // ss.a
    public final Type invoke() {
        Class<?> cls;
        j0 j0Var = this.f3521u;
        Type k10 = j0Var.k();
        if (k10 instanceof Class) {
            Class cls2 = (Class) k10;
            if (cls2.isArray()) {
                cls = cls2.getComponentType();
            } else {
                cls = Object.class;
            }
            kotlin.jvm.internal.i.f(cls, "{\n                      …                        }");
            return cls;
        }
        boolean z10 = k10 instanceof GenericArrayType;
        int i6 = this.f3522v;
        if (z10) {
            if (i6 == 0) {
                Type genericComponentType = ((GenericArrayType) k10).getGenericComponentType();
                kotlin.jvm.internal.i.f(genericComponentType, "{\n                      …                        }");
                return genericComponentType;
            }
            throw new hs.e("Array type has been queried for a non-0th argument: " + j0Var, 2);
        } else if (k10 instanceof ParameterizedType) {
            Type type = this.f3523w.getValue().get(i6);
            if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                Type[] lowerBounds = wildcardType.getLowerBounds();
                kotlin.jvm.internal.i.f(lowerBounds, "argument.lowerBounds");
                Type type2 = (Type) is.k.T1(lowerBounds);
                if (type2 == null) {
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    kotlin.jvm.internal.i.f(upperBounds, "argument.upperBounds");
                    type = (Type) is.k.S1(upperBounds);
                } else {
                    type = type2;
                }
            }
            kotlin.jvm.internal.i.f(type, "{\n                      …                        }");
            return type;
        } else {
            throw new hs.e("Non-generic type has been queried for arguments: " + j0Var, 2);
        }
    }
}
