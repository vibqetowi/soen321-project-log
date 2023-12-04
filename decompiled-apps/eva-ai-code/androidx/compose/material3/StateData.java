package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.apache.commons.lang3.ClassUtils;
/* compiled from: DatePicker.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\b\b\u0001\u0018\u0000 72\u00020\u0001:\u00017B6\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\tø\u0001\u0000¢\u0006\u0002\u0010\nJ\u001f\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u00032\b\u00102\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u00103J\u001b\u00104\u001a\u0002002\u0006\u0010\u0013\u001a\u00020\tø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b5\u00106R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R#\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u0014X\u0086\u000eø\u0001\u0000¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R+\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00108F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u001dR\u0011\u0010 \u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\"\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0016\"\u0004\b'\u0010\u0018R\"\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0016\"\u0004\b*\u0010\u0018R\u0011\u0010+\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b,\u0010#R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00068"}, d2 = {"Landroidx/compose/material3/StateData;", "", "initialSelectedStartDateMillis", "", "initialSelectedEndDateMillis", "initialDisplayedMonthMillis", "yearRange", "Lkotlin/ranges/IntRange;", "initialDisplayMode", "Landroidx/compose/material3/DisplayMode;", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/IntRange;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "calendarModel", "Landroidx/compose/material3/CalendarModel;", "getCalendarModel", "()Landroidx/compose/material3/CalendarModel;", "currentMonth", "Landroidx/compose/material3/CalendarMonth;", "getCurrentMonth", "()Landroidx/compose/material3/CalendarMonth;", "displayMode", "Landroidx/compose/runtime/MutableState;", "getDisplayMode", "()Landroidx/compose/runtime/MutableState;", "setDisplayMode", "(Landroidx/compose/runtime/MutableState;)V", "<set-?>", "displayedMonth", "getDisplayedMonth", "setDisplayedMonth", "(Landroidx/compose/material3/CalendarMonth;)V", "displayedMonth$delegate", "Landroidx/compose/runtime/MutableState;", "displayedMonthIndex", "", "getDisplayedMonthIndex", "()I", "selectedEndDate", "Landroidx/compose/material3/CalendarDate;", "getSelectedEndDate", "setSelectedEndDate", "selectedStartDate", "getSelectedStartDate", "setSelectedStartDate", "totalMonthsInRange", "getTotalMonthsInRange", "getYearRange", "()Lkotlin/ranges/IntRange;", "setSelection", "", "startDateMillis", "endDateMillis", "(Ljava/lang/Long;Ljava/lang/Long;)V", "switchDisplayMode", "switchDisplayMode-vCnGnXg", "(I)V", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StateData {
    public static final Companion Companion = new Companion(null);
    private final CalendarModel calendarModel;
    private MutableState<DisplayMode> displayMode;
    private final MutableState displayedMonth$delegate;
    private MutableState<CalendarDate> selectedEndDate;
    private MutableState<CalendarDate> selectedStartDate;
    private final IntRange yearRange;

    public /* synthetic */ StateData(Long l, Long l2, Long l3, IntRange intRange, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(l, l2, l3, intRange, i);
    }

    private StateData(Long l, Long l2, Long l3, IntRange yearRange, int i) {
        MutableState<CalendarDate> mutableStateOf$default;
        MutableState<CalendarDate> mutableStateOf$default2;
        CalendarMonth currentMonth;
        MutableState mutableStateOf$default3;
        MutableState<DisplayMode> mutableStateOf$default4;
        Intrinsics.checkNotNullParameter(yearRange, "yearRange");
        this.yearRange = yearRange;
        CalendarModel CalendarModel = CalendarModel_androidKt.CalendarModel();
        this.calendarModel = CalendarModel;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.selectedStartDate = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.selectedEndDate = mutableStateOf$default2;
        setSelection(l, l2);
        if (l3 != null) {
            currentMonth = CalendarModel.getMonth(l3.longValue());
            if (!yearRange.contains(currentMonth.getYear())) {
                throw new IllegalArgumentException(("The initial display month's year (" + currentMonth.getYear() + ") is out of the years range of " + yearRange + ClassUtils.PACKAGE_SEPARATOR_CHAR).toString());
            }
        } else {
            currentMonth = getCurrentMonth();
        }
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(currentMonth, null, 2, null);
        this.displayedMonth$delegate = mutableStateOf$default3;
        mutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(DisplayMode.m1759boximpl(i), null, 2, null);
        this.displayMode = mutableStateOf$default4;
    }

    public final IntRange getYearRange() {
        return this.yearRange;
    }

    public final CalendarModel getCalendarModel() {
        return this.calendarModel;
    }

    public final MutableState<CalendarDate> getSelectedStartDate() {
        return this.selectedStartDate;
    }

    public final void setSelectedStartDate(MutableState<CalendarDate> mutableState) {
        Intrinsics.checkNotNullParameter(mutableState, "<set-?>");
        this.selectedStartDate = mutableState;
    }

    public final MutableState<CalendarDate> getSelectedEndDate() {
        return this.selectedEndDate;
    }

    public final void setSelectedEndDate(MutableState<CalendarDate> mutableState) {
        Intrinsics.checkNotNullParameter(mutableState, "<set-?>");
        this.selectedEndDate = mutableState;
    }

    public final CalendarMonth getDisplayedMonth() {
        return (CalendarMonth) this.displayedMonth$delegate.getValue();
    }

    public final void setDisplayedMonth(CalendarMonth calendarMonth) {
        Intrinsics.checkNotNullParameter(calendarMonth, "<set-?>");
        this.displayedMonth$delegate.setValue(calendarMonth);
    }

    public final CalendarMonth getCurrentMonth() {
        CalendarModel calendarModel = this.calendarModel;
        return calendarModel.getMonth(calendarModel.getToday());
    }

    public final MutableState<DisplayMode> getDisplayMode() {
        return this.displayMode;
    }

    public final void setDisplayMode(MutableState<DisplayMode> mutableState) {
        Intrinsics.checkNotNullParameter(mutableState, "<set-?>");
        this.displayMode = mutableState;
    }

    public final int getDisplayedMonthIndex() {
        return getDisplayedMonth().indexIn(this.yearRange);
    }

    public final int getTotalMonthsInRange() {
        return ((this.yearRange.getLast() - this.yearRange.getFirst()) + 1) * 12;
    }

    public final void setSelection(Long l, Long l2) {
        CalendarDate canonicalDate = l != null ? this.calendarModel.getCanonicalDate(l.longValue()) : null;
        CalendarDate canonicalDate2 = l2 != null ? this.calendarModel.getCanonicalDate(l2.longValue()) : null;
        if (canonicalDate != null && !this.yearRange.contains(canonicalDate.getYear())) {
            throw new IllegalArgumentException(("The provided start date year (" + canonicalDate.getYear() + ") is out of the years range of " + this.yearRange + ClassUtils.PACKAGE_SEPARATOR_CHAR).toString());
        } else if (canonicalDate2 != null && !this.yearRange.contains(canonicalDate2.getYear())) {
            throw new IllegalArgumentException(("The provided end date year (" + canonicalDate2.getYear() + ") is out of the years range of " + this.yearRange + ClassUtils.PACKAGE_SEPARATOR_CHAR).toString());
        } else {
            if (canonicalDate2 != null) {
                if (canonicalDate == null) {
                    throw new IllegalArgumentException("An end date was provided without a start date.".toString());
                }
                if (!(canonicalDate.getUtcTimeMillis() <= canonicalDate2.getUtcTimeMillis())) {
                    throw new IllegalArgumentException("The provided end date appears before the start date.".toString());
                }
            }
            this.selectedStartDate.setValue(canonicalDate);
            this.selectedEndDate.setValue(canonicalDate2);
        }
    }

    /* renamed from: switchDisplayMode-vCnGnXg  reason: not valid java name */
    public final void m1986switchDisplayModevCnGnXg(int i) {
        CalendarDate value = this.selectedStartDate.getValue();
        if (value != null) {
            setDisplayedMonth(this.calendarModel.getMonth(value));
        }
        if (this.selectedStartDate.getValue() == null && this.selectedEndDate.getValue() != null) {
            this.selectedEndDate.setValue(null);
        }
        this.displayMode.setValue(DisplayMode.m1759boximpl(i));
    }

    /* compiled from: DatePicker.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/compose/material3/StateData$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/StateData;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Saver<StateData, Object> Saver() {
            return ListSaverKt.listSaver(StateData$Companion$Saver$1.INSTANCE, StateData$Companion$Saver$2.INSTANCE);
        }
    }
}
