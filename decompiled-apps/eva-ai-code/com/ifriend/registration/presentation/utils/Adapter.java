package com.ifriend.registration.presentation.utils;

import androidx.databinding.BindingAdapter;
import androidx.lifecycle.MutableLiveData;
import com.ifriend.ui.button.ChooseGradientButton;
import com.ifriend.ui.button.GradientButton;
import com.ifriend.ui.calendar.CalendarPicker;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: BindingAdapter.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u001e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007J\u001e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¨\u0006\u0010"}, d2 = {"Lcom/ifriend/registration/presentation/utils/Adapter;", "", "()V", "setDateListener", "", "calendarPicker", "Lcom/ifriend/ui/calendar/CalendarPicker;", "value", "Lcom/ifriend/ui/calendar/CalendarPicker$DateListener;", "setIsActive", "button", "Lcom/ifriend/ui/button/GradientButton;", "Landroidx/lifecycle/MutableLiveData;", "", "setIsChosen", "Lcom/ifriend/ui/button/ChooseGradientButton;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Adapter {
    public static final int $stable = 0;
    public static final Adapter INSTANCE = new Adapter();

    private Adapter() {
    }

    @BindingAdapter({"is_active"})
    @JvmStatic
    public static final void setIsActive(GradientButton button, MutableLiveData<Boolean> value) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(value, "value");
        button.setActive(Intrinsics.areEqual((Object) value.getValue(), (Object) true));
    }

    @BindingAdapter({"is_chosen"})
    @JvmStatic
    public static final void setIsChosen(ChooseGradientButton button, MutableLiveData<Boolean> value) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(value, "value");
        button.setChosen(Intrinsics.areEqual((Object) value.getValue(), (Object) true));
    }

    @BindingAdapter({"set_date_listener"})
    @JvmStatic
    public static final void setDateListener(CalendarPicker calendarPicker, CalendarPicker.DateListener value) {
        Intrinsics.checkNotNullParameter(calendarPicker, "calendarPicker");
        Intrinsics.checkNotNullParameter(value, "value");
        calendarPicker.setDateListener(value);
    }
}
