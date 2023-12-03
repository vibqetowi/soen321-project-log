package o7;

import android.util.Log;
/* compiled from: DefaultLoadControl.java */
/* loaded from: classes.dex */
public final class c implements n {

    /* renamed from: a  reason: collision with root package name */
    public final b9.i f27185a;

    /* renamed from: b  reason: collision with root package name */
    public final long f27186b;

    /* renamed from: c  reason: collision with root package name */
    public final long f27187c;

    /* renamed from: d  reason: collision with root package name */
    public final long f27188d;

    /* renamed from: e  reason: collision with root package name */
    public final long f27189e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final long f27190g;

    /* renamed from: h  reason: collision with root package name */
    public int f27191h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f27192i;

    public c() {
        b9.i iVar = new b9.i();
        j("bufferForPlaybackMs", 2500, 0, "0");
        j("bufferForPlaybackAfterRebufferMs", 5000, 0, "0");
        j("minBufferMs", 50000, 2500, "bufferForPlaybackMs");
        j("minBufferMs", 50000, 5000, "bufferForPlaybackAfterRebufferMs");
        j("maxBufferMs", 50000, 50000, "minBufferMs");
        j("backBufferDurationMs", 0, 0, "0");
        this.f27185a = iVar;
        long j10 = 50000;
        this.f27186b = c9.w.y(j10);
        this.f27187c = c9.w.y(j10);
        this.f27188d = c9.w.y(2500);
        this.f27189e = c9.w.y(5000);
        this.f = -1;
        this.f27191h = 13107200;
        this.f27190g = c9.w.y(0);
    }

    public static void j(String str, int i6, int i10, String str2) {
        boolean z10;
        if (i6 >= i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        StringBuilder sb2 = new StringBuilder(str2.length() + str.length() + 21);
        sb2.append(str);
        sb2.append(" cannot be less than ");
        sb2.append(str2);
        sc.b.p(sb2.toString(), z10);
    }

    @Override // o7.n
    public final boolean a() {
        return false;
    }

    @Override // o7.n
    public final long b() {
        return this.f27190g;
    }

    @Override // o7.n
    public final void c() {
        k(false);
    }

    @Override // o7.n
    public final boolean d(long j10, float f) {
        int i6;
        boolean z10;
        b9.i iVar = this.f27185a;
        synchronized (iVar) {
            i6 = iVar.f4141e * iVar.f4138b;
        }
        boolean z11 = true;
        if (i6 >= this.f27191h) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j11 = this.f27187c;
        long j12 = this.f27186b;
        if (f > 1.0f) {
            j12 = Math.min(c9.w.o(j12, f), j11);
        }
        if (j10 < Math.max(j12, 500000L)) {
            if (z10) {
                z11 = false;
            }
            this.f27192i = z11;
            if (!z11 && j10 < 500000) {
                Log.w("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j10 >= j11 || z10) {
            this.f27192i = false;
        }
        return this.f27192i;
    }

    @Override // o7.n
    public final void e() {
        k(true);
    }

    @Override // o7.n
    public final boolean f(long j10, float f, boolean z10, long j11) {
        long j12;
        int i6;
        int i10 = c9.w.f5205a;
        if (f != 1.0f) {
            j10 = Math.round(j10 / f);
        }
        if (z10) {
            j12 = this.f27189e;
        } else {
            j12 = this.f27188d;
        }
        if (j11 != -9223372036854775807L) {
            j12 = Math.min(j11 / 2, j12);
        }
        if (j12 > 0 && j10 < j12) {
            b9.i iVar = this.f27185a;
            synchronized (iVar) {
                i6 = iVar.f4141e * iVar.f4138b;
            }
            if (i6 < this.f27191h) {
                return false;
            }
        }
        return true;
    }

    @Override // o7.n
    public final void g(com.google.android.exoplayer2.z[] zVarArr, z8.d[] dVarArr) {
        int i6 = this.f;
        if (i6 == -1) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int i12 = 13107200;
                if (i10 < zVarArr.length) {
                    if (dVarArr[i10] != null) {
                        switch (zVarArr[i10].v()) {
                            case -2:
                                i12 = 0;
                                break;
                            case -1:
                            default:
                                throw new IllegalArgumentException();
                            case 0:
                                i12 = 144310272;
                                break;
                            case 1:
                                break;
                            case 2:
                                i12 = 131072000;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i12 = 131072;
                                break;
                        }
                        i11 += i12;
                    }
                    i10++;
                } else {
                    i6 = Math.max(13107200, i11);
                }
            }
        }
        this.f27191h = i6;
        this.f27185a.b(i6);
    }

    @Override // o7.n
    public final b9.i h() {
        return this.f27185a;
    }

    @Override // o7.n
    public final void i() {
        k(true);
    }

    public final void k(boolean z10) {
        int i6 = this.f;
        if (i6 == -1) {
            i6 = 13107200;
        }
        this.f27191h = i6;
        this.f27192i = false;
        if (z10) {
            b9.i iVar = this.f27185a;
            synchronized (iVar) {
                if (iVar.f4137a) {
                    iVar.b(0);
                }
            }
        }
    }
}
