package org.apache.commons.lang3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* loaded from: classes5.dex */
public class LocaleUtils {
    private static final ConcurrentMap<String, List<Locale>> cLanguagesByCountry = new ConcurrentHashMap();
    private static final ConcurrentMap<String, List<Locale>> cCountriesByLanguage = new ConcurrentHashMap();

    public static Locale toLocale(String str) {
        if (str == null) {
            return null;
        }
        if (str.isEmpty()) {
            return new Locale("", "");
        }
        if (str.contains("#")) {
            throw new IllegalArgumentException("Invalid locale format: " + str);
        }
        int length = str.length();
        if (length < 2) {
            throw new IllegalArgumentException("Invalid locale format: " + str);
        } else if (str.charAt(0) == '_') {
            if (length < 3) {
                throw new IllegalArgumentException("Invalid locale format: " + str);
            }
            char charAt = str.charAt(1);
            char charAt2 = str.charAt(2);
            if (!Character.isUpperCase(charAt) || !Character.isUpperCase(charAt2)) {
                throw new IllegalArgumentException("Invalid locale format: " + str);
            } else if (length == 3) {
                return new Locale("", str.substring(1, 3));
            } else {
                if (length < 5) {
                    throw new IllegalArgumentException("Invalid locale format: " + str);
                } else if (str.charAt(3) != '_') {
                    throw new IllegalArgumentException("Invalid locale format: " + str);
                } else {
                    return new Locale("", str.substring(1, 3), str.substring(4));
                }
            }
        } else {
            return parseLocale(str);
        }
    }

    private static Locale parseLocale(String str) {
        if (isISO639LanguageCode(str)) {
            return new Locale(str);
        }
        String[] split = str.split("_", -1);
        String str2 = split[0];
        if (split.length == 2) {
            String str3 = split[1];
            if ((isISO639LanguageCode(str2) && isISO3166CountryCode(str3)) || isNumericAreaCode(str3)) {
                return new Locale(str2, str3);
            }
        } else if (split.length == 3) {
            String str4 = split[1];
            String str5 = split[2];
            if (isISO639LanguageCode(str2) && ((str4.isEmpty() || isISO3166CountryCode(str4) || isNumericAreaCode(str4)) && !str5.isEmpty())) {
                return new Locale(str2, str4, str5);
            }
        }
        throw new IllegalArgumentException("Invalid locale format: " + str);
    }

    private static boolean isISO639LanguageCode(String str) {
        return StringUtils.isAllLowerCase(str) && (str.length() == 2 || str.length() == 3);
    }

    private static boolean isISO3166CountryCode(String str) {
        return StringUtils.isAllUpperCase(str) && str.length() == 2;
    }

    private static boolean isNumericAreaCode(String str) {
        return StringUtils.isNumeric(str) && str.length() == 3;
    }

    public static List<Locale> localeLookupList(Locale locale) {
        return localeLookupList(locale, locale);
    }

    public static List<Locale> localeLookupList(Locale locale, Locale locale2) {
        ArrayList arrayList = new ArrayList(4);
        if (locale != null) {
            arrayList.add(locale);
            if (!locale.getVariant().isEmpty()) {
                arrayList.add(new Locale(locale.getLanguage(), locale.getCountry()));
            }
            if (!locale.getCountry().isEmpty()) {
                arrayList.add(new Locale(locale.getLanguage(), ""));
            }
            if (!arrayList.contains(locale2)) {
                arrayList.add(locale2);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static List<Locale> availableLocaleList() {
        return SyncAvoid.AVAILABLE_LOCALE_LIST;
    }

    public static Set<Locale> availableLocaleSet() {
        return SyncAvoid.AVAILABLE_LOCALE_SET;
    }

    public static boolean isAvailableLocale(Locale locale) {
        return availableLocaleList().contains(locale);
    }

    public static List<Locale> languagesByCountry(String str) {
        if (str == null) {
            return Collections.emptyList();
        }
        List<Locale> list = cLanguagesByCountry.get(str);
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            for (Locale locale : availableLocaleList()) {
                if (str.equals(locale.getCountry()) && locale.getVariant().isEmpty()) {
                    arrayList.add(locale);
                }
            }
            List<Locale> unmodifiableList = Collections.unmodifiableList(arrayList);
            ConcurrentMap<String, List<Locale>> concurrentMap = cLanguagesByCountry;
            concurrentMap.putIfAbsent(str, unmodifiableList);
            return concurrentMap.get(str);
        }
        return list;
    }

    public static List<Locale> countriesByLanguage(String str) {
        if (str == null) {
            return Collections.emptyList();
        }
        List<Locale> list = cCountriesByLanguage.get(str);
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            for (Locale locale : availableLocaleList()) {
                if (str.equals(locale.getLanguage()) && !locale.getCountry().isEmpty() && locale.getVariant().isEmpty()) {
                    arrayList.add(locale);
                }
            }
            List<Locale> unmodifiableList = Collections.unmodifiableList(arrayList);
            ConcurrentMap<String, List<Locale>> concurrentMap = cCountriesByLanguage;
            concurrentMap.putIfAbsent(str, unmodifiableList);
            return concurrentMap.get(str);
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class SyncAvoid {
        private static final List<Locale> AVAILABLE_LOCALE_LIST;
        private static final Set<Locale> AVAILABLE_LOCALE_SET;

        SyncAvoid() {
        }

        static {
            ArrayList arrayList = new ArrayList(Arrays.asList(Locale.getAvailableLocales()));
            AVAILABLE_LOCALE_LIST = Collections.unmodifiableList(arrayList);
            AVAILABLE_LOCALE_SET = Collections.unmodifiableSet(new HashSet(arrayList));
        }
    }
}
