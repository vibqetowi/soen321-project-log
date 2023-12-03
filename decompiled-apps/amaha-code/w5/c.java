package w5;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: BundleJSONConverter.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap f36442a;

    /* compiled from: BundleJSONConverter.kt */
    /* loaded from: classes.dex */
    public static final class a implements h {
        @Override // w5.c.h
        public final void a(Bundle bundle, String str, Object obj) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
        }
    }

    /* compiled from: BundleJSONConverter.kt */
    /* loaded from: classes.dex */
    public static final class b implements h {
        @Override // w5.c.h
        public final void a(Bundle bundle, String str, Object obj) {
            bundle.putInt(str, ((Integer) obj).intValue());
        }
    }

    /* compiled from: BundleJSONConverter.kt */
    /* renamed from: w5.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0611c implements h {
        @Override // w5.c.h
        public final void a(Bundle bundle, String str, Object obj) {
            bundle.putLong(str, ((Long) obj).longValue());
        }
    }

    /* compiled from: BundleJSONConverter.kt */
    /* loaded from: classes.dex */
    public static final class d implements h {
        @Override // w5.c.h
        public final void a(Bundle bundle, String str, Object obj) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        }
    }

    /* compiled from: BundleJSONConverter.kt */
    /* loaded from: classes.dex */
    public static final class e implements h {
        @Override // w5.c.h
        public final void a(Bundle bundle, String str, Object obj) {
            bundle.putString(str, (String) obj);
        }
    }

    /* compiled from: BundleJSONConverter.kt */
    /* loaded from: classes.dex */
    public static final class f implements h {
        @Override // w5.c.h
        public final void a(Bundle bundle, String str, Object obj) {
            throw new IllegalArgumentException("Unexpected type from JSON");
        }
    }

    /* compiled from: BundleJSONConverter.kt */
    /* loaded from: classes.dex */
    public static final class g implements h {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // w5.c.h
        public final void a(Bundle bundle, String str, Object obj) {
            JSONArray jSONArray = (JSONArray) obj;
            ArrayList arrayList = new ArrayList();
            if (jSONArray.length() == 0) {
                bundle.putStringArrayList(str, arrayList);
                return;
            }
            int length = jSONArray.length();
            if (length > 0) {
                int i6 = 0;
                while (true) {
                    int i10 = i6 + 1;
                    Object obj2 = jSONArray.get(i6);
                    if (obj2 instanceof String) {
                        arrayList.add(obj2);
                        if (i10 >= length) {
                            break;
                        }
                        i6 = i10;
                    } else {
                        throw new IllegalArgumentException(kotlin.jvm.internal.i.n(obj2.getClass(), "Unexpected type in an array: "));
                    }
                }
            }
            bundle.putStringArrayList(str, arrayList);
        }
    }

    /* compiled from: BundleJSONConverter.kt */
    /* loaded from: classes.dex */
    public interface h {
        void a(Bundle bundle, String str, Object obj);
    }

    static {
        HashMap hashMap = new HashMap();
        f36442a = hashMap;
        hashMap.put(Boolean.class, new a());
        hashMap.put(Integer.class, new b());
        hashMap.put(Long.class, new C0611c());
        hashMap.put(Double.class, new d());
        hashMap.put(String.class, new e());
        hashMap.put(String[].class, new f());
        hashMap.put(JSONArray.class, new g());
    }

    public static final Bundle a(JSONObject jsonObject) {
        kotlin.jvm.internal.i.g(jsonObject, "jsonObject");
        Bundle bundle = new Bundle();
        Iterator<String> keys = jsonObject.keys();
        while (keys.hasNext()) {
            String key = keys.next();
            Object obj = jsonObject.get(key);
            if (obj != JSONObject.NULL) {
                if (obj instanceof JSONObject) {
                    bundle.putBundle(key, a((JSONObject) obj));
                } else {
                    h hVar = (h) f36442a.get(obj.getClass());
                    if (hVar != null) {
                        kotlin.jvm.internal.i.f(key, "key");
                        hVar.a(bundle, key, obj);
                    } else {
                        throw new IllegalArgumentException(kotlin.jvm.internal.i.n(obj.getClass(), "Unsupported type: "));
                    }
                }
            }
        }
        return bundle;
    }
}
