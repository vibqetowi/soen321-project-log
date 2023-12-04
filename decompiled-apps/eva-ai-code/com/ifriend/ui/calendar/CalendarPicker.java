package com.ifriend.ui.calendar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.NumberPicker;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ifriend.ui.R;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: CalendarPicker.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002&'B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0011H\u0016J\b\u0010\u0015\u001a\u00020\u0011H\u0016J\u0010\u0010\u0016\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\tJ \u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u001dJ\u001e\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u001aJ\b\u0010\"\u001a\u00020\u0011H\u0002J\b\u0010#\u001a\u00020\u0011H\u0002J\b\u0010$\u001a\u00020\u0011H\u0002J\b\u0010%\u001a\u00020\u0011H\u0002R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/ifriend/ui/calendar/CalendarPicker;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/ifriend/ui/calendar/DateFactoryListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "dataSelectListener", "Lcom/ifriend/ui/calendar/CalendarPicker$DateListener;", "dayView", "Landroid/widget/NumberPicker;", "factory", "Lcom/ifriend/ui/calendar/DatePickerFactory;", "monthView", "yearView", "notifyDateSelect", "", "onConfigsChanged", "onDayChanged", "onMonthChanged", "onYearChanged", "setDateListener", "dateListener", "setLimits", "minAge", "", "maxAge", "cutOneDay", "", "setSelectedDate", "year", "month", "day", "setUpCalendar", "setUpDayView", "setUpMonthView", "setUpYearView", "CalendarDate", "DateListener", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CalendarPicker extends ConstraintLayout implements DateFactoryListener {
    public static final int $stable = 8;
    private DateListener dataSelectListener;
    private final NumberPicker dayView;
    private final DatePickerFactory factory;
    private final NumberPicker monthView;
    private final NumberPicker yearView;

    /* compiled from: CalendarPicker.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ifriend/ui/calendar/CalendarPicker$DateListener;", "", "update", "", "date", "Lcom/ifriend/ui/calendar/CalendarPicker$CalendarDate;", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public interface DateListener {
        void update(CalendarDate calendarDate);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CalendarPicker(Context context) {
        this(context, null, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CalendarPicker(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalendarPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.factory = new DatePickerFactory(this);
        ConstraintLayout.inflate(context, R.layout.calendar_picker, this);
        View findViewById = findViewById(R.id.month);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        NumberPicker numberPicker = (NumberPicker) findViewById;
        this.monthView = numberPicker;
        View findViewById2 = findViewById(R.id.day);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        NumberPicker numberPicker2 = (NumberPicker) findViewById2;
        this.dayView = numberPicker2;
        View findViewById3 = findViewById(R.id.year);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        NumberPicker numberPicker3 = (NumberPicker) findViewById3;
        this.yearView = numberPicker3;
        numberPicker.setWrapSelectorWheel(false);
        numberPicker2.setWrapSelectorWheel(false);
        numberPicker3.setWrapSelectorWheel(false);
        numberPicker3.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() { // from class: com.ifriend.ui.calendar.CalendarPicker$$ExternalSyntheticLambda0
            @Override // android.widget.NumberPicker.OnValueChangeListener
            public final void onValueChange(NumberPicker numberPicker4, int i, int i2) {
                CalendarPicker._init_$lambda$0(CalendarPicker.this, numberPicker4, i, i2);
            }
        });
        numberPicker.setDisplayedValues(DatePickerFactory.dfs.getMonths());
        numberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() { // from class: com.ifriend.ui.calendar.CalendarPicker$$ExternalSyntheticLambda1
            @Override // android.widget.NumberPicker.OnValueChangeListener
            public final void onValueChange(NumberPicker numberPicker4, int i, int i2) {
                CalendarPicker._init_$lambda$1(CalendarPicker.this, numberPicker4, i, i2);
            }
        });
        numberPicker2.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() { // from class: com.ifriend.ui.calendar.CalendarPicker$$ExternalSyntheticLambda2
            @Override // android.widget.NumberPicker.OnValueChangeListener
            public final void onValueChange(NumberPicker numberPicker4, int i, int i2) {
                CalendarPicker._init_$lambda$2(CalendarPicker.this, numberPicker4, i, i2);
            }
        });
        setUpCalendar();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(CalendarPicker this$0, NumberPicker numberPicker, int i, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.factory.setSelectedYear(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(CalendarPicker this$0, NumberPicker numberPicker, int i, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.factory.setSelectedMonth(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(CalendarPicker this$0, NumberPicker numberPicker, int i, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.factory.setSelectedDay(i2);
    }

    public final void setSelectedDate(int i, int i2, int i3) {
        this.factory.setSelectedDate(DateUtils.INSTANCE.getTime(i, i2, i3));
        notifyDateSelect();
    }

    public static /* synthetic */ void setLimits$default(CalendarPicker calendarPicker, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            z = true;
        }
        calendarPicker.setLimits(i, i2, z);
    }

    public final void setLimits(int i, int i2, boolean z) {
        int i3 = DateUtils.INSTANCE.getCurrentTime().get(1) - i2;
        int i4 = DateUtils.INSTANCE.getCurrentTime().get(1) - i;
        Calendar currentTime = DateUtils.INSTANCE.getCurrentTime();
        currentTime.set(1, i3);
        Calendar currentTime2 = DateUtils.INSTANCE.getCurrentTime();
        currentTime2.set(1, i4);
        if (z) {
            currentTime.add(6, 1);
            currentTime2.add(6, -1);
        }
        this.factory.setDateLimit(currentTime, currentTime2);
    }

    private final void setUpCalendar() {
        setUpYearView();
        setUpMonthView();
        setUpDayView();
    }

    private final void setUpYearView() {
        DateModel selectedDate = this.factory.getSelectedDate();
        List<Integer> yearList = this.factory.getYearList();
        NumberPicker numberPicker = this.yearView;
        Intrinsics.checkNotNull(yearList);
        Object first = CollectionsKt.first((List<? extends Object>) yearList);
        Intrinsics.checkNotNullExpressionValue(first, "first(...)");
        numberPicker.setMinValue(((Number) first).intValue());
        NumberPicker numberPicker2 = this.yearView;
        Object last = CollectionsKt.last((List<? extends Object>) yearList);
        Intrinsics.checkNotNullExpressionValue(last, "last(...)");
        numberPicker2.setMaxValue(((Number) last).intValue());
        this.yearView.setValue(selectedDate.getYear());
    }

    private final void setUpMonthView() {
        List<Integer> monthList = this.factory.getMonthList();
        Intrinsics.checkNotNull(monthList);
        Integer num = (Integer) CollectionsKt.first((List<? extends Object>) monthList);
        Integer num2 = (Integer) CollectionsKt.last((List<? extends Object>) monthList);
        DateModel selectedDate = this.factory.getSelectedDate();
        this.monthView.setDisplayedValues(DatePickerFactory.dfs.getMonths());
        NumberPicker numberPicker = this.monthView;
        Intrinsics.checkNotNull(num);
        numberPicker.setMinValue(num.intValue());
        NumberPicker numberPicker2 = this.monthView;
        Intrinsics.checkNotNull(num2);
        numberPicker2.setMaxValue(num2.intValue());
        this.monthView.setValue(selectedDate.getMonth());
        NumberPicker numberPicker3 = this.monthView;
        String[] months = DatePickerFactory.dfs.getMonths();
        Intrinsics.checkNotNullExpressionValue(months, "getMonths(...)");
        numberPicker3.setDisplayedValues((String[]) ArraysKt.copyOfRange(months, num.intValue(), num2.intValue() + 1));
    }

    private final void setUpDayView() {
        DateModel selectedDate = this.factory.getSelectedDate();
        List<Integer> dayList = this.factory.getDayList();
        NumberPicker numberPicker = this.dayView;
        Intrinsics.checkNotNull(dayList);
        Object first = CollectionsKt.first((List<? extends Object>) dayList);
        Intrinsics.checkNotNullExpressionValue(first, "first(...)");
        numberPicker.setMinValue(((Number) first).intValue());
        NumberPicker numberPicker2 = this.dayView;
        Object last = CollectionsKt.last((List<? extends Object>) dayList);
        Intrinsics.checkNotNullExpressionValue(last, "last(...)");
        numberPicker2.setMaxValue(((Number) last).intValue());
        this.dayView.setValue(selectedDate.getDay());
    }

    @Override // com.ifriend.ui.calendar.DateFactoryListener
    public void onYearChanged() {
        setUpMonthView();
        setUpDayView();
        notifyDateSelect();
    }

    @Override // com.ifriend.ui.calendar.DateFactoryListener
    public void onMonthChanged() {
        setUpDayView();
        notifyDateSelect();
    }

    @Override // com.ifriend.ui.calendar.DateFactoryListener
    public void onDayChanged() {
        notifyDateSelect();
    }

    @Override // com.ifriend.ui.calendar.DateFactoryListener
    public void onConfigsChanged() {
        setUpCalendar();
    }

    public final void setDateListener(DateListener dateListener) {
        this.dataSelectListener = dateListener;
    }

    private final void notifyDateSelect() {
        DateModel selectedDate = this.factory.getSelectedDate();
        DateListener dateListener = this.dataSelectListener;
        if (dateListener != null) {
            dateListener.update(new CalendarDate(selectedDate.getMonth() + 1, selectedDate.getDay(), selectedDate.getYear()));
        }
    }

    /* compiled from: CalendarPicker.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/ifriend/ui/calendar/CalendarPicker$CalendarDate;", "", "month", "", "day", "year", "(III)V", "getDay", "()I", "getMonth", "getYear", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class CalendarDate {
        public static final int $stable = 0;
        private final int day;
        private final int month;
        private final int year;

        public static /* synthetic */ CalendarDate copy$default(CalendarDate calendarDate, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = calendarDate.month;
            }
            if ((i4 & 2) != 0) {
                i2 = calendarDate.day;
            }
            if ((i4 & 4) != 0) {
                i3 = calendarDate.year;
            }
            return calendarDate.copy(i, i2, i3);
        }

        public final int component1() {
            return this.month;
        }

        public final int component2() {
            return this.day;
        }

        public final int component3() {
            return this.year;
        }

        public final CalendarDate copy(int i, int i2, int i3) {
            return new CalendarDate(i, i2, i3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof CalendarDate) {
                CalendarDate calendarDate = (CalendarDate) obj;
                return this.month == calendarDate.month && this.day == calendarDate.day && this.year == calendarDate.year;
            }
            return false;
        }

        public int hashCode() {
            return (((this.month * 31) + this.day) * 31) + this.year;
        }

        public String toString() {
            int i = this.month;
            int i2 = this.day;
            int i3 = this.year;
            return "CalendarDate(month=" + i + ", day=" + i2 + ", year=" + i3 + ")";
        }

        public CalendarDate(int i, int i2, int i3) {
            this.month = i;
            this.day = i2;
            this.year = i3;
        }

        public final int getDay() {
            return this.day;
        }

        public final int getMonth() {
            return this.month;
        }

        public final int getYear() {
            return this.year;
        }
    }
}
