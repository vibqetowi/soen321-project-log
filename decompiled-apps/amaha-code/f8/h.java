package f8;
/* compiled from: IntArrayQueue.java */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public int f14910a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f14911b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f14912c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int[] f14913d;

    /* renamed from: e  reason: collision with root package name */
    public int f14914e;

    public h() {
        int[] iArr = new int[16];
        this.f14913d = iArr;
        this.f14914e = iArr.length - 1;
    }

    public final void a(int i6) {
        int i10 = this.f14912c;
        int[] iArr = this.f14913d;
        if (i10 == iArr.length) {
            int length = iArr.length << 1;
            if (length >= 0) {
                int[] iArr2 = new int[length];
                int length2 = iArr.length;
                int i11 = this.f14910a;
                int i12 = length2 - i11;
                System.arraycopy(iArr, i11, iArr2, 0, i12);
                System.arraycopy(this.f14913d, 0, iArr2, i12, i11);
                this.f14910a = 0;
                this.f14911b = this.f14912c - 1;
                this.f14913d = iArr2;
                this.f14914e = length - 1;
            } else {
                throw new IllegalStateException();
            }
        }
        int i13 = (this.f14911b + 1) & this.f14914e;
        this.f14911b = i13;
        this.f14913d[i13] = i6;
        this.f14912c++;
    }
}
