package j$.time;

import j$.time.zone.ZoneRules;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
/* loaded from: classes3.dex */
public abstract class ZoneId implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static final Map f20783a;
    private static final long serialVersionUID = 8352817235686L;

    static {
        Map.Entry[] entryArr = {AbstractC0689a.k("ACT", "Australia/Darwin"), AbstractC0689a.k("AET", "Australia/Sydney"), AbstractC0689a.k("AGT", "America/Argentina/Buenos_Aires"), AbstractC0689a.k("ART", "Africa/Cairo"), AbstractC0689a.k("AST", "America/Anchorage"), AbstractC0689a.k("BET", "America/Sao_Paulo"), AbstractC0689a.k("BST", "Asia/Dhaka"), AbstractC0689a.k("CAT", "Africa/Harare"), AbstractC0689a.k("CNT", "America/St_Johns"), AbstractC0689a.k("CST", "America/Chicago"), AbstractC0689a.k("CTT", "Asia/Shanghai"), AbstractC0689a.k("EAT", "Africa/Addis_Ababa"), AbstractC0689a.k("ECT", "Europe/Paris"), AbstractC0689a.k("IET", "America/Indiana/Indianapolis"), AbstractC0689a.k("IST", "Asia/Kolkata"), AbstractC0689a.k("JST", "Asia/Tokyo"), AbstractC0689a.k("MIT", "Pacific/Apia"), AbstractC0689a.k("NET", "Asia/Yerevan"), AbstractC0689a.k("NST", "Pacific/Auckland"), AbstractC0689a.k("PLT", "Asia/Karachi"), AbstractC0689a.k("PNT", "America/Phoenix"), AbstractC0689a.k("PRT", "America/Puerto_Rico"), AbstractC0689a.k("PST", "America/Los_Angeles"), AbstractC0689a.k("SST", "Pacific/Guadalcanal"), AbstractC0689a.k("VST", "Asia/Ho_Chi_Minh"), AbstractC0689a.k("EST", "-05:00"), AbstractC0689a.k("MST", "-07:00"), AbstractC0689a.k("HST", "-10:00")};
        HashMap hashMap = new HashMap(28);
        for (int i6 = 0; i6 < 28; i6++) {
            Map.Entry entry = entryArr[i6];
            Object requireNonNull = Objects.requireNonNull(entry.getKey());
            if (hashMap.put(requireNonNull, Objects.requireNonNull(entry.getValue())) != null) {
                throw new IllegalArgumentException("duplicate key: " + requireNonNull);
            }
        }
        f20783a = Collections.unmodifiableMap(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ZoneId() {
        if (getClass() != ZoneOffset.class && getClass() != B.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public static ZoneId T(j$.time.temporal.l lVar) {
        ZoneId zoneId = (ZoneId) lVar.J(j$.time.temporal.o.k());
        if (zoneId != null) {
            return zoneId;
        }
        String name = lVar.getClass().getName();
        throw new d("Unable to obtain ZoneId from TemporalAccessor: " + lVar + " of type " + name);
    }

    public static ZoneId U(String str) {
        return W(str, true);
    }

    public static ZoneId V(String str, Map map) {
        Objects.requireNonNull(str, "zoneId");
        Objects.requireNonNull(map, "aliasMap");
        Object obj = (String) map.get(str);
        if (obj == null) {
            obj = Objects.requireNonNull(str, "defaultObj");
        }
        return W((String) obj, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ZoneId W(String str, boolean z10) {
        int i6;
        Objects.requireNonNull(str, "zoneId");
        if (str.length() <= 1 || str.startsWith("+") || str.startsWith("-")) {
            return ZoneOffset.d0(str);
        }
        if (str.startsWith("UTC") || str.startsWith("GMT")) {
            i6 = 3;
        } else if (!str.startsWith("UT")) {
            return B.a0(str, z10);
        } else {
            i6 = 2;
        }
        return Y(str, i6, z10);
    }

    public static ZoneId X(String str, ZoneOffset zoneOffset) {
        Objects.requireNonNull(str, "prefix");
        Objects.requireNonNull(zoneOffset, "offset");
        if (str.isEmpty()) {
            return zoneOffset;
        }
        if (str.equals("GMT") || str.equals("UTC") || str.equals("UT")) {
            if (zoneOffset.c0() != 0) {
                str = str.concat(zoneOffset.k());
            }
            return new B(str, ZoneRules.i(zoneOffset));
        }
        throw new IllegalArgumentException("prefix should be GMT, UTC or UT, is: ".concat(str));
    }

    private static ZoneId Y(String str, int i6, boolean z10) {
        String substring = str.substring(0, i6);
        if (str.length() == i6) {
            return X(substring, ZoneOffset.UTC);
        }
        if (str.charAt(i6) == '+' || str.charAt(i6) == '-') {
            try {
                ZoneOffset d02 = ZoneOffset.d0(str.substring(i6));
                return d02 == ZoneOffset.UTC ? X(substring, d02) : X(substring, d02);
            } catch (d e10) {
                throw new d("Invalid ID for offset-based ZoneId: ".concat(str), e10);
            }
        }
        return B.a0(str, z10);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static ZoneId systemDefault() {
        return V(TimeZone.getDefault().getID(), f20783a);
    }

    private Object writeReplace() {
        return new w((byte) 7, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void Z(DataOutput dataOutput);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneId) {
            return k().equals(((ZoneId) obj).k());
        }
        return false;
    }

    public abstract ZoneRules getRules();

    public int hashCode() {
        return k().hashCode();
    }

    public abstract String k();

    public String toString() {
        return k();
    }
}
