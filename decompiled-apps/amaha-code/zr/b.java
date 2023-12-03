package zr;

import java.util.ArrayList;
import java.util.Locale;
import xr.d;
/* compiled from: Request.java */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final zr.a f39833a;

    /* renamed from: b  reason: collision with root package name */
    public final d f39834b;

    /* compiled from: Request.java */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public zr.a f39835a;

        /* renamed from: b  reason: collision with root package name */
        public final d.a f39836b = new d.a();

        public final void a(String str, String str2) {
            d.a aVar = this.f39836b;
            aVar.getClass();
            if (!str.isEmpty()) {
                int length = str.length();
                int i6 = 0;
                for (int i10 = 0; i10 < length; i10++) {
                    char charAt = str.charAt(i10);
                    if (charAt <= 31 || charAt >= 127) {
                        throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i10), str));
                    }
                }
                if (str2 != null) {
                    int length2 = str2.length();
                    for (int i11 = 0; i11 < length2; i11++) {
                        char charAt2 = str2.charAt(i11);
                        if (charAt2 <= 31 || charAt2 >= 127) {
                            throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header value: %s", Integer.valueOf(charAt2), Integer.valueOf(i11), str2));
                        }
                    }
                    while (true) {
                        ArrayList arrayList = aVar.f37956a;
                        if (i6 < arrayList.size()) {
                            if (str.equalsIgnoreCase((String) arrayList.get(i6))) {
                                arrayList.remove(i6);
                                arrayList.remove(i6);
                                i6 -= 2;
                            }
                            i6 += 2;
                        } else {
                            arrayList.add(str);
                            arrayList.add(str2.trim());
                            return;
                        }
                    }
                } else {
                    throw new IllegalArgumentException("value == null");
                }
            } else {
                throw new IllegalArgumentException("name is empty");
            }
        }
    }

    public b(a aVar) {
        this.f39833a = aVar.f39835a;
        d.a aVar2 = aVar.f39836b;
        aVar2.getClass();
        this.f39834b = new d(aVar2);
    }

    public final String toString() {
        return "Request{url=" + this.f39833a + '}';
    }
}
