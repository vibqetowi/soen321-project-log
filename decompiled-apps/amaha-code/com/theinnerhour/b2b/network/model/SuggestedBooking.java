package com.theinnerhour.b2b.network.model;

import com.appsflyer.R;
import com.theinnerhour.b2b.model.TypeOfPackageModel;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import pl.a;
import tf.b;
import v.g;
/* compiled from: UpcomingSessionsModel.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0002\u0010\u000eJ\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\fHÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003JY\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u0005HÆ\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103HÖ\u0003J\t\u00104\u001a\u00020\u0003HÖ\u0001J\t\u00105\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\u001e\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u001aR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u00066"}, d2 = {"Lcom/theinnerhour/b2b/network/model/SuggestedBooking;", "Ljava/io/Serializable;", "providerId", "", "sessionDateTime", "", "customerTimezoneDate", "Lcom/theinnerhour/b2b/network/model/BookingTime;", "slot", "duration", "mode", "suggestedPackage", "Lcom/theinnerhour/b2b/model/TypeOfPackageModel;", "expiryDisplayText", "(ILjava/lang/String;Lcom/theinnerhour/b2b/network/model/BookingTime;Ljava/lang/String;ILjava/lang/String;Lcom/theinnerhour/b2b/model/TypeOfPackageModel;Ljava/lang/String;)V", "getCustomerTimezoneDate", "()Lcom/theinnerhour/b2b/network/model/BookingTime;", "setCustomerTimezoneDate", "(Lcom/theinnerhour/b2b/network/model/BookingTime;)V", "getDuration", "()I", "setDuration", "(I)V", "getExpiryDisplayText", "()Ljava/lang/String;", "setExpiryDisplayText", "(Ljava/lang/String;)V", "getMode", "setMode", "getProviderId", "setProviderId", "getSessionDateTime", "setSessionDateTime", "getSlot", "setSlot", "getSuggestedPackage", "()Lcom/theinnerhour/b2b/model/TypeOfPackageModel;", "setSuggestedPackage", "(Lcom/theinnerhour/b2b/model/TypeOfPackageModel;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class SuggestedBooking implements Serializable {
    @b("datetime_at_customer_timezone")
    private BookingTime customerTimezoneDate;
    @b("duration")
    private int duration;
    @b("expiry_display_text")
    private String expiryDisplayText;
    @b("session_mode")
    private String mode;
    @b("provider_id")
    private int providerId;
    @b("session_datetime")
    private String sessionDateTime;
    @b("slot")
    private String slot;
    @b("package")
    private TypeOfPackageModel suggestedPackage;

    public SuggestedBooking(int i6, String sessionDateTime, BookingTime customerTimezoneDate, String slot, int i10, String mode, TypeOfPackageModel suggestedPackage, String expiryDisplayText) {
        i.g(sessionDateTime, "sessionDateTime");
        i.g(customerTimezoneDate, "customerTimezoneDate");
        i.g(slot, "slot");
        i.g(mode, "mode");
        i.g(suggestedPackage, "suggestedPackage");
        i.g(expiryDisplayText, "expiryDisplayText");
        this.providerId = i6;
        this.sessionDateTime = sessionDateTime;
        this.customerTimezoneDate = customerTimezoneDate;
        this.slot = slot;
        this.duration = i10;
        this.mode = mode;
        this.suggestedPackage = suggestedPackage;
        this.expiryDisplayText = expiryDisplayText;
    }

    public static /* synthetic */ SuggestedBooking copy$default(SuggestedBooking suggestedBooking, int i6, String str, BookingTime bookingTime, String str2, int i10, String str3, TypeOfPackageModel typeOfPackageModel, String str4, int i11, Object obj) {
        int i12;
        String str5;
        BookingTime bookingTime2;
        String str6;
        int i13;
        String str7;
        TypeOfPackageModel typeOfPackageModel2;
        String str8;
        if ((i11 & 1) != 0) {
            i12 = suggestedBooking.providerId;
        } else {
            i12 = i6;
        }
        if ((i11 & 2) != 0) {
            str5 = suggestedBooking.sessionDateTime;
        } else {
            str5 = str;
        }
        if ((i11 & 4) != 0) {
            bookingTime2 = suggestedBooking.customerTimezoneDate;
        } else {
            bookingTime2 = bookingTime;
        }
        if ((i11 & 8) != 0) {
            str6 = suggestedBooking.slot;
        } else {
            str6 = str2;
        }
        if ((i11 & 16) != 0) {
            i13 = suggestedBooking.duration;
        } else {
            i13 = i10;
        }
        if ((i11 & 32) != 0) {
            str7 = suggestedBooking.mode;
        } else {
            str7 = str3;
        }
        if ((i11 & 64) != 0) {
            typeOfPackageModel2 = suggestedBooking.suggestedPackage;
        } else {
            typeOfPackageModel2 = typeOfPackageModel;
        }
        if ((i11 & 128) != 0) {
            str8 = suggestedBooking.expiryDisplayText;
        } else {
            str8 = str4;
        }
        return suggestedBooking.copy(i12, str5, bookingTime2, str6, i13, str7, typeOfPackageModel2, str8);
    }

    public final int component1() {
        return this.providerId;
    }

    public final String component2() {
        return this.sessionDateTime;
    }

    public final BookingTime component3() {
        return this.customerTimezoneDate;
    }

    public final String component4() {
        return this.slot;
    }

    public final int component5() {
        return this.duration;
    }

    public final String component6() {
        return this.mode;
    }

    public final TypeOfPackageModel component7() {
        return this.suggestedPackage;
    }

    public final String component8() {
        return this.expiryDisplayText;
    }

    public final SuggestedBooking copy(int i6, String sessionDateTime, BookingTime customerTimezoneDate, String slot, int i10, String mode, TypeOfPackageModel suggestedPackage, String expiryDisplayText) {
        i.g(sessionDateTime, "sessionDateTime");
        i.g(customerTimezoneDate, "customerTimezoneDate");
        i.g(slot, "slot");
        i.g(mode, "mode");
        i.g(suggestedPackage, "suggestedPackage");
        i.g(expiryDisplayText, "expiryDisplayText");
        return new SuggestedBooking(i6, sessionDateTime, customerTimezoneDate, slot, i10, mode, suggestedPackage, expiryDisplayText);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuggestedBooking)) {
            return false;
        }
        SuggestedBooking suggestedBooking = (SuggestedBooking) obj;
        if (this.providerId == suggestedBooking.providerId && i.b(this.sessionDateTime, suggestedBooking.sessionDateTime) && i.b(this.customerTimezoneDate, suggestedBooking.customerTimezoneDate) && i.b(this.slot, suggestedBooking.slot) && this.duration == suggestedBooking.duration && i.b(this.mode, suggestedBooking.mode) && i.b(this.suggestedPackage, suggestedBooking.suggestedPackage) && i.b(this.expiryDisplayText, suggestedBooking.expiryDisplayText)) {
            return true;
        }
        return false;
    }

    public final BookingTime getCustomerTimezoneDate() {
        return this.customerTimezoneDate;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final String getExpiryDisplayText() {
        return this.expiryDisplayText;
    }

    public final String getMode() {
        return this.mode;
    }

    public final int getProviderId() {
        return this.providerId;
    }

    public final String getSessionDateTime() {
        return this.sessionDateTime;
    }

    public final String getSlot() {
        return this.slot;
    }

    public final TypeOfPackageModel getSuggestedPackage() {
        return this.suggestedPackage;
    }

    public int hashCode() {
        int c10 = a.c(this.sessionDateTime, this.providerId * 31, 31);
        String str = this.slot;
        int c11 = a.c(this.mode, (a.c(str, (this.customerTimezoneDate.hashCode() + c10) * 31, 31) + this.duration) * 31, 31);
        return this.expiryDisplayText.hashCode() + ((this.suggestedPackage.hashCode() + c11) * 31);
    }

    public final void setCustomerTimezoneDate(BookingTime bookingTime) {
        i.g(bookingTime, "<set-?>");
        this.customerTimezoneDate = bookingTime;
    }

    public final void setDuration(int i6) {
        this.duration = i6;
    }

    public final void setExpiryDisplayText(String str) {
        i.g(str, "<set-?>");
        this.expiryDisplayText = str;
    }

    public final void setMode(String str) {
        i.g(str, "<set-?>");
        this.mode = str;
    }

    public final void setProviderId(int i6) {
        this.providerId = i6;
    }

    public final void setSessionDateTime(String str) {
        i.g(str, "<set-?>");
        this.sessionDateTime = str;
    }

    public final void setSlot(String str) {
        i.g(str, "<set-?>");
        this.slot = str;
    }

    public final void setSuggestedPackage(TypeOfPackageModel typeOfPackageModel) {
        i.g(typeOfPackageModel, "<set-?>");
        this.suggestedPackage = typeOfPackageModel;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SuggestedBooking(providerId=");
        sb2.append(this.providerId);
        sb2.append(", sessionDateTime=");
        sb2.append(this.sessionDateTime);
        sb2.append(", customerTimezoneDate=");
        sb2.append(this.customerTimezoneDate);
        sb2.append(", slot=");
        sb2.append(this.slot);
        sb2.append(", duration=");
        sb2.append(this.duration);
        sb2.append(", mode=");
        sb2.append(this.mode);
        sb2.append(", suggestedPackage=");
        sb2.append(this.suggestedPackage);
        sb2.append(", expiryDisplayText=");
        return g.c(sb2, this.expiryDisplayText, ')');
    }
}
