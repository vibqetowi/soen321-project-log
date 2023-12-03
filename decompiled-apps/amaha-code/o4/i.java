package o4;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import r1.b0;
/* compiled from: LazyHeaders.java */
/* loaded from: classes.dex */
public final class i implements g {

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, List<h>> f27064b;

    /* renamed from: c  reason: collision with root package name */
    public volatile Map<String, String> f27065c;

    /* compiled from: LazyHeaders.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: b  reason: collision with root package name */
        public static final Map<String, List<h>> f27066b;

        /* renamed from: a  reason: collision with root package name */
        public final Map<String, List<h>> f27067a = f27066b;

        static {
            String property = System.getProperty("http.agent");
            if (!TextUtils.isEmpty(property)) {
                int length = property.length();
                StringBuilder sb2 = new StringBuilder(property.length());
                for (int i6 = 0; i6 < length; i6++) {
                    char charAt = property.charAt(i6);
                    if ((charAt > 31 || charAt == '\t') && charAt < 127) {
                        sb2.append(charAt);
                    } else {
                        sb2.append('?');
                    }
                }
                property = sb2.toString();
            }
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(property)) {
                hashMap.put("User-Agent", Collections.singletonList(new b(property)));
            }
            f27066b = Collections.unmodifiableMap(hashMap);
        }
    }

    /* compiled from: LazyHeaders.java */
    /* loaded from: classes.dex */
    public static final class b implements h {

        /* renamed from: a  reason: collision with root package name */
        public final String f27068a;

        public b(String str) {
            this.f27068a = str;
        }

        @Override // o4.h
        public final String a() {
            return this.f27068a;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f27068a.equals(((b) obj).f27068a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f27068a.hashCode();
        }

        public final String toString() {
            return b0.b(new StringBuilder("StringHeaderFactory{value='"), this.f27068a, "'}");
        }
    }

    public i(Map<String, List<h>> map) {
        this.f27064b = Collections.unmodifiableMap(map);
    }

    @Override // o4.g
    public final Map<String, String> a() {
        if (this.f27065c == null) {
            synchronized (this) {
                if (this.f27065c == null) {
                    this.f27065c = Collections.unmodifiableMap(b());
                }
            }
        }
        return this.f27065c;
    }

    public final HashMap b() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, List<h>> entry : this.f27064b.entrySet()) {
            List<h> value = entry.getValue();
            StringBuilder sb2 = new StringBuilder();
            int size = value.size();
            for (int i6 = 0; i6 < size; i6++) {
                String a10 = value.get(i6).a();
                if (!TextUtils.isEmpty(a10)) {
                    sb2.append(a10);
                    if (i6 != value.size() - 1) {
                        sb2.append(',');
                    }
                }
            }
            String sb3 = sb2.toString();
            if (!TextUtils.isEmpty(sb3)) {
                hashMap.put(entry.getKey(), sb3);
            }
        }
        return hashMap;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f27064b.equals(((i) obj).f27064b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f27064b.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.f27064b + '}';
    }
}
