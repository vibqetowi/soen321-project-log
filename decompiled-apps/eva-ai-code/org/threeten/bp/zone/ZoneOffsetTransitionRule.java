package org.threeten.bp.zone;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import io.grpc.netty.shaded.io.netty.handler.codec.rtsp.RtspHeaders;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.threeten.bp.DayOfWeek;
import org.threeten.bp.LocalDate;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.LocalTime;
import org.threeten.bp.Month;
import org.threeten.bp.ZoneOffset;
import org.threeten.bp.chrono.IsoChronology;
import org.threeten.bp.jdk8.Jdk8Methods;
import org.threeten.bp.temporal.TemporalAdjusters;
/* loaded from: classes5.dex */
public final class ZoneOffsetTransitionRule implements Serializable {
    private static final int SECS_PER_DAY = 86400;
    private static final long serialVersionUID = 6889046316657758795L;
    private final int adjustDays;
    private final byte dom;
    private final DayOfWeek dow;
    private final Month month;
    private final ZoneOffset offsetAfter;
    private final ZoneOffset offsetBefore;
    private final ZoneOffset standardOffset;
    private final LocalTime time;
    private final TimeDefinition timeDefinition;

    public static ZoneOffsetTransitionRule of(Month month, int i, DayOfWeek dayOfWeek, LocalTime localTime, boolean z, TimeDefinition timeDefinition, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        Jdk8Methods.requireNonNull(month, "month");
        Jdk8Methods.requireNonNull(localTime, RtspHeaders.Values.TIME);
        Jdk8Methods.requireNonNull(timeDefinition, "timeDefnition");
        Jdk8Methods.requireNonNull(zoneOffset, "standardOffset");
        Jdk8Methods.requireNonNull(zoneOffset2, "offsetBefore");
        Jdk8Methods.requireNonNull(zoneOffset3, "offsetAfter");
        if (i < -28 || i > 31 || i == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (z && !localTime.equals(LocalTime.MIDNIGHT)) {
            throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
        }
        return new ZoneOffsetTransitionRule(month, i, dayOfWeek, localTime, z ? 1 : 0, timeDefinition, zoneOffset, zoneOffset2, zoneOffset3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ZoneOffsetTransitionRule(Month month, int i, DayOfWeek dayOfWeek, LocalTime localTime, int i2, TimeDefinition timeDefinition, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        this.month = month;
        this.dom = (byte) i;
        this.dow = dayOfWeek;
        this.time = localTime;
        this.adjustDays = i2;
        this.timeDefinition = timeDefinition;
        this.standardOffset = zoneOffset;
        this.offsetBefore = zoneOffset2;
        this.offsetAfter = zoneOffset3;
    }

    private Object writeReplace() {
        return new Ser((byte) 3, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writeExternal(DataOutput dataOutput) throws IOException {
        int i;
        int secondOfDay = this.time.toSecondOfDay() + (this.adjustDays * SECS_PER_DAY);
        int totalSeconds = this.standardOffset.getTotalSeconds();
        int totalSeconds2 = this.offsetBefore.getTotalSeconds() - totalSeconds;
        int totalSeconds3 = this.offsetAfter.getTotalSeconds() - totalSeconds;
        if (secondOfDay % 3600 != 0 || secondOfDay > SECS_PER_DAY) {
            i = 31;
        } else {
            i = secondOfDay == SECS_PER_DAY ? 24 : this.time.getHour();
        }
        int i2 = totalSeconds % TypedValues.Custom.TYPE_INT == 0 ? (totalSeconds / TypedValues.Custom.TYPE_INT) + 128 : 255;
        int i3 = (totalSeconds2 == 0 || totalSeconds2 == 1800 || totalSeconds2 == 3600) ? totalSeconds2 / 1800 : 3;
        int i4 = (totalSeconds3 == 0 || totalSeconds3 == 1800 || totalSeconds3 == 3600) ? totalSeconds3 / 1800 : 3;
        DayOfWeek dayOfWeek = this.dow;
        dataOutput.writeInt((this.month.getValue() << 28) + ((this.dom + 32) << 22) + ((dayOfWeek == null ? 0 : dayOfWeek.getValue()) << 19) + (i << 14) + (this.timeDefinition.ordinal() << 12) + (i2 << 4) + (i3 << 2) + i4);
        if (i == 31) {
            dataOutput.writeInt(secondOfDay);
        }
        if (i2 == 255) {
            dataOutput.writeInt(totalSeconds);
        }
        if (i3 == 3) {
            dataOutput.writeInt(this.offsetBefore.getTotalSeconds());
        }
        if (i4 == 3) {
            dataOutput.writeInt(this.offsetAfter.getTotalSeconds());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ZoneOffsetTransitionRule readExternal(DataInput dataInput) throws IOException {
        int readInt = dataInput.readInt();
        Month of = Month.of(readInt >>> 28);
        int i = ((264241152 & readInt) >>> 22) - 32;
        int i2 = (3670016 & readInt) >>> 19;
        DayOfWeek of2 = i2 == 0 ? null : DayOfWeek.of(i2);
        int i3 = (507904 & readInt) >>> 14;
        TimeDefinition timeDefinition = TimeDefinition.values()[(readInt & 12288) >>> 12];
        int i4 = (readInt & 4080) >>> 4;
        int i5 = (readInt & 12) >>> 2;
        int i6 = readInt & 3;
        int readInt2 = i3 == 31 ? dataInput.readInt() : i3 * 3600;
        ZoneOffset ofTotalSeconds = ZoneOffset.ofTotalSeconds(i4 == 255 ? dataInput.readInt() : (i4 - 128) * TypedValues.Custom.TYPE_INT);
        ZoneOffset ofTotalSeconds2 = ZoneOffset.ofTotalSeconds(i5 == 3 ? dataInput.readInt() : ofTotalSeconds.getTotalSeconds() + (i5 * 1800));
        ZoneOffset ofTotalSeconds3 = ZoneOffset.ofTotalSeconds(i6 == 3 ? dataInput.readInt() : ofTotalSeconds.getTotalSeconds() + (i6 * 1800));
        if (i < -28 || i > 31 || i == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        return new ZoneOffsetTransitionRule(of, i, of2, LocalTime.ofSecondOfDay(Jdk8Methods.floorMod(readInt2, (int) SECS_PER_DAY)), Jdk8Methods.floorDiv(readInt2, (int) SECS_PER_DAY), timeDefinition, ofTotalSeconds, ofTotalSeconds2, ofTotalSeconds3);
    }

    public Month getMonth() {
        return this.month;
    }

    public int getDayOfMonthIndicator() {
        return this.dom;
    }

    public DayOfWeek getDayOfWeek() {
        return this.dow;
    }

    public LocalTime getLocalTime() {
        return this.time;
    }

    public boolean isMidnightEndOfDay() {
        return this.adjustDays == 1 && this.time.equals(LocalTime.MIDNIGHT);
    }

    public TimeDefinition getTimeDefinition() {
        return this.timeDefinition;
    }

    public ZoneOffset getStandardOffset() {
        return this.standardOffset;
    }

    public ZoneOffset getOffsetBefore() {
        return this.offsetBefore;
    }

    public ZoneOffset getOffsetAfter() {
        return this.offsetAfter;
    }

    public ZoneOffsetTransition createTransition(int i) {
        LocalDate of;
        byte b = this.dom;
        if (b < 0) {
            Month month = this.month;
            of = LocalDate.of(i, month, month.length(IsoChronology.INSTANCE.isLeapYear(i)) + 1 + this.dom);
            DayOfWeek dayOfWeek = this.dow;
            if (dayOfWeek != null) {
                of = of.with(TemporalAdjusters.previousOrSame(dayOfWeek));
            }
        } else {
            of = LocalDate.of(i, this.month, b);
            DayOfWeek dayOfWeek2 = this.dow;
            if (dayOfWeek2 != null) {
                of = of.with(TemporalAdjusters.nextOrSame(dayOfWeek2));
            }
        }
        return new ZoneOffsetTransition(this.timeDefinition.createDateTime(LocalDateTime.of(of.plusDays(this.adjustDays), this.time), this.standardOffset, this.offsetBefore), this.offsetBefore, this.offsetAfter);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ZoneOffsetTransitionRule) {
            ZoneOffsetTransitionRule zoneOffsetTransitionRule = (ZoneOffsetTransitionRule) obj;
            return this.month == zoneOffsetTransitionRule.month && this.dom == zoneOffsetTransitionRule.dom && this.dow == zoneOffsetTransitionRule.dow && this.timeDefinition == zoneOffsetTransitionRule.timeDefinition && this.adjustDays == zoneOffsetTransitionRule.adjustDays && this.time.equals(zoneOffsetTransitionRule.time) && this.standardOffset.equals(zoneOffsetTransitionRule.standardOffset) && this.offsetBefore.equals(zoneOffsetTransitionRule.offsetBefore) && this.offsetAfter.equals(zoneOffsetTransitionRule.offsetAfter);
        }
        return false;
    }

    public int hashCode() {
        int secondOfDay = ((this.time.toSecondOfDay() + this.adjustDays) << 15) + (this.month.ordinal() << 11) + ((this.dom + 32) << 5);
        DayOfWeek dayOfWeek = this.dow;
        return ((((secondOfDay + ((dayOfWeek == null ? 7 : dayOfWeek.ordinal()) << 2)) + this.timeDefinition.ordinal()) ^ this.standardOffset.hashCode()) ^ this.offsetBefore.hashCode()) ^ this.offsetAfter.hashCode();
    }

    public String toString() {
        long j;
        StringBuilder sb = new StringBuilder();
        sb.append("TransitionRule[");
        sb.append(this.offsetBefore.compareTo(this.offsetAfter) > 0 ? "Gap " : "Overlap ");
        sb.append(this.offsetBefore);
        sb.append(" to ");
        sb.append(this.offsetAfter);
        sb.append(", ");
        DayOfWeek dayOfWeek = this.dow;
        if (dayOfWeek != null) {
            byte b = this.dom;
            if (b == -1) {
                sb.append(dayOfWeek.name());
                sb.append(" on or before last day of ");
                sb.append(this.month.name());
            } else if (b < 0) {
                sb.append(dayOfWeek.name());
                sb.append(" on or before last day minus ");
                sb.append((-this.dom) - 1);
                sb.append(" of ");
                sb.append(this.month.name());
            } else {
                sb.append(dayOfWeek.name());
                sb.append(" on or after ");
                sb.append(this.month.name());
                sb.append(' ');
                sb.append((int) this.dom);
            }
        } else {
            sb.append(this.month.name());
            sb.append(' ');
            sb.append((int) this.dom);
        }
        sb.append(" at ");
        if (this.adjustDays == 0) {
            sb.append(this.time);
        } else {
            appendZeroPad(sb, Jdk8Methods.floorDiv((this.time.toSecondOfDay() / 60) + (this.adjustDays * 24 * 60), 60L));
            sb.append(AbstractJsonLexerKt.COLON);
            appendZeroPad(sb, Jdk8Methods.floorMod(j, 60));
        }
        sb.append(" ");
        sb.append(this.timeDefinition);
        sb.append(", standard offset ");
        sb.append(this.standardOffset);
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    private void appendZeroPad(StringBuilder sb, long j) {
        if (j < 10) {
            sb.append(0);
        }
        sb.append(j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: org.threeten.bp.zone.ZoneOffsetTransitionRule$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$threeten$bp$zone$ZoneOffsetTransitionRule$TimeDefinition;

        static {
            int[] iArr = new int[TimeDefinition.values().length];
            $SwitchMap$org$threeten$bp$zone$ZoneOffsetTransitionRule$TimeDefinition = iArr;
            try {
                iArr[TimeDefinition.UTC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$threeten$bp$zone$ZoneOffsetTransitionRule$TimeDefinition[TimeDefinition.STANDARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes5.dex */
    public enum TimeDefinition {
        UTC,
        WALL,
        STANDARD;

        public LocalDateTime createDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
            int i = AnonymousClass1.$SwitchMap$org$threeten$bp$zone$ZoneOffsetTransitionRule$TimeDefinition[ordinal()];
            if (i != 1) {
                return i != 2 ? localDateTime : localDateTime.plusSeconds(zoneOffset2.getTotalSeconds() - zoneOffset.getTotalSeconds());
            }
            return localDateTime.plusSeconds(zoneOffset2.getTotalSeconds() - ZoneOffset.UTC.getTotalSeconds());
        }
    }
}
