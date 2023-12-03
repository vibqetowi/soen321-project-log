package pl;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.widget.TimePicker;
import androidx.fragment.app.Fragment;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dynamicActivities.fragments.N12CScreenFragment;
import com.theinnerhour.b2b.components.dynamicActivities.fragments.N4ScreenFragment;
import com.theinnerhour.b2b.components.dynamicActivities.fragments.N5ScreenFragment;
import com.theinnerhour.b2b.components.dynamicActivities.fragments.N6AScreenFragment;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import hr.g7;
import hr.q7;
import hr.s7;
import hr.z7;
import j$.time.LocalDateTime;
import j$.time.format.DateTimeFormatter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements TimePickerDialog.OnTimeSetListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f28547u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Fragment f28548v;

    public /* synthetic */ b(Fragment fragment, int i6) {
        this.f28547u = i6;
        this.f28548v = fragment;
    }

    @Override // android.app.TimePickerDialog.OnTimeSetListener
    public final void onTimeSet(TimePicker timePicker, int i6, int i10) {
        String str;
        String str2;
        int i11 = this.f28547u;
        Fragment fragment = this.f28548v;
        switch (i11) {
            case 0:
                N12CScreenFragment this$0 = (N12CScreenFragment) fragment;
                int i12 = N12CScreenFragment.L;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.H.set(11, i6);
                this$0.H.set(12, i10);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this$0.H.get(5));
                gd.d dVar = this$0.P().f29790z;
                int i13 = this$0.H.get(5);
                dVar.getClass();
                sb2.append(gd.d.b(i13));
                sb2.append(' ');
                sb2.append(this$0.P().f29790z.d(this$0.H.getTimeInMillis(), "MMM, hh:mm a"));
                ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN12CScreenDate)).setText(sb2.toString());
                return;
            case 1:
                N4ScreenFragment this$02 = (N4ScreenFragment) fragment;
                int i14 = N4ScreenFragment.I;
                kotlin.jvm.internal.i.g(this$02, "this$0");
                this$02.F.set(11, i6);
                this$02.F.set(12, i10);
                this$02.A = this$02.F.get(5) + this$02.P(this$02.F.get(5)) + ' ' + LocalDateTime.ofEpochSecond(this$02.F.getTimeInMillis() / 1000, 0, this$02.G).format(DateTimeFormatter.ofPattern("MMM, hh:mm a").withLocale(Locale.ENGLISH));
                ((RobertoTextView) this$02._$_findCachedViewById(R.id.tvN4ScreenDate)).setText(this$02.A);
                return;
            case 2:
                N5ScreenFragment this$03 = (N5ScreenFragment) fragment;
                int i15 = N5ScreenFragment.I;
                kotlin.jvm.internal.i.g(this$03, "this$0");
                this$03.F.set(11, i6);
                this$03.F.set(12, i10);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this$03.F.get(5));
                int i16 = this$03.F.get(5);
                if (!is.k.Q1(Integer.valueOf(i16), new Integer[]{11, 12, 13})) {
                    int i17 = i16 % 10;
                    if (i17 == 1) {
                        str = "st";
                    } else if (i17 == 2) {
                        str = "nd";
                    } else if (i17 == 3) {
                        str = "rd";
                    }
                    sb3.append(str);
                    sb3.append(' ');
                    sb3.append(LocalDateTime.ofEpochSecond(this$03.F.getTimeInMillis() / 1000, 0, this$03.G).format(DateTimeFormatter.ofPattern("MMM, hh:mm a").withLocale(Locale.ENGLISH)));
                    this$03.f11070y = sb3.toString();
                    ((RobertoTextView) this$03._$_findCachedViewById(R.id.tvN5ScreenDate)).setText(this$03.f11070y);
                    return;
                }
                str = "th";
                sb3.append(str);
                sb3.append(' ');
                sb3.append(LocalDateTime.ofEpochSecond(this$03.F.getTimeInMillis() / 1000, 0, this$03.G).format(DateTimeFormatter.ofPattern("MMM, hh:mm a").withLocale(Locale.ENGLISH)));
                this$03.f11070y = sb3.toString();
                ((RobertoTextView) this$03._$_findCachedViewById(R.id.tvN5ScreenDate)).setText(this$03.f11070y);
                return;
            case 3:
                N6AScreenFragment this$04 = (N6AScreenFragment) fragment;
                int i18 = N6AScreenFragment.M;
                kotlin.jvm.internal.i.g(this$04, "this$0");
                this$04.J.set(11, i6);
                this$04.J.set(12, i10);
                StringBuilder sb4 = new StringBuilder();
                sb4.append(this$04.J.get(5));
                int i19 = this$04.J.get(5);
                if (!is.k.Q1(Integer.valueOf(i19), new Integer[]{11, 12, 13})) {
                    int i20 = i19 % 10;
                    if (i20 == 1) {
                        str2 = "st";
                    } else if (i20 == 2) {
                        str2 = "nd";
                    } else if (i20 == 3) {
                        str2 = "rd";
                    }
                    sb4.append(str2);
                    sb4.append(' ');
                    sb4.append(LocalDateTime.ofEpochSecond(this$04.J.getTimeInMillis() / 1000, 0, this$04.K).format(DateTimeFormatter.ofPattern("MMM, hh:mm a").withLocale(Locale.ENGLISH)));
                    this$04.f11078z = sb4.toString();
                    ((RobertoTextView) this$04._$_findCachedViewById(R.id.tvN6AScreenDate)).setText(this$04.f11078z);
                    return;
                }
                str2 = "th";
                sb4.append(str2);
                sb4.append(' ');
                sb4.append(LocalDateTime.ofEpochSecond(this$04.J.getTimeInMillis() / 1000, 0, this$04.K).format(DateTimeFormatter.ofPattern("MMM, hh:mm a").withLocale(Locale.ENGLISH)));
                this$04.f11078z = sb4.toString();
                ((RobertoTextView) this$04._$_findCachedViewById(R.id.tvN6AScreenDate)).setText(this$04.f11078z);
                return;
            case 4:
                qm.j this$05 = (qm.j) fragment;
                int i21 = qm.j.L;
                kotlin.jvm.internal.i.g(this$05, "this$0");
                Calendar calendar = this$05.f29879z;
                calendar.set(11, i6);
                calendar.set(12, i10);
                this$05.B = calendar.get(5) + this$05.O().f(calendar.get(5)) + ' ' + LocalDateTime.ofEpochSecond(calendar.getTimeInMillis() / 1000, 0, this$05.A).format(DateTimeFormatter.ofPattern("MMM, hh:mm a").withLocale(Locale.ENGLISH));
                this$05.O().G = calendar.getTime().getTime();
                RobertoTextView robertoTextView = (RobertoTextView) this$05._$_findCachedViewById(R.id.tvJournalBasicDateText);
                if (robertoTextView == null) {
                    return;
                }
                robertoTextView.setText(this$05.B);
                return;
            case 5:
                rm.h this$06 = (rm.h) fragment;
                int i22 = rm.h.N;
                kotlin.jvm.internal.i.g(this$06, "this$0");
                Calendar calendar2 = this$06.B;
                calendar2.set(11, i6);
                calendar2.set(12, i10);
                this$06.D = calendar2.get(5) + this$06.O().f(calendar2.get(5)) + ' ' + LocalDateTime.ofEpochSecond(calendar2.getTimeInMillis() / 1000, 0, this$06.C).format(DateTimeFormatter.ofPattern("MMM, hh:mm a").withLocale(Locale.ENGLISH));
                this$06.O().G = calendar2.getTimeInMillis();
                RobertoTextView robertoTextView2 = (RobertoTextView) this$06._$_findCachedViewById(R.id.tvJournalQuestionDateText);
                if (robertoTextView2 == null) {
                    return;
                }
                robertoTextView2.setText(this$06.D);
                return;
            case 6:
                sm.l this$07 = (sm.l) fragment;
                int i23 = sm.l.E;
                kotlin.jvm.internal.i.g(this$07, "this$0");
                Calendar calendar3 = this$07.A;
                calendar3.set(11, i6);
                calendar3.set(12, i10);
                this$07.C = calendar3.get(5) + this$07.K().f(calendar3.get(5)) + ' ' + LocalDateTime.ofEpochSecond(calendar3.getTimeInMillis() / 1000, 0, this$07.B).format(DateTimeFormatter.ofPattern("MMM, hh:mm a").withLocale(Locale.ENGLISH));
                this$07.K().G = calendar3.getTimeInMillis();
                RobertoTextView robertoTextView3 = (RobertoTextView) this$07._$_findCachedViewById(R.id.tvJournalThoughtAcknowledgeDateText);
                if (robertoTextView3 == null) {
                    return;
                }
                robertoTextView3.setText(this$07.C);
                return;
            case 7:
                sm.s this$08 = (sm.s) fragment;
                int i24 = sm.s.K;
                kotlin.jvm.internal.i.g(this$08, "this$0");
                Calendar calendar4 = this$08.f31739z;
                calendar4.set(11, i6);
                calendar4.set(12, i10);
                this$08.B = calendar4.get(5) + this$08.O().f(calendar4.get(5)) + ' ' + LocalDateTime.ofEpochSecond(calendar4.getTimeInMillis() / 1000, 0, this$08.A).format(DateTimeFormatter.ofPattern("MMM, hh:mm a").withLocale(Locale.ENGLISH));
                this$08.O().G = calendar4.getTimeInMillis();
                RobertoTextView robertoTextView4 = (RobertoTextView) this$08._$_findCachedViewById(R.id.tvJournalThoughtDescriptionDateText);
                if (robertoTextView4 == null) {
                    return;
                }
                robertoTextView4.setText(this$08.B);
                return;
            case 8:
                sm.h0 this$09 = (sm.h0) fragment;
                int i25 = sm.h0.E;
                kotlin.jvm.internal.i.g(this$09, "this$0");
                Calendar calendar5 = this$09.A;
                calendar5.set(11, i6);
                calendar5.set(12, i10);
                this$09.C = calendar5.get(5) + this$09.K().f(calendar5.get(5)) + ' ' + LocalDateTime.ofEpochSecond(calendar5.getTimeInMillis() / 1000, 0, this$09.B).format(DateTimeFormatter.ofPattern("MMM, hh:mm a").withLocale(Locale.ENGLISH));
                this$09.K().G = calendar5.getTimeInMillis();
                RobertoTextView robertoTextView5 = (RobertoTextView) this$09._$_findCachedViewById(R.id.tvJournalThoughtThinkingDateText);
                if (robertoTextView5 == null) {
                    return;
                }
                robertoTextView5.setText(this$09.C);
                return;
            case 9:
                fq.q0 this$010 = (fq.q0) fragment;
                int i26 = fq.q0.K;
                kotlin.jvm.internal.i.g(this$010, "this$0");
                Calendar calendar6 = this$010.C;
                calendar6.set(11, i6);
                calendar6.set(12, i10);
                calendar6.set(13, 0);
                this$010.P();
                return;
            case 10:
                er.b bVar = (er.b) fragment;
                Calendar calendar7 = bVar.f14475x;
                calendar7.set(11, i6);
                calendar7.set(12, i10);
                try {
                    bVar.f14473v.setText(new SimpleDateFormat("hh:mm a").format(new SimpleDateFormat("H:mm").parse(i6 + ":" + i10)));
                    return;
                } catch (ParseException e10) {
                    LogHelper.INSTANCE.e(e10);
                    return;
                }
            case 11:
                g7 this$011 = (g7) fragment;
                int i27 = g7.J;
                kotlin.jvm.internal.i.g(this$011, "this$0");
                this$011.f18460y.set(11, i6);
                this$011.f18460y.set(12, i10);
                String format = this$011.f18457v.format(Long.valueOf(this$011.f18460y.getTimeInMillis()));
                kotlin.jvm.internal.i.f(format, "timeFormat.format(calendar.timeInMillis)");
                String format2 = this$011.f18459x.format(Long.valueOf(this$011.f18460y.getTimeInMillis()));
                kotlin.jvm.internal.i.f(format2, "dateFormat.format(calendar.timeInMillis)");
                this$011.K(format, format2);
                DatePickerDialog datePickerDialog = new DatePickerDialog(this$011.requireActivity(), new cm.f(this$011, 1), this$011.f18460y.get(1), this$011.f18460y.get(2), this$011.f18460y.get(5));
                datePickerDialog.getDatePicker().setMinDate(Utils.INSTANCE.getTodayCalendar().getTimeInMillis());
                datePickerDialog.setTitle("Select Date");
                datePickerDialog.show();
                return;
            case 12:
                q7 this$012 = (q7) fragment;
                int i28 = q7.H;
                kotlin.jvm.internal.i.g(this$012, "this$0");
                this$012.f19027x.set(11, i6);
                this$012.f19027x.set(12, i10);
                this$012.K();
                return;
            case 13:
                s7 this$013 = (s7) fragment;
                int i29 = s7.M;
                kotlin.jvm.internal.i.g(this$013, "this$0");
                Calendar calendar8 = this$013.C;
                calendar8.set(11, i6);
                calendar8.set(12, i10);
                calendar8.set(13, 0);
                this$013.P();
                return;
            default:
                z7 this$014 = (z7) fragment;
                int i30 = z7.K;
                kotlin.jvm.internal.i.g(this$014, "this$0");
                Calendar calendar9 = this$014.C;
                calendar9.set(11, i6);
                calendar9.set(12, i10);
                androidx.fragment.app.p activity = this$014.getActivity();
                kotlin.jvm.internal.i.d(activity);
                DatePickerDialog datePickerDialog2 = new DatePickerDialog(activity, new cm.f(this$014, 2), calendar9.get(1), calendar9.get(2), calendar9.get(5));
                datePickerDialog2.setTitle("Select Date");
                datePickerDialog2.show();
                return;
        }
    }
}
