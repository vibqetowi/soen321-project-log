package at;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
/* compiled from: KCallableImpl.kt */
/* loaded from: classes2.dex */
public final class j extends kotlin.jvm.internal.k implements ss.a<Type> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ e<Object> f3525u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(e<Object> eVar) {
        super(0);
        this.f3525u = eVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
        if (r1.isSuspend() == true) goto L7;
     */
    @Override // ss.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Type invoke() {
        gt.u uVar;
        boolean z10;
        ParameterizedType parameterizedType;
        Type type;
        WildcardType wildcardType;
        Type[] lowerBounds;
        e<Object> eVar = this.f3525u;
        gt.b t3 = eVar.t();
        Type type2 = null;
        if (t3 instanceof gt.u) {
            uVar = (gt.u) t3;
        } else {
            uVar = null;
        }
        if (uVar != null) {
            z10 = true;
        }
        z10 = false;
        if (z10) {
            Object p22 = is.u.p2(eVar.o().a());
            if (p22 instanceof ParameterizedType) {
                parameterizedType = (ParameterizedType) p22;
            } else {
                parameterizedType = null;
            }
            if (parameterizedType != null) {
                type = parameterizedType.getRawType();
            } else {
                type = null;
            }
            if (kotlin.jvm.internal.i.b(type, ls.d.class)) {
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                kotlin.jvm.internal.i.f(actualTypeArguments, "continuationType.actualTypeArguments");
                Object e22 = is.k.e2(actualTypeArguments);
                if (e22 instanceof WildcardType) {
                    wildcardType = (WildcardType) e22;
                } else {
                    wildcardType = null;
                }
                if (wildcardType != null && (lowerBounds = wildcardType.getLowerBounds()) != null) {
                    type2 = (Type) is.k.S1(lowerBounds);
                }
            }
        }
        if (type2 == null) {
            return eVar.o().getReturnType();
        }
        return type2;
    }
}
