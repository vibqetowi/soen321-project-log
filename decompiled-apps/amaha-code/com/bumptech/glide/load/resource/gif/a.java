package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.Glide;
import com.bumptech.glide.e;
import com.bumptech.glide.f;
import d5.j;
import h4.k;
import java.util.ArrayList;
import k4.l;
import l4.d;
/* compiled from: GifFrameLoader.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final g4.a f5987a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f5988b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f5989c;

    /* renamed from: d  reason: collision with root package name */
    public final f f5990d;

    /* renamed from: e  reason: collision with root package name */
    public final d f5991e;
    public boolean f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f5992g;

    /* renamed from: h  reason: collision with root package name */
    public e<Bitmap> f5993h;

    /* renamed from: i  reason: collision with root package name */
    public C0127a f5994i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f5995j;

    /* renamed from: k  reason: collision with root package name */
    public C0127a f5996k;

    /* renamed from: l  reason: collision with root package name */
    public Bitmap f5997l;

    /* renamed from: m  reason: collision with root package name */
    public k<Bitmap> f5998m;

    /* renamed from: n  reason: collision with root package name */
    public C0127a f5999n;

    /* renamed from: o  reason: collision with root package name */
    public int f6000o;

    /* renamed from: p  reason: collision with root package name */
    public int f6001p;

    /* renamed from: q  reason: collision with root package name */
    public int f6002q;

    /* compiled from: GifFrameLoader.java */
    /* renamed from: com.bumptech.glide.load.resource.gif.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0127a extends a5.c<Bitmap> {
        public Bitmap A;

        /* renamed from: x  reason: collision with root package name */
        public final Handler f6003x;

        /* renamed from: y  reason: collision with root package name */
        public final int f6004y;

        /* renamed from: z  reason: collision with root package name */
        public final long f6005z;

        public C0127a(Handler handler, int i6, long j10) {
            this.f6003x = handler;
            this.f6004y = i6;
            this.f6005z = j10;
        }

        @Override // a5.h
        public final void f(Object obj) {
            this.A = (Bitmap) obj;
            Handler handler = this.f6003x;
            handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f6005z);
        }

        @Override // a5.h
        public final void m(Drawable drawable) {
            this.A = null;
        }
    }

    /* compiled from: GifFrameLoader.java */
    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    /* compiled from: GifFrameLoader.java */
    /* loaded from: classes.dex */
    public class c implements Handler.Callback {
        public c() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i6 = message.what;
            a aVar = a.this;
            if (i6 == 1) {
                aVar.b((C0127a) message.obj);
                return true;
            } else if (i6 == 2) {
                aVar.f5990d.b((C0127a) message.obj);
                return false;
            } else {
                return false;
            }
        }
    }

    public a(Glide glide, g4.e eVar, int i6, int i10, q4.a aVar, Bitmap bitmap) {
        d dVar = glide.f5924u;
        com.bumptech.glide.c cVar = glide.f5926w;
        f g5 = Glide.g(cVar.getBaseContext());
        e<Bitmap> x10 = Glide.g(cVar.getBaseContext()).a().x(((z4.f) new z4.f().d(l.f22878a).v()).q(true).j(i6, i10));
        this.f5989c = new ArrayList();
        this.f5990d = g5;
        Handler handler = new Handler(Looper.getMainLooper(), new c());
        this.f5991e = dVar;
        this.f5988b = handler;
        this.f5993h = x10;
        this.f5987a = eVar;
        c(aVar, bitmap);
    }

    public final void a() {
        if (this.f && !this.f5992g) {
            C0127a c0127a = this.f5999n;
            if (c0127a != null) {
                this.f5999n = null;
                b(c0127a);
                return;
            }
            this.f5992g = true;
            g4.a aVar = this.f5987a;
            long uptimeMillis = SystemClock.uptimeMillis() + aVar.d();
            aVar.b();
            this.f5996k = new C0127a(this.f5988b, aVar.e(), uptimeMillis);
            e<Bitmap> x10 = this.f5993h.x(new z4.f().p(new c5.d(Double.valueOf(Math.random()))));
            x10.Z = aVar;
            x10.f5953b0 = true;
            x10.z(this.f5996k);
        }
    }

    public final void b(C0127a c0127a) {
        this.f5992g = false;
        boolean z10 = this.f5995j;
        Handler handler = this.f5988b;
        if (z10) {
            handler.obtainMessage(2, c0127a).sendToTarget();
        } else if (!this.f) {
            this.f5999n = c0127a;
        } else {
            if (c0127a.A != null) {
                Bitmap bitmap = this.f5997l;
                if (bitmap != null) {
                    this.f5991e.d(bitmap);
                    this.f5997l = null;
                }
                C0127a c0127a2 = this.f5994i;
                this.f5994i = c0127a;
                ArrayList arrayList = this.f5989c;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    ((b) arrayList.get(size)).a();
                }
                if (c0127a2 != null) {
                    handler.obtainMessage(2, c0127a2).sendToTarget();
                }
            }
            a();
        }
    }

    public final void c(k<Bitmap> kVar, Bitmap bitmap) {
        kc.f.p(kVar);
        this.f5998m = kVar;
        kc.f.p(bitmap);
        this.f5997l = bitmap;
        this.f5993h = this.f5993h.x(new z4.f().r(kVar, true));
        this.f6000o = j.c(bitmap);
        this.f6001p = bitmap.getWidth();
        this.f6002q = bitmap.getHeight();
    }
}
