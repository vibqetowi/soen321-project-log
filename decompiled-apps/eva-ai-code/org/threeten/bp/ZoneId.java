package org.threeten.bp;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.common.net.HttpHeaders;
import java.io.DataOutput;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import org.apache.commons.lang3.time.TimeZones;
import org.threeten.bp.format.DateTimeFormatterBuilder;
import org.threeten.bp.format.TextStyle;
import org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor;
import org.threeten.bp.jdk8.Jdk8Methods;
import org.threeten.bp.temporal.TemporalAccessor;
import org.threeten.bp.temporal.TemporalField;
import org.threeten.bp.temporal.TemporalQueries;
import org.threeten.bp.temporal.TemporalQuery;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.zone.ZoneRules;
import org.threeten.bp.zone.ZoneRulesException;
import org.threeten.bp.zone.ZoneRulesProvider;
/* loaded from: classes5.dex */
public abstract class ZoneId implements Serializable {
    public static final TemporalQuery<ZoneId> FROM = new TemporalQuery<ZoneId>() { // from class: org.threeten.bp.ZoneId.1
        @Override // org.threeten.bp.temporal.TemporalQuery
        public ZoneId queryFrom(TemporalAccessor temporalAccessor) {
            return ZoneId.from(temporalAccessor);
        }
    };
    public static final Map<String, String> SHORT_IDS;
    private static final long serialVersionUID = 8352817235686L;

    public abstract String getId();

