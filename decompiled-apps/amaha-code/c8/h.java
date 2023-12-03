package c8;

import c8.b;
import c9.q;
import com.google.android.exoplayer2.n;
import u7.j;
import u7.t;
import u7.v;
/* compiled from: StreamReader.java */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: b  reason: collision with root package name */
    public v f5105b;

    /* renamed from: c  reason: collision with root package name */
    public j f5106c;

    /* renamed from: d  reason: collision with root package name */
    public f f5107d;

    /* renamed from: e  reason: collision with root package name */
    public long f5108e;
    public long f;

    /* renamed from: g  reason: collision with root package name */
    public long f5109g;

    /* renamed from: h  reason: collision with root package name */
    public int f5110h;

    /* renamed from: i  reason: collision with root package name */
    public int f5111i;

    /* renamed from: k  reason: collision with root package name */
    public long f5113k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f5114l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f5115m;

    /* renamed from: a  reason: collision with root package name */
    public final d f5104a = new d();

    /* renamed from: j  reason: collision with root package name */
    public a f5112j = new a();

    /* compiled from: StreamReader.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public n f5116a;

        /* renamed from: b  reason: collision with root package name */
        public b.a f5117b;
    }

    public void a(long j10) {
        this.f5109g = j10;
    }

    public abstract long b(q qVar);

    public abstract boolean c(q qVar, long j10, a aVar);

    public void d(boolean z10) {
        if (z10) {
            this.f5112j = new a();
            this.f = 0L;
            this.f5110h = 0;
        } else {
            this.f5110h = 1;
        }
        this.f5108e = -1L;
        this.f5109g = 0L;
    }

    /* compiled from: StreamReader.java */
    /* loaded from: classes.dex */
    public static final class b implements f {
        @Override // c8.f
        public final t a() {
            return new t.b(-9223372036854775807L);
        }

        @Override // c8.f
        public final long b(u7.i iVar) {
            return -1L;
        }

        @Override // c8.f
        public final void c(long j10) {
        }
    }
}
