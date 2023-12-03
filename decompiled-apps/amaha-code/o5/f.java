package o5;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import gv.r;
import h5.p;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: InAppPurchaseEventManager.kt */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f27154a = new f();

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap<String, Method> f27155b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public static final HashMap<String, Class<?>> f27156c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public static final String f27157d = p.a().getPackageName();

    /* renamed from: e  reason: collision with root package name */
    public static final SharedPreferences f27158e = p.a().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
    public static final SharedPreferences f = p.a().getSharedPreferences("com.facebook.internal.PURCHASE", 0);

    public static final ArrayList<String> f(Context context, Object obj) {
        if (b6.a.b(f.class)) {
            return null;
        }
        try {
            f fVar = f27154a;
            return fVar.a(fVar.e(context, obj, "inapp"));
        } catch (Throwable th2) {
            b6.a.a(f.class, th2);
            return null;
        }
    }

    public final ArrayList<String> a(ArrayList<String> arrayList) {
        SharedPreferences sharedPreferences = f;
        if (b6.a.b(this)) {
            return null;
        }
        try {
            ArrayList<String> arrayList2 = new ArrayList<>();
            SharedPreferences.Editor edit = sharedPreferences.edit();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                try {
                    JSONObject jSONObject = new JSONObject(next);
                    String string = jSONObject.getString("productId");
                    long j10 = jSONObject.getLong("purchaseTime");
                    String string2 = jSONObject.getString("purchaseToken");
                    if (currentTimeMillis - (j10 / 1000) <= 86400 && !kotlin.jvm.internal.i.b(sharedPreferences.getString(string, ""), string2)) {
                        edit.putString(string, string2);
                        arrayList2.add(next);
                    }
                } catch (JSONException unused) {
                }
            }
            edit.apply();
            return arrayList2;
        } catch (Throwable th2) {
            b6.a.a(this, th2);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0030 A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #3 {all -> 0x0034, blocks: (B:6:0x000a, B:9:0x0013, B:19:0x0030, B:12:0x001e), top: B:26:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Class<?> b(Context context, String str) {
        Class<?> loadClass;
        if (b6.a.b(this)) {
            return null;
        }
        HashMap<String, Class<?>> hashMap = f27156c;
        try {
            Class<?> cls = hashMap.get(str);
            if (cls != null) {
                return cls;
            }
            int i6 = j.f27172a;
            if (!b6.a.b(j.class)) {
                try {
                    loadClass = context.getClassLoader().loadClass(str);
                } catch (ClassNotFoundException unused) {
                }
                if (loadClass != null) {
                    hashMap.put(str, loadClass);
                }
                return loadClass;
            }
            loadClass = null;
            if (loadClass != null) {
            }
            return loadClass;
        } catch (Throwable th2) {
            b6.a.a(this, th2);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final Method c(Class<?> cls, String str) {
        Class[] clsArr;
        Method b10;
        if (b6.a.b(this)) {
            return null;
        }
        try {
            HashMap<String, Method> hashMap = f27155b;
            Method method = hashMap.get(str);
            if (method != null) {
                return method;
            }
            switch (str.hashCode()) {
                case -1801122596:
                    if (str.equals("getPurchases")) {
                        Class TYPE = Integer.TYPE;
                        kotlin.jvm.internal.i.f(TYPE, "TYPE");
                        clsArr = new Class[]{TYPE, String.class, String.class, String.class};
                        break;
                    } else {
                        clsArr = null;
                        break;
                    }
                case -1450694211:
                    if (str.equals("isBillingSupported")) {
                        Class TYPE2 = Integer.TYPE;
                        kotlin.jvm.internal.i.f(TYPE2, "TYPE");
                        clsArr = new Class[]{TYPE2, String.class, String.class};
                        break;
                    } else {
                        clsArr = null;
                        break;
                    }
                case -1123215065:
                    if (!str.equals("asInterface")) {
                        clsArr = null;
                        break;
                    } else {
                        clsArr = new Class[]{IBinder.class};
                        break;
                    }
                case -594356707:
                    if (str.equals("getPurchaseHistory")) {
                        Class TYPE3 = Integer.TYPE;
                        kotlin.jvm.internal.i.f(TYPE3, "TYPE");
                        clsArr = new Class[]{TYPE3, String.class, String.class, String.class, Bundle.class};
                        break;
                    } else {
                        clsArr = null;
                        break;
                    }
                case -573310373:
                    if (str.equals("getSkuDetails")) {
                        Class TYPE4 = Integer.TYPE;
                        kotlin.jvm.internal.i.f(TYPE4, "TYPE");
                        clsArr = new Class[]{TYPE4, String.class, String.class, Bundle.class};
                        break;
                    } else {
                        clsArr = null;
                        break;
                    }
                default:
                    clsArr = null;
                    break;
            }
            if (clsArr == null) {
                b10 = j.b(cls, str, null);
            } else {
                int i6 = j.f27172a;
                b10 = j.b(cls, str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            }
            if (b10 != null) {
                hashMap.put(str, b10);
            }
            return b10;
        } catch (Throwable th2) {
            b6.a.a(this, th2);
            return null;
        }
    }

    public final ArrayList d(Context context, Object obj) {
        ArrayList<String> stringArrayList;
        if (b6.a.b(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (i(context, obj, "inapp")) {
                char c10 = 0;
                String str = null;
                int i6 = 0;
                boolean z10 = false;
                while (true) {
                    Object[] objArr = new Object[5];
                    objArr[c10] = 6;
                    objArr[1] = f27157d;
                    objArr[2] = "inapp";
                    objArr[3] = str;
                    objArr[4] = new Bundle();
                    Object h10 = h(context, "com.android.vending.billing.IInAppBillingService", "getPurchaseHistory", obj, objArr);
                    if (h10 != null) {
                        long currentTimeMillis = System.currentTimeMillis() / 1000;
                        Bundle bundle = (Bundle) h10;
                        if (bundle.getInt("RESPONSE_CODE") == 0 && (stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST")) != null) {
                            Iterator<String> it = stringArrayList.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                String next = it.next();
                                if (currentTimeMillis - (new JSONObject(next).getLong("purchaseTime") / 1000) > 1200) {
                                    z10 = true;
                                    break;
                                }
                                arrayList.add(next);
                                i6++;
                            }
                            str = bundle.getString("INAPP_CONTINUATION_TOKEN");
                            if (i6 < 30 || str == null || z10) {
                                break;
                                break;
                            }
                            c10 = 0;
                        }
                    }
                    str = null;
                    if (i6 < 30) {
                        break;
                    }
                    c10 = 0;
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            b6.a.a(this, th2);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0062 A[EDGE_INSN: B:31:0x0062->B:23:0x0062 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList<String> e(Context context, Object obj, String str) {
        if (b6.a.b(this)) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            if (obj == null) {
                return arrayList;
            }
            if (i(context, obj, str)) {
                String str2 = null;
                int i6 = 0;
                do {
                    Object h10 = h(context, "com.android.vending.billing.IInAppBillingService", "getPurchases", obj, new Object[]{3, f27157d, str, str2});
                    if (h10 != null) {
                        Bundle bundle = (Bundle) h10;
                        if (bundle.getInt("RESPONSE_CODE") == 0) {
                            ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                            if (stringArrayList == null) {
                                break;
                            }
                            i6 += stringArrayList.size();
                            arrayList.addAll(stringArrayList);
                            str2 = bundle.getString("INAPP_CONTINUATION_TOKEN");
                            if (i6 >= 30) {
                                break;
                            }
                        }
                    }
                    str2 = null;
                    if (i6 >= 30) {
                        break;
                        break;
                    }
                } while (str2 != null);
            }
            return arrayList;
        } catch (Throwable th2) {
            b6.a.a(this, th2);
            return null;
        }
    }

    public final LinkedHashMap g(Context context, ArrayList arrayList, Object obj, boolean z10) {
        Object obj2;
        int size;
        if (b6.a.b(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (obj != null && !arrayList.isEmpty()) {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
                Object[] objArr = new Object[4];
                int i6 = 0;
                objArr[0] = 3;
                objArr[1] = f27157d;
                if (z10) {
                    obj2 = "subs";
                } else {
                    obj2 = "inapp";
                }
                objArr[2] = obj2;
                objArr[3] = bundle;
                Object h10 = h(context, "com.android.vending.billing.IInAppBillingService", "getSkuDetails", obj, objArr);
                if (h10 != null) {
                    Bundle bundle2 = (Bundle) h10;
                    if (bundle2.getInt("RESPONSE_CODE") == 0) {
                        ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                        if (stringArrayList != null && arrayList.size() == stringArrayList.size() && arrayList.size() - 1 >= 0) {
                            while (true) {
                                int i10 = i6 + 1;
                                Object obj3 = arrayList.get(i6);
                                kotlin.jvm.internal.i.f(obj3, "skuList[i]");
                                String str = stringArrayList.get(i6);
                                kotlin.jvm.internal.i.f(str, "skuDetailsList[i]");
                                linkedHashMap.put(obj3, str);
                                if (i10 > size) {
                                    break;
                                }
                                i6 = i10;
                            }
                        }
                        k(linkedHashMap);
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th2) {
            b6.a.a(this, th2);
            return null;
        }
    }

    public final Object h(Context context, String str, String str2, Object obj, Object[] objArr) {
        Method c10;
        if (b6.a.b(this)) {
            return null;
        }
        try {
            Class<?> b10 = b(context, str);
            if (b10 == null || (c10 = c(b10, str2)) == null) {
                return null;
            }
            int i6 = j.f27172a;
            return j.d(b10, obj, c10, Arrays.copyOf(objArr, objArr.length));
        } catch (Throwable th2) {
            b6.a.a(this, th2);
            return null;
        }
    }

    public final boolean i(Context context, Object obj, String str) {
        if (b6.a.b(this) || obj == null) {
            return false;
        }
        try {
            Object h10 = h(context, "com.android.vending.billing.IInAppBillingService", "isBillingSupported", obj, new Object[]{3, f27157d, str});
            if (h10 == null) {
                return false;
            }
            if (((Integer) h10).intValue() != 0) {
                return false;
            }
            return true;
        } catch (Throwable th2) {
            b6.a.a(this, th2);
            return false;
        }
    }

    public final LinkedHashMap j(ArrayList arrayList) {
        if (b6.a.b(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String sku = (String) it.next();
                String string = f27158e.getString(sku, null);
                if (string != null) {
                    List a12 = r.a1(string, new String[]{";"}, 2, 2);
                    if (currentTimeMillis - Long.parseLong((String) a12.get(0)) < 43200) {
                        kotlin.jvm.internal.i.f(sku, "sku");
                        linkedHashMap.put(sku, a12.get(1));
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th2) {
            b6.a.a(this, th2);
            return null;
        }
    }

    public final void k(LinkedHashMap linkedHashMap) {
        if (b6.a.b(this)) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences.Editor edit = f27158e.edit();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                edit.putString((String) entry.getKey(), currentTimeMillis + ';' + ((String) entry.getValue()));
            }
            edit.apply();
        } catch (Throwable th2) {
            b6.a.a(this, th2);
        }
    }
}
