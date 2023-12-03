package r5;
/* compiled from: MTensor.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public int[] f30452a;

    /* renamed from: b  reason: collision with root package name */
    public int f30453b;

    /* renamed from: c  reason: collision with root package name */
    public float[] f30454c;

    /* compiled from: MTensor.kt */
    /* renamed from: r5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0517a {
        public static final int a(int[] iArr) {
            boolean z10;
            int i6 = 1;
            if (iArr.length == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                int i10 = iArr[0];
                int length = iArr.length - 1;
                if (1 <= length) {
                    while (true) {
                        i10 *= iArr[i6];
                        if (i6 == length) {
                            break;
                        }
                        i6++;
                    }
                }
                return i10;
            }
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
    }

    static {
        new C0517a();
    }

    public a(int[] iArr) {
        this.f30452a = iArr;
        int a10 = C0517a.a(iArr);
        this.f30453b = a10;
        this.f30454c = new float[a10];
    }
}
