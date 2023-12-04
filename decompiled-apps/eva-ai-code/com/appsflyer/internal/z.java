package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import com.appsflyer.AFLogger;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.apache.http.cookie.ClientCookie;
/* loaded from: classes2.dex */
public final class z {
    public boolean AFInAppEventParameterName;
    public final Map<String, String> AFInAppEventType;
    public final String AFKeystoreWrapper;
    private final byte[] AFLogger$LogLevel;
    private final boolean AFVersionDeclaration;
    private boolean AppsFlyer2dXConversionCallback;
    public int valueOf;
    public final String values;

    public z() {
    }

    public static boolean AFKeystoreWrapper(Context context, Intent intent) {
        return context.getPackageManager().queryIntentServices(intent, 0).size() > 0;
    }

    public static boolean AFInAppEventType(Context context, String str) {
        if (str == null) {
            throw new IllegalArgumentException("permission is null");
        }
        int checkPermission = context.checkPermission(str, Process.myPid(), Process.myUid());
        StringBuilder sb = new StringBuilder("is Permission Available: ");
        sb.append(str);
        sb.append("; res: ");
        sb.append(checkPermission);
        AFLogger.AFKeystoreWrapper(sb.toString());
        return checkPermission == 0;
    }

    public static boolean valueOf() {
        return Build.BRAND.equals("OPPO");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
        if (r2.equals("c") != false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Map<String, String> AFInAppEventType(Context context, Map<String, String> map, Uri uri) {
        Iterator<String> it = uri.getQueryParameterNames().iterator();
        while (true) {
            char c = 0;
            String str = "media_source";
            if (it.hasNext()) {
                String next = it.next();
                String queryParameter = uri.getQueryParameter(next);
                if (!map.containsKey(next)) {
                    int hashCode = next.hashCode();
                    if (hashCode == -1420799080) {
                        if (next.equals("af_prt")) {
                            c = 2;
                            if (c != 0) {
                            }
                        }
                        c = 65535;
                        if (c != 0) {
                        }
                    } else if (hashCode != 99) {
                        if (hashCode == 110987 && next.equals("pid")) {
                            c = 1;
                            if (c != 0) {
                                str = "campaign";
                            } else if (c != 1) {
                                if (c == 2) {
                                    str = "agency";
                                }
                            }
                        }
                        c = 65535;
                        if (c != 0) {
                        }
                    }
                    map.put(str, queryParameter);
                }
                str = next;
                map.put(str, queryParameter);
            } else {
                try {
                    break;
                } catch (Exception e) {
                    AFLogger.valueOf("Could not fetch install time. ", e);
                }
            }
        }
        if (!map.containsKey("install_time")) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
            long j = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            map.put("install_time", simpleDateFormat.format(new Date(j)));
        }
        if (map.containsKey("af_deeplink") && !map.containsKey("af_status")) {
            map.put("af_status", "Non-organic");
        }
        if (map.containsKey("agency")) {
            map.remove("media_source");
        }
        String path = uri.getPath();
        if (path != null) {
            map.put(ClientCookie.PATH_ATTR, path);
        }
        String scheme = uri.getScheme();
        if (scheme != null) {
            map.put("scheme", scheme);
        }
        String host = uri.getHost();
        if (host != null) {
            map.put("host", host);
        }
        return map;
    }

    public static String AFInAppEventParameterName(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException, CertificateException, NoSuchAlgorithmException {
        Signature[] signatureArr = packageManager.getPackageInfo(str, 64).signatures;
        if (signatureArr == null) {
            return null;
        }
        MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
        messageDigest.update(((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getEncoded());
        return String.format("%032X", new BigInteger(1, messageDigest.digest()));
    }

    public static long values(Context context, String str) {
        long longVersionCode;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            if (Build.VERSION.SDK_INT >= 28) {
                longVersionCode = packageInfo.getLongVersionCode();
                return longVersionCode;
            }
            return packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.valueOf(e.getMessage(), e);
            return 0L;
        }
    }

    public static String AFKeystoreWrapper(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.valueOf(e.getMessage(), e);
            return "";
        }
    }

    public z(String str, byte[] bArr, String str2, Map<String, String> map, boolean z) {
        this.AppsFlyer2dXConversionCallback = true;
        this.AFInAppEventParameterName = false;
        this.valueOf = -1;
        this.values = str;
        this.AFLogger$LogLevel = bArr;
        this.AFKeystoreWrapper = str2;
        this.AFInAppEventType = map;
        this.AFVersionDeclaration = false;
    }

    public z(String str, String str2) {
        this(str, null, str2, new HashMap(), false);
    }

    public final byte[] AFKeystoreWrapper() {
        return this.AFLogger$LogLevel;
    }

    public final boolean AFInAppEventType() {
        return this.AFVersionDeclaration;
    }

    public final boolean AFInAppEventParameterName() {
        return this.AppsFlyer2dXConversionCallback;
    }

    public final boolean values() {
        return this.AFInAppEventParameterName;
    }
}
