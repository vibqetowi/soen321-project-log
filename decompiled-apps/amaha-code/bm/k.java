package bm;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.goals.activity.V2GoalsActivity;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import ik.l1;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
/* compiled from: V2GoalsListAdapter.kt */
/* loaded from: classes2.dex */
public final class k extends RecyclerView.e<a> {
    public Calendar A;
    public int B;
    public final Calendar C;
    public int D;
    public final ZoneOffset E;

    /* renamed from: x  reason: collision with root package name */
    public final long f4480x;

    /* renamed from: y  reason: collision with root package name */
    public final ss.p<Date, Integer, hs.k> f4481y;

    /* renamed from: z  reason: collision with root package name */
    public final LayoutInflater f4482z;

    /* compiled from: V2GoalsListAdapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {
        public a(View view) {
            super(view);
        }
    }

    public k(Activity activity, long j10, V2GoalsActivity.b bVar) {
        kotlin.jvm.internal.i.g(activity, "activity");
        this.f4480x = j10;
        this.f4481y = bVar;
        LayoutInflater layoutInflater = activity.getLayoutInflater();
        kotlin.jvm.internal.i.f(layoutInflater, "activity.layoutInflater");
        this.f4482z = layoutInflater;
        this.A = Utils.INSTANCE.getTodayCalendar();
        this.B = 7;
        Calendar calendar = Calendar.getInstance();
        this.C = calendar;
        this.D = -1;
        this.E = ZoneId.systemDefault().getRules().getOffset(Instant.now());
        calendar.setTimeInMillis(j10);
        calendar.clear(11);
        calendar.clear(9);
        calendar.clear(12);
        calendar.clear(10);
        calendar.clear(13);
        calendar.clear(14);
        v();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.B;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(this.C.getTimeInMillis());
        calendar.add(5, i6);
        View view = aVar.f2751a;
        String format = LocalDateTime.ofEpochSecond(calendar.getTimeInMillis() / 1000, 0, this.E).format(DateTimeFormatter.ofPattern("EEEE").withLocale(Locale.ENGLISH));
        kotlin.jvm.internal.i.f(format, "ofEpochSecond(temp.timeI…thLocale(Locale.ENGLISH))");
        String substring = format.substring(0, 3);
        kotlin.jvm.internal.i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        ((RobertoTextView) view.findViewById(R.id.tvRowGoalsListCalendarDay)).setText(substring);
        ((RobertoTextView) view.findViewById(R.id.tvRowGoalsListCalendarDate)).setText(String.valueOf(calendar.get(5)));
        if (calendar.getTimeInMillis() < this.A.getTimeInMillis()) {
            if (this.D != i6) {
                ((RobertoTextView) view.findViewById(R.id.tvRowGoalsListCalendarDay)).setTextColor(g0.a.b(view.getContext(), R.color.grey_1));
                ((RobertoTextView) view.findViewById(R.id.tvRowGoalsListCalendarDate)).setTextColor(g0.a.b(view.getContext(), R.color.grey_1));
                ((CardView) view.findViewById(R.id.cardRowGoalsList)).setCardBackgroundColor(g0.a.b(view.getContext(), R.color.white));
            } else {
                ((RobertoTextView) view.findViewById(R.id.tvRowGoalsListCalendarDay)).setTextColor(g0.a.b(view.getContext(), R.color.white));
                ((RobertoTextView) view.findViewById(R.id.tvRowGoalsListCalendarDate)).setTextColor(g0.a.b(view.getContext(), R.color.white));
                ((CardView) view.findViewById(R.id.cardRowGoalsList)).setCardBackgroundColor(g0.a.b(view.getContext(), R.color.orange_1));
            }
            view.setOnClickListener(new l1(this, i6, calendar, 12));
            return;
        }
        ((RobertoTextView) view.findViewById(R.id.tvRowGoalsListCalendarDay)).setTextColor(g0.a.b(view.getContext(), R.color.grey_2));
        ((RobertoTextView) view.findViewById(R.id.tvRowGoalsListCalendarDate)).setTextColor(g0.a.b(view.getContext(), R.color.grey_2));
        ((CardView) view.findViewById(R.id.cardRowGoalsList)).setCardBackgroundColor(g0.a.b(view.getContext(), R.color.white));
        view.setOnClickListener(null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        kotlin.jvm.internal.i.g(parent, "parent");
        View inflate = this.f4482z.inflate(R.layout.row_goals_list_calendar, (ViewGroup) parent, false);
        kotlin.jvm.internal.i.f(inflate, "inflater.inflate(R.layou…_calendar, parent, false)");
        return new a(inflate);
    }

    public final void v() {
        int convert;
        int i6;
        Utils utils = Utils.INSTANCE;
        Calendar todayCalendar = utils.getTodayCalendar();
        this.A = todayCalendar;
        todayCalendar.add(5, 1);
        Calendar todayCalendar2 = utils.getTodayCalendar();
        Calendar calendar = Calendar.getInstance();
        long j10 = this.f4480x;
        calendar.setTimeInMillis(j10);
        calendar.clear(11);
        calendar.clear(9);
        calendar.clear(12);
        calendar.clear(10);
        calendar.clear(13);
        calendar.clear(14);
        if (calendar.getTimeInMillis() == todayCalendar2.getTimeInMillis()) {
            convert = 0;
        } else {
            convert = (int) (TimeUnit.DAYS.convert(todayCalendar2.getTimeInMillis() - j10, TimeUnit.MILLISECONDS) + 1);
        }
        this.D = convert;
        todayCalendar2.set(5, todayCalendar2.getActualMaximum(5));
        long convert2 = TimeUnit.DAYS.convert(todayCalendar2.getTimeInMillis() - this.C.getTimeInMillis(), TimeUnit.MILLISECONDS) + 1;
        if (convert2 > 7) {
            i6 = (int) convert2;
        } else {
            i6 = 7;
        }
        this.B = i6;
    }
}
