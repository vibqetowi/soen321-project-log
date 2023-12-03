package c9;

import java.util.Arrays;
/* compiled from: TimedValueQueue.java */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public int f5197a;

    /* renamed from: b  reason: collision with root package name */
    public int f5198b;

    /* renamed from: c  reason: collision with root package name */
    public Object f5199c;

    /* renamed from: d  reason: collision with root package name */
    public Object f5200d;

    public u() {
        this.f5199c = new long[10];
        this.f5200d = new Object[10];
    }

    public final synchronized void a(long j10, Object obj) {
        int i6 = this.f5198b;
        if (i6 > 0) {
            if (j10 <= ((long[]) this.f5199c)[((this.f5197a + i6) - 1) % ((Object[]) this.f5200d).length]) {
                b();
            }
        }
        c();
        int i10 = this.f5197a;
        int i11 = this.f5198b;
        Object obj2 = this.f5200d;
        int length = (i10 + i11) % ((Object[]) obj2).length;
        ((long[]) this.f5199c)[length] = j10;
        ((Object[]) obj2)[length] = obj;
        this.f5198b = i11 + 1;
    }

    public final synchronized void b() {
        this.f5197a = 0;
        this.f5198b = 0;
        Arrays.fill((Object[]) this.f5200d, (Object) null);
    }

    public final void c() {
        int length = ((Object[]) this.f5200d).length;
        if (this.f5198b < length) {
            return;
        }
        int i6 = length * 2;
        long[] jArr = new long[i6];
        Object[] objArr = new Object[i6];
        int i10 = this.f5197a;
        int i11 = length - i10;
        System.arraycopy((long[]) this.f5199c, i10, jArr, 0, i11);
        System.arraycopy((Object[]) this.f5200d, this.f5197a, objArr, 0, i11);
        int i12 = this.f5197a;
        if (i12 > 0) {
            System.arraycopy((long[]) this.f5199c, 0, jArr, i11, i12);
            System.arraycopy((Object[]) this.f5200d, 0, objArr, i11, this.f5197a);
        }
        this.f5199c = jArr;
        this.f5200d = objArr;
        this.f5197a = 0;
    }

    public final boolean d(int i6, int i10) {
        if (((byte[]) this.f5200d)[(i10 * this.f5198b) + i6] >= 0) {
            return true;
        }
        return false;
    }

    public final void e(int i6, int i10, int i11, int i12) {
        if (i6 < 0) {
            int i13 = this.f5197a;
            i6 += i13;
            i10 += 4 - ((i13 + 4) % 8);
        }
        if (i10 < 0) {
            int i14 = this.f5198b;
            i10 += i14;
            i6 += 4 - ((i14 + 4) % 8);
        }
        int i15 = 1;
        if ((((CharSequence) this.f5199c).charAt(i11) & (1 << (8 - i12))) == 0) {
            i15 = 0;
        }
        ((byte[]) this.f5200d)[(i6 * this.f5198b) + i10] = (byte) i15;
    }

    public final Object f(boolean z10, long j10) {
        Object obj = null;
        long j11 = Long.MAX_VALUE;
        while (this.f5198b > 0) {
            long j12 = j10 - ((long[]) this.f5199c)[this.f5197a];
            if (j12 < 0 && (z10 || (-j12) >= j11)) {
                break;
            }
            obj = h();
            j11 = j12;
        }
        return obj;
    }

    public final synchronized Object g(long j10) {
        return f(true, j10);
    }

    public final Object h() {
        boolean z10;
        if (this.f5198b > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.C(z10);
        Object obj = this.f5200d;
        int i6 = this.f5197a;
        Object obj2 = ((Object[]) obj)[i6];
        ((Object[]) obj)[i6] = null;
        this.f5197a = (i6 + 1) % ((Object[]) obj).length;
        this.f5198b--;
        return obj2;
    }

    public final void i(int i6, int i10, int i11) {
        int i12 = i6 - 2;
        int i13 = i10 - 2;
        e(i12, i13, i11, 1);
        int i14 = i10 - 1;
        e(i12, i14, i11, 2);
        int i15 = i6 - 1;
        e(i15, i13, i11, 3);
        e(i15, i14, i11, 4);
        e(i15, i10, i11, 5);
        e(i6, i13, i11, 6);
        e(i6, i14, i11, 7);
        e(i6, i10, i11, 8);
    }

    public /* synthetic */ u(String str, int i6, int i10) {
        this.f5199c = str;
        this.f5198b = i6;
        this.f5197a = i10;
        byte[] bArr = new byte[i6 * i10];
        this.f5200d = bArr;
        Arrays.fill(bArr, (byte) -1);
    }
}
