package uf;

import com.google.android.gms.internal.cast.w;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import t0.l0;
import ta.b0;
import ta.c0;
import ta.v;
import tr.r;
/* compiled from: ConstructorConstructor.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Type, sf.j<?>> f34056a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f34057b;

    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes.dex */
    public class a implements l<T> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ sf.j f34058u;

        public a(sf.j jVar, Type type) {
            this.f34058u = jVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
        @Override // uf.l
        public final T i() {
            return this.f34058u.a();
        }
    }

    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes.dex */
    public class b implements l<T> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ sf.j f34059u;

        public b(sf.j jVar, Type type) {
            this.f34059u = jVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
        @Override // uf.l
        public final T i() {
            return this.f34059u.a();
        }
    }

    public e(Map<Type, sf.j<?>> map, boolean z10) {
        this.f34056a = map;
        this.f34057b = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> l<T> a(TypeToken<T> typeToken) {
        String sb2;
        l<T> fVar;
        Type type = typeToken.getType();
        Class<? super T> rawType = typeToken.getRawType();
        Map<Type, sf.j<?>> map = this.f34056a;
        sf.j<?> jVar = map.get(type);
        if (jVar != null) {
            return new a(jVar, type);
        }
        sf.j<?> jVar2 = map.get(rawType);
        if (jVar2 != null) {
            return new b(jVar2, type);
        }
        l<T> lVar = null;
        if (!Modifier.isAbstract(rawType.getModifiers())) {
            try {
                Constructor<? super T> declaredConstructor = rawType.getDeclaredConstructor(new Class[0]);
                try {
                    declaredConstructor.setAccessible(true);
                    sb2 = null;
                } catch (Exception e10) {
                    StringBuilder sb3 = new StringBuilder("Failed making constructor '");
                    StringBuilder sb4 = new StringBuilder(declaredConstructor.getDeclaringClass().getName());
                    sb4.append('#');
                    sb4.append(declaredConstructor.getDeclaringClass().getSimpleName());
                    sb4.append('(');
                    Class<?>[] parameterTypes = declaredConstructor.getParameterTypes();
                    for (int i6 = 0; i6 < parameterTypes.length; i6++) {
                        if (i6 > 0) {
                            sb4.append(", ");
                        }
                        sb4.append(parameterTypes[i6].getSimpleName());
                    }
                    sb4.append(')');
                    sb3.append(sb4.toString());
                    sb3.append("' accessible; either change its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: ");
                    sb3.append(e10.getMessage());
                    sb2 = sb3.toString();
                }
                if (sb2 != null) {
                    fVar = new io.c(sb2);
                } else {
                    fVar = new f(declaredConstructor);
                }
            } catch (NoSuchMethodException unused) {
            }
            if (fVar == null) {
                return fVar;
            }
            if (Collection.class.isAssignableFrom(rawType)) {
                if (SortedSet.class.isAssignableFrom(rawType)) {
                    lVar = new r();
                } else if (EnumSet.class.isAssignableFrom(rawType)) {
                    lVar = new g(type);
                } else if (Set.class.isAssignableFrom(rawType)) {
                    lVar = new v();
                } else if (Queue.class.isAssignableFrom(rawType)) {
                    lVar = new b0();
                } else {
                    lVar = new c0();
                }
            } else if (Map.class.isAssignableFrom(rawType)) {
                if (rawType == EnumMap.class) {
                    lVar = new uf.b(type);
                } else if (ConcurrentNavigableMap.class.isAssignableFrom(rawType)) {
                    lVar = new sc.b();
                } else if (ConcurrentMap.class.isAssignableFrom(rawType)) {
                    lVar = new c();
                } else if (SortedMap.class.isAssignableFrom(rawType)) {
                    lVar = new w();
                } else if ((type instanceof ParameterizedType) && !String.class.isAssignableFrom(TypeToken.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType())) {
                    lVar = new l0();
                } else {
                    lVar = new kc.f();
                }
            }
            if (lVar != null) {
                return lVar;
            }
            if (this.f34057b) {
                return new d(rawType);
            }
            return new dm.e("Unable to create instance of " + rawType + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.");
        }
        fVar = null;
        if (fVar == null) {
        }
    }

    public final String toString() {
        return this.f34056a.toString();
    }
}
