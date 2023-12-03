package com.google.protobuf;

import com.google.protobuf.y;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: MapFieldLite.java */
/* loaded from: classes.dex */
public final class k0<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: v  reason: collision with root package name */
    public static final k0<?, ?> f9995v;

    /* renamed from: u  reason: collision with root package name */
    public boolean f9996u;

    static {
        k0<?, ?> k0Var = new k0<>();
        f9995v = k0Var;
        k0Var.f9996u = false;
    }

    public k0() {
        this.f9996u = true;
    }

    public static int a(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            Charset charset = y.f10086a;
            int length = bArr.length;
            int i6 = length;
            for (int i10 = 0; i10 < 0 + length; i10++) {
                i6 = (i6 * 31) + bArr[i10];
            }
            if (i6 == 0) {
                return 1;
            }
            return i6;
        } else if (!(obj instanceof y.a)) {
            return obj.hashCode();
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public final void b() {
        if (this.f9996u) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final k0<K, V> c() {
        if (isEmpty()) {
            return new k0<>();
        }
        return new k0<>(this);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (isEmpty()) {
            return Collections.emptySet();
        }
        return super.entrySet();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean equals;
        boolean z10;
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this != map) {
            if (size() == map.size()) {
                for (Map.Entry<K, V> entry : entrySet()) {
                    if (map.containsKey(entry.getKey())) {
                        V value = entry.getValue();
                        Object obj2 = map.get(entry.getKey());
                        if ((value instanceof byte[]) && (obj2 instanceof byte[])) {
                            equals = Arrays.equals((byte[]) value, (byte[]) obj2);
                            continue;
                        } else {
                            equals = value.equals(obj2);
                            continue;
                        }
                        if (!equals) {
                        }
                    }
                }
            }
            z10 = false;
            if (z10) {
                return false;
            }
            return true;
        }
        z10 = true;
        if (z10) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i6 = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            i6 += a(entry.getValue()) ^ a(entry.getKey());
        }
        return i6;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k10, V v10) {
        b();
        Charset charset = y.f10086a;
        k10.getClass();
        v10.getClass();
        return (V) super.put(k10, v10);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        b();
        for (K k10 : map.keySet()) {
            Charset charset = y.f10086a;
            k10.getClass();
            map.get(k10).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        b();
        return (V) super.remove(obj);
    }

    public k0(Map<K, V> map) {
        super(map);
        this.f9996u = true;
    }
}
