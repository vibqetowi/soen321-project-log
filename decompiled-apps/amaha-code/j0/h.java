package j0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.internal.cast.w;
import i0.d;
import i0.f;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p0.k;
/* compiled from: TypefaceCompat.java */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final o f21630a;

    /* renamed from: b  reason: collision with root package name */
    public static final t.f<String, Typeface> f21631b;

    /* compiled from: TypefaceCompat.java */
    /* loaded from: classes.dex */
    public static class a extends w {
        public final f.e C;

        public a(f.e eVar) {
            this.C = eVar;
        }
    }

    static {
        boolean z10;
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 29) {
            f21630a = new m();
        } else if (i6 >= 28) {
            f21630a = new l();
        } else if (i6 >= 26) {
            f21630a = new k();
        } else {
            if (i6 >= 24) {
                Method method = j.f21639c;
                if (method == null) {
                    Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                }
                if (method != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    f21630a = new j();
                }
            }
            f21630a = new i();
        }
        f21631b = new t.f<>(16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        if (r0.equals(r4) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface a(Context context, d.b bVar, Resources resources, int i6, String str, int i10, int i11, f.e eVar, boolean z10) {
        Typeface a10;
        Typeface typeface;
        int i12;
        Handler handler;
        if (bVar instanceof d.e) {
            d.e eVar2 = (d.e) bVar;
            String str2 = eVar2.f19625d;
            a10 = null;
            boolean z11 = false;
            if (str2 != null && !str2.isEmpty()) {
                typeface = Typeface.create(str2, 0);
                Typeface create = Typeface.create(Typeface.DEFAULT, 0);
                if (typeface != null) {
                }
            }
            typeface = null;
            if (typeface != null) {
                if (eVar != null) {
                    eVar.b(typeface);
                }
                return typeface;
            }
            if (!z10 ? eVar == null : eVar2.f19624c == 0) {
                z11 = true;
            }
            if (z10) {
                i12 = eVar2.f19623b;
            } else {
                i12 = -1;
            }
            Handler handler2 = new Handler(Looper.getMainLooper());
            a aVar = new a(eVar);
            p0.f fVar = eVar2.f19622a;
            p0.c cVar = new p0.c(aVar, handler2);
            if (z11) {
                t.f<String, Typeface> fVar2 = p0.k.f27846a;
                String str3 = ((String) fVar.f) + "-" + i11;
                Typeface b10 = p0.k.f27846a.b(str3);
                if (b10 != null) {
                    handler2.post(new p0.a(aVar, b10));
                    a10 = b10;
                } else if (i12 == -1) {
                    k.a a11 = p0.k.a(str3, context, fVar, i11);
                    cVar.a(a11);
                    a10 = a11.f27850a;
                } else {
                    try {
                        try {
                            try {
                                k.a aVar2 = (k.a) p0.k.f27847b.submit(new p0.g(str3, context, fVar, i11)).get(i12, TimeUnit.MILLISECONDS);
                                cVar.a(aVar2);
                                a10 = aVar2.f27850a;
                            } catch (InterruptedException e10) {
                                throw e10;
                            }
                        } catch (ExecutionException e11) {
                            throw new RuntimeException(e11);
                        } catch (TimeoutException unused) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused2) {
                        cVar.f27827b.post(new p0.b(cVar.f27826a, -3));
                    }
                }
            } else {
                t.f<String, Typeface> fVar3 = p0.k.f27846a;
                String str4 = ((String) fVar.f) + "-" + i11;
                Typeface b11 = p0.k.f27846a.b(str4);
                if (b11 != null) {
                    handler2.post(new p0.a(aVar, b11));
                    a10 = b11;
                } else {
                    p0.h hVar = new p0.h(cVar);
                    synchronized (p0.k.f27848c) {
                        t.h<String, ArrayList<s0.a<k.a>>> hVar2 = p0.k.f27849d;
                        ArrayList<s0.a<k.a>> orDefault = hVar2.getOrDefault(str4, null);
                        if (orDefault != null) {
                            orDefault.add(hVar);
                        } else {
                            ArrayList<s0.a<k.a>> arrayList = new ArrayList<>();
                            arrayList.add(hVar);
                            hVar2.put(str4, arrayList);
                            p0.i iVar = new p0.i(str4, context, fVar, i11);
                            ThreadPoolExecutor threadPoolExecutor = p0.k.f27847b;
                            p0.j jVar = new p0.j(str4);
                            if (Looper.myLooper() == null) {
                                handler = new Handler(Looper.getMainLooper());
                            } else {
                                handler = new Handler();
                            }
                            threadPoolExecutor.execute(new p0.o(handler, iVar, jVar));
                        }
                    }
                }
            }
        } else {
            a10 = f21630a.a(context, (d.c) bVar, resources, i11);
            if (eVar != null) {
                if (a10 != null) {
                    eVar.b(a10);
                } else {
                    eVar.a(-3);
                }
            }
        }
        if (a10 != null) {
            f21631b.c(b(resources, i6, str, i10, i11), a10);
        }
        return a10;
    }

    public static String b(Resources resources, int i6, String str, int i10, int i11) {
        return resources.getResourcePackageName(i6) + '-' + str + '-' + i10 + '-' + i6 + '-' + i11;
    }
}
