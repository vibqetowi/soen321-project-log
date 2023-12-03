package com.theinnerhour.b2b.network.model;

import com.appsflyer.R;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import pl.a;
import tf.b;
import v.g;
/* compiled from: UpcomingSessionsModel.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\f¨\u0006\""}, d2 = {"Lcom/theinnerhour/b2b/network/model/BookingTime;", "Ljava/io/Serializable;", "date", "", "euroDate", "slot", "dateTime", "slotWithZone", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDate", "()Ljava/lang/String;", "setDate", "(Ljava/lang/String;)V", "getDateTime", "setDateTime", "getEuroDate", "setEuroDate", "getSlot", "setSlot", "getSlotWithZone", "setSlotWithZone", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class BookingTime implements Serializable {
    @b("date")
    private String date;
    @b("datetime")
    private String dateTime;
    @b("euro_date")
    private String euroDate;
    @b("slot")
    private String slot;
    @b("slot_with_zone")
    private String slotWithZone;

    public BookingTime(String date, String euroDate, String slot, String dateTime, String slotWithZone) {
        i.g(date, "date");
        i.g(euroDate, "euroDate");
        i.g(slot, "slot");
        i.g(dateTime, "dateTime");
        i.g(slotWithZone, "slotWithZone");
        this.date = date;
        this.euroDate = euroDate;
        this.slot = slot;
        this.dateTime = dateTime;
        this.slotWithZone = slotWithZone;
    }

    public static /* synthetic */ BookingTime copy$default(BookingTime bookingTime, String str, String str2, String str3, String str4, String str5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = bookingTime.date;
        }
        if ((i6 & 2) != 0) {
            str2 = bookingTime.euroDate;
        }
        String str6 = str2;
        if ((i6 & 4) != 0) {
            str3 = bookingTime.slot;
        }
        String str7 = str3;
        if ((i6 & 8) != 0) {
            str4 = bookingTime.dateTime;
        }
        String str8 = str4;
        if ((i6 & 16) != 0) {
            str5 = bookingTime.slotWithZone;
        }
        return bookingTime.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.date;
    }

    public final String component2() {
        return this.euroDate;
    }

    public final String component3() {
        return this.slot;
    }

    public final String component4() {
        return this.dateTime;
    }

    public final String component5() {
        return this.slotWithZone;
    }

    public final BookingTime copy(String date, String euroDate, String slot, String dateTime, String slotWithZone) {
        i.g(date, "date");
        i.g(euroDate, "euroDate");
        i.g(slot, "slot");
        i.g(dateTime, "dateTime");
        i.g(slotWithZone, "slotWithZone");
        return new BookingTime(date, euroDate, slot, dateTime, slotWithZone);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BookingTime)) {
            return false;
        }
        BookingTime bookingTime = (BookingTime) obj;
        if (i.b(this.date, bookingTime.date) && i.b(this.euroDate, bookingTime.euroDate) && i.b(this.slot, bookingTime.slot) && i.b(this.dateTime, bookingTime.dateTime) && i.b(this.slotWithZone, bookingTime.slotWithZone)) {
            return true;
        }
        return false;
    }

    public final String getDate() {
        return this.date;
    }

    public final String getDateTime() {
        return this.dateTime;
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
        return this.slotWithZone.hashCode() + a.c(this.dateTime, a.c(this.slot, a.c(this.euroDate, this.date.hashCode() * 31, 31), 31), 31);
    }

    public final void setDate(String str) {
        i.g(str, "<set-?>");
        this.date = str;
    }

    public final void setDateTime(String str) {
        i.g(str, "<set-?>");
        this.dateTime = str;
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
        StringBuilder sb2 = new StringBuilder("BookingTime(date=");
        sb2.append(this.date);
        sb2.append(", euroDate=");
        sb2.append(this.euroDate);
        sb2.append(", slot=");
        sb2.append(this.slot);
        sb2.append(", dateTime=");
        sb2.append(this.dateTime);
        sb2.append(", slotWithZone=");
        return g.c(sb2, this.slotWithZone, ')');
    }
}
