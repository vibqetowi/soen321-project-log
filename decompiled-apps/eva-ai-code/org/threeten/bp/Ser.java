package org.threeten.bp;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class Ser implements Externalizable {
    static final byte DURATION_TYPE = 1;
    static final byte INSTANT_TYPE = 2;
    static final byte LOCAL_DATE_TIME_TYPE = 4;
    static final byte LOCAL_DATE_TYPE = 3;
    static final byte LOCAL_TIME_TYPE = 5;
    static final byte MONTH_DAY_TYPE = 64;
    static final byte OFFSET_DATE_TIME_TYPE = 69;
    static final byte OFFSET_TIME_TYPE = 66;
    static final byte YEAR_MONTH_TYPE = 68;
    static final byte YEAR_TYPE = 67;
    static final byte ZONED_DATE_TIME_TYPE = 6;
    static final byte ZONE_OFFSET_TYPE = 8;
    static final byte ZONE_REGION_TYPE = 7;
    private static final long serialVersionUID = -7683839454370182990L;
    private Object object;
    private byte type;

    public Ser() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Ser(byte b, Object obj) {
        this.type = b;
        this.object = obj;
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        writeInternal(this.type, this.object, objectOutput);
    }

    static void writeInternal(byte b, Object obj, DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(b);
        if (b != 64) {
            switch (b) {
                case 1:
                    ((Duration) obj).writeExternal(dataOutput);
                    return;
                case 2:
                    ((Instant) obj).writeExternal(dataOutput);
                    return;
                case 3:
                    ((LocalDate) obj).writeExternal(dataOutput);
                    return;
                case 4:
                    ((LocalDateTime) obj).writeExternal(dataOutput);
                    return;
                case 5:
                    ((LocalTime) obj).writeExternal(dataOutput);
                    return;
                case 6:
                    ((ZonedDateTime) obj).writeExternal(dataOutput);
                    return;
                case 7:
                    ((ZoneRegion) obj).writeExternal(dataOutput);
                    return;
                case 8:
                    ((ZoneOffset) obj).writeExternal(dataOutput);
                    return;
                default:
                    switch (b) {
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                            ((OffsetTime) obj).writeExternal(dataOutput);
                            return;
                        case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                            ((Year) obj).writeExternal(dataOutput);
                            return;
                        case 68:
                            ((YearMonth) obj).writeExternal(dataOutput);
                            return;
                        case 69:
                            ((OffsetDateTime) obj).writeExternal(dataOutput);
                            return;
                        default:
                            throw new InvalidClassException("Unknown serialized type");
                    }
            }
        }
        ((MonthDay) obj).writeExternal(dataOutput);
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException {
        byte readByte = objectInput.readByte();
        this.type = readByte;
        this.object = readInternal(readByte, objectInput);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object read(DataInput dataInput) throws IOException {
        return readInternal(dataInput.readByte(), dataInput);
    }

    private static Object readInternal(byte b, DataInput dataInput) throws IOException {
        if (b != 64) {
            switch (b) {
                case 1:
                    return Duration.readExternal(dataInput);
                case 2:
                    return Instant.readExternal(dataInput);
                case 3:
                    return LocalDate.readExternal(dataInput);
                case 4:
                    return LocalDateTime.readExternal(dataInput);
                case 5:
                    return LocalTime.readExternal(dataInput);
                case 6:
                    return ZonedDateTime.readExternal(dataInput);
                case 7:
                    return ZoneRegion.readExternal(dataInput);
                case 8:
                    return ZoneOffset.readExternal(dataInput);
                default:
                    switch (b) {
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                            return OffsetTime.readExternal(dataInput);
                        case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                            return Year.readExternal(dataInput);
                        case 68:
                            return YearMonth.readExternal(dataInput);
                        case 69:
                            return OffsetDateTime.readExternal(dataInput);
                        default:
                            throw new StreamCorruptedException("Unknown serialized type");
                    }
            }
        }
        return MonthDay.readExternal(dataInput);
    }

    private Object readResolve() {
        return this.object;
    }
}
