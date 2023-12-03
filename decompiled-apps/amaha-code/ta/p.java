package ta;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final String f32792a;

    /* renamed from: b  reason: collision with root package name */
    public final String f32793b;

    /* renamed from: c  reason: collision with root package name */
    public final long f32794c;

    /* renamed from: d  reason: collision with root package name */
    public final long f32795d;

    /* renamed from: e  reason: collision with root package name */
    public final long f32796e;
    public final long f;

    /* renamed from: g  reason: collision with root package name */
    public final long f32797g;

    /* renamed from: h  reason: collision with root package name */
    public final Long f32798h;

    /* renamed from: i  reason: collision with root package name */
    public final Long f32799i;

    /* renamed from: j  reason: collision with root package name */
    public final Long f32800j;

    /* renamed from: k  reason: collision with root package name */
    public final Boolean f32801k;

    public p(String str, String str2, long j10, long j11, long j12, long j13, long j14, Long l2, Long l10, Long l11, Boolean bool) {
        boolean z10;
        boolean z11;
        boolean z12;
        v9.o.e(str);
        v9.o.e(str2);
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        v9.o.b(z10);
        if (j11 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        v9.o.b(z11);
        if (j12 >= 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        v9.o.b(z12);
        v9.o.b(j14 >= 0);
        this.f32792a = str;
        this.f32793b = str2;
        this.f32794c = j10;
        this.f32795d = j11;
        this.f32796e = j12;
        this.f = j13;
        this.f32797g = j14;
        this.f32798h = l2;
        this.f32799i = l10;
        this.f32800j = l11;
        this.f32801k = bool;
    }

    public final p a(Long l2, Long l10, Boolean bool) {
        Boolean bool2;
        if (bool != null && !bool.booleanValue()) {
            bool2 = null;
        } else {
            bool2 = bool;
        }
        return new p(this.f32792a, this.f32793b, this.f32794c, this.f32795d, this.f32796e, this.f, this.f32797g, this.f32798h, l2, l10, bool2);
    }

    public final p b(long j10, long j11) {
        return new p(this.f32792a, this.f32793b, this.f32794c, this.f32795d, this.f32796e, this.f, j10, Long.valueOf(j11), this.f32799i, this.f32800j, this.f32801k);
    }
}
