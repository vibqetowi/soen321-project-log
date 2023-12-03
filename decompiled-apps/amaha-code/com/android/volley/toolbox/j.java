package com.android.volley.toolbox;

import com.android.volley.VolleyError;
import com.theinnerhour.b2b.utils.Constants;
import e4.a;
import e4.o;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
/* compiled from: NetworkUtility.java */
/* loaded from: classes.dex */
public final class j {

    /* compiled from: NetworkUtility.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f5897a;

        /* renamed from: b  reason: collision with root package name */
        public final VolleyError f5898b;

        public a(String str, VolleyError volleyError) {
            this.f5897a = str;
            this.f5898b = volleyError;
        }
    }

    public static e4.i a(e4.j<?> jVar, long j10, List<e4.f> list) {
        a.C0214a cacheEntry = jVar.getCacheEntry();
        if (cacheEntry == null) {
            return new e4.i(304, (byte[]) null, true, j10, list);
        }
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            for (e4.f fVar : list) {
                treeSet.add(fVar.f13761a);
            }
        }
        ArrayList arrayList = new ArrayList(list);
        List<e4.f> list2 = cacheEntry.f13744h;
        if (list2 != null) {
            if (!list2.isEmpty()) {
                for (e4.f fVar2 : cacheEntry.f13744h) {
                    if (!treeSet.contains(fVar2.f13761a)) {
                        arrayList.add(fVar2);
                    }
                }
            }
        } else if (!cacheEntry.f13743g.isEmpty()) {
            for (Map.Entry<String, String> entry : cacheEntry.f13743g.entrySet()) {
                if (!treeSet.contains(entry.getKey())) {
                    arrayList.add(new e4.f(entry.getKey(), entry.getValue()));
                }
            }
        }
        return new e4.i(304, cacheEntry.f13738a, true, j10, (List<e4.f>) arrayList);
    }

    public static byte[] b(InputStream inputStream, int i6, c cVar) {
        byte[] bArr;
        k kVar = new k(cVar, i6);
        try {
            bArr = cVar.a(Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID);
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    kVar.write(bArr, 0, read);
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                        o.d("Error occurred when closing InputStream", new Object[0]);
                    }
                    cVar.b(bArr);
                    kVar.close();
                    throw th;
                }
            }
            byte[] byteArray = kVar.toByteArray();
            try {
                inputStream.close();
            } catch (IOException unused2) {
                o.d("Error occurred when closing InputStream", new Object[0]);
            }
            cVar.b(bArr);
            kVar.close();
            return byteArray;
        } catch (Throwable th3) {
            th = th3;
            bArr = null;
        }
    }

    public static void c(long j10, e4.j<?> jVar, byte[] bArr, int i6) {
        Object obj;
        if (o.f13792a || j10 > 3000) {
            Object[] objArr = new Object[5];
            objArr[0] = jVar;
            objArr[1] = Long.valueOf(j10);
            if (bArr != null) {
                obj = Integer.valueOf(bArr.length);
            } else {
                obj = "null";
            }
            objArr[2] = obj;
            objArr[3] = Integer.valueOf(i6);
            objArr[4] = Integer.valueOf(jVar.getRetryPolicy().c());
            o.b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", objArr);
        }
    }
}
