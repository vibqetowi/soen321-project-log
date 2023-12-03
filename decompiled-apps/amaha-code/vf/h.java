package vf;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import java.util.Properties;
import sf.v;
import sf.w;
/* compiled from: MapTypeAdapterFactory.java */
/* loaded from: classes.dex */
public final class h implements w {

    /* renamed from: u  reason: collision with root package name */
    public final uf.e f35004u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f35005v = false;

    /* compiled from: MapTypeAdapterFactory.java */
    /* loaded from: classes.dex */
    public final class a<K, V> extends v<Map<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        public final p f35006a;

        /* renamed from: b  reason: collision with root package name */
        public final p f35007b;

        /* renamed from: c  reason: collision with root package name */
        public final uf.l<? extends Map<K, V>> f35008c;

        public a(sf.i iVar, Type type, v<K> vVar, Type type2, v<V> vVar2, uf.l<? extends Map<K, V>> lVar) {
            this.f35006a = new p(iVar, vVar, type);
            this.f35007b = new p(iVar, vVar2, type2);
            this.f35008c = lVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // sf.v
        public final Object a(yf.a aVar) {
            int y02 = aVar.y0();
            if (y02 == 9) {
                aVar.p0();
                return null;
            }
            Map map = (Map) ((Map<K, V>) this.f35008c.i());
            p pVar = this.f35007b;
            p pVar2 = this.f35006a;
            if (y02 == 1) {
                aVar.a();
                while (aVar.J()) {
                    aVar.a();
                    Object a10 = pVar2.a(aVar);
                    if (map.put(a10, pVar.a(aVar)) == null) {
                        aVar.j();
                    } else {
                        throw new JsonSyntaxException("duplicate key: " + a10);
                    }
                }
                aVar.j();
            } else {
                aVar.e();
                while (aVar.J()) {
                    com.android.volley.toolbox.a.f5871u.J(aVar);
                    Object a11 = pVar2.a(aVar);
                    if (map.put(a11, pVar.a(aVar)) != null) {
                        throw new JsonSyntaxException("duplicate key: " + a11);
                    }
                }
                aVar.m();
            }
            return map;
        }

        @Override // sf.v
        public final void b(yf.b bVar, Object obj) {
            String str;
            boolean z10;
            Map map = (Map) obj;
            if (map == null) {
                bVar.G();
                return;
            }
            boolean z11 = h.this.f35005v;
            p pVar = this.f35007b;
            if (!z11) {
                bVar.g();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    bVar.o(String.valueOf(entry.getKey()));
                    pVar.b(bVar, entry.getValue());
                }
                bVar.m();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i6 = 0;
            boolean z12 = false;
            for (Map.Entry<K, V> entry2 : map.entrySet()) {
                K key = entry2.getKey();
                p pVar2 = this.f35006a;
                pVar2.getClass();
                try {
                    g gVar = new g();
                    pVar2.b(gVar, key);
                    ArrayList arrayList3 = gVar.G;
                    if (arrayList3.isEmpty()) {
                        sf.m mVar = gVar.I;
                        arrayList.add(mVar);
                        arrayList2.add(entry2.getValue());
                        mVar.getClass();
                        if (!(mVar instanceof sf.k) && !(mVar instanceof sf.o)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        z12 |= z10;
                    } else {
                        throw new IllegalStateException("Expected one JSON element but was " + arrayList3);
                    }
                } catch (IOException e10) {
                    throw new JsonIOException(e10);
                }
            }
            if (z12) {
                bVar.e();
                int size = arrayList.size();
                while (i6 < size) {
                    bVar.e();
                    q.f35062z.b(bVar, (sf.m) arrayList.get(i6));
                    pVar.b(bVar, arrayList2.get(i6));
                    bVar.j();
                    i6++;
                }
                bVar.j();
                return;
            }
            bVar.g();
            int size2 = arrayList.size();
            while (i6 < size2) {
                sf.m mVar2 = (sf.m) arrayList.get(i6);
                mVar2.getClass();
                boolean z13 = mVar2 instanceof sf.p;
                if (z13) {
                    if (z13) {
                        sf.p pVar3 = (sf.p) mVar2;
                        Serializable serializable = pVar3.f31512u;
                        if (serializable instanceof Number) {
                            str = String.valueOf(pVar3.q());
                        } else if (serializable instanceof Boolean) {
                            str = Boolean.toString(pVar3.o());
                        } else if (serializable instanceof String) {
                            str = pVar3.m();
                        } else {
                            throw new AssertionError();
                        }
                    } else {
                        throw new IllegalStateException("Not a JSON Primitive: " + mVar2);
                    }
                } else if (mVar2 instanceof sf.n) {
                    str = "null";
                } else {
                    throw new AssertionError();
                }
                bVar.o(str);
                pVar.b(bVar, arrayList2.get(i6));
                i6++;
            }
            bVar.m();
        }
    }

    public h(uf.e eVar) {
        this.f35004u = eVar;
    }

    @Override // sf.w
    public final <T> v<T> a(sf.i iVar, TypeToken<T> typeToken) {
        Type[] actualTypeArguments;
        v<T> vVar;
        Type type = typeToken.getType();
        if (!Map.class.isAssignableFrom(typeToken.getRawType())) {
            return null;
        }
        Class<?> f = uf.a.f(type);
        if (type == Properties.class) {
            actualTypeArguments = new Type[]{String.class, String.class};
        } else {
            Type g5 = uf.a.g(type, f, Map.class);
            actualTypeArguments = g5 instanceof ParameterizedType ? ((ParameterizedType) g5).getActualTypeArguments() : new Type[]{Object.class, Object.class};
        }
        Type type2 = actualTypeArguments[0];
        if (type2 != Boolean.TYPE && type2 != Boolean.class) {
            vVar = iVar.d(TypeToken.get(type2));
        } else {
            vVar = q.f35041c;
        }
        return new a(iVar, actualTypeArguments[0], vVar, actualTypeArguments[1], iVar.d(TypeToken.get(actualTypeArguments[1])), this.f35004u.a(typeToken));
    }
}
