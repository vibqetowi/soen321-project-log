package vf;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import sf.v;
import sf.w;
/* compiled from: CollectionTypeAdapterFactory.java */
/* loaded from: classes.dex */
public final class b implements w {

    /* renamed from: u  reason: collision with root package name */
    public final uf.e f34998u;

    /* compiled from: CollectionTypeAdapterFactory.java */
    /* loaded from: classes.dex */
    public static final class a<E> extends v<Collection<E>> {

        /* renamed from: a  reason: collision with root package name */
        public final p f34999a;

        /* renamed from: b  reason: collision with root package name */
        public final uf.l<? extends Collection<E>> f35000b;

        public a(sf.i iVar, Type type, v<E> vVar, uf.l<? extends Collection<E>> lVar) {
            this.f34999a = new p(iVar, vVar, type);
            this.f35000b = lVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // sf.v
        public final Object a(yf.a aVar) {
            if (aVar.y0() == 9) {
                aVar.p0();
                return null;
            }
            Collection collection = (Collection) ((Collection<E>) this.f35000b.i());
            aVar.a();
            while (aVar.J()) {
                collection.add(this.f34999a.a(aVar));
            }
            aVar.j();
            return collection;
        }

        @Override // sf.v
        public final void b(yf.b bVar, Object obj) {
            Collection<E> collection = (Collection) obj;
            if (collection == null) {
                bVar.G();
                return;
            }
            bVar.e();
            for (E e10 : collection) {
                this.f34999a.b(bVar, e10);
            }
            bVar.j();
        }
    }

    public b(uf.e eVar) {
        this.f34998u = eVar;
    }

    @Override // sf.w
    public final <T> v<T> a(sf.i iVar, TypeToken<T> typeToken) {
        Type type;
        Type type2 = typeToken.getType();
        Class<? super T> rawType = typeToken.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type g5 = uf.a.g(type2, rawType, Collection.class);
        if (g5 instanceof WildcardType) {
            g5 = ((WildcardType) g5).getUpperBounds()[0];
        }
        if (g5 instanceof ParameterizedType) {
            type = ((ParameterizedType) g5).getActualTypeArguments()[0];
        } else {
            type = Object.class;
        }
        return new a(iVar, type, iVar.d(TypeToken.get(type)), this.f34998u.a(typeToken));
    }
}
