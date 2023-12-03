package ek;

import android.content.Context;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.ScreenResult22Model;
import com.theinnerhour.b2b.model.TaskIn2Min;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: Log22AdapterNew.kt */
/* loaded from: classes2.dex */
public final class h0 extends RecyclerView.e<a> {
    public final HashSet<String> A;

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<ScreenResult22Model> f14151x;

    /* renamed from: y  reason: collision with root package name */
    public final Context f14152y;

    /* renamed from: z  reason: collision with root package name */
    public final Calendar f14153z;

    /* compiled from: Log22AdapterNew.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final RobertoTextView f14154u;

        /* renamed from: v  reason: collision with root package name */
        public final LinearLayout f14155v;

        /* renamed from: w  reason: collision with root package name */
        public final RobertoTextView f14156w;

        public a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.date);
            kotlin.jvm.internal.i.f(findViewById, "itemView.findViewById(R.id.date)");
            this.f14154u = (RobertoTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.logsContainer);
            kotlin.jvm.internal.i.f(findViewById2, "itemView.findViewById(R.id.logsContainer)");
            this.f14155v = (LinearLayout) findViewById2;
            View findViewById3 = view.findViewById(R.id.logsTime);
            kotlin.jvm.internal.i.f(findViewById3, "itemView.findViewById(R.id.logsTime)");
            this.f14156w = (RobertoTextView) findViewById3;
        }
    }

    public h0(Context context, ArrayList goalList) {
        kotlin.jvm.internal.i.g(goalList, "goalList");
        this.f14151x = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        this.f14153z = calendar;
        this.A = new HashSet<>();
        this.f14151x = goalList;
        this.f14152y = context;
        calendar.clear(11);
        calendar.clear(9);
        calendar.clear(12);
        calendar.clear(10);
        calendar.clear(13);
        calendar.clear(14);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f14151x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        boolean z10;
        a aVar2 = aVar;
        ScreenResult22Model screenResult22Model = this.f14151x.get(i6);
        kotlin.jvm.internal.i.f(screenResult22Model, "goalList[position]");
        ScreenResult22Model screenResult22Model2 = screenResult22Model;
        Calendar calendar = Calendar.getInstance();
        long j10 = 1000;
        calendar.setTimeInMillis(screenResult22Model2.getDate() * j10);
        calendar.clear(11);
        calendar.clear(9);
        calendar.clear(12);
        calendar.clear(10);
        calendar.clear(13);
        calendar.clear(14);
        Calendar calendar2 = this.f14153z;
        long d10 = defpackage.b.d(calendar, calendar2.getTimeInMillis(), j10);
        HashSet<String> hashSet = this.A;
        int i10 = 0;
        RobertoTextView robertoTextView = aVar2.f14154u;
        if (d10 < 86400) {
            if (hashSet.contains("Today")) {
                robertoTextView.setVisibility(8);
            } else {
                robertoTextView.setText("Today");
                hashSet.add("Today");
            }
        } else {
            long d11 = defpackage.b.d(calendar, calendar2.getTimeInMillis(), j10);
            if (86400 <= d11 && d11 < 172800) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (hashSet.contains("Yesterday")) {
                    robertoTextView.setVisibility(8);
                } else {
                    robertoTextView.setText("Yesterday");
                    hashSet.add("Yesterday");
                }
            } else {
                String obj = DateFormat.format("ddMMMMyy", calendar).toString();
                if (hashSet.contains(obj)) {
                    robertoTextView.setVisibility(8);
                } else {
                    Date w10 = defpackage.c.w(screenResult22Model2.getDate() * j10);
                    defpackage.c.A(defpackage.b.n("dd", w10), ' ', defpackage.b.n("MMM", w10), robertoTextView);
                    hashSet.add(obj);
                }
            }
        }
        aVar2.f14156w.setText(DateFormat.format("HH:mm", screenResult22Model2.getDate() * j10).toString());
        LayoutInflater from = LayoutInflater.from(this.f14152y);
        LinearLayout linearLayout = aVar2.f14155v;
        View inflate = from.inflate(R.layout.row_log_item_new, (ViewGroup) linearLayout, false);
        ((RobertoTextView) inflate.findViewById(R.id.title)).setText(screenResult22Model2.getTitle1());
        Iterator<TaskIn2Min> it = screenResult22Model2.getItems().iterator();
        String str = "";
        while (it.hasNext()) {
            i10++;
            TaskIn2Min next = it.next();
            if (next.getIn2Min()) {
                StringBuilder c10 = v.h.c(str);
                c10.append(screenResult22Model2.getPrefix());
                c10.append(' ');
                c10.append(i10);
                c10.append('\n');
                StringBuilder d12 = v.g.d(c10.toString(), "- ");
                d12.append(next.getText());
                d12.append("\n\n");
                str = d12.toString();
            }
        }
        StringBuilder c11 = v.h.c(str);
        c11.append(screenResult22Model2.getRememberLabel());
        c11.append("\n\n");
        c11.append(screenResult22Model2.getRememberText1());
        ((RobertoTextView) inflate.findViewById(R.id.content)).setText(c11.toString());
        linearLayout.addView(inflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView recyclerView) {
        View itemView = defpackage.b.e(recyclerView, "parent", R.layout.row_log_card_new, recyclerView, false);
        kotlin.jvm.internal.i.f(itemView, "itemView");
        return new a(itemView);
    }
}
