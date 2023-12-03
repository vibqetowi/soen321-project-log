package ek;

import android.content.Context;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.ScreenResult28Model;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
/* compiled from: Log28AdapterNew.kt */
/* loaded from: classes2.dex */
public final class j0 extends RecyclerView.e<a> {
    public final Calendar A;
    public final HashSet<String> B;

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<ScreenResult28Model> f14173x;

    /* renamed from: y  reason: collision with root package name */
    public final Context f14174y;

    /* renamed from: z  reason: collision with root package name */
    public final ArrayList<String> f14175z;

    /* compiled from: Log28AdapterNew.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final RobertoTextView f14176u;

        /* renamed from: v  reason: collision with root package name */
        public final LinearLayout f14177v;

        /* renamed from: w  reason: collision with root package name */
        public final RobertoTextView f14178w;

        public a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.date);
            kotlin.jvm.internal.i.f(findViewById, "itemView.findViewById(R.id.date)");
            this.f14176u = (RobertoTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.logsContainer);
            kotlin.jvm.internal.i.f(findViewById2, "itemView.findViewById(R.id.logsContainer)");
            this.f14177v = (LinearLayout) findViewById2;
            View findViewById3 = view.findViewById(R.id.logsTime);
            kotlin.jvm.internal.i.f(findViewById3, "itemView.findViewById(R.id.logsTime)");
            this.f14178w = (RobertoTextView) findViewById3;
        }
    }

    public j0(Context context, ArrayList goalList, ArrayList arrayList) {
        kotlin.jvm.internal.i.g(goalList, "goalList");
        this.f14173x = new ArrayList<>();
        this.f14175z = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        this.A = calendar;
        this.B = new HashSet<>();
        this.f14173x = goalList;
        this.f14174y = context;
        this.f14175z = arrayList;
        calendar.clear(11);
        calendar.clear(9);
        calendar.clear(12);
        calendar.clear(10);
        calendar.clear(13);
        calendar.clear(14);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f14173x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        boolean z10;
        a aVar2 = aVar;
        ScreenResult28Model screenResult28Model = this.f14173x.get(i6);
        kotlin.jvm.internal.i.f(screenResult28Model, "goalList[position]");
        ScreenResult28Model screenResult28Model2 = screenResult28Model;
        Calendar calendar = Calendar.getInstance();
        long j10 = 1000;
        calendar.setTimeInMillis(screenResult28Model2.getDate() * j10);
        calendar.clear(11);
        calendar.clear(9);
        calendar.clear(12);
        calendar.clear(10);
        calendar.clear(13);
        calendar.clear(14);
        Calendar calendar2 = this.A;
        long d10 = defpackage.b.d(calendar, calendar2.getTimeInMillis(), j10);
        HashSet<String> hashSet = this.B;
        RobertoTextView robertoTextView = aVar2.f14176u;
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
                    Date w10 = defpackage.c.w(screenResult28Model2.getDate() * j10);
                    defpackage.c.A(defpackage.b.n("dd", w10), ' ', defpackage.b.n("MMM", w10), robertoTextView);
                    hashSet.add(obj);
                }
            }
        }
        aVar2.f14178w.setText(DateFormat.format("HH:mm", screenResult28Model2.getDate() * j10).toString());
        Context context = this.f14174y;
        LayoutInflater from = LayoutInflater.from(context);
        LinearLayout linearLayout = aVar2.f14177v;
        View inflate = from.inflate(R.layout.row_log_item_new, (ViewGroup) linearLayout, false);
        ((RobertoTextView) inflate.findViewById(R.id.title)).setText("Situation that's worrying you");
        ((RobertoTextView) inflate.findViewById(R.id.content)).setText(screenResult28Model2.getSituation());
        linearLayout.addView(inflate);
        int size = screenResult28Model2.getAnswers().size();
        for (int i10 = 0; i10 < size; i10++) {
            View inflate2 = LayoutInflater.from(context).inflate(R.layout.row_log_item_new, (ViewGroup) linearLayout, false);
            ((RobertoTextView) inflate2.findViewById(R.id.title)).setText(this.f14175z.get(i10));
            ((RobertoTextView) inflate2.findViewById(R.id.content)).setText(screenResult28Model2.getAnswers().get(i10));
            linearLayout.addView(inflate2);
        }
        if (!screenResult28Model2.getList().isEmpty()) {
            View inflate3 = LayoutInflater.from(context).inflate(R.layout.row_log_item_new, (ViewGroup) linearLayout, false);
            ((RobertoTextView) inflate3.findViewById(R.id.title)).setText("List of all controllable things");
            ((RobertoTextView) inflate3.findViewById(R.id.content)).setText(is.u.m2(screenResult28Model2.getList(), null, null, null, null, 63));
            linearLayout.addView(inflate3);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView recyclerView) {
        View itemView = defpackage.b.e(recyclerView, "parent", R.layout.row_log_card_new, recyclerView, false);
        kotlin.jvm.internal.i.f(itemView, "itemView");
        return new a(itemView);
    }
}
