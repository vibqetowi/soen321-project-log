package h0;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
/* compiled from: PackageInfoCompat.java */
/* loaded from: classes.dex */
public final class a {

    /* compiled from: PackageInfoCompat.java */
    /* renamed from: h0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0267a {
        public static Signature[] a(SigningInfo signingInfo) {
            Signature[] apkContentsSigners;
            apkContentsSigners = signingInfo.getApkContentsSigners();
            return apkContentsSigners;
        }

        public static long b(PackageInfo packageInfo) {
            long longVersionCode;
            longVersionCode = packageInfo.getLongVersionCode();
            return longVersionCode;
        }

        public static Signature[] c(SigningInfo signingInfo) {
            Signature[] signingCertificateHistory;
            signingCertificateHistory = signingInfo.getSigningCertificateHistory();
            return signingCertificateHistory;
        }

        public static boolean d(SigningInfo signingInfo) {
            boolean hasMultipleSigners;
            hasMultipleSigners = signingInfo.hasMultipleSigners();
            return hasMultipleSigners;
        }

        public static boolean e(PackageManager packageManager, String str, byte[] bArr, int i6) {
            boolean hasSigningCertificate;
            hasSigningCertificate = packageManager.hasSigningCertificate(str, bArr, i6);
            return hasSigningCertificate;
        }
    }

    public static long a(PackageInfo packageInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C0267a.b(packageInfo);
        }
        return packageInfo.versionCode;
    }
}
