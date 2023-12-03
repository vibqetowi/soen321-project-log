package j$.time.format;

import j$.util.concurrent.ConcurrentHashMap;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class C {

    /* renamed from: a  reason: collision with root package name */
    private static final ConcurrentHashMap f20862a = new ConcurrentHashMap(16, 0.75f, 2);

    /* renamed from: b  reason: collision with root package name */
    private static final Comparator f20863b = new C0706c();

    /* renamed from: c  reason: collision with root package name */
    private static final C f20864c = new C();

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f20865d = 0;

    private static Object b(j$.time.temporal.p pVar, Locale locale) {
        Object obj;
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(pVar, locale);
        ConcurrentHashMap concurrentHashMap = f20862a;
        V v10 = concurrentHashMap.get(simpleImmutableEntry);
        if (v10 == 0) {
            HashMap hashMap = new HashMap();
            int i6 = 0;
            if (pVar == j$.time.temporal.a.ERA) {
                DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
                HashMap hashMap2 = new HashMap();
                HashMap hashMap3 = new HashMap();
                String[] eras = dateFormatSymbols.getEras();
                while (i6 < eras.length) {
                    if (!eras[i6].isEmpty()) {
                        long j10 = i6;
                        hashMap2.put(Long.valueOf(j10), eras[i6]);
                        hashMap3.put(Long.valueOf(j10), c(eras[i6]));
                    }
                    i6++;
                }
                if (!hashMap2.isEmpty()) {
                    hashMap.put(H.FULL, hashMap2);
                    hashMap.put(H.SHORT, hashMap2);
                    hashMap.put(H.NARROW, hashMap3);
                }
                obj = new B(hashMap);
            } else if (pVar == j$.time.temporal.a.MONTH_OF_YEAR) {
                DateFormatSymbols dateFormatSymbols2 = DateFormatSymbols.getInstance(locale);
                HashMap hashMap4 = new HashMap();
                HashMap hashMap5 = new HashMap();
                String[] months = dateFormatSymbols2.getMonths();
                for (int i10 = 0; i10 < months.length; i10++) {
                    if (!months[i10].isEmpty()) {
                        long j11 = i10 + 1;
                        hashMap4.put(Long.valueOf(j11), months[i10]);
                        hashMap5.put(Long.valueOf(j11), c(months[i10]));
                    }
                }
                if (!hashMap4.isEmpty()) {
                    hashMap.put(H.FULL, hashMap4);
                    hashMap.put(H.NARROW, hashMap5);
                }
                HashMap hashMap6 = new HashMap();
                String[] shortMonths = dateFormatSymbols2.getShortMonths();
                while (i6 < shortMonths.length) {
                    if (!shortMonths[i6].isEmpty()) {
                        hashMap6.put(Long.valueOf(i6 + 1), shortMonths[i6]);
                    }
                    i6++;
                }
                if (!hashMap6.isEmpty()) {
                    hashMap.put(H.SHORT, hashMap6);
                }
                obj = new B(hashMap);
            } else if (pVar == j$.time.temporal.a.DAY_OF_WEEK) {
                DateFormatSymbols dateFormatSymbols3 = DateFormatSymbols.getInstance(locale);
                HashMap hashMap7 = new HashMap();
                String[] weekdays = dateFormatSymbols3.getWeekdays();
                hashMap7.put(1L, weekdays[2]);
                hashMap7.put(2L, weekdays[3]);
                hashMap7.put(3L, weekdays[4]);
                hashMap7.put(4L, weekdays[5]);
                hashMap7.put(5L, weekdays[6]);
                hashMap7.put(6L, weekdays[7]);
                hashMap7.put(7L, weekdays[1]);
                hashMap.put(H.FULL, hashMap7);
                HashMap hashMap8 = new HashMap();
                hashMap8.put(1L, c(weekdays[2]));
                hashMap8.put(2L, c(weekdays[3]));
                hashMap8.put(3L, c(weekdays[4]));
                hashMap8.put(4L, c(weekdays[5]));
                hashMap8.put(5L, c(weekdays[6]));
                hashMap8.put(6L, c(weekdays[7]));
                hashMap8.put(7L, c(weekdays[1]));
                hashMap.put(H.NARROW, hashMap8);
                HashMap hashMap9 = new HashMap();
                String[] shortWeekdays = dateFormatSymbols3.getShortWeekdays();
                hashMap9.put(1L, shortWeekdays[2]);
                hashMap9.put(2L, shortWeekdays[3]);
                hashMap9.put(3L, shortWeekdays[4]);
                hashMap9.put(4L, shortWeekdays[5]);
                hashMap9.put(5L, shortWeekdays[6]);
                hashMap9.put(6L, shortWeekdays[7]);
                hashMap9.put(7L, shortWeekdays[1]);
                hashMap.put(H.SHORT, hashMap9);
                obj = new B(hashMap);
            } else if (pVar == j$.time.temporal.a.AMPM_OF_DAY) {
                DateFormatSymbols dateFormatSymbols4 = DateFormatSymbols.getInstance(locale);
                HashMap hashMap10 = new HashMap();
                HashMap hashMap11 = new HashMap();
                String[] amPmStrings = dateFormatSymbols4.getAmPmStrings();
                while (i6 < amPmStrings.length) {
                    if (!amPmStrings[i6].isEmpty()) {
                        long j12 = i6;
                        hashMap10.put(Long.valueOf(j12), amPmStrings[i6]);
                        hashMap11.put(Long.valueOf(j12), c(amPmStrings[i6]));
                    }
                    i6++;
                }
                if (!hashMap10.isEmpty()) {
                    hashMap.put(H.FULL, hashMap10);
                    hashMap.put(H.SHORT, hashMap10);
                    hashMap.put(H.NARROW, hashMap11);
                }
                obj = new B(hashMap);
            } else {
                obj = "";
            }
            concurrentHashMap.putIfAbsent(simpleImmutableEntry, obj);
            return concurrentHashMap.get(simpleImmutableEntry);
        }
        return v10;
    }

    private static String c(String str) {
        return str.substring(0, Character.charCount(str.codePointAt(0)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C d() {
        return f20864c;
    }

    public String e(j$.time.chrono.n nVar, j$.time.temporal.p pVar, long j10, H h10, Locale locale) {
        if (nVar == j$.time.chrono.u.f20846d || !(pVar instanceof j$.time.temporal.a)) {
            return f(pVar, j10, h10, locale);
        }
        return null;
    }

    public String f(j$.time.temporal.p pVar, long j10, H h10, Locale locale) {
        Object b10 = b(pVar, locale);
        if (b10 instanceof B) {
            return ((B) b10).a(j10, h10);
        }
        return null;
    }

    public Iterator g(j$.time.chrono.n nVar, j$.time.temporal.p pVar, H h10, Locale locale) {
        if (nVar == j$.time.chrono.u.f20846d || !(pVar instanceof j$.time.temporal.a)) {
            return h(pVar, h10, locale);
        }
        return null;
    }

    public Iterator h(j$.time.temporal.p pVar, H h10, Locale locale) {
        Object b10 = b(pVar, locale);
        if (b10 instanceof B) {
            return ((B) b10).b(h10);
        }
        return null;
    }
}
