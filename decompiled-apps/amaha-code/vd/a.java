package vd;

import java.util.HashMap;
/* compiled from: MiddleOutStrategy.java */
/* loaded from: classes.dex */
public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f34975a;

    /* renamed from: b  reason: collision with root package name */
    public final int f34976b;

    public /* synthetic */ a(int i6, int i10) {
        this.f34975a = i10;
        this.f34976b = i6;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    @Override // vd.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        int i6;
        boolean z10;
        int i10 = this.f34975a;
        int i11 = this.f34976b;
        switch (i10) {
            case 0:
                if (stackTraceElementArr.length <= i11) {
                    return stackTraceElementArr;
                }
                int i12 = i11 / 2;
                int i13 = i11 - i12;
                StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i11];
                System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i13);
                System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i12, stackTraceElementArr2, i13, i12);
                return stackTraceElementArr2;
            default:
                HashMap hashMap = new HashMap();
                StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[stackTraceElementArr.length];
                int i14 = 0;
                int i15 = 0;
                int i16 = 1;
                while (i14 < stackTraceElementArr.length) {
                    StackTraceElement stackTraceElement = stackTraceElementArr[i14];
                    Integer num = (Integer) hashMap.get(stackTraceElement);
                    if (num != null) {
                        int intValue = num.intValue();
                        int i17 = i14 - intValue;
                        if (i14 + i17 <= stackTraceElementArr.length) {
                            for (int i18 = 0; i18 < i17; i18++) {
                                if (stackTraceElementArr[intValue + i18].equals(stackTraceElementArr[i14 + i18])) {
                                }
                            }
                            z10 = true;
                            if (z10) {
                                int intValue2 = i14 - num.intValue();
                                if (i16 < i11) {
                                    System.arraycopy(stackTraceElementArr, i14, stackTraceElementArr3, i15, intValue2);
                                    i15 += intValue2;
                                    i16++;
                                }
                                i6 = (intValue2 - 1) + i14;
                                hashMap.put(stackTraceElement, Integer.valueOf(i14));
                                i14 = i6 + 1;
                            }
                        }
                        z10 = false;
                        if (z10) {
                        }
                    }
                    stackTraceElementArr3[i15] = stackTraceElementArr[i14];
                    i15++;
                    i6 = i14;
                    i16 = 1;
                    hashMap.put(stackTraceElement, Integer.valueOf(i14));
                    i14 = i6 + 1;
                }
                StackTraceElement[] stackTraceElementArr4 = new StackTraceElement[i15];
                System.arraycopy(stackTraceElementArr3, 0, stackTraceElementArr4, 0, i15);
                if (i15 >= stackTraceElementArr.length) {
                    return stackTraceElementArr;
                }
                return stackTraceElementArr4;
        }
    }

    public String toString() {
        switch (this.f34975a) {
            case 2:
                return c.s(new StringBuilder("ExistenceFilter{count="), this.f34976b, '}');
            default:
                return super.toString();
        }
    }
}
