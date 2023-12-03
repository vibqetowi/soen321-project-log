package com.google.android.exoplayer2;
/* compiled from: DefaultLivePlaybackSpeedControl.java */
/* loaded from: classes.dex */
public final class g implements p {

    /* renamed from: a  reason: collision with root package name */
    public final long f6493a;

    /* renamed from: b  reason: collision with root package name */
    public final long f6494b;

    /* renamed from: c  reason: collision with root package name */
    public final float f6495c;

    /* renamed from: d  reason: collision with root package name */
    public long f6496d = -9223372036854775807L;

    /* renamed from: e  reason: collision with root package name */
    public long f6497e = -9223372036854775807L;

    /* renamed from: g  reason: collision with root package name */
    public long f6498g = -9223372036854775807L;

    /* renamed from: h  reason: collision with root package name */
    public long f6499h = -9223372036854775807L;

    /* renamed from: k  reason: collision with root package name */
    public float f6502k = 0.97f;

    /* renamed from: j  reason: collision with root package name */
    public float f6501j = 1.03f;

    /* renamed from: l  reason: collision with root package name */
    public float f6503l = 1.0f;

    /* renamed from: m  reason: collision with root package name */
    public long f6504m = -9223372036854775807L;
    public long f = -9223372036854775807L;

    /* renamed from: i  reason: collision with root package name */
    public long f6500i = -9223372036854775807L;

    /* renamed from: n  reason: collision with root package name */
    public long f6505n = -9223372036854775807L;

    /* renamed from: o  reason: collision with root package name */
    public long f6506o = -9223372036854775807L;

    public g(long j10, long j11, float f) {
        this.f6493a = j10;
        this.f6494b = j11;
        this.f6495c = f;
    }

    public final void a() {
        long j10 = this.f6496d;
        if (j10 != -9223372036854775807L) {
            long j11 = this.f6497e;
            if (j11 != -9223372036854775807L) {
                j10 = j11;
            }
            long j12 = this.f6498g;
            if (j12 != -9223372036854775807L && j10 < j12) {
                j10 = j12;
            }
            long j13 = this.f6499h;
            if (j13 != -9223372036854775807L && j10 > j13) {
                j10 = j13;
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.f == j10) {
            return;
        }
        this.f = j10;
        this.f6500i = j10;
        this.f6505n = -9223372036854775807L;
        this.f6506o = -9223372036854775807L;
        this.f6504m = -9223372036854775807L;
    }
}
