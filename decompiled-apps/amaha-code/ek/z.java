package ek;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.ScreenResult16Model;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
/* compiled from: Log16Adapter.kt */
/* loaded from: classes2.dex */
public final class z extends RecyclerView.e<a> {

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<ScreenResult16Model> f14358x;

    /* renamed from: y  reason: collision with root package name */
    public final TemplateActivity f14359y;

    /* compiled from: Log16Adapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final RobertoTextView f14360u;

        /* renamed from: v  reason: collision with root package name */
        public final RobertoTextView f14361v;

        /* renamed from: w  reason: collision with root package name */
        public final LinearLayout f14362w;

        /* renamed from: x  reason: collision with root package name */
        public final CardView f14363x;

        public a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.dateText);
            kotlin.jvm.internal.i.f(findViewById, "itemView.findViewById(R.id.dateText)");
            this.f14360u = (RobertoTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.monthText);
            kotlin.jvm.internal.i.f(findViewById2, "itemView.findViewById(R.id.monthText)");
            this.f14361v = (RobertoTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.linearLayout);
            kotlin.jvm.internal.i.f(findViewById3, "itemView.findViewById(R.id.linearLayout)");
            this.f14362w = (LinearLayout) findViewById3;
            View findViewById4 = view.findViewById(R.id.logCard);
            kotlin.jvm.internal.i.f(findViewById4, "itemView.findViewById(R.id.logCard)");
            this.f14363x = (CardView) findViewById4;
        }
    }

    public z(ArrayList<ScreenResult16Model> goalList, TemplateActivity act) {
        kotlin.jvm.internal.i.g(goalList, "goalList");
        kotlin.jvm.internal.i.g(act, "act");
        this.f14358x = new ArrayList<>();
        this.f14358x = goalList;
        this.f14359y = act;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f14358x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        int i10;
        a aVar2 = aVar;
        ScreenResult16Model screenResult16Model = this.f14358x.get(i6);
        kotlin.jvm.internal.i.f(screenResult16Model, "goalList[position]");
        ScreenResult16Model screenResult16Model2 = screenResult16Model;
        long j10 = 1000;
        Date w10 = defpackage.c.w(screenResult16Model2.getDate() * j10);
        String n10 = defpackage.b.n("MMM", w10);
        String n11 = defpackage.b.n("dd", w10);
        aVar2.f14361v.setText(n10);
        aVar2.f14360u.setText(n11);
        TemplateActivity templateActivity = this.f14359y;
        HashMap<String, Object> A0 = templateActivity.A0();
        LinearLayout linearLayout = aVar2.f14362w;
        linearLayout.removeAllViews();
        View inflate = templateActivity.getLayoutInflater().inflate(R.layout.row_log_vertical_textview, (ViewGroup) linearLayout, false);
        ((RobertoTextView) inflate.findViewById(R.id.rowQuestion)).setText(UtilFunKt.paramsMapToString(A0.get("r16_first_label")));
        ((RobertoTextView) inflate.findViewById(R.id.rowAnswer)).setText(screenResult16Model2.getText());
        linearLayout.addView(inflate);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(screenResult16Model2.getFromTime() * j10);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(screenResult16Model2.getTillTime() * j10);
        calendar.get(11);
        calendar.get(12);
        calendar2.get(11);
        calendar2.get(12);
        View inflate2 = templateActivity.getLayoutInflater().inflate(R.layout.row_log_vertical_textview, (ViewGroup) linearLayout, false);
        ((RobertoTextView) inflate2.findViewById(R.id.rowQuestion)).setText(UtilFunKt.paramsMapToString(A0.get("r16_second_label")));
        ((RobertoTextView) inflate2.findViewById(R.id.rowAnswer)).setText(calendar.get(11) + ':' + calendar.get(12) + " to " + calendar2.get(11) + ':' + calendar2.get(12));
        linearLayout.addView(inflate2);
        if (screenResult16Model2.getList().size() > 0) {
            View inflate3 = templateActivity.getLayoutInflater().inflate(R.layout.row_single_text_heading, (ViewGroup) linearLayout, false);
            ((RobertoTextView) inflate3.findViewById(R.id.tvSingleLine)).setText(UtilFunKt.paramsMapToString(A0.get("r16_third_label")));
            linearLayout.addView(inflate3);
        }
        if (screenResult16Model2.getList().size() < 3) {
            i10 = screenResult16Model2.getList().size();
        } else {
            i10 = 3;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            View inflate4 = templateActivity.getLayoutInflater().inflate(R.layout.row_single_text, (ViewGroup) linearLayout, false);
            ((RobertoTextView) inflate4.findViewById(R.id.tvSingleLine)).setText(screenResult16Model2.getList().get(i11));
            if (i11 < 3 && i11 < screenResult16Model2.getList().size() - 1) {
                ViewGroup.LayoutParams layoutParams = ((RobertoTextView) inflate4.findViewById(R.id.tvSingleLine)).getLayoutParams();
                kotlin.jvm.internal.i.e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.a aVar3 = (ConstraintLayout.a) layoutParams;
                if (i11 == 2) {
                    aVar3.setMargins(16, 0, 16, 16);
                } else {
                    aVar3.setMargins(16, 0, 16, 0);
                }
                ((RobertoTextView) inflate4.findViewById(R.id.tvSingleLine)).setLayoutParams(aVar3);
            }
            linearLayout.addView(inflate4);
        }
        aVar2.f14363x.setOnClickListener(new defpackage.a(this, 15, screenResult16Model2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView recyclerView) {
        View itemView = defpackage.b.e(recyclerView, "parent", R.layout.row_log_6, recyclerView, false);
        kotlin.jvm.internal.i.f(itemView, "itemView");
        return new a(itemView);
    }
}
