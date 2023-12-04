package io.grpc.netty.shaded.io.netty.buffer;

import java.lang.reflect.Array;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class SizeClasses implements SizeClassesMetric {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int INDEX_IDX = 0;
    private static final int LOG2DELTA_IDX = 2;
    private static final int LOG2GROUP_IDX = 1;
    private static final int LOG2_DELTA_LOOKUP_IDX = 6;
    private static final int LOG2_MAX_LOOKUP_SIZE = 12;
    static final int LOG2_QUANTUM = 4;
    private static final int LOG2_SIZE_CLASS_GROUP = 2;
    private static final int NDELTA_IDX = 3;
    private static final int PAGESIZE_IDX = 4;
    private static final int SUBPAGE_IDX = 5;
    private static final byte no = 0;
    private static final byte yes = 1;
    protected final int chunkSize;
    protected final int directMemoryCacheAlignment;
    private int lookupMaxSize;
    int nPSizes;
    final int nSizes;
    int nSubpages;
    private final int[] pageIdx2sizeTab;
    protected final int pageShifts;
    protected final int pageSize;
    private final int[] size2idxTab;
    private final short[][] sizeClasses;
    private final int[] sizeIdx2sizeTab;
    int smallMaxSizeIdx;

    @Override // io.grpc.netty.shaded.io.netty.buffer.SizeClassesMetric
    public int sizeIdx2sizeCompute(int i) {
        int i2 = i >> 2;
        int i3 = i & 3;
        int i4 = i2 == 0 ? 0 : 32 << i2;
        if (i2 == 0) {
            i2 = 1;
        }
        return i4 + ((i3 + 1) << ((i2 + 4) - 1));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public SizeClasses(int i, int i2, int i3, int i4) {
        this.pageSize = i;
        this.pageShifts = i2;
        this.chunkSize = i3;
        this.directMemoryCacheAlignment = i4;
        this.sizeClasses = (short[][]) Array.newInstance(Short.TYPE, ((PoolThreadCache.log2(i3) + 1) - 4) << 2, 7);
        int sizeClasses = sizeClasses();
        this.nSizes = sizeClasses;
        int[] iArr = new int[sizeClasses];
        this.sizeIdx2sizeTab = iArr;
        int[] iArr2 = new int[this.nPSizes];
        this.pageIdx2sizeTab = iArr2;
        idx2SizeTab(iArr, iArr2);
        int[] iArr3 = new int[this.lookupMaxSize >> 4];
        this.size2idxTab = iArr3;
        size2idxTab(iArr3);
    }

    private int sizeClasses() {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < 4) {
            int i4 = i + 1;
            int sizeClass = sizeClass(i2, 4, 4, i);
            i2++;
            i3 = sizeClass;
            i = i4;
        }
        int i5 = 6;
        int i6 = 4;
        while (i3 < this.chunkSize) {
            int i7 = 1;
            while (i7 <= 4 && i3 < this.chunkSize) {
                int i8 = i2 + 1;
                int sizeClass2 = sizeClass(i2, i5, i6, i7);
                i7++;
                i3 = sizeClass2;
                i2 = i8;
            }
            i5++;
            i6++;
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int sizeClass(int i, int i2, int i3, int i4) {
        short s;
        int i5;
        short s2;
        short s3;
        int i6 = this.pageShifts;
        if (i3 < i6) {
            int i7 = 1 << i6;
            int i8 = (1 << i2) + ((1 << i3) * i4);
            if (i8 != (i8 / i7) * i7) {
                s = 0;
                int log2 = i4 != 0 ? 0 : PoolThreadCache.log2(i4);
                boolean z = (1 << log2) >= i4;
                i5 = log2 + i3 != i2 ? i2 + 1 : i2;
                if (i5 == i2) {
                    z = true;
                }
                s2 = i5 >= this.pageShifts + 2 ? (short) 1 : (short) 0;
                int i9 = (i5 >= 12 || (i5 == 12 && !z)) ? i3 : 0;
                short[] sArr = new short[7];
                sArr[0] = (short) i;
                sArr[1] = (short) i2;
                sArr[2] = (short) i3;
                sArr[3] = (short) i4;
                sArr[4] = s;
                sArr[5] = s2;
                s3 = (short) i9;
                sArr[6] = s3;
                this.sizeClasses[i] = sArr;
                int i10 = (1 << i2) + (i4 << i3);
                if (s == 1) {
                    this.nPSizes++;
                }
                if (s2 == 1) {
                    this.nSubpages++;
                    this.smallMaxSizeIdx = i;
                }
                if (s3 != 0) {
                    this.lookupMaxSize = i10;
                }
                return i10;
            }
        }
        s = 1;
        if (i4 != 0) {
        }
        if ((1 << log2) >= i4) {
        }
        if (log2 + i3 != i2) {
        }
        if (i5 == i2) {
        }
        if (i5 >= this.pageShifts + 2) {
        }
        if (i5 >= 12) {
        }
        short[] sArr2 = new short[7];
        sArr2[0] = (short) i;
        sArr2[1] = (short) i2;
        sArr2[2] = (short) i3;
        sArr2[3] = (short) i4;
        sArr2[4] = s;
        sArr2[5] = s2;
        s3 = (short) i9;
        sArr2[6] = s3;
        this.sizeClasses[i] = sArr2;
        int i102 = (1 << i2) + (i4 << i3);
        if (s == 1) {
        }
        if (s2 == 1) {
        }
        if (s3 != 0) {
        }
        return i102;
    }

    private void idx2SizeTab(int[] iArr, int[] iArr2) {
        int i = 0;
        for (int i2 = 0; i2 < this.nSizes; i2++) {
            short[] sArr = this.sizeClasses[i2];
            int i3 = (1 << sArr[1]) + (sArr[3] << sArr[2]);
            iArr[i2] = i3;
            if (sArr[4] == 1) {
                iArr2[i] = i3;
                i++;
            }
        }
    }

    private void size2idxTab(int[] iArr) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i <= this.lookupMaxSize) {
            int i4 = 1 << (this.sizeClasses[i2][2] - 4);
            while (i <= this.lookupMaxSize) {
                int i5 = i4 - 1;
                if (i4 > 0) {
                    int i6 = i3 + 1;
                    iArr[i3] = i2;
                    i4 = i5;
                    i3 = i6;
                    i = (i6 + 1) << 4;
                }
            }
            i2++;
        }
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.SizeClassesMetric
    public int sizeIdx2size(int i) {
        return this.sizeIdx2sizeTab[i];
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.SizeClassesMetric
    public long pageIdx2size(int i) {
        return this.pageIdx2sizeTab[i];
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.SizeClassesMetric
    public long pageIdx2sizeCompute(int i) {
        int i2 = i >> 2;
        int i3 = i & 3;
        long j = i2 == 0 ? 0L : (1 << ((this.pageShifts + 2) - 1)) << i2;
        if (i2 == 0) {
            i2 = 1;
        }
        return j + ((i3 + 1) << ((i2 + this.pageShifts) - 1));
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.SizeClassesMetric
    public int size2SizeIdx(int i) {
        if (i == 0) {
            return 0;
        }
        if (i > this.chunkSize) {
            return this.nSizes;
        }
        if (this.directMemoryCacheAlignment > 0) {
            i = alignSize(i);
        }
        if (i <= this.lookupMaxSize) {
            return this.size2idxTab[(i - 1) >> 4];
        }
        int log2 = PoolThreadCache.log2((i << 1) - 1);
        int i2 = (log2 >= 7 ? log2 - 6 : 0) << 2;
        int i3 = log2 >= 7 ? (log2 - 2) - 1 : 4;
        return i2 + ((((i - 1) & ((-1) << i3)) >> i3) & 3);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.SizeClassesMetric
    public int pages2pageIdx(int i) {
        return pages2pageIdxCompute(i, false);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.SizeClassesMetric
    public int pages2pageIdxFloor(int i) {
        return pages2pageIdxCompute(i, true);
    }

    private int pages2pageIdxCompute(int i, boolean z) {
        int i2 = i << this.pageShifts;
        if (i2 > this.chunkSize) {
            return this.nPSizes;
        }
        int log2 = PoolThreadCache.log2((i2 << 1) - 1);
        int i3 = this.pageShifts;
        int i4 = (log2 < i3 + 2 ? 0 : log2 - (i3 + 2)) << 2;
        int i5 = log2 < (i3 + 2) + 1 ? i3 : (log2 - 2) - 1;
        int i6 = i4 + ((((i2 - 1) & ((-1) << i5)) >> i5) & 3);
        return (!z || this.pageIdx2sizeTab[i6] <= (i << i3)) ? i6 : i6 - 1;
    }

    private int alignSize(int i) {
        int i2 = this.directMemoryCacheAlignment;
        int i3 = (i2 - 1) & i;
        return i3 == 0 ? i : (i + i2) - i3;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.SizeClassesMetric
    public int normalizeSize(int i) {
        if (i == 0) {
            return this.sizeIdx2sizeTab[0];
        }
        if (this.directMemoryCacheAlignment > 0) {
            i = alignSize(i);
        }
        if (i <= this.lookupMaxSize) {
            return this.sizeIdx2sizeTab[this.size2idxTab[(i - 1) >> 4]];
        }
        return normalizeSizeCompute(i);
    }

    private static int normalizeSizeCompute(int i) {
        int log2 = PoolThreadCache.log2((i << 1) - 1);
        int i2 = (1 << (log2 < 7 ? 4 : (log2 - 2) - 1)) - 1;
        return (i + i2) & (~i2);
    }
}
