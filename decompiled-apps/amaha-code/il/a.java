package il;

import com.appsflyer.R;
import com.theinnerhour.b2b.utils.LogHelper;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
/* compiled from: CalendarUtils.kt */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f20352a = LogHelper.INSTANCE.makeLogTag("CalendarUtils");

    public static long c(long j10) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j10);
        calendar.clear(11);
        calendar.clear(9);
        calendar.clear(12);
        calendar.clear(10);
        calendar.clear(13);
        calendar.clear(14);
        return calendar.getTimeInMillis();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051 A[Catch: Exception -> 0x0160, TryCatch #0 {Exception -> 0x0160, blocks: (B:3:0x0001, B:14:0x0049, B:16:0x0051, B:17:0x0054, B:93:0x0148, B:49:0x00bd, B:53:0x00cb, B:57:0x00d9, B:61:0x00e7, B:65:0x00f3, B:69:0x00ff, B:73:0x010b, B:77:0x0117, B:81:0x0123, B:85:0x012f, B:19:0x0059, B:22:0x0063, B:25:0x006d, B:28:0x0077, B:31:0x0081, B:34:0x008b, B:37:0x0095, B:40:0x009f, B:43:0x00a9, B:46:0x00b3, B:89:0x013b, B:6:0x0036), top: B:98:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x013b A[Catch: Exception -> 0x0160, TryCatch #0 {Exception -> 0x0160, blocks: (B:3:0x0001, B:14:0x0049, B:16:0x0051, B:17:0x0054, B:93:0x0148, B:49:0x00bd, B:53:0x00cb, B:57:0x00d9, B:61:0x00e7, B:65:0x00f3, B:69:0x00ff, B:73:0x010b, B:77:0x0117, B:81:0x0123, B:85:0x012f, B:19:0x0059, B:22:0x0063, B:25:0x006d, B:28:0x0077, B:31:0x0081, B:34:0x008b, B:37:0x0095, B:40:0x009f, B:43:0x00a9, B:46:0x00b3, B:89:0x013b, B:6:0x0036), top: B:98:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a(Calendar calendar) {
        int i6;
        String valueOf;
        String str;
        int hashCode;
        String str2;
        try {
            i6 = calendar.get(5);
            valueOf = String.valueOf(calendar.get(2));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f20352a, e10);
            return "";
        }
        if (!is.k.Q1(Integer.valueOf(i6), new Integer[]{11, 12, 13})) {
            int i10 = i6 % 10;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        str = "rd";
                    }
                } else {
                    str = "nd";
                }
            } else {
                str = "st";
            }
            hashCode = valueOf.hashCode();
            if (hashCode == 1567) {
                switch (hashCode) {
                    case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                        if (!valueOf.equals("0")) {
                            str2 = "Dec";
                            break;
                        }
                        str2 = "Jan";
                        break;
                    case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                        if (!valueOf.equals("1")) {
                            str2 = "Dec";
                            break;
                        }
                        str2 = "Feb";
                        break;
                    case 50:
                        if (!valueOf.equals("2")) {
                            str2 = "Dec";
                            break;
                        }
                        str2 = "Mar";
                        break;
                    case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                        if (!valueOf.equals("3")) {
                            str2 = "Dec";
                            break;
                        }
                        str2 = "Apr";
                        break;
                    case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                        if (!valueOf.equals("4")) {
                            str2 = "Dec";
                            break;
                        }
                        str2 = "May";
                        break;
                    case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                        if (!valueOf.equals("5")) {
                            str2 = "Dec";
                            break;
                        }
                        str2 = "Jun";
                        break;
                    case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                        if (!valueOf.equals("6")) {
                            str2 = "Dec";
                            break;
                        }
                        str2 = "Jul";
                        break;
                    case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                        if (!valueOf.equals("7")) {
                            str2 = "Dec";
                            break;
                        }
                        str2 = "Aug";
                        break;
                    case R.styleable.AppCompatTheme_colorError /* 56 */:
                        if (!valueOf.equals("8")) {
                            str2 = "Dec";
                            break;
                        }
                        str2 = "Sep";
                        break;
                    case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                        if (!valueOf.equals("9")) {
                            str2 = "Dec";
                            break;
                        }
                        str2 = "Oct";
                        break;
                    default:
                        switch (hashCode) {
                            case 1536:
                                if (!valueOf.equals("00")) {
                                    str2 = "Dec";
                                    break;
                                }
                                str2 = "Jan";
                                break;
                            case 1537:
                                if (!valueOf.equals("01")) {
                                    str2 = "Dec";
                                    break;
                                }
                                str2 = "Feb";
                                break;
                            case 1538:
                                if (!valueOf.equals("02")) {
                                    str2 = "Dec";
                                    break;
                                }
                                str2 = "Mar";
                                break;
                            case 1539:
                                if (!valueOf.equals("03")) {
                                    str2 = "Dec";
                                    break;
                                }
                                str2 = "Apr";
                                break;
                            case 1540:
                                if (!valueOf.equals("04")) {
                                    str2 = "Dec";
                                    break;
                                }
                                str2 = "May";
                                break;
                            case 1541:
                                if (!valueOf.equals("05")) {
                                    str2 = "Dec";
                                    break;
                                }
                                str2 = "Jun";
                                break;
                            case 1542:
                                if (!valueOf.equals("06")) {
                                    str2 = "Dec";
                                    break;
                                }
                                str2 = "Jul";
                                break;
                            case 1543:
                                if (!valueOf.equals("07")) {
                                    str2 = "Dec";
                                    break;
                                }
                                str2 = "Aug";
                                break;
                            case 1544:
                                if (!valueOf.equals("08")) {
                                    str2 = "Dec";
                                    break;
                                }
                                str2 = "Sep";
                                break;
                            case 1545:
                                if (!valueOf.equals("09")) {
                                    str2 = "Dec";
                                    break;
                                }
                                str2 = "Oct";
                                break;
                            default:
                                str2 = "Dec";
                                break;
                        }
                }
                return i6 + str + ' ' + str2;
            }
            if (valueOf.equals("10")) {
                str2 = "Nov";
                return i6 + str + ' ' + str2;
            }
            str2 = "Dec";
            return i6 + str + ' ' + str2;
            LogHelper.INSTANCE.e(this.f20352a, e10);
            return "";
        }
        str = "th";
        hashCode = valueOf.hashCode();
        if (hashCode == 1567) {
        }
        LogHelper.INSTANCE.e(this.f20352a, e10);
        return "";
    }

    public final String b(long j10) {
        String str;
        String str2 = this.f20352a;
        try {
            Date date = new Date(j10);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a(calendar));
            sb2.append(", ");
            try {
                str = new SimpleDateFormat("hh:mm a", Locale.ENGLISH).format(date);
                kotlin.jvm.internal.i.f(str, "{\n            val sdf = …        dateStr\n        }");
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(str2, e10);
                str = "";
            }
            sb2.append(str);
            return sb2.toString();
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(str2, e11);
            return "";
        }
    }
}
