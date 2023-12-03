package cm;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import android.widget.TimePicker;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.o0;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.AddCustomGoalsActivity;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.model.CustomDate;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Metadata;
import pl.w0;
/* compiled from: AddCustomGoalFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcm/g;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class g extends rr.b {
    public static final /* synthetic */ int E = 0;
    public final Calendar A;
    public fm.a B;
    public final yn.a C;
    public final LinkedHashMap D = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f5336u = LogHelper.INSTANCE.makeLogTag(g.class);

    /* renamed from: v  reason: collision with root package name */
    public final ZoneOffset f5337v = ZoneId.systemDefault().getRules().getOffset(Instant.now());

    /* renamed from: w  reason: collision with root package name */
    public boolean f5338w;

    /* renamed from: x  reason: collision with root package name */
    public AddCustomGoalsActivity f5339x;

    /* renamed from: y  reason: collision with root package name */
    public Calendar f5340y;

    /* renamed from: z  reason: collision with root package name */
    public final Calendar f5341z;

    /* compiled from: AddCustomGoalFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ CompoundButton f5342u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.x<com.google.android.material.bottomsheet.f> f5343v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CompoundButton compoundButton, kotlin.jvm.internal.x<com.google.android.material.bottomsheet.f> xVar) {
            super(1);
            this.f5342u = compoundButton;
            this.f5343v = xVar;
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            this.f5342u.setChecked(bool.booleanValue());
            com.google.android.material.bottomsheet.f fVar = this.f5343v.f23469u;
            if (fVar != null) {
                fVar.dismiss();
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: AddCustomGoalFragment.kt */
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.l<SingleUseEvent<? extends Boolean>, hs.k> {
        public e() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(SingleUseEvent<? extends Boolean> singleUseEvent) {
            Boolean contentIfNotHandled;
            SingleUseEvent<? extends Boolean> singleUseEvent2 = singleUseEvent;
            if (singleUseEvent2 != null && (contentIfNotHandled = singleUseEvent2.getContentIfNotHandled()) != null) {
                contentIfNotHandled.booleanValue();
                g.this.K().n0();
            }
            return hs.k.f19476a;
        }
    }

    public g() {
        Calendar calendar = Calendar.getInstance();
        Utils utils = Utils.INSTANCE;
        long j10 = 1000;
        calendar.setTimeInMillis(utils.getTodayTimeInSeconds() * j10);
        calendar.add(11, 9);
        this.f5340y = calendar;
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(utils.getTodayTimeInSeconds() * j10);
        calendar2.add(11, 9);
        this.f5341z = calendar2;
        Calendar calendar3 = Calendar.getInstance();
        calendar3.setTimeInMillis(utils.getTodayTimeInSeconds() * j10);
        calendar3.add(11, 9);
        this.A = calendar3;
        this.C = new yn.a();
    }

    public final void J(String str, long j10, boolean z10) {
        String str2;
        String str3;
        String str4;
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        CustomDate customDate = new CustomDate();
        long j11 = 1000;
        customDate.setTime(Utils.INSTANCE.getTodayCalendar().getTimeInMillis() / j11);
        FirestoreGoal firestoreGoal = new FirestoreGoal("independent", "custom_" + timeInMillis, "independent", K().F, "custom_goal", customDate, customDate, customDate, new CustomDate(), ((SwitchCompat) _$_findCachedViewById(R.id.notificationToggle)).isChecked(), null, str, true, null);
        long j12 = j10 / j11;
        firestoreGoal.getScheduledDate().setTime(j12);
        fm.a aVar = this.B;
        if (aVar != null) {
            aVar.g(firestoreGoal, z10);
        }
        Bundle bundle = new Bundle();
        ArrayList<String> arrayList = K().f10298y;
        kotlin.jvm.internal.i.d(K().F);
        bundle.putBoolean("custom_entry", !arrayList.contains(str2));
        Integer num = K().G;
        if (num != null && num.intValue() == 0) {
            str3 = "daily";
        } else if (num != null && num.intValue() == 1) {
            str3 = "weekly";
        } else {
            str3 = "one_time";
        }
        bundle.putString("frequency", str3);
        Integer num2 = K().G;
        if (num2 != null && num2.intValue() == 0) {
            bundle.putInt("hour", this.f5340y.get(11));
        } else if (num2 != null && num2.intValue() == 1) {
            Calendar calendar = this.f5341z;
            bundle.putInt("hour", calendar.get(11));
            switch (calendar.get(7)) {
                case 1:
                    str4 = "Sunday";
                    break;
                case 2:
                    str4 = "Monday";
                    break;
                case 3:
                    str4 = "Tuesday";
                    break;
                case 4:
                    str4 = "Wednesday";
                    break;
                case 5:
                    str4 = "Thursday";
                    break;
                case 6:
                    str4 = "Friday";
                    break;
                case 7:
                    str4 = "Saturday";
                    break;
                default:
                    str4 = "";
                    break;
            }
            bundle.putString("day", str4);
        } else if (num2 != null && num2.intValue() == 2) {
            bundle.putInt("hour", this.A.get(11));
            bundle.putLong("date", j12);
        }
        bundle.putBoolean("reminder", z10);
        gk.a.b(bundle, "custom_goal_added");
    }

    public final AddCustomGoalsActivity K() {
        AddCustomGoalsActivity addCustomGoalsActivity = this.f5339x;
        if (addCustomGoalsActivity != null) {
            return addCustomGoalsActivity;
        }
        kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
        throw null;
    }

    public final void M() {
        try {
            Object systemService = requireContext().getSystemService("input_method");
            kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(((RobertoEditText) _$_findCachedViewById(R.id.editTextGoalName)).getWindowToken(), 0);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f5336u, e10);
        }
    }

    public final void O() {
        try {
            ArrayAdapter arrayAdapter = new ArrayAdapter(K(), (int) R.layout.row_custom_goal_textview, new String[]{getString(R.string.customGoalAdditionFrequencyDaily), getString(R.string.customGoalAdditionFrequencyWeekly), getString(R.string.customGoalAdditionFrequencyOnetime)});
            arrayAdapter.setDropDownViewResource(R.layout.row_custom_goal_textview);
            ((AppCompatSpinner) _$_findCachedViewById(R.id.spinnerFrequency)).setAdapter((SpinnerAdapter) arrayAdapter);
            ((AppCompatSpinner) _$_findCachedViewById(R.id.spinnerFrequency)).setOnItemSelectedListener(new b());
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f5336u, e10);
        }
    }

    public final void P() {
        try {
            View childAt = ((LinearLayout) _$_findCachedViewById(R.id.optionsContainerLayout)).getChildAt(0);
            kotlin.jvm.internal.i.e(childAt, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
            RobertoTextView robertoTextView = (RobertoTextView) childAt;
            robertoTextView.setOnClickListener(new cm.c(this, 5));
            ((LinearLayout) _$_findCachedViewById(R.id.optionsContainerLayout)).removeViewAt(0);
            Iterator<String> it = K().f10298y.iterator();
            while (it.hasNext()) {
                String next = it.next();
                View inflate = getLayoutInflater().inflate(R.layout.row_custom_goals_option, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.optionsContainerLayout)), false);
                ((RobertoTextView) inflate.findViewById(R.id.optionTitle)).setText(next);
                inflate.setOnClickListener(new w0(this, 3, next));
                ((LinearLayout) _$_findCachedViewById(R.id.optionsContainerLayout)).addView(inflate);
            }
            ((LinearLayout) _$_findCachedViewById(R.id.optionsContainerLayout)).addView(robertoTextView);
            ((RobertoEditText) _$_findCachedViewById(R.id.editTextGoalName)).addTextChangedListener(new c());
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f5336u, e10);
        }
    }

    public final void Q() {
        Calendar calendar = this.f5341z;
        Calendar calendar2 = this.A;
        try {
            final TimePickerDialog timePickerDialog = new TimePickerDialog(K(), new TimePickerDialog.OnTimeSetListener(this) { // from class: cm.d

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ g f5329v;

                {
                    this.f5329v = this;
                }

                @Override // android.app.TimePickerDialog.OnTimeSetListener
                public final void onTimeSet(TimePicker timePicker, int i6, int i10) {
                    int i11 = r2;
                    g this$0 = this.f5329v;
                    switch (i11) {
                        case 0:
                            int i12 = g.E;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Calendar calendar3 = Calendar.getInstance();
                            long j10 = 1000;
                            calendar3.setTimeInMillis(Utils.INSTANCE.getTodayTimeInSeconds() * j10);
                            calendar3.add(11, i6);
                            calendar3.add(12, i10);
                            ((RobertoButton) this$0._$_findCachedViewById(R.id.dailyTimePicker)).setText(LocalDateTime.ofEpochSecond(calendar3.getTimeInMillis() / j10, 0, this$0.f5337v).format(DateTimeFormatter.ofPattern("hh:mm a").withLocale(Locale.ENGLISH)));
                            this$0.f5340y = calendar3;
                            return;
                        case 1:
                            int i13 = g.E;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Calendar calendar4 = this$0.f5341z;
                            calendar4.set(11, i6);
                            calendar4.set(12, i10);
                            ((RobertoButton) this$0._$_findCachedViewById(R.id.weeklyTimePicker)).setText(LocalDateTime.ofEpochSecond(calendar4.getTimeInMillis() / 1000, 0, this$0.f5337v).format(DateTimeFormatter.ofPattern("hh:mm a").withLocale(Locale.ENGLISH)));
                            return;
                        default:
                            int i14 = g.E;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Calendar calendar5 = this$0.A;
                            calendar5.set(11, i6);
                            calendar5.set(12, i10);
                            ((RobertoButton) this$0._$_findCachedViewById(R.id.onetimeTimePicker)).setText(LocalDateTime.ofEpochSecond(calendar5.getTimeInMillis() / 1000, 0, this$0.f5337v).format(DateTimeFormatter.ofPattern("hh:mm a").withLocale(Locale.ENGLISH)));
                            return;
                    }
                }
            }, this.f5340y.get(11), this.f5340y.get(12), false);
            timePickerDialog.setTitle("Pick time");
            ((RobertoButton) _$_findCachedViewById(R.id.dailyTimePicker)).setOnClickListener(new View.OnClickListener() { // from class: cm.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i6 = r2;
                    TimePickerDialog oneTimeGoalTimePicker = timePickerDialog;
                    switch (i6) {
                        case 0:
                            int i10 = g.E;
                            kotlin.jvm.internal.i.g(oneTimeGoalTimePicker, "$dailyGoalTimePicker");
                            oneTimeGoalTimePicker.show();
                            return;
                        case 1:
                            int i11 = g.E;
                            kotlin.jvm.internal.i.g(oneTimeGoalTimePicker, "$weeklyGoalTimePicker");
                            oneTimeGoalTimePicker.show();
                            return;
                        default:
                            int i12 = g.E;
                            kotlin.jvm.internal.i.g(oneTimeGoalTimePicker, "$oneTimeGoalTimePicker");
                            oneTimeGoalTimePicker.show();
                            return;
                    }
                }
            });
            ArrayAdapter arrayAdapter = new ArrayAdapter(K(), (int) R.layout.row_custom_goal_textview, new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"});
            arrayAdapter.setDropDownViewResource(R.layout.row_custom_goal_textview);
            ((AppCompatSpinner) _$_findCachedViewById(R.id.weeklySpinnerDay)).setAdapter((SpinnerAdapter) arrayAdapter);
            ((AppCompatSpinner) _$_findCachedViewById(R.id.weeklySpinnerDay)).setOnItemSelectedListener(new d());
            final TimePickerDialog timePickerDialog2 = new TimePickerDialog(K(), new TimePickerDialog.OnTimeSetListener(this) { // from class: cm.d

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ g f5329v;

                {
                    this.f5329v = this;
                }

                @Override // android.app.TimePickerDialog.OnTimeSetListener
                public final void onTimeSet(TimePicker timePicker, int i6, int i10) {
                    int i11 = r2;
                    g this$0 = this.f5329v;
                    switch (i11) {
                        case 0:
                            int i12 = g.E;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Calendar calendar3 = Calendar.getInstance();
                            long j10 = 1000;
                            calendar3.setTimeInMillis(Utils.INSTANCE.getTodayTimeInSeconds() * j10);
                            calendar3.add(11, i6);
                            calendar3.add(12, i10);
                            ((RobertoButton) this$0._$_findCachedViewById(R.id.dailyTimePicker)).setText(LocalDateTime.ofEpochSecond(calendar3.getTimeInMillis() / j10, 0, this$0.f5337v).format(DateTimeFormatter.ofPattern("hh:mm a").withLocale(Locale.ENGLISH)));
                            this$0.f5340y = calendar3;
                            return;
                        case 1:
                            int i13 = g.E;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Calendar calendar4 = this$0.f5341z;
                            calendar4.set(11, i6);
                            calendar4.set(12, i10);
                            ((RobertoButton) this$0._$_findCachedViewById(R.id.weeklyTimePicker)).setText(LocalDateTime.ofEpochSecond(calendar4.getTimeInMillis() / 1000, 0, this$0.f5337v).format(DateTimeFormatter.ofPattern("hh:mm a").withLocale(Locale.ENGLISH)));
                            return;
                        default:
                            int i14 = g.E;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Calendar calendar5 = this$0.A;
                            calendar5.set(11, i6);
                            calendar5.set(12, i10);
                            ((RobertoButton) this$0._$_findCachedViewById(R.id.onetimeTimePicker)).setText(LocalDateTime.ofEpochSecond(calendar5.getTimeInMillis() / 1000, 0, this$0.f5337v).format(DateTimeFormatter.ofPattern("hh:mm a").withLocale(Locale.ENGLISH)));
                            return;
                    }
                }
            }, calendar.get(11), calendar.get(12), false);
            timePickerDialog2.setTitle("Pick time");
            ((RobertoButton) _$_findCachedViewById(R.id.weeklyTimePicker)).setOnClickListener(new View.OnClickListener() { // from class: cm.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i6 = r2;
                    TimePickerDialog oneTimeGoalTimePicker = timePickerDialog2;
                    switch (i6) {
                        case 0:
                            int i10 = g.E;
                            kotlin.jvm.internal.i.g(oneTimeGoalTimePicker, "$dailyGoalTimePicker");
                            oneTimeGoalTimePicker.show();
                            return;
                        case 1:
                            int i11 = g.E;
                            kotlin.jvm.internal.i.g(oneTimeGoalTimePicker, "$weeklyGoalTimePicker");
                            oneTimeGoalTimePicker.show();
                            return;
                        default:
                            int i12 = g.E;
                            kotlin.jvm.internal.i.g(oneTimeGoalTimePicker, "$oneTimeGoalTimePicker");
                            oneTimeGoalTimePicker.show();
                            return;
                    }
                }
            });
            long j10 = 1000;
            ((RobertoButton) _$_findCachedViewById(R.id.onetimeDatePicker)).setText(LocalDateTime.ofEpochSecond(calendar2.getTimeInMillis() / j10, 0, this.f5337v).format(DateTimeFormatter.ofPattern("dd.MM.yyyy").withLocale(Locale.ENGLISH)));
            DatePickerDialog datePickerDialog = new DatePickerDialog(K(), new f(this, 0), calendar2.get(1), calendar2.get(2), calendar2.get(5));
            datePickerDialog.getDatePicker().setMinDate(Utils.INSTANCE.getTodayTimeInSeconds() * j10);
            ((RobertoButton) _$_findCachedViewById(R.id.onetimeDatePicker)).setOnClickListener(new pl.d(datePickerDialog, 4));
            final TimePickerDialog timePickerDialog3 = new TimePickerDialog(K(), new TimePickerDialog.OnTimeSetListener(this) { // from class: cm.d

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ g f5329v;

                {
                    this.f5329v = this;
                }

                @Override // android.app.TimePickerDialog.OnTimeSetListener
                public final void onTimeSet(TimePicker timePicker, int i6, int i10) {
                    int i11 = r2;
                    g this$0 = this.f5329v;
                    switch (i11) {
                        case 0:
                            int i12 = g.E;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Calendar calendar3 = Calendar.getInstance();
                            long j102 = 1000;
                            calendar3.setTimeInMillis(Utils.INSTANCE.getTodayTimeInSeconds() * j102);
                            calendar3.add(11, i6);
                            calendar3.add(12, i10);
                            ((RobertoButton) this$0._$_findCachedViewById(R.id.dailyTimePicker)).setText(LocalDateTime.ofEpochSecond(calendar3.getTimeInMillis() / j102, 0, this$0.f5337v).format(DateTimeFormatter.ofPattern("hh:mm a").withLocale(Locale.ENGLISH)));
                            this$0.f5340y = calendar3;
                            return;
                        case 1:
                            int i13 = g.E;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Calendar calendar4 = this$0.f5341z;
                            calendar4.set(11, i6);
                            calendar4.set(12, i10);
                            ((RobertoButton) this$0._$_findCachedViewById(R.id.weeklyTimePicker)).setText(LocalDateTime.ofEpochSecond(calendar4.getTimeInMillis() / 1000, 0, this$0.f5337v).format(DateTimeFormatter.ofPattern("hh:mm a").withLocale(Locale.ENGLISH)));
                            return;
                        default:
                            int i14 = g.E;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Calendar calendar5 = this$0.A;
                            calendar5.set(11, i6);
                            calendar5.set(12, i10);
                            ((RobertoButton) this$0._$_findCachedViewById(R.id.onetimeTimePicker)).setText(LocalDateTime.ofEpochSecond(calendar5.getTimeInMillis() / 1000, 0, this$0.f5337v).format(DateTimeFormatter.ofPattern("hh:mm a").withLocale(Locale.ENGLISH)));
                            return;
                    }
                }
            }, calendar2.get(11), calendar2.get(12), false);
            timePickerDialog3.setTitle("Pick time");
            ((RobertoButton) _$_findCachedViewById(R.id.onetimeTimePicker)).setOnClickListener(new View.OnClickListener() { // from class: cm.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i6 = r2;
                    TimePickerDialog oneTimeGoalTimePicker = timePickerDialog3;
                    switch (i6) {
                        case 0:
                            int i10 = g.E;
                            kotlin.jvm.internal.i.g(oneTimeGoalTimePicker, "$dailyGoalTimePicker");
                            oneTimeGoalTimePicker.show();
                            return;
                        case 1:
                            int i11 = g.E;
                            kotlin.jvm.internal.i.g(oneTimeGoalTimePicker, "$weeklyGoalTimePicker");
                            oneTimeGoalTimePicker.show();
                            return;
                        default:
                            int i12 = g.E;
                            kotlin.jvm.internal.i.g(oneTimeGoalTimePicker, "$oneTimeGoalTimePicker");
                            oneTimeGoalTimePicker.show();
                            return;
                    }
                }
            });
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f5336u, e10);
        }
    }

    public final void S() {
        androidx.fragment.app.p requireActivity = requireActivity();
        kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
        fm.a aVar = (fm.a) new o0(requireActivity).a(fm.a.class);
        ((androidx.lifecycle.w) aVar.S.getValue()).e(getViewLifecycleOwner(), new tl.m(15, new e()));
        this.B = aVar;
    }

    public final void U(boolean z10) {
        int i6;
        int i10;
        try {
            RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.frequency);
            int i11 = 0;
            if (z10) {
                i6 = 0;
            } else {
                i6 = 8;
            }
            robertoTextView.setVisibility(i6);
            AppCompatSpinner appCompatSpinner = (AppCompatSpinner) _$_findCachedViewById(R.id.spinnerFrequency);
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            appCompatSpinner.setVisibility(i10);
            AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.spinnerFrequencyArrow);
            if (!z10) {
                i11 = 8;
            }
            appCompatImageView.setVisibility(i11);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f5336u, e10);
        }
    }

    public final void X(int i6) {
        String string;
        try {
            if (i6 == -1) {
                ((RobertoTextView) _$_findCachedViewById(R.id.time)).setVisibility(8);
                ((RobertoButton) _$_findCachedViewById(R.id.dailyTimePicker)).setVisibility(8);
                ((AppCompatSpinner) _$_findCachedViewById(R.id.weeklySpinnerDay)).setVisibility(8);
                ((AppCompatImageView) _$_findCachedViewById(R.id.weeklySpinnerDayArrow)).setVisibility(8);
                ((RobertoButton) _$_findCachedViewById(R.id.weeklyTimePicker)).setVisibility(8);
                ((RobertoButton) _$_findCachedViewById(R.id.onetimeDatePicker)).setVisibility(8);
                ((RobertoButton) _$_findCachedViewById(R.id.onetimeTimePicker)).setVisibility(8);
                ((RobertoTextView) _$_findCachedViewById(R.id.notificationTogglePrompt)).setVisibility(8);
                ((SwitchCompat) _$_findCachedViewById(R.id.notificationToggle)).setVisibility(8);
                ((RobertoButton) _$_findCachedViewById(R.id.btnAddGoal)).setVisibility(8);
                return;
            }
            ((RobertoTextView) _$_findCachedViewById(R.id.time)).setVisibility(0);
            RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.time);
            if (i6 != 0) {
                if (i6 != 1) {
                    ((RobertoButton) _$_findCachedViewById(R.id.dailyTimePicker)).setVisibility(8);
                    ((AppCompatSpinner) _$_findCachedViewById(R.id.weeklySpinnerDay)).setVisibility(8);
                    ((AppCompatImageView) _$_findCachedViewById(R.id.weeklySpinnerDayArrow)).setVisibility(8);
                    ((RobertoButton) _$_findCachedViewById(R.id.weeklyTimePicker)).setVisibility(8);
                    ((RobertoButton) _$_findCachedViewById(R.id.onetimeDatePicker)).setVisibility(0);
                    ((RobertoButton) _$_findCachedViewById(R.id.onetimeTimePicker)).setVisibility(0);
                    string = getString(R.string.customGoalAdditionFrequencyOnetimeTime);
                } else {
                    ((RobertoButton) _$_findCachedViewById(R.id.dailyTimePicker)).setVisibility(8);
                    ((AppCompatSpinner) _$_findCachedViewById(R.id.weeklySpinnerDay)).setVisibility(0);
                    ((AppCompatImageView) _$_findCachedViewById(R.id.weeklySpinnerDayArrow)).setVisibility(0);
                    ((RobertoButton) _$_findCachedViewById(R.id.weeklyTimePicker)).setVisibility(0);
                    ((RobertoButton) _$_findCachedViewById(R.id.onetimeDatePicker)).setVisibility(8);
                    ((RobertoButton) _$_findCachedViewById(R.id.onetimeTimePicker)).setVisibility(8);
                    string = getString(R.string.customGoalAdditionFrequencyWeeklyTime);
                }
            } else {
                ((RobertoButton) _$_findCachedViewById(R.id.dailyTimePicker)).setVisibility(0);
                ((AppCompatSpinner) _$_findCachedViewById(R.id.weeklySpinnerDay)).setVisibility(8);
                ((AppCompatImageView) _$_findCachedViewById(R.id.weeklySpinnerDayArrow)).setVisibility(8);
                ((RobertoButton) _$_findCachedViewById(R.id.weeklyTimePicker)).setVisibility(8);
                ((RobertoButton) _$_findCachedViewById(R.id.onetimeDatePicker)).setVisibility(8);
                ((RobertoButton) _$_findCachedViewById(R.id.onetimeTimePicker)).setVisibility(8);
                string = getString(R.string.customGoalAdditionFrequencyDailyTime);
            }
            robertoTextView.setText(string);
            ((SwitchCompat) _$_findCachedViewById(R.id.notificationToggle)).setVisibility(0);
            ((RobertoButton) _$_findCachedViewById(R.id.btnAddGoal)).setVisibility(0);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f5336u, e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0165 A[Catch: Exception -> 0x01d1, TryCatch #0 {Exception -> 0x01d1, blocks: (B:4:0x0021, B:5:0x012d, B:7:0x0159, B:13:0x0165, B:19:0x01b6, B:14:0x0178, B:16:0x0192, B:18:0x0198), top: B:24:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0178 A[Catch: Exception -> 0x01d1, TryCatch #0 {Exception -> 0x01d1, blocks: (B:4:0x0021, B:5:0x012d, B:7:0x0159, B:13:0x0165, B:19:0x01b6, B:14:0x0178, B:16:0x0192, B:18:0x0198), top: B:24:0x001f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y(boolean z10) {
        boolean z11;
        int i6;
        try {
            if (z10) {
                this.f5338w = true;
                _$_findCachedViewById(R.id.blanketView).setVisibility(8);
                ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setVisibility(8);
                ((RobertoTextView) _$_findCachedViewById(R.id.goalName)).setVisibility(8);
                ((LinearLayout) _$_findCachedViewById(R.id.optionsContainerLayout)).setVisibility(0);
                ((RobertoTextView) _$_findCachedViewById(R.id.frequency)).setVisibility(8);
                ((AppCompatSpinner) _$_findCachedViewById(R.id.spinnerFrequency)).setVisibility(8);
                ((AppCompatImageView) _$_findCachedViewById(R.id.spinnerFrequencyArrow)).setVisibility(8);
                ((RobertoTextView) _$_findCachedViewById(R.id.time)).setVisibility(8);
                ((RobertoButton) _$_findCachedViewById(R.id.dailyTimePicker)).setVisibility(8);
                ((AppCompatSpinner) _$_findCachedViewById(R.id.weeklySpinnerDay)).setVisibility(8);
                ((AppCompatImageView) _$_findCachedViewById(R.id.weeklySpinnerDayArrow)).setVisibility(8);
                ((RobertoButton) _$_findCachedViewById(R.id.weeklyTimePicker)).setVisibility(8);
                ((RobertoButton) _$_findCachedViewById(R.id.onetimeDatePicker)).setVisibility(8);
                ((RobertoButton) _$_findCachedViewById(R.id.onetimeTimePicker)).setVisibility(8);
                ((SwitchCompat) _$_findCachedViewById(R.id.notificationToggle)).setVisibility(8);
                ((RobertoTextView) _$_findCachedViewById(R.id.notificationTogglePrompt)).setVisibility(8);
                ((ConstraintLayout) _$_findCachedViewById(R.id.bottomSheet)).setVisibility(8);
                ((RobertoEditText) _$_findCachedViewById(R.id.editTextGoalName)).setFocusableInTouchMode(true);
                ((RobertoEditText) _$_findCachedViewById(R.id.editTextGoalName)).requestFocus();
                Object systemService = requireContext().getSystemService("input_method");
                kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                ((InputMethodManager) systemService).showSoftInput((RobertoEditText) _$_findCachedViewById(R.id.editTextGoalName), 1);
                ((RobertoEditText) _$_findCachedViewById(R.id.editTextGoalName)).setCursorVisible(true);
                new Handler().postDelayed(new tl.o(2, this), 25L);
                ((AppCompatImageView) _$_findCachedViewById(R.id.btnBack)).setOnClickListener(new cm.c(this, 0));
                return;
            }
            this.f5338w = false;
            _$_findCachedViewById(R.id.blanketView).setVisibility(0);
            ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setVisibility(0);
            ((RobertoTextView) _$_findCachedViewById(R.id.goalName)).setVisibility(0);
            ((LinearLayout) _$_findCachedViewById(R.id.optionsContainerLayout)).setVisibility(8);
            String str = K().F;
            if (str != null && !gv.n.B0(str)) {
                z11 = false;
                if (!z11) {
                    ((RobertoEditText) _$_findCachedViewById(R.id.editTextGoalName)).setText("");
                    U(false);
                    X(-1);
                } else {
                    ((RobertoEditText) _$_findCachedViewById(R.id.editTextGoalName)).setText(K().F);
                    U(true);
                    Integer num = K().G;
                    if (num != null) {
                        i6 = num.intValue();
                    } else {
                        i6 = 0;
                    }
                    X(i6);
                    ((SwitchCompat) _$_findCachedViewById(R.id.notificationToggle)).setVisibility(0);
                    ((RobertoTextView) _$_findCachedViewById(R.id.notificationTogglePrompt)).setVisibility(0);
                    ((ConstraintLayout) _$_findCachedViewById(R.id.bottomSheet)).setVisibility(0);
                }
                ((RobertoEditText) _$_findCachedViewById(R.id.editTextGoalName)).clearFocus();
                M();
                ((AppCompatImageView) _$_findCachedViewById(R.id.btnBack)).setOnClickListener(new cm.c(this, 1));
            }
            z11 = true;
            if (!z11) {
            }
            ((RobertoEditText) _$_findCachedViewById(R.id.editTextGoalName)).clearFocus();
            M();
            ((AppCompatImageView) _$_findCachedViewById(R.id.btnBack)).setOnClickListener(new cm.c(this, 1));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f5336u, e10);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.D;
        View view = (View) linkedHashMap.get(Integer.valueOf(i6));
        if (view == null) {
            View view2 = getView();
            if (view2 != null && (findViewById = view2.findViewById(i6)) != null) {
                linkedHashMap.put(Integer.valueOf(i6), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_add_custom_goal, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.D.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007b A[Catch: Exception -> 0x00ae, TryCatch #0 {Exception -> 0x00ae, blocks: (B:3:0x0008, B:5:0x001d, B:6:0x0020, B:8:0x003e, B:9:0x0046, B:11:0x006f, B:17:0x007b, B:22:0x00a4, B:18:0x0083, B:20:0x009d, B:21:0x00a1), top: B:28:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083 A[Catch: Exception -> 0x00ae, TryCatch #0 {Exception -> 0x00ae, blocks: (B:3:0x0008, B:5:0x001d, B:6:0x0020, B:8:0x003e, B:9:0x0046, B:11:0x006f, B:17:0x007b, B:22:0x00a4, B:18:0x0083, B:20:0x009d, B:21:0x00a1), top: B:28:0x0008 }] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        int i6;
        boolean z10;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p requireActivity = requireActivity();
            kotlin.jvm.internal.i.e(requireActivity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.AddCustomGoalsActivity");
            this.f5339x = (AddCustomGoalsActivity) requireActivity;
            if (K().D) {
                S();
            }
            this.C.getClass();
            ((SwitchCompat) _$_findCachedViewById(R.id.notificationToggle)).setChecked(yn.a.b());
            SwitchCompat switchCompat = (SwitchCompat) _$_findCachedViewById(R.id.notificationToggle);
            if (switchCompat != null) {
                switchCompat.setOnCheckedChangeListener(new ib.a(2, this));
            }
            K().setSharedResponse((RobertoEditText) _$_findCachedViewById(R.id.editTextGoalName));
            _$_findCachedViewById(R.id.blanketView).setOnClickListener(new cm.c(this, 2));
            str = K().F;
            i6 = 0;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f5336u, e10);
        }
        if (str != null && !gv.n.B0(str)) {
            z10 = false;
            if (!z10) {
                U(false);
                X(-1);
            } else {
                ((RobertoEditText) _$_findCachedViewById(R.id.editTextGoalName)).setText(K().F);
                U(true);
                Integer num = K().G;
                if (num != null) {
                    i6 = num.intValue();
                }
                X(i6);
            }
            O();
            Q();
            P();
            ((AppCompatImageView) _$_findCachedViewById(R.id.btnBack)).setOnClickListener(new cm.c(this, 3));
            ((RobertoButton) _$_findCachedViewById(R.id.btnAddGoal)).setOnClickListener(new cm.c(this, 4));
        }
        z10 = true;
        if (!z10) {
        }
        O();
        Q();
        P();
        ((AppCompatImageView) _$_findCachedViewById(R.id.btnBack)).setOnClickListener(new cm.c(this, 3));
        ((RobertoButton) _$_findCachedViewById(R.id.btnAddGoal)).setOnClickListener(new cm.c(this, 4));
    }

    /* compiled from: AddCustomGoalFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b implements AdapterView.OnItemSelectedListener {
        public b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView<?> adapterView, View view, int i6, long j10) {
            g gVar = g.this;
            gVar.K().G = Integer.valueOf(i6);
            gVar.X(i6);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* compiled from: AddCustomGoalFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c implements TextWatcher {
        public c() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
            int i12;
            g gVar = g.this;
            int childCount = ((LinearLayout) gVar._$_findCachedViewById(R.id.optionsContainerLayout)).getChildCount() - 1;
            for (int i13 = 0; i13 < childCount; i13++) {
                RobertoTextView robertoTextView = (RobertoTextView) ((LinearLayout) gVar._$_findCachedViewById(R.id.optionsContainerLayout)).getChildAt(i13).findViewById(R.id.optionTitle);
                String lowerCase = robertoTextView.getText().toString().toLowerCase();
                kotlin.jvm.internal.i.f(lowerCase, "this as java.lang.String).toLowerCase()");
                String lowerCase2 = String.valueOf(charSequence).toLowerCase();
                kotlin.jvm.internal.i.f(lowerCase2, "this as java.lang.String).toLowerCase()");
                if (gv.r.J0(lowerCase, lowerCase2)) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                robertoTextView.setVisibility(i12);
            }
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
        }
    }

    /* compiled from: AddCustomGoalFragment.kt */
    /* loaded from: classes2.dex */
    public static final class d implements AdapterView.OnItemSelectedListener {
        public d() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView<?> adapterView, View view, int i6, long j10) {
            int i10;
            Calendar calendar = g.this.f5341z;
            if (i6 < 6) {
                i10 = i6 + 2;
            } else {
                i10 = i6 - 5;
            }
            calendar.set(7, i10);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView<?> adapterView) {
        }
    }
}