    public abstract ZoneRules getRules();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void write(DataOutput dataOutput) throws IOException;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("ACT", "Australia/Darwin");
        hashMap.put("AET", "Australia/Sydney");
        hashMap.put("AGT", "America/Argentina/Buenos_Aires");
        hashMap.put("ART", "Africa/Cairo");
        hashMap.put("AST", "America/Anchorage");
        hashMap.put("BET", "America/Sao_Paulo");
        hashMap.put("BST", "Asia/Dhaka");
        hashMap.put("CAT", "Africa/Harare");
        hashMap.put("CNT", "America/St_Johns");
        hashMap.put("CST", "America/Chicago");
        hashMap.put("CTT", "Asia/Shanghai");
        hashMap.put("EAT", "Africa/Addis_Ababa");
        hashMap.put(HttpHeaders.ECT, "Europe/Paris");
        hashMap.put("IET", "America/Indiana/Indianapolis");
        hashMap.put("IST", "Asia/Kolkata");
        hashMap.put("JST", "Asia/Tokyo");
        hashMap.put("MIT", "Pacific/Apia");
        hashMap.put("NET", "Asia/Yerevan");
        hashMap.put("NST", "Pacific/Auckland");
        hashMap.put("PLT", "Asia/Karachi");
        hashMap.put("PNT", "America/Phoenix");
        hashMap.put("PRT", "America/Puerto_Rico");
        hashMap.put("PST", "America/Los_Angeles");
        hashMap.put("SST", "Pacific/Guadalcanal");
        hashMap.put("VST", "Asia/Ho_Chi_Minh");
        hashMap.put("EST", "-05:00");
        hashMap.put("MST", "-07:00");
        hashMap.put("HST", "-10:00");
        SHORT_IDS = Collections.unmodifiableMap(hashMap);
    }

    public static ZoneId systemDefault() {
        return of(TimeZone.getDefault().getID(), SHORT_IDS);
    }

    public static Set<String> getAvailableZoneIds() {
        return new HashSet(ZoneRulesProvider.getAvailableZoneIds());
    }

    public static ZoneId of(String str, Map<String, String> map) {
        Jdk8Methods.requireNonNull(str, "zoneId");
        Jdk8Methods.requireNonNull(map, "aliasMap");
        String str2 = map.get(str);
        if (str2 != null) {
            str = str2;
        }
        return of(str);
    }

    public static ZoneId of(String str) {
        Jdk8Methods.requireNonNull(str, "zoneId");
        if (str.equals("Z")) {
            return ZoneOffset.UTC;
        }
        if (str.length() == 1) {
            throw new DateTimeException("Invalid zone: " + str);
        } else if (str.startsWith("+") || str.startsWith("-")) {
            return ZoneOffset.of(str);
        } else {
            if (str.equals("UTC") || str.equals(TimeZones.GMT_ID) || str.equals("UT")) {
                return new ZoneRegion(str, ZoneOffset.UTC.getRules());
            }
            if (str.startsWith("UTC+") || str.startsWith("GMT+") || str.startsWith("UTC-") || str.startsWith("GMT-")) {
                ZoneOffset of = ZoneOffset.of(str.substring(3));
                if (of.getTotalSeconds() == 0) {
                    return new ZoneRegion(str.substring(0, 3), of.getRules());
                }
                return new ZoneRegion(str.substring(0, 3) + of.getId(), of.getRules());
            } else if (str.startsWith("UT+") || str.startsWith("UT-")) {
                ZoneOffset of2 = ZoneOffset.of(str.substring(2));
                if (of2.getTotalSeconds() == 0) {
                    return new ZoneRegion("UT", of2.getRules());
                }
                return new ZoneRegion("UT" + of2.getId(), of2.getRules());
            } else {
                return ZoneRegion.ofId(str, true);
            }
        }
    }

    public static ZoneId ofOffset(String str, ZoneOffset zoneOffset) {
        Jdk8Methods.requireNonNull(str, "prefix");
        Jdk8Methods.requireNonNull(zoneOffset, TypedValues.CycleType.S_WAVE_OFFSET);
        if (str.length() == 0) {
            return zoneOffset;
        }
        if (str.equals(TimeZones.GMT_ID) || str.equals("UTC") || str.equals("UT")) {
            if (zoneOffset.getTotalSeconds() == 0) {
                return new ZoneRegion(str, zoneOffset.getRules());
            }
            return new ZoneRegion(str + zoneOffset.getId(), zoneOffset.getRules());
        }
        throw new IllegalArgumentException("Invalid prefix, must be GMT, UTC or UT: " + str);
    }

    public static ZoneId from(TemporalAccessor temporalAccessor) {
        ZoneId zoneId = (ZoneId) temporalAccessor.query(TemporalQueries.zone());
        if (zoneId != null) {
            return zoneId;
        }
        throw new DateTimeException("Unable to obtain ZoneId from TemporalAccessor: " + temporalAccessor + ", type " + temporalAccessor.getClass().getName());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ZoneId() {
        if (getClass() != ZoneOffset.class && getClass() != ZoneRegion.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public String getDisplayName(TextStyle textStyle, Locale locale) {
        return new DateTimeFormatterBuilder().appendZoneText(textStyle).toFormatter(locale).format(new DefaultInterfaceTemporalAccessor() { // from class: org.threeten.bp.ZoneId.2
            @Override // org.threeten.bp.temporal.TemporalAccessor
            public boolean isSupported(TemporalField temporalField) {
                return false;
            }

            @Override // org.threeten.bp.temporal.TemporalAccessor
            public long getLong(TemporalField temporalField) {
                throw new UnsupportedTemporalTypeException("Unsupported field: " + temporalField);
            }

            @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
            public <R> R query(TemporalQuery<R> temporalQuery) {
                if (temporalQuery == TemporalQueries.zoneId()) {
                    return (R) ZoneId.this;
                }
                return (R) super.query(temporalQuery);
            }
        });
    }

    public ZoneId normalized() {
        try {
            ZoneRules rules = getRules();
            if (rules.isFixedOffset()) {
                return rules.getOffset(Instant.EPOCH);
            }
        } catch (ZoneRulesException unused) {
        }
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneId) {
            return getId().equals(((ZoneId) obj).getId());
        }
        return false;
    }

    public int hashCode() {
        return getId().hashCode();
    }

    public String toString() {
        return getId();
    }
}
