package eg;
/* compiled from: GenericGFPoly.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final a f13968a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f13969b;

    public b(a aVar, int[] iArr) {
        if (iArr.length != 0) {
            this.f13968a = aVar;
            int length = iArr.length;
            if (length > 1 && iArr[0] == 0) {
                int i6 = 1;
                while (i6 < length && iArr[i6] == 0) {
                    i6++;
                }
                if (i6 == length) {
                    this.f13969b = new int[]{0};
                    return;
                }
                int i10 = length - i6;
                int[] iArr2 = new int[i10];
                this.f13969b = iArr2;
                System.arraycopy(iArr, i6, iArr2, 0, i10);
                return;
            }
            this.f13969b = iArr;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final b a(b bVar) {
        a aVar = bVar.f13968a;
        a aVar2 = this.f13968a;
        if (aVar2.equals(aVar)) {
            if (b()) {
                return bVar;
            }
            if (bVar.b()) {
                return this;
            }
            int[] iArr = this.f13969b;
            int length = iArr.length;
            int[] iArr2 = bVar.f13969b;
            if (length <= iArr2.length) {
                iArr = iArr2;
                iArr2 = iArr;
            }
            int[] iArr3 = new int[iArr.length];
            int length2 = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr3, 0, length2);
            for (int i6 = length2; i6 < iArr.length; i6++) {
                iArr3[i6] = iArr2[i6 - length2] ^ iArr[i6];
            }
            return new b(aVar2, iArr3);
        }
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    public final boolean b() {
        if (this.f13969b[0] != 0) {
            return false;
        }
        return true;
    }

    public final b c(int i6, int i10) {
        if (i6 >= 0) {
            a aVar = this.f13968a;
            if (i10 == 0) {
                return aVar.f13965c;
            }
            int[] iArr = this.f13969b;
            int length = iArr.length;
            int[] iArr2 = new int[i6 + length];
            for (int i11 = 0; i11 < length; i11++) {
                iArr2[i11] = aVar.a(iArr[i11], i10);
            }
            return new b(aVar, iArr2);
        }
        throw new IllegalArgumentException();
    }

    public final String toString() {
        int[] iArr = this.f13969b;
        StringBuilder sb2 = new StringBuilder((iArr.length - 1) * 8);
        int length = iArr.length;
        while (true) {
            length--;
            if (length >= 0) {
                int i6 = iArr[(iArr.length - 1) - length];
                if (i6 != 0) {
                    if (i6 < 0) {
                        sb2.append(" - ");
                        i6 = -i6;
                    } else if (sb2.length() > 0) {
                        sb2.append(" + ");
                    }
                    if (length == 0 || i6 != 1) {
                        a aVar = this.f13968a;
                        if (i6 != 0) {
                            int i10 = aVar.f13964b[i6];
                            if (i10 == 0) {
                                sb2.append('1');
                            } else if (i10 == 1) {
                                sb2.append('a');
                            } else {
                                sb2.append("a^");
                                sb2.append(i10);
                            }
                        } else {
                            aVar.getClass();
                            throw new IllegalArgumentException();
                        }
                    }
                    if (length != 0) {
                        if (length == 1) {
                            sb2.append('x');
                        } else {
                            sb2.append("x^");
                            sb2.append(length);
                        }
                    }
                }
            } else {
                return sb2.toString();
            }
        }
    }
}
