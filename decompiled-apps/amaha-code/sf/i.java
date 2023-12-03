package sf;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.MalformedJsonException;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import sf.b;
import sf.r;
import sf.s;
/* compiled from: Gson.java */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: n  reason: collision with root package name */
    public static final TypeToken<?> f31495n = TypeToken.get(Object.class);

    /* renamed from: a  reason: collision with root package name */
    public final ThreadLocal<Map<TypeToken<?>, a<?>>> f31496a;

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap f31497b;

    /* renamed from: c  reason: collision with root package name */
    public final uf.e f31498c;

    /* renamed from: d  reason: collision with root package name */
    public final vf.e f31499d;

    /* renamed from: e  reason: collision with root package name */
    public final List<w> f31500e;
    public final Map<Type, j<?>> f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f31501g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f31502h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f31503i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f31504j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f31505k;

    /* renamed from: l  reason: collision with root package name */
    public final List<w> f31506l;

    /* renamed from: m  reason: collision with root package name */
    public final List<w> f31507m;

    /* compiled from: Gson.java */
    /* loaded from: classes.dex */
    public static class a<T> extends v<T> {

        /* renamed from: a  reason: collision with root package name */
        public v<T> f31508a;

        @Override // sf.v
        public final T a(yf.a aVar) {
            v<T> vVar = this.f31508a;
            if (vVar != null) {
                return vVar.a(aVar);
            }
            throw new IllegalStateException();
        }

        @Override // sf.v
        public final void b(yf.b bVar, T t3) {
            v<T> vVar = this.f31508a;
            if (vVar != null) {
                vVar.b(bVar, t3);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public i() {
        this(uf.h.f34062z, b.f31491u, Collections.emptyMap(), true, false, true, r.f31513u, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), s.f31515u, s.f31516v);
    }

    public static void a(double d10) {
        if (!Double.isNaN(d10) && !Double.isInfinite(d10)) {
            return;
        }
        throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
    }

    public final Object b(Class cls, String str) {
        Object c10 = c(str, cls);
        if (cls == Integer.TYPE) {
            cls = Integer.class;
        } else if (cls == Float.TYPE) {
            cls = Float.class;
        } else if (cls == Byte.TYPE) {
            cls = Byte.class;
        } else if (cls == Double.TYPE) {
            cls = Double.class;
        } else if (cls == Long.TYPE) {
            cls = Long.class;
        } else if (cls == Character.TYPE) {
            cls = Character.class;
        } else if (cls == Boolean.TYPE) {
            cls = Boolean.class;
        } else if (cls == Short.TYPE) {
            cls = Short.class;
        } else if (cls == Void.TYPE) {
            cls = Void.class;
        }
        return cls.cast(c10);
    }

    public final <T> T c(String str, Type type) {
        T t3 = null;
        if (str == null) {
            return null;
        }
        yf.a aVar = new yf.a(new StringReader(str));
        boolean z10 = this.f31505k;
        boolean z11 = true;
        aVar.f38536v = true;
        try {
            try {
                try {
                    try {
                        aVar.y0();
                        z11 = false;
                        t3 = d(TypeToken.get(type)).a(aVar);
                    } catch (IOException e10) {
                        throw new JsonSyntaxException(e10);
                    }
                } catch (AssertionError e11) {
                    AssertionError assertionError = new AssertionError("AssertionError (GSON 2.9.0): " + e11.getMessage());
                    assertionError.initCause(e11);
                    throw assertionError;
                }
            } catch (EOFException e12) {
                if (!z11) {
                    throw new JsonSyntaxException(e12);
                }
            } catch (IllegalStateException e13) {
                throw new JsonSyntaxException(e13);
            }
            aVar.f38536v = z10;
            if (t3 != null) {
                try {
                    if (aVar.y0() != 10) {
                        throw new JsonIOException("JSON document was not fully consumed.");
                    }
                } catch (MalformedJsonException e14) {
                    throw new JsonSyntaxException(e14);
                } catch (IOException e15) {
                    throw new JsonIOException(e15);
                }
            }
            return t3;
        } catch (Throwable th2) {
            aVar.f38536v = z10;
            throw th2;
        }
    }

    public final <T> v<T> d(TypeToken<T> typeToken) {
        Object obj;
        boolean z10;
        ConcurrentHashMap concurrentHashMap = this.f31497b;
        if (typeToken == null) {
            obj = f31495n;
        } else {
            obj = typeToken;
        }
        v<T> vVar = (v) concurrentHashMap.get(obj);
        if (vVar != null) {
            return vVar;
        }
        ThreadLocal<Map<TypeToken<?>, a<?>>> threadLocal = this.f31496a;
        Map<TypeToken<?>, a<?>> map = threadLocal.get();
        if (map == null) {
            map = new HashMap<>();
            threadLocal.set(map);
            z10 = true;
        } else {
            z10 = false;
        }
        a<?> aVar = map.get(typeToken);
        if (aVar != null) {
            return aVar;
        }
        try {
            a<?> aVar2 = new a<>();
            map.put(typeToken, aVar2);
            for (w wVar : this.f31500e) {
                v<T> a10 = wVar.a(this, typeToken);
                if (a10 != null) {
                    if (aVar2.f31508a == null) {
                        aVar2.f31508a = a10;
                        concurrentHashMap.put(typeToken, a10);
                        return a10;
                    }
                    throw new AssertionError();
                }
            }
            throw new IllegalArgumentException("GSON (2.9.0) cannot handle " + typeToken);
        } finally {
            map.remove(typeToken);
            if (z10) {
                threadLocal.remove();
            }
        }
    }

    public final <T> v<T> e(w wVar, TypeToken<T> typeToken) {
        List<w> list = this.f31500e;
        if (!list.contains(wVar)) {
            wVar = this.f31499d;
        }
        boolean z10 = false;
        for (w wVar2 : list) {
            if (!z10) {
                if (wVar2 == wVar) {
                    z10 = true;
                }
            } else {
                v<T> a10 = wVar2.a(this, typeToken);
                if (a10 != null) {
                    return a10;
                }
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + typeToken);
    }

    public final yf.b f(Writer writer) {
        if (this.f31502h) {
            writer.write(")]}'\n");
        }
        yf.b bVar = new yf.b(writer);
        if (this.f31504j) {
            bVar.f38544x = "  ";
            bVar.f38545y = ": ";
        }
        bVar.A = this.f31503i;
        bVar.f38546z = this.f31505k;
        bVar.C = this.f31501g;
        return bVar;
    }

    public final String g(Object obj) {
        if (obj == null) {
            n nVar = n.f31510u;
            StringWriter stringWriter = new StringWriter();
            try {
                j(nVar, f(stringWriter));
                return stringWriter.toString();
            } catch (IOException e10) {
                throw new JsonIOException(e10);
            }
        }
        return h(obj, obj.getClass());
    }

    public final String h(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        try {
            i(obj, type, f(stringWriter));
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new JsonIOException(e10);
        }
    }

    public final void i(Object obj, Type type, yf.b bVar) {
        v d10 = d(TypeToken.get(type));
        boolean z10 = bVar.f38546z;
        bVar.f38546z = true;
        boolean z11 = bVar.A;
        bVar.A = this.f31503i;
        boolean z12 = bVar.C;
        bVar.C = this.f31501g;
        try {
            try {
                try {
                    d10.b(bVar, obj);
                } catch (IOException e10) {
                    throw new JsonIOException(e10);
                }
            } catch (AssertionError e11) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.9.0): " + e11.getMessage());
                assertionError.initCause(e11);
                throw assertionError;
            }
        } finally {
            bVar.f38546z = z10;
            bVar.A = z11;
            bVar.C = z12;
        }
    }

    public final void j(n nVar, yf.b bVar) {
        boolean z10 = bVar.f38546z;
        bVar.f38546z = true;
        boolean z11 = bVar.A;
        bVar.A = this.f31503i;
        boolean z12 = bVar.C;
        bVar.C = this.f31501g;
        try {
            try {
                vf.q.f35062z.b(bVar, nVar);
            } catch (IOException e10) {
                throw new JsonIOException(e10);
            } catch (AssertionError e11) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.9.0): " + e11.getMessage());
                assertionError.initCause(e11);
                throw assertionError;
            }
        } finally {
            bVar.f38546z = z10;
            bVar.A = z11;
            bVar.C = z12;
        }
    }

    public final String toString() {
        return "{serializeNulls:" + this.f31501g + ",factories:" + this.f31500e + ",instanceCreators:" + this.f31498c + "}";
    }

    public i(uf.h hVar, b.a aVar, Map map, boolean z10, boolean z11, boolean z12, r.a aVar2, List list, List list2, List list3, s.a aVar3, s.b bVar) {
        vf.k kVar;
        v fVar;
        vf.i iVar;
        this.f31496a = new ThreadLocal<>();
        this.f31497b = new ConcurrentHashMap();
        this.f = map;
        uf.e eVar = new uf.e(map, z12);
        this.f31498c = eVar;
        this.f31501g = false;
        this.f31502h = false;
        this.f31503i = z10;
        this.f31504j = false;
        this.f31505k = z11;
        this.f31506l = list;
        this.f31507m = list2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(vf.q.A);
        if (aVar3 == s.f31515u) {
            kVar = vf.l.f35014c;
        } else {
            kVar = new vf.k(aVar3);
        }
        arrayList.add(kVar);
        arrayList.add(hVar);
        arrayList.addAll(list3);
        arrayList.add(vf.q.f35053p);
        arrayList.add(vf.q.f35044g);
        arrayList.add(vf.q.f35042d);
        arrayList.add(vf.q.f35043e);
        arrayList.add(vf.q.f);
        if (aVar2 == r.f31513u) {
            fVar = vf.q.f35048k;
        } else {
            fVar = new f();
        }
        arrayList.add(new vf.s(Long.TYPE, Long.class, fVar));
        arrayList.add(new vf.s(Double.TYPE, Double.class, new d()));
        arrayList.add(new vf.s(Float.TYPE, Float.class, new e()));
        if (bVar == s.f31516v) {
            iVar = vf.j.f35011b;
        } else {
            iVar = new vf.i(new vf.j(bVar));
        }
        arrayList.add(iVar);
        arrayList.add(vf.q.f35045h);
        arrayList.add(vf.q.f35046i);
        arrayList.add(new vf.r(AtomicLong.class, new u(new g(fVar))));
        arrayList.add(new vf.r(AtomicLongArray.class, new u(new h(fVar))));
        arrayList.add(vf.q.f35047j);
        arrayList.add(vf.q.f35049l);
        arrayList.add(vf.q.f35054q);
        arrayList.add(vf.q.r);
        arrayList.add(new vf.r(BigDecimal.class, vf.q.f35050m));
        arrayList.add(new vf.r(BigInteger.class, vf.q.f35051n));
        arrayList.add(new vf.r(uf.j.class, vf.q.f35052o));
        arrayList.add(vf.q.f35055s);
        arrayList.add(vf.q.f35056t);
        arrayList.add(vf.q.f35058v);
        arrayList.add(vf.q.f35059w);
        arrayList.add(vf.q.f35061y);
        arrayList.add(vf.q.f35057u);
        arrayList.add(vf.q.f35040b);
        arrayList.add(vf.c.f35001b);
        arrayList.add(vf.q.f35060x);
        if (xf.d.f37756a) {
            arrayList.add(xf.d.f37758c);
            arrayList.add(xf.d.f37757b);
            arrayList.add(xf.d.f37759d);
        }
        arrayList.add(vf.a.f34995c);
        arrayList.add(vf.q.f35039a);
        arrayList.add(new vf.b(eVar));
        arrayList.add(new vf.h(eVar));
        vf.e eVar2 = new vf.e(eVar);
        this.f31499d = eVar2;
        arrayList.add(eVar2);
        arrayList.add(vf.q.B);
        arrayList.add(new vf.n(eVar, aVar, hVar, eVar2));
        this.f31500e = Collections.unmodifiableList(arrayList);
    }
}
