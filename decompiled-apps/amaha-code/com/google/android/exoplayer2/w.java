package com.google.android.exoplayer2;

import android.os.Bundle;
import android.os.Looper;
import android.util.SparseBooleanArray;
import android.view.SurfaceView;
import android.view.TextureView;
import c9.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: Player.java */
/* loaded from: classes.dex */
public interface w {

    /* compiled from: Player.java */
    /* loaded from: classes.dex */
    public static final class a implements f {

        /* renamed from: u  reason: collision with root package name */
        public final c9.h f7198u;

        /* compiled from: Player.java */
        /* renamed from: com.google.android.exoplayer2.w$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0141a {

            /* renamed from: a  reason: collision with root package name */
            public final h.a f7199a = new h.a();

            public final void a(int i6, boolean z10) {
                h.a aVar = this.f7199a;
                if (z10) {
                    aVar.a(i6);
                } else {
                    aVar.getClass();
                }
            }
        }

        static {
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            sc.b.C(!false);
            new c9.h(sparseBooleanArray);
        }

        public a(c9.h hVar) {
            this.f7198u = hVar;
        }

        @Override // com.google.android.exoplayer2.f
        public final Bundle a() {
            Bundle bundle = new Bundle();
            ArrayList<Integer> arrayList = new ArrayList<>();
            int i6 = 0;
            while (true) {
                c9.h hVar = this.f7198u;
                if (i6 < hVar.b()) {
                    arrayList.add(Integer.valueOf(hVar.a(i6)));
                    i6++;
                } else {
                    bundle.putIntegerArrayList(Integer.toString(0, 36), arrayList);
                    return bundle;
                }
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            return this.f7198u.equals(((a) obj).f7198u);
        }

        public final int hashCode() {
            return this.f7198u.hashCode();
        }
    }

    /* compiled from: Player.java */
    @Deprecated
    /* loaded from: classes.dex */
    public interface b {
        void A(r rVar);

        void C(boolean z10);

        void D(w wVar, c cVar);

        @Deprecated
        void G(o8.p pVar, z8.h hVar);

        void L(int i6);

        void R(q qVar, int i6);

        @Deprecated
        void V(int i6, boolean z10);

        @Deprecated
        void b();

        void d0();

        @Deprecated
        void e();

        void f0(v vVar);

        @Deprecated
        void i();

        void l(int i6);

        void l0(boolean z10);

        void q(ExoPlaybackException exoPlaybackException);

        void r(f0 f0Var);

        void s(boolean z10);

        void t(a aVar);

        void v(int i6, boolean z10);

        void x(int i6);

        void y(int i6);

        void z(int i6, e eVar, e eVar2);
    }

    /* compiled from: Player.java */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final c9.h f7200a;

        public c(c9.h hVar) {
            this.f7200a = hVar;
        }

        public final boolean a(int i6) {
            return this.f7200a.f5138a.get(i6);
        }

        public final boolean b(int... iArr) {
            c9.h hVar = this.f7200a;
            hVar.getClass();
            for (int i6 : iArr) {
                if (hVar.f5138a.get(i6)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            return this.f7200a.equals(((c) obj).f7200a);
        }

        public final int hashCode() {
            return this.f7200a.hashCode();
        }
    }

    /* compiled from: Player.java */
    /* loaded from: classes.dex */
    public interface d extends b {
        void N();

        void T();

        void a(g8.a aVar);

        void c(d9.q qVar);

        void e0(int i6, int i10);

        void f();

        void g(boolean z10);

        void h(List<p8.a> list);

        void i0(q7.d dVar);

        void w(float f);
    }

    /* compiled from: Player.java */
    /* loaded from: classes.dex */
    public static final class e implements f {
        public final long A;
        public final int B;
        public final int C;

        /* renamed from: u  reason: collision with root package name */
        public final Object f7201u;

        /* renamed from: v  reason: collision with root package name */
        public final int f7202v;

        /* renamed from: w  reason: collision with root package name */
        public final q f7203w;

        /* renamed from: x  reason: collision with root package name */
        public final Object f7204x;

        /* renamed from: y  reason: collision with root package name */
        public final int f7205y;

        /* renamed from: z  reason: collision with root package name */
        public final long f7206z;

        public e(Object obj, int i6, q qVar, Object obj2, int i10, long j10, long j11, int i11, int i12) {
            this.f7201u = obj;
            this.f7202v = i6;
            this.f7203w = qVar;
            this.f7204x = obj2;
            this.f7205y = i10;
            this.f7206z = j10;
            this.A = j11;
            this.B = i11;
            this.C = i12;
        }

        public static String b(int i6) {
            return Integer.toString(i6, 36);
        }

        @Override // com.google.android.exoplayer2.f
        public final Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putInt(b(0), this.f7202v);
            bundle.putBundle(b(1), c9.a.d(this.f7203w));
            bundle.putInt(b(2), this.f7205y);
            bundle.putLong(b(3), this.f7206z);
            bundle.putLong(b(4), this.A);
            bundle.putInt(b(5), this.B);
            bundle.putInt(b(6), this.C);
            return bundle;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            if (this.f7202v == eVar.f7202v && this.f7205y == eVar.f7205y && this.f7206z == eVar.f7206z && this.A == eVar.A && this.B == eVar.B && this.C == eVar.C && f6.b.v0(this.f7201u, eVar.f7201u) && f6.b.v0(this.f7204x, eVar.f7204x) && f6.b.v0(this.f7203w, eVar.f7203w)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f7201u, Integer.valueOf(this.f7202v), this.f7203w, this.f7204x, Integer.valueOf(this.f7205y), Long.valueOf(this.f7206z), Long.valueOf(this.A), Integer.valueOf(this.B), Integer.valueOf(this.C)});
        }
    }

    void A(int i6);

    void B(int i6);

    long C();

    long D();

    void E(d dVar);

    long F();

    List<p8.a> G();

    ExoPlaybackException H();

    int I();

    a J();

    int K();

    boolean L(int i6);

    void M(SurfaceView surfaceView);

    boolean N();

    int O();

    f0 P();

    e0 Q();

    Looper R();

    boolean S();

    long T();

    void U();

    void V();

    void W(TextureView textureView);

    void X();

    r Y();

    void Z(List list);

    void a();

    long a0();

    boolean b();

    v c();

    void d(v vVar);

    long e();

    void f(int i6, long j10);

    void g(ArrayList arrayList, int i6, long j10);

    long getCurrentPosition();

    long getDuration();

    boolean h();

    void i();

    boolean isPlaying();

    q j();

    void k(boolean z10);

    void l();

    @Deprecated
    void m(boolean z10);

    void n();

    void o();

    int p();

    void pause();

    void q();

    int r();

    int s();

    void stop();

    void t(TextureView textureView);

    d9.q u();

    void v(d dVar);

    int w();

    void x(SurfaceView surfaceView);

    void y();

    void z(boolean z10);
}
