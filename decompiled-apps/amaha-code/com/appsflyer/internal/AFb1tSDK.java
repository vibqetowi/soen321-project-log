package com.appsflyer.internal;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.AFLogger;
import com.appsflyer.R;
import com.theinnerhour.b2b.utils.SessionManager;
import java.lang.ref.WeakReference;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;
import v.h;
/* loaded from: classes.dex */
public final class AFb1tSDK {
    private static int AFInAppEventType = 0;
    private static int values = 1;
    private static char[] AFInAppEventParameterName = {'a', 55193, 44961, 34697, 24469, 14230, 3999, 59274, 49036, 38806, 28571, 18309};
    private static long AFKeystoreWrapper = -6595319699626403841L;

    public static String AFInAppEventParameterName(String str) {
        String str2;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.reset();
            messageDigest.update(str.getBytes("UTF-8"));
            str2 = values(messageDigest.digest());
            int i6 = AFInAppEventType + 7;
            values = i6 % 128;
            int i10 = i6 % 2;
        } catch (Exception e10) {
            StringBuilder sb2 = new StringBuilder("Error turning ");
            sb2.append(str.substring(0, 6));
            sb2.append(".. to SHA1");
            AFLogger.afErrorLog(sb2.toString(), e10);
            str2 = null;
        }
        int i11 = AFInAppEventType + 13;
        values = i11 % 128;
        int i12 = i11 % 2;
        return str2;
    }

    public static String AFInAppEventType(String str, String str2) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(str2.getBytes(), "HmacSHA256"));
            String lowerCase = AFInAppEventParameterName(mac.doFinal(str.getBytes())).toLowerCase();
            int i6 = AFInAppEventType + 81;
            values = i6 % 128;
            if (!(i6 % 2 == 0)) {
                return lowerCase;
            }
            throw null;
        } catch (InvalidKeyException | NoSuchAlgorithmException e10) {
            AFLogger.afErrorLog(e10.getMessage(), e10, true);
            return e10.getMessage();
        }
    }

    public static String AFKeystoreWrapper(Map<String, Object> map) {
        char c10;
        StringBuilder c11 = h.c((String) map.get("appsflyerKey"));
        c11.append(map.get(AFInAppEventParameterName(ViewConfiguration.getWindowTouchSlop() >> 8, (char) ((Process.getThreadPriority(0) + 20) >> 6), 12 - ExpandableListView.getPackedPositionType(0L)).intern()));
        StringBuilder c12 = h.c(c11.toString());
        c12.append(map.get(SessionManager.KEY_UID));
        StringBuilder c13 = h.c(c12.toString());
        c13.append(map.get("installDate"));
        StringBuilder c14 = h.c(c13.toString());
        c14.append(map.get("counter"));
        StringBuilder c15 = h.c(c14.toString());
        c15.append(map.get("iaecounter"));
        String AFInAppEventParameterName2 = AFInAppEventParameterName(valueOf(c15.toString()));
        int i6 = values + 5;
        AFInAppEventType = i6 % 128;
        if (i6 % 2 != 0) {
            c10 = 'J';
        } else {
            c10 = '6';
        }
        if (c10 != 'J') {
            return AFInAppEventParameterName2;
        }
        int i10 = 96 / 0;
        return AFInAppEventParameterName2;
    }

    public static String valueOf(String str) {
        int i6 = values + 75;
        AFInAppEventType = i6 % 128;
        int i10 = i6 % 2;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(str.getBytes("UTF-8"));
            String values2 = values(messageDigest.digest());
            int i11 = AFInAppEventType + 29;
            values = i11 % 128;
            int i12 = i11 % 2;
            return values2;
        } catch (Exception e10) {
            StringBuilder sb2 = new StringBuilder("Error turning ");
            sb2.append(str.substring(0, 6));
            sb2.append(".. to MD5");
            AFLogger.afErrorLog(sb2.toString(), e10);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0072 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String values(String str) {
        String str2;
        int i6;
        int i10 = values + 25;
        AFInAppEventType = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.update(str.getBytes());
                str2 = AFInAppEventParameterName(messageDigest.digest());
                try {
                    int i11 = 15 / 0;
                } catch (Exception e10) {
                    e = e10;
                    StringBuilder sb2 = new StringBuilder("Error turning ");
                    sb2.append(str.substring(0, 6));
                    sb2.append(".. to SHA-256");
                    AFLogger.afErrorLog(sb2.toString(), e);
                    i6 = values + 99;
                    AFInAppEventType = i6 % 128;
                    if (i6 % 2 == 0) {
                    }
                }
            } else {
                MessageDigest messageDigest2 = MessageDigest.getInstance("SHA-256");
                messageDigest2.update(str.getBytes());
                str2 = AFInAppEventParameterName(messageDigest2.digest());
            }
        } catch (Exception e11) {
            e = e11;
            str2 = null;
        }
        i6 = values + 99;
        AFInAppEventType = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
        return str2;
    }

    private static String AFInAppEventParameterName(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        int length = bArr.length;
        int i6 = AFInAppEventType + 31;
        values = i6 % 128;
        int i10 = i6 % 2;
        int i11 = 0;
        while (true) {
            if (!(i11 >= length)) {
                int i12 = AFInAppEventType + 67;
                values = i12 % 128;
                int i13 = i12 % 2;
                sb2.append(Integer.toString((bArr[i11] & 255) + 256, 16).substring(1));
                i11++;
            } else {
                return sb2.toString();
            }
        }
    }

    public static String AFInAppEventType(String... strArr) {
        int i6 = AFInAppEventType + R.styleable.AppCompatTheme_windowFixedHeightMinor;
        values = i6 % 128;
        boolean z10 = i6 % 2 != 0;
        String join = TextUtils.join("\u2063", strArr);
        if (!z10) {
            int i10 = 8 / 0;
        }
        return join;
    }

    public static String valueOf(Map<String, Object> map) {
        String str = (String) map.get(AFInAppEventParameterName(TextUtils.lastIndexOf("", '0', 0) + 1, (char) Color.argb(0, 0, 0, 0), TextUtils.indexOf("", "", 0) + 12).intern());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(((String) map.get("appsflyerKey")).substring(0, 7));
        sb2.append(((String) map.get(SessionManager.KEY_UID)).substring(0, 7));
        sb2.append(str.substring(str.length() - 7));
        String AFInAppEventParameterName2 = AFInAppEventParameterName(sb2.toString());
        int i6 = values + 25;
        AFInAppEventType = i6 % 128;
        int i10 = i6 % 2;
        return AFInAppEventParameterName2;
    }

    private static String values(byte[] bArr) {
        Formatter formatter = new Formatter();
        int length = bArr.length;
        int i6 = AFInAppEventType + 59;
        values = i6 % 128;
        int i10 = i6 % 2;
        int i11 = 0;
        while (true) {
            if ((i11 < length ? '6' : '(') != '6') {
                String obj = formatter.toString();
                formatter.close();
                int i12 = values + 15;
                AFInAppEventType = i12 % 128;
                int i13 = i12 % 2;
                return obj;
            }
            formatter.format("%02x", Byte.valueOf(bArr[i11]));
            i11++;
        }
    }

    private static String AFInAppEventParameterName(int i6, char c10, int i10) {
        String str;
        synchronized (AFf1vSDK.AFInAppEventParameterName) {
            char[] cArr = new char[i10];
            AFf1vSDK.AFInAppEventType = 0;
            while (true) {
                int i11 = AFf1vSDK.AFInAppEventType;
                if (i11 < i10) {
                    cArr[i11] = (char) ((AFInAppEventParameterName[i6 + i11] ^ (i11 * AFKeystoreWrapper)) ^ c10);
                    AFf1vSDK.AFInAppEventType = i11 + 1;
                } else {
                    str = new String(cArr);
                }
            }
        }
        return str;
    }

    public static boolean values(Map<String, Object> map, String[] strArr, AFb1aSDK aFb1aSDK) {
        if (map != null) {
            int i6 = values + 81;
            AFInAppEventType = i6 % 128;
            if (i6 % 2 == 0) {
                if (!map.isEmpty()) {
                    int length = strArr.length;
                    int i10 = AFInAppEventType + 37;
                    values = i10 % 128;
                    int i11 = i10 % 2;
                    int i12 = 0;
                    while (i12 < length) {
                        int i13 = AFInAppEventType + 37;
                        values = i13 % 128;
                        if (i13 % 2 != 0) {
                            if (!map.containsKey(strArr[i12])) {
                                return false;
                            }
                            i12++;
                            int i14 = values + 99;
                            AFInAppEventType = i14 % 128;
                            int i15 = i14 % 2;
                        } else {
                            map.containsKey(strArr[i12]);
                            throw null;
                        }
                    }
                    String str = (String) map.remove("sig");
                    if (str == null) {
                        return false;
                    }
                    String AFKeystoreWrapper2 = AFb1aSDK.AFKeystoreWrapper();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(new JSONObject(map));
                    sb2.append(AFKeystoreWrapper2);
                    return AFInAppEventType(sb2.toString(), AFb1uSDK.values(new WeakReference(aFb1aSDK.AFKeystoreWrapper.values))).equals(str);
                }
            } else {
                map.isEmpty();
                throw null;
            }
        }
        return false;
    }
}
