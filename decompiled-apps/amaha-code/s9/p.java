package s9;

import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import v9.k1;
import v9.l1;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public abstract class p extends k1 {

    /* renamed from: c  reason: collision with root package name */
    public final int f31356c;

    public p(byte[] bArr) {
        boolean z10;
        if (bArr.length == 25) {
            z10 = true;
        } else {
            z10 = false;
        }
        v9.o.b(z10);
        this.f31356c = Arrays.hashCode(bArr);
    }

    public static byte[] X1(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    public abstract byte[] Y1();

    @Override // v9.l1
    public final int c() {
        return this.f31356c;
    }

    @Override // v9.l1
    public final da.a e() {
        return new da.b(Y1());
    }

    public final boolean equals(Object obj) {
        da.a e10;
        if (obj != null && (obj instanceof l1)) {
            try {
                l1 l1Var = (l1) obj;
                if (l1Var.c() != this.f31356c || (e10 = l1Var.e()) == null) {
                    return false;
                }
                return Arrays.equals(Y1(), (byte[]) da.b.Y1(e10));
            } catch (RemoteException e11) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f31356c;
    }
}
