package o8;

import java.util.Arrays;
import java.util.Random;
/* compiled from: ShuffleOrder.java */
/* loaded from: classes.dex */
public interface l {

    /* compiled from: ShuffleOrder.java */
    /* loaded from: classes.dex */
    public static class a implements l {

        /* renamed from: a  reason: collision with root package name */
        public final Random f27290a;

        /* renamed from: b  reason: collision with root package name */
        public final int[] f27291b;

        /* renamed from: c  reason: collision with root package name */
        public final int[] f27292c;

        public a() {
            this(new Random());
        }

        @Override // o8.l
        public final int a() {
            int[] iArr = this.f27291b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // o8.l
        public final a b(int i6) {
            int i10 = i6 + 0;
            int[] iArr = this.f27291b;
            int[] iArr2 = new int[iArr.length - i10];
            int i11 = 0;
            for (int i12 = 0; i12 < iArr.length; i12++) {
                int i13 = iArr[i12];
                if (i13 >= 0 && i13 < i6) {
                    i11++;
                } else {
                    int i14 = i12 - i11;
                    if (i13 >= 0) {
                        i13 -= i10;
                    }
                    iArr2[i14] = i13;
                }
            }
            return new a(iArr2, new Random(this.f27290a.nextLong()));
        }

        @Override // o8.l
        public final int c(int i6) {
            int i10 = this.f27292c[i6] - 1;
            if (i10 < 0) {
                return -1;
            }
            return this.f27291b[i10];
        }

        @Override // o8.l
        public final int d(int i6) {
            int i10 = this.f27292c[i6] + 1;
            int[] iArr = this.f27291b;
            if (i10 < iArr.length) {
                return iArr[i10];
            }
            return -1;
        }

        @Override // o8.l
        public final a e(int i6, int i10) {
            Random random;
            int[] iArr;
            int[] iArr2 = new int[i10];
            int[] iArr3 = new int[i10];
            int i11 = 0;
            while (true) {
                random = this.f27290a;
                iArr = this.f27291b;
                if (i11 >= i10) {
                    break;
                }
                iArr2[i11] = random.nextInt(iArr.length + 1);
                int i12 = i11 + 1;
                int nextInt = random.nextInt(i12);
                iArr3[i11] = iArr3[nextInt];
                iArr3[nextInt] = i11 + i6;
                i11 = i12;
            }
            Arrays.sort(iArr2);
            int[] iArr4 = new int[iArr.length + i10];
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < iArr.length + i10; i15++) {
                if (i13 < i10 && i14 == iArr2[i13]) {
                    iArr4[i15] = iArr3[i13];
                    i13++;
                } else {
                    int i16 = i14 + 1;
                    int i17 = iArr[i14];
                    iArr4[i15] = i17;
                    if (i17 >= i6) {
                        iArr4[i15] = i17 + i10;
                    }
                    i14 = i16;
                }
            }
            return new a(iArr4, new Random(random.nextLong()));
        }

        @Override // o8.l
        public final int f() {
            int[] iArr = this.f27291b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // o8.l
        public final a g() {
            return new a(new Random(this.f27290a.nextLong()));
        }

        @Override // o8.l
        public final int getLength() {
            return this.f27291b.length;
        }

        public a(Random random) {
            this(new int[0], random);
        }

        public a(int[] iArr, Random random) {
            this.f27291b = iArr;
            this.f27290a = random;
            this.f27292c = new int[iArr.length];
            for (int i6 = 0; i6 < iArr.length; i6++) {
                this.f27292c[iArr[i6]] = i6;
            }
        }
    }

    int a();

    a b(int i6);

    int c(int i6);

    int d(int i6);

    a e(int i6, int i10);

    int f();

    a g();

    int getLength();
}
