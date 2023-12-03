package z4;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import b5.a;
import com.bumptech.glide.load.engine.GlideException;
import d5.j;
import e5.d;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import k4.m;
import k4.v;
import o4.k;
/* compiled from: SingleRequest.java */
/* loaded from: classes.dex */
public final class h<R> implements b, a5.g, g {
    public static final boolean C = Log.isLoggable("Request", 2);
    public boolean A;
    public final RuntimeException B;

    /* renamed from: a  reason: collision with root package name */
    public final String f39166a;

    /* renamed from: b  reason: collision with root package name */
    public final d.a f39167b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f39168c;

    /* renamed from: d  reason: collision with root package name */
    public final e<R> f39169d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f39170e;
    public final com.bumptech.glide.c f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f39171g;

    /* renamed from: h  reason: collision with root package name */
    public final Class<R> f39172h;

    /* renamed from: i  reason: collision with root package name */
    public final a<?> f39173i;

    /* renamed from: j  reason: collision with root package name */
    public final int f39174j;

    /* renamed from: k  reason: collision with root package name */
    public final int f39175k;

    /* renamed from: l  reason: collision with root package name */
    public final com.bumptech.glide.d f39176l;

    /* renamed from: m  reason: collision with root package name */
    public final a5.h<R> f39177m;

    /* renamed from: n  reason: collision with root package name */
    public final List<e<R>> f39178n;

    /* renamed from: o  reason: collision with root package name */
    public final b5.b<? super R> f39179o;

    /* renamed from: p  reason: collision with root package name */
    public final Executor f39180p;

    /* renamed from: q  reason: collision with root package name */
    public v<R> f39181q;
    public m.d r;

    /* renamed from: s  reason: collision with root package name */
    public long f39182s;

    /* renamed from: t  reason: collision with root package name */
    public volatile m f39183t;

    /* renamed from: u  reason: collision with root package name */
    public int f39184u;

    /* renamed from: v  reason: collision with root package name */
    public Drawable f39185v;

    /* renamed from: w  reason: collision with root package name */
    public Drawable f39186w;

    /* renamed from: x  reason: collision with root package name */
    public Drawable f39187x;

    /* renamed from: y  reason: collision with root package name */
    public int f39188y;

    /* renamed from: z  reason: collision with root package name */
    public int f39189z;

