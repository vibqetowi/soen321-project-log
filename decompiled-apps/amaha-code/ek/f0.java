package ek;

import android.content.Context;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.ScreenResult21Model;
import com.theinnerhour.b2b.model.UrgentImportantModel;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: Log21AdapterNew.kt */
/* loaded from: classes2.dex */
public final class f0 extends RecyclerView.e<a> {
    public final HashSet<String> A;

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<ScreenResult21Model> f14125x;

    /* renamed from: y  reason: collision with root package name */
    public final Context f14126y;

    /* renamed from: z  reason: collision with root package name */
    public final Calendar f14127z;

    /* compiled from: Log21AdapterNew.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final RobertoTextView f14128u;

        /* renamed from: v  reason: collision with root package name */
        public final LinearLayout f14129v;

        /* renamed from: w  reason: collision with root package name */
        public final RobertoTextView f14130w;

        public a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.date);
            kotlin.jvm.internal.i.f(findViewById, "itemView.findViewById(R.id.date)");
            this.f14128u = (RobertoTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.logsContainer);
            kotlin.jvm.internal.i.f(findViewById2, "itemView.findViewById(R.id.logsContainer)");
            this.f14129v = (LinearLayout) findViewById2;
            View findViewById3 = view.findViewById(R.id.logsTime);
            kotlin.jvm.internal.i.f(findViewById3, "itemView.findViewById(R.id.logsTime)");
            this.f14130w = (RobertoTextView) findViewById3;
        }
    }

    public f0(Context context, ArrayList goalList) {
        kotlin.jvm.internal.i.g(goalList, "goalList");
        this.f14125x = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        this.f14127z = calendar;
        this.A = new HashSet<>();
        this.f14125x = goalList;
        this.f14126y = context;
        calendar.clear(11);
        calendar.clear(9);
        calendar.clear(12);
        calendar.clear(10);
        calendar.clear(13);
        calendar.clear(14);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f14125x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        boolean z10;
        a aVar2 = aVar;
        ScreenResult21Model screenResult21Model = this.f14125x.get(i6);
        kotlin.jvm.internal.i.f(screenResult21Model, "goalList[position]");
        ScreenResult21Model screenResult21Model2 = screenResult21Model;
        Calendar calendar = Calendar.getInstance();
        long j10 = 1000;
        calendar.setTimeInMillis(screenResult21Model2.getDate() * j10);
        calendar.clear(11);
        calendar.clear(9);
        calendar.clear(12);
        calendar.clear(10);
        calendar.clear(13);
        calendar.clear(14);
        Calendar calendar2 = this.f14127z;
        long d10 = defpackage.b.d(calendar, calendar2.getTimeInMillis(), j10);
        HashSet<String> hashSet = this.A;
        RobertoTextView robertoTextView = aVar2.f14128u;
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
                    Date w10 = defpackage.c.w(screenResult21Model2.getDate() * j10);
                    defpackage.c.A(defpackage.b.n("dd", w10), ' ', defpackage.b.n("MMM", w10), robertoTextView);
                    hashSet.add(obj);
                }
            }
        }
        aVar2.f14130w.setText(DateFormat.format("HH:mm", screenResult21Model2.getDate() * j10).toString());
        Iterator<UrgentImportantModel> it = screenResult21Model2.getItems().iterator();
        String str = "";
        String str2 = str;
        String str3 = str2;
        String str4 = str3;
        while (it.hasNext()) {
            UrgentImportantModel next = it.next();
            if (next.getImportant() && next.getUrgent()) {
                StringBuilder c10 = v.h.c(str);
                c10.append(next.getText());
                c10.append('\n');
                str = c10.toString();
            } else if (next.getImportant() && !next.getUrgent()) {
                StringBuilder c11 = v.h.c(str2);
                c11.append(next.getText());
                c11.append('\n');
                str2 = c11.toString();
            } else if (!next.getImportant() && next.getUrgent()) {
                StringBuilder c12 = v.h.c(str3);
                c12.append(next.getText());
                c12.append('\n');
                str3 = c12.toString();
            } else {
                StringBuilder c13 = v.h.c(str4);
                c13.append(next.getText());
                c13.append('\n');
                str4 = c13.toString();
            }
        }
        boolean b10 = kotlin.jvm.internal.i.b(str, "");
        LinearLayout linearLayout = aVar2.f14129v;
        if (!b10) {
            String heading1 = screenResult21Model2.getHeading1();
            kotlin.jvm.internal.i.d(heading1);
            v(heading1, gv.r.i1(str).toString(), linearLayout);
        }
        if (!kotlin.jvm.internal.i.b(str2, "")) {
            String heading2 = screenResult21Model2.getHeading2();
            kotlin.jvm.internal.i.d(heading2);
            v(heading2, gv.r.i1(str2).toString(), linearLayout);
        }
        if (!kotlin.jvm.internal.i.b(str3, "")) {
            String heading3 = screenResult21Model2.getHeading3();
            kotlin.jvm.internal.i.d(heading3);
            v(heading3, gv.r.i1(str3).toString(), linearLayout);
        }
        if (!kotlin.jvm.internal.i.b(str4, "")) {
            String heading4 = screenResult21Model2.getHeading4();
            kotlin.jvm.internal.i.d(heading4);
            v(heading4, gv.r.i1(str4).toString(), linearLayout);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView recyclerView) {
        View itemView = defpackage.b.e(recyclerView, "parent", R.layout.row_log_card_new, recyclerView, false);
        kotlin.jvm.internal.i.f(itemView, "itemView");
        return new a(itemView);
    }

    public final void v(String str, String str2, LinearLayout linearLayout) {
        View inflate = LayoutInflater.from(this.f14126y).inflate(R.layout.row_log_item_new, (ViewGroup) linearLayout, false);
        ((RobertoTextView) inflate.findViewById(R.id.title)).setText(str);
        ((RobertoTextView) inflate.findViewById(R.id.content)).setText(str2);
        linearLayout.addView(inflate);
    }
}
