package sg;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
/* compiled from: SourceProcessor.java */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public static final ArrayList f31565a;

    /* renamed from: b  reason: collision with root package name */
    public static final ArrayList f31566b;

    /* renamed from: c  reason: collision with root package name */
    public static final ArrayList f31567c;

    /* renamed from: d  reason: collision with root package name */
    public static final ArrayList f31568d;

    /* renamed from: e  reason: collision with root package name */
    public static final ArrayList f31569e;
    public static final ArrayList f;

    static {
        ArrayList arrayList = new ArrayList(2);
        f31565a = arrayList;
        arrayList.add("utm_source");
        arrayList.add("source");
        ArrayList arrayList2 = new ArrayList(2);
        f31567c = arrayList2;
        arrayList2.add("utm_campaign");
        arrayList2.add("campaign");
        ArrayList arrayList3 = new ArrayList(2);
        f31566b = arrayList3;
        arrayList3.add("utm_medium");
        arrayList3.add("medium");
        ArrayList arrayList4 = new ArrayList(2);
        f31568d = arrayList4;
        arrayList4.add("utm_id");
        arrayList4.add("id");
        ArrayList arrayList5 = new ArrayList(2);
        f31569e = arrayList5;
        arrayList5.add("utm_content");
        arrayList5.add("content");
        ArrayList arrayList6 = new ArrayList(2);
        f = arrayList6;
        arrayList6.add("utm_term");
        arrayList6.add("term");
    }

    public static jh.a a(Bundle bundle, Set set) {
        Set<String> keySet = bundle.keySet();
        String d10 = d(bundle, keySet, f31565a);
        String d11 = d(bundle, keySet, f31566b);
        String d12 = d(bundle, keySet, f31567c);
        String d13 = d(bundle, keySet, f31568d);
        String d14 = d(bundle, keySet, f31569e);
        String d15 = d(bundle, keySet, f);
        HashMap hashMap = new HashMap();
        if (keySet != null && set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (keySet.contains(str)) {
                    hashMap.put(str, bundle.getString(str));
                }
            }
        }
        return new jh.a(d10, d11, d12, d13, d14, d15, null, hashMap);
    }

    public static jh.a b(Uri uri, Set set) {
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        String c10 = c(uri, f31565a, queryParameterNames);
        String c11 = c(uri, f31566b, queryParameterNames);
        String c12 = c(uri, f31567c, queryParameterNames);
        String c13 = c(uri, f31568d, queryParameterNames);
        String c14 = c(uri, f31569e, queryParameterNames);
        String c15 = c(uri, f, queryParameterNames);
        String uri2 = uri.toString();
        HashMap hashMap = new HashMap();
        if (queryParameterNames != null && set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (queryParameterNames.contains(str)) {
                    hashMap.put(str, uri.getQueryParameter(str));
                }
            }
        }
        return new jh.a(c10, c11, c12, c13, c14, c15, uri2, hashMap);
    }

    public static String c(Uri uri, ArrayList arrayList, Set set) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (set.contains(str)) {
                return uri.getQueryParameter(str);
            }
        }
        return null;
    }

    public static String d(Bundle bundle, Set set, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (set.contains(str)) {
                return bundle.getString(str);
            }
        }
        return null;
    }
}
