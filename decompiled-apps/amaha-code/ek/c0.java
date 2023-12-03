package ek;

import android.content.Context;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.ScreenResult1Model;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
/* compiled from: Log1AdapterNew.kt */
/* loaded from: classes2.dex */
public final class c0 extends RecyclerView.e<a> {
    public final HashSet<String> A;

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<ScreenResult1Model> f14083x;

    /* renamed from: y  reason: collision with root package name */
    public final Context f14084y;

    /* renamed from: z  reason: collision with root package name */
    public final Calendar f14085z;

    /* compiled from: Log1AdapterNew.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final RobertoTextView f14086u;

        /* renamed from: v  reason: collision with root package name */
        public final LinearLayout f14087v;

        /* renamed from: w  reason: collision with root package name */
        public final RobertoTextView f14088w;

        public a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.date);
            kotlin.jvm.internal.i.f(findViewById, "itemView.findViewById(R.id.date)");
            this.f14086u = (RobertoTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.logsContainer);
            kotlin.jvm.internal.i.f(findViewById2, "itemView.findViewById(R.id.logsContainer)");
            this.f14087v = (LinearLayout) findViewById2;
            View findViewById3 = view.findViewById(R.id.logsTime);
            kotlin.jvm.internal.i.f(findViewById3, "itemView.findViewById(R.id.logsTime)");
            this.f14088w = (RobertoTextView) findViewById3;
        }
    }

    public c0(Context context, ArrayList goalList) {
        kotlin.jvm.internal.i.g(goalList, "goalList");
        this.f14083x = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        this.f14085z = calendar;
        this.A = new HashSet<>();
        this.f14083x = goalList;
        this.f14084y = context;
        calendar.clear(11);
        calendar.clear(9);
        calendar.clear(12);
        calendar.clear(10);
        calendar.clear(13);
        calendar.clear(14);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f14083x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        boolean z10;
        String str;
        a aVar2 = aVar;
        ScreenResult1Model screenResult1Model = this.f14083x.get(i6);
        kotlin.jvm.internal.i.f(screenResult1Model, "goalList[position]");
        ScreenResult1Model screenResult1Model2 = screenResult1Model;
        Calendar calendar = Calendar.getInstance();
        long j10 = 1000;
        calendar.setTimeInMillis(screenResult1Model2.getDate() * j10);
        calendar.clear(11);
        calendar.clear(9);
        calendar.clear(12);
        calendar.clear(10);
        calendar.clear(13);
        calendar.clear(14);
        Calendar calendar2 = this.f14085z;
        long d10 = defpackage.b.d(calendar, calendar2.getTimeInMillis(), j10);
        HashSet<String> hashSet = this.A;
        RobertoTextView robertoTextView = aVar2.f14086u;
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
                    Date w10 = defpackage.c.w(screenResult1Model2.getDate() * j10);
                    defpackage.c.A(defpackage.b.n("dd", w10), ' ', defpackage.b.n("MMM", w10), robertoTextView);
                    hashSet.add(obj);
                }
            }
        }
        aVar2.f14088w.setText(DateFormat.format("HH:mm", screenResult1Model2.getDate() * j10).toString());
        int size = screenResult1Model2.getList().size();
        for (int i10 = 0; i10 < size; i10++) {
            LayoutInflater from = LayoutInflater.from(this.f14084y);
            LinearLayout linearLayout = aVar2.f14087v;
            View inflate = from.inflate(R.layout.row_log_item_new, (ViewGroup) linearLayout, false);
            RobertoTextView robertoTextView2 = (RobertoTextView) inflate.findViewById(R.id.title);
            String str2 = "";
            if (i10 >= screenResult1Model2.getHeadings().size()) {
                str = "";
            } else {
                str = screenResult1Model2.getHeadings().get(i10);
            }
            robertoTextView2.setText(str);
            RobertoTextView robertoTextView3 = (RobertoTextView) inflate.findViewById(R.id.content);
            if (i10 < screenResult1Model2.getList().size()) {
                str2 = screenResult1Model2.getList().get(i10);
            }
            robertoTextView3.setText(str2);
            linearLayout.addView(inflate);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView recyclerView) {
        View itemView = defpackage.b.e(recyclerView, "parent", R.layout.row_log_card_new, recyclerView, false);
        kotlin.jvm.internal.i.f(itemView, "itemView");
        return new a(itemView);
    }
}
