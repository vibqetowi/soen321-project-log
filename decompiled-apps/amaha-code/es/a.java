package es;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;
/* compiled from: RegexCache.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final C0222a<String, Pattern> f14539a;

    /* compiled from: RegexCache.java */
    /* renamed from: es.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0222a<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public final C0223a f14540a;

        /* renamed from: b  reason: collision with root package name */
        public final int f14541b;

        /* compiled from: RegexCache.java */
        /* renamed from: es.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class C0223a extends LinkedHashMap<K, V> {
            public C0223a(int i6) {
                super(i6, 0.75f, true);
            }

            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<K, V> entry) {
                if (size() > C0222a.this.f14541b) {
                    return true;
                }
                return false;
            }
        }

        public C0222a(int i6) {
            this.f14541b = i6;
            this.f14540a = new C0223a(pl.a.b(i6, 4, 3, 1));
        }

        public final synchronized void a(Object obj, Pattern pattern) {
            this.f14540a.put(obj, pattern);
        }
    }

    public a(int i6) {
        this.f14539a = new C0222a<>(i6);
    }

    public final Pattern a(String str) {
        V v10;
        C0222a<String, Pattern> c0222a = this.f14539a;
        synchronized (c0222a) {
            v10 = c0222a.f14540a.get(str);
        }
        Pattern pattern = (Pattern) v10;
        if (pattern == null) {
            Pattern compile = Pattern.compile(str);
            this.f14539a.a(str, compile);
            return compile;
        }
        return pattern;
    }
}
