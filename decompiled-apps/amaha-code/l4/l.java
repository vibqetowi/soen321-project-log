package l4;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
/* compiled from: SizeConfigStrategy.java */
/* loaded from: classes.dex */
public final class l implements j {

    /* renamed from: d  reason: collision with root package name */
    public static final Bitmap.Config[] f24037d;

    /* renamed from: e  reason: collision with root package name */
    public static final Bitmap.Config[] f24038e;
    public static final Bitmap.Config[] f;

    /* renamed from: g  reason: collision with root package name */
    public static final Bitmap.Config[] f24039g;

    /* renamed from: h  reason: collision with root package name */
    public static final Bitmap.Config[] f24040h;

    /* renamed from: a  reason: collision with root package name */
    public final c f24041a = new c();

    /* renamed from: b  reason: collision with root package name */
    public final g<b, Bitmap> f24042b = new g<>();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f24043c = new HashMap();

    /* compiled from: SizeConfigStrategy.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f24044a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f24044a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24044a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24044a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24044a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: SizeConfigStrategy.java */
    /* loaded from: classes.dex */
    public static final class b implements k {

        /* renamed from: a  reason: collision with root package name */
        public final c f24045a;

        /* renamed from: b  reason: collision with root package name */
        public int f24046b;

        /* renamed from: c  reason: collision with root package name */
        public Bitmap.Config f24047c;

        public b(c cVar) {
            this.f24045a = cVar;
        }

        @Override // l4.k
        public final void a() {
            this.f24045a.c(this);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f24046b != bVar.f24046b || !d5.j.a(this.f24047c, bVar.f24047c)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int i6;
            int i10 = this.f24046b * 31;
            Bitmap.Config config = this.f24047c;
            if (config != null) {
                i6 = config.hashCode();
            } else {
                i6 = 0;
            }
            return i10 + i6;
        }

        public final String toString() {
            return l.c(this.f24046b, this.f24047c);
        }
    }

    /* compiled from: SizeConfigStrategy.java */
    /* loaded from: classes.dex */
    public static class c extends l4.c {
        @Override // l4.c
        public final k a() {
            return new b(this);
        }
    }

    static {
        Bitmap.Config config;
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            config = Bitmap.Config.RGBA_F16;
            configArr[configArr.length - 1] = config;
        }
        f24037d = configArr;
        f24038e = configArr;
        f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f24039g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f24040h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String c(int i6, Bitmap.Config config) {
        return "[" + i6 + "](" + config + ")";
    }

    public final void a(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> d10 = d(bitmap.getConfig());
        Integer num2 = d10.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                d10.remove(num);
                return;
            } else {
                d10.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + e(bitmap) + ", this: " + this);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008c A[EDGE_INSN: B:40:0x008c->B:35:0x008c ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap b(int i6, int i10, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int length;
        Bitmap a10;
        Bitmap.Config config2;
        int b10 = d5.j.b(i6, i10, config);
        c cVar = this.f24041a;
        b bVar = (b) cVar.b();
        bVar.f24046b = b10;
        bVar.f24047c = config;
        int i11 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            config2 = Bitmap.Config.RGBA_F16;
            if (config2.equals(config)) {
                configArr = f24038e;
                length = configArr.length;
                while (true) {
                    if (i11 < length) {
                        break;
                    }
                    Bitmap.Config config3 = configArr[i11];
                    Integer ceilingKey = d(config3).ceilingKey(Integer.valueOf(b10));
                    if (ceilingKey != null && ceilingKey.intValue() <= b10 * 8) {
                        if (ceilingKey.intValue() != b10 || (config3 != null ? !config3.equals(config) : config != null)) {
                            cVar.c(bVar);
                            int intValue = ceilingKey.intValue();
                            bVar = (b) cVar.b();
                            bVar.f24046b = intValue;
                            bVar.f24047c = config3;
                        }
                    } else {
                        i11++;
                    }
                }
                a10 = this.f24042b.a(bVar);
                if (a10 != null) {
                    a(Integer.valueOf(bVar.f24046b), a10);
                    a10.reconfigure(i6, i10, config);
                }
                return a10;
            }
        }
        int i12 = a.f24044a[config.ordinal()];
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    configArr = i12 != 4 ? new Bitmap.Config[]{config} : f24040h;
                } else {
                    configArr = f24039g;
                }
            } else {
                configArr = f;
            }
        } else {
            configArr = f24037d;
        }
        length = configArr.length;
        while (true) {
            if (i11 < length) {
            }
            i11++;
        }
        a10 = this.f24042b.a(bVar);
        if (a10 != null) {
        }
        return a10;
    }

    public final NavigableMap<Integer, Integer> d(Bitmap.Config config) {
        HashMap hashMap = this.f24043c;
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) hashMap.get(config);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            hashMap.put(config, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    public final String e(Bitmap bitmap) {
        return c(d5.j.c(bitmap), bitmap.getConfig());
    }

    public final void f(Bitmap bitmap) {
        int c10 = d5.j.c(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        b bVar = (b) this.f24041a.b();
        bVar.f24046b = c10;
        bVar.f24047c = config;
        this.f24042b.b(bVar, bitmap);
        NavigableMap<Integer, Integer> d10 = d(bitmap.getConfig());
        Integer num = d10.get(Integer.valueOf(bVar.f24046b));
        Integer valueOf = Integer.valueOf(bVar.f24046b);
        int i6 = 1;
        if (num != null) {
            i6 = 1 + num.intValue();
        }
        d10.put(valueOf, Integer.valueOf(i6));
    }

    public final String toString() {
        StringBuilder c10 = v.h.c("SizeConfigStrategy{groupedMap=");
        c10.append(this.f24042b);
        c10.append(", sortedSizes=(");
        HashMap hashMap = this.f24043c;
        for (Map.Entry entry : hashMap.entrySet()) {
            c10.append(entry.getKey());
            c10.append('[');
            c10.append(entry.getValue());
            c10.append("], ");
        }
        if (!hashMap.isEmpty()) {
            c10.replace(c10.length() - 2, c10.length(), "");
        }
        c10.append(")}");
        return c10.toString();
    }
}
