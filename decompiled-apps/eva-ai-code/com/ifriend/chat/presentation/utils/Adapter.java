package com.ifriend.chat.presentation.utils;

import android.text.Spanned;
import android.text.TextWatcher;
import android.view.View;
import androidx.databinding.BindingAdapter;
import androidx.lifecycle.MutableLiveData;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ifriend.ui.button.AppButton;
import com.ifriend.ui.button.BadgedGradientButton;
import com.ifriend.ui.button.ChooseGradientButton;
import com.ifriend.ui.button.GradientButton;
import com.ifriend.ui.calendar.CalendarPicker;
import com.ifriend.ui.editText.DarkEditText;
import com.ifriend.ui.editText.WhiteEditText;
import com.ifriend.ui.premiumAdvantages.ExpandableAdvantagesListView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: BindingAdapter.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\bH\u0007J>\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0014\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0018\u00010\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J9\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0002\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020 H\u0007J\u0018\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u0007\u001a\u00020\u0014H\u0007J\u001e\u0010$\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020%2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00140\u000eH\u0007J\u001e\u0010$\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020&2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00140\u000eH\u0007J\u001e\u0010'\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020(2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00140\u000eH\u0007J\u001e\u0010)\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020&2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00140\u000eH\u0007J\u001e\u0010*\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020&2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00190\u000eH\u0007J\u0018\u0010+\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u0007\u001a\u00020\u0014H\u0007¨\u0006,"}, d2 = {"Lcom/ifriend/chat/presentation/utils/Adapter;", "", "()V", "onTextChanged", "", "editText", "Lcom/ifriend/ui/editText/DarkEditText;", "value", "Landroid/text/TextWatcher;", "Lcom/ifriend/ui/editText/WhiteEditText;", "setAdvantages", "advantagesView", "Lcom/ifriend/ui/premiumAdvantages/ExpandableAdvantagesListView;", "advantages", "Landroidx/lifecycle/MutableLiveData;", "", "", "max_advantages_without_expanding", "", "isRainbowCheck", "", "setBadgeText", "button", "Lcom/ifriend/ui/button/BadgedGradientButton;", "button_text", "Landroid/text/Spanned;", "badge_text", "is_badge_visible", "(Lcom/ifriend/ui/button/BadgedGradientButton;Landroidx/lifecycle/MutableLiveData;Ljava/lang/String;Ljava/lang/Boolean;)V", "setDateListener", "calendarPicker", "Lcom/ifriend/ui/calendar/CalendarPicker;", "Lcom/ifriend/ui/calendar/CalendarPicker$DateListener;", "setGoneVisibility", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "setIsActive", "Lcom/ifriend/ui/button/AppButton;", "Lcom/ifriend/ui/button/GradientButton;", "setIsChosen", "Lcom/ifriend/ui/button/ChooseGradientButton;", "setIsEnabled", "setText", "setVisibility", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Adapter {
    public static final int $stable = 0;
    public static final Adapter INSTANCE = new Adapter();

    private Adapter() {
    }

    @BindingAdapter({"set_visibility"})
    @JvmStatic
    public static final void setVisibility(View view, boolean z) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (z) {
            view.setVisibility(0);
        } else {
            view.setVisibility(4);
        }
    }

    @BindingAdapter({"set_gone_visibility"})
    @JvmStatic
    public static final void setGoneVisibility(View view, boolean z) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (z) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    @BindingAdapter({"on_text_changed"})
    @JvmStatic
    public static final void onTextChanged(DarkEditText editText, TextWatcher value) {
        Intrinsics.checkNotNullParameter(editText, "editText");
        Intrinsics.checkNotNullParameter(value, "value");
        editText.onTextChanged(value);
    }

    @BindingAdapter({"on_text_changed"})
    @JvmStatic
    public static final void onTextChanged(WhiteEditText editText, TextWatcher value) {
        Intrinsics.checkNotNullParameter(editText, "editText");
        Intrinsics.checkNotNullParameter(value, "value");
        editText.onTextChanged(value);
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

    @BindingAdapter({"is_active"})
    @JvmStatic
    public static final void setIsActive(GradientButton button, MutableLiveData<Boolean> value) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(value, "value");
        button.setActive(Intrinsics.areEqual((Object) value.getValue(), (Object) true));
    }

    @BindingAdapter({"is_active"})
    @JvmStatic
    public static final void setIsActive(AppButton button, MutableLiveData<Boolean> value) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(value, "value");
        button.setActive(Intrinsics.areEqual((Object) value.getValue(), (Object) true));
    }

    @BindingAdapter({"is_enabled"})
    @JvmStatic
    public static final void setIsEnabled(GradientButton button, MutableLiveData<Boolean> value) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(value, "value");
        button.setEnabled(Intrinsics.areEqual((Object) value.getValue(), (Object) true));
    }

    @BindingAdapter({"set_text"})
    @JvmStatic
    public static final void setText(GradientButton button, MutableLiveData<Spanned> value) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(value, "value");
        Spanned value2 = value.getValue();
        if (value2 != null) {
            button.setText(value2);
        }
    }

    @BindingAdapter(requireAll = false, value = {"bind:advantages", "bind:max_advantages_without_expanding", "bind:is_rainbow_check"})
    @JvmStatic
    public static final void setAdvantages(ExpandableAdvantagesListView advantagesView, MutableLiveData<List<String>> mutableLiveData, MutableLiveData<Integer> mutableLiveData2, boolean z) {
        Integer value;
        List<String> value2;
        Intrinsics.checkNotNullParameter(advantagesView, "advantagesView");
        if (mutableLiveData != null && (value2 = mutableLiveData.getValue()) != null) {
            advantagesView.setItems(value2);
        }
        if (mutableLiveData2 != null && (value = mutableLiveData2.getValue()) != null) {
            advantagesView.setMaxItemsWithoutExpandButton(value.intValue());
        }
        if (z) {
            advantagesView.setRainbowCheck();
        }
        advantagesView.updateState();
    }

    @BindingAdapter(requireAll = false, value = {"bind:button_text", "bind:badge_text", "bind:is_badge_visible"})
    @JvmStatic
    public static final void setBadgeText(BadgedGradientButton button, MutableLiveData<Spanned> mutableLiveData, String str, Boolean bool) {
        Spanned value;
        Intrinsics.checkNotNullParameter(button, "button");
        if (mutableLiveData != null && (value = mutableLiveData.getValue()) != null) {
            button.setText(value);
        }
        if (str == null) {
            str = "";
        }
        button.setBadgeText(str);
        button.setBadgeVisible(bool != null ? bool.booleanValue() : false);
    }
}
