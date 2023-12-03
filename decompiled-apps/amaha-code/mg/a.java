package mg;
/* compiled from: Base64Coder.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f25050a = new char[64];

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f25051b;

    static {
        char c10 = 'A';
        int i6 = 0;
        while (c10 <= 'Z') {
            f25050a[i6] = c10;
            c10 = (char) (c10 + 1);
            i6++;
        }
        char c11 = 'a';
        while (c11 <= 'z') {
            f25050a[i6] = c11;
            c11 = (char) (c11 + 1);
            i6++;
        }
        char c12 = '0';
        while (c12 <= '9') {
            f25050a[i6] = c12;
            c12 = (char) (c12 + 1);
            i6++;
        }
        char[] cArr = f25050a;
        cArr[i6] = '+';
        cArr[i6 + 1] = '/';
        f25051b = new byte[128];
        int i10 = 0;
        while (true) {
            byte[] bArr = f25051b;
            if (i10 >= bArr.length) {
                break;
            }
            bArr[i10] = -1;
            i10++;
        }
        for (int i11 = 0; i11 < 64; i11++) {
            f25051b[f25050a[i11]] = (byte) i11;
        }
    }
}
