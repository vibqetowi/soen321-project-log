package c9;

import android.app.UiModeManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.recyclerview.widget.k;
import com.appsflyer.R;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
/* compiled from: Util.java */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public static final int f5205a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f5206b;

    /* renamed from: c  reason: collision with root package name */
    public static final String f5207c;

    /* renamed from: d  reason: collision with root package name */
    public static final String f5208d;

    /* renamed from: e  reason: collision with root package name */
    public static final String f5209e;
    public static final byte[] f;

    /* renamed from: g  reason: collision with root package name */
    public static final Pattern f5210g;

    /* renamed from: h  reason: collision with root package name */
    public static HashMap<String, String> f5211h;

    /* renamed from: i  reason: collision with root package name */
    public static final String[] f5212i;

    /* renamed from: j  reason: collision with root package name */
    public static final String[] f5213j;

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f5214k;

    /* renamed from: l  reason: collision with root package name */
    public static final int[] f5215l;

    static {
        int i6 = Build.VERSION.SDK_INT;
        f5205a = i6;
        String str = Build.DEVICE;
        f5206b = str;
        String str2 = Build.MANUFACTURER;
        f5207c = str2;
        String str3 = Build.MODEL;
        f5208d = str3;
        StringBuilder n10 = defpackage.e.n(ri.e.c(str2, ri.e.c(str3, ri.e.c(str, 17))), str, ", ", str3, ", ");
        n10.append(str2);
        n10.append(", ");
        n10.append(i6);
        f5209e = n10.toString();
        f = new byte[0];
        Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
        f5210g = Pattern.compile(".*\\.isml?(?:/(manifest(.*))?)?");
        f5212i = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f5213j = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f5214k = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f5215l = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, R.styleable.AppCompatTheme_windowActionModeOverlay, R.styleable.AppCompatTheme_windowNoTitle, R.styleable.AppCompatTheme_windowFixedHeightMinor, R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle, 98, R.styleable.AppCompatTheme_switchStyle, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, SubsamplingScaleImageView.ORIENTATION_180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, R.styleable.AppCompatTheme_textColorSearchUrl, R.styleable.AppCompatTheme_textAppearanceListItemSecondary, 97, R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, R.styleable.AppCompatTheme_tooltipFrameBackground, R.styleable.AppCompatTheme_viewInflaterClass, R.styleable.AppCompatTheme_windowMinWidthMinor, R.styleable.AppCompatTheme_windowFixedWidthMajor, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, k.d.DEFAULT_DRAG_ANIMATION_DURATION, 221, 218, 211, 212, R.styleable.AppCompatTheme_textAppearanceListItemSmall, R.styleable.AppCompatTheme_textColorAlertDialogListItem, R.styleable.AppCompatTheme_textAppearanceListItem, 96, R.styleable.AppCompatTheme_windowActionBar, R.styleable.AppCompatTheme_tooltipForegroundColor, R.styleable.AppCompatTheme_windowFixedWidthMinor, R.styleable.AppCompatTheme_windowMinWidthMajor, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, R.styleable.AppCompatTheme_windowActionBarOverlay, R.styleable.AppCompatTheme_toolbarStyle, R.styleable.AppCompatTheme_windowFixedHeightMajor, 127, R.styleable.AppCompatTheme_textAppearancePopupMenuHeader, R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static Object[] A(int i6, Object[] objArr) {
        boolean z10;
        if (i6 <= objArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.q(z10);
        return Arrays.copyOf(objArr, i6);
    }

    public static void B(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return;
        }
        if (handler.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public static long C(long j10, long j11, long j12) {
        int i6 = (j12 > j11 ? 1 : (j12 == j11 ? 0 : -1));
        if (i6 >= 0 && j12 % j11 == 0) {
            return j10 / (j12 / j11);
        }
        if (i6 < 0 && j11 % j12 == 0) {
            return (j11 / j12) * j10;
        }
        return (long) (j10 * (j11 / j12));
    }

    public static void D(long[] jArr, long j10) {
        int i6 = 0;
        int i10 = (j10 > 1000000L ? 1 : (j10 == 1000000L ? 0 : -1));
        if (i10 >= 0 && j10 % 1000000 == 0) {
            long j11 = j10 / 1000000;
            while (i6 < jArr.length) {
                jArr[i6] = jArr[i6] / j11;
                i6++;
            }
        } else if (i10 < 0 && 1000000 % j10 == 0) {
            long j12 = 1000000 / j10;
            while (i6 < jArr.length) {
                jArr[i6] = jArr[i6] * j12;
                i6++;
            }
        } else {
            double d10 = 1000000 / j10;
            while (i6 < jArr.length) {
                jArr[i6] = (long) (jArr[i6] * d10);
                i6++;
            }
        }
    }

    public static long E(long j10) {
        if (j10 != -9223372036854775807L && j10 != Long.MIN_VALUE) {
            return j10 / 1000;
        }
        return j10;
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    public static int b(long[] jArr, long j10, boolean z10) {
        int binarySearch = Arrays.binarySearch(jArr, j10);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        do {
            binarySearch++;
            if (binarySearch >= jArr.length) {
                break;
            }
        } while (jArr[binarySearch] == j10);
        if (z10) {
            return binarySearch - 1;
        }
        return binarySearch;
    }

    public static int c(i5.n nVar, long j10) {
        int i6 = nVar.f19876u - 1;
        int i10 = 0;
        while (i10 <= i6) {
            int i11 = (i10 + i6) >>> 1;
            if (nVar.b(i11) < j10) {
                i10 = i11 + 1;
            } else {
                i6 = i11 - 1;
            }
        }
        int i12 = i6 + 1;
        if (i12 < nVar.f19876u && nVar.b(i12) == j10) {
            return i12;
        }
        if (i6 == -1) {
            return 0;
        }
        return i6;
    }

    public static int d(List list, Long l2, boolean z10) {
        int i6;
        int binarySearch = Collections.binarySearch(list, l2);
        if (binarySearch < 0) {
            i6 = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (((Comparable) list.get(binarySearch)).compareTo(l2) == 0);
            i6 = binarySearch + 1;
        }
        if (z10) {
            return Math.max(0, i6);
        }
        return i6;
    }

    public static int e(int[] iArr, int i6) {
        int binarySearch = Arrays.binarySearch(iArr, i6);
        if (binarySearch < 0) {
            return -(binarySearch + 2);
        }
        do {
            binarySearch--;
            if (binarySearch < 0) {
                break;
            }
        } while (iArr[binarySearch] == i6);
        return binarySearch;
    }

    public static int f(long[] jArr, long j10, boolean z10) {
        int i6;
        int binarySearch = Arrays.binarySearch(jArr, j10);
        if (binarySearch < 0) {
            i6 = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (jArr[binarySearch] == j10);
            i6 = binarySearch + 1;
        }
        if (z10) {
            return Math.max(0, i6);
        }
        return i6;
    }

    public static float g(float f2, float f10, float f11) {
        return Math.max(f10, Math.min(f2, f11));
    }

    public static int h(int i6, int i10, int i11) {
        return Math.max(i10, Math.min(i6, i11));
    }

    public static long i(long j10, long j11, long j12) {
        return Math.max(j11, Math.min(j10, j12));
    }

    public static Handler j(Handler.Callback callback) {
        Looper myLooper = Looper.myLooper();
        sc.b.E(myLooper);
        return new Handler(myLooper, callback);
    }

    public static String k(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String l(int i6, byte[] bArr, int i10) {
        return new String(bArr, i6, i10, nc.c.f25988c);
    }

    public static int m(int i6) {
        switch (i6) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                int i10 = f5205a;
                if (i10 < 23 && i10 < 21) {
                    return 0;
                }
                return 6396;
            default:
                return 0;
        }
    }

    public static int n(int i6) {
        if (i6 != 2 && i6 != 4) {
            if (i6 != 10) {
                if (i6 != 7) {
                    if (i6 != 8) {
                        switch (i6) {
                            case 15:
                                return 6003;
                            case 16:
                            case 18:
                                return 6005;
                            case 17:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                                return 6004;
                            default:
                                switch (i6) {
                                    case 24:
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28:
                                        return 6002;
                                    default:
                                        return 6006;
                                }
                        }
                    }
                    return 6003;
                }
                return 6005;
            }
            return 6004;
        }
        return 6005;
    }

    public static long o(long j10, float f2) {
        if (f2 == 1.0f) {
            return j10;
        }
        return Math.round(j10 * f2);
    }

    public static int p(int i6) {
        if (i6 != 8) {
            if (i6 != 16) {
                if (i6 != 24) {
                    if (i6 != 32) {
                        return 0;
                    }
                    return 805306368;
                }
                return 536870912;
            }
            return 2;
        }
        return 3;
    }

    public static int q(int i6, int i10) {
        if (i6 != 2) {
            if (i6 != 3) {
                if (i6 != 4) {
                    if (i6 != 268435456) {
                        if (i6 != 536870912) {
                            if (i6 != 805306368) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            return i10 * 3;
                        }
                    }
                }
                return i10 * 4;
            }
            return i10;
        }
        return i10 * 2;
    }

    public static int r(int i6) {
        if (i6 != 13) {
            switch (i6) {
                case 2:
                    return 0;
                case 3:
                    return 8;
                case 4:
                    return 4;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    return 5;
                case 6:
                    return 2;
                default:
                    return 3;
            }
        }
        return 1;
    }

    public static String s(StringBuilder sb2, Formatter formatter, long j10) {
        String str;
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        if (j10 < 0) {
            str = "-";
        } else {
            str = "";
        }
        long abs = (Math.abs(j10) + 500) / 1000;
        long j11 = abs % 60;
        long j12 = (abs / 60) % 60;
        long j13 = abs / 3600;
        sb2.setLength(0);
        if (j13 > 0) {
            return formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j13), Long.valueOf(j12), Long.valueOf(j11)).toString();
        }
        return formatter.format("%s%02d:%02d", str, Long.valueOf(j12), Long.valueOf(j11)).toString();
    }

    public static String t(String str) {
        String str2;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e10) {
            if (str.length() != 0) {
                str2 = "Failed to read system property ".concat(str);
            } else {
                str2 = new String("Failed to read system property ");
            }
            ca.a.Q("Util", str2, e10);
            return null;
        }
    }

    public static byte[] u(String str) {
        return str.getBytes(nc.c.f25988c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean v(q qVar, q qVar2, Inflater inflater) {
        int i6 = qVar.f5188c - qVar.f5187b;
        if (i6 <= 0) {
            return false;
        }
        if (qVar2.f5186a.length < i6) {
            qVar2.a(i6 * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        byte[] bArr = qVar.f5186a;
        int i10 = qVar.f5187b;
        inflater.setInput(bArr, i10, qVar.f5188c - i10);
        int i11 = 0;
        while (true) {
            try {
                byte[] bArr2 = qVar2.f5186a;
                i11 += inflater.inflate(bArr2, i11, bArr2.length - i11);
                if (inflater.finished()) {
                    qVar2.z(i11);
                    inflater.reset();
                    return true;
                } else if (inflater.needsDictionary() || inflater.needsInput()) {
                    break;
                } else {
                    byte[] bArr3 = qVar2.f5186a;
                    if (i11 == bArr3.length) {
                        qVar2.a(bArr3.length * 2);
                    }
                }
            } catch (DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
    }

    public static boolean w(int i6) {
        if (i6 != 3 && i6 != 2 && i6 != 268435456 && i6 != 536870912 && i6 != 805306368 && i6 != 4) {
            return false;
        }
        return true;
    }

    public static boolean x(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
            return true;
        }
        return false;
    }

    public static long y(long j10) {
        if (j10 != -9223372036854775807L && j10 != Long.MIN_VALUE) {
            return j10 * 1000;
        }
        return j10;
    }

    public static String z(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String h02 = sc.b.h0(str);
        int i6 = 0;
        String str2 = h02.split("-", 2)[0];
        if (f5211h == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            int length = iSOLanguages.length;
            String[] strArr = f5212i;
            HashMap<String, String> hashMap = new HashMap<>(length + strArr.length);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        hashMap.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            for (int i10 = 0; i10 < strArr.length; i10 += 2) {
                hashMap.put(strArr[i10], strArr[i10 + 1]);
            }
            f5211h = hashMap;
        }
        String str4 = f5211h.get(str2);
        if (str4 != null) {
            String valueOf = String.valueOf(h02.substring(str2.length()));
            if (valueOf.length() != 0) {
                h02 = str4.concat(valueOf);
            } else {
                h02 = new String(str4);
            }
            str2 = str4;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return h02;
        }
        while (true) {
            String[] strArr2 = f5213j;
            if (i6 < strArr2.length) {
                if (h02.startsWith(strArr2[i6])) {
                    String valueOf2 = String.valueOf(strArr2[i6 + 1]);
                    String valueOf3 = String.valueOf(h02.substring(strArr2[i6].length()));
                    if (valueOf3.length() != 0) {
                        return valueOf2.concat(valueOf3);
                    }
                    return new String(valueOf2);
                }
                i6 += 2;
            } else {
                return h02;
            }
        }
    }
}
