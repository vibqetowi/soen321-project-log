package p8;

import android.os.Bundle;
import android.os.Parcel;
import com.google.common.collect.l0;
import com.google.common.collect.s;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ExoplayerCuesDecoder.java */
/* loaded from: classes.dex */
public final class c implements g {

    /* renamed from: a  reason: collision with root package name */
    public final p8.b f28005a = new p8.b();

    /* renamed from: b  reason: collision with root package name */
    public final j f28006b = new j();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayDeque f28007c = new ArrayDeque();

    /* renamed from: d  reason: collision with root package name */
    public int f28008d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f28009e;

    /* compiled from: ExoplayerCuesDecoder.java */
    /* loaded from: classes.dex */
    public class a extends k {
        public a() {
        }

        @Override // r7.e
        public final void n() {
            boolean z10;
            ArrayDeque arrayDeque = c.this.f28007c;
            if (arrayDeque.size() < 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            sc.b.C(z10);
            sc.b.q(!arrayDeque.contains(this));
            this.f30528u = 0;
            this.f28025w = null;
            arrayDeque.addFirst(this);
        }
    }

    /* compiled from: ExoplayerCuesDecoder.java */
    /* loaded from: classes.dex */
    public static final class b implements f {

        /* renamed from: u  reason: collision with root package name */
        public final long f28011u;

        /* renamed from: v  reason: collision with root package name */
        public final s<p8.a> f28012v;

        public b(long j10, l0 l0Var) {
            this.f28011u = j10;
            this.f28012v = l0Var;
        }

        @Override // p8.f
        public final int d(long j10) {
            if (this.f28011u > j10) {
                return 0;
            }
            return -1;
        }

        @Override // p8.f
        public final long f(int i6) {
            boolean z10;
            if (i6 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            sc.b.q(z10);
            return this.f28011u;
        }

        @Override // p8.f
        public final List<p8.a> h(long j10) {
            if (j10 >= this.f28011u) {
                return this.f28012v;
            }
            s.b bVar = s.f9446v;
            return l0.f9412y;
        }

        @Override // p8.f
        public final int i() {
            return 1;
        }
    }

    public c() {
        for (int i6 = 0; i6 < 2; i6++) {
            this.f28007c.addFirst(new a());
        }
        this.f28008d = 0;
    }

    @Override // r7.d
    public final void a() {
        this.f28009e = true;
    }

    @Override // r7.d
    public final k c() {
        sc.b.C(!this.f28009e);
        if (this.f28008d == 2) {
            ArrayDeque arrayDeque = this.f28007c;
            if (!arrayDeque.isEmpty()) {
                k kVar = (k) arrayDeque.removeFirst();
                j jVar = this.f28006b;
                if (jVar.k(4)) {
                    kVar.j(4);
                } else {
                    long j10 = jVar.f6362y;
                    ByteBuffer byteBuffer = jVar.f6360w;
                    byteBuffer.getClass();
                    byte[] array = byteBuffer.array();
                    this.f28005a.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.unmarshall(array, 0, array.length);
                    obtain.setDataPosition(0);
                    Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
                    obtain.recycle();
                    ArrayList parcelableArrayList = readBundle.getParcelableArrayList("c");
                    parcelableArrayList.getClass();
                    kVar.p(jVar.f6362y, new b(j10, c9.a.a(p8.a.M, parcelableArrayList)), 0L);
                }
                jVar.n();
                this.f28008d = 0;
                return kVar;
            }
        }
        return null;
    }

    @Override // r7.d
    public final j d() {
        sc.b.C(!this.f28009e);
        if (this.f28008d != 0) {
            return null;
        }
        this.f28008d = 1;
        return this.f28006b;
    }

    @Override // r7.d
    public final void e(j jVar) {
        boolean z10;
        boolean z11 = true;
        sc.b.C(!this.f28009e);
        if (this.f28008d == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.C(z10);
        if (this.f28006b != jVar) {
            z11 = false;
        }
        sc.b.q(z11);
        this.f28008d = 2;
    }

    @Override // r7.d
    public final void flush() {
        sc.b.C(!this.f28009e);
        this.f28006b.n();
        this.f28008d = 0;
    }

    @Override // p8.g
    public final void b(long j10) {
    }
}
