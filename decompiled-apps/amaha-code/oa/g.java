package oa;
/* compiled from: com.android.billingclient:billing@@5.0.0 */
/* loaded from: classes.dex */
public final class g extends s {
    public static final g A = new g(new Object[0], 0, null);

    /* renamed from: x  reason: collision with root package name */
    public final transient Object f27327x;

    /* renamed from: y  reason: collision with root package name */
    public final transient Object[] f27328y;

    /* renamed from: z  reason: collision with root package name */
    public final transient int f27329z;

    public g(Object[] objArr, int i6, Object obj) {
        this.f27327x = obj;
        this.f27328y = objArr;
        this.f27329z = i6;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009f A[RETURN] */
    @Override // oa.s, java.util.Map, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        if (obj != null) {
            Object[] objArr = this.f27328y;
            if (this.f27329z == 1) {
                Object obj3 = objArr[0];
                obj3.getClass();
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    obj2.getClass();
                }
            } else {
                Object obj4 = this.f27327x;
                if (obj4 != null) {
                    if (obj4 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj4;
                        int length = bArr.length - 1;
                        int p02 = sc.b.p0(obj.hashCode());
                        while (true) {
                            int i6 = p02 & length;
                            int i10 = bArr[i6] & 255;
                            if (i10 == 255) {
                                break;
                            } else if (obj.equals(objArr[i10])) {
                                obj2 = objArr[i10 ^ 1];
                                break;
                            } else {
                                p02 = i6 + 1;
                            }
                        }
                    } else if (obj4 instanceof short[]) {
                        short[] sArr = (short[]) obj4;
                        int length2 = sArr.length - 1;
                        int p03 = sc.b.p0(obj.hashCode());
                        while (true) {
                            int i11 = p03 & length2;
                            char c10 = (char) sArr[i11];
                            if (c10 == 65535) {
                                break;
                            } else if (obj.equals(objArr[c10])) {
                                obj2 = objArr[c10 ^ 1];
                                break;
                            } else {
                                p03 = i11 + 1;
                            }
                        }
                    } else {
                        int[] iArr = (int[]) obj4;
                        int length3 = iArr.length - 1;
                        int p04 = sc.b.p0(obj.hashCode());
                        while (true) {
                            int i12 = p04 & length3;
                            int i13 = iArr[i12];
                            if (i13 == -1) {
                                break;
                            } else if (obj.equals(objArr[i13])) {
                                obj2 = objArr[i13 ^ 1];
                                break;
                            } else {
                                p04 = i12 + 1;
                            }
                        }
                    }
                }
            }
            if (obj2 != null) {
                return null;
            }
            return obj2;
        }
        obj2 = null;
        if (obj2 != null) {
        }
    }

    @Override // java.util.Map, j$.util.Map
    public final int size() {
        return this.f27329z;
    }
}
