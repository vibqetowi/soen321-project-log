package q9;

import android.text.TextUtils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final p9.b f29403a = new p9.b("MetadataUtils");

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f29404b;

    /* renamed from: c  reason: collision with root package name */
    public static final String f29405c;

    static {
        String str;
        String[] strArr = {"Z", "+hh", "+hhmm", "+hh:mm"};
        f29404b = strArr;
        String valueOf = String.valueOf(strArr[0]);
        if (valueOf.length() != 0) {
            str = "yyyyMMdd'T'HHmmss".concat(valueOf);
        } else {
            str = new String("yyyyMMdd'T'HHmmss");
        }
        f29405c = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Calendar a(String str) {
        String substring;
        String substring2;
        String str2;
        boolean isEmpty = TextUtils.isEmpty(str);
        p9.b bVar = f29403a;
        if (isEmpty) {
            bVar.b("Input string is empty or null", new Object[0]);
            return null;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                substring = str.substring(0, 8);
            } catch (IndexOutOfBoundsException e10) {
                bVar.c("Error extracting the date", e10, new Object[0]);
            }
            if (!TextUtils.isEmpty(substring)) {
                bVar.b("Invalid date format", new Object[0]);
                return null;
            }
            try {
                if (TextUtils.isEmpty(str)) {
                    bVar.b("string is empty or null", new Object[0]);
                } else {
                    int indexOf = str.indexOf(84);
                    int i6 = indexOf + 1;
                    if (indexOf != 8) {
                        bVar.b("T delimeter is not found", new Object[0]);
                    } else {
                        try {
                            substring2 = str.substring(i6);
                            if (substring2.length() != 6) {
                                char charAt = substring2.charAt(6);
                                String[] strArr = f29404b;
                                if (charAt != '+' && charAt != '-') {
                                    if (charAt == 'Z' && substring2.length() == strArr[0].length() + 6) {
                                        substring2 = String.valueOf(substring2.substring(0, substring2.length() - 1)).concat("+0000");
                                    }
                                } else {
                                    int length = substring2.length();
                                    if (length == strArr[1].length() + 6 || length == strArr[2].length() + 6 || length == strArr[3].length() + 6) {
                                        substring2 = substring2.replaceAll("([\\+\\-]\\d\\d):(\\d\\d)", "$1$2");
                                    }
                                }
                            }
                        } catch (IndexOutOfBoundsException e11) {
                            bVar.c("Error extracting the time substring: %s", e11, new Object[0]);
                        }
                        if (TextUtils.isEmpty(substring2)) {
                            String valueOf = String.valueOf(substring);
                            StringBuilder sb2 = new StringBuilder(valueOf.length() + 1 + String.valueOf(substring2).length());
                            sb2.append(valueOf);
                            sb2.append("T");
                            sb2.append(substring2);
                            substring = sb2.toString();
                            if (substring2.length() == 6) {
                                str2 = "yyyyMMdd'T'HHmmss";
                            } else {
                                str2 = f29405c;
                            }
                        } else {
                            str2 = "yyyyMMdd";
                        }
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTime(new SimpleDateFormat(str2).parse(substring));
                        return calendar;
                    }
                }
                calendar.setTime(new SimpleDateFormat(str2).parse(substring));
                return calendar;
            } catch (ParseException e12) {
                bVar.c("Error parsing string", e12, new Object[0]);
                return null;
            }
            substring2 = null;
            if (TextUtils.isEmpty(substring2)) {
            }
            Calendar calendar2 = Calendar.getInstance();
        } else {
            bVar.b("Input string is empty or null", new Object[0]);
        }
        substring = null;
        if (!TextUtils.isEmpty(substring)) {
        }
    }
}
