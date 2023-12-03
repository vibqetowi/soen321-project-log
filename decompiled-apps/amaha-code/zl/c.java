package zl;

import com.theinnerhour.b2b.network.model.SuggestedBooking;
import com.theinnerhour.b2b.network.model.UpcomingBooking;
import j$.time.LocalDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import java.util.Comparator;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: Comparisons.kt */
/* loaded from: classes2.dex */
public final class c<T> implements Comparator {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ DateTimeFormatter f39476u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ LocalDateTime f39477v;

    public c(DateTimeFormatter dateTimeFormatter, LocalDateTime localDateTime) {
        this.f39476u = dateTimeFormatter;
        this.f39477v = localDateTime;
    }

    @Override // java.util.Comparator
    public final int compare(T t3, T t10) {
        SuggestedBooking suggestedBooking;
        long between;
        UpcomingBooking upcomingBooking;
        hs.f fVar = (hs.f) t3;
        int ordinal = ((b) fVar.f19464u).ordinal();
        LocalDateTime localDateTime = this.f39477v;
        DateTimeFormatter dateTimeFormatter = this.f39476u;
        long j10 = -1;
        SuggestedBooking suggestedBooking2 = null;
        UpcomingBooking upcomingBooking2 = null;
        B b10 = fVar.f19465v;
        switch (ordinal) {
            case 0:
            case 1:
                if (b10 instanceof SuggestedBooking) {
                    suggestedBooking = (SuggestedBooking) b10;
                } else {
                    suggestedBooking = null;
                }
                if (suggestedBooking != null) {
                    LocalDateTime parse = LocalDateTime.parse(suggestedBooking.getCustomerTimezoneDate().getDate() + ' ' + suggestedBooking.getCustomerTimezoneDate().getSlot(), dateTimeFormatter);
                    kotlin.jvm.internal.i.f(parse, "parse(bookingDateTimeString, dateFormat)");
                    between = ChronoUnit.SECONDS.between(localDateTime, parse);
                    break;
                }
                between = -1;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                if (b10 instanceof UpcomingBooking) {
                    upcomingBooking = (UpcomingBooking) b10;
                } else {
                    upcomingBooking = null;
                }
                if (upcomingBooking != null) {
                    LocalDateTime parse2 = LocalDateTime.parse(upcomingBooking.getDatetimeAtCustomerTimezone().getDate() + ' ' + upcomingBooking.getDatetimeAtCustomerTimezone().getSlot(), dateTimeFormatter);
                    kotlin.jvm.internal.i.f(parse2, "parse(bookingDateTimeString, dateFormat)");
                    between = ChronoUnit.SECONDS.between(localDateTime, parse2);
                    break;
                }
                between = -1;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        Long valueOf = Long.valueOf(between);
        hs.f fVar2 = (hs.f) t10;
        int ordinal2 = ((b) fVar2.f19464u).ordinal();
        B b11 = fVar2.f19465v;
        switch (ordinal2) {
            case 0:
            case 1:
                if (b11 instanceof SuggestedBooking) {
                    suggestedBooking2 = (SuggestedBooking) b11;
                }
                if (suggestedBooking2 != null) {
                    LocalDateTime parse3 = LocalDateTime.parse(suggestedBooking2.getCustomerTimezoneDate().getDate() + ' ' + suggestedBooking2.getCustomerTimezoneDate().getSlot(), dateTimeFormatter);
                    kotlin.jvm.internal.i.f(parse3, "parse(bookingDateTimeString, dateFormat)");
                    j10 = ChronoUnit.SECONDS.between(localDateTime, parse3);
                    break;
                }
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                if (b11 instanceof UpcomingBooking) {
                    upcomingBooking2 = (UpcomingBooking) b11;
                }
                if (upcomingBooking2 != null) {
                    LocalDateTime parse4 = LocalDateTime.parse(upcomingBooking2.getDatetimeAtCustomerTimezone().getDate() + ' ' + upcomingBooking2.getDatetimeAtCustomerTimezone().getSlot(), dateTimeFormatter);
                    kotlin.jvm.internal.i.f(parse4, "parse(bookingDateTimeString, dateFormat)");
                    j10 = ChronoUnit.SECONDS.between(localDateTime, parse4);
                    break;
                }
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return sp.b.g(valueOf, Long.valueOf(j10));
    }
}
