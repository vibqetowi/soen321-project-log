package com.appsflyer.internal;

import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.text.Typography;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
/* loaded from: classes2.dex */
public final class ag {
    private static long AFInAppEventParameterName = 4947486484342868501L;
    private static int valueOf = 0;
    private static int values = 1;

    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String valueOf(String str) {
        String str2;
        int i;
        int i2 = valueOf + 43;
        values = i2 % 128;
        String str3 = null;
        try {
        } catch (Exception e) {
            e = e;
        }
        if (!(i2 % 2 == 0)) {
            MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_1);
            messageDigest.reset();
            messageDigest.update(str.getBytes("UTF-8"));
            str2 = values(messageDigest.digest());
            i = values + 93;
            valueOf = i % 128;
            if (i % 2 != 0) {
                int i3 = 10 / 0;
            }
            return str2;
        }
        MessageDigest messageDigest2 = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_1);
        messageDigest2.reset();
        messageDigest2.update(str.getBytes("UTF-8"));
        String values2 = values(messageDigest2.digest());
        try {
            throw null;
        } catch (Exception e2) {
            str3 = values2;
            e = e2;
            StringBuilder sb = new StringBuilder("Error turning ");
            sb.append(str.substring(0, 6));
            sb.append(".. to SHA1");
            AFLogger.valueOf(sb.toString(), e);
            str2 = str3;
            i = values + 93;
            valueOf = i % 128;
            if (i % 2 != 0) {
            }
            return str2;
        }
    }

    public static String AFKeystoreWrapper(String str) {
        String str2;
        int i = valueOf + 97;
        values = i % 128;
        int i2 = i % 2;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.MD5);
            messageDigest.reset();
            messageDigest.update(str.getBytes("UTF-8"));
            str2 = values(messageDigest.digest());
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Error turning ");
            sb.append(str.substring(0, 6));
            sb.append(".. to MD5");
            AFLogger.valueOf(sb.toString(), e);
            str2 = null;
        }
        int i3 = valueOf + 69;
        values = i3 % 128;
        if ((i3 % 2 == 0 ? (char) 29 : '0') != 29) {
            return str2;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String AFInAppEventParameterName(String str) {
        String str2;
        int i;
        int i2 = valueOf + 21;
        values = i2 % 128;
        String str3 = null;
        try {
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Error turning ");
            sb.append(str.substring(0, 6));
            sb.append(".. to SHA-256");
            AFLogger.valueOf(sb.toString(), e);
        }
        if (!(i2 % 2 == 0)) {
            MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256);
            messageDigest.update(str.getBytes());
            str2 = AFInAppEventParameterName(messageDigest.digest());
            i = valueOf + 95;
            values = i % 128;
            if ((i % 2 != 0 ? '\f' : ';') != ';') {
                int i3 = 9 / 0;
            }
            return str2;
        }
        MessageDigest messageDigest2 = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256);
        messageDigest2.update(str.getBytes());
        str3 = AFInAppEventParameterName(messageDigest2.digest());
        int i4 = 1 / 0;
        str2 = str3;
        i = valueOf + 95;
        values = i % 128;
        if ((i % 2 != 0 ? '\f' : ';') != ';') {
        }
        return str2;
    }

    private static String AFInAppEventParameterName(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        int length = bArr.length;
        int i = 0;
        while (true) {
            if ((i < length ? '*' : '+') != '*') {
                String obj = sb.toString();
                int i2 = valueOf + 91;
                values = i2 % 128;
                int i3 = i2 % 2;
                return obj;
            }
            int i4 = valueOf + 67;
            values = i4 % 128;
            if (i4 % 2 != 0) {
                sb.append(Integer.toString((bArr[i] & 255) + 256, 16).substring(1));
                i++;
            } else {
                sb.append(Integer.toString((bArr[i] ^ 17933) * 20083, 47).substring(0));
                i += 84;
            }
        }
    }

    private static String values(byte[] bArr) {
        Formatter formatter = new Formatter();
        int length = bArr.length;
        int i = 0;
        while (true) {
            if ((i < length ? (char) 3 : 'O') == 'O') {
                break;
            }
            int i2 = valueOf + 119;
            values = i2 % 128;
            if (i2 % 2 == 0) {
                Object[] objArr = new Object[0];
                objArr[0] = Byte.valueOf(bArr[i]);
                formatter.format("%02x", objArr);
                i += 2;
            } else {
                formatter.format("%02x", Byte.valueOf(bArr[i]));
                i++;
            }
        }
        String obj = formatter.toString();
        formatter.close();
        int i3 = values + 27;
        valueOf = i3 % 128;
        if (!(i3 % 2 == 0)) {
            int i4 = 38 / 0;
        }
        return obj;
    }

    public static String valueOf(String str, String str2) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(str2.getBytes(), "HmacSHA256"));
            String lowerCase = AFInAppEventParameterName(mac.doFinal(str.getBytes())).toLowerCase();
            int i = valueOf + 123;
            values = i % 128;
            if ((i % 2 == 0 ? (char) 2 : 'O') != 2) {
                return lowerCase;
            }
            int i2 = 38 / 0;
            return lowerCase;
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            AFLogger.AFInAppEventParameterName(e.getMessage(), e);
            return e.getMessage();
        }
    }

    public static String values(Map<String, Object> map) {
        String str = (String) map.get(AFKeystoreWrapper("詴憦巠䤞┨ᅑಎ\uf8b5퓉쀉밪ꡂ", 60373 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern());
        StringBuilder sb = new StringBuilder();
        sb.append(((String) map.get("appsflyerKey")).substring(0, 7));
        sb.append(((String) map.get("uid")).substring(0, 7));
        sb.append(str.substring(str.length() - 7));
        String valueOf2 = valueOf(sb.toString());
        int i = values + 35;
        valueOf = i % 128;
        if (!(i % 2 != 0)) {
            return valueOf2;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    public static String AFInAppEventParameterName(Map<String, Object> map) {
        StringBuilder sb = new StringBuilder();
        sb.append((String) map.get("appsflyerKey"));
        sb.append(map.get(AFKeystoreWrapper("詴憦巠䤞┨ᅑಎ\uf8b5퓉쀉밪ꡂ", 60373 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern()));
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append(map.get("uid"));
        String obj2 = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(obj2);
        sb3.append(map.get("installDate"));
        String obj3 = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(obj3);
        sb4.append(map.get("counter"));
        String obj4 = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(obj4);
        sb5.append(map.get("iaecounter"));
        String valueOf2 = valueOf(AFKeystoreWrapper(sb5.toString()));
        int i = values + 29;
        valueOf = i % 128;
        if ((i % 2 != 0 ? '*' : Typography.greater) != '*') {
            return valueOf2;
        }
        int i2 = 78 / 0;
        return valueOf2;
    }

    public static String AFInAppEventParameterName(String... strArr) {
        int i = valueOf + 81;
        values = i % 128;
        int i2 = i % 2;
        String join = TextUtils.join("\u2063", strArr);
        int i3 = values + 65;
        valueOf = i3 % 128;
        if (i3 % 2 == 0) {
            return join;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r6 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String AFKeystoreWrapper(String str, int i) {
        char[] cArr;
        String str2;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (dn.valueOf) {
            dn.AFInAppEventType = i;
            char[] cArr3 = new char[cArr2.length];
            dn.values = 0;
            while (dn.values < cArr2.length) {
                cArr3[dn.values] = (char) ((cArr2[dn.values] ^ (dn.values * dn.AFInAppEventType)) ^ AFInAppEventParameterName);
                dn.values++;
            }
            str2 = new String(cArr3);
        }
        return str2;
    }
}
