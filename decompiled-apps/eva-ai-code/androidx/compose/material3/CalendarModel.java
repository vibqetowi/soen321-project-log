package androidx.compose.material3;

import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: CalendarModel.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\ba\u0018\u00002\u00020\u0001J \u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015H&J\"\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0016J\"\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0012H&J\u0012\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u0014\u001a\u00020\u0015H&J\u0010\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0007H&J\u0010\u0010 \u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u0007H&J\u0018\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0003H&J\u0010\u0010 \u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0012H&J\u0018\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\u0003H&J\u001a\u0010%\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\rH&J\u0018\u0010&\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020\u0003H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR$\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f0\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006(À\u0006\u0001"}, d2 = {"Landroidx/compose/material3/CalendarModel;", "", "firstDayOfWeek", "", "getFirstDayOfWeek", "()I", "today", "Landroidx/compose/material3/CalendarDate;", "getToday", "()Landroidx/compose/material3/CalendarDate;", "weekdayNames", "", "Lkotlin/Pair;", "", "getWeekdayNames", "()Ljava/util/List;", "formatWithPattern", "utcTimeMillis", "", "pattern", "locale", "Ljava/util/Locale;", "formatWithSkeleton", "date", "skeleton", "month", "Landroidx/compose/material3/CalendarMonth;", "getCanonicalDate", "timeInMillis", "getDateInputFormat", "Landroidx/compose/material3/DateInputFormat;", "getDayOfWeek", "getMonth", "year", "minusMonths", "from", "subtractedMonthsCount", "parse", "plusMonths", "addedMonthsCount", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface CalendarModel {
    String formatWithPattern(long j, String str, Locale locale);

    String formatWithSkeleton(CalendarDate calendarDate, String str, Locale locale);

    String formatWithSkeleton(CalendarMonth calendarMonth, String str, Locale locale);

    CalendarDate getCanonicalDate(long j);

    DateInputFormat getDateInputFormat(Locale locale);

    int getDayOfWeek(CalendarDate calendarDate);

    int getFirstDayOfWeek();

    CalendarMonth getMonth(int i, int i2);

    CalendarMonth getMonth(long j);

    CalendarMonth getMonth(CalendarDate calendarDate);

    CalendarDate getToday();

    List<Pair<String, String>> getWeekdayNames();

    CalendarMonth minusMonths(CalendarMonth calendarMonth, int i);

    CalendarDate parse(String str, String str2);

    CalendarMonth plusMonths(CalendarMonth calendarMonth, int i);

    /* compiled from: CalendarModel.kt */
    /* renamed from: androidx.compose.material3.CalendarModel$-CC  reason: invalid class name */
    /* loaded from: classes.dex */
    public final /* synthetic */ class CC {
        public static /* synthetic */ DateInputFormat getDateInputFormat$default(CalendarModel calendarModel, Locale locale, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    locale = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
                }
                return calendarModel.getDateInputFormat(locale);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDateInputFormat");
        }

        public static /* synthetic */ String formatWithSkeleton$default(CalendarModel calendarModel, CalendarMonth calendarMonth, String str, Locale locale, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    locale = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
                }
                return calendarModel.formatWithSkeleton(calendarMonth, str, locale);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: formatWithSkeleton");
        }

        public static String $default$formatWithSkeleton(CalendarModel _this, CalendarMonth month, String skeleton, Locale locale) {
            Intrinsics.checkNotNullParameter(month, "month");
            Intrinsics.checkNotNullParameter(skeleton, "skeleton");
            Intrinsics.checkNotNullParameter(locale, "locale");
            return CalendarModel_androidKt.formatWithSkeleton(month.getStartUtcTimeMillis(), skeleton, locale);
        }

        public static /* synthetic */ String formatWithSkeleton$default(CalendarModel calendarModel, CalendarDate calendarDate, String str, Locale locale, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    locale = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
                }
                return calendarModel.formatWithSkeleton(calendarDate, str, locale);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: formatWithSkeleton");
        }

        public static String $default$formatWithSkeleton(CalendarModel _this, CalendarDate date, String skeleton, Locale locale) {
            Intrinsics.checkNotNullParameter(date, "date");
            Intrinsics.checkNotNullParameter(skeleton, "skeleton");
            Intrinsics.checkNotNullParameter(locale, "locale");
            return CalendarModel_androidKt.formatWithSkeleton(date.getUtcTimeMillis(), skeleton, locale);
        }
    }
}
