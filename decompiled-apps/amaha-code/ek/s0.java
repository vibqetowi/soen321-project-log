package ek;

import android.content.Context;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.ScreenResult4Model;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
/* compiled from: Log4AdapterNew.kt */
/* loaded from: classes2.dex */
public final class s0 extends RecyclerView.e<a> {
    public final Calendar A;
    public final HashSet<String> B;

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<ScreenResult4Model> f14291x;

    /* renamed from: y  reason: collision with root package name */
    public final Context f14292y;

    /* renamed from: z  reason: collision with root package name */
    public final String f14293z;

    /* compiled from: Log4AdapterNew.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final RobertoTextView f14294u;

        /* renamed from: v  reason: collision with root package name */
        public final LinearLayout f14295v;

        /* renamed from: w  reason: collision with root package name */
        public final RobertoTextView f14296w;

        public a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.date);
            kotlin.jvm.internal.i.f(findViewById, "itemView.findViewById(R.id.date)");
            this.f14294u = (RobertoTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.logsContainer);
            kotlin.jvm.internal.i.f(findViewById2, "itemView.findViewById(R.id.logsContainer)");
            this.f14295v = (LinearLayout) findViewById2;
            View findViewById3 = view.findViewById(R.id.logsTime);
            kotlin.jvm.internal.i.f(findViewById3, "itemView.findViewById(R.id.logsTime)");
            this.f14296w = (RobertoTextView) findViewById3;
        }
    }

    public s0(Context context, String title, ArrayList goalList) {
        kotlin.jvm.internal.i.g(goalList, "goalList");
        kotlin.jvm.internal.i.g(title, "title");
        this.f14291x = new ArrayList<>();
        this.f14293z = "";
        Calendar calendar = Calendar.getInstance();
        this.A = calendar;
        this.B = new HashSet<>();
        this.f14291x = goalList;
        this.f14292y = context;
        this.f14293z = title;
        calendar.clear(11);
        calendar.clear(9);
        calendar.clear(12);
        calendar.clear(10);
        calendar.clear(13);
        calendar.clear(14);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f14291x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        boolean z10;
        a aVar2 = aVar;
        ScreenResult4Model screenResult4Model = this.f14291x.get(i6);
        kotlin.jvm.internal.i.f(screenResult4Model, "goalList[position]");
        ScreenResult4Model screenResult4Model2 = screenResult4Model;
        Calendar calendar = Calendar.getInstance();
        long j10 = 1000;
        calendar.setTimeInMillis(screenResult4Model2.getDate() * j10);
        calendar.clear(11);
        calendar.clear(9);
        calendar.clear(12);
        calendar.clear(10);
        calendar.clear(13);
        calendar.clear(14);
        Calendar calendar2 = this.A;
        long d10 = defpackage.b.d(calendar, calendar2.getTimeInMillis(), j10);
        HashSet<String> hashSet = this.B;
        RobertoTextView robertoTextView = aVar2.f14294u;
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
                    Date w10 = defpackage.c.w(screenResult4Model2.getDate() * j10);
                    defpackage.c.A(defpackage.b.n("dd", w10), ' ', defpackage.b.n("MMM", w10), robertoTextView);
                    hashSet.add(obj);
                }
            }
        }
        aVar2.f14296w.setText(DateFormat.format("HH:mm", screenResult4Model2.getDate() * j10).toString());
        LayoutInflater from = LayoutInflater.from(this.f14292y);
        LinearLayout linearLayout = aVar2.f14295v;
        View inflate = from.inflate(R.layout.row_log_item_new, (ViewGroup) linearLayout, false);
        ((RobertoTextView) inflate.findViewById(R.id.title)).setText(this.f14293z);
        ((RobertoTextView) inflate.findViewById(R.id.content)).setText(screenResult4Model2.getText());
        linearLayout.addView(inflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView recyclerView) {
        View itemView = defpackage.b.e(recyclerView, "parent", R.layout.row_log_card_new, recyclerView, false);
        kotlin.jvm.internal.i.f(itemView, "itemView");
        return new a(itemView);
    }
}
