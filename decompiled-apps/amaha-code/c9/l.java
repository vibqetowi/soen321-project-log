package c9;

import android.text.TextUtils;
import com.appsflyer.R;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: MimeTypes.java */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final ArrayList<a> f5151a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f5152b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* compiled from: MimeTypes.java */
    /* loaded from: classes.dex */
    public static final class a {
    }

    /* compiled from: MimeTypes.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f5153a;

        /* renamed from: b  reason: collision with root package name */
        public final int f5154b;

        public b(int i6, int i10) {
            this.f5153a = i6;
            this.f5154b = i10;
        }

        public final int a() {
            int i6 = this.f5154b;
            if (i6 != 2) {
                if (i6 != 5) {
                    if (i6 != 29) {
                        if (i6 != 42) {
                            if (i6 != 22) {
                                if (i6 != 23) {
                                    return 0;
                                }
                                return 15;
                            }
                            return 1073741824;
                        }
                        return 16;
                    }
                    return 12;
                }
                return 11;
            }
            return 10;
        }
    }

    public static boolean a(String str, String str2) {
        b e10;
        int a10;
        if (str == null) {
            return false;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c10 = 0;
                    break;
                }
                break;
            case -432837260:
                if (str.equals("audio/mpeg-L1")) {
                    c10 = 1;
                    break;
                }
                break;
            case -432837259:
                if (str.equals("audio/mpeg-L2")) {
                    c10 = 2;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c10 = 3;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c10 = 4;
                    break;
                }
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1504619009:
                if (str.equals("audio/flac")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    c10 = '\n';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
                return true;
            case 3:
                if (str2 == null || (e10 = e(str2)) == null || (a10 = e10.a()) == 0 || a10 == 16) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    public static int b(String str, String str2) {
        b e10;
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c10 = 1;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c10 = 2;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c10 = 3;
                    break;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    c10 = '\b';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 18;
            case 1:
                return 7;
            case 2:
                if (str2 == null || (e10 = e(str2)) == null) {
                    return 0;
                }
                return e10.a();
            case 3:
                return 5;
            case 4:
                return 17;
            case 5:
                return 6;
            case 6:
                return 9;
            case 7:
                return 8;
            case '\b':
                return 14;
            default:
                return 0;
        }
    }

    public static String c(String str) {
        b e10;
        String str2 = null;
        if (str == null) {
            return null;
        }
        String h02 = sc.b.h0(str.trim());
        if (!h02.startsWith("avc1") && !h02.startsWith("avc3")) {
            if (!h02.startsWith("hev1") && !h02.startsWith("hvc1")) {
                if (!h02.startsWith("dvav") && !h02.startsWith("dva1") && !h02.startsWith("dvhe") && !h02.startsWith("dvh1")) {
                    if (h02.startsWith("av01")) {
                        return "video/av01";
                    }
                    if (!h02.startsWith("vp9") && !h02.startsWith("vp09")) {
                        if (!h02.startsWith("vp8") && !h02.startsWith("vp08")) {
                            if (h02.startsWith("mp4a")) {
                                if (h02.startsWith("mp4a.") && (e10 = e(h02)) != null) {
                                    str2 = d(e10.f5153a);
                                }
                                if (str2 == null) {
                                    return "audio/mp4a-latm";
                                }
                                return str2;
                            } else if (h02.startsWith("mha1")) {
                                return "audio/mha1";
                            } else {
                                if (h02.startsWith("mhm1")) {
                                    return "audio/mhm1";
                                }
                                if (!h02.startsWith("ac-3") && !h02.startsWith("dac3")) {
                                    if (!h02.startsWith("ec-3") && !h02.startsWith("dec3")) {
                                        if (h02.startsWith("ec+3")) {
                                            return "audio/eac3-joc";
                                        }
                                        if (!h02.startsWith("ac-4") && !h02.startsWith("dac4")) {
                                            if (h02.startsWith("dtsc")) {
                                                return "audio/vnd.dts";
                                            }
                                            if (h02.startsWith("dtse")) {
                                                return "audio/vnd.dts.hd;profile=lbr";
                                            }
                                            if (!h02.startsWith("dtsh") && !h02.startsWith("dtsl")) {
                                                if (h02.startsWith("dtsx")) {
                                                    return "audio/vnd.dts.uhd;profile=p2";
                                                }
                                                if (h02.startsWith("opus")) {
                                                    return "audio/opus";
                                                }
                                                if (h02.startsWith("vorbis")) {
                                                    return "audio/vorbis";
                                                }
                                                if (h02.startsWith("flac")) {
                                                    return "audio/flac";
                                                }
                                                if (h02.startsWith("stpp")) {
                                                    return "application/ttml+xml";
                                                }
                                                if (h02.startsWith("wvtt")) {
                                                    return "text/vtt";
                                                }
                                                if (h02.contains("cea708")) {
                                                    return "application/cea-708";
                                                }
                                                if (!h02.contains("eia608") && !h02.contains("cea608")) {
                                                    ArrayList<a> arrayList = f5151a;
                                                    int size = arrayList.size();
                                                    for (int i6 = 0; i6 < size; i6++) {
                                                        arrayList.get(i6).getClass();
                                                        if (h02.startsWith(null)) {
                                                            break;
                                                        }
                                                    }
                                                    return null;
                                                }
                                                return "application/cea-608";
                                            }
                                            return "audio/vnd.dts.hd";
                                        }
                                        return "audio/ac4";
                                    }
                                    return "audio/eac3";
                                }
                                return "audio/ac3";
                            }
                        }
                        return "video/x-vnd.on2.vp8";
                    }
                    return "video/x-vnd.on2.vp9";
                }
                return "video/dolby-vision";
            }
            return "video/hevc";
        }
        return "video/avc";
    }

    public static String d(int i6) {
        if (i6 != 32) {
            if (i6 != 33) {
                if (i6 != 35) {
                    if (i6 != 64) {
                        if (i6 != 163) {
                            if (i6 != 177) {
                                if (i6 != 165) {
                                    if (i6 != 166) {
                                        switch (i6) {
                                            case R.styleable.AppCompatTheme_seekBarStyle /* 96 */:
                                            case R.styleable.AppCompatTheme_selectableItemBackground /* 97 */:
                                            case R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /* 98 */:
                                            case 99:
                                            case 100:
                                            case R.styleable.AppCompatTheme_switchStyle /* 101 */:
                                                return "video/mpeg2";
                                            case R.styleable.AppCompatTheme_textAppearanceLargePopupMenu /* 102 */:
                                            case R.styleable.AppCompatTheme_textAppearanceListItem /* 103 */:
                                            case R.styleable.AppCompatTheme_textAppearanceListItemSecondary /* 104 */:
                                                return "audio/mp4a-latm";
                                            case R.styleable.AppCompatTheme_textAppearanceListItemSmall /* 105 */:
                                            case R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle /* 107 */:
                                                return "audio/mpeg";
                                            case R.styleable.AppCompatTheme_textAppearancePopupMenuHeader /* 106 */:
                                                return "video/mpeg";
                                            default:
                                                switch (i6) {
                                                    case 169:
                                                    case 172:
                                                        return "audio/vnd.dts";
                                                    case 170:
                                                    case 171:
                                                        return "audio/vnd.dts.hd";
                                                    case 173:
                                                        return "audio/opus";
                                                    case 174:
                                                        return "audio/ac4";
                                                    default:
                                                        return null;
                                                }
                                        }
                                    }
                                    return "audio/eac3";
                                }
                                return "audio/ac3";
                            }
                            return "video/x-vnd.on2.vp9";
                        }
                        return "video/wvc1";
                    }
                    return "audio/mp4a-latm";
                }
                return "video/hevc";
            }
            return "video/avc";
        }
        return "video/mp4v-es";
    }

    public static b e(String str) {
        int i6;
        Matcher matcher = f5152b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        group.getClass();
        String group2 = matcher.group(2);
        try {
            int parseInt = Integer.parseInt(group, 16);
            if (group2 != null) {
                i6 = Integer.parseInt(group2);
            } else {
                i6 = 0;
            }
            return new b(parseInt, i6);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String f(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    public static int g(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (h(str)) {
            return 1;
        }
        if (j(str)) {
            return 2;
        }
        if (i(str)) {
            return 3;
        }
        if ("image".equals(f(str))) {
            return 4;
        }
        if (!"application/id3".equals(str) && !"application/x-emsg".equals(str) && !"application/x-scte35".equals(str)) {
            if ("application/x-camera-motion".equals(str)) {
                return 6;
            }
            ArrayList<a> arrayList = f5151a;
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                arrayList.get(i6).getClass();
                if (str.equals(null)) {
                    return 0;
                }
            }
            return -1;
        }
        return 5;
    }

    public static boolean h(String str) {
        return "audio".equals(f(str));
    }

    public static boolean i(String str) {
        if (!"text".equals(f(str)) && !"application/cea-608".equals(str) && !"application/cea-708".equals(str) && !"application/x-mp4-cea-608".equals(str) && !"application/x-subrip".equals(str) && !"application/ttml+xml".equals(str) && !"application/x-quicktime-tx3g".equals(str) && !"application/x-mp4-vtt".equals(str) && !"application/x-rawcc".equals(str) && !"application/vobsub".equals(str) && !"application/pgs".equals(str) && !"application/dvbsubs".equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean j(String str) {
        return "video".equals(f(str));
    }
}
