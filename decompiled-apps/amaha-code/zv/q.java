package zv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.RandomAccess;
/* compiled from: Options.kt */
/* loaded from: classes2.dex */
public final class q extends is.c<i> implements RandomAccess {

    /* renamed from: u  reason: collision with root package name */
    public final i[] f39907u;

    /* renamed from: v  reason: collision with root package name */
    public final int[] f39908v;

    /* compiled from: Options.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static void a(long j10, e eVar, int i6, ArrayList arrayList, int i10, int i11, ArrayList arrayList2) {
            boolean z10;
            int i12;
            int i13;
            int i14;
            boolean z11;
            int i15;
            long j11;
            e eVar2;
            long j12;
            boolean z12;
            int i16 = i6;
            if (i10 < i11) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (i10 < i11) {
                    int i17 = i10;
                    while (true) {
                        int i18 = i17 + 1;
                        if (((i) arrayList.get(i17)).h() >= i16) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            if (i18 >= i11) {
                                break;
                            }
                            i17 = i18;
                        } else {
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                    }
                }
                i iVar = (i) arrayList.get(i10);
                i iVar2 = (i) arrayList.get(i11 - 1);
                if (i16 == iVar.h()) {
                    int intValue = ((Number) arrayList2.get(i10)).intValue();
                    int i19 = i10 + 1;
                    i iVar3 = (i) arrayList.get(i19);
                    i12 = i19;
                    i13 = intValue;
                    iVar = iVar3;
                } else {
                    i12 = i10;
                    i13 = -1;
                }
                if (iVar.k(i16) != iVar2.k(i16)) {
                    int i20 = i12 + 1;
                    int i21 = 1;
                    if (i20 < i11) {
                        while (true) {
                            int i22 = i20 + 1;
                            if (((i) arrayList.get(i20 - 1)).k(i16) != ((i) arrayList.get(i20)).k(i16)) {
                                i21++;
                            }
                            if (i22 >= i11) {
                                break;
                            }
                            i20 = i22;
                        }
                    }
                    long j13 = 4;
                    long j14 = (i21 * 2) + (eVar.f39885v / j13) + j10 + 2;
                    eVar.O0(i21);
                    eVar.O0(i13);
                    if (i12 < i11) {
                        int i23 = i12;
                        while (true) {
                            int i24 = i23 + 1;
                            int k10 = ((i) arrayList.get(i23)).k(i16);
                            if (i23 == i12 || k10 != ((i) arrayList.get(i23 - 1)).k(i16)) {
                                eVar.O0(k10 & 255);
                            }
                            if (i24 >= i11) {
                                break;
                            }
                            i23 = i24;
                        }
                    }
                    e eVar3 = new e();
                    while (i12 < i11) {
                        byte k11 = ((i) arrayList.get(i12)).k(i16);
                        int i25 = i12 + 1;
                        if (i25 < i11) {
                            int i26 = i25;
                            while (true) {
                                int i27 = i26 + 1;
                                if (k11 != ((i) arrayList.get(i26)).k(i16)) {
                                    i15 = i26;
                                    break;
                                } else if (i27 >= i11) {
                                    break;
                                } else {
                                    i26 = i27;
                                }
                            }
                        }
                        i15 = i11;
                        if (i25 == i15 && i16 + 1 == ((i) arrayList.get(i12)).h()) {
                            eVar.O0(((Number) arrayList2.get(i12)).intValue());
                            j11 = j14;
                            eVar2 = eVar3;
                            j12 = j13;
                        } else {
                            eVar.O0(((int) ((eVar3.f39885v / j13) + j14)) * (-1));
                            j11 = j14;
                            eVar2 = eVar3;
                            j12 = j13;
                            a(j14, eVar3, i16 + 1, arrayList, i12, i15, arrayList2);
                        }
                        i12 = i15;
                        eVar3 = eVar2;
                        j13 = j12;
                        j14 = j11;
                    }
                    eVar.K0(eVar3);
                    return;
                }
                int min = Math.min(iVar.h(), iVar2.h());
                if (i16 < min) {
                    int i28 = i16;
                    i14 = 0;
                    while (true) {
                        int i29 = i28 + 1;
                        if (iVar.k(i28) != iVar2.k(i28)) {
                            break;
                        }
                        i14++;
                        if (i29 >= min) {
                            break;
                        }
                        i28 = i29;
                    }
                } else {
                    i14 = 0;
                }
                long j15 = 4;
                long j16 = (eVar.f39885v / j15) + j10 + 2 + i14 + 1;
                eVar.O0(-i14);
                eVar.O0(i13);
                int i30 = i16 + i14;
                if (i16 < i30) {
                    while (true) {
                        int i31 = i16 + 1;
                        eVar.O0(iVar.k(i16) & 255);
                        if (i31 >= i30) {
                            break;
                        }
                        i16 = i31;
                    }
                }
                if (i12 + 1 == i11) {
                    if (i30 == ((i) arrayList.get(i12)).h()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        eVar.O0(((Number) arrayList2.get(i12)).intValue());
                        return;
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
                e eVar4 = new e();
                eVar.O0(((int) ((eVar4.f39885v / j15) + j16)) * (-1));
                a(j16, eVar4, i30, arrayList, i12, i11, arrayList2);
                eVar.K0(eVar4);
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* JADX WARN: Code restructure failed: missing block: B:86:0x0140, code lost:
            continue;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static q b(i... iVarArr) {
            boolean z10;
            boolean z11;
            boolean z12;
            int i6;
            int i10 = 0;
            if (iVarArr.length == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return new q(new i[0], new int[]{0, -1});
            }
            ArrayList arrayList = new ArrayList(new is.f(iVarArr, false));
            if (arrayList.size() > 1) {
                Collections.sort(arrayList);
            }
            ArrayList arrayList2 = new ArrayList(iVarArr.length);
            for (i iVar : iVarArr) {
                arrayList2.add(-1);
            }
            Object[] array = arrayList2.toArray(new Integer[0]);
            if (array != null) {
                Integer[] numArr = (Integer[]) array;
                ArrayList Y0 = ca.a.Y0(Arrays.copyOf(numArr, numArr.length));
                int length = iVarArr.length;
                int i11 = 0;
                int i12 = 0;
                while (i11 < length) {
                    i iVar2 = iVarArr[i11];
                    int i13 = i12 + 1;
                    int size = arrayList.size();
                    int size2 = arrayList.size();
                    if (size >= 0) {
                        if (size <= size2) {
                            int i14 = size - 1;
                            int i15 = 0;
                            while (true) {
                                if (i15 <= i14) {
                                    i6 = (i15 + i14) >>> 1;
                                    int g5 = sp.b.g((Comparable) arrayList.get(i6), iVar2);
                                    if (g5 < 0) {
                                        i15 = i6 + 1;
                                    } else if (g5 > 0) {
                                        i14 = i6 - 1;
                                    }
                                } else {
                                    i6 = -(i15 + 1);
                                    break;
                                }
                            }
                            Y0.set(i6, Integer.valueOf(i12));
                            i11++;
                            i12 = i13;
                        } else {
                            throw new IndexOutOfBoundsException("toIndex (" + size + ") is greater than size (" + size2 + ").");
                        }
                    } else {
                        throw new IllegalArgumentException(defpackage.c.q("fromIndex (0) is greater than toIndex (", size, ")."));
                    }
                }
                if (((i) arrayList.get(0)).h() > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    int i16 = 0;
                    while (i16 < arrayList.size()) {
                        i prefix = (i) arrayList.get(i16);
                        int i17 = i16 + 1;
                        int i18 = i17;
                        while (i18 < arrayList.size()) {
                            i iVar3 = (i) arrayList.get(i18);
                            iVar3.getClass();
                            kotlin.jvm.internal.i.g(prefix, "prefix");
                            if (!iVar3.p(prefix, prefix.h())) {
                                break;
                            }
                            if (iVar3.h() != prefix.h()) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                if (((Number) Y0.get(i18)).intValue() > ((Number) Y0.get(i16)).intValue()) {
                                    arrayList.remove(i18);
                                    Y0.remove(i18);
                                } else {
                                    i18++;
                                }
                            } else {
                                throw new IllegalArgumentException(kotlin.jvm.internal.i.n(iVar3, "duplicate option: ").toString());
                            }
                        }
                        i16 = i17;
                    }
                    e eVar = new e();
                    a(0L, eVar, 0, arrayList, 0, arrayList.size(), Y0);
                    int[] iArr = new int[(int) (eVar.f39885v / 4)];
                    while (!eVar.B()) {
                        iArr[i10] = eVar.readInt();
                        i10++;
                    }
                    Object[] copyOf = Arrays.copyOf(iVarArr, iVarArr.length);
                    kotlin.jvm.internal.i.f(copyOf, "java.util.Arrays.copyOf(this, size)");
                    return new q((i[]) copyOf, iArr);
                }
                throw new IllegalArgumentException("the empty byte string is not a supported option".toString());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    public q(i[] iVarArr, int[] iArr) {
        this.f39907u = iVarArr;
        this.f39908v = iArr;
    }

    @Override // is.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        return super.contains((i) obj);
    }

    @Override // is.a
    public final int g() {
        return this.f39907u.length;
    }

    @Override // is.c, java.util.List
    public final Object get(int i6) {
        return this.f39907u[i6];
    }

    @Override // is.c, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof i)) {
            return -1;
        }
        return super.indexOf((i) obj);
    }

    @Override // is.c, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof i)) {
            return -1;
        }
        return super.lastIndexOf((i) obj);
    }
}
