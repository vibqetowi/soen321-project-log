package b8;

import android.util.Log;
import u7.v;
/* compiled from: TrackEncryptionBox.java */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f4081a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4082b;

    /* renamed from: c  reason: collision with root package name */
    public final v.a f4083c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4084d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f4085e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0051, code lost:
        if (r6.equals("cbc1") == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k(boolean z10, String str, int i6, byte[] bArr, int i10, int i11, byte[] bArr2) {
        boolean z11;
        boolean z12;
        char c10 = 0;
        int i12 = 1;
        if (i6 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (bArr2 == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        sc.b.q(z11 ^ z12);
        this.f4081a = z10;
        this.f4082b = str;
        this.f4084d = i6;
        this.f4085e = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    break;
                case 3046671:
                    if (str.equals("cbcs")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3049879:
                    if (str.equals("cenc")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3049895:
                    if (str.equals("cens")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            if (c10 != 0 && c10 != 1) {
                if (c10 != 2 && c10 != 3) {
                    StringBuilder sb2 = new StringBuilder(str.length() + 68);
                    sb2.append("Unsupported protection scheme type '");
                    sb2.append(str);
                    sb2.append("'. Assuming AES-CTR crypto mode.");
                    Log.w("TrackEncryptionBox", sb2.toString());
                }
            } else {
                i12 = 2;
            }
        }
        this.f4083c = new v.a(i12, i10, i11, bArr);
    }
}
