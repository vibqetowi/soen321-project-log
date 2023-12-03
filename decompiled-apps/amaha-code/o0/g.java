package o0;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;
/* compiled from: LocaleListCompat.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: b  reason: collision with root package name */
    public static final g f26890b = a(new Locale[0]);

    /* renamed from: a  reason: collision with root package name */
    public final i f26891a;

    /* compiled from: LocaleListCompat.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final Locale[] f26892a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        public static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }

        public static boolean b(Locale locale, Locale locale2) {
            boolean z10;
            boolean z11;
            if (locale.equals(locale2)) {
                return true;
            }
            if (!locale.getLanguage().equals(locale2.getLanguage())) {
                return false;
            }
            Locale[] localeArr = f26892a;
            int length = localeArr.length;
            int i6 = 0;
            while (true) {
                if (i6 < length) {
                    if (localeArr[i6].equals(locale)) {
                        z10 = true;
                        break;
                    }
                    i6++;
                } else {
                    z10 = false;
                    break;
                }
            }
            if (!z10) {
                int length2 = localeArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length2) {
                        if (localeArr[i10].equals(locale2)) {
                            z11 = true;
                            break;
                        }
                        i10++;
                    } else {
                        z11 = false;
                        break;
                    }
                }
                if (!z11) {
                    String a10 = r0.c.a(locale);
                    if (a10.isEmpty()) {
                        String country = locale.getCountry();
                        if (country.isEmpty() || country.equals(locale2.getCountry())) {
                            return true;
                        }
                        return false;
                    }
                    return a10.equals(r0.c.a(locale2));
                }
            }
            return false;
        }
    }

    /* compiled from: LocaleListCompat.java */
    /* loaded from: classes.dex */
    public static class b {
        public static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        public static LocaleList b() {
            LocaleList adjustedDefault;
            adjustedDefault = LocaleList.getAdjustedDefault();
            return adjustedDefault;
        }

        public static LocaleList c() {
            LocaleList localeList;
            localeList = LocaleList.getDefault();
            return localeList;
        }
    }

    public g(i iVar) {
        this.f26891a = iVar;
    }

    public static g a(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new g(new j(b.a(localeArr)));
        }
        return new g(new h(localeArr));
    }

    public static g b(String str) {
        if (str != null && !str.isEmpty()) {
            String[] split = str.split(",", -1);
            int length = split.length;
            Locale[] localeArr = new Locale[length];
            for (int i6 = 0; i6 < length; i6++) {
                localeArr[i6] = a.a(split[i6]);
            }
            return a(localeArr);
        }
        return f26890b;
    }

    public final Locale c(int i6) {
        return this.f26891a.get(i6);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            if (this.f26891a.equals(((g) obj).f26891a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f26891a.hashCode();
    }

    public final String toString() {
        return this.f26891a.toString();
    }
}
