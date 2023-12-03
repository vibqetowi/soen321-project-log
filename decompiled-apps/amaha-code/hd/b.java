package hd;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: Component.java */
/* loaded from: classes.dex */
public final class b<T> {

    /* renamed from: a  reason: collision with root package name */
    public final String f17397a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<o<? super T>> f17398b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<j> f17399c;

    /* renamed from: d  reason: collision with root package name */
    public final int f17400d;

    /* renamed from: e  reason: collision with root package name */
    public final int f17401e;
    public final e<T> f;

    /* renamed from: g  reason: collision with root package name */
    public final Set<Class<?>> f17402g;

    /* compiled from: Component.java */
    /* loaded from: classes.dex */
    public static class a<T> {

        /* renamed from: a  reason: collision with root package name */
        public String f17403a = null;

        /* renamed from: b  reason: collision with root package name */
        public final HashSet f17404b;

        /* renamed from: c  reason: collision with root package name */
        public final HashSet f17405c;

        /* renamed from: d  reason: collision with root package name */
        public int f17406d;

        /* renamed from: e  reason: collision with root package name */
        public int f17407e;
        public e<T> f;

        /* renamed from: g  reason: collision with root package name */
        public final HashSet f17408g;

        public a(Class cls, Class[] clsArr) {
            HashSet hashSet = new HashSet();
            this.f17404b = hashSet;
            this.f17405c = new HashSet();
            this.f17406d = 0;
            this.f17407e = 0;
            this.f17408g = new HashSet();
            hashSet.add(o.a(cls));
            for (Class cls2 : clsArr) {
                if (cls2 != null) {
                    this.f17404b.add(o.a(cls2));
                } else {
                    throw new NullPointerException("Null interface");
                }
            }
        }

        public final void a(j jVar) {
            if (!this.f17404b.contains(jVar.f17423a)) {
                this.f17405c.add(jVar);
                return;
            }
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }

        public final b<T> b() {
            boolean z10;
            if (this.f != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return new b<>(this.f17403a, new HashSet(this.f17404b), new HashSet(this.f17405c), this.f17406d, this.f17407e, this.f, this.f17408g);
            }
            throw new IllegalStateException("Missing required property: factory.");
        }

        public final void c(int i6) {
            boolean z10;
            if (this.f17406d == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f17406d = i6;
                return;
            }
            throw new IllegalStateException("Instantiation type has already been set.");
        }
    }

    public b(String str, Set<o<? super T>> set, Set<j> set2, int i6, int i10, e<T> eVar, Set<Class<?>> set3) {
        this.f17397a = str;
        this.f17398b = Collections.unmodifiableSet(set);
        this.f17399c = Collections.unmodifiableSet(set2);
        this.f17400d = i6;
        this.f17401e = i10;
        this.f = eVar;
        this.f17402g = Collections.unmodifiableSet(set3);
    }

    public static <T> a<T> a(Class<T> cls) {
        return new a<>(cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> b<T> b(T t3, Class<T> cls, Class<? super T>... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(o.a(cls));
        for (Class<? super T> cls2 : clsArr) {
            if (cls2 != null) {
                hashSet.add(o.a(cls2));
            } else {
                throw new NullPointerException("Null interface");
            }
        }
        return new b<>(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new hd.a(1, t3), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f17398b.toArray()) + ">{" + this.f17400d + ", type=" + this.f17401e + ", deps=" + Arrays.toString(this.f17399c.toArray()) + "}";
    }
}
