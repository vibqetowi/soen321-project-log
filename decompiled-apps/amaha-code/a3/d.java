package a3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PathMeasure;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
/* compiled from: LottieCompositionFactory.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap f190a = new HashMap();

    /* compiled from: LottieCompositionFactory.java */
    /* loaded from: classes.dex */
    public class a implements m<a3.c> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f191a;

        public a(String str) {
            this.f191a = str;
        }

        @Override // a3.m
        public final void onResult(a3.c cVar) {
            d.f190a.remove(this.f191a);
        }
    }

    /* compiled from: LottieCompositionFactory.java */
    /* loaded from: classes.dex */
    public class b implements m<Throwable> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f192a;

        public b(String str) {
            this.f192a = str;
        }

        @Override // a3.m
        public final void onResult(Throwable th2) {
            d.f190a.remove(this.f192a);
        }
    }

    /* compiled from: LottieCompositionFactory.java */
    /* loaded from: classes.dex */
    public class c implements Callable<p<a3.c>> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ a3.c f193u;

        public c(a3.c cVar) {
            this.f193u = cVar;
        }

        @Override // java.util.concurrent.Callable
        public final p<a3.c> call() {
            return new p<>(this.f193u);
        }
    }

    public static r<a3.c> a(String str, Callable<p<a3.c>> callable) {
        a3.c b10;
        if (str == null) {
            b10 = null;
        } else {
            b10 = f3.g.f14777b.f14778a.b(str);
        }
        if (b10 != null) {
            return new r<>(new c(b10));
        }
        HashMap hashMap = f190a;
        if (str != null && hashMap.containsKey(str)) {
            return (r) hashMap.get(str);
        }
        r<a3.c> rVar = new r<>(callable);
        if (str != null) {
            rVar.b(new a(str));
            b bVar = new b(str);
            synchronized (rVar) {
                if (rVar.f275d != null && rVar.f275d.f269b != null) {
                    bVar.onResult(rVar.f275d.f269b);
                }
                rVar.f273b.add(bVar);
            }
            hashMap.put(str, rVar);
        }
        return rVar;
    }

    public static p<a3.c> b(InputStream inputStream, String str) {
        try {
            zv.t j10 = ta.v.j(ta.v.P(inputStream));
            String[] strArr = l3.c.f24004y;
            return c(new l3.d(j10), str, true);
        } finally {
            m3.g.b(inputStream);
        }
    }

    public static p c(l3.d dVar, String str, boolean z10) {
        try {
            try {
                a3.c a10 = k3.p.a(dVar);
                if (str != null) {
                    f3.g.f14777b.f14778a.c(str, a10);
                }
                p pVar = new p(a10);
                if (z10) {
                    m3.g.b(dVar);
                }
                return pVar;
            } catch (Exception e10) {
                p pVar2 = new p(e10);
                if (z10) {
                    m3.g.b(dVar);
                }
                return pVar2;
            }
        } catch (Throwable th2) {
            if (z10) {
                m3.g.b(dVar);
            }
            throw th2;
        }
    }

    public static r d(String str) {
        return a(null, new i(str));
    }

    public static r e(int i6, Context context) {
        return f(context, h(i6, context), i6);
    }

    public static r f(Context context, String str, int i6) {
        return a(str, new g(new WeakReference(context), context.getApplicationContext(), i6));
    }

    public static p<a3.c> g(ZipInputStream zipInputStream, String str) {
        l lVar;
        String[] split;
        HashMap hashMap = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            a3.c cVar = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    zv.t j10 = ta.v.j(ta.v.P(zipInputStream));
                    String[] strArr = l3.c.f24004y;
                    cVar = (a3.c) c(new l3.d(j10), null, false).f268a;
                } else {
                    if (!name.contains(".png") && !name.contains(".webp")) {
                        zipInputStream.closeEntry();
                    }
                    hashMap.put(name.split("/")[split.length - 1], BitmapFactory.decodeStream(zipInputStream));
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (cVar == null) {
                return new p<>(new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                String str2 = (String) entry.getKey();
                Iterator<l> it = cVar.f179d.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        lVar = it.next();
                        if (lVar.f242c.equals(str2)) {
                            break;
                        }
                    } else {
                        lVar = null;
                        break;
                    }
                }
                if (lVar != null) {
                    Bitmap bitmap = (Bitmap) entry.getValue();
                    PathMeasure pathMeasure = m3.g.f24799a;
                    int width = bitmap.getWidth();
                    int i6 = lVar.f240a;
                    int i10 = lVar.f241b;
                    if (width != i6 || bitmap.getHeight() != i10) {
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i6, i10, true);
                        bitmap.recycle();
                        bitmap = createScaledBitmap;
                    }
                    lVar.f243d = bitmap;
                }
            }
            for (Map.Entry<String, l> entry2 : cVar.f179d.entrySet()) {
                if (entry2.getValue().f243d == null) {
                    return new p<>(new IllegalStateException("There is no image for " + entry2.getValue().f242c));
                }
            }
            if (str != null) {
                f3.g.f14777b.f14778a.c(str, cVar);
            }
            return new p<>(cVar);
        } catch (IOException e10) {
            return new p<>(e10);
        }
    }

    public static String h(int i6, Context context) {
        boolean z10;
        String str;
        StringBuilder sb2 = new StringBuilder("rawRes");
        if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            str = "_night_";
        } else {
            str = "_day_";
        }
        sb2.append(str);
        sb2.append(i6);
        return sb2.toString();
    }
}
