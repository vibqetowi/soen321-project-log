package com.google.zxing.pdf417.detector;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
/* loaded from: classes6.dex */
public final class Detector {
    private static final int BARCODE_MIN_HEIGHT = 10;
    private static final float MAX_AVG_VARIANCE = 0.42f;
    private static final float MAX_INDIVIDUAL_VARIANCE = 0.8f;
    private static final int MAX_PATTERN_DRIFT = 5;
    private static final int MAX_PIXEL_DRIFT = 3;
    private static final int ROW_STEP = 5;
    private static final int SKIPPED_ROW_COUNT_MAX = 25;
    private static final int[] INDEXES_START_PATTERN = {0, 4, 1, 5};
    private static final int[] INDEXES_STOP_PATTERN = {6, 2, 7, 3};
    private static final int[] START_PATTERN = {8, 1, 1, 1, 1, 1, 1, 3};
    private static final int[] STOP_PATTERN = {7, 1, 1, 3, 1, 1, 1, 2, 1};

    private Detector() {
    }

    public static PDF417DetectorResult detect(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map, boolean z) throws NotFoundException {
        BitMatrix blackMatrix = binaryBitmap.getBlackMatrix();
        List<ResultPoint[]> detect = detect(z, blackMatrix);
        if (detect.isEmpty()) {
            blackMatrix = blackMatrix.m6779clone();
            blackMatrix.rotate180();
            detect = detect(z, blackMatrix);
        }
        return new PDF417DetectorResult(blackMatrix, detect);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r4 == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
        r3 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
        if (r3.hasNext() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
        r4 = (com.google.zxing.ResultPoint[]) r3.next();
        r7 = r4[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r7 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
        r2 = (int) java.lang.Math.max(r2, r7.getY());
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
        r4 = r4[3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
        if (r4 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
        r2 = java.lang.Math.max(r2, (int) r4.getY());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static List<ResultPoint[]> detect(boolean z, BitMatrix bitMatrix) {
        int x;
        float y;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        loop0: while (true) {
            int i3 = i2;
            while (true) {
                if (i >= bitMatrix.getHeight()) {
                    break loop0;
                }
                ResultPoint[] findVertices = findVertices(bitMatrix, i, i2);
                if (findVertices[0] != null || findVertices[3] != null) {
                    arrayList.add(findVertices);
                    if (!z) {
                        break loop0;
                    }
                    ResultPoint resultPoint = findVertices[2];
                    if (resultPoint != null) {
                        x = (int) resultPoint.getX();
                        y = findVertices[2].getY();
                    } else {
                        x = (int) findVertices[4].getX();
                        y = findVertices[4].getY();
                    }
                    i = (int) y;
                    i2 = x;
                    i3 = 1;
                } else {
                    break;
                }
            }
            i += 5;
            i2 = 0;
        }
        return arrayList;
    }

    private static ResultPoint[] findVertices(BitMatrix bitMatrix, int i, int i2) {
        int height = bitMatrix.getHeight();
        int width = bitMatrix.getWidth();
        ResultPoint[] resultPointArr = new ResultPoint[8];
        copyToResult(resultPointArr, findRowsWithPattern(bitMatrix, height, width, i, i2, START_PATTERN), INDEXES_START_PATTERN);
        ResultPoint resultPoint = resultPointArr[4];
        if (resultPoint != null) {
            i2 = (int) resultPoint.getX();
            i = (int) resultPointArr[4].getY();
        }
        copyToResult(resultPointArr, findRowsWithPattern(bitMatrix, height, width, i, i2, STOP_PATTERN), INDEXES_STOP_PATTERN);
        return resultPointArr;
    }

    private static void copyToResult(ResultPoint[] resultPointArr, ResultPoint[] resultPointArr2, int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            resultPointArr[iArr[i]] = resultPointArr2[i];
        }
    }

    private static ResultPoint[] findRowsWithPattern(BitMatrix bitMatrix, int i, int i2, int i3, int i4, int[] iArr) {
        boolean z;
        int i5;
        int i6;
        ResultPoint[] resultPointArr = new ResultPoint[4];
        int[] iArr2 = new int[iArr.length];
        int i7 = i3;
        while (true) {
            if (i7 >= i) {
                z = false;
                break;
            }
            int[] findGuardPattern = findGuardPattern(bitMatrix, i4, i7, i2, false, iArr, iArr2);
            if (findGuardPattern != null) {
                int i8 = i7;
                int[] iArr3 = findGuardPattern;
                int i9 = i8;
                while (true) {
                    if (i9 <= 0) {
                        i6 = i9;
                        break;
                    }
                    int i10 = i9 - 1;
                    int[] findGuardPattern2 = findGuardPattern(bitMatrix, i4, i10, i2, false, iArr, iArr2);
                    if (findGuardPattern2 == null) {
                        i6 = i10 + 1;
                        break;
                    }
                    iArr3 = findGuardPattern2;
                    i9 = i10;
                }
                float f = i6;
                resultPointArr[0] = new ResultPoint(iArr3[0], f);
                resultPointArr[1] = new ResultPoint(iArr3[1], f);
                z = true;
                i7 = i6;
            } else {
                i7 += 5;
            }
        }
        int i11 = i7 + 1;
        if (z) {
            int[] iArr4 = {(int) resultPointArr[0].getX(), (int) resultPointArr[1].getX()};
            int i12 = i11;
            int i13 = 0;
            while (true) {
                if (i12 >= i) {
                    i5 = i13;
                    break;
                }
                int i14 = i13;
                int[] findGuardPattern3 = findGuardPattern(bitMatrix, iArr4[0], i12, i2, false, iArr, iArr2);
                if (findGuardPattern3 == null || Math.abs(iArr4[0] - findGuardPattern3[0]) >= 5 || Math.abs(iArr4[1] - findGuardPattern3[1]) >= 5) {
                    i5 = i14;
                    if (i5 > 25) {
                        break;
                    }
                    i13 = i5 + 1;
                } else {
                    iArr4 = findGuardPattern3;
                    i13 = 0;
                }
                i12++;
            }
            i11 = i12 - (i5 + 1);
            float f2 = i11;
            resultPointArr[2] = new ResultPoint(iArr4[0], f2);
            resultPointArr[3] = new ResultPoint(iArr4[1], f2);
        }
        if (i11 - i7 < 10) {
            Arrays.fill(resultPointArr, (Object) null);
        }
        return resultPointArr;
    }

    private static int[] findGuardPattern(BitMatrix bitMatrix, int i, int i2, int i3, boolean z, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i4 = 0;
        while (bitMatrix.get(i, i2) && i > 0) {
            int i5 = i4 + 1;
            if (i4 >= 3) {
                break;
            }
            i--;
            i4 = i5;
        }
        int length = iArr.length;
        boolean z2 = z;
        int i6 = 0;
        int i7 = i;
        while (i < i3) {
            if (bitMatrix.get(i, i2) != z2) {
                iArr2[i6] = iArr2[i6] + 1;
            } else {
                if (i6 != length - 1) {
                    i6++;
                } else if (patternMatchVariance(iArr2, iArr, MAX_INDIVIDUAL_VARIANCE) < 0.42f) {
                    return new int[]{i7, i};
                } else {
                    i7 += iArr2[0] + iArr2[1];
                    int i8 = i6 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i8);
                    iArr2[i8] = 0;
                    iArr2[i6] = 0;
                    i6--;
                }
                iArr2[i6] = 1;
                z2 = !z2;
            }
            i++;
        }
        if (i6 != length - 1 || patternMatchVariance(iArr2, iArr, MAX_INDIVIDUAL_VARIANCE) >= 0.42f) {
            return null;
        }
        return new int[]{i7, i - 1};
    }

    private static float patternMatchVariance(int[] iArr, int[] iArr2, float f) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i += iArr[i3];
            i2 += iArr2[i3];
        }
        if (i < i2) {
            return Float.POSITIVE_INFINITY;
        }
        float f2 = i;
        float f3 = f2 / i2;
        float f4 = f * f3;
        float f5 = 0.0f;
        for (int i4 = 0; i4 < length; i4++) {
            float f6 = iArr2[i4] * f3;
            float f7 = iArr[i4];
            float f8 = f7 > f6 ? f7 - f6 : f6 - f7;
            if (f8 > f4) {
                return Float.POSITIVE_INFINITY;
            }
            f5 += f8;
        }
        return f5 / f2;
    }
}
