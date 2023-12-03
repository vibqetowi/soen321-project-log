package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.hardware.SensorManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.AFLogger;
import com.appsflyer.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class AFa1ySDK {
    private static int AFInAppEventType = 1;
    private static int values;
    private static char[] AFInAppEventParameterName = {59626, 63759, 52027, 56647, 44876, 45424, 33683, 38339, 26543, 18900, 23491, 11744, 15875, 1, 4648, 58451, 63058, 55343, 43691, 48304, 36527, 37084, 25319, 29925, 17684, 22335, 14646, 2920, 7538, 61287, 61830, 50106, 54702, 42963, '0', 10316, 14761, 2973, 7649, 28650, 29142, 17205, 21861, 42773, 35190, 39803, 60743, 65186, 49326, 53907, 9470, 13987, 6388, 27196, 31773, 19990, 20592, 41539, 'a', 4484, 9136, 13772, 18375, 23035, 27416, 32072, 36671, 41289, 45834, 50511, 54923, 59547, 64162, 3285, 7924, 12523, 16903, 21557, 13406, 9659, 6031, 499, 29688, 28100, 24359, 18807, 47873, 38240, 34671, 61727, 58002, 56495, 52890, 27690, 32178, 'j', 4491, 9122, 13791, 18310, 23035, 27411, 32072, 36644, 41303, 45908, 50538, 54929, 59536, 8445, 12635, 871, 5391, 26386, 31013, 12864, 9089, 4530, 2014, 30144, 27618, 22794, 20232, 48406, 37697, 33092, 63336, 58507, 55957, 51366, 16090, 11469};
    private static long valueOf = -2175139879924985366L;
    private static long AFKeystoreWrapper = 6606814324524654768L;

    private static String AFInAppEventParameterName(String str) {
        int parseInt;
        int i6;
        int i10 = values + 93;
        AFInAppEventType = i10 % 128;
        if (i10 % 2 == 0) {
            parseInt = Integer.parseInt(str, 2);
            i6 = 38;
        } else {
            parseInt = Integer.parseInt(str, 2);
            i6 = 16;
        }
        return Integer.toString(parseInt, i6);
    }

    private static String AFInAppEventType(String str, Long l2) {
        int i6 = values + 37;
        int i10 = i6 % 128;
        AFInAppEventType = i10;
        int i11 = i6 % 2;
        if ((str != null ? '-' : (char) 27) != 27 && l2 != null) {
            int i12 = i10 + 19;
            values = i12 % 128;
            if (i12 % 2 == 0 ? str.length() == 32 : str.length() == 55) {
                StringBuilder sb2 = new StringBuilder(str);
                String obj = l2.toString();
                int i13 = values + 67;
                AFInAppEventType = i13 % 128;
                int i14 = i13 % 2;
                int i15 = 0;
                for (int i16 = 0; i16 < obj.length(); i16++) {
                    i15 += Character.getNumericValue(obj.charAt(i16));
                }
                String hexString = Integer.toHexString(i15);
                sb2.replace(7, hexString.length() + 7, hexString);
                int i17 = values + R.styleable.AppCompatTheme_windowMinWidthMinor;
                AFInAppEventType = i17 % 128;
                int i18 = i17 % 2;
                long j10 = 0;
                int i19 = 0;
                while (true) {
                    if ((i19 < sb2.length() ? ';' : (char) 1) != ';') {
                        break;
                    }
                    j10 += Character.getNumericValue(sb2.charAt(i19));
                    i19++;
                }
                while (j10 > 100) {
                    j10 %= 100;
                }
                sb2.insert(23, (int) j10);
                if (j10 < 10) {
                    sb2.insert(23, valueOf(1 - KeyEvent.normalizeMetaState(0), 34 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (ViewConfiguration.getScrollBarSize() >> 8)).intern());
                }
                return sb2.toString();
            }
        }
        return AFInAppEventType("䯂㷿舍\uf30c䮠ᴮ쌏酹쥣黪䘝៩乻᮫쓘钯쏣镭䮔\u196f䃶ᘩ칙鹹옶鏪䴙ᳬ嬦\u0cf6폜臺\ud8b0踿嚜٭", TextUtils.getCapsMode("", 0, 0)).intern();
    }

    private static String AFKeystoreWrapper(String str, String str2, int i6) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.setCharAt(i6, AFInAppEventParameterName(str2).charAt(0));
        String obj = sb2.toString();
        int i10 = AFInAppEventType + R.styleable.AppCompatTheme_textColorSearchUrl;
        values = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 95 / 0;
            return obj;
        }
        return obj;
    }

    public static String valueOf(Context context, long j10) {
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        sb3.append((!AFInAppEventType(valueOf(35 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), ViewConfiguration.getKeyRepeatTimeout() >> 16, (char) (Color.argb(0, 0, 0, 0) + 59531)).intern()) ? valueOf((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, (ViewConfiguration.getScrollBarSize() >> 8) + 34, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1)) : AFInAppEventType("怴\uefde郁잡怅", (-1) - MotionEvent.axisFromString(""))).intern());
        sb2.append(AFInAppEventParameterName(context, sb3));
        try {
            sb2.append(new SimpleDateFormat(AFInAppEventType("隠귓☙쯌雙贚最ꦥᑍ\u0eee\ue274⼱鍄讇悦갔ẨՎ\uefd4⇯鷓蘹", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), Locale.US).format(new Date(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime)));
            int i6 = AFInAppEventType;
            int i10 = i6 + R.styleable.AppCompatTheme_windowFixedHeightMinor;
            values = i10 % 128;
            int i11 = i10 % 2;
            int i12 = i6 + 63;
            values = i12 % 128;
            int i13 = i12 % 2;
            sb2.append(j10);
            AFInAppEventParameterName(sb4);
            String AFInAppEventType2 = AFInAppEventType(AFKeystoreWrapper(AFKeystoreWrapper(values(sb2.toString()), sb3.toString(), 17), sb4.toString(), 27), Long.valueOf(j10));
            int i14 = values + 87;
            AFInAppEventType = i14 % 128;
            if (i14 % 2 != 0) {
                return AFInAppEventType2;
            }
            throw null;
        } catch (PackageManager.NameNotFoundException unused) {
            return AFInAppEventType("䯂㷿舍\uf30c䮠ᴮ쌏酹쥣黪䘝៩乻᮫쓘钯쏣镭䮔\u196f䃶ᘩ칙鹹옶鏪䴙ᳬ嬦\u0cf6폜臺\ud8b0踿嚜٭", ViewConfiguration.getTapTimeout() >> 16).intern();
        }
    }

    private static String values(String str) {
        boolean z10;
        int i6 = AFInAppEventType + R.styleable.AppCompatTheme_textAppearanceListItem;
        values = i6 % 128;
        int i10 = i6 % 2;
        String valueOf2 = AFb1tSDK.valueOf(AFb1tSDK.values(str));
        int i11 = values + 25;
        AFInAppEventType = i11 % 128;
        if (i11 % 2 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return valueOf2;
        }
        int i12 = 84 / 0;
        return valueOf2;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void AFInAppEventParameterName(StringBuilder sb2) {
        String intern;
        String valueOf2;
        String intern2;
        String intern3;
        if (!(AFInAppEventType(AFInAppEventType("堫⚀往\u0cdb塊ٞẄ溹\uda84薙鯄\ue825巄Ã᥎欉퀊踄陔\ue6ee卙\u0d49Ꭽ憪햅袑郇\ue36e䣙", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + (-1)).intern()))) {
            intern = valueOf((ViewConfiguration.getFadingEdgeLength() >> 16) + 1, TextUtils.lastIndexOf("", '0', 0, 0) + 35, (char) (Process.myPid() >> 22)).intern();
            int i6 = values + 97;
            AFInAppEventType = i6 % 128;
            int i10 = i6 % 2;
        } else {
            intern = AFInAppEventType("怴\uefde郁잡怅", View.resolveSizeAndState(0, 0, 0)).intern();
        }
        sb2.append(intern);
        sb2.append(((AFInAppEventType(valueOf((ViewConfiguration.getJumpTapTimeout() >> 16) + 23, 34 - MotionEvent.axisFromString(""), (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 10286)).intern()) ? 'J' : (char) 27) != 'J' ? valueOf((Process.myPid() >> 22) + 1, 33 - TextUtils.lastIndexOf("", '0', 0), (char) (ViewConfiguration.getLongPressTimeout() >> 16)) : AFInAppEventType("怴\uefde郁잡怅", Color.blue(0))).intern());
        if (AFInAppEventType(valueOf(KeyEvent.keyCodeFromString("") + 20, 58 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1)).intern())) {
            int i11 = values + 31;
            AFInAppEventType = i11 % 128;
            if (i11 % 2 != 0) {
                valueOf2 = AFInAppEventType("怴\uefde郁잡怅", TextUtils.indexOf("", "", 0, 0));
            } else {
                intern2 = AFInAppEventType("怴\uefde郁잡怅", TextUtils.indexOf("", "", 0, 1)).intern();
                sb2.append(intern2);
                if ((AFInAppEventType(valueOf(15 - View.combineMeasuredStates(0, 0), 78 - KeyEvent.getDeadChar(0, 0), (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 13375)).intern()) ? (char) 11 : (char) 20) == 11) {
                    intern3 = valueOf(TextUtils.indexOf("", "") + 1, KeyEvent.keyCodeFromString("") + 34, (char) Color.argb(0, 0, 0, 0)).intern();
                    int i12 = AFInAppEventType + 49;
                    values = i12 % 128;
                    int i13 = i12 % 2;
                } else {
                    int i14 = AFInAppEventType + 43;
                    values = i14 % 128;
                    intern3 = AFInAppEventType("怴\uefde郁잡怅", i14 % 2 != 0 ? ViewConfiguration.getLongPressTimeout() / R.styleable.AppCompatTheme_windowFixedHeightMajor : ViewConfiguration.getLongPressTimeout() >> 16).intern();
                }
                sb2.append(intern3);
            }
        } else {
            valueOf2 = valueOf(1 - View.resolveSize(0, 0), 34 - KeyEvent.getDeadChar(0, 0), (char) (ViewConfiguration.getScrollBarSize() >> 8));
        }
        intern2 = valueOf2.intern();
        sb2.append(intern2);
        if ((AFInAppEventType(valueOf(15 - View.combineMeasuredStates(0, 0), 78 - KeyEvent.getDeadChar(0, 0), (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 13375)).intern()) ? (char) 11 : (char) 20) == 11) {
        }
        sb2.append(intern3);
    }

    private static String AFKeystoreWrapper(String str) {
        if (!(!str.contains(AFInAppEventType("癢䇓－ⵁ癌", View.combineMeasuredStates(0, 0)).intern()))) {
            String[] split = str.split(valueOf(Gravity.getAbsoluteGravity(0, 0) + 2, Color.argb(0, 0, 0, 0) + 93, (char) (27766 - Drawable.resolveOpacity(0, 0))).intern());
            int length = split.length;
            StringBuilder sb2 = new StringBuilder();
            int i6 = length - 1;
            sb2.append(split[i6]);
            sb2.append(AFInAppEventType("癢䇓－ⵁ癌", Process.myTid() >> 22).intern());
            int i10 = values + 13;
            AFInAppEventType = i10 % 128;
            int i11 = i10 % 2;
            int i12 = 1;
            while (true) {
                if (i12 >= i6) {
                    sb2.append(split[0]);
                    return sb2.toString();
                }
                sb2.append(split[i12]);
                sb2.append(AFInAppEventType("癢䇓－ⵁ癌", AndroidCharacter.getMirror('0') - '0').intern());
                i12++;
            }
        } else {
            int i13 = values + 19;
            AFInAppEventType = i13 % 128;
            if ((i13 % 2 == 0 ? ',' : '#') == '#') {
                return str;
            }
            throw null;
        }
    }

    private static String AFInAppEventParameterName(Context context, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder();
        String packageName = context.getPackageName();
        String AFKeystoreWrapper2 = AFKeystoreWrapper(packageName);
        sb2.append(AFInAppEventType("怴\uefde郁잡怅", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1).intern());
        sb3.append(AFKeystoreWrapper2);
        if (!(AFInAppEventType(context) != null)) {
            sb2.append(valueOf(1 - KeyEvent.normalizeMetaState(0), KeyEvent.normalizeMetaState(0) + 34, (char) (ViewConfiguration.getLongPressTimeout() >> 16)).intern());
            sb3.append(packageName);
        } else {
            sb2.append(AFInAppEventType("怴\uefde郁잡怅", KeyEvent.normalizeMetaState(0)).intern());
            sb3.append(packageName);
        }
        String valueOf2 = valueOf(context);
        if ((valueOf2 == null ? '%' : (char) 25) != '%') {
            sb2.append(AFInAppEventType("怴\uefde郁잡怅", Gravity.getAbsoluteGravity(0, 0)).intern());
            sb3.append(valueOf2);
        } else {
            int i6 = values + 19;
            AFInAppEventType = i6 % 128;
            int i10 = i6 % 2;
            sb2.append(valueOf(1 - TextUtils.indexOf("", "", 0, 0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 35, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern());
            sb3.append(packageName);
        }
        sb3.append(Boolean.TRUE.toString());
        String obj = sb3.toString();
        int i11 = AFInAppEventType + 71;
        values = i11 % 128;
        int i12 = i11 % 2;
        return obj;
    }

    /* renamed from: com.appsflyer.internal.AFa1ySDK$AFa1ySDK  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0126AFa1ySDK extends HashMap<String, Object> {
        private static int AFLogger = 1;
        private static int afErrorLog;
        private final Context AFKeystoreWrapper;
        private final Map<String, Object> values;
        private static char[] valueOf = {296, 301, 294, 315, 304, 308, 300, 314, 311, 277, 278, 265, 281, 264, 267, 306, 307, 299, 231, 302, 309, 313, 320, 318, 303, 319, 298, 310, 257, 256, 275, 316, 253, 245, 248, 255, 237};
        private static boolean AFInAppEventParameterName = true;
        private static boolean afRDLog = true;
        private static int AFInAppEventType = 199;
        private static char[] afDebugLog = {'b', 39129, 12599, 51823, 25288, '-', 39129, 12597, 51759, 25222, 'f', 39114, 12607, 51821, 25289, 64307, 37922, 11466, 50493, 24173, 63179, 36651, 10341, 49371, 22835, 62059, 35543, 9083, 48237, 21716, 60730, 34343, 7876, 46908, 20580, 59590, 33083, 6697, 45763, 19254, 58494, 31965, 5440, 44654, 18126, 57090, 30825, 4295, 43286, 16996, 56023, 29453, 3124, 42137, 35002, 4114, 47596, 17084, 59925, 29674, 7402, 42048, 19892, 55019, 32274, 1976, 41197, 18449, 53680, 31469, 601, 43963, 'a', 39109, 12594, 51827, 25283, 64318, 37990, 11395, 50481, 24173, 63194, 36668, 10346, 49371, 22900, 62052, 35539, 9007, 48239, 21726, 60722, 34345, 7920, 46876, 20572, 59623, 33051, 6747, 45805, 19200, 58441, 31997, 5409, 44613, 18161, 57124, 30792, 53873, 19147, 58174, 6260, 45260, 10528, 18022, 65244, 5928, 35956, 9422, 45516, 10609, 32903, 31693, 54140, 19098, 44888, '&', 39123, 'f', 39067, 12583, 51761, 25309, 64358, 38002, 11420, 50472, 24113, 63132, 36666, 10348, 49371, 22843, 62056};
        private static long afInfoLog = -3480638993451476821L;

        /* renamed from: com.appsflyer.internal.AFa1ySDK$AFa1ySDK$AFa1xSDK */
        /* loaded from: classes.dex */
        public static class AFa1xSDK {
            private static char[] AFInAppEventParameterName = {'0'};
            private static char AFKeystoreWrapper = 1;
            private static int valueOf = 1;
            private static int values;

            private static byte[] AFInAppEventParameterName(String str) {
                char c10;
                char c11;
                int i6 = values + 45;
                valueOf = i6 % 128;
                if (i6 % 2 == 0) {
                    c10 = 'L';
                } else {
                    c10 = 26;
                }
                if (c10 != 'L') {
                    byte[] bytes = str.getBytes();
                    int i10 = valueOf + 43;
                    values = i10 % 128;
                    if (i10 % 2 != 0) {
                        c11 = '\t';
                    } else {
                        c11 = 'W';
                    }
                    if (c11 != '\t') {
                        return bytes;
                    }
                    throw null;
                }
                str.getBytes();
                throw null;
            }

            private static String AFInAppEventType(byte[] bArr) {
                char c10;
                char c11;
                StringBuilder sb2 = new StringBuilder();
                int length = bArr.length;
                int i6 = 0;
                while (true) {
                    if (i6 < length) {
                        c10 = '7';
                    } else {
                        c10 = '\b';
                    }
                    if (c10 != '7') {
                        break;
                    }
                    String hexString = Integer.toHexString(bArr[i6]);
                    if (hexString.length() == 1) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(valueOf(1 - KeyEvent.getDeadChar(0, 0), "e", (byte) ('e' - AndroidCharacter.getMirror('0'))).intern());
                        sb3.append(hexString);
                        hexString = sb3.toString();
                        int i10 = values + 57;
                        valueOf = i10 % 128;
                        int i11 = i10 % 2;
                    }
                    sb2.append(hexString);
                    i6++;
                }
                String obj = sb2.toString();
                int i12 = valueOf + R.styleable.AppCompatTheme_windowFixedWidthMinor;
                values = i12 % 128;
                if (i12 % 2 != 0) {
                    c11 = '=';
                } else {
                    c11 = 'H';
                }
                if (c11 != '=') {
                    return obj;
                }
                throw null;
            }

            public static String AFKeystoreWrapper(String str) {
                boolean z10;
                int i6 = values + 99;
                valueOf = i6 % 128;
                if (i6 % 2 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                byte[] AFInAppEventParameterName2 = AFInAppEventParameterName(str);
                if (!z10) {
                    return AFInAppEventType(values(AFInAppEventParameterName2));
                }
                AFInAppEventType(values(AFInAppEventParameterName2));
                throw null;
            }

            /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
                r9 = r9;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static String valueOf(int i6, String str, byte b10) {
                char[] cArr;
                String str2;
                if (str != null) {
                    cArr = str.toCharArray();
                }
                char[] cArr2 = cArr;
                synchronized (AFf1tSDK.afRDLog) {
                    char[] cArr3 = AFInAppEventParameterName;
                    char c10 = AFKeystoreWrapper;
                    char[] cArr4 = new char[i6];
                    if (i6 % 2 != 0) {
                        i6--;
                        cArr4[i6] = (char) (cArr2[i6] - b10);
                    }
                    if (i6 > 1) {
                        AFf1tSDK.values = 0;
                        while (true) {
                            int i10 = AFf1tSDK.values;
                            if (i10 >= i6) {
                                break;
                            }
                            AFf1tSDK.AFInAppEventParameterName = cArr2[i10];
                            AFf1tSDK.AFInAppEventType = cArr2[AFf1tSDK.values + 1];
                            if (AFf1tSDK.AFInAppEventParameterName == AFf1tSDK.AFInAppEventType) {
                                cArr4[AFf1tSDK.values] = (char) (AFf1tSDK.AFInAppEventParameterName - b10);
                                cArr4[AFf1tSDK.values + 1] = (char) (AFf1tSDK.AFInAppEventType - b10);
                            } else {
                                AFf1tSDK.valueOf = AFf1tSDK.AFInAppEventParameterName / c10;
                                AFf1tSDK.AFLogger = AFf1tSDK.AFInAppEventParameterName % c10;
                                AFf1tSDK.AFKeystoreWrapper = AFf1tSDK.AFInAppEventType / c10;
                                AFf1tSDK.afInfoLog = AFf1tSDK.AFInAppEventType % c10;
                                if (AFf1tSDK.AFLogger == AFf1tSDK.afInfoLog) {
                                    AFf1tSDK.valueOf = ((AFf1tSDK.valueOf + c10) - 1) % c10;
                                    AFf1tSDK.AFKeystoreWrapper = ((AFf1tSDK.AFKeystoreWrapper + c10) - 1) % c10;
                                    int i11 = (AFf1tSDK.valueOf * c10) + AFf1tSDK.AFLogger;
                                    int i12 = (AFf1tSDK.AFKeystoreWrapper * c10) + AFf1tSDK.afInfoLog;
                                    int i13 = AFf1tSDK.values;
                                    cArr4[i13] = cArr3[i11];
                                    cArr4[i13 + 1] = cArr3[i12];
                                } else if (AFf1tSDK.valueOf == AFf1tSDK.AFKeystoreWrapper) {
                                    AFf1tSDK.AFLogger = ((AFf1tSDK.AFLogger + c10) - 1) % c10;
                                    AFf1tSDK.afInfoLog = ((AFf1tSDK.afInfoLog + c10) - 1) % c10;
                                    int i14 = (AFf1tSDK.valueOf * c10) + AFf1tSDK.AFLogger;
                                    int i15 = (AFf1tSDK.AFKeystoreWrapper * c10) + AFf1tSDK.afInfoLog;
                                    int i16 = AFf1tSDK.values;
                                    cArr4[i16] = cArr3[i14];
                                    cArr4[i16 + 1] = cArr3[i15];
                                } else {
                                    int i17 = (AFf1tSDK.valueOf * c10) + AFf1tSDK.afInfoLog;
                                    int i18 = (AFf1tSDK.AFKeystoreWrapper * c10) + AFf1tSDK.AFLogger;
                                    int i19 = AFf1tSDK.values;
                                    cArr4[i19] = cArr3[i17];
                                    cArr4[i19 + 1] = cArr3[i18];
                                }
                            }
                            AFf1tSDK.values += 2;
                        }
                    }
                    str2 = new String(cArr4);
                }
                return str2;
            }

            private static byte[] values(byte[] bArr) {
                char c10;
                int i6 = values + 35;
                valueOf = i6 % 128;
                int i10 = i6 % 2;
                int i11 = 0;
                while (true) {
                    if (i11 < bArr.length) {
                        c10 = 'P';
                    } else {
                        c10 = 'C';
                    }
                    if (c10 != 'P') {
                        int i12 = valueOf + 85;
                        values = i12 % 128;
                        int i13 = i12 % 2;
                        return bArr;
                    }
                    bArr[i11] = (byte) (bArr[i11] ^ ((i11 % 2) + 42));
                    i11++;
                }
            }
        }

        public C0126AFa1ySDK(Map<String, Object> map, Context context) {
            this.values = map;
            this.AFKeystoreWrapper = context;
            put(AFInAppEventType(), valueOf());
        }

        private static StringBuilder AFInAppEventType(String... strArr) {
            ArrayList arrayList = new ArrayList();
            int i6 = 0;
            while (i6 < 3) {
                int i10 = afErrorLog + 47;
                AFLogger = i10 % 128;
                if ((i10 % 2 == 0 ? '8' : 'O') != '8') {
                    arrayList.add(Integer.valueOf(strArr[i6].length()));
                    i6++;
                } else {
                    arrayList.add(Integer.valueOf(strArr[i6].length()));
                    i6 += 57;
                }
            }
            Collections.sort(arrayList);
            int intValue = ((Integer) arrayList.get(0)).intValue();
            StringBuilder sb2 = new StringBuilder();
            int i11 = 0;
            while (true) {
                if (i11 >= intValue) {
                    return sb2;
                }
                int i12 = AFLogger + 7;
                afErrorLog = i12 % 128;
                int i13 = i12 % 2;
                Integer num = null;
                int i14 = 0;
                while (true) {
                    if ((i14 < 3 ? (char) 20 : '6') != 20) {
                        break;
                    }
                    int i15 = AFLogger + 15;
                    afErrorLog = i15 % 128;
                    int i16 = i15 % 2;
                    int charAt = strArr[i14].charAt(i11);
                    if ((num == null ? '\n' : '2') == '2') {
                        charAt ^= num.intValue();
                    }
                    num = Integer.valueOf(charAt);
                    i14++;
                }
                sb2.append(Integer.toHexString(num.intValue()));
                i11++;
            }
        }

        private String valueOf() {
            String obj;
            boolean z10;
            boolean z11;
            int i6;
            boolean z12;
            try {
                String obj2 = this.values.get(AFInAppEventType(null, "\u0089\u0086\u0081\u0084\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", null, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 127).intern()).toString();
                String obj3 = this.values.get(AFInAppEventType(null, "\u0087\u0084\u0081\u008f\u0099\u009b\u0095 \u0081\u009f\u0084\u0088\u0096\u0085\u0082", null, 127 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern()).toString();
                String replaceAll = AFInAppEventType(null, "£¢\u009e¢¡", null, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 127).intern().replaceAll(values(4 - TextUtils.indexOf((CharSequence) "", '0', 0), 5 - View.getDefaultSize(0, 0), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1)).intern(), "");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(obj2);
                sb2.append(obj3);
                sb2.append(replaceAll);
                String values = AFb1tSDK.values(sb2.toString());
                StringBuilder sb3 = new StringBuilder("");
                sb3.append(values.substring(0, 16));
                obj = sb3.toString();
            } catch (Exception e10) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(values(TextUtils.getTrimmedLength("") + 44, KeyEvent.keyCodeFromString("") + 10, (char) (ViewConfiguration.getTouchSlop() >> 8)).intern());
                sb4.append(e10);
                AFLogger.afRDLog(sb4.toString());
                StringBuilder sb5 = new StringBuilder("");
                sb5.append(values(TextUtils.getOffsetBefore("", 0) + 18, 54 - TextUtils.indexOf("", ""), (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 35032)).intern());
                obj = sb5.toString();
            }
            String str = obj;
            try {
                Intent registerReceiver = this.AFKeystoreWrapper.registerReceiver(null, new IntentFilter(values((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 36, (ViewConfiguration.getPressedStateDuration() >> 16) + 72, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern()));
                if (registerReceiver != null) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                int i10 = -2700;
                if (!z10) {
                    int i11 = AFLogger + 25;
                    afErrorLog = i11 % 128;
                    int i12 = i11 % 2;
                    i10 = registerReceiver.getIntExtra(values(TextUtils.getOffsetBefore("", 0) + 11, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + R.styleable.AppCompatTheme_textColorAlertDialogListItem, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 53766)).intern(), -2700);
                    int i13 = afErrorLog + 39;
                    AFLogger = i13 % 128;
                    int i14 = i13 % 2;
                }
                String str2 = this.AFKeystoreWrapper.getApplicationInfo().nativeLibraryDir;
                if (str2 != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    if (str2.contains(AFInAppEventType(null, "¡¤\u009a", null, 127 - ((Process.getThreadPriority(0) + 20) >> 6)).intern())) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    if (!z12) {
                        int i15 = AFLogger + 99;
                        afErrorLog = i15 % 128;
                        int i16 = i15 % 2;
                        i6 = 1;
                        int size = ((SensorManager) this.AFKeystoreWrapper.getSystemService(values(6 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (Process.myTid() >> 22) + R.styleable.AppCompatTheme_windowFixedHeightMajor, (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 45503)).intern())).getSensorList(-1).size();
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(values(1 - TextUtils.getTrimmedLength(""), TextUtils.indexOf((CharSequence) "", '0') + 127, (char) (TextUtils.getOffsetBefore("", 0) + 44858)).intern());
                        sb6.append(i10);
                        sb6.append(values(Color.red(0) + 2, (Process.myPid() >> 22) + 127, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern());
                        sb6.append(i6);
                        sb6.append(AFInAppEventType(null, "\u0088¥", null, (Process.myPid() >> 22) + 127).intern());
                        sb6.append(size);
                        sb6.append(AFInAppEventType(null, "\u0089¥", null, 127 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern());
                        sb6.append(this.values.size());
                        String obj4 = sb6.toString();
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append(str);
                        sb7.append(AFa1xSDK.AFKeystoreWrapper(obj4));
                        return sb7.toString();
                    }
                }
                i6 = 0;
                int size2 = ((SensorManager) this.AFKeystoreWrapper.getSystemService(values(6 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (Process.myTid() >> 22) + R.styleable.AppCompatTheme_windowFixedHeightMajor, (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 45503)).intern())).getSensorList(-1).size();
                StringBuilder sb62 = new StringBuilder();
                sb62.append(values(1 - TextUtils.getTrimmedLength(""), TextUtils.indexOf((CharSequence) "", '0') + 127, (char) (TextUtils.getOffsetBefore("", 0) + 44858)).intern());
                sb62.append(i10);
                sb62.append(values(Color.red(0) + 2, (Process.myPid() >> 22) + 127, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern());
                sb62.append(i6);
                sb62.append(AFInAppEventType(null, "\u0088¥", null, (Process.myPid() >> 22) + 127).intern());
                sb62.append(size2);
                sb62.append(AFInAppEventType(null, "\u0089¥", null, 127 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern());
                sb62.append(this.values.size());
                String obj42 = sb62.toString();
                StringBuilder sb72 = new StringBuilder();
                sb72.append(str);
                sb72.append(AFa1xSDK.AFKeystoreWrapper(obj42));
                return sb72.toString();
            } catch (Exception e11) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(values(45 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollBarSize() >> 8) + 10, (char) ExpandableListView.getPackedPositionType(0L)).intern());
                sb8.append(e11);
                AFLogger.afRDLog(sb8.toString());
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str);
                sb9.append(values(16 - Color.red(0), MotionEvent.axisFromString("") + 130, (char) View.MeasureSpec.makeMeasureSpec(0, 0)).intern());
                return sb9.toString();
            }
        }

        private static String values(int i6, int i10, char c10) {
            String str;
            synchronized (AFf1vSDK.AFInAppEventParameterName) {
                char[] cArr = new char[i6];
                AFf1vSDK.AFInAppEventType = 0;
                while (true) {
                    int i11 = AFf1vSDK.AFInAppEventType;
                    if (i11 < i6) {
                        cArr[i11] = (char) ((afDebugLog[i10 + i11] ^ (i11 * afInfoLog)) ^ c10);
                        AFf1vSDK.AFInAppEventType = i11 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            }
            return str;
        }

        private String AFInAppEventType() {
            try {
                String num = Integer.toString(Build.VERSION.SDK_INT);
                String obj = this.values.get(AFInAppEventType(null, "\u0089\u0086\u0081\u0084\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", null, 127 - KeyEvent.normalizeMetaState(0)).intern()).toString();
                String obj2 = this.values.get(values(TextUtils.getOffsetAfter("", 0) + 5, ViewConfiguration.getMinimumFlingVelocity() >> 16, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern()).toString();
                if (!(obj2 != null)) {
                    int i6 = afErrorLog + R.styleable.AppCompatTheme_tooltipFrameBackground;
                    AFLogger = i6 % 128;
                    int i10 = i6 % 2;
                    obj2 = AFInAppEventType(null, "\u008f\u008a\u008e\u008d\u008c\u0083\u008b\u008a", null, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 127).intern();
                }
                StringBuilder sb2 = new StringBuilder(obj);
                sb2.reverse();
                StringBuilder AFInAppEventType2 = AFInAppEventType(num, obj2, sb2.toString());
                int length = AFInAppEventType2.length();
                if (length > 4) {
                    int i11 = AFLogger + 11;
                    afErrorLog = i11 % 128;
                    if (i11 % 2 != 0) {
                        AFInAppEventType2.delete(2, length);
                    } else {
                        AFInAppEventType2.delete(4, length);
                    }
                } else {
                    while (length < 4) {
                        length++;
                        AFInAppEventType2.append('1');
                    }
                }
                AFInAppEventType2.insert(0, AFInAppEventType(null, "\u0082\u0087\u0090", null, 127 - Color.blue(0)).intern());
                String obj3 = AFInAppEventType2.toString();
                int i12 = AFLogger + 69;
                afErrorLog = i12 % 128;
                if ((i12 % 2 != 0 ? '.' : '\b') != '\b') {
                    int i13 = 23 / 0;
                    return obj3;
                }
                return obj3;
            } catch (Exception e10) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(AFInAppEventType(null, "\u0093\u009d\u0095\u009c\u0085\u0084\u0089\u0087\u009b\u009a\u0087\u0093\u0099\u0084\u0085\u0098\u0093\u0097\u0087\u0090\u0093\u0082\u0087\u0090\u0093\u0094\u0095\u0085\u0084\u0081\u0096\u0087\u0095\u0087\u0094\u0093\u0092\u0087\u0091\u0085\u0081\u0082", null, 127 - TextUtils.indexOf("", "", 0, 0)).intern());
                sb3.append(e10);
                AFLogger.afRDLog(sb3.toString());
                return AFInAppEventType(null, "\u009e\u009e\u009e\u009e\u0082\u0087\u0090", null, TextUtils.getTrimmedLength("") + 127).intern();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
            r7 = r7;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String AFInAppEventType(int[] iArr, String str, String str2, int i6) {
            char[] cArr;
            if (str2 != null) {
                cArr = str2.toCharArray();
            }
            char[] cArr2 = cArr;
            byte[] bArr = str;
            if (str != null) {
                bArr = str.getBytes("ISO-8859-1");
            }
            byte[] bArr2 = bArr;
            synchronized (AFf1nSDK.values) {
                char[] cArr3 = valueOf;
                int i10 = AFInAppEventType;
                if (afRDLog) {
                    int length = bArr2.length;
                    AFf1nSDK.AFKeystoreWrapper = length;
                    char[] cArr4 = new char[length];
                    AFf1nSDK.AFInAppEventParameterName = 0;
                    while (AFf1nSDK.AFInAppEventParameterName < AFf1nSDK.AFKeystoreWrapper) {
                        int i11 = AFf1nSDK.AFInAppEventParameterName;
                        int i12 = AFf1nSDK.AFInAppEventParameterName;
                        cArr4[i11] = (char) (cArr3[bArr2[(AFf1nSDK.AFKeystoreWrapper - 1) - i12] + i6] - i10);
                        AFf1nSDK.AFInAppEventParameterName = i12 + 1;
                    }
                    return new String(cArr4);
                } else if (AFInAppEventParameterName) {
                    int length2 = cArr2.length;
                    AFf1nSDK.AFKeystoreWrapper = length2;
                    char[] cArr5 = new char[length2];
                    AFf1nSDK.AFInAppEventParameterName = 0;
                    while (AFf1nSDK.AFInAppEventParameterName < AFf1nSDK.AFKeystoreWrapper) {
                        int i13 = AFf1nSDK.AFInAppEventParameterName;
                        int i14 = AFf1nSDK.AFInAppEventParameterName;
                        cArr5[i13] = (char) (cArr3[cArr2[(AFf1nSDK.AFKeystoreWrapper - 1) - i14] - i6] - i10);
                        AFf1nSDK.AFInAppEventParameterName = i14 + 1;
                    }
                    return new String(cArr5);
                } else {
                    int length3 = iArr.length;
                    AFf1nSDK.AFKeystoreWrapper = length3;
                    char[] cArr6 = new char[length3];
                    AFf1nSDK.AFInAppEventParameterName = 0;
                    while (AFf1nSDK.AFInAppEventParameterName < AFf1nSDK.AFKeystoreWrapper) {
                        int i15 = AFf1nSDK.AFInAppEventParameterName;
                        int i16 = AFf1nSDK.AFInAppEventParameterName;
                        cArr6[i15] = (char) (cArr3[iArr[(AFf1nSDK.AFKeystoreWrapper - 1) - i16] - i6] - i10);
                        AFf1nSDK.AFInAppEventParameterName = i16 + 1;
                    }
                    return new String(cArr6);
                }
            }
        }
    }

    private static boolean AFInAppEventType(String str) {
        int i6 = values + R.styleable.AppCompatTheme_switchStyle;
        AFInAppEventType = i6 % 128;
        if (i6 % 2 == 0) {
        }
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private static String AFInAppEventType(Context context) {
        int i6 = values + 3;
        AFInAppEventType = i6 % 128;
        if (i6 % 2 == 0) {
            if (!System.getProperties().containsKey(valueOf(20 / Color.blue(1), 76 >> TextUtils.lastIndexOf("", '^'), (char) TextUtils.getOffsetAfter("", 1)).intern())) {
                return null;
            }
        } else {
            if ((System.getProperties().containsKey(valueOf(14 - Color.blue(0), 94 - TextUtils.lastIndexOf("", '0'), (char) TextUtils.getOffsetAfter("", 0)).intern()) ? '+' : (char) 6) == 6) {
                return null;
            }
        }
        try {
            Matcher matcher = Pattern.compile(AFInAppEventType("쑴ꗲ쟱푉쑚蕨蚾똅䛇ڨϹシ쇞菫", (-1) - Process.getGidForName("")).intern()).matcher(context.getCacheDir().getPath().replace(valueOf(7 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu, (char) (8402 - ((Process.getThreadPriority(0) + 20) >> 6))).intern(), ""));
            if (matcher.find()) {
                int i10 = AFInAppEventType + 39;
                values = i10 % 128;
                return (i10 % 2 != 0 ? '\n' : (char) 24) != '\n' ? matcher.group(1) : matcher.group(0);
            }
            return null;
        } catch (Exception e10) {
            AFb1qSDK AFInAppEventParameterName2 = AFb1qSDK.AFInAppEventParameterName();
            String intern = valueOf(18 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + R.styleable.AppCompatTheme_tooltipFrameBackground, (char) (12803 - (ViewConfiguration.getMaximumFlingVelocity() >> 16))).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(AFInAppEventType("\u1976籞駄⮌ᤰ岏\ud8cd䧰鯓\udf4a巄켨Კ婎\udf43䱹酂풎倇솽ሕ垆헁䚼铆퉏嚐쐴\u09d6䴙졍奨詞쾎䴁\udea4༕䪋컔叨臟앁䎊텦˖", TextUtils.indexOf("", "", 0)).intern());
            sb2.append(e10);
            AFInAppEventParameterName2.AFInAppEventParameterName(intern, sb2.toString());
            return null;
        }
    }

    private static String valueOf(Context context) {
        int i6 = AFInAppEventType + 79;
        values = i6 % 128;
        int i10 = i6 % 2;
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
            int i11 = values + 43;
            int i12 = i11 % 128;
            AFInAppEventType = i12;
            int i13 = i11 % 2;
            int i14 = i12 + R.styleable.AppCompatTheme_toolbarStyle;
            values = i14 % 128;
            int i15 = i14 % 2;
            return str;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static String valueOf(int i6, int i10, char c10) {
        String str;
        synchronized (AFf1vSDK.AFInAppEventParameterName) {
            char[] cArr = new char[i6];
            AFf1vSDK.AFInAppEventType = 0;
            while (true) {
                int i11 = AFf1vSDK.AFInAppEventType;
                if (i11 < i6) {
                    cArr[i11] = (char) ((AFInAppEventParameterName[i10 + i11] ^ (i11 * valueOf)) ^ c10);
                    AFf1vSDK.AFInAppEventType = i11 + 1;
                } else {
                    str = new String(cArr);
                }
            }
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r8 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String AFInAppEventType(String str, int i6) {
        char[] cArr;
        String str2;
        int i10;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (AFf1sSDK.AFInAppEventParameterName) {
            char[] AFKeystoreWrapper2 = AFf1sSDK.AFKeystoreWrapper(AFKeystoreWrapper, cArr2, i6);
            AFf1sSDK.values = 4;
            while (true) {
                int i11 = AFf1sSDK.values;
                if (i11 < AFKeystoreWrapper2.length) {
                    AFf1sSDK.AFInAppEventType = i11 - 4;
                    AFKeystoreWrapper2[AFf1sSDK.values] = (char) ((AFKeystoreWrapper2[i10] ^ AFKeystoreWrapper2[i10 % 4]) ^ (AFf1sSDK.AFInAppEventType * AFKeystoreWrapper));
                    AFf1sSDK.values++;
                } else {
                    str2 = new String(AFKeystoreWrapper2, 4, AFKeystoreWrapper2.length - 4);
                }
            }
        }
        return str2;
    }
}
