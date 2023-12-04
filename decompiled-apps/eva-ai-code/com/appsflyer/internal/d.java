package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.AFLogger;
import com.google.common.base.Ascii;
import io.grpc.netty.shaded.io.netty.handler.codec.http.HttpConstants;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes2.dex */
public final class d {
    private static int AFInAppEventParameterName = 654970919;
    private static int AFInAppEventType = 46;
    private static long AFKeystoreWrapper = 2500677876331219564L;
    private static int AFLogger$LogLevel = 1;
    private static short[] AppsFlyer2dXConversionCallback = null;
    private static int getLevel = 0;
    private static byte[] valueOf = {-28, 82, -75, -77, -75, -112, -75, 92, 78, -75, -126, 85, -75, -107, 1, -75, -75, -75, -23, 71, -72, 65, 77, 86, 97, -115, -73, 85, -82, 87, -74, 85, -67, 126, -114, -65, -66, -71, 74, -78, 73, -31, -89, 77, 119, -22, 95, -89, Ascii.DLE, -102, -85, -86, -83, 94, -90, 93, -44, 122, -32, 47, 35, -46, 37, -33, 96, -103, 32, Ascii.GS, -21, -51, 51, -47, -40, 90, -94, -91, 89, -109, -5, -52, -26, -43, HttpConstants.COMMA, -33, 46, 33, 40, -63, 57, 111, -110, -34, 33, -40, 125, -110, -34, 57, -37, 122, -111, -41, 47, 40, -44, 105, -122, 37, -44, 109, -101, -47, 126, -106, -43, -45, 41, HttpConstants.DOUBLE_QUOTE, 49};
    private static int values = -1788657313;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String AFKeystoreWrapper(Context context, long j) {
        String intern;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        if ((valueOf(AFKeystoreWrapper("굱鿐괐ᗒ\uedfd論犁\uedb7蒮⮥팑╭﹥䉹薩ὶ퀑飄籺\uf18dை껒嘱ꯖ絭앩ࣅ艫圾ᬲ\ue37c璞軀ㆂ픴⻄\ue094䡎", Color.red(0)).intern()) ? 'L' : 'Z') != 'L') {
            intern = AFKeystoreWrapper("嗞磸嗮륣\ue11d", ViewConfiguration.getWindowTouchSlop() >> 8).intern();
        } else {
            int i = AFLogger$LogLevel + 101;
            getLevel = i % 128;
            intern = !(i % 2 != 0) ? AFKeystoreWrapper("臏䓗臾႖\uea64", View.getDefaultSize(0, 0)).intern() : AFKeystoreWrapper("臏䓗臾႖\uea64", View.getDefaultSize(0, 1)).intern();
            int i2 = AFLogger$LogLevel + 63;
            getLevel = i2 % 128;
            int i3 = i2 % 2;
        }
        sb2.append(intern);
        sb.append(AFKeystoreWrapper(context, sb2));
        try {
            sb.append(new SimpleDateFormat(AFKeystoreWrapper((Process.myTid() >> 22) - 47, (byte) ((-75) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 1788657434 - View.resolveSize(0, 0), (short) (TextUtils.indexOf((CharSequence) "", '0') + 1), KeyEvent.getDeadChar(0, 0) - 654970919).intern(), Locale.US).format(new Date(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime)));
            int i4 = AFLogger$LogLevel + 101;
            getLevel = i4 % 128;
            int i5 = i4 % 2;
            sb.append(j);
            valueOf(sb3);
            return valueOf(AFInAppEventType(AFInAppEventType(values(sb.toString()), sb2.toString(), 17), sb3.toString(), 27), Long.valueOf(j));
        } catch (PackageManager.NameNotFoundException unused) {
            return AFKeystoreWrapper("Ⲿ倨Ⳝ\uda25膠锚ﳻ揚կ\ue451뼘\uab1b翧趀\ue9ad配减圶ၱ羽詊慢㨌▻ﳺઑ擜\u0c5e훺풝轩齃ཛྷ︤뤹ꃿ", TextUtils.indexOf("", "", 0)).intern();
        }
    }

    private static String valueOf(String str, Long l) {
        int i = getLevel + 39;
        AFLogger$LogLevel = i % 128;
        int i2 = i % 2;
        long j = 0;
        if ((str != null) && l != null && str.length() == 32) {
            StringBuilder sb = new StringBuilder(str);
            String obj = l.toString();
            int i3 = AFLogger$LogLevel + 9;
            getLevel = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 0;
            int i6 = 0;
            while (i5 < obj.length()) {
                int i7 = getLevel + 5;
                AFLogger$LogLevel = i7 % 128;
                if (i7 % 2 == 0) {
                    i6 <<= Character.getNumericValue(obj.charAt(i5));
                    i5 += 113;
                } else {
                    i6 += Character.getNumericValue(obj.charAt(i5));
                    i5++;
                }
            }
            String hexString = Integer.toHexString(i6);
            sb.replace(7, hexString.length() + 7, hexString);
            int i8 = 0;
            while (true) {
                if (i8 >= sb.length()) {
                    break;
                }
                j += Character.getNumericValue(sb.charAt(i8));
                i8++;
            }
            while (j > 100) {
                j %= 100;
            }
            sb.insert(23, (int) j);
            if (j < 10) {
                int i9 = getLevel + 23;
                AFLogger$LogLevel = i9 % 128;
                int i10 = i9 % 2;
                sb.insert(23, AFKeystoreWrapper("嗞磸嗮륣\ue11d", TextUtils.indexOf("", "", 0)).intern());
                int i11 = AFLogger$LogLevel + 33;
                getLevel = i11 % 128;
                int i12 = i11 % 2;
            }
            return sb.toString();
        }
        return AFKeystoreWrapper("Ⲿ倨Ⳝ\uda25膠锚ﳻ揚կ\ue451뼘\uab1b翧趀\ue9ad配减圶ၱ羽詊慢㨌▻ﳺઑ擜\u0c5e훺풝轩齃ཛྷ︤뤹ꃿ", (-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern();
    }

    private static boolean valueOf(String str) {
        int i = AFLogger$LogLevel + 111;
        getLevel = i % 128;
        if (i % 2 != 0) {
        }
        try {
            Class.forName(str);
            int i2 = AFLogger$LogLevel + 31;
            getLevel = i2 % 128;
            int i3 = i2 % 2;
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private static String AFInAppEventType(String str, String str2, int i) {
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(i, AFInAppEventType(str2).charAt(0));
        String obj = sb.toString();
        int i2 = getLevel + 123;
        AFLogger$LogLevel = i2 % 128;
        int i3 = i2 % 2;
        return obj;
    }

    private static String AFInAppEventType(String str) {
        int i = getLevel + 59;
        AFLogger$LogLevel = i % 128;
        int i2 = i % 2;
        String num = Integer.toString(Integer.parseInt(str, 2), 16);
        int i3 = getLevel + 5;
        AFLogger$LogLevel = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 31 / 0;
        }
        return num;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
        if ((!valueOf(AFKeystoreWrapper("Ⲵ軃ⳕӁ䕅凹宰쒆ի㪶箩\u0c5c羻卼ⵓ㙠凅觋퓙\ud8b7訆뾖ﺐ苣ﲪ푾ꁪꭗ훦", android.graphics.Color.alpha(0)).intern())) != true) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
        if (valueOf(AFKeystoreWrapper("Ⲵ軃ⳕӁ䕅凹宰쒆ի㪶箩\u0c5c羻卼ⵓ㙠凅觋퓙\ud8b7訆뾖ﺐ苣ﲪ푾ꁪꭗ훦", android.graphics.Color.alpha(1)).intern()) != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
        r1 = com.appsflyer.internal.d.AFLogger$LogLevel + 69;
        com.appsflyer.internal.d.getLevel = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
        if ((r1 % 2) == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
        if (r1 == true) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
        r1 = AFKeystoreWrapper("臏䓗臾႖\uea64", (-1) << (android.os.SystemClock.uptimeMillis() > 1 ? 1 : (android.os.SystemClock.uptimeMillis() == 1 ? 0 : -1))).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0075, code lost:
        r1 = AFKeystoreWrapper("臏䓗臾႖\uea64", (android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1)) - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0081, code lost:
        r1 = AFKeystoreWrapper("嗞磸嗮륣\ue11d", (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008b, code lost:
        r1 = r1.intern();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void valueOf(StringBuilder sb) {
        String intern;
        String intern2;
        int i = getLevel + 75;
        AFLogger$LogLevel = i % 128;
        if ((i % 2 == 0 ? (char) 3 : 'W') != 3) {
        }
        sb.append(intern);
        if (valueOf(AFKeystoreWrapper((-47) - View.combineMeasuredStates(0, 0), (byte) (TextUtils.getOffsetAfter("", 0) + 68), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1788657409, (short) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (-654970902) - TextUtils.lastIndexOf("", '0')).intern())) {
            intern2 = AFKeystoreWrapper("臏䓗臾႖\uea64", TextUtils.indexOf("", "", 0, 0)).intern();
            int i2 = AFLogger$LogLevel + 67;
            getLevel = i2 % 128;
            int i3 = i2 % 2;
        } else {
            intern2 = AFKeystoreWrapper("嗞磸嗮륣\ue11d", TextUtils.indexOf("", "", 0)).intern();
        }
        sb.append(intern2);
        sb.append((!(!valueOf(AFKeystoreWrapper("秠ᔅ禁鼇䥯巓\ud914䘢倿ꅰ瞃軸⫯좺ⅹ듇҃ሀ\ud8e9娕\udf74⑈\uf284M", ExpandableListView.getPackedPositionGroup(0L)).intern())) ? AFKeystoreWrapper("臏䓗臾႖\uea64", KeyEvent.normalizeMetaState(0)) : AFKeystoreWrapper("嗞磸嗮륣\ue11d", (-1) - ExpandableListView.getPackedPositionChild(0L))).intern());
        sb.append((valueOf(AFKeystoreWrapper((-47) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (byte) (79 - TextUtils.lastIndexOf("", '0', 0)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1788657410, (short) ((-16777216) - Color.rgb(0, 0, 0)), (-671748094) - Color.rgb(0, 0, 0)).intern()) ? AFKeystoreWrapper("臏䓗臾႖\uea64", Drawable.resolveOpacity(0, 0)) : AFKeystoreWrapper("嗞磸嗮륣\ue11d", ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern());
    }

    private static String values(String str) {
        int i = getLevel + 83;
        AFLogger$LogLevel = i % 128;
        if (!(i % 2 == 0)) {
            return ag.AFKeystoreWrapper(ag.AFInAppEventParameterName(str));
        }
        int i2 = 87 / 0;
        return ag.AFKeystoreWrapper(ag.AFInAppEventParameterName(str));
    }

    private static String AFKeystoreWrapper(String str) {
        int i = getLevel + 103;
        AFLogger$LogLevel = i % 128;
        if (i % 2 != 0 ? !str.contains(AFKeystoreWrapper("均刄坩玨ס", ViewConfiguration.getMaximumDrawingCacheSize() >> 24).intern()) : !str.contains(AFKeystoreWrapper("均刄坩玨ס", ViewConfiguration.getMaximumDrawingCacheSize() << 23).intern())) {
            return str;
        }
        String[] split = str.split(AFKeystoreWrapper((-46) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (byte) (Color.argb(0, 0, 0, 0) - 88), ImageFormat.getBitsPerPixel(0) + 1788657406, (short) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 654970863).intern());
        int length = split.length;
        StringBuilder sb = new StringBuilder();
        int i2 = length - 1;
        sb.append(split[i2]);
        sb.append(AFKeystoreWrapper("均刄坩玨ס", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern());
        int i3 = getLevel + 105;
        AFLogger$LogLevel = i3 % 128;
        int i4 = i3 % 2;
        int i5 = 1;
        while (true) {
            if (i5 < i2 ? true : true) {
                int i6 = getLevel + 119;
                AFLogger$LogLevel = i6 % 128;
                if (i6 % 2 == 0) {
                    sb.append(split[i5]);
                    sb.append(AFKeystoreWrapper("均刄坩玨ס", 0 / TextUtils.indexOf((CharSequence) "", '7', 0, 1)).intern());
                    i5 += 79;
                } else {
                    sb.append(split[i5]);
                    sb.append(AFKeystoreWrapper("均刄坩玨ס", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1).intern());
                    i5++;
                }
            } else {
                sb.append(split[0]);
                return sb.toString();
            }
        }
    }

    private static String values(Context context) {
        String str = null;
        if ((System.getProperties().containsKey(AFKeystoreWrapper((ViewConfiguration.getMinimumFlingVelocity() >> 16) + (-47), (byte) (38 - View.combineMeasuredStates(0, 0)), 1788657418 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (short) (ViewConfiguration.getPressedStateDuration() >> 16), (-654970860) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern()) ? 'G' : '^') != '^') {
            int i = getLevel + 33;
            AFLogger$LogLevel = i % 128;
            int i2 = i % 2;
            try {
                Matcher matcher = Pattern.compile(AFKeystoreWrapper("鵴ꕴ鵚⼲尸䣏່釐뒷ᅂ折夊츾碑", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern()).matcher(context.getCacheDir().getPath().replace(AFKeystoreWrapper((ViewConfiguration.getScrollBarSize() >> 8) - 47, (byte) (TextUtils.getCapsMode("", 0, 0) - 89), Color.red(0) + 1788657360, (short) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), Color.argb(0, 0, 0, 0) - 654970847).intern(), ""));
                if (matcher.find()) {
                    int i3 = getLevel + 79;
                    AFLogger$LogLevel = i3 % 128;
                    int i4 = i3 % 2;
                    str = matcher.group(1);
                }
                int i5 = AFLogger$LogLevel + 45;
                getLevel = i5 % 128;
                int i6 = i5 % 2;
            } catch (Exception e) {
                ak AFInAppEventType2 = ak.AFInAppEventType();
                String intern = AFKeystoreWrapper("奱倹夲\uda3d\ue1a1\uf51c撾ﮙ炪\ue456\udf5c㌀\u0a54趍觺क़␑圱瀠\ue7a2\uffdf", 1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern();
                StringBuilder sb = new StringBuilder();
                sb.append(AFKeystoreWrapper(((Process.getThreadPriority(0) + 20) >> 6) - 47, (byte) (Color.blue(0) + 42), 1788657382 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (short) (ViewConfiguration.getKeyRepeatTimeout() >> 16), Drawable.resolveOpacity(0, 0) - 654970841).intern());
                sb.append(e);
                AFInAppEventType2.AFInAppEventParameterName(intern, sb.toString());
            }
        }
        return str;
    }

    private static String AFInAppEventType(Context context) {
        PackageManager packageManager;
        String packageName;
        int i = getLevel + 21;
        AFLogger$LogLevel = i % 128;
        Object obj = null;
        try {
            if (!(i % 2 == 0)) {
                packageManager = context.getPackageManager();
                packageName = context.getPackageName();
            } else {
                packageManager = context.getPackageManager();
                packageName = context.getPackageName();
            }
            String str = packageManager.getPackageInfo(packageName, 0).packageName;
            int i2 = AFLogger$LogLevel + 51;
            getLevel = i2 % 128;
            if (i2 % 2 != 0) {
                super.hashCode();
                throw null;
            }
            return str;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static String AFKeystoreWrapper(Context context, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        String packageName = context.getPackageName();
        String AFKeystoreWrapper2 = AFKeystoreWrapper(packageName);
        sb.append(AFKeystoreWrapper("臏䓗臾႖\uea64", ViewConfiguration.getScrollBarSize() >> 8).intern());
        sb2.append(AFKeystoreWrapper2);
        if ((values(context) == null ? '9' : (char) 6) == '9') {
            sb.append(AFKeystoreWrapper("嗞磸嗮륣\ue11d", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1).intern());
            sb2.append(packageName);
            int i = getLevel + 43;
            AFLogger$LogLevel = i % 128;
            int i2 = i % 2;
        } else {
            sb.append(AFKeystoreWrapper("臏䓗臾႖\uea64", AndroidCharacter.getMirror('0') - '0').intern());
            sb2.append(packageName);
        }
        String AFInAppEventType2 = AFInAppEventType(context);
        if (!(AFInAppEventType2 != null)) {
            sb.append(AFKeystoreWrapper("嗞磸嗮륣\ue11d", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern());
            sb2.append(packageName);
        } else {
            sb.append(AFKeystoreWrapper("臏䓗臾႖\uea64", Gravity.getAbsoluteGravity(0, 0)).intern());
            sb2.append(AFInAppEventType2);
            int i3 = AFLogger$LogLevel + 75;
            getLevel = i3 % 128;
            int i4 = i3 % 2;
        }
        sb2.append(Boolean.TRUE.toString());
        return sb2.toString();
    }

    /* renamed from: com.appsflyer.internal.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0081d extends HashMap<String, Object> {
        private static int AFVersionDeclaration = 0;
        private static int getLevel = 1;
        private final Map<String, Object> AFInAppEventParameterName;
        private final Context AFInAppEventType;
        private static int[] AFKeystoreWrapper = {-1041640720, -580952221, -682261191, 1975752198, 1596100974, 33660823, -2012054640, 786855284, -687188837, -557632087, -1752968691, -601168586, 1741490382, -853106437, 593608985, 2118353676, 665220696, -441603600};
        private static char[] valueOf = {385, 401, 384, 397, 387, 394, 388, 389, 392, 395, 319, 390, 403, 408, 406, 391, 407, 386, 399, 398, 345, 402, 363, 404, 355, 332, 333, 329, 335, 340, 339, 344, 336, 337, 343, 396, 341, 325, 400};
        private static boolean AppsFlyer2dXConversionCallback = true;
        private static boolean AFLogger$LogLevel = true;
        private static int values = 287;

        public C0081d(Map<String, Object> map, Context context) {
            this.AFInAppEventParameterName = map;
            this.AFInAppEventType = context;
            put(AFKeystoreWrapper(), valueOf());
        }

        private static StringBuilder AFKeystoreWrapper(String... strArr) throws Exception {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                if (!(i < 3)) {
                    break;
                }
                int i2 = AFVersionDeclaration + 115;
                getLevel = i2 % 128;
                int i3 = i2 % 2;
                arrayList.add(Integer.valueOf(strArr[i].length()));
                i++;
            }
            Collections.sort(arrayList);
            int intValue = ((Integer) arrayList.get(0)).intValue();
            StringBuilder sb = new StringBuilder();
            for (int i4 = 0; i4 < intValue; i4++) {
                Integer num = null;
                int i5 = 0;
                while (true) {
                    if (!(i5 >= 3)) {
                        int i6 = AFVersionDeclaration + 9;
                        getLevel = i6 % 128;
                        int i7 = i6 % 2;
                        int charAt = strArr[i5].charAt(i4);
                        if (num != null) {
                            charAt ^= num.intValue();
                        }
                        num = Integer.valueOf(charAt);
                        i5++;
                    }
                }
                sb.append(Integer.toHexString(num.intValue()));
            }
            return sb;
        }

        private String AFKeystoreWrapper() {
            try {
                String num = Integer.toString(Build.VERSION.SDK_INT);
                String obj = this.AFInAppEventParameterName.get(AFKeystoreWrapper(new int[]{-1899588981, -1318960983, -1691895223, -558378366, 1030854471, 1371389815}, Process.getGidForName("") + 13).intern()).toString();
                String obj2 = this.AFInAppEventParameterName.get(values(null, null, "\u0085\u0084\u0083\u0082\u0081", 127 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern()).toString();
                if (obj2 == null) {
                    int i = AFVersionDeclaration + 93;
                    getLevel = i % 128;
                    int i2 = i % 2;
                    obj2 = AFKeystoreWrapper(new int[]{-2011555701, -332013502, -1705604504, 1213686013}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 8).intern();
                    int i3 = getLevel + 57;
                    AFVersionDeclaration = i3 % 128;
                    int i4 = i3 % 2;
                }
                StringBuilder sb = new StringBuilder(obj);
                sb.reverse();
                StringBuilder AFKeystoreWrapper2 = AFKeystoreWrapper(num, obj2, sb.toString());
                int length = AFKeystoreWrapper2.length();
                if (length > 4) {
                    int i5 = AFVersionDeclaration + 31;
                    getLevel = i5 % 128;
                    int i6 = i5 % 2;
                    AFKeystoreWrapper2.delete(4, length);
                    int i7 = getLevel + 35;
                    AFVersionDeclaration = i7 % 128;
                    int i8 = i7 % 2;
                } else {
                    while (true) {
                        if ((length < 4 ? '/' : (char) 26) != '/') {
                            break;
                        }
                        int i9 = getLevel + 55;
                        AFVersionDeclaration = i9 % 128;
                        if ((i9 % 2 != 0 ? '\"' : ']') != ']') {
                            length += 41;
                            AFKeystoreWrapper2.append('n');
                        } else {
                            length++;
                            AFKeystoreWrapper2.append('1');
                        }
                    }
                }
                AFKeystoreWrapper2.insert(0, values(null, null, "\u0088\u0087\u0086", 127 - (Process.myTid() >> 22)).intern());
                return AFKeystoreWrapper2.toString();
            } catch (Exception e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(values(null, null, "\u008b\u0095\u0084\u0094\u0089\u008d\u0093\u0087\u0092\u0091\u0087\u008b\u0090\u008d\u0089\u008f\u008b\u008e\u0087\u0086\u008b\u0088\u0087\u0086\u008b\u008c\u0084\u0089\u008d\u0083\u0082\u0087\u0084\u0087\u008c\u008b\u0085\u0087\u008a\u0089\u0083\u0088", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 127).intern());
                sb2.append(e);
                AFLogger.AFKeystoreWrapper(sb2.toString());
                return AFKeystoreWrapper(new int[]{1823803466, 2057373644, 1748011517, 210350023}, 7 - (Process.myTid() >> 22)).intern();
            }
        }

        private String valueOf() {
            String obj;
            int i;
            try {
                String obj2 = this.AFInAppEventParameterName.get(AFKeystoreWrapper(new int[]{-1899588981, -1318960983, -1691895223, -558378366, 1030854471, 1371389815}, 11 - TextUtils.lastIndexOf("", '0')).intern()).toString();
                String obj3 = this.AFInAppEventParameterName.get(values(null, null, "\u0087\u008d\u0083\u0099\u0090\u0092\u0084\u0098\u0083\u0097\u008d\u0096\u0082\u0089\u0088", 127 - (ViewConfiguration.getEdgeSlop() >> 16)).intern()).toString();
                String replaceAll = AFKeystoreWrapper(new int[]{2132071032, -601586316, -962328678, 813651916}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 5).intern().replaceAll(values(null, null, "\u009c\u009b\u0092\u0082\u009a", (Process.myPid() >> 22) + 127).intern(), "");
                StringBuilder sb = new StringBuilder();
                sb.append(obj2);
                sb.append(obj3);
                sb.append(replaceAll);
                String AFInAppEventParameterName = ag.AFInAppEventParameterName(sb.toString());
                StringBuilder sb2 = new StringBuilder("");
                sb2.append(AFInAppEventParameterName.substring(0, 16));
                obj = sb2.toString();
            } catch (Exception e) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(AFKeystoreWrapper(new int[]{-1949264818, -580764174, 2116105142, -1956685057, 295240503, -746952577, -1167971128, -471731909, -1987558749, 1301340063, -1261330329, 477539634, 511241764, -1429573061, -1414121878, -90998272, -766132867, -1213863867, -1995737546, -681845067, -1483690074, 247335825}, 43 - ExpandableListView.getPackedPositionChild(0L)).intern());
                sb3.append(e);
                AFLogger.AFKeystoreWrapper(sb3.toString());
                StringBuilder sb4 = new StringBuilder("");
                sb4.append(values(null, null, "£¡\u009d¢\u0088¡ \u0085\u009d\u009f\u009e\u009d\u0087\u0083\u0087\u0081\u0083\u0081", TextUtils.indexOf((CharSequence) "", '0', 0) + 128).intern());
                obj = sb4.toString();
            }
            try {
                Intent registerReceiver = this.AFInAppEventType.registerReceiver(null, new IntentFilter(AFKeystoreWrapper(new int[]{2059820036, 1390753898, -599243215, 125346245, 1718122237, -465653955, -1904075570, -807816471, -1964179853, 620430317, 381720347, 1115013456, 1290512775, -1514598378, -724876653, -1940554289, -2077541635, 1490938601, 215740391, -2037742076}, 36 - TextUtils.lastIndexOf("", '0', 0)).intern()));
                int i2 = -2700;
                if (registerReceiver != null) {
                    i2 = registerReceiver.getIntExtra(values(null, null, "\u0087\u0082\u0098\u008d\u0083\u0082\u0087\u0093¤\u0087\u008d", 127 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern(), -2700);
                } else {
                    int i3 = AFVersionDeclaration + 75;
                    getLevel = i3 % 128;
                    int i4 = i3 % 2;
                }
                String str = this.AFInAppEventType.getApplicationInfo().nativeLibraryDir;
                if ((str != null ? 'a' : (char) 19) == 'a' && str.contains(values(null, null, "¥£\u0091", 128 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern())) {
                    i = 1;
                    int size = ((SensorManager) this.AFInAppEventType.getSystemService(values(null, null, "\u0082\u0094\u0096\u0084\u0087\u0096", 128 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern())).getSensorList(-1).size();
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(AFKeystoreWrapper(new int[]{1526226703, -1938860710}, -ExpandableListView.getPackedPositionChild(0L)).intern());
                    sb5.append(i2);
                    sb5.append(values(null, null, "\u0091¦", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 127).intern());
                    sb5.append(i);
                    sb5.append(AFKeystoreWrapper(new int[]{-1464259222, -1415623062}, 2 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern());
                    sb5.append(size);
                    sb5.append(AFKeystoreWrapper(new int[]{773775018, 123656625}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 3).intern());
                    sb5.append(this.AFInAppEventParameterName.size());
                    String obj4 = sb5.toString();
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(obj);
                    sb6.append(a.AFInAppEventParameterName(obj4));
                    String obj5 = sb6.toString();
                    int i5 = AFVersionDeclaration + 67;
                    getLevel = i5 % 128;
                    int i6 = i5 % 2;
                    return obj5;
                }
                i = 0;
                int size2 = ((SensorManager) this.AFInAppEventType.getSystemService(values(null, null, "\u0082\u0094\u0096\u0084\u0087\u0096", 128 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern())).getSensorList(-1).size();
                StringBuilder sb52 = new StringBuilder();
                sb52.append(AFKeystoreWrapper(new int[]{1526226703, -1938860710}, -ExpandableListView.getPackedPositionChild(0L)).intern());
                sb52.append(i2);
                sb52.append(values(null, null, "\u0091¦", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 127).intern());
                sb52.append(i);
                sb52.append(AFKeystoreWrapper(new int[]{-1464259222, -1415623062}, 2 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern());
                sb52.append(size2);
                sb52.append(AFKeystoreWrapper(new int[]{773775018, 123656625}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 3).intern());
                sb52.append(this.AFInAppEventParameterName.size());
                String obj42 = sb52.toString();
                StringBuilder sb62 = new StringBuilder();
                sb62.append(obj);
                sb62.append(a.AFInAppEventParameterName(obj42));
                String obj52 = sb62.toString();
                int i52 = AFVersionDeclaration + 67;
                getLevel = i52 % 128;
                int i62 = i52 % 2;
                return obj52;
            } catch (Exception e2) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(AFKeystoreWrapper(new int[]{-1949264818, -580764174, 2116105142, -1956685057, 295240503, -746952577, -1167971128, -471731909, -1987558749, 1301340063, -1261330329, 477539634, 511241764, -1429573061, -1414121878, -90998272, -766132867, -1213863867, -1995737546, -681845067, -1483690074, 247335825}, 44 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern());
                sb7.append(e2);
                AFLogger.AFKeystoreWrapper(sb7.toString());
                StringBuilder sb8 = new StringBuilder();
                sb8.append(obj);
                sb8.append(values(null, null, "¤\u0083\u008d\u0090\u0092¢¢\u0093¡\u0093¡§\u009d§\u009d\u0088", 127 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern());
                return sb8.toString();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.appsflyer.internal.d$d$a */
        /* loaded from: classes2.dex */
        public static class a {
            private static boolean AFInAppEventParameterName = true;
            private static char[] AFInAppEventType = {265};
            private static int AFKeystoreWrapper = 0;
            private static int init = 1;
            private static int valueOf = 217;
            private static boolean values = true;

            a() {
            }

            static String AFInAppEventParameterName(String str) throws Exception {
                String valueOf2;
                int i = AFKeystoreWrapper + 33;
                init = i % 128;
                boolean z = i % 2 != 0;
                byte[] AFInAppEventType2 = AFInAppEventType(str);
                if (!z) {
                    valueOf2 = valueOf(AFInAppEventParameterName(AFInAppEventType2));
                    int i2 = 19 / 0;
                } else {
                    valueOf2 = valueOf(AFInAppEventParameterName(AFInAppEventType2));
                }
                int i3 = AFKeystoreWrapper + 35;
                init = i3 % 128;
                if (i3 % 2 != 0) {
                    return valueOf2;
                }
                Object obj = null;
                super.hashCode();
                throw null;
            }

            private static byte[] AFInAppEventType(String str) throws Exception {
                int i = init + 65;
                AFKeystoreWrapper = i % 128;
                int i2 = i % 2;
                byte[] bytes = str.getBytes();
                int i3 = AFKeystoreWrapper + 51;
                init = i3 % 128;
                if (!(i3 % 2 == 0)) {
                    return bytes;
                }
                throw null;
            }

            private static byte[] AFInAppEventParameterName(byte[] bArr) throws Exception {
                int i = init + 55;
                AFKeystoreWrapper = i % 128;
                int i2 = i % 2;
                int i3 = 0;
                while (true) {
                    if ((i3 < bArr.length ? 'I' : 'X') != 'I') {
                        return bArr;
                    }
                    int i4 = AFKeystoreWrapper + 119;
                    init = i4 % 128;
                    int i5 = i4 % 2;
                    bArr[i3] = (byte) (bArr[i3] ^ ((i3 % 2) + 42));
                    i3++;
                }
            }

            private static String valueOf(byte[] bArr) throws Exception {
                String str;
                StringBuilder sb = new StringBuilder();
                int length = bArr.length;
                int i = 0;
                while (true) {
                    if (!(i < length)) {
                        return sb.toString();
                    }
                    int i2 = init + 63;
                    AFKeystoreWrapper = i2 % 128;
                    if ((i2 % 2 != 0 ? '%' : '\r') != '\r') {
                        str = Integer.toHexString(bArr[i]);
                        if (str.length() != 0) {
                            sb.append(str);
                            i++;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(AFInAppEventType(null, null, "\u0081", 126 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern());
                        sb2.append(str);
                        str = sb2.toString();
                        int i3 = init + 71;
                        AFKeystoreWrapper = i3 % 128;
                        int i4 = i3 % 2;
                        sb.append(str);
                        i++;
                    } else {
                        String hexString = Integer.toHexString(bArr[i]);
                        if (hexString.length() == 1) {
                            str = hexString;
                            StringBuilder sb22 = new StringBuilder();
                            sb22.append(AFInAppEventType(null, null, "\u0081", 126 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern());
                            sb22.append(str);
                            str = sb22.toString();
                            int i32 = init + 71;
                            AFKeystoreWrapper = i32 % 128;
                            int i42 = i32 % 2;
                            sb.append(str);
                            i++;
                        } else {
                            str = hexString;
                            sb.append(str);
                            i++;
                        }
                    }
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
                r7 = r7;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static String AFInAppEventType(String str, int[] iArr, String str2, int i) {
                byte[] bArr;
                if (str2 != null) {
                    bArr = str2.getBytes("ISO-8859-1");
                }
                byte[] bArr2 = bArr;
                char[] cArr = str;
                if (str != null) {
                    cArr = str.toCharArray();
                }
                char[] cArr2 = cArr;
                synchronized (dq.valueOf) {
                    char[] cArr3 = AFInAppEventType;
                    int i2 = valueOf;
                    if (values) {
                        int length = bArr2.length;
                        dq.AFInAppEventType = length;
                        char[] cArr4 = new char[length];
                        dq.AFInAppEventParameterName = 0;
                        while (dq.AFInAppEventParameterName < dq.AFInAppEventType) {
                            cArr4[dq.AFInAppEventParameterName] = (char) (cArr3[bArr2[(dq.AFInAppEventType - 1) - dq.AFInAppEventParameterName] + i] - i2);
                            dq.AFInAppEventParameterName++;
                        }
                        return new String(cArr4);
                    } else if (AFInAppEventParameterName) {
                        int length2 = cArr2.length;
                        dq.AFInAppEventType = length2;
                        char[] cArr5 = new char[length2];
                        dq.AFInAppEventParameterName = 0;
                        while (dq.AFInAppEventParameterName < dq.AFInAppEventType) {
                            cArr5[dq.AFInAppEventParameterName] = (char) (cArr3[cArr2[(dq.AFInAppEventType - 1) - dq.AFInAppEventParameterName] - i] - i2);
                            dq.AFInAppEventParameterName++;
                        }
                        return new String(cArr5);
                    } else {
                        int length3 = iArr.length;
                        dq.AFInAppEventType = length3;
                        char[] cArr6 = new char[length3];
                        dq.AFInAppEventParameterName = 0;
                        while (dq.AFInAppEventParameterName < dq.AFInAppEventType) {
                            cArr6[dq.AFInAppEventParameterName] = (char) (cArr3[iArr[(dq.AFInAppEventType - 1) - dq.AFInAppEventParameterName] - i] - i2);
                            dq.AFInAppEventParameterName++;
                        }
                        return new String(cArr6);
                    }
                }
            }
        }

        private static String AFKeystoreWrapper(int[] iArr, int i) {
            String str;
            synchronized (dm.valueOf) {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) AFKeystoreWrapper.clone();
                dm.AFInAppEventParameterName = 0;
                while (dm.AFInAppEventParameterName < iArr.length) {
                    cArr[0] = (char) (iArr[dm.AFInAppEventParameterName] >> 16);
                    cArr[1] = (char) iArr[dm.AFInAppEventParameterName];
                    cArr[2] = (char) (iArr[dm.AFInAppEventParameterName + 1] >> 16);
                    cArr[3] = (char) iArr[dm.AFInAppEventParameterName + 1];
                    dm.values = (cArr[0] << 16) + cArr[1];
                    dm.AFKeystoreWrapper = (cArr[2] << 16) + cArr[3];
                    dm.values(iArr2);
                    for (int i2 = 0; i2 < 16; i2++) {
                        int i3 = dm.values ^ iArr2[i2];
                        dm.values = i3;
                        dm.AFKeystoreWrapper = dm.AFInAppEventParameterName(i3) ^ dm.AFKeystoreWrapper;
                        int i4 = dm.values;
                        dm.values = dm.AFKeystoreWrapper;
                        dm.AFKeystoreWrapper = i4;
                    }
                    int i5 = dm.values;
                    dm.values = dm.AFKeystoreWrapper;
                    dm.AFKeystoreWrapper = i5;
                    dm.AFKeystoreWrapper = i5 ^ iArr2[16];
                    dm.values ^= iArr2[17];
                    int i6 = dm.values;
                    int i7 = dm.AFKeystoreWrapper;
                    cArr[0] = (char) (dm.values >>> 16);
                    cArr[1] = (char) dm.values;
                    cArr[2] = (char) (dm.AFKeystoreWrapper >>> 16);
                    cArr[3] = (char) dm.AFKeystoreWrapper;
                    dm.values(iArr2);
                    cArr2[dm.AFInAppEventParameterName << 1] = cArr[0];
                    cArr2[(dm.AFInAppEventParameterName << 1) + 1] = cArr[1];
                    cArr2[(dm.AFInAppEventParameterName << 1) + 2] = cArr[2];
                    cArr2[(dm.AFInAppEventParameterName << 1) + 3] = cArr[3];
                    dm.AFInAppEventParameterName += 2;
                }
                str = new String(cArr2, 0, i);
            }
            return str;
        }

        /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
            r7 = r7;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String values(String str, int[] iArr, String str2, int i) {
            byte[] bArr;
            if (str2 != null) {
                bArr = str2.getBytes("ISO-8859-1");
            }
            byte[] bArr2 = bArr;
            char[] cArr = str;
            if (str != null) {
                cArr = str.toCharArray();
            }
            char[] cArr2 = cArr;
            synchronized (dq.valueOf) {
                char[] cArr3 = valueOf;
                int i2 = values;
                if (AFLogger$LogLevel) {
                    int length = bArr2.length;
                    dq.AFInAppEventType = length;
                    char[] cArr4 = new char[length];
                    dq.AFInAppEventParameterName = 0;
                    while (dq.AFInAppEventParameterName < dq.AFInAppEventType) {
                        cArr4[dq.AFInAppEventParameterName] = (char) (cArr3[bArr2[(dq.AFInAppEventType - 1) - dq.AFInAppEventParameterName] + i] - i2);
                        dq.AFInAppEventParameterName++;
                    }
                    return new String(cArr4);
                } else if (AppsFlyer2dXConversionCallback) {
                    int length2 = cArr2.length;
                    dq.AFInAppEventType = length2;
                    char[] cArr5 = new char[length2];
                    dq.AFInAppEventParameterName = 0;
                    while (dq.AFInAppEventParameterName < dq.AFInAppEventType) {
                        cArr5[dq.AFInAppEventParameterName] = (char) (cArr3[cArr2[(dq.AFInAppEventType - 1) - dq.AFInAppEventParameterName] - i] - i2);
                        dq.AFInAppEventParameterName++;
                    }
                    return new String(cArr5);
                } else {
                    int length3 = iArr.length;
                    dq.AFInAppEventType = length3;
                    char[] cArr6 = new char[length3];
                    dq.AFInAppEventParameterName = 0;
                    while (dq.AFInAppEventParameterName < dq.AFInAppEventType) {
                        cArr6[dq.AFInAppEventParameterName] = (char) (cArr3[iArr[(dq.AFInAppEventType - 1) - dq.AFInAppEventParameterName] - i] - i2);
                        dq.AFInAppEventParameterName++;
                    }
                    return new String(cArr6);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r8 = r8;
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
        synchronized (dl.AFInAppEventParameterName) {
            char[] AFInAppEventType2 = dl.AFInAppEventType(AFKeystoreWrapper, cArr2, i);
            dl.AFKeystoreWrapper = 4;
            while (dl.AFKeystoreWrapper < AFInAppEventType2.length) {
                dl.values = dl.AFKeystoreWrapper - 4;
                AFInAppEventType2[dl.AFKeystoreWrapper] = (char) ((AFInAppEventType2[dl.AFKeystoreWrapper] ^ AFInAppEventType2[dl.AFKeystoreWrapper % 4]) ^ (dl.values * AFKeystoreWrapper));
                dl.AFKeystoreWrapper++;
            }
            str2 = new String(AFInAppEventType2, 4, AFInAppEventType2.length - 4);
        }
        return str2;
    }

    private static String AFKeystoreWrapper(int i, byte b, int i2, short s, int i3) {
        String obj;
        synchronized (du.getLevel) {
            StringBuilder sb = new StringBuilder();
            int i4 = AFInAppEventType;
            int i5 = i + i4;
            boolean z = i5 == -1;
            if (z) {
                byte[] bArr = valueOf;
                if (bArr != null) {
                    i5 = (byte) (bArr[AFInAppEventParameterName + i3] + i4);
                } else {
                    i5 = (short) (AppsFlyer2dXConversionCallback[AFInAppEventParameterName + i3] + i4);
                }
            }
            if (i5 > 0) {
                du.AFKeystoreWrapper = ((i3 + i5) - 2) + AFInAppEventParameterName + (z ? 1 : 0);
                du.AFInAppEventParameterName = b;
                du.valueOf = (char) (i2 + values);
                sb.append(du.valueOf);
                du.AFInAppEventType = du.valueOf;
                du.values = 1;
                while (du.values < i5) {
                    byte[] bArr2 = valueOf;
                    if (bArr2 != null) {
                        int i6 = du.AFKeystoreWrapper;
                        du.AFKeystoreWrapper = i6 - 1;
                        du.valueOf = (char) (du.AFInAppEventType + (((byte) (bArr2[i6] + s)) ^ du.AFInAppEventParameterName));
                    } else {
                        short[] sArr = AppsFlyer2dXConversionCallback;
                        int i7 = du.AFKeystoreWrapper;
                        du.AFKeystoreWrapper = i7 - 1;
                        du.valueOf = (char) (du.AFInAppEventType + (((short) (sArr[i7] + s)) ^ du.AFInAppEventParameterName));
                    }
                    sb.append(du.valueOf);
                    du.AFInAppEventType = du.valueOf;
                    du.values++;
                }
            }
            obj = sb.toString();
        }
        return obj;
    }
}
