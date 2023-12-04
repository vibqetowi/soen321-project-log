package org.threeten.bp;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.regex.Pattern;
import org.apache.commons.lang3.time.TimeZones;
import org.threeten.bp.jdk8.Jdk8Methods;
import org.threeten.bp.zone.ZoneRules;
import org.threeten.bp.zone.ZoneRulesException;
import org.threeten.bp.zone.ZoneRulesProvider;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class ZoneRegion extends ZoneId implements Serializable {
    private static final Pattern PATTERN = Pattern.compile("[A-Za-z][A-Za-z0-9~/._+-]+");
    private static final long serialVersionUID = 8386373296231747096L;
    private final String id;
    private final transient ZoneRules rules;

    private static ZoneRegion ofLenient(String str) {
        if (str.equals("Z") || str.startsWith("+") || str.startsWith("-")) {
            throw new DateTimeException("Invalid ID for region-based ZoneId, invalid format: " + str);
        } else if (str.equals("UTC") || str.equals(TimeZones.GMT_ID) || str.equals("UT")) {
            return new ZoneRegion(str, ZoneOffset.UTC.getRules());
        } else {
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
                return ofId(str, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ZoneRegion ofId(String str, boolean z) {
        ZoneRules zoneRules;
        Jdk8Methods.requireNonNull(str, "zoneId");
        if (str.length() < 2 || !PATTERN.matcher(str).matches()) {
            throw new DateTimeException("Invalid ID for region-based ZoneId, invalid format: " + str);
        }
        try {
            zoneRules = ZoneRulesProvider.getRules(str, true);
        } catch (ZoneRulesException e) {
            if (str.equals("GMT0")) {
                zoneRules = ZoneOffset.UTC.getRules();
            } else if (z) {
                throw e;
            } else {
                zoneRules = null;
            }
        }
        return new ZoneRegion(str, zoneRules);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ZoneRegion(String str, ZoneRules zoneRules) {
        this.id = str;
        this.rules = zoneRules;
    }

    @Override // org.threeten.bp.ZoneId
    public String getId() {
        return this.id;
    }

    @Override // org.threeten.bp.ZoneId
    public ZoneRules getRules() {
        ZoneRules zoneRules = this.rules;
        return zoneRules != null ? zoneRules : ZoneRulesProvider.getRules(this.id, false);
    }

    private Object writeReplace() {
        return new Ser((byte) 7, this);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.threeten.bp.ZoneId
    public void write(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(7);
        writeExternal(dataOutput);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writeExternal(DataOutput dataOutput) throws IOException {
        dataOutput.writeUTF(this.id);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ZoneId readExternal(DataInput dataInput) throws IOException {
        return ofLenient(dataInput.readUTF());
    }
}
