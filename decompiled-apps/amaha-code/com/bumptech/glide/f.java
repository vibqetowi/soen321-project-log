package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import d5.j;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import w4.b;
import w4.h;
import w4.k;
import w4.l;
import w4.n;
/* compiled from: RequestManager.java */
/* loaded from: classes.dex */
public final class f implements ComponentCallbacks2, w4.g {
    public static final z4.f F;
    public static final z4.f G;
    public final a A;
    public final Handler B;
    public final w4.b C;
    public final CopyOnWriteArrayList<z4.e<Object>> D;
    public z4.f E;

    /* renamed from: u  reason: collision with root package name */
    public final Glide f5956u;

    /* renamed from: v  reason: collision with root package name */
    public final Context f5957v;

    /* renamed from: w  reason: collision with root package name */
    public final w4.f f5958w;

    /* renamed from: x  reason: collision with root package name */
    public final l f5959x;

    /* renamed from: y  reason: collision with root package name */
    public final k f5960y;

    /* renamed from: z  reason: collision with root package name */
    public final n f5961z;

    /* compiled from: RequestManager.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            f fVar = f.this;
            fVar.f5958w.b(fVar);
        }
    }

    /* compiled from: RequestManager.java */
    /* loaded from: classes.dex */
    public class c implements b.a {

        /* renamed from: a  reason: collision with root package name */
        public final l f5963a;

        public c(l lVar) {
            this.f5963a = lVar;
        }
    }

    static {
        z4.f c10 = new z4.f().c(Bitmap.class);
        c10.N = true;
        F = c10;
        z4.f c11 = new z4.f().c(GifDrawable.class);
        c11.N = true;
        G = c11;
        ((z4.f) new z4.f().d(k4.l.f22879b).l()).q(true);
    }

    public f(Glide glide, w4.f fVar, k kVar, Context context) {
        boolean z10;
        w4.b hVar;
        z4.f fVar2;
        String str;
        l lVar = new l(0);
        w4.c cVar = glide.A;
        this.f5961z = new n();
        a aVar = new a();
        this.A = aVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.B = handler;
        this.f5956u = glide;
        this.f5958w = fVar;
        this.f5960y = kVar;
        this.f5959x = lVar;
        this.f5957v = context;
        Context applicationContext = context.getApplicationContext();
        c cVar2 = new c(lVar);
        ((w4.e) cVar).getClass();
        if (g0.a.a(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            if (z10) {
                str = "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor";
            } else {
                str = "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor";
            }
            Log.d("ConnectivityMonitor", str);
        }
        if (z10) {
            hVar = new w4.d(applicationContext, cVar2);
        } else {
            hVar = new h();
        }
        this.C = hVar;
        char[] cArr = j.f12201a;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            handler.post(aVar);
        } else {
            fVar.b(this);
        }
        fVar.b(hVar);
        this.D = new CopyOnWriteArrayList<>(glide.f5926w.f5944e);
        com.bumptech.glide.c cVar3 = glide.f5926w;
        synchronized (cVar3) {
            if (cVar3.f5948j == null) {
                ((com.bumptech.glide.b) cVar3.f5943d).getClass();
                z4.f fVar3 = new z4.f();
                fVar3.N = true;
                cVar3.f5948j = fVar3;
            }
            fVar2 = cVar3.f5948j;
        }
        s(fVar2);
        glide.d(this);
    }

    public final e<Bitmap> a() {
        return new e(this.f5956u, this, Bitmap.class, this.f5957v).x(F);
    }

    public final void b(a5.h<?> hVar) {
        boolean z10;
        if (hVar == null) {
            return;
        }
        boolean t3 = t(hVar);
        z4.b l2 = hVar.l();
        if (!t3) {
            Glide glide = this.f5956u;
            synchronized (glide.B) {
                Iterator it = glide.B.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((f) it.next()).t(hVar)) {
                            z10 = true;
                            break;
                        }
                    } else {
                        z10 = false;
                        break;
                    }
                }
            }
            if (!z10 && l2 != null) {
                hVar.c(null);
                l2.clear();
            }
        }
    }

    public final e<Drawable> d(File file) {
        e<Drawable> eVar = new e<>(this.f5956u, this, Drawable.class, this.f5957v);
        eVar.Z = file;
        eVar.f5953b0 = true;
        return eVar;
    }

    @Override // w4.g
    public final synchronized void g() {
        this.f5961z.g();
        Iterator it = j.d(this.f5961z.f36425u).iterator();
        while (it.hasNext()) {
            b((a5.h) it.next());
        }
        this.f5961z.f36425u.clear();
        l lVar = this.f5959x;
        Iterator it2 = j.d((Set) lVar.f36416c).iterator();
        while (it2.hasNext()) {
            lVar.b((z4.b) it2.next());
        }
        ((List) lVar.f36417d).clear();
        this.f5958w.a(this);
        this.f5958w.a(this.C);
        this.B.removeCallbacks(this.A);
        this.f5956u.e(this);
    }

    @Override // w4.g
    public final synchronized void i() {
        q();
        this.f5961z.i();
    }

    @Override // w4.g
    public final synchronized void n() {
        r();
        this.f5961z.n();
    }

    public final e<Drawable> o(Integer num) {
        return new e(this.f5956u, this, Drawable.class, this.f5957v).C(num);
    }

    public final e<Drawable> p(String str) {
        e<Drawable> eVar = new e<>(this.f5956u, this, Drawable.class, this.f5957v);
        eVar.Z = str;
        eVar.f5953b0 = true;
        return eVar;
    }

    public final synchronized void q() {
        l lVar = this.f5959x;
        lVar.f36415b = true;
        Iterator it = j.d((Set) lVar.f36416c).iterator();
        while (it.hasNext()) {
            z4.b bVar = (z4.b) it.next();
            if (bVar.isRunning()) {
                bVar.pause();
                ((List) lVar.f36417d).add(bVar);
            }
        }
    }

    public final synchronized void r() {
        this.f5959x.f();
    }

    public final synchronized void s(z4.f fVar) {
        z4.f clone = fVar.clone();
        if (clone.N && !clone.P) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        clone.P = true;
        clone.N = true;
        this.E = clone;
    }

    public final synchronized boolean t(a5.h<?> hVar) {
        z4.b l2 = hVar.l();
        if (l2 == null) {
            return true;
        }
        if (this.f5959x.b(l2)) {
            this.f5961z.f36425u.remove(hVar);
            hVar.c(null);
            return true;
        }
        return false;
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.f5959x + ", treeNode=" + this.f5960y + "}";
    }

    public final synchronized void u(z4.f fVar) {
        this.E = this.E.a(fVar);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    /* compiled from: RequestManager.java */
    /* loaded from: classes.dex */
    public static class b extends a5.d<View, Object> {
        public b(AppCompatImageView appCompatImageView) {
            super(appCompatImageView);
        }

        @Override // a5.h
        public final void f(Object obj) {
        }

        @Override // a5.h
        public final void h(Drawable drawable) {
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i6) {
    }
}
