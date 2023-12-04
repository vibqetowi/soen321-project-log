package io.grpc.netty.shaded.io.netty.handler.codec.compression;
/* loaded from: classes4.dex */
final class Bzip2DivSufSort {
    private static final int BUCKET_A_SIZE = 256;
    private static final int BUCKET_B_SIZE = 65536;
    private static final int INSERTIONSORT_THRESHOLD = 8;
    private static final int[] LOG_2_TABLE = {-1, 0, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7};
    private static final int SS_BLOCKSIZE = 1024;
    private static final int STACK_SIZE = 64;
    private final int[] SA;
    private final byte[] T;
    private final int n;

    private static int BUCKET_B(int i, int i2) {
        return i | (i2 << 8);
    }

    private static int BUCKET_BSTAR(int i, int i2) {
        return (i << 8) | i2;
    }

    private static int getIDX(int i) {
        return i >= 0 ? i : ~i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Bzip2DivSufSort(byte[] bArr, int[] iArr, int i) {
        this.T = bArr;
        this.SA = iArr;
        this.n = i;
    }

    private static void swapElements(int[] iArr, int i, int[] iArr2, int i2) {
        int i3 = iArr[i];
        iArr[i] = iArr2[i2];
        iArr2[i2] = i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
        return (r1[r5] & 255) - (r1[r7] & 255);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
        if (r7 >= r3) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int ssCompare(int i, int i2, int i3) {
        int[] iArr = this.SA;
        byte[] bArr = this.T;
        int i4 = iArr[i + 1] + 2;
        int i5 = iArr[i2 + 1] + 2;
        int i6 = iArr[i] + i3;
        int i7 = i3 + iArr[i2];
        while (i6 < i4 && i7 < i5 && bArr[i6] == bArr[i7]) {
            i6++;
            i7++;
        }
        return i7 < i5 ? -1 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
        return (r1[r7] & 255) - (r1[r9] & 255);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
        if (r9 >= r8) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
        return (r1[r7] & 255) - (r1[r9] & 255);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        if (r9 >= r8) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int ssCompareLast(int i, int i2, int i3, int i4, int i5) {
        int[] iArr = this.SA;
        byte[] bArr = this.T;
        int i6 = iArr[i2] + i4;
        int i7 = i4 + iArr[i3];
        int i8 = iArr[i3 + 1] + 2;
        while (i6 < i5 && i7 < i8 && bArr[i6] == bArr[i7]) {
            i6++;
            i7++;
        }
        if (i7 == i8) {
            return 1;
        }
        int i9 = i6 % i5;
        int i10 = iArr[i] + 2;
        while (i9 < i10 && i7 < i8 && bArr[i9] == bArr[i7]) {
            i9++;
            i7++;
        }
        return i7 < i8 ? -1 : 0;
    }

    private void ssInsertionSort(int i, int i2, int i3, int i4) {
        int ssCompare;
        int[] iArr = this.SA;
        for (int i5 = i3 - 2; i2 <= i5; i5--) {
            int i6 = iArr[i5];
            int i7 = i5 + 1;
            do {
                ssCompare = ssCompare(i + i6, iArr[i7] + i, i4);
                if (ssCompare <= 0) {
                    break;
                }
                do {
                    iArr[i7 - 1] = iArr[i7];
                    i7++;
                    if (i7 < i3) {
                    }
                } while (iArr[i7] < 0);
                continue;
            } while (i3 > i7);
            if (ssCompare == 0) {
                iArr[i7] = ~iArr[i7];
            }
            iArr[i7 - 1] = i6;
        }
    }

    private void ssFixdown(int i, int i2, int i3, int i4, int i5) {
        int[] iArr = this.SA;
        byte[] bArr = this.T;
        int i6 = iArr[i3 + i4];
        int i7 = bArr[iArr[i2 + i6] + i] & 255;
        while (true) {
            int i8 = (i4 * 2) + 1;
            if (i8 >= i5) {
                break;
            }
            int i9 = i8 + 1;
            int i10 = bArr[iArr[iArr[i3 + i8] + i2] + i] & 255;
            int i11 = bArr[iArr[iArr[i3 + i9] + i2] + i] & 255;
            if (i10 < i11) {
                i8 = i9;
                i10 = i11;
            }
            if (i10 <= i7) {
                break;
            }
            iArr[i4 + i3] = iArr[i3 + i8];
            i4 = i8;
        }
        iArr[i3 + i4] = i6;
    }

    private void ssHeapSort(int i, int i2, int i3, int i4) {
        int i5;
        int[] iArr = this.SA;
        byte[] bArr = this.T;
        int i6 = i4 % 2;
        if (i6 == 0) {
            int i7 = i4 - 1;
            int i8 = (i7 / 2) + i3;
            int i9 = i3 + i7;
            if ((bArr[iArr[iArr[i8] + i2] + i] & 255) < (bArr[iArr[iArr[i9] + i2] + i] & 255)) {
                swapElements(iArr, i9, iArr, i8);
            }
            i5 = i7;
        } else {
            i5 = i4;
        }
        for (int i10 = (i5 / 2) - 1; i10 >= 0; i10--) {
            ssFixdown(i, i2, i3, i10, i5);
        }
        if (i6 == 0) {
            swapElements(iArr, i3, iArr, i3 + i5);
            ssFixdown(i, i2, i3, 0, i5);
        }
        for (int i11 = i5 - 1; i11 > 0; i11--) {
            int i12 = iArr[i3];
            int i13 = i3 + i11;
            iArr[i3] = iArr[i13];
            ssFixdown(i, i2, i3, 0, i11);
            iArr[i13] = i12;
        }
    }

    private int ssMedian3(int i, int i2, int i3, int i4, int i5) {
        int[] iArr = this.SA;
        byte[] bArr = this.T;
        int i6 = bArr[iArr[iArr[i3] + i2] + i] & 255;
        int i7 = bArr[iArr[iArr[i4] + i2] + i] & 255;
        int i8 = bArr[i + iArr[i2 + iArr[i5]]] & 255;
        if (i6 <= i7) {
            i4 = i3;
            i3 = i4;
            i7 = i6;
            i6 = i7;
        }
        return i6 > i8 ? i7 > i8 ? i4 : i5 : i3;
    }

    private int ssMedian5(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int[] iArr = this.SA;
        byte[] bArr = this.T;
        int i17 = bArr[iArr[iArr[i3] + i2] + i] & 255;
        int i18 = bArr[iArr[iArr[i4] + i2] + i] & 255;
        int i19 = bArr[iArr[iArr[i5] + i2] + i] & 255;
        int i20 = bArr[iArr[iArr[i6] + i2] + i] & 255;
        int i21 = bArr[iArr[iArr[i7] + i2] + i] & 255;
        if (i18 > i19) {
            i8 = i5;
            i9 = i18;
            i10 = i4;
        } else {
            i8 = i4;
            i9 = i19;
            i19 = i18;
            i10 = i5;
        }
        if (i20 > i21) {
            i12 = i21;
            i11 = i20;
            i14 = i6;
            i13 = i7;
        } else {
            i11 = i21;
            i12 = i20;
            i13 = i6;
            i14 = i7;
        }
        if (i19 > i12) {
            int i22 = i10;
            i10 = i14;
            i14 = i22;
            int i23 = i11;
            i11 = i9;
            i9 = i23;
        } else {
            i8 = i13;
            i19 = i12;
        }
        if (i17 > i9) {
            i15 = i17;
            i16 = i3;
        } else {
            i15 = i9;
            i9 = i17;
            i16 = i10;
            i10 = i3;
        }
        if (i9 > i19) {
            i8 = i10;
            i19 = i9;
        } else {
            i14 = i16;
            i11 = i15;
        }
        return i11 > i19 ? i8 : i14;
    }

    private int ssPivot(int i, int i2, int i3, int i4) {
        int i5 = i4 - i3;
        int i6 = i3 + (i5 / 2);
        if (i5 <= 512) {
            if (i5 <= 32) {
                return ssMedian3(i, i2, i3, i6, i4 - 1);
            }
            int i7 = i5 >> 2;
            int i8 = i4 - 1;
            return ssMedian5(i, i2, i3, i3 + i7, i6, i8 - i7, i8);
        }
        int i9 = i5 >> 3;
        int i10 = i9 << 1;
        int i11 = i4 - 1;
        return ssMedian3(i, i2, ssMedian3(i, i2, i3, i3 + i9, i3 + i10), ssMedian3(i, i2, i6 - i9, i6, i6 + i9), ssMedian3(i, i2, i11 - i10, i11 - i9, i11));
    }

    private static int ssLog(int i) {
        return (65280 & i) != 0 ? LOG_2_TABLE[(i >> 8) & 255] + 8 : LOG_2_TABLE[i & 255];
    }

    private int ssSubstringPartition(int i, int i2, int i3, int i4) {
        int i5;
        int[] iArr = this.SA;
        int i6 = i2 - 1;
        while (true) {
            i6++;
            if (i6 < i3) {
                int i7 = iArr[i6];
                if (iArr[i + i7] + i4 >= iArr[i + i7 + 1] + 1) {
                    iArr[i6] = ~i7;
                }
            }
            do {
                i3--;
                if (i6 >= i3) {
                    break;
                }
                i5 = iArr[i3];
            } while (iArr[i + i5] + i4 < iArr[i5 + i + 1] + 1);
            if (i3 <= i6) {
                break;
            }
            int i8 = ~iArr[i3];
            iArr[i3] = iArr[i6];
            iArr[i6] = i8;
        }
        if (i2 < i6) {
            iArr[i2] = ~iArr[i2];
        }
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class StackEntry {
        final int a;
        final int b;
        final int c;
        final int d;

        StackEntry(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }
    }

    private void ssMultiKeyIntroSort(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Bzip2DivSufSort bzip2DivSufSort = this;
        int[] iArr = bzip2DivSufSort.SA;
        byte[] bArr = bzip2DivSufSort.T;
        StackEntry[] stackEntryArr = new StackEntry[64];
        int i10 = i4;
        int ssLog = ssLog(i3 - i2);
        int i11 = 0;
        int i12 = 0;
        int i13 = i2;
        int i14 = i3;
        while (true) {
            int i15 = i14 - i13;
            if (i15 <= 8) {
                if (1 < i15) {
                    bzip2DivSufSort.ssInsertionSort(i, i13, i14, i10);
                }
                if (i11 == 0) {
                    return;
                }
                i11--;
                StackEntry stackEntry = stackEntryArr[i11];
                int i16 = stackEntry.a;
                int i17 = stackEntry.b;
                int i18 = stackEntry.c;
                ssLog = stackEntry.d;
                i13 = i16;
                i14 = i17;
                i10 = i18;
            } else {
                int i19 = ssLog - 1;
                if (ssLog == 0) {
                    bzip2DivSufSort.ssHeapSort(i10, i, i13, i15);
                }
                ssLog = -1;
                if (i19 < 0) {
                    int i20 = bArr[iArr[iArr[i13] + i] + i10] & 255;
                    int i21 = i12;
                    int i22 = i13;
                    i13++;
                    int i23 = i21;
                    while (i13 < i14) {
                        i23 = bArr[iArr[iArr[i13] + i] + i10] & 255;
                        if (i23 != i20) {
                            if (1 < i13 - i22) {
                                break;
                            }
                            i22 = i13;
                            i20 = i23;
                        }
                        i13++;
                    }
                    if ((bArr[(iArr[iArr[i22] + i] + i10) - 1] & 255) < i20) {
                        i22 = bzip2DivSufSort.ssSubstringPartition(i, i22, i13, i10);
                    }
                    int i24 = i13 - i22;
                    int i25 = i14 - i13;
                    if (i24 <= i25) {
                        if (1 < i24) {
                            i5 = i11 + 1;
                            stackEntryArr[i11] = new StackEntry(i13, i14, i10, -1);
                            i10++;
                            ssLog = ssLog(i24);
                            i14 = i13;
                            i13 = i22;
                            i12 = i23;
                            i11 = i5;
                        } else {
                            i12 = i23;
                        }
                    } else if (1 < i25) {
                        i5 = i11 + 1;
                        stackEntryArr[i11] = new StackEntry(i22, i13, i10 + 1, ssLog(i24));
                        i12 = i23;
                        i11 = i5;
                    } else {
                        i10++;
                        ssLog = ssLog(i24);
                        i14 = i13;
                        i13 = i22;
                        i12 = i23;
                    }
                } else {
                    int ssPivot = bzip2DivSufSort.ssPivot(i10, i, i13, i14);
                    int i26 = bArr[iArr[iArr[ssPivot] + i] + i10] & 255;
                    swapElements(iArr, i13, iArr, ssPivot);
                    int i27 = i13 + 1;
                    while (i27 < i14) {
                        i12 = bArr[iArr[iArr[i27] + i] + i10] & 255;
                        if (i12 != i26) {
                            break;
                        }
                        i27++;
                    }
                    if (i27 < i14 && i12 < i26) {
                        i6 = i27;
                        while (true) {
                            i27++;
                            if (i27 >= i14 || (i12 = bArr[iArr[iArr[i27] + i] + i10] & 255) > i26) {
                                break;
                            } else if (i12 == i26) {
                                swapElements(iArr, i27, iArr, i6);
                                i6++;
                            }
                        }
                    } else {
                        i6 = i27;
                    }
                    int i28 = i14 - 1;
                    while (i27 < i28) {
                        i12 = bArr[iArr[iArr[i28] + i] + i10] & 255;
                        if (i12 != i26) {
                            break;
                        }
                        i28--;
                    }
                    if (i27 < i28 && i12 > i26) {
                        int i29 = i12;
                        int i30 = i28;
                        while (true) {
                            i28 += ssLog;
                            if (i27 >= i28) {
                                i7 = i30;
                                i12 = i29;
                                break;
                            }
                            int i31 = bArr[i10 + iArr[i + iArr[i28]]] & 255;
                            if (i31 < i26) {
                                int i32 = i30;
                                i12 = i31;
                                i7 = i32;
                                break;
                            }
                            if (i31 == i26) {
                                swapElements(iArr, i28, iArr, i30);
                                i30--;
                            }
                            i29 = i31;
                            ssLog = -1;
                        }
                    } else {
                        i7 = i28;
                    }
                    while (i27 < i28) {
                        swapElements(iArr, i27, iArr, i28);
                        while (true) {
                            i27++;
                            if (i27 >= i28 || (i12 = bArr[iArr[iArr[i27] + i] + i10] & 255) > i26) {
                                break;
                            } else if (i12 == i26) {
                                swapElements(iArr, i27, iArr, i6);
                                i6++;
                            }
                        }
                        while (true) {
                            i28--;
                            if (i27 < i28 && (i12 = bArr[iArr[iArr[i28] + i] + i10] & 255) >= i26) {
                                if (i12 == i26) {
                                    swapElements(iArr, i28, iArr, i7);
                                    i7--;
                                }
                            }
                        }
                    }
                    if (i6 <= i7) {
                        int i33 = i27 - 1;
                        i8 = i12;
                        int i34 = i6 - i13;
                        int i35 = i27 - i6;
                        if (i34 > i35) {
                            i34 = i35;
                        }
                        int i36 = i13;
                        int i37 = i27;
                        int i38 = i27 - i34;
                        while (i34 > 0) {
                            swapElements(iArr, i36, iArr, i38);
                            i34--;
                            i36++;
                            i38++;
                        }
                        int i39 = i7 - i33;
                        int i40 = (i14 - i7) - 1;
                        if (i39 <= i40) {
                            i40 = i39;
                        }
                        int i41 = i14 - i40;
                        int i42 = i37;
                        while (i40 > 0) {
                            swapElements(iArr, i42, iArr, i41);
                            i40--;
                            i42++;
                            i41++;
                        }
                        int i43 = i13 + i35;
                        int i44 = i14 - i39;
                        int ssSubstringPartition = i26 <= (bArr[(iArr[iArr[i43] + i] + i10) + (-1)] & 255) ? i43 : bzip2DivSufSort.ssSubstringPartition(i, i43, i44, i10);
                        int i45 = i43 - i13;
                        int i46 = i14 - i44;
                        if (i45 <= i46) {
                            int i47 = i44 - ssSubstringPartition;
                            if (i46 <= i47) {
                                int i48 = i11 + 1;
                                stackEntryArr[i11] = new StackEntry(ssSubstringPartition, i44, i10 + 1, ssLog(i47));
                                i11 = i48 + 1;
                                i9 = i19;
                                stackEntryArr[i48] = new StackEntry(i44, i14, i10, i9);
                            } else {
                                i9 = i19;
                                if (i45 <= i47) {
                                    int i49 = i11 + 1;
                                    stackEntryArr[i11] = new StackEntry(i44, i14, i10, i9);
                                    i11 = i49 + 1;
                                    stackEntryArr[i49] = new StackEntry(ssSubstringPartition, i44, i10 + 1, ssLog(i47));
                                } else {
                                    int i50 = i11 + 1;
                                    stackEntryArr[i11] = new StackEntry(i44, i14, i10, i9);
                                    i11 = i50 + 1;
                                    stackEntryArr[i50] = new StackEntry(i13, i43, i10, i9);
                                    i10++;
                                    ssLog = ssLog(i47);
                                }
                            }
                            i12 = i8;
                            i14 = i43;
                            ssLog = i9;
                        } else {
                            int i51 = i44 - ssSubstringPartition;
                            if (i45 <= i51) {
                                int i52 = i11 + 1;
                                stackEntryArr[i11] = new StackEntry(ssSubstringPartition, i44, i10 + 1, ssLog(i51));
                                i11 = i52 + 1;
                                stackEntryArr[i52] = new StackEntry(i13, i43, i10, i19);
                            } else if (i46 <= i51) {
                                int i53 = i11 + 1;
                                stackEntryArr[i11] = new StackEntry(i13, i43, i10, i19);
                                i11 = i53 + 1;
                                stackEntryArr[i53] = new StackEntry(ssSubstringPartition, i44, i10 + 1, ssLog(i51));
                            } else {
                                int i54 = i11 + 1;
                                stackEntryArr[i11] = new StackEntry(i13, i43, i10, i19);
                                i11 = i54 + 1;
                                stackEntryArr[i54] = new StackEntry(i44, i14, i10, i19);
                                i10++;
                                ssLog = ssLog(i51);
                                bzip2DivSufSort = this;
                            }
                            bzip2DivSufSort = this;
                            i13 = i44;
                            ssLog = i19;
                        }
                        i14 = i44;
                        i13 = ssSubstringPartition;
                    } else {
                        i8 = i12;
                        int i55 = i19 + 1;
                        if ((bArr[(iArr[iArr[i13] + i] + i10) - 1] & 255) < i26) {
                            bzip2DivSufSort = this;
                            i13 = bzip2DivSufSort.ssSubstringPartition(i, i13, i14, i10);
                            ssLog = ssLog(i14 - i13);
                        } else {
                            bzip2DivSufSort = this;
                            ssLog = i55;
                        }
                        i10++;
                    }
                    i12 = i8;
                }
            }
        }
    }

    private static void ssBlockSwap(int[] iArr, int i, int[] iArr2, int i2, int i3) {
        while (i3 > 0) {
            swapElements(iArr, i, iArr2, i2);
            i3--;
            i++;
            i2++;
        }
    }

    private void ssMergeForward(int i, int[] iArr, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int[] iArr2 = this.SA;
        int i8 = i4 - i3;
        int i9 = (i2 + i8) - 1;
        ssBlockSwap(iArr, i2, iArr2, i3, i8);
        int i10 = iArr2[i3];
        while (true) {
            int ssCompare = ssCompare(iArr[i2] + i, iArr2[i4] + i, i6);
            if (ssCompare < 0) {
                while (true) {
                    i7 = i3 + 1;
                    iArr2[i3] = iArr[i2];
                    if (i9 <= i2) {
                        iArr[i2] = i10;
                        return;
                    }
                    int i11 = i2 + 1;
                    iArr[i2] = iArr2[i7];
                    if (iArr[i11] >= 0) {
                        i2 = i11;
                        break;
                    } else {
                        i2 = i11;
                        i3 = i7;
                    }
                }
            } else if (ssCompare > 0) {
                while (true) {
                    i7 = i3 + 1;
                    iArr2[i3] = iArr2[i4];
                    int i12 = i4 + 1;
                    iArr2[i4] = iArr2[i7];
                    if (i5 <= i12) {
                        while (i2 < i9) {
                            int i13 = i7 + 1;
                            iArr2[i7] = iArr[i2];
                            iArr[i2] = iArr2[i13];
                            i7 = i13;
                            i2++;
                        }
                        iArr2[i7] = iArr[i2];
                        iArr[i2] = i10;
                        return;
                    } else if (iArr2[i12] >= 0) {
                        i4 = i12;
                        break;
                    } else {
                        i4 = i12;
                        i3 = i7;
                    }
                }
            } else {
                iArr2[i4] = ~iArr2[i4];
                while (true) {
                    int i14 = i3 + 1;
                    iArr2[i3] = iArr[i2];
                    if (i9 <= i2) {
                        iArr[i2] = i10;
                        return;
                    }
                    int i15 = i2 + 1;
                    iArr[i2] = iArr2[i14];
                    if (iArr[i15] >= 0) {
                        while (true) {
                            int i16 = i14 + 1;
                            iArr2[i14] = iArr2[i4];
                            int i17 = i4 + 1;
                            iArr2[i4] = iArr2[i16];
                            if (i5 <= i17) {
                                while (i15 < i9) {
                                    int i18 = i16 + 1;
                                    iArr2[i16] = iArr[i15];
                                    iArr[i15] = iArr2[i18];
                                    i15++;
                                    i16 = i18;
                                }
                                iArr2[i16] = iArr[i15];
                                iArr[i15] = i10;
                                return;
                            } else if (iArr2[i17] >= 0) {
                                i4 = i17;
                                i3 = i16;
                                i2 = i15;
                                break;
                            } else {
                                i4 = i17;
                                i14 = i16;
                            }
                        }
                    } else {
                        i2 = i15;
                        i3 = i14;
                    }
                }
            }
            i3 = i7;
        }
    }

    private void ssMergeBackward(int i, int[] iArr, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        boolean z;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int[] iArr2 = this.SA;
        int i16 = i5 - i4;
        ssBlockSwap(iArr, i2, iArr2, i4, i16);
        int i17 = (i2 + i16) - 1;
        int i18 = iArr[i17];
        if (i18 < 0) {
            i7 = i + (~i18);
            z = true;
        } else {
            i7 = i + i18;
            z = false;
        }
        int i19 = i4 - 1;
        int i20 = iArr2[i19];
        if (i20 < 0) {
            z |= true;
            i20 = ~i20;
        }
        int i21 = i + i20;
        int i22 = i5 - 1;
        int i23 = iArr2[i22];
        while (true) {
            int ssCompare = ssCompare(i7, i21, i6);
            if (ssCompare > 0) {
                if (z & true) {
                    while (true) {
                        i8 = i22 - 1;
                        iArr2[i22] = iArr[i17];
                        i9 = i17 - 1;
                        iArr[i17] = iArr2[i8];
                        if (iArr[i9] >= 0) {
                            break;
                        }
                        i17 = i9;
                        i22 = i8;
                    }
                    z = !z;
                    i17 = i9;
                    i22 = i8;
                }
                int i24 = i22 - 1;
                iArr2[i22] = iArr[i17];
                if (i17 <= i2) {
                    iArr[i17] = i23;
                    return;
                }
                int i25 = i17 - 1;
                iArr[i17] = iArr2[i24];
                int i26 = iArr[i25];
                if (i26 < 0) {
                    z |= true;
                    i26 = ~i26;
                }
                int i27 = i + i26;
                i17 = i25;
                i22 = i24;
                i7 = i27;
            } else if (ssCompare < 0) {
                if (z & true) {
                    while (true) {
                        i10 = i22 - 1;
                        iArr2[i22] = iArr2[i19];
                        i11 = i19 - 1;
                        iArr2[i19] = iArr2[i10];
                        if (iArr2[i11] >= 0) {
                            break;
                        }
                        i19 = i11;
                        i22 = i10;
                    }
                    z ^= true;
                    i19 = i11;
                    i22 = i10;
                }
                int i28 = i22 - 1;
                iArr2[i22] = iArr2[i19];
                int i29 = i19 - 1;
                iArr2[i19] = iArr2[i28];
                if (i29 < i3) {
                    while (i2 < i17) {
                        int i30 = i28 - 1;
                        iArr2[i28] = iArr[i17];
                        iArr[i17] = iArr2[i30];
                        i28 = i30;
                        i17--;
                    }
                    iArr2[i28] = iArr[i17];
                    iArr[i17] = i23;
                    return;
                }
                int i31 = iArr2[i29];
                if (i31 < 0) {
                    z |= true;
                    i31 = ~i31;
                }
                i21 = i + i31;
                i19 = i29;
                i22 = i28;
            } else {
                if (z & true) {
                    while (true) {
                        i14 = i22 - 1;
                        iArr2[i22] = iArr[i17];
                        i15 = i17 - 1;
                        iArr[i17] = iArr2[i14];
                        if (iArr[i15] >= 0) {
                            break;
                        }
                        i17 = i15;
                        i22 = i14;
                    }
                    z = !z;
                    i17 = i15;
                    i22 = i14;
                }
                int i32 = i22 - 1;
                iArr2[i22] = ~iArr[i17];
                if (i17 <= i2) {
                    iArr[i17] = i23;
                    return;
                }
                int i33 = i17 - 1;
                iArr[i17] = iArr2[i32];
                if (z & true) {
                    while (true) {
                        i12 = i32 - 1;
                        iArr2[i32] = iArr2[i19];
                        i13 = i19 - 1;
                        iArr2[i19] = iArr2[i12];
                        if (iArr2[i13] >= 0) {
                            break;
                        }
                        i19 = i13;
                        i32 = i12;
                    }
                    z ^= true;
                    i19 = i13;
                    i32 = i12;
                }
                int i34 = i32 - 1;
                iArr2[i32] = iArr2[i19];
                int i35 = i19 - 1;
                iArr2[i19] = iArr2[i34];
                if (i35 < i3) {
                    while (i2 < i33) {
                        int i36 = i34 - 1;
                        iArr2[i34] = iArr[i33];
                        iArr[i33] = iArr2[i36];
                        i34 = i36;
                        i33--;
                    }
                    iArr2[i34] = iArr[i33];
                    iArr[i33] = i23;
                    return;
                }
                int i37 = iArr[i33];
                if (i37 < 0) {
                    z |= true;
                    i37 = ~i37;
                }
                int i38 = i + i37;
                int i39 = iArr2[i35];
                if (i39 < 0) {
                    z |= true;
                    i39 = ~i39;
                }
                i21 = i + i39;
                i7 = i38;
                i19 = i35;
                i17 = i33;
                i22 = i34;
            }
        }
    }

    private void ssMergeCheckEqual(int i, int i2, int i3) {
        int[] iArr = this.SA;
        if (iArr[i3] < 0 || ssCompare(getIDX(iArr[i3 - 1]) + i, i + iArr[i3], i2) != 0) {
            return;
        }
        iArr[i3] = ~iArr[i3];
    }

    private void ssMerge(int i, int i2, int i3, int i4, int[] iArr, int i5, int i6, int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int[] iArr2 = this.SA;
        StackEntry[] stackEntryArr = new StackEntry[64];
        int i13 = i2;
        int i14 = i3;
        int i15 = i4;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            int i18 = i15 - i14;
            if (i18 <= i6) {
                if (i13 >= i14 || i14 >= i15) {
                    i8 = i15;
                } else {
                    i8 = i15;
                    ssMergeBackward(i, iArr, i5, i13, i14, i15, i7);
                }
                if ((i16 & 1) != 0) {
                    ssMergeCheckEqual(i, i7, i13);
                }
                if ((i16 & 2) != 0) {
                    ssMergeCheckEqual(i, i7, i8);
                }
                if (i17 == 0) {
                    return;
                }
                i17--;
                StackEntry stackEntry = stackEntryArr[i17];
                i13 = stackEntry.a;
                i14 = stackEntry.b;
                i15 = stackEntry.c;
                i9 = stackEntry.d;
            } else {
                int i19 = i15;
                int i20 = i14 - i13;
                if (i20 <= i6) {
                    if (i13 < i14) {
                        ssMergeForward(i, iArr, i5, i13, i14, i19, i7);
                    }
                    if ((i16 & 1) != 0) {
                        ssMergeCheckEqual(i, i7, i13);
                    }
                    if ((i16 & 2) != 0) {
                        ssMergeCheckEqual(i, i7, i19);
                    }
                    if (i17 == 0) {
                        return;
                    }
                    i17--;
                    StackEntry stackEntry2 = stackEntryArr[i17];
                    i13 = stackEntry2.a;
                    i14 = stackEntry2.b;
                    i15 = stackEntry2.c;
                    i9 = stackEntry2.d;
                } else {
                    int min = Math.min(i20, i18);
                    int i21 = min >> 1;
                    int i22 = 0;
                    while (min > 0) {
                        if (ssCompare(getIDX(iArr2[i14 + i22 + i21]) + i, getIDX(iArr2[((i14 - i22) - i21) - 1]) + i, i7) < 0) {
                            i22 += i21 + 1;
                            i21 -= (min & 1) ^ 1;
                        }
                        min = i21;
                        i21 = min >> 1;
                    }
                    if (i22 > 0) {
                        int i23 = i14 - i22;
                        ssBlockSwap(iArr2, i23, iArr2, i14, i22);
                        int i24 = i14 + i22;
                        if (i24 < i19) {
                            if (iArr2[i24] < 0) {
                                i12 = i14;
                                while (iArr2[i12 - 1] < 0) {
                                    i12--;
                                }
                                iArr2[i24] = ~iArr2[i24];
                            } else {
                                i12 = i14;
                            }
                            i10 = i14;
                            while (iArr2[i10] < 0) {
                                i10++;
                            }
                            i15 = i12;
                            i11 = 1;
                        } else {
                            i10 = i14;
                            i15 = i10;
                            i11 = 0;
                        }
                        if (i15 - i13 <= i19 - i10) {
                            stackEntryArr[i17] = new StackEntry(i10, i24, i19, (i11 & 1) | (i16 & 2));
                            i16 &= 1;
                            i14 = i23;
                            i17++;
                        } else {
                            if (i15 == i14 && i14 == i10) {
                                i11 <<= 1;
                            }
                            stackEntryArr[i17] = new StackEntry(i13, i23, i15, (i16 & 1) | (i11 & 2));
                            i16 = (i16 & 2) | (i11 & 1);
                            i14 = i24;
                            i17++;
                            i13 = i10;
                            i15 = i19;
                        }
                    } else {
                        if ((i16 & 1) != 0) {
                            ssMergeCheckEqual(i, i7, i13);
                        }
                        ssMergeCheckEqual(i, i7, i14);
                        if ((i16 & 2) != 0) {
                            ssMergeCheckEqual(i, i7, i19);
                        }
                        if (i17 == 0) {
                            return;
                        }
                        i17--;
                        StackEntry stackEntry3 = stackEntryArr[i17];
                        i13 = stackEntry3.a;
                        i14 = stackEntry3.b;
                        i15 = stackEntry3.c;
                        i9 = stackEntry3.d;
                    }
                }
            }
            i16 = i9;
        }
    }

    private void subStringSort(int i, int i2, int i3, int[] iArr, int i4, int i5, int i6, boolean z, int i7) {
        int i8;
        int i9;
        int[] iArr2;
        int[] iArr3 = this.SA;
        int i10 = z ? i2 + 1 : i2;
        int i11 = 0;
        int i12 = i10;
        while (true) {
            int i13 = i12 + 1024;
            if (i13 >= i3) {
                break;
            }
            ssMultiKeyIntroSort(i, i12, i13, i6);
            int i14 = i3 - i13;
            if (i14 <= i5) {
                iArr2 = iArr;
                i9 = i4;
                i8 = i5;
            } else {
                i8 = i14;
                i9 = i13;
                iArr2 = iArr3;
            }
            int i15 = i12;
            int i16 = 1024;
            int i17 = i11;
            while ((i17 & 1) != 0) {
                int i18 = i15 - i16;
                ssMerge(i, i18, i15, i15 + i16, iArr2, i9, i8, i6);
                i16 <<= 1;
                i17 >>>= 1;
                i15 = i18;
                i13 = i13;
            }
            i11++;
            i12 = i13;
        }
        ssMultiKeyIntroSort(i, i12, i3, i6);
        int i19 = i12;
        int i20 = 1024;
        for (int i21 = i11; i21 != 0; i21 >>= 1) {
            if ((i21 & 1) != 0) {
                int i22 = i19 - i20;
                ssMerge(i, i22, i19, i3, iArr, i4, i5, i6);
                i19 = i22;
            }
            i20 <<= 1;
        }
        if (z) {
            int i23 = iArr3[i10 - 1];
            int i24 = 1;
            while (i10 < i3) {
                int i25 = iArr3[i10];
                if (i25 >= 0 && (i24 = ssCompareLast(i, i + i23, i + i25, i6, i7)) <= 0) {
                    break;
                }
                iArr3[i10 - 1] = iArr3[i10];
                i10++;
            }
            if (i24 == 0) {
                iArr3[i10] = ~iArr3[i10];
            }
            iArr3[i10 - 1] = i23;
        }
    }

    private int trGetC(int i, int i2, int i3, int i4) {
        int i5 = i2 + i4;
        return i5 < i3 ? this.SA[i5] : this.SA[i + (((i2 - i) + i4) % (i3 - i))];
    }

    private void trFixdown(int i, int i2, int i3, int i4, int i5, int i6) {
        int[] iArr = this.SA;
        int i7 = iArr[i4 + i5];
        int trGetC = trGetC(i, i2, i3, i7);
        while (true) {
            int i8 = (i5 * 2) + 1;
            if (i8 >= i6) {
                break;
            }
            int i9 = i8 + 1;
            int trGetC2 = trGetC(i, i2, i3, iArr[i4 + i8]);
            int trGetC3 = trGetC(i, i2, i3, iArr[i4 + i9]);
            if (trGetC2 < trGetC3) {
                i8 = i9;
                trGetC2 = trGetC3;
            }
            if (trGetC2 <= trGetC) {
                break;
            }
            iArr[i5 + i4] = iArr[i4 + i8];
            i5 = i8;
        }
        iArr[i4 + i5] = i7;
    }

    private void trHeapSort(int i, int i2, int i3, int i4, int i5) {
        int i6;
        int[] iArr = this.SA;
        int i7 = i5 % 2;
        if (i7 == 0) {
            int i8 = i5 - 1;
            int i9 = (i8 / 2) + i4;
            int i10 = i4 + i8;
            if (trGetC(i, i2, i3, iArr[i9]) < trGetC(i, i2, i3, iArr[i10])) {
                swapElements(iArr, i10, iArr, i9);
            }
            i6 = i8;
        } else {
            i6 = i5;
        }
        for (int i11 = (i6 / 2) - 1; i11 >= 0; i11--) {
            trFixdown(i, i2, i3, i4, i11, i6);
        }
        if (i7 == 0) {
            swapElements(iArr, i4, iArr, i4 + i6);
            trFixdown(i, i2, i3, i4, 0, i6);
        }
        for (int i12 = i6 - 1; i12 > 0; i12--) {
            int i13 = iArr[i4];
            int i14 = i4 + i12;
            iArr[i4] = iArr[i14];
            trFixdown(i, i2, i3, i4, 0, i12);
            iArr[i14] = i13;
        }
    }

    private void trInsertionSort(int i, int i2, int i3, int i4, int i5) {
        int trGetC;
        int[] iArr = this.SA;
        for (int i6 = i4 + 1; i6 < i5; i6++) {
            int i7 = iArr[i6];
            int i8 = i6 - 1;
            do {
                trGetC = trGetC(i, i2, i3, i7) - trGetC(i, i2, i3, iArr[i8]);
                if (trGetC >= 0) {
                    break;
                }
                do {
                    iArr[i8 + 1] = iArr[i8];
                    i8--;
                    if (i4 <= i8) {
                    }
                } while (iArr[i8] < 0);
                continue;
            } while (i8 >= i4);
            if (trGetC == 0) {
                iArr[i8] = ~iArr[i8];
            }
            iArr[i8 + 1] = i7;
        }
    }

    private static int trLog(int i) {
        return ((-65536) & i) != 0 ? ((-16777216) & i) != 0 ? LOG_2_TABLE[(i >> 24) & 255] + 24 : LOG_2_TABLE[(i >> 16) & 271] : (65280 & i) != 0 ? LOG_2_TABLE[(i >> 8) & 255] + 8 : LOG_2_TABLE[i & 255];
    }

    private int trMedian3(int i, int i2, int i3, int i4, int i5, int i6) {
        int[] iArr = this.SA;
        int trGetC = trGetC(i, i2, i3, iArr[i4]);
        int trGetC2 = trGetC(i, i2, i3, iArr[i5]);
        int trGetC3 = trGetC(i, i2, i3, iArr[i6]);
        if (trGetC <= trGetC2) {
            i5 = i4;
            i4 = i5;
            trGetC2 = trGetC;
            trGetC = trGetC2;
        }
        return trGetC > trGetC3 ? trGetC2 > trGetC3 ? i5 : i6 : i4;
    }

    private int trMedian5(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int[] iArr = this.SA;
        int trGetC = trGetC(i, i2, i3, iArr[i4]);
        int trGetC2 = trGetC(i, i2, i3, iArr[i5]);
        int trGetC3 = trGetC(i, i2, i3, iArr[i6]);
        int trGetC4 = trGetC(i, i2, i3, iArr[i7]);
        int trGetC5 = trGetC(i, i2, i3, iArr[i8]);
        if (trGetC2 > trGetC3) {
            i6 = i5;
            i5 = i6;
            trGetC3 = trGetC2;
            trGetC2 = trGetC3;
        }
        if (trGetC4 > trGetC5) {
            trGetC4 = trGetC5;
            trGetC5 = trGetC4;
        } else {
            i8 = i7;
            i7 = i8;
        }
        if (trGetC2 > trGetC4) {
            int i9 = trGetC3;
            trGetC3 = trGetC5;
            trGetC5 = i9;
            int i10 = i7;
            i7 = i6;
            i6 = i10;
        } else {
            i5 = i8;
            trGetC2 = trGetC4;
        }
        if (trGetC > trGetC3) {
            int i11 = i6;
            i6 = i4;
            i4 = i11;
            int i12 = trGetC3;
            trGetC3 = trGetC;
            trGetC = i12;
        }
        if (trGetC > trGetC2) {
            i5 = i4;
            trGetC2 = trGetC;
        } else {
            i7 = i6;
            trGetC5 = trGetC3;
        }
        return trGetC5 > trGetC2 ? i5 : i7;
    }

    private int trPivot(int i, int i2, int i3, int i4, int i5) {
        int i6 = i5 - i4;
        int i7 = i4 + (i6 / 2);
        if (i6 <= 512) {
            if (i6 <= 32) {
                return trMedian3(i, i2, i3, i4, i7, i5 - 1);
            }
            int i8 = i6 >> 2;
            int i9 = i5 - 1;
            return trMedian5(i, i2, i3, i4, i4 + i8, i7, i9 - i8, i9);
        }
        int i10 = i6 >> 3;
        int i11 = i10 << 1;
        int i12 = i5 - 1;
        return trMedian3(i, i2, i3, trMedian3(i, i2, i3, i4, i4 + i10, i4 + i11), trMedian3(i, i2, i3, i7 - i10, i7, i7 + i10), trMedian3(i, i2, i3, i12 - i11, i12 - i10, i12));
    }

    private void lsUpdateGroup(int i, int i2, int i3) {
        int[] iArr = this.SA;
        while (i2 < i3) {
            if (iArr[i2] >= 0) {
                int i4 = i2;
                do {
                    iArr[iArr[i4] + i] = i4;
                    i4++;
                    if (i4 >= i3) {
                        break;
                    }
                } while (iArr[i4] >= 0);
                iArr[i2] = i2 - i4;
                if (i3 <= i4) {
                    return;
                }
                i2 = i4;
            }
            int i5 = i2;
            do {
                iArr[i5] = ~iArr[i5];
                i5++;
            } while (iArr[i5] < 0);
            do {
                iArr[iArr[i2] + i] = i5;
                i2++;
            } while (i2 <= i5);
            i2 = i5 + 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x01be A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0134 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0104  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0128 -> B:56:0x00fc). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void lsIntroSort(int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int[] iArr = this.SA;
        StackEntry[] stackEntryArr = new StackEntry[64];
        int trLog = trLog(i5 - i4);
        int i12 = i4;
        int i13 = i5;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int i16 = i13 - i12;
            if (i16 <= 8) {
                if (1 < i16) {
                    trInsertionSort(i, i2, i3, i12, i13);
                    lsUpdateGroup(i, i12, i13);
                } else if (i16 == 1) {
                    iArr[i12] = -1;
                }
                if (i14 == 0) {
                    return;
                }
                i14--;
                StackEntry stackEntry = stackEntryArr[i14];
                i12 = stackEntry.a;
                i13 = stackEntry.b;
                trLog = stackEntry.c;
            } else {
                int i17 = trLog - 1;
                if (trLog == 0) {
                    trHeapSort(i, i2, i3, i12, i16);
                    int i18 = i13 - 1;
                    while (i12 < i18) {
                        int trGetC = trGetC(i, i2, i3, iArr[i18]);
                        i18--;
                        while (i12 <= i18 && trGetC(i, i2, i3, iArr[i18]) == trGetC) {
                            iArr[i18] = ~iArr[i18];
                            i18--;
                        }
                        i15 = trGetC;
                    }
                    lsUpdateGroup(i, i12, i13);
                    if (i14 == 0) {
                        return;
                    }
                    i14--;
                    StackEntry stackEntry2 = stackEntryArr[i14];
                    i12 = stackEntry2.a;
                    i13 = stackEntry2.b;
                    trLog = stackEntry2.c;
                } else {
                    swapElements(iArr, i12, iArr, trPivot(i, i2, i3, i12, i13));
                    int trGetC2 = trGetC(i, i2, i3, iArr[i12]);
                    int i19 = i12 + 1;
                    while (true) {
                        if (i19 >= i13) {
                            i6 = i15;
                            break;
                        }
                        i6 = trGetC(i, i2, i3, iArr[i19]);
                        if (i6 != trGetC2) {
                            break;
                        }
                        i19++;
                        i15 = i6;
                    }
                    if (i19 < i13 && i6 < trGetC2) {
                        i7 = i6;
                        i8 = i19;
                        while (true) {
                            i19++;
                            if (i19 >= i13 || (i7 = trGetC(i, i2, i3, iArr[i19])) > trGetC2) {
                                break;
                            } else if (i7 == trGetC2) {
                                swapElements(iArr, i19, iArr, i8);
                                i8++;
                            }
                        }
                    } else {
                        i7 = i6;
                        i8 = i19;
                    }
                    int i20 = i13 - 1;
                    while (i19 < i20) {
                        i7 = trGetC(i, i2, i3, iArr[i20]);
                        if (i7 != trGetC2) {
                            break;
                        }
                        i20--;
                    }
                    if (i19 >= i20 || i7 <= trGetC2) {
                        i15 = i7;
                        i9 = i20;
                        while (i19 < i20) {
                            swapElements(iArr, i19, iArr, i20);
                            while (true) {
                                i19++;
                                if (i19 >= i20) {
                                    break;
                                }
                                int trGetC3 = trGetC(i, i2, i3, iArr[i19]);
                                if (trGetC3 > trGetC2) {
                                    i15 = trGetC3;
                                    break;
                                }
                                if (trGetC3 == trGetC2) {
                                    swapElements(iArr, i19, iArr, i8);
                                    i8++;
                                }
                                i15 = trGetC3;
                            }
                            while (true) {
                                i20--;
                                if (i19 >= i20) {
                                    break;
                                }
                                i7 = trGetC(i, i2, i3, iArr[i20]);
                                if (i7 < trGetC2) {
                                    break;
                                } else if (i7 == trGetC2) {
                                    swapElements(iArr, i20, iArr, i9);
                                    i9--;
                                    i15 = i7;
                                } else {
                                    i15 = i7;
                                }
                            }
                            i15 = i7;
                            while (i19 < i20) {
                            }
                        }
                        if (i8 > i9) {
                            int i21 = i19 - 1;
                            int i22 = i8 - i12;
                            int i23 = i19 - i8;
                            if (i22 > i23) {
                                i22 = i23;
                            }
                            int i24 = i19 - i22;
                            int i25 = i12;
                            while (i22 > 0) {
                                swapElements(iArr, i25, iArr, i24);
                                i22--;
                                i25++;
                                i24++;
                            }
                            int i26 = i9 - i21;
                            int i27 = (i13 - i9) - 1;
                            if (i26 <= i27) {
                                i27 = i26;
                            }
                            int i28 = i13 - i27;
                            while (i27 > 0) {
                                swapElements(iArr, i19, iArr, i28);
                                i27--;
                                i19++;
                                i28++;
                            }
                            int i29 = i12 + i23;
                            int i30 = i13 - i26;
                            int i31 = i29 - 1;
                            for (int i32 = i12; i32 < i29; i32++) {
                                iArr[iArr[i32] + i] = i31;
                            }
                            if (i30 < i13) {
                                int i33 = i30 - 1;
                                for (int i34 = i29; i34 < i30; i34++) {
                                    iArr[iArr[i34] + i] = i33;
                                }
                            }
                            if (i30 - i29 == 1) {
                                iArr[i29] = -1;
                            }
                            if (i29 - i12 > i13 - i30) {
                                i10 = i17;
                                if (i30 < i13) {
                                    i11 = i14 + 1;
                                    stackEntryArr[i14] = new StackEntry(i12, i29, i10, 0);
                                    i12 = i30;
                                    i14 = i11;
                                    trLog = i10;
                                } else {
                                    i13 = i29;
                                    trLog = i10;
                                }
                            } else if (i12 < i29) {
                                i11 = i14 + 1;
                                i10 = i17;
                                stackEntryArr[i14] = new StackEntry(i30, i13, i10, 0);
                                i13 = i29;
                                i14 = i11;
                                trLog = i10;
                            } else {
                                i10 = i17;
                                i12 = i30;
                                trLog = i10;
                            }
                        } else if (i14 == 0) {
                            return;
                        } else {
                            i14--;
                            StackEntry stackEntry3 = stackEntryArr[i14];
                            i12 = stackEntry3.a;
                            i13 = stackEntry3.b;
                            trLog = stackEntry3.c;
                        }
                    } else {
                        i9 = i20;
                        while (true) {
                            i20--;
                            if (i19 >= i20 || (i7 = trGetC(i, i2, i3, iArr[i20])) < trGetC2) {
                                break;
                            } else if (i7 == trGetC2) {
                                swapElements(iArr, i20, iArr, i9);
                                i9--;
                            }
                        }
                        i15 = i7;
                        while (i19 < i20) {
                        }
                        if (i8 > i9) {
                        }
                    }
                }
            }
        }
    }

    private void lsSort(int i, int i2, int i3) {
        int i4;
        int[] iArr = this.SA;
        int i5 = i3 + i;
        while (true) {
            int i6 = 0;
            if ((-i2) >= iArr[0]) {
                return;
            }
            int i7 = 0;
            int i8 = 0;
            do {
                int i9 = iArr[i8];
                if (i9 < 0) {
                    i8 -= i9;
                    i7 += i9;
                    continue;
                } else {
                    if (i7 != 0) {
                        iArr[i8 + i7] = i7;
                        i4 = 0;
                    } else {
                        i4 = i7;
                    }
                    int i10 = iArr[i9 + i] + 1;
                    lsIntroSort(i, i5, i + i2, i8, i10);
                    i7 = i4;
                    i8 = i10;
                    continue;
                }
            } while (i8 < i2);
            if (i7 != 0) {
                iArr[i8 + i7] = i7;
            }
            int i11 = i5 - i;
            if (i2 < i11) {
                do {
                    int i12 = iArr[i6];
                    if (i12 < 0) {
                        i6 -= i12;
                        continue;
                    } else {
                        int i13 = iArr[i12 + i] + 1;
                        while (i6 < i13) {
                            iArr[iArr[i6] + i] = i6;
                            i6++;
                        }
                        i6 = i13;
                        continue;
                    }
                } while (i6 < i2);
                return;
            }
            i5 += i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class PartitionResult {
        final int first;
        final int last;

        PartitionResult(int i, int i2) {
            this.first = i;
            this.last = i2;
        }
    }

    private PartitionResult trPartition(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        int trGetC;
        int trGetC2;
        int trGetC3;
        int[] iArr = this.SA;
        int i9 = 0;
        int i10 = i4;
        while (i10 < i5) {
            i9 = trGetC(i, i2, i3, iArr[i10]);
            if (i9 != i6) {
                break;
            }
            i10++;
        }
        if (i10 < i5 && i9 < i6) {
            i7 = i10;
            while (true) {
                i10++;
                if (i10 >= i5 || (i9 = trGetC(i, i2, i3, iArr[i10])) > i6) {
                    break;
                } else if (i9 == i6) {
                    swapElements(iArr, i10, iArr, i7);
                    i7++;
                }
            }
        } else {
            i7 = i10;
        }
        int i11 = i5 - 1;
        while (i10 < i11) {
            i9 = trGetC(i, i2, i3, iArr[i11]);
            if (i9 != i6) {
                break;
            }
            i11--;
        }
        if (i10 < i11 && i9 > i6) {
            i8 = i11;
            while (true) {
                i11--;
                if (i10 >= i11 || (trGetC3 = trGetC(i, i2, i3, iArr[i11])) < i6) {
                    break;
                } else if (trGetC3 == i6) {
                    swapElements(iArr, i11, iArr, i8);
                    i8--;
                }
            }
        } else {
            i8 = i11;
        }
        while (i10 < i11) {
            swapElements(iArr, i10, iArr, i11);
            while (true) {
                i10++;
                if (i10 >= i11 || (trGetC2 = trGetC(i, i2, i3, iArr[i10])) > i6) {
                    break;
                } else if (trGetC2 == i6) {
                    swapElements(iArr, i10, iArr, i7);
                    i7++;
                }
            }
            while (true) {
                i11--;
                if (i10 < i11 && (trGetC = trGetC(i, i2, i3, iArr[i11])) >= i6) {
                    if (trGetC == i6) {
                        swapElements(iArr, i11, iArr, i8);
                        i8--;
                    }
                }
            }
        }
        if (i7 <= i8) {
            int i12 = i10 - 1;
            int i13 = i7 - i4;
            int i14 = i10 - i7;
            if (i13 > i14) {
                i13 = i14;
            }
            int i15 = i10 - i13;
            int i16 = i4;
            while (i13 > 0) {
                swapElements(iArr, i16, iArr, i15);
                i13--;
                i16++;
                i15++;
            }
            int i17 = i8 - i12;
            int i18 = (i5 - i8) - 1;
            if (i17 <= i18) {
                i18 = i17;
            }
            int i19 = i5 - i18;
            while (i18 > 0) {
                swapElements(iArr, i10, iArr, i19);
                i18--;
                i10++;
                i19++;
            }
            i4 += i14;
            i5 -= i17;
        }
        return new PartitionResult(i4, i5);
    }

    private void trCopy(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int[] iArr = this.SA;
        int i8 = i5 - 1;
        int i9 = i4 - 1;
        while (i3 <= i9) {
            int i10 = iArr[i3] - i7;
            if (i10 < 0) {
                i10 += i2 - i;
            }
            int i11 = i + i10;
            if (iArr[i11] == i8) {
                i9++;
                iArr[i9] = i10;
                iArr[i11] = i9;
            }
            i3++;
        }
        int i12 = i6 - 1;
        int i13 = i9 + 1;
        while (i13 < i5) {
            int i14 = iArr[i12] - i7;
            if (i14 < 0) {
                i14 += i2 - i;
            }
            int i15 = i + i14;
            if (iArr[i15] == i8) {
                i5--;
                iArr[i5] = i14;
                iArr[i15] = i5;
            }
            i12--;
        }
    }

    private void trIntroSort(int i, int i2, int i3, int i4, int i5, TRBudget tRBudget, int i6) {
        int i7;
        Bzip2DivSufSort bzip2DivSufSort;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int trLog;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int[] iArr;
        int i20;
        Bzip2DivSufSort bzip2DivSufSort2 = this;
        int i21 = i;
        int[] iArr2 = bzip2DivSufSort2.SA;
        StackEntry[] stackEntryArr = new StackEntry[64];
        int trLog2 = trLog(i5 - i4);
        int i22 = i2;
        int i23 = i4;
        int i24 = i5;
        int i25 = 0;
        int i26 = 0;
        while (true) {
            if (trLog2 >= 0) {
                i7 = i25;
                int i27 = i23;
                i8 = 0;
                int i28 = i24;
                int i29 = i28 - i27;
                if (i29 > 8) {
                    int i30 = trLog2 - 1;
                    if (trLog2 == 0) {
                        if (!tRBudget.update(i6, i29)) {
                            break;
                        }
                        trHeapSort(i, i22, i3, i27, i29);
                        int i31 = i28 - 1;
                        while (i27 < i31) {
                            int i32 = i27;
                            int trGetC = trGetC(i21, i22, i3, iArr2[i31]);
                            i31--;
                            while (i32 <= i31 && trGetC(i21, i22, i3, iArr2[i31]) == trGetC) {
                                iArr2[i31] = ~iArr2[i31];
                                i31--;
                            }
                            i26 = trGetC;
                            i27 = i32;
                        }
                        i14 = i27;
                        i24 = i28;
                        trLog2 = -3;
                        i25 = i7;
                        bzip2DivSufSort2 = this;
                    } else {
                        bzip2DivSufSort = this;
                        i14 = i27;
                        swapElements(iArr2, i14, iArr2, trPivot(i, i22, i3, i27, i28));
                        int trGetC2 = bzip2DivSufSort.trGetC(i21, i22, i3, iArr2[i14]);
                        int i33 = i14 + 1;
                        while (true) {
                            if (i33 >= i28) {
                                i15 = i26;
                                break;
                            }
                            i15 = bzip2DivSufSort.trGetC(i21, i22, i3, iArr2[i33]);
                            if (i15 != trGetC2) {
                                break;
                            }
                            i33++;
                            i26 = i15;
                        }
                        if (i33 < i28 && i15 < trGetC2) {
                            i16 = i15;
                            int i34 = 1;
                            i17 = i33;
                            while (true) {
                                i33 += i34;
                                if (i33 >= i28 || (i16 = bzip2DivSufSort.trGetC(i21, i22, i3, iArr2[i33])) > trGetC2) {
                                    break;
                                }
                                if (i16 == trGetC2) {
                                    swapElements(iArr2, i33, iArr2, i17);
                                    i17++;
                                }
                                i34 = 1;
                            }
                        } else {
                            i16 = i15;
                            i17 = i33;
                        }
                        int i35 = i28 - 1;
                        while (i33 < i35) {
                            i16 = bzip2DivSufSort.trGetC(i21, i22, i3, iArr2[i35]);
                            if (i16 != trGetC2) {
                                break;
                            }
                            i35--;
                        }
                        if (i33 >= i35 || i16 <= trGetC2) {
                            i18 = i17;
                            i26 = i16;
                            i19 = i35;
                        } else {
                            int i36 = i17;
                            int i37 = i35;
                            while (true) {
                                i35--;
                                if (i33 >= i35 || (i16 = bzip2DivSufSort.trGetC(i21, i22, i3, iArr2[i35])) < trGetC2) {
                                    break;
                                } else if (i16 == trGetC2) {
                                    swapElements(iArr2, i35, iArr2, i37);
                                    i37--;
                                }
                            }
                            i26 = i16;
                            i19 = i37;
                            i18 = i36;
                        }
                        while (i33 < i35) {
                            swapElements(iArr2, i33, iArr2, i35);
                            while (true) {
                                i33++;
                                int i38 = i35;
                                if (i33 >= i35) {
                                    break;
                                }
                                int trGetC3 = bzip2DivSufSort.trGetC(i21, i22, i3, iArr2[i33]);
                                if (trGetC3 > trGetC2) {
                                    i26 = trGetC3;
                                    i35 = i38;
                                    break;
                                }
                                if (trGetC3 == trGetC2) {
                                    swapElements(iArr2, i33, iArr2, i18);
                                    i18++;
                                }
                                i26 = trGetC3;
                                i35 = i38;
                            }
                            while (true) {
                                i35--;
                                int i39 = i33;
                                if (i33 >= i35) {
                                    break;
                                }
                                int trGetC4 = bzip2DivSufSort.trGetC(i21, i22, i3, iArr2[i35]);
                                if (trGetC4 < trGetC2) {
                                    i26 = trGetC4;
                                    i33 = i39;
                                    break;
                                }
                                if (trGetC4 == trGetC2) {
                                    swapElements(iArr2, i35, iArr2, i19);
                                    i19--;
                                }
                                i26 = trGetC4;
                                i33 = i39;
                            }
                        }
                        if (i18 <= i19) {
                            int i40 = i33 - 1;
                            int i41 = i18 - i14;
                            int i42 = i33 - i18;
                            if (i41 > i42) {
                                i41 = i42;
                            }
                            int i43 = i33;
                            int i44 = i33 - i41;
                            int i45 = i41;
                            int i46 = i14;
                            while (i45 > 0) {
                                swapElements(iArr2, i46, iArr2, i44);
                                i45--;
                                i46++;
                                i44++;
                            }
                            int i47 = i19 - i40;
                            int i48 = (i28 - i19) - 1;
                            if (i47 <= i48) {
                                i48 = i47;
                            }
                            int i49 = i48;
                            int i50 = i28 - i48;
                            int i51 = i43;
                            while (i49 > 0) {
                                swapElements(iArr2, i51, iArr2, i50);
                                i49--;
                                i51++;
                                i50++;
                            }
                            i24 = i14 + i42;
                            int i52 = i28 - i47;
                            trLog2 = iArr2[iArr2[i24] + i21] != trGetC2 ? trLog(i52 - i24) : -1;
                            int i53 = i24 - 1;
                            for (int i54 = i14; i54 < i24; i54++) {
                                iArr2[iArr2[i54] + i21] = i53;
                            }
                            if (i52 < i28) {
                                int i55 = i52 - 1;
                                for (int i56 = i24; i56 < i52; i56++) {
                                    iArr2[iArr2[i56] + i21] = i55;
                                }
                            }
                            int i57 = i24 - i14;
                            int i58 = i28 - i52;
                            if (i57 <= i58) {
                                int i59 = i52 - i24;
                                if (i58 <= i59) {
                                    iArr = iArr2;
                                    if (1 < i57) {
                                        int i60 = i7 + 1;
                                        stackEntryArr[i7] = new StackEntry(i22 + 1, i24, i52, trLog2);
                                        i20 = i30;
                                        stackEntryArr[i60] = new StackEntry(i22, i52, i28, i20);
                                        i25 = i60 + 1;
                                    } else {
                                        i20 = i30;
                                        if (1 < i58) {
                                            i25 = i7 + 1;
                                            stackEntryArr[i7] = new StackEntry(i22 + 1, i24, i52, trLog2);
                                            i24 = i28;
                                            bzip2DivSufSort2 = bzip2DivSufSort;
                                            trLog2 = i20;
                                            iArr2 = iArr;
                                            i23 = i52;
                                        } else if (1 < i59) {
                                            i22++;
                                            i23 = i24;
                                            bzip2DivSufSort2 = bzip2DivSufSort;
                                            i25 = i7;
                                            iArr2 = iArr;
                                            i24 = i52;
                                        } else if (i7 == 0) {
                                            return;
                                        } else {
                                            i25 = i7 - 1;
                                            StackEntry stackEntry = stackEntryArr[i25];
                                            i22 = stackEntry.a;
                                            i23 = stackEntry.b;
                                            i24 = stackEntry.c;
                                            trLog2 = stackEntry.d;
                                            bzip2DivSufSort2 = bzip2DivSufSort;
                                            iArr2 = iArr;
                                        }
                                    }
                                } else {
                                    iArr = iArr2;
                                    i20 = i30;
                                    if (i57 <= i59) {
                                        if (1 < i57) {
                                            int i61 = i7 + 1;
                                            stackEntryArr[i7] = new StackEntry(i22, i52, i28, i20);
                                            stackEntryArr[i61] = new StackEntry(i22 + 1, i24, i52, trLog2);
                                            i23 = i14;
                                            i25 = i61 + 1;
                                            bzip2DivSufSort2 = bzip2DivSufSort;
                                            trLog2 = i20;
                                            iArr2 = iArr;
                                        } else if (1 < i59) {
                                            i25 = i7 + 1;
                                            stackEntryArr[i7] = new StackEntry(i22, i52, i28, i20);
                                            i22++;
                                        } else {
                                            i24 = i28;
                                            bzip2DivSufSort2 = bzip2DivSufSort;
                                            trLog2 = i20;
                                            i25 = i7;
                                            iArr2 = iArr;
                                            i23 = i52;
                                        }
                                    } else if (1 < i59) {
                                        int i62 = i7 + 1;
                                        stackEntryArr[i7] = new StackEntry(i22, i52, i28, i20);
                                        stackEntryArr[i62] = new StackEntry(i22, i14, i24, i20);
                                        i22++;
                                        i25 = i62 + 1;
                                    } else {
                                        i25 = i7 + 1;
                                        stackEntryArr[i7] = new StackEntry(i22, i52, i28, i20);
                                    }
                                    i23 = i24;
                                    bzip2DivSufSort2 = bzip2DivSufSort;
                                    iArr2 = iArr;
                                    i24 = i52;
                                }
                                i23 = i14;
                                bzip2DivSufSort2 = bzip2DivSufSort;
                                trLog2 = i20;
                                iArr2 = iArr;
                            } else {
                                iArr = iArr2;
                                i20 = i30;
                                int i63 = i52 - i24;
                                if (i57 <= i63) {
                                    if (1 < i58) {
                                        int i64 = i7 + 1;
                                        stackEntryArr[i7] = new StackEntry(i22 + 1, i24, i52, trLog2);
                                        stackEntryArr[i64] = new StackEntry(i22, i14, i24, i20);
                                        i21 = i;
                                        i25 = i64 + 1;
                                    } else if (1 < i57) {
                                        i25 = i7 + 1;
                                        stackEntryArr[i7] = new StackEntry(i22 + 1, i24, i52, trLog2);
                                        i21 = i;
                                        i23 = i14;
                                        bzip2DivSufSort2 = bzip2DivSufSort;
                                        trLog2 = i20;
                                        iArr2 = iArr;
                                    } else if (1 < i63) {
                                        i22++;
                                        i21 = i;
                                        i23 = i24;
                                        bzip2DivSufSort2 = bzip2DivSufSort;
                                        i25 = i7;
                                        iArr2 = iArr;
                                        i24 = i52;
                                    } else {
                                        i25 = i7 + 1;
                                        stackEntryArr[i7] = new StackEntry(i22, i14, i28, i20);
                                        i21 = i;
                                        i24 = i28;
                                        bzip2DivSufSort2 = bzip2DivSufSort;
                                        trLog2 = i20;
                                    }
                                } else if (i58 <= i63) {
                                    if (1 < i58) {
                                        int i65 = i7 + 1;
                                        stackEntryArr[i7] = new StackEntry(i22, i14, i24, i20);
                                        stackEntryArr[i65] = new StackEntry(i22 + 1, i24, i52, trLog2);
                                        i21 = i;
                                        i25 = i65 + 1;
                                    } else if (1 < i63) {
                                        i25 = i7 + 1;
                                        stackEntryArr[i7] = new StackEntry(i22, i14, i24, i20);
                                        i22++;
                                        i21 = i;
                                        i23 = i24;
                                        bzip2DivSufSort2 = bzip2DivSufSort;
                                        iArr2 = iArr;
                                        i24 = i52;
                                    } else {
                                        i21 = i;
                                        i23 = i14;
                                        bzip2DivSufSort2 = bzip2DivSufSort;
                                        trLog2 = i20;
                                        i25 = i7;
                                        iArr2 = iArr;
                                    }
                                } else if (1 < i63) {
                                    int i66 = i7 + 1;
                                    stackEntryArr[i7] = new StackEntry(i22, i14, i24, i20);
                                    stackEntryArr[i66] = new StackEntry(i22, i52, i28, i20);
                                    i22++;
                                    i21 = i;
                                    i25 = i66 + 1;
                                    i23 = i24;
                                    bzip2DivSufSort2 = bzip2DivSufSort;
                                    iArr2 = iArr;
                                    i24 = i52;
                                } else {
                                    i25 = i7 + 1;
                                    stackEntryArr[i7] = new StackEntry(i22, i14, i24, i20);
                                    i21 = i;
                                }
                                i24 = i28;
                                bzip2DivSufSort2 = bzip2DivSufSort;
                                trLog2 = i20;
                                iArr2 = iArr;
                                i23 = i52;
                            }
                        } else {
                            iArr = iArr2;
                            if (!tRBudget.update(i6, i29)) {
                                break;
                            }
                            trLog2 = i30 + 1;
                            i22++;
                            i21 = i;
                            i24 = i28;
                            bzip2DivSufSort2 = bzip2DivSufSort;
                            i25 = i7;
                        }
                        iArr2 = iArr;
                    }
                    i23 = i14;
                } else if (!tRBudget.update(i6, i29)) {
                    break;
                } else {
                    i24 = i28;
                    trInsertionSort(i, i22, i3, i27, i24);
                    trLog2 = -3;
                    i23 = i27;
                    i25 = i7;
                    bzip2DivSufSort2 = this;
                }
            } else if (trLog2 != -1) {
                int i67 = i25;
                int i68 = i23;
                int i69 = i24;
                if (trLog2 == -2) {
                    int i70 = i67 - 1;
                    trCopy(i, i3, i68, stackEntryArr[i70].b, stackEntryArr[i70].c, i69, i22 - i21);
                    if (i70 == 0) {
                        return;
                    }
                    i25 = i70 - 1;
                    StackEntry stackEntry2 = stackEntryArr[i25];
                    i22 = stackEntry2.a;
                    i23 = stackEntry2.b;
                    i24 = stackEntry2.c;
                    trLog2 = stackEntry2.d;
                } else {
                    if (iArr2[i68] >= 0) {
                        do {
                            iArr2[iArr2[i68] + i21] = i68;
                            i68++;
                            if (i68 >= i69) {
                                break;
                            }
                        } while (iArr2[i68] >= 0);
                    }
                    if (i68 < i69) {
                        int i71 = i68;
                        do {
                            iArr2[i71] = ~iArr2[i71];
                            i71++;
                            i13 = iArr2[i71];
                        } while (i13 < 0);
                        int trLog3 = iArr2[i21 + i13] != iArr2[i13 + i22] ? trLog((i71 - i68) + 1) : -1;
                        i24 = i71 + 1;
                        if (i24 < i69) {
                            int i72 = i24 - 1;
                            for (int i73 = i68; i73 < i24; i73++) {
                                iArr2[iArr2[i73] + i21] = i72;
                            }
                        }
                        int i74 = i69 - i24;
                        if (i24 - i68 <= i74) {
                            i25 = i67 + 1;
                            stackEntryArr[i67] = new StackEntry(i22, i24, i69, -3);
                            i22++;
                            bzip2DivSufSort2 = this;
                            trLog2 = trLog3;
                            i23 = i68;
                        } else if (1 < i74) {
                            i25 = i67 + 1;
                            stackEntryArr[i67] = new StackEntry(i22 + 1, i68, i24, trLog3);
                            bzip2DivSufSort2 = this;
                            trLog2 = -3;
                            i23 = i24;
                            i24 = i69;
                        } else {
                            i22++;
                            bzip2DivSufSort2 = this;
                            trLog2 = trLog3;
                            i23 = i68;
                            i25 = i67;
                        }
                    } else if (i67 == 0) {
                        return;
                    } else {
                        i25 = i67 - 1;
                        StackEntry stackEntry3 = stackEntryArr[i25];
                        i22 = stackEntry3.a;
                        i23 = stackEntry3.b;
                        i24 = stackEntry3.c;
                        trLog2 = stackEntry3.d;
                    }
                }
                bzip2DivSufSort2 = this;
            } else if (!tRBudget.update(i6, i24 - i23)) {
                i7 = i25;
                bzip2DivSufSort = bzip2DivSufSort2;
                i8 = 0;
                break;
            } else {
                int i75 = i22 - 1;
                int i76 = i25;
                int i77 = i24;
                int i78 = i23;
                PartitionResult trPartition = trPartition(i, i75, i3, i23, i24, i24 - 1);
                int i79 = trPartition.first;
                int i80 = trPartition.last;
                if (i78 < i79 || i80 < i77) {
                    if (i79 < i77) {
                        int i81 = i79 - 1;
                        for (int i82 = i78; i82 < i79; i82++) {
                            iArr2[iArr2[i82] + i21] = i81;
                        }
                    }
                    if (i80 < i77) {
                        int i83 = i80 - 1;
                        for (int i84 = i79; i84 < i80; i84++) {
                            iArr2[iArr2[i84] + i21] = i83;
                        }
                    }
                    int i85 = i76 + 1;
                    stackEntryArr[i76] = new StackEntry(0, i79, i80, 0);
                    int i86 = i85 + 1;
                    stackEntryArr[i85] = new StackEntry(i75, i78, i77, -2);
                    int i87 = i79 - i78;
                    int i88 = i77 - i80;
                    if (i87 <= i88) {
                        if (1 < i87) {
                            stackEntryArr[i86] = new StackEntry(i22, i80, i77, trLog(i88));
                            trLog2 = trLog(i87);
                            i25 = i86 + 1;
                            i23 = i78;
                        } else if (1 < i88) {
                            trLog = trLog(i88);
                            i25 = i86;
                            i23 = i80;
                            trLog2 = trLog;
                            i79 = i77;
                        } else if (i86 == 0) {
                            return;
                        } else {
                            i9 = i86 - 1;
                            StackEntry stackEntry4 = stackEntryArr[i9];
                            i10 = stackEntry4.a;
                            i11 = stackEntry4.b;
                            i12 = stackEntry4.c;
                            trLog2 = stackEntry4.d;
                            i22 = i10;
                            i23 = i11;
                            i79 = i12;
                            i25 = i9;
                        }
                    } else if (1 < i88) {
                        stackEntryArr[i86] = new StackEntry(i22, i78, i79, trLog(i87));
                        trLog = trLog(i88);
                        i25 = i86 + 1;
                        i23 = i80;
                        trLog2 = trLog;
                        i79 = i77;
                    } else if (1 < i87) {
                        trLog2 = trLog(i87);
                        i25 = i86;
                        i23 = i78;
                    } else if (i86 == 0) {
                        return;
                    } else {
                        i9 = i86 - 1;
                        StackEntry stackEntry5 = stackEntryArr[i9];
                        i10 = stackEntry5.a;
                        i11 = stackEntry5.b;
                        i12 = stackEntry5.c;
                        trLog2 = stackEntry5.d;
                        i22 = i10;
                        i23 = i11;
                        i79 = i12;
                        i25 = i9;
                    }
                } else {
                    while (i78 < i77) {
                        iArr2[iArr2[i78] + i21] = i78;
                        i78++;
                    }
                    if (i76 == 0) {
                        return;
                    }
                    i25 = i76 - 1;
                    StackEntry stackEntry6 = stackEntryArr[i25];
                    int i89 = stackEntry6.a;
                    int i90 = stackEntry6.b;
                    int i91 = stackEntry6.c;
                    trLog2 = stackEntry6.d;
                    i22 = i89;
                    i23 = i90;
                    i79 = i91;
                }
                bzip2DivSufSort2 = this;
                i24 = i79;
            }
        }
        bzip2DivSufSort = this;
        for (int i92 = i8; i92 < i7; i92++) {
            if (stackEntryArr[i92].d == -3) {
                bzip2DivSufSort.lsUpdateGroup(i, stackEntryArr[i92].b, stackEntryArr[i92].c);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class TRBudget {
        int budget;
        int chance;

        TRBudget(int i, int i2) {
            this.budget = i;
            this.chance = i2;
        }

        boolean update(int i, int i2) {
            int i3 = this.budget - i2;
            this.budget = i3;
            if (i3 <= 0) {
                int i4 = this.chance - 1;
                this.chance = i4;
                if (i4 == 0) {
                    return false;
                }
                this.budget = i3 + i;
            }
            return true;
        }
    }

    private void trSort(int i, int i2, int i3) {
        int[] iArr = this.SA;
        if ((-i2) < iArr[0]) {
            TRBudget tRBudget = new TRBudget(i2, ((trLog(i2) * 2) / 3) + 1);
            int i4 = 0;
            do {
                int i5 = iArr[i4];
                if (i5 < 0) {
                    i4 -= i5;
                    continue;
                } else {
                    int i6 = iArr[i + i5] + 1;
                    if (1 < i6 - i4) {
                        trIntroSort(i, i + i3, i + i2, i4, i6, tRBudget, i2);
                        if (tRBudget.chance == 0) {
                            if (i4 > 0) {
                                iArr[0] = -i4;
                            }
                            lsSort(i, i2, i3);
                            return;
                        }
                    }
                    i4 = i6;
                    continue;
                }
            } while (i4 < i2);
        }
    }

    private int sortTypeBstar(int[] iArr, int[] iArr2) {
        boolean z;
        int i;
        boolean z2;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr3;
        int i6;
        int i7;
        byte b;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        byte[] bArr = this.T;
        int[] iArr4 = this.SA;
        int i15 = this.n;
        int[] iArr5 = new int[256];
        int i16 = 1;
        while (true) {
            z = false;
            i = 255;
            if (i16 >= i15) {
                break;
            }
            byte b2 = bArr[i16 - 1];
            byte b3 = bArr[i16];
            if (b2 == b3) {
                i16++;
            } else if ((b2 & 255) > (b3 & 255)) {
                z2 = false;
            }
        }
        z2 = true;
        int i17 = i15 - 1;
        byte b4 = bArr[i17];
        int i18 = b4 & 255;
        byte b5 = bArr[0];
        int i19 = b5 & 255;
        if (i18 < i19 || (b4 == b5 && z2)) {
            if (!z2) {
                int BUCKET_BSTAR = BUCKET_BSTAR(i18, i19);
                iArr2[BUCKET_BSTAR] = iArr2[BUCKET_BSTAR] + 1;
                i2 = i15 - 1;
                iArr4[i2] = i17;
            } else {
                int BUCKET_B = BUCKET_B(i18, i19);
                iArr2[BUCKET_B] = iArr2[BUCKET_B] + 1;
                i2 = i15;
            }
            i3 = i17 - 1;
            while (i3 >= 0) {
                int i20 = bArr[i3] & 255;
                int i21 = bArr[i3 + 1] & 255;
                if (i20 <= i21) {
                    int BUCKET_B2 = BUCKET_B(i20, i21);
                    iArr2[BUCKET_B2] = iArr2[BUCKET_B2] + 1;
                    i3--;
                }
            }
        } else {
            i2 = i15;
            i3 = i17;
        }
        while (i3 >= 0) {
            do {
                int i22 = bArr[i3] & 255;
                iArr[i22] = iArr[i22] + 1;
                i3--;
                if (i3 < 0) {
                    break;
                }
            } while ((bArr[i3] & 255) >= (bArr[i3 + 1] & 255));
            if (i3 >= 0) {
                int BUCKET_BSTAR2 = BUCKET_BSTAR(bArr[i3] & 255, bArr[i3 + 1] & 255);
                iArr2[BUCKET_BSTAR2] = iArr2[BUCKET_BSTAR2] + 1;
                i2--;
                iArr4[i2] = i3;
                while (true) {
                    i3--;
                    if (i3 >= 0 && (i13 = bArr[i3] & 255) <= (i14 = bArr[i3 + 1] & 255)) {
                        int BUCKET_B3 = BUCKET_B(i13, i14);
                        iArr2[BUCKET_B3] = iArr2[BUCKET_B3] + 1;
                    }
                }
            }
        }
        int i23 = i15 - i2;
        if (i23 == 0) {
            for (int i24 = 0; i24 < i15; i24++) {
                iArr4[i24] = i24;
            }
            return 0;
        }
        int i25 = 0;
        int i26 = 0;
        int i27 = -1;
        while (i25 < 256) {
            int i28 = iArr[i25] + i27;
            iArr[i25] = i27 + i26;
            int i29 = i28 + iArr2[BUCKET_B(i25, i25)];
            int i30 = i25 + 1;
            for (int i31 = i30; i31 < 256; i31++) {
                i26 += iArr2[BUCKET_BSTAR(i25, i31)];
                iArr2[(i25 << 8) | i31] = i26;
                i29 += iArr2[BUCKET_B(i25, i31)];
            }
            i25 = i30;
            i27 = i29;
        }
        int i32 = i15 - i23;
        for (int i33 = i23 - 2; i33 >= 0; i33--) {
            int i34 = iArr4[i32 + i33];
            int BUCKET_BSTAR3 = BUCKET_BSTAR(bArr[i34] & 255, bArr[i34 + 1] & 255);
            int i35 = iArr2[BUCKET_BSTAR3] - 1;
            iArr2[BUCKET_BSTAR3] = i35;
            iArr4[i35] = i33;
        }
        int i36 = iArr4[(i32 + i23) - 1];
        int BUCKET_BSTAR4 = BUCKET_BSTAR(bArr[i36] & 255, bArr[i36 + 1] & 255);
        int i37 = iArr2[BUCKET_BSTAR4] - 1;
        iArr2[BUCKET_BSTAR4] = i37;
        int i38 = i23 - 1;
        iArr4[i37] = i38;
        int i39 = i15 - (i23 * 2);
        if (i39 <= 256) {
            i4 = 256;
            iArr3 = iArr5;
            i5 = 0;
        } else {
            i4 = i39;
            i5 = i23;
            iArr3 = iArr4;
        }
        int i40 = i23;
        int i41 = 255;
        while (i40 > 0) {
            int i42 = i40;
            int i43 = i;
            while (i41 < i43) {
                int i44 = iArr2[BUCKET_BSTAR(i41, i43)];
                if (1 < i42 - i44) {
                    boolean z3 = iArr4[i44] == i38 ? true : z;
                    i9 = i43;
                    i10 = i41;
                    i11 = i38;
                    i12 = i23;
                    subStringSort(i32, i44, i42, iArr3, i5, i4, 2, z3, i15);
                } else {
                    i9 = i43;
                    i10 = i41;
                    i11 = i38;
                    i12 = i23;
                }
                i43 = i9 - 1;
                i23 = i12;
                i42 = i44;
                i41 = i10;
                i38 = i11;
                z = false;
            }
            i41--;
            i40 = i42;
            i = 255;
            z = false;
        }
        int i45 = i38;
        int i46 = i23;
        while (i38 >= 0) {
            if (iArr4[i38] >= 0) {
                int i47 = i38;
                do {
                    iArr4[i46 + iArr4[i47]] = i47;
                    i47--;
                    if (i47 < 0) {
                        break;
                    }
                } while (iArr4[i47] >= 0);
                iArr4[i47 + 1] = i47 - i38;
                if (i47 <= 0) {
                    break;
                }
                i38 = i47;
            }
            int i48 = i38;
            do {
                int i49 = ~iArr4[i48];
                iArr4[i48] = i49;
                iArr4[i46 + i49] = i38;
                i48--;
                i8 = iArr4[i48];
            } while (i8 < 0);
            iArr4[i46 + i8] = i38;
            i38 = i48 - 1;
        }
        trSort(i46, i46, 1);
        byte b6 = bArr[i17];
        int i50 = b6 & 255;
        byte b7 = bArr[0];
        if (i50 < (b7 & 255) || (b6 == b7 && z2)) {
            if (z2) {
                i6 = i46;
            } else {
                i6 = i46 - 1;
                iArr4[iArr4[i46 + i6]] = i17;
            }
            i7 = i17 - 1;
            while (i7 >= 0) {
                b = 255;
                if ((bArr[i7] & 255) <= (bArr[i7 + 1] & 255)) {
                    i7--;
                }
                break;
            }
        } else {
            i6 = i46;
            i7 = i17;
        }
        b = 255;
        break;
        while (i7 >= 0) {
            do {
                i7--;
                if (i7 < 0) {
                    break;
                }
            } while ((bArr[i7] & b) >= (bArr[i7 + 1] & b));
            if (i7 >= 0) {
                i6--;
                iArr4[iArr4[i46 + i6]] = i7;
                do {
                    i7--;
                    if (i7 >= 0) {
                    }
                } while ((bArr[i7] & b) <= (bArr[i7 + 1] & b));
            }
        }
        int i51 = i45;
        for (int i52 = b; i52 >= 0; i52--) {
            for (int i53 = b; i52 < i53; i53--) {
                int i54 = i17 - iArr2[BUCKET_B(i52, i53)];
                iArr2[BUCKET_B(i52, i53)] = i17 + 1;
                int i55 = iArr2[BUCKET_BSTAR(i52, i53)];
                i17 = i54;
                while (i55 <= i51) {
                    iArr4[i17] = iArr4[i51];
                    i17--;
                    i51--;
                }
            }
            int i56 = i17 - iArr2[BUCKET_B(i52, i52)];
            iArr2[BUCKET_B(i52, i52)] = i17 + 1;
            if (i52 < b) {
                iArr2[BUCKET_BSTAR(i52, i52 + 1)] = i56 + 1;
            }
            i17 = iArr[i52];
        }
        return i46;
    }

    private int constructBWT(int[] iArr, int[] iArr2) {
        byte[] bArr = this.T;
        int[] iArr3 = this.SA;
        int i = this.n;
        int i2 = 254;
        int i3 = 0;
        int i4 = 0;
        while (i2 >= 0) {
            int i5 = i2 + 1;
            int i6 = iArr2[BUCKET_BSTAR(i2, i5)];
            int i7 = -1;
            int i8 = 0;
            for (int i9 = iArr[i5]; i6 <= i9; i9--) {
                int i10 = iArr3[i9];
                if (i10 >= 0) {
                    int i11 = i10 - 1;
                    if (i11 < 0) {
                        i11 = i - 1;
                    }
                    int i12 = bArr[i11] & 255;
                    if (i12 <= i2) {
                        iArr3[i9] = ~i10;
                        if (i11 > 0 && (bArr[i11 - 1] & 255) > i12) {
                            i11 = ~i11;
                        }
                        if (i7 == i12) {
                            i8--;
                            iArr3[i8] = i11;
                        } else {
                            if (i7 >= 0) {
                                iArr2[BUCKET_B(i7, i2)] = i8;
                            }
                            i8 = iArr2[BUCKET_B(i12, i2)] - 1;
                            iArr3[i8] = i11;
                            i7 = i12;
                        }
                    }
                } else {
                    iArr3[i9] = ~i10;
                }
            }
            i2--;
            i3 = i8;
            i4 = i7;
        }
        int i13 = -1;
        for (int i14 = 0; i14 < i; i14++) {
            int i15 = iArr3[i14];
            if (i15 >= 0) {
                int i16 = i15 - 1;
                if (i16 < 0) {
                    i16 = i - 1;
                }
                int i17 = bArr[i16] & 255;
                if (i17 >= (bArr[i16 + 1] & 255)) {
                    if (i16 > 0 && (bArr[i16 - 1] & 255) < i17) {
                        i16 = ~i16;
                    }
                    if (i17 == i4) {
                        i3++;
                        iArr3[i3] = i16;
                    } else {
                        if (i4 != -1) {
                            iArr[i4] = i3;
                        }
                        i3 = iArr[i17] + 1;
                        iArr3[i3] = i16;
                        i4 = i17;
                    }
                }
            } else {
                i15 = ~i15;
            }
            if (i15 == 0) {
                iArr3[i14] = bArr[i - 1];
                i13 = i14;
            } else {
                iArr3[i14] = bArr[i15 - 1];
            }
        }
        return i13;
    }

    public int bwt() {
        int[] iArr = this.SA;
        byte[] bArr = this.T;
        int i = this.n;
        int[] iArr2 = new int[256];
        int[] iArr3 = new int[65536];
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            iArr[0] = bArr[0];
            return 0;
        } else if (sortTypeBstar(iArr2, iArr3) > 0) {
            return constructBWT(iArr2, iArr3);
        } else {
            return 0;
        }
    }
}
