package o0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
/* compiled from: LocaleListCompatWrapper.java */
/* loaded from: classes.dex */
public final class h implements i {

    /* renamed from: c  reason: collision with root package name */
    public static final Locale[] f26893c = new Locale[0];

    /* renamed from: a  reason: collision with root package name */
    public final Locale[] f26894a;

    /* renamed from: b  reason: collision with root package name */
    public final String f26895b;

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        String[] split = "en-Latn".split("-", -1);
        if (split.length > 2) {
            new Locale(split[0], split[1], split[2]);
        } else if (split.length > 1) {
            new Locale(split[0], split[1]);
        } else if (split.length == 1) {
            new Locale(split[0]);
        } else {
            throw new IllegalArgumentException("Can not parse language tag: [en-Latn]");
        }
    }

    public h(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f26894a = f26893c;
            this.f26895b = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb2 = new StringBuilder();
        for (int i6 = 0; i6 < localeArr.length; i6++) {
            Locale locale = localeArr[i6];
            if (locale != null) {
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    sb2.append(locale2.getLanguage());
                    String country = locale2.getCountry();
                    if (country != null && !country.isEmpty()) {
                        sb2.append('-');
                        sb2.append(locale2.getCountry());
                    }
                    if (i6 < localeArr.length - 1) {
                        sb2.append(',');
                    }
                    hashSet.add(locale2);
                }
            } else {
                throw new NullPointerException(defpackage.c.q("list[", i6, "] is null"));
            }
        }
        this.f26894a = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f26895b = sb2.toString();
    }

    @Override // o0.i
    public final String a() {
        return this.f26895b;
    }

    @Override // o0.i
    public final Object b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        Locale[] localeArr = ((h) obj).f26894a;
        Locale[] localeArr2 = this.f26894a;
        if (localeArr2.length != localeArr.length) {
            return false;
        }
        for (int i6 = 0; i6 < localeArr2.length; i6++) {
            if (!localeArr2[i6].equals(localeArr[i6])) {
                return false;
            }
        }
        return true;
    }

    @Override // o0.i
    public final Locale get(int i6) {
        if (i6 >= 0) {
            Locale[] localeArr = this.f26894a;
            if (i6 < localeArr.length) {
                return localeArr[i6];
            }
        }
        return null;
    }

    public final int hashCode() {
        int i6 = 1;
        for (Locale locale : this.f26894a) {
            i6 = (i6 * 31) + locale.hashCode();
        }
        return i6;
    }

    @Override // o0.i
    public final boolean isEmpty() {
        if (this.f26894a.length == 0) {
            return true;
        }
        return false;
    }

    @Override // o0.i
    public final int size() {
        return this.f26894a.length;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        int i6 = 0;
        while (true) {
            Locale[] localeArr = this.f26894a;
            if (i6 < localeArr.length) {
                sb2.append(localeArr[i6]);
                if (i6 < localeArr.length - 1) {
                    sb2.append(',');
                }
                i6++;
            } else {
                sb2.append("]");
                return sb2.toString();
            }
        }
    }
}