    public h(Context context, com.bumptech.glide.c cVar, Object obj, Object obj2, Class cls, a aVar, int i6, int i10, com.bumptech.glide.d dVar, a5.h hVar, d dVar2, ArrayList arrayList, m mVar, a.C0075a c0075a, Executor executor) {
        this.f39166a = C ? String.valueOf(hashCode()) : null;
        this.f39167b = new d.a();
        this.f39168c = obj;
        this.f39170e = context;
        this.f = cVar;
        this.f39171g = obj2;
        this.f39172h = cls;
        this.f39173i = aVar;
        this.f39174j = i6;
        this.f39175k = i10;
        this.f39176l = dVar;
        this.f39177m = hVar;
        this.f39169d = dVar2;
        this.f39178n = arrayList;
        this.f39183t = mVar;
        this.f39179o = c0075a;
        this.f39180p = executor;
        this.f39184u = 1;
        if (this.B == null && cVar.f5946h) {
            this.B = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // a5.g
    public final void a(int i6, int i10) {
        Object obj;
        int round;
        int i11 = i6;
        this.f39167b.a();
        Object obj2 = this.f39168c;
        synchronized (obj2) {
            try {
                boolean z10 = C;
                if (z10) {
                    j("Got onSizeReady in " + d5.f.a(this.f39182s));
                }
                if (this.f39184u == 3) {
                    this.f39184u = 2;
                    float f = this.f39173i.f39155v;
                    if (i11 != Integer.MIN_VALUE) {
                        i11 = Math.round(i11 * f);
                    }
                    this.f39188y = i11;
                    if (i10 == Integer.MIN_VALUE) {
                        round = i10;
                    } else {
                        round = Math.round(f * i10);
                    }
                    this.f39189z = round;
                    if (z10) {
                        j("finished setup for calling load in " + d5.f.a(this.f39182s));
                    }
                    m mVar = this.f39183t;
                    com.bumptech.glide.c cVar = this.f;
                    Object obj3 = this.f39171g;
                    a<?> aVar = this.f39173i;
                    try {
                        obj = obj2;
                        try {
                            try {
                                this.r = mVar.b(cVar, obj3, aVar.F, this.f39188y, this.f39189z, aVar.M, this.f39172h, this.f39176l, aVar.f39156w, aVar.L, aVar.G, aVar.S, aVar.K, aVar.C, aVar.Q, aVar.T, aVar.R, this, this.f39180p);
                                if (this.f39184u != 2) {
                                    this.r = null;
                                }
                                if (z10) {
                                    j("finished onSizeReady in " + d5.f.a(this.f39182s));
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                while (true) {
                                    try {
                                        break;
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        obj = obj2;
                    }
                }
            } catch (Throwable th6) {
                th = th6;
                obj = obj2;
            }
        }
    }

    @Override // z4.b
    public final boolean b() {
        boolean z10;
        synchronized (this.f39168c) {
            if (this.f39184u == 6) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // z4.b
    public final void c() {
        int i6;
        synchronized (this.f39168c) {
            if (!this.A) {
                this.f39167b.a();
                int i10 = d5.f.f12193b;
                this.f39182s = SystemClock.elapsedRealtimeNanos();
                int i11 = 3;
                if (this.f39171g == null) {
                    if (j.f(this.f39174j, this.f39175k)) {
                        this.f39188y = this.f39174j;
                        this.f39189z = this.f39175k;
                    }
                    if (this.f39187x == null) {
                        a<?> aVar = this.f39173i;
                        Drawable drawable = aVar.I;
                        this.f39187x = drawable;
                        if (drawable == null && (i6 = aVar.J) > 0) {
                            this.f39187x = i(i6);
                        }
                    }
                    if (this.f39187x == null) {
                        i11 = 5;
                    }
                    k(new GlideException("Received null model"), i11);
                    return;
                }
                int i12 = this.f39184u;
                if (i12 != 2) {
                    if (i12 == 4) {
                        l(h4.a.MEMORY_CACHE, this.f39181q);
                        return;
                    }
                    this.f39184u = 3;
                    if (j.f(this.f39174j, this.f39175k)) {
                        a(this.f39174j, this.f39175k);
                    } else {
                        this.f39177m.e(this);
                    }
                    int i13 = this.f39184u;
                    if (i13 == 2 || i13 == 3) {
                        this.f39177m.k(f());
                    }
                    if (C) {
                        j("finished run method in " + d5.f.a(this.f39182s));
                    }
                    return;
                }
                throw new IllegalArgumentException("Cannot restart a running request");
            }
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    @Override // z4.b
    public final void clear() {
        synchronized (this.f39168c) {
            if (!this.A) {
                this.f39167b.a();
                if (this.f39184u == 6) {
                    return;
                }
                e();
                v<R> vVar = this.f39181q;
                if (vVar != null) {
                    this.f39181q = null;
                } else {
                    vVar = null;
                }
                this.f39177m.m(f());
                this.f39184u = 6;
                if (vVar != null) {
                    this.f39183t.getClass();
                    m.g(vVar);
                    return;
                }
                return;
            }
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    @Override // z4.b
    public final boolean d() {
        boolean z10;
        synchronized (this.f39168c) {
            if (this.f39184u == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final void e() {
        if (!this.A) {
            this.f39167b.a();
            this.f39177m.j(this);
            m.d dVar = this.r;
            if (dVar != null) {
                synchronized (m.this) {
                    dVar.f22901a.j(dVar.f22902b);
                }
                this.r = null;
                return;
            }
            return;
        }
        throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
    }

    public final Drawable f() {
        int i6;
        if (this.f39186w == null) {
            a<?> aVar = this.f39173i;
            Drawable drawable = aVar.A;
            this.f39186w = drawable;
            if (drawable == null && (i6 = aVar.B) > 0) {
                this.f39186w = i(i6);
            }
        }
        return this.f39186w;
    }

    public final boolean g(b bVar) {
        int i6;
        int i10;
        Object obj;
        Class<R> cls;
        a<?> aVar;
        com.bumptech.glide.d dVar;
        int i11;
        int i12;
        int i13;
        Object obj2;
        Class<R> cls2;
        a<?> aVar2;
        com.bumptech.glide.d dVar2;
        int i14;
        boolean equals;
        if (!(bVar instanceof h)) {
            return false;
        }
        synchronized (this.f39168c) {
            i6 = this.f39174j;
            i10 = this.f39175k;
            obj = this.f39171g;
            cls = this.f39172h;
            aVar = this.f39173i;
            dVar = this.f39176l;
            List<e<R>> list = this.f39178n;
            if (list != null) {
                i11 = list.size();
            } else {
                i11 = 0;
            }
        }
        h hVar = (h) bVar;
        synchronized (hVar.f39168c) {
            i12 = hVar.f39174j;
            i13 = hVar.f39175k;
            obj2 = hVar.f39171g;
            cls2 = hVar.f39172h;
            aVar2 = hVar.f39173i;
            dVar2 = hVar.f39176l;
            List<e<R>> list2 = hVar.f39178n;
            if (list2 != null) {
                i14 = list2.size();
            } else {
                i14 = 0;
            }
        }
        if (i6 == i12 && i10 == i13) {
            char[] cArr = j.f12201a;
            if (obj == null) {
                if (obj2 == null) {
                    equals = true;
                } else {
                    equals = false;
                }
            } else if (obj instanceof k) {
                equals = ((k) obj).a();
            } else {
                equals = obj.equals(obj2);
            }
            if (equals && cls.equals(cls2) && aVar.equals(aVar2) && dVar == dVar2 && i11 == i14) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return true;
    }

    public final Drawable i(int i6) {
        Resources.Theme theme = this.f39173i.O;
        if (theme == null) {
            theme = this.f39170e.getTheme();
        }
        com.bumptech.glide.c cVar = this.f;
        return t4.a.a(cVar, cVar, i6, theme);
    }

    @Override // z4.b
    public final boolean isRunning() {
        boolean z10;
        synchronized (this.f39168c) {
            int i6 = this.f39184u;
            if (i6 != 2 && i6 != 3) {
                z10 = false;
            }
            z10 = true;
        }
        return z10;
    }

    public final void j(String str) {
        StringBuilder d10 = v.g.d(str, " this: ");
        d10.append(this.f39166a);
        Log.v("Request", d10.toString());
    }

    public final void k(GlideException glideException, int i6) {
        int i10;
        int i11;
        this.f39167b.a();
        synchronized (this.f39168c) {
            glideException.getClass();
            int i12 = this.f.f5947i;
            if (i12 <= i6) {
                Log.w("Glide", "Load failed for " + this.f39171g + " with size [" + this.f39188y + "x" + this.f39189z + "]", glideException);
                if (i12 <= 4) {
                    glideException.e();
                }
            }
            Drawable drawable = null;
            this.r = null;
            this.f39184u = 5;
            this.A = true;
            List<e<R>> list = this.f39178n;
            if (list != null) {
                for (e<R> eVar : list) {
                    h();
                    eVar.b(glideException);
                }
            }
            e<R> eVar2 = this.f39169d;
            if (eVar2 != null) {
                h();
                eVar2.b(glideException);
            }
            if (this.f39171g == null) {
                if (this.f39187x == null) {
                    a<?> aVar = this.f39173i;
                    Drawable drawable2 = aVar.I;
                    this.f39187x = drawable2;
                    if (drawable2 == null && (i11 = aVar.J) > 0) {
                        this.f39187x = i(i11);
                    }
                }
                drawable = this.f39187x;
            }
            if (drawable == null) {
                if (this.f39185v == null) {
                    a<?> aVar2 = this.f39173i;
                    Drawable drawable3 = aVar2.f39158y;
                    this.f39185v = drawable3;
                    if (drawable3 == null && (i10 = aVar2.f39159z) > 0) {
                        this.f39185v = i(i10);
                    }
                }
                drawable = this.f39185v;
            }
            if (drawable == null) {
                drawable = f();
            }
            this.f39177m.h(drawable);
            this.A = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(h4.a aVar, v vVar) {
        Object obj;
        String str;
        this.f39167b.a();
        v vVar2 = null;
        try {
            try {
                synchronized (this.f39168c) {
                    try {
                        this.r = null;
                        if (vVar == null) {
                            k(new GlideException("Expected to receive a Resource<R> with an object of " + this.f39172h + " inside, but instead got null."), 5);
                            return;
                        }
                        Object obj2 = vVar.get();
                        if (obj2 != null && this.f39172h.isAssignableFrom(obj2.getClass())) {
                            m(vVar, obj2, aVar);
                            return;
                        }
                        this.f39181q = null;
                        StringBuilder sb2 = new StringBuilder("Expected to receive an object of ");
                        sb2.append(this.f39172h);
                        sb2.append(" but instead got ");
                        if (obj2 != null) {
                            obj = obj2.getClass();
                        } else {
                            obj = "";
                        }
                        sb2.append(obj);
                        sb2.append("{");
                        sb2.append(obj2);
                        sb2.append("} inside Resource{");
                        sb2.append(vVar);
                        sb2.append("}.");
                        if (obj2 != null) {
                            str = "";
                        } else {
                            str = " To indicate failure return a null Resource object, rather than a Resource object containing null data.";
                        }
                        sb2.append(str);
                        k(new GlideException(sb2.toString()), 5);
                        this.f39183t.getClass();
                        m.g(vVar);
                    } catch (Throwable th2) {
                        th = th2;
                        vVar = null;
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            th = th3;
                            vVar2 = vVar;
                            if (vVar2 != null) {
                                this.f39183t.getClass();
                                m.g(vVar2);
                            }
                            throw th;
                        }
                    }
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public final void m(v<R> vVar, R r, h4.a aVar) {
        h();
        this.f39184u = 4;
        this.f39181q = vVar;
        if (this.f.f5947i <= 3) {
            Log.d("Glide", "Finished loading " + r.getClass().getSimpleName() + " from " + aVar + " for " + this.f39171g + " with size [" + this.f39188y + "x" + this.f39189z + "] in " + d5.f.a(this.f39182s) + " ms");
        }
        this.A = true;
        try {
            List<e<R>> list = this.f39178n;
            if (list != null) {
                for (e<R> eVar : list) {
                    eVar.a(r);
                }
            }
            e<R> eVar2 = this.f39169d;
            if (eVar2 != null) {
                eVar2.a(r);
            }
            this.f39179o.getClass();
            this.f39177m.f(r);
        } finally {
            this.A = false;
        }
    }

    @Override // z4.b
    public final void pause() {
        synchronized (this.f39168c) {
            if (isRunning()) {
                clear();
            }
        }
    }
}
