package ek;

import android.content.Context;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.ScreenResult30Model;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
/* compiled from: Log30AdapterNew.kt */
/* loaded from: classes2.dex */
public final class l0 extends RecyclerView.e<a> {
    public final Calendar A;
    public final HashSet<String> B;

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<ScreenResult30Model> f14201x;

    /* renamed from: y  reason: collision with root package name */
    public final Context f14202y;

    /* renamed from: z  reason: collision with root package name */
    public final String f14203z;

    /* compiled from: Log30AdapterNew.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final RobertoTextView f14204u;

        /* renamed from: v  reason: collision with root package name */
        public final LinearLayout f14205v;

        /* renamed from: w  reason: collision with root package name */
        public final RobertoTextView f14206w;

        public a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.date);
            kotlin.jvm.internal.i.f(findViewById, "itemView.findViewById(R.id.date)");
            this.f14204u = (RobertoTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.logsContainer);
            kotlin.jvm.internal.i.f(findViewById2, "itemView.findViewById(R.id.logsContainer)");
            this.f14205v = (LinearLayout) findViewById2;
            View findViewById3 = view.findViewById(R.id.logsTime);
            kotlin.jvm.internal.i.f(findViewById3, "itemView.findViewById(R.id.logsTime)");
            this.f14206w = (RobertoTextView) findViewById3;
        }
    }

    public l0(Context context, String title, ArrayList goalList) {
        kotlin.jvm.internal.i.g(goalList, "goalList");
        kotlin.jvm.internal.i.g(title, "title");
        this.f14201x = new ArrayList<>();
        this.f14203z = "";
        Calendar calendar = Calendar.getInstance();
        this.A = calendar;
        this.B = new HashSet<>();
        this.f14201x = goalList;
        this.f14202y = context;
        this.f14203z = title;
        calendar.clear(11);
        calendar.clear(9);
        calendar.clear(12);
        calendar.clear(10);
        calendar.clear(13);
        calendar.clear(14);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f14201x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        boolean z10;
        a aVar2 = aVar;
        RobertoTextView robertoTextView = aVar2.f14206w;
        robertoTextView.setVisibility(8);
        ScreenResult30Model screenResult30Model = this.f14201x.get(i6);
        kotlin.jvm.internal.i.f(screenResult30Model, "goalList[position]");
        ScreenResult30Model screenResult30Model2 = screenResult30Model;
        Calendar calendar = Calendar.getInstance();
        long j10 = 1000;
        calendar.setTimeInMillis(screenResult30Model2.getDate() * j10);
        calendar.clear(11);
        calendar.clear(9);
        calendar.clear(12);
        calendar.clear(10);
        calendar.clear(13);
        calendar.clear(14);
        Calendar calendar2 = this.A;
        long d10 = defpackage.b.d(calendar, calendar2.getTimeInMillis(), j10);
        HashSet<String> hashSet = this.B;
        RobertoTextView robertoTextView2 = aVar2.f14204u;
        if (d10 < 86400) {
            if (hashSet.contains("Today")) {
                robertoTextView2.setVisibility(8);
            } else {
                robertoTextView2.setText("Today");
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
                    robertoTextView2.setVisibility(8);
                } else {
                    robertoTextView2.setText("Yesterday");
                    hashSet.add("Yesterday");
                }
            } else {
                String obj = DateFormat.format("ddMMMMyy", calendar).toString();
                if (hashSet.contains(obj)) {
                    robertoTextView2.setVisibility(8);
                } else {
                    Date w10 = defpackage.c.w(screenResult30Model2.getDate() * j10);
                    defpackage.c.A(defpackage.b.n("dd", w10), ' ', defpackage.b.n("MMM", w10), robertoTextView2);
                    hashSet.add(obj);
                }
            }
        }
        robertoTextView.setText(DateFormat.format("HH:mm", screenResult30Model2.getDate() * j10).toString());
        Context context = this.f14202y;
        LayoutInflater from = LayoutInflater.from(context);
        LinearLayout linearLayout = aVar2.f14205v;
        View inflate = from.inflate(R.layout.row_log_item_new, (ViewGroup) linearLayout, false);
        ((RobertoTextView) inflate.findViewById(R.id.title)).setText(this.f14203z);
        ((RobertoTextView) inflate.findViewById(R.id.content)).setVisibility(8);
        linearLayout.addView(inflate);
        int size = screenResult30Model2.getList().size();
        for (int i10 = 0; i10 < size; i10++) {
            View inflate2 = LayoutInflater.from(context).inflate(R.layout.row_log_item_new, (ViewGroup) linearLayout, false);
            ((RobertoTextView) inflate2.findViewById(R.id.title)).setVisibility(8);
            ((RobertoTextView) inflate2.findViewById(R.id.content)).setText(screenResult30Model2.getList().get(i10));
            if (i10 != screenResult30Model2.getList().size() - 1) {
                ViewGroup.LayoutParams layoutParams = ((RobertoTextView) inflate2.findViewById(R.id.content)).getLayoutParams();
                kotlin.jvm.internal.i.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = 0;
                ((RobertoTextView) inflate2.findViewById(R.id.content)).setLayoutParams(marginLayoutParams);
            }
            linearLayout.addView(inflate2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView recyclerView) {
        View itemView = defpackage.b.e(recyclerView, "parent", R.layout.row_log_card_new, recyclerView, false);
        kotlin.jvm.internal.i.f(itemView, "itemView");
        return new a(itemView);
    }
}
