package androidx.lifecycle;

import a2.a;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: SavedStateHandle.kt */
/* loaded from: classes.dex */
public final class d0 {
    public static final Class<? extends Object>[] f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f2395a;

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashMap f2396b;

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashMap f2397c;

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashMap f2398d;

    /* renamed from: e  reason: collision with root package name */
    public final c0 f2399e;

    /* compiled from: SavedStateHandle.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static d0 a(Bundle bundle, Bundle bundle2) {
            boolean z10;
            if (bundle == null) {
                if (bundle2 == null) {
                    return new d0();
                }
                HashMap hashMap = new HashMap();
                for (String key : bundle2.keySet()) {
                    kotlin.jvm.internal.i.f(key, "key");
                    hashMap.put(key, bundle2.get(key));
                }
                return new d0(hashMap);
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if (parcelableArrayList != null && parcelableArrayList2 != null && parcelableArrayList.size() == parcelableArrayList2.size()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int size = parcelableArrayList.size();
                for (int i6 = 0; i6 < size; i6++) {
                    Object obj = parcelableArrayList.get(i6);
                    if (obj != null) {
                        linkedHashMap.put((String) obj, parcelableArrayList2.get(i6));
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                }
                return new d0(linkedHashMap);
            }
            throw new IllegalStateException("Invalid bundle passed as restored state".toString());
        }
    }

    public d0(HashMap hashMap) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f2395a = linkedHashMap;
        this.f2396b = new LinkedHashMap();
        this.f2397c = new LinkedHashMap();
        this.f2398d = new LinkedHashMap();
        this.f2399e = new c0(this, 0);
        linkedHashMap.putAll(hashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bundle a(d0 this$0) {
        w wVar;
        kotlin.jvm.internal.i.g(this$0, "this$0");
        Iterator it = is.e0.x0(this$0.f2396b).entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            LinkedHashMap linkedHashMap = this$0.f2395a;
            boolean z10 = false;
            if (hasNext) {
                Map.Entry entry = (Map.Entry) it.next();
                String key = (String) entry.getKey();
                Bundle a10 = ((a.b) entry.getValue()).a();
                kotlin.jvm.internal.i.g(key, "key");
                if (a10 != null) {
                    Class<? extends Object>[] clsArr = f;
                    for (int i6 = 0; i6 < 29; i6++) {
                        Class<? extends Object> cls = clsArr[i6];
                        kotlin.jvm.internal.i.d(cls);
                        if (!cls.isInstance(a10)) {
                        }
                    }
                    if (!z10) {
                        Object obj = this$0.f2397c.get(key);
                        if (obj instanceof w) {
                            wVar = (w) obj;
                        } else {
                            wVar = null;
                        }
                        if (wVar != null) {
                            wVar.l(a10);
                        } else {
                            linkedHashMap.put(key, a10);
                        }
                        kotlinx.coroutines.flow.p pVar = (kotlinx.coroutines.flow.p) this$0.f2398d.get(key);
                        if (pVar != null) {
                            pVar.setValue(a10);
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder("Can't put value with type ");
                        kotlin.jvm.internal.i.d(a10);
                        sb2.append(a10.getClass());
                        sb2.append(" into saved state");
                        throw new IllegalArgumentException(sb2.toString());
                    }
                }
                z10 = true;
                if (!z10) {
                }
            } else {
                Set<String> keySet = linkedHashMap.keySet();
                ArrayList arrayList = new ArrayList(keySet.size());
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (String str : keySet) {
                    arrayList.add(str);
                    arrayList2.add(linkedHashMap.get(str));
                }
                return ca.a.s(new hs.f("keys", arrayList), new hs.f("values", arrayList2));
            }
        }
    }

    public d0() {
        this.f2395a = new LinkedHashMap();
        this.f2396b = new LinkedHashMap();
        this.f2397c = new LinkedHashMap();
        this.f2398d = new LinkedHashMap();
        this.f2399e = new c0(this, 1);
    }
}
