package com.google.android.exoplayer2;

import android.content.Context;
import android.os.Looper;
/* compiled from: ExoPlayer.java */
/* loaded from: classes.dex */
public interface j extends w {

    /* compiled from: ExoPlayer.java */
    /* loaded from: classes.dex */
    public interface a {
        void k();

        void u();
    }

    /* compiled from: ExoPlayer.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Context f6516a;

        /* renamed from: b  reason: collision with root package name */
        public final c9.s f6517b;

        /* renamed from: c  reason: collision with root package name */
        public final nc.m<o7.w> f6518c;

        /* renamed from: d  reason: collision with root package name */
        public final nc.m<o8.i> f6519d;

        /* renamed from: e  reason: collision with root package name */
        public final nc.m<z8.k> f6520e;
        public final nc.m<o7.n> f;

        /* renamed from: g  reason: collision with root package name */
        public final nc.m<b9.b> f6521g;

        /* renamed from: h  reason: collision with root package name */
        public final nc.m<p7.n> f6522h;

        /* renamed from: i  reason: collision with root package name */
        public final Looper f6523i;

        /* renamed from: j  reason: collision with root package name */
        public final q7.d f6524j;

        /* renamed from: k  reason: collision with root package name */
        public final int f6525k;

        /* renamed from: l  reason: collision with root package name */
        public final boolean f6526l;

        /* renamed from: m  reason: collision with root package name */
        public final o7.x f6527m;

        /* renamed from: n  reason: collision with root package name */
        public final long f6528n;

        /* renamed from: o  reason: collision with root package name */
        public final long f6529o;

        /* renamed from: p  reason: collision with root package name */
        public final g f6530p;

        /* renamed from: q  reason: collision with root package name */
        public final long f6531q;
        public final long r;

        /* renamed from: s  reason: collision with root package name */
        public boolean f6532s;

        public b(Context context) {
            this(context, new o7.e(context, 0), new o7.e(context, 1));
        }

        public final a0 a() {
            sc.b.C(!this.f6532s);
            this.f6532s = true;
            return new a0(this);
        }

        public b(Context context, nc.m mVar, o7.e eVar) {
            o7.e eVar2 = new o7.e(context, 2);
            nc.m<o7.n> mVar2 = new nc.m() { // from class: o7.f
                @Override // nc.m
                public final Object get() {
                    return new c();
                }
            };
            o7.e eVar3 = new o7.e(context, 3);
            this.f6516a = context;
            this.f6518c = mVar;
            this.f6519d = eVar;
            this.f6520e = eVar2;
            this.f = mVar2;
            this.f6521g = eVar3;
            this.f6522h = new o7.g(1, this);
            int i6 = c9.w.f5205a;
            Looper myLooper = Looper.myLooper();
            this.f6523i = myLooper == null ? Looper.getMainLooper() : myLooper;
            this.f6524j = q7.d.f29242z;
            this.f6525k = 1;
            this.f6526l = true;
            this.f6527m = o7.x.f27255c;
            this.f6528n = 5000L;
            this.f6529o = 15000L;
            this.f6530p = new g(c9.w.y(20L), c9.w.y(500L), 0.999f);
            this.f6517b = c9.b.f5126a;
            this.f6531q = 500L;
            this.r = 2000L;
        }
    }
}
