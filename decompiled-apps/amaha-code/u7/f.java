package u7;

import android.net.Uri;
import d8.c0;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: DefaultExtractorsFactory.java */
/* loaded from: classes.dex */
public final class f implements k {

    /* renamed from: u  reason: collision with root package name */
    public static final int[] f33875u = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 14};

    /* renamed from: v  reason: collision with root package name */
    public static final a f33876v = new a();

    /* compiled from: DefaultExtractorsFactory.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicBoolean f33877a = new AtomicBoolean(false);

        /* renamed from: b  reason: collision with root package name */
        public Constructor<? extends h> f33878b;
    }

    public static void a(int i6, ArrayList arrayList) {
        h hVar;
        Constructor<? extends h> constructor;
        switch (i6) {
            case 0:
                arrayList.add(new d8.a());
                return;
            case 1:
                arrayList.add(new d8.c());
                return;
            case 2:
                arrayList.add(new d8.e());
                return;
            case 3:
                arrayList.add(new v7.a());
                return;
            case 4:
                a aVar = f33876v;
                synchronized (aVar.f33877a) {
                    hVar = null;
                    if (aVar.f33877a.get()) {
                        constructor = aVar.f33878b;
                    } else {
                        try {
                            if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                                aVar.f33878b = Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(h.class).getConstructor(Integer.TYPE);
                            }
                        } catch (ClassNotFoundException unused) {
                        } catch (Exception e10) {
                            throw new RuntimeException("Error instantiating FLAC extension", e10);
                        }
                        aVar.f33877a.set(true);
                        constructor = aVar.f33878b;
                    }
                }
                if (constructor != null) {
                    try {
                        hVar = constructor.newInstance(0);
                    } catch (Exception e11) {
                        throw new IllegalStateException("Unexpected error creating FLAC extractor", e11);
                    }
                }
                if (hVar != null) {
                    arrayList.add(hVar);
                    return;
                } else {
                    arrayList.add(new w7.b());
                    return;
                }
            case 5:
                arrayList.add(new x7.a());
                return;
            case 6:
                arrayList.add(new z7.d());
                return;
            case 7:
                arrayList.add(new a8.d(0));
                return;
            case 8:
                arrayList.add(new b8.e());
                arrayList.add(new b8.g(0));
                return;
            case 9:
                arrayList.add(new c8.c());
                return;
            case 10:
                arrayList.add(new d8.w());
                return;
            case 11:
                arrayList.add(new c0());
                return;
            case 12:
                arrayList.add(new e8.a());
                return;
            case 13:
            default:
                return;
            case 14:
                arrayList.add(new y7.a());
                return;
        }
    }

    @Override // u7.k
    public final synchronized h[] d(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        arrayList = new ArrayList(14);
        int I = kc.f.I(map);
        if (I != -1) {
            a(I, arrayList);
        }
        int J = kc.f.J(uri);
        if (J != -1 && J != I) {
            a(J, arrayList);
        }
        int[] iArr = f33875u;
        for (int i6 = 0; i6 < 14; i6++) {
            int i10 = iArr[i6];
            if (i10 != I && i10 != J) {
                a(i10, arrayList);
            }
        }
        return (h[]) arrayList.toArray(new h[arrayList.size()]);
    }
}
