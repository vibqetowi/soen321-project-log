package com.theinnerhour.b2b.network.model;

import com.appsflyer.R;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import pl.a;
import tf.b;
import v.g;
/* compiled from: UpcomingSessionsModel.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003JE\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e¨\u0006)"}, d2 = {"Lcom/theinnerhour/b2b/network/model/DatetimeAtTimezone;", "Ljava/io/Serializable;", "date", "", "datetime", "diffFromUtcHours", "", "euroDate", "slot", "slotWithZone", "(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDate", "()Ljava/lang/String;", "setDate", "(Ljava/lang/String;)V", "getDatetime", "setDatetime", "getDiffFromUtcHours", "()D", "setDiffFromUtcHours", "(D)V", "getEuroDate", "setEuroDate", "getSlot", "setSlot", "getSlotWithZone", "setSlotWithZone", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class DatetimeAtTimezone implements Serializable {
    @b("date")
    private String date;
    @b("datetime")
    private String datetime;
    @b("diff_from_utc_hours")
    private double diffFromUtcHours;
    @b("euro_date")
    private String euroDate;
    @b("slot")
    private String slot;
    @b("slot_with_zone")
    private String slotWithZone;

    public DatetimeAtTimezone(String date, String datetime, double d10, String euroDate, String slot, String slotWithZone) {
        i.g(date, "date");
        i.g(datetime, "datetime");
        i.g(euroDate, "euroDate");
        i.g(slot, "slot");
        i.g(slotWithZone, "slotWithZone");
        this.date = date;
        this.datetime = datetime;
        this.diffFromUtcHours = d10;
        this.euroDate = euroDate;
        this.slot = slot;
        this.slotWithZone = slotWithZone;
    }

    public static /* synthetic */ DatetimeAtTimezone copy$default(DatetimeAtTimezone datetimeAtTimezone, String str, String str2, double d10, String str3, String str4, String str5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = datetimeAtTimezone.date;
        }
        if ((i6 & 2) != 0) {
            str2 = datetimeAtTimezone.datetime;
        }
        String str6 = str2;
        if ((i6 & 4) != 0) {
            d10 = datetimeAtTimezone.diffFromUtcHours;
        }
        double d11 = d10;
        if ((i6 & 8) != 0) {
            str3 = datetimeAtTimezone.euroDate;
        }
        String str7 = str3;
        if ((i6 & 16) != 0) {
            str4 = datetimeAtTimezone.slot;
        }
        String str8 = str4;
        if ((i6 & 32) != 0) {
            str5 = datetimeAtTimezone.slotWithZone;
        }
        return datetimeAtTimezone.copy(str, str6, d11, str7, str8, str5);
    }

    public final String component1() {
        return this.date;
    }

    public final String component2() {
        return this.datetime;
    }

    public final double component3() {
        return this.diffFromUtcHours;
    }

    public final String component4() {
        return this.euroDate;
    }

    public final String component5() {
        return this.slot;
    }

    public final String component6() {
        return this.slotWithZone;
    }

    public final DatetimeAtTimezone copy(String date, String datetime, double d10, String euroDate, String slot, String slotWithZone) {
        i.g(date, "date");
        i.g(datetime, "datetime");
        i.g(euroDate, "euroDate");
        i.g(slot, "slot");
        i.g(slotWithZone, "slotWithZone");
        return new DatetimeAtTimezone(date, datetime, d10, euroDate, slot, slotWithZone);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DatetimeAtTimezone)) {
            return false;
        }
        DatetimeAtTimezone datetimeAtTimezone = (DatetimeAtTimezone) obj;
        if (i.b(this.date, datetimeAtTimezone.date) && i.b(this.datetime, datetimeAtTimezone.datetime) && Double.compare(this.diffFromUtcHours, datetimeAtTimezone.diffFromUtcHours) == 0 && i.b(this.euroDate, datetimeAtTimezone.euroDate) && i.b(this.slot, datetimeAtTimezone.slot) && i.b(this.slotWithZone, datetimeAtTimezone.slotWithZone)) {
            return true;
        }
        return false;
    }

    public final String getDate() {
        return this.date;
    }

    public final String getDatetime() {
        return this.datetime;
    }

    public final double getDiffFromUtcHours() {
        return this.diffFromUtcHours;
    }

    public final String getEuroDate() {
        return this.euroDate;
    }

    public final String getSlot() {
        return this.slot;
    }

    public final String getSlotWithZone() {
        return this.slotWithZone;
    }

    public int hashCode() {
        int c10 = a.c(this.datetime, this.date.hashCode() * 31, 31);
        long doubleToLongBits = Double.doubleToLongBits(this.diffFromUtcHours);
        return this.slotWithZone.hashCode() + a.c(this.slot, a.c(this.euroDate, (c10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31, 31), 31);
    }

    public final void setDate(String str) {
        i.g(str, "<set-?>");
        this.date = str;
    }

    public final void setDatetime(String str) {
        i.g(str, "<set-?>");
        this.datetime = str;
    }

    public final void setDiffFromUtcHours(double d10) {
        this.diffFromUtcHours = d10;
    }

    public final void setEuroDate(String str) {
        i.g(str, "<set-?>");
        this.euroDate = str;
    }

    public final void setSlot(String str) {
        i.g(str, "<set-?>");
        this.slot = str;
    }

    public final void setSlotWithZone(String str) {
        i.g(str, "<set-?>");
        this.slotWithZone = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("DatetimeAtTimezone(date=");
        sb2.append(this.date);
        sb2.append(", datetime=");
        sb2.append(this.datetime);
        sb2.append(", diffFromUtcHours=");
        sb2.append(this.diffFromUtcHours);
        sb2.append(", euroDate=");
        sb2.append(this.euroDate);
        sb2.append(", slot=");
        sb2.append(this.slot);
        sb2.append(", slotWithZone=");
        return g.c(sb2, this.slotWithZone, ')');
    }
}
