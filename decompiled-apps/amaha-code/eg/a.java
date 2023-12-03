package eg;

import com.theinnerhour.b2b.utils.Constants;
/* compiled from: GenericGF.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: g  reason: collision with root package name */
    public static final a f13957g = new a(4201, 4096, 1);

    /* renamed from: h  reason: collision with root package name */
    public static final a f13958h = new a(1033, Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID, 1);

    /* renamed from: i  reason: collision with root package name */
    public static final a f13959i = new a(67, 64, 1);

    /* renamed from: j  reason: collision with root package name */
    public static final a f13960j = new a(19, 16, 1);

    /* renamed from: k  reason: collision with root package name */
    public static final a f13961k = new a(285, 256, 0);

    /* renamed from: l  reason: collision with root package name */
    public static final a f13962l = new a(301, 256, 1);

    /* renamed from: a  reason: collision with root package name */
    public final int[] f13963a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f13964b;

    /* renamed from: c  reason: collision with root package name */
    public final b f13965c;

    /* renamed from: d  reason: collision with root package name */
    public final int f13966d;

    /* renamed from: e  reason: collision with root package name */
    public final int f13967e;
    public final int f;

    public a(int i6, int i10, int i11) {
        this.f13967e = i6;
        this.f13966d = i10;
        this.f = i11;
        this.f13963a = new int[i10];
        this.f13964b = new int[i10];
        int i12 = 1;
        for (int i13 = 0; i13 < i10; i13++) {
            this.f13963a[i13] = i12;
            i12 <<= 1;
            if (i12 >= i10) {
                i12 = (i12 ^ i6) & (i10 - 1);
            }
        }
        for (int i14 = 0; i14 < i10 - 1; i14++) {
            this.f13964b[this.f13963a[i14]] = i14;
        }
        this.f13965c = new b(this, new int[]{0});
        new b(this, new int[]{1});
    }

    public final int a(int i6, int i10) {
        if (i6 != 0 && i10 != 0) {
            int[] iArr = this.f13964b;
            return this.f13963a[(iArr[i6] + iArr[i10]) % (this.f13966d - 1)];
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GF(0x");
        sb2.append(Integer.toHexString(this.f13967e));
        sb2.append(',');
        return c.s(sb2, this.f13966d, ')');
    }
}
