package xr;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
/* compiled from: Util.java */
/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f37987a = new String[0];

    /* renamed from: b  reason: collision with root package name */
    public static final Charset f37988b = Charset.forName("UTF-8");

    public static Object[] a(Object[] objArr, Object[] objArr2) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            int length = objArr2.length;
            int i6 = 0;
            while (true) {
                if (i6 < length) {
                    Object obj2 = objArr2[i6];
                    if (obj.equals(obj2)) {
                        arrayList.add(obj2);
                        break;
                    }
                    i6++;
                }
            }
        }
        return arrayList.toArray((Object[]) Array.newInstance(String.class, arrayList.size()));
    }
}
