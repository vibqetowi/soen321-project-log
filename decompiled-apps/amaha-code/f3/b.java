package f3;
/* compiled from: DocumentData.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f14758a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14759b;

    /* renamed from: c  reason: collision with root package name */
    public final float f14760c;

    /* renamed from: d  reason: collision with root package name */
    public final int f14761d;

    /* renamed from: e  reason: collision with root package name */
    public final int f14762e;
    public final float f;

    /* renamed from: g  reason: collision with root package name */
    public final float f14763g;

    /* renamed from: h  reason: collision with root package name */
    public final int f14764h;

    /* renamed from: i  reason: collision with root package name */
    public final int f14765i;

    /* renamed from: j  reason: collision with root package name */
    public final float f14766j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f14767k;

    public b(String str, String str2, float f, int i6, int i10, float f2, float f10, int i11, int i12, float f11, boolean z10) {
        this.f14758a = str;
        this.f14759b = str2;
        this.f14760c = f;
        this.f14761d = i6;
        this.f14762e = i10;
        this.f = f2;
        this.f14763g = f10;
        this.f14764h = i11;
        this.f14765i = i12;
        this.f14766j = f11;
        this.f14767k = z10;
    }

    public final int hashCode() {
        String str = this.f14759b;
        int d10 = ((v.h.d(this.f14761d) + (((int) (pl.a.c(str, this.f14758a.hashCode() * 31, 31) + this.f14760c)) * 31)) * 31) + this.f14762e;
        long floatToRawIntBits = Float.floatToRawIntBits(this.f);
        return (((d10 * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.f14764h;
    }
}
