package bm;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.GoalHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import dl.d0;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
/* compiled from: V3GoalsListAdapter.kt */
/* loaded from: classes2.dex */
public final class r extends RecyclerView.e<a> {
    public final LayoutInflater A;
    public final GoalHelper B;
    public final Calendar C;
    public final Calendar D;
    public final Calendar E;
    public final Calendar F;
    public int G;
    public int H;
    public final ZoneOffset I;

    /* renamed from: x  reason: collision with root package name */
    public final long f4525x;

    /* renamed from: y  reason: collision with root package name */
    public final Integer f4526y;

    /* renamed from: z  reason: collision with root package name */
    public final ss.q<Date, Integer, Boolean, hs.k> f4527z;

    /* compiled from: V3GoalsListAdapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final RobertoTextView[] f4528u;

        /* renamed from: v  reason: collision with root package name */
        public final RobertoTextView[] f4529v;

        /* renamed from: w  reason: collision with root package name */
        public final CardView[] f4530w;

        public a(View view) {
            super(view);
            this.f4528u = new RobertoTextView[]{(RobertoTextView) view.findViewById(R.id.tvRowGoalsListCalendarDate0), (RobertoTextView) view.findViewById(R.id.tvRowGoalsListCalendarDate1), (RobertoTextView) view.findViewById(R.id.tvRowGoalsListCalendarDate2), (RobertoTextView) view.findViewById(R.id.tvRowGoalsListCalendarDate3), (RobertoTextView) view.findViewById(R.id.tvRowGoalsListCalendarDate4), (RobertoTextView) view.findViewById(R.id.tvRowGoalsListCalendarDate5), (RobertoTextView) view.findViewById(R.id.tvRowGoalsListCalendarDate6)};
            this.f4529v = new RobertoTextView[]{(RobertoTextView) view.findViewById(R.id.tvRowGoalsListCalendarDay0), (RobertoTextView) view.findViewById(R.id.tvRowGoalsListCalendarDay1), (RobertoTextView) view.findViewById(R.id.tvRowGoalsListCalendarDay2), (RobertoTextView) view.findViewById(R.id.tvRowGoalsListCalendarDay3), (RobertoTextView) view.findViewById(R.id.tvRowGoalsListCalendarDay4), (RobertoTextView) view.findViewById(R.id.tvRowGoalsListCalendarDay5), (RobertoTextView) view.findViewById(R.id.tvRowGoalsListCalendarDay6)};
            this.f4530w = new CardView[]{(CardView) view.findViewById(R.id.cardRowGoalsList0), (CardView) view.findViewById(R.id.cardRowGoalsList1), (CardView) view.findViewById(R.id.cardRowGoalsList2), (CardView) view.findViewById(R.id.cardRowGoalsList3), (CardView) view.findViewById(R.id.cardRowGoalsList4), (CardView) view.findViewById(R.id.cardRowGoalsList5), (CardView) view.findViewById(R.id.cardRowGoalsList6)};
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r(Activity activity, long j10, Integer num, ss.q<? super Date, ? super Integer, ? super Boolean, hs.k> qVar) {
        kotlin.jvm.internal.i.g(activity, "activity");
        this.f4525x = j10;
        this.f4526y = num;
        this.f4527z = qVar;
        LayoutInflater layoutInflater = activity.getLayoutInflater();
        kotlin.jvm.internal.i.f(layoutInflater, "activity.layoutInflater");
        this.A = layoutInflater;
        this.B = new GoalHelper();
        this.C = Calendar.getInstance();
        this.D = Calendar.getInstance();
        this.E = Calendar.getInstance();
        this.F = Calendar.getInstance();
        this.H = 1;
        this.I = ZoneId.systemDefault().getRules().getOffset(Instant.now());
        v();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.H;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        int i10;
        int i11;
        a aVar2 = aVar;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(this.C.getTimeInMillis());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.add(5, i6 * 7);
        ArrayList<Calendar> weekOf = this.B.getWeekOf(calendar.getTimeInMillis());
        for (int i12 = 0; i12 < 7; i12++) {
            RobertoTextView[] robertoTextViewArr = aVar2.f4528u;
            RobertoTextView robertoTextView = robertoTextViewArr[i12];
            long j10 = 1000;
            ZoneOffset zoneOffset = this.I;
            LocalDateTime ofEpochSecond = LocalDateTime.ofEpochSecond(weekOf.get(i12).getTimeInMillis() / j10, 0, zoneOffset);
            DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("dd");
            Locale locale = Locale.ENGLISH;
            robertoTextView.setText(ofEpochSecond.format(ofPattern.withLocale(locale)));
            RobertoTextView[] robertoTextViewArr2 = aVar2.f4529v;
            RobertoTextView robertoTextView2 = robertoTextViewArr2[i12];
            String format = LocalDateTime.ofEpochSecond(weekOf.get(i12).getTimeInMillis() / j10, 0, zoneOffset).format(DateTimeFormatter.ofPattern("EEEE").withLocale(locale));
            kotlin.jvm.internal.i.f(format, "ofEpochSecond(thisWeek[i…thLocale(Locale.ENGLISH))");
            String substring = format.substring(0, 3);
            kotlin.jvm.internal.i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            robertoTextView2.setText(substring);
            CardView[] cardViewArr = aVar2.f4530w;
            CardView cardView = cardViewArr[i12];
            View view = aVar2.f2751a;
            Context context = view.getContext();
            if (i12 == this.G) {
                Integer num = this.f4526y;
                if (num != null) {
                    i10 = num.intValue();
                } else {
                    i10 = R.color.orange;
                }
            } else {
                i10 = R.color.white;
            }
            cardView.setBackgroundColor(g0.a.b(context, i10));
            RobertoTextView robertoTextView3 = robertoTextViewArr[i12];
            Context context2 = view.getContext();
            int i13 = this.G;
            int i14 = R.color.grey_1;
            if (i12 == i13) {
                i11 = R.color.white;
            } else {
                i11 = R.color.grey_1;
            }
            robertoTextView3.setTextColor(g0.a.b(context2, i11));
            RobertoTextView robertoTextView4 = robertoTextViewArr2[i12];
            Context context3 = view.getContext();
            if (i12 == this.G) {
                i14 = R.color.white;
            }
            robertoTextView4.setTextColor(g0.a.b(context3, i14));
            if (i6 == this.H - 1) {
                if (this.E.compareTo(weekOf.get(i12)) < 0) {
                    cardViewArr[i12].setBackgroundColor(g0.a.b(view.getContext(), R.color.white));
                    robertoTextViewArr[i12].setTextColor(g0.a.b(view.getContext(), R.color.grey_2));
                    robertoTextViewArr2[i12].setTextColor(g0.a.b(view.getContext(), R.color.grey_2));
                    cardViewArr[i12].setOnClickListener(new il.g(6));
                }
            }
            cardViewArr[i12].setOnClickListener(new d0(this, i12, i6, 2));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        kotlin.jvm.internal.i.g(parent, "parent");
        View inflate = this.A.inflate(R.layout.row_goals_list_calendar_v3, (ViewGroup) parent, false);
        kotlin.jvm.internal.i.f(inflate, "inflater.inflate(R.layou…lendar_v3, parent, false)");
        return new a(inflate);
    }

    public final void v() {
        int ceil;
        long j10 = this.f4525x;
        Calendar calendar = this.C;
        calendar.setTimeInMillis(j10);
        long timeInMillis = calendar.getTimeInMillis();
        GoalHelper goalHelper = this.B;
        int i6 = 0;
        Date time = goalHelper.getWeekOf(timeInMillis).get(0).getTime();
        Calendar calendar2 = this.D;
        calendar2.setTime(time);
        calendar2.set(11, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar3 = this.E;
        calendar3.setTimeInMillis(currentTimeMillis);
        Date time2 = goalHelper.getWeekOf(calendar3.getTimeInMillis()).get(0).getTime();
        Calendar calendar4 = this.F;
        calendar4.setTime(time2);
        calendar4.set(11, 0);
        calendar4.set(12, 0);
        calendar4.set(13, 0);
        calendar4.set(14, 0);
        long timeInMillis2 = (calendar4.getTimeInMillis() - calendar2.getTimeInMillis()) / 86400000;
        if (timeInMillis2 < 7) {
            ceil = 1;
        } else {
            ceil = ((int) Math.ceil(timeInMillis2 / 7)) + 1;
        }
        this.H = ceil;
        String format = LocalDateTime.ofEpochSecond(calendar3.getTimeInMillis() / 1000, 0, this.I).format(DateTimeFormatter.ofPattern("EEEE").withLocale(Locale.ENGLISH));
        kotlin.jvm.internal.i.f(format, "ofEpochSecond(todayCal.t…thLocale(Locale.ENGLISH))");
        String substring = format.substring(0, 3);
        kotlin.jvm.internal.i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        switch (substring.hashCode()) {
            case 70909:
                if (substring.equals("Fri")) {
                    i6 = 4;
                    break;
                }
                break;
            case 77548:
                substring.equals("Mon");
                break;
            case 82886:
                if (substring.equals("Sat")) {
                    i6 = 5;
                    break;
                }
                break;
            case 83500:
                if (substring.equals("Sun")) {
                    i6 = 6;
                    break;
                }
                break;
            case 84065:
                if (substring.equals("Thu")) {
                    i6 = 3;
                    break;
                }
                break;
            case 84452:
                if (substring.equals("Tue")) {
                    i6 = 1;
                    break;
                }
                break;
            case 86838:
                if (substring.equals("Wed")) {
                    i6 = 2;
                    break;
                }
                break;
        }
        this.G = i6;
    }

    public final void w(int i6, boolean z10) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(this.C.getTimeInMillis());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.add(5, i6 * 7);
        Date time = this.B.getWeekOf(calendar.getTimeInMillis()).get(this.G).getTime();
        kotlin.jvm.internal.i.f(time, "thisWeek[selectedDate].time");
        this.f4527z.invoke(time, Integer.valueOf(i6), Boolean.valueOf(z10));
    }

    public final void x(int i6) {
        if (i6 == this.H - 1) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(this.C.getTimeInMillis());
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.add(5, i6 * 7);
            Iterator<Calendar> it = this.B.getWeekOf(calendar.getTimeInMillis()).iterator();
            int i10 = -1;
            while (it.hasNext()) {
                if (this.E.compareTo(it.next()) > 0) {
                    i10++;
                }
            }
            if (i10 != -1) {
                this.G = i10;
            }
            int i11 = this.H;
            for (int i12 = 0; i12 < i11; i12++) {
                j(i12);
            }
        }
        w(i6, true);
    }
}
