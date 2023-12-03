package xr;

import java.util.ArrayList;
/* compiled from: Headers.java */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String[] f37955a;

    /* compiled from: Headers.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f37956a = new ArrayList(20);
    }

    public d(a aVar) {
        ArrayList arrayList = aVar.f37956a;
        this.f37955a = (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        String[] strArr = this.f37955a;
        int length = strArr.length / 2;
        for (int i6 = 0; i6 < length; i6++) {
            int i10 = i6 * 2;
            String str2 = null;
            if (i10 >= 0 && i10 < strArr.length) {
                str = strArr[i10];
            } else {
                str = null;
            }
            sb2.append(str);
            sb2.append(": ");
            int i11 = i10 + 1;
            if (i11 >= 0 && i11 < strArr.length) {
                str2 = strArr[i11];
            }
            sb2.append(str2);
            sb2.append("\n");
        }
        return sb2.toString();
    }
}
