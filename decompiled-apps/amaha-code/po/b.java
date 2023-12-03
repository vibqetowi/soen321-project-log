package po;

import android.app.Activity;
import android.content.Context;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.pro.goal.activity.ProGoalsActivity;
import com.theinnerhour.b2b.utils.GoalHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import dl.d0;
import hs.k;
import il.g;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import kotlin.jvm.internal.i;
import ss.l;
import ss.p;
/* compiled from: V3GoalsListAdapterPro.kt */
/* loaded from: classes2.dex */
public final class b extends RecyclerView.e<a> {
    public final LayoutInflater A;
    public final GoalHelper B;
    public final Calendar C;
    public final Calendar D;
    public int E;
    public int F;
    public int G;

    /* renamed from: x  reason: collision with root package name */
    public final Integer f28733x;

    /* renamed from: y  reason: collision with root package name */
    public final p<Date, Integer, k> f28734y;

    /* renamed from: z  reason: collision with root package name */
    public final l<Integer, k> f28735z;

    /* compiled from: V3GoalsListAdapterPro.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final RobertoTextView[] f28736u;

        /* renamed from: v  reason: collision with root package name */
        public final RobertoTextView[] f28737v;

        /* renamed from: w  reason: collision with root package name */
        public final CardView[] f28738w;

