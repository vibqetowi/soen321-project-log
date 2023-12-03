package oe;

import com.google.firebase.firestore.FirebaseFirestoreException;
import d9.p;
import io.grpc.StatusException;
import java.security.SecureRandom;
import java.util.Iterator;
import tr.i0;
/* compiled from: Util.java */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final SecureRandom f27432a = new SecureRandom();

    /* renamed from: b  reason: collision with root package name */
    public static final p f27433b = new p(29);

    public static <T> T a(Iterator<T> it) {
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static int b(byte[] bArr, byte[] bArr2) {
        int min = Math.min(bArr.length, bArr2.length);
        for (int i6 = 0; i6 < min; i6++) {
            int i10 = bArr[i6] & 255;
            int i11 = bArr2[i6] & 255;
            if (i10 < i11) {
                return -1;
            }
            if (i10 > i11) {
                return 1;
            }
        }
        return d(bArr.length, bArr2.length);
    }

    public static int c(com.google.protobuf.h hVar, com.google.protobuf.h hVar2) {
        int min = Math.min(hVar.size(), hVar2.size());
        for (int i6 = 0; i6 < min; i6++) {
            int m10 = hVar.m(i6) & 255;
            int m11 = hVar2.m(i6) & 255;
            if (m10 < m11) {
                return -1;
            }
            if (m10 > m11) {
                return 1;
            }
        }
        return d(hVar.size(), hVar2.size());
    }

    public static int d(int i6, int i10) {
        if (i6 < i10) {
            return -1;
        }
        if (i6 > i10) {
            return 1;
        }
        return 0;
    }

    public static int e(double d10, long j10) {
        int i6 = -1;
        if (Double.isNaN(d10) || d10 < -9.223372036854776E18d) {
            return -1;
        }
        if (d10 >= 9.223372036854776E18d) {
            return 1;
        }
        int i10 = (((long) d10) > j10 ? 1 : (((long) d10) == j10 ? 0 : -1));
        if (i10 >= 0) {
            if (i10 > 0) {
                i6 = 1;
            } else {
                i6 = 0;
            }
        }
        if (i6 == 0) {
            return f6.b.w0(d10, j10);
        }
        return i6;
    }

    public static FirebaseFirestoreException f(i0 i0Var) {
        i0Var.getClass();
        StatusException statusException = new StatusException(i0Var);
        return new FirebaseFirestoreException(statusException.getMessage(), FirebaseFirestoreException.a.f9623z.get(i0Var.f33491a.f33498u, FirebaseFirestoreException.a.UNKNOWN), statusException);
    }

    public static StringBuilder g(CharSequence charSequence, int i6, String str) {
        StringBuilder sb2 = new StringBuilder();
        if (i6 != 0) {
            sb2.append(charSequence);
            for (int i10 = 1; i10 < i6; i10++) {
                sb2.append((CharSequence) str);
                sb2.append(charSequence);
            }
        }
        return sb2;
    }

    public static String h(com.google.protobuf.h hVar) {
        int size = hVar.size();
        StringBuilder sb2 = new StringBuilder(size * 2);
        for (int i6 = 0; i6 < size; i6++) {
            int m10 = hVar.m(i6) & 255;
            sb2.append(Character.forDigit(m10 >>> 4, 16));
            sb2.append(Character.forDigit(m10 & 15, 16));
        }
        return sb2.toString();
    }

    public static String i(Object obj) {
        if (obj == null) {
            return "null";
        }
        return obj.getClass().getName();
    }
}
