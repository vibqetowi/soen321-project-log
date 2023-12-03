package t;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
/* compiled from: LruCache.java */
/* loaded from: classes.dex */
public class f<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap<K, V> f32235a;

    /* renamed from: b  reason: collision with root package name */
    public int f32236b;

    /* renamed from: c  reason: collision with root package name */
    public final int f32237c;

    /* renamed from: d  reason: collision with root package name */
    public int f32238d;

    /* renamed from: e  reason: collision with root package name */
    public int f32239e;

    public f(int i6) {
        if (i6 > 0) {
            this.f32237c = i6;
            this.f32235a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public V a(K k10) {
        return null;
    }

    public final V b(K k10) {
        V put;
        if (k10 != null) {
            synchronized (this) {
                V v10 = this.f32235a.get(k10);
                if (v10 != null) {
                    this.f32238d++;
                    return v10;
                }
                this.f32239e++;
                V a10 = a(k10);
                if (a10 == null) {
                    return null;
                }
                synchronized (this) {
                    put = this.f32235a.put(k10, a10);
                    if (put != null) {
                        this.f32235a.put(k10, put);
                    } else {
                        this.f32236b++;
                    }
                }
                if (put != null) {
                    return put;
                }
                d(this.f32237c);
                return a10;
            }
        }
        throw new NullPointerException("key == null");
    }

    public final V c(K k10, V v10) {
        V put;
        if (k10 != null) {
            synchronized (this) {
                this.f32236b++;
                put = this.f32235a.put(k10, v10);
                if (put != null) {
                    this.f32236b--;
                }
            }
            d(this.f32237c);
            return put;
        }
        throw new NullPointerException("key == null || value == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(int i6) {
        while (true) {
            synchronized (this) {
                if (this.f32236b >= 0 && (!this.f32235a.isEmpty() || this.f32236b == 0)) {
                    if (this.f32236b <= i6 || this.f32235a.isEmpty()) {
                        break;
                    }
                    Map.Entry<K, V> next = this.f32235a.entrySet().iterator().next();
                    K key = next.getKey();
                    next.getValue();
                    this.f32235a.remove(key);
                    this.f32236b--;
                } else {
                    break;
                }
            }
        }
    }

    public final synchronized String toString() {
        int i6;
        int i10 = this.f32238d;
        int i11 = this.f32239e + i10;
        if (i11 != 0) {
            i6 = (i10 * 100) / i11;
        } else {
            i6 = 0;
        }
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f32237c), Integer.valueOf(this.f32238d), Integer.valueOf(this.f32239e), Integer.valueOf(i6));
    }
}