        public a(View view) {
            super(view);
            this.f28736u = new RobertoTextView[]{(RobertoTextView) view.findViewById(R.id.tvRowGoalsListCalendarDate0), (RobertoTextView) view.findViewById(R.id.tvRowGoalsListCalendarDate1), (RobertoTextView) view.findViewById(R.id.tvRowGoalsListCalendarDate2), (RobertoTextView) view.findViewById(R.id.tvRowGoalsListCalendarDate3), (RobertoTextView) view.findViewById(R.id.tvRowGoalsListCalendarDate4), (RobertoTextView) view.findViewById(R.id.tvRowGoalsListCalendarDate5), (RobertoTextView) view.findViewById(R.id.tvRowGoalsListCalendarDate6)};
            this.f28737v = new RobertoTextView[]{(RobertoTextView) view.findViewById(R.id.tvRowGoalsListCalendarDay0), (RobertoTextView) view.findViewById(R.id.tvRowGoalsListCalendarDay1), (RobertoTextView) view.findViewById(R.id.tvRowGoalsListCalendarDay2), (RobertoTextView) view.findViewById(R.id.tvRowGoalsListCalendarDay3), (RobertoTextView) view.findViewById(R.id.tvRowGoalsListCalendarDay4), (RobertoTextView) view.findViewById(R.id.tvRowGoalsListCalendarDay5), (RobertoTextView) view.findViewById(R.id.tvRowGoalsListCalendarDay6)};
            this.f28738w = new CardView[]{(CardView) view.findViewById(R.id.cardRowGoalsList0), (CardView) view.findViewById(R.id.cardRowGoalsList1), (CardView) view.findViewById(R.id.cardRowGoalsList2), (CardView) view.findViewById(R.id.cardRowGoalsList3), (CardView) view.findViewById(R.id.cardRowGoalsList4), (CardView) view.findViewById(R.id.cardRowGoalsList5), (CardView) view.findViewById(R.id.cardRowGoalsList6)};
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00e2, code lost:
        if (r7.equals("Tue") == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(Activity activity, long j10, Integer num, ProGoalsActivity.b bVar, ProGoalsActivity.c cVar) {
        int ceil;
        i.g(activity, "activity");
        this.f28733x = num;
        this.f28734y = bVar;
        this.f28735z = cVar;
        LayoutInflater layoutInflater = activity.getLayoutInflater();
        i.f(layoutInflater, "activity.layoutInflater");
        this.A = layoutInflater;
        GoalHelper goalHelper = new GoalHelper();
        this.B = goalHelper;
        Calendar calendar = Calendar.getInstance();
        this.C = calendar;
        Calendar calendar2 = Calendar.getInstance();
        Calendar calendar3 = Calendar.getInstance();
        this.D = calendar3;
        Calendar calendar4 = Calendar.getInstance();
        int i6 = 1;
        this.F = 1;
        this.G = -1;
        calendar.setTimeInMillis(j10);
        calendar2.setTime(goalHelper.getWeekOf(calendar.getTimeInMillis()).get(0).getTime());
        calendar2.set(11, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        calendar3.setTimeInMillis(System.currentTimeMillis());
        calendar4.setTime(goalHelper.getWeekOf(calendar3.getTimeInMillis()).get(0).getTime());
        calendar4.set(11, 0);
        calendar4.set(12, 0);
        calendar4.set(13, 0);
        calendar4.set(14, 0);
        long timeInMillis = (calendar4.getTimeInMillis() - calendar2.getTimeInMillis()) / 86400000;
        if (timeInMillis < 7) {
            ceil = 1;
        } else {
            ceil = ((int) Math.ceil(timeInMillis / 7)) + 1;
        }
        this.F = ceil;
        String substring = DateFormat.format("EEEE", calendar3.getTime()).toString().substring(0, 3);
        i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        switch (substring.hashCode()) {
            case 70909:
                if (substring.equals("Fri")) {
                    i6 = 4;
                    break;
                }
                i6 = 0;
                break;
            case 77548:
                substring.equals("Mon");
                i6 = 0;
                break;
            case 82886:
                if (substring.equals("Sat")) {
                    i6 = 5;
                    break;
                }
                i6 = 0;
                break;
            case 83500:
                if (substring.equals("Sun")) {
                    i6 = 6;
                    break;
                }
                i6 = 0;
                break;
            case 84065:
                if (substring.equals("Thu")) {
                    i6 = 3;
                    break;
                }
                i6 = 0;
                break;
            case 84452:
                break;
            case 86838:
                if (substring.equals("Wed")) {
                    i6 = 2;
                    break;
                }
                i6 = 0;
                break;
            default:
                i6 = 0;
                break;
        }
        this.E = i6;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.F;
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
            RobertoTextView[] robertoTextViewArr = aVar2.f28736u;
            robertoTextViewArr[i12].setText(DateFormat.format("dd", weekOf.get(i12).getTime()));
            RobertoTextView[] robertoTextViewArr2 = aVar2.f28737v;
            RobertoTextView robertoTextView = robertoTextViewArr2[i12];
            String substring = DateFormat.format("EEEE", weekOf.get(i12).getTime()).toString().substring(0, 3);
            i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            robertoTextView.setText(substring);
            CardView[] cardViewArr = aVar2.f28738w;
            CardView cardView = cardViewArr[i12];
            View view = aVar2.f2751a;
            Context context = view.getContext();
            if (i12 == this.E) {
                Integer num = this.f28733x;
                if (num != null) {
                    i10 = num.intValue();
                } else {
                    i10 = R.color.orange;
                }
            } else {
                i10 = R.color.white;
            }
            cardView.setBackgroundColor(g0.a.b(context, i10));
            RobertoTextView robertoTextView2 = robertoTextViewArr[i12];
            Context context2 = view.getContext();
            int i13 = this.E;
            int i14 = R.color.grey_1;
            if (i12 == i13) {
                i11 = R.color.white;
            } else {
                i11 = R.color.grey_1;
            }
            robertoTextView2.setTextColor(g0.a.b(context2, i11));
            RobertoTextView robertoTextView3 = robertoTextViewArr2[i12];
            Context context3 = view.getContext();
            if (i12 == this.E) {
                i14 = R.color.white;
            }
            robertoTextView3.setTextColor(g0.a.b(context3, i14));
            if (i6 == this.F - 1) {
                if (this.D.compareTo(weekOf.get(i12)) < 0) {
                    cardViewArr[i12].setBackgroundColor(g0.a.b(view.getContext(), R.color.white));
                    robertoTextViewArr[i12].setTextColor(g0.a.b(view.getContext(), R.color.grey_2));
                    robertoTextViewArr2[i12].setTextColor(g0.a.b(view.getContext(), R.color.grey_2));
                    cardViewArr[i12].setOnClickListener(new g(23));
                }
            }
            cardViewArr[i12].setOnClickListener(new d0(this, i12, i6, 4));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        i.g(parent, "parent");
        View inflate = this.A.inflate(R.layout.row_goals_list_calendar_v3, (ViewGroup) parent, false);
        i.f(inflate, "inflater.inflate(R.layou…lendar_v3, parent, false)");
        return new a(inflate);
    }

    public final void v(int i6, Integer num) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(this.C.getTimeInMillis());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.add(5, i6 * 7);
        ArrayList<Calendar> weekOf = this.B.getWeekOf(calendar.getTimeInMillis());
        if (weekOf.get(this.E).getTime().compareTo(this.D.getTime()) < 0) {
            Date time = weekOf.get(this.E).getTime();
            i.f(time, "thisWeek[selectedDate].time");
            this.f28734y.invoke(time, Integer.valueOf(i6));
            this.G = i6;
        } else if (num != null) {
            this.E = num.intValue();
        }
    }
}
