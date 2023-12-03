package l4;

import android.util.Log;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;
/* compiled from: LruArrayPool.java */
/* loaded from: classes.dex */
public final class h implements l4.b {

    /* renamed from: a  reason: collision with root package name */
    public final g<a, Object> f24020a = new g<>();

    /* renamed from: b  reason: collision with root package name */
    public final b f24021b = new b();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f24022c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f24023d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final int f24024e;
    public int f;

    /* compiled from: LruArrayPool.java */
    /* loaded from: classes.dex */
    public static final class a implements k {

        /* renamed from: a  reason: collision with root package name */
        public final b f24025a;

        /* renamed from: b  reason: collision with root package name */
        public int f24026b;

        /* renamed from: c  reason: collision with root package name */
        public Class<?> f24027c;

        public a(b bVar) {
            this.f24025a = bVar;
        }

        @Override // l4.k
        public final void a() {
            this.f24025a.c(this);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f24026b != aVar.f24026b || this.f24027c != aVar.f24027c) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int i6;
            int i10 = this.f24026b * 31;
            Class<?> cls = this.f24027c;
            if (cls != null) {
                i6 = cls.hashCode();
            } else {
                i6 = 0;
            }
            return i10 + i6;
        }

        public final String toString() {
            return "Key{size=" + this.f24026b + "array=" + this.f24027c + '}';
        }
    }

    /* compiled from: LruArrayPool.java */
    /* loaded from: classes.dex */
    public static final class b extends c {
        @Override // l4.c
        public final k a() {
            return new a(this);
        }
    }

    public h(int i6) {
        this.f24024e = i6;
    }

    @Override // l4.b
    public final synchronized void a(int i6) {
        try {
            if (i6 >= 40) {
                b();
            } else if (i6 >= 20 || i6 == 15) {
                f(this.f24024e / 2);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // l4.b
    public final synchronized void b() {
        f(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l4.b
    public final synchronized <T> T c(int i6, Class<T> cls) {
        a aVar;
        boolean z10;
        Integer ceilingKey = i(cls).ceilingKey(Integer.valueOf(i6));
        boolean z11 = false;
        if (ceilingKey != null) {
            int i10 = this.f;
            if (i10 != 0 && this.f24024e / i10 < 2) {
                z10 = false;
                if (!z10 || ceilingKey.intValue() <= i6 * 8) {
                    z11 = true;
                }
            }
            z10 = true;
            if (!z10) {
            }
            z11 = true;
        }
        if (z11) {
            b bVar = this.f24021b;
            int intValue = ceilingKey.intValue();
            aVar = (a) bVar.b();
            aVar.f24026b = intValue;
            aVar.f24027c = cls;
        } else {
            a aVar2 = (a) this.f24021b.b();
            aVar2.f24026b = i6;
            aVar2.f24027c = cls;
            aVar = aVar2;
        }
        return (T) h(aVar, cls);
    }

    @Override // l4.b
    public final synchronized Object d() {
        a aVar;
        aVar = (a) this.f24021b.b();
        aVar.f24026b = 8;
        aVar.f24027c = byte[].class;
        return h(aVar, byte[].class);
    }

    public final void e(int i6, Class<?> cls) {
        NavigableMap<Integer, Integer> i10 = i(cls);
        Integer num = i10.get(Integer.valueOf(i6));
        if (num != null) {
            if (num.intValue() == 1) {
                i10.remove(Integer.valueOf(i6));
                return;
            } else {
                i10.put(Integer.valueOf(i6), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i6 + ", this: " + this);
    }

    public final void f(int i6) {
        while (this.f > i6) {
            Object c10 = this.f24020a.c();
            kc.f.p(c10);
            l4.a g5 = g(c10.getClass());
            this.f -= g5.a() * g5.b(c10);
            e(g5.b(c10), c10.getClass());
            if (Log.isLoggable(g5.w(), 2)) {
                Log.v(g5.w(), "evicted: " + g5.b(c10));
            }
        }
    }

    public final <T> l4.a<T> g(Class<T> cls) {
        HashMap hashMap = this.f24023d;
        l4.a<T> aVar = (l4.a) hashMap.get(cls);
        if (aVar == null) {
            if (cls.equals(int[].class)) {
                aVar = new f(1);
            } else if (cls.equals(byte[].class)) {
                aVar = new f(0);
            } else {
                throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
            }
            hashMap.put(cls, aVar);
        }
        return aVar;
    }

    public final <T> T h(a aVar, Class<T> cls) {
        l4.a<T> g5 = g(cls);
        T t3 = (T) this.f24020a.a(aVar);
        if (t3 != null) {
            this.f -= g5.a() * g5.b(t3);
            e(g5.b(t3), cls);
        }
        if (t3 == null) {
            if (Log.isLoggable(g5.w(), 2)) {
                Log.v(g5.w(), "Allocated " + aVar.f24026b + " bytes");
            }
            return g5.newArray(aVar.f24026b);
        }
        return t3;
    }

    public final NavigableMap<Integer, Integer> i(Class<?> cls) {
        HashMap hashMap = this.f24022c;
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) hashMap.get(cls);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            hashMap.put(cls, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    @Override // l4.b
    public final synchronized <T> void put(T t3) {
        boolean z10;
        Class<?> cls = t3.getClass();
        l4.a<T> g5 = g(cls);
        int b10 = g5.b(t3);
        int a10 = g5.a() * b10;
        int i6 = 1;
        if (a10 <= this.f24024e / 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return;
        }
        a aVar = (a) this.f24021b.b();
        aVar.f24026b = b10;
        aVar.f24027c = cls;
        this.f24020a.b(aVar, t3);
        NavigableMap<Integer, Integer> i10 = i(cls);
        Integer num = i10.get(Integer.valueOf(aVar.f24026b));
        Integer valueOf = Integer.valueOf(aVar.f24026b);
        if (num != null) {
            i6 = 1 + num.intValue();
        }
        i10.put(valueOf, Integer.valueOf(i6));
        this.f += a10;
        f(this.f24024e);
    }
}
