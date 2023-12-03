package ek;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.ScreenResult30Model;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
/* compiled from: Log30Adapter.kt */
/* loaded from: classes2.dex */
public final class k0 extends RecyclerView.e<a> {

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<ScreenResult30Model> f14187x;

    /* renamed from: y  reason: collision with root package name */
    public final TemplateActivity f14188y;

    /* compiled from: Log30Adapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final RobertoTextView f14189u;

        /* renamed from: v  reason: collision with root package name */
        public final RobertoTextView f14190v;

        /* renamed from: w  reason: collision with root package name */
        public final LinearLayout f14191w;

        /* renamed from: x  reason: collision with root package name */
        public final CardView f14192x;

        public a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.dateText);
            kotlin.jvm.internal.i.f(findViewById, "itemView.findViewById(R.id.dateText)");
            this.f14189u = (RobertoTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.monthText);
            kotlin.jvm.internal.i.f(findViewById2, "itemView.findViewById(R.id.monthText)");
            this.f14190v = (RobertoTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.linearLayout);
            kotlin.jvm.internal.i.f(findViewById3, "itemView.findViewById(R.id.linearLayout)");
            this.f14191w = (LinearLayout) findViewById3;
            View findViewById4 = view.findViewById(R.id.logCard);
            kotlin.jvm.internal.i.f(findViewById4, "itemView.findViewById(R.id.logCard)");
            this.f14192x = (CardView) findViewById4;
        }
    }

    public k0(ArrayList<ScreenResult30Model> goalList, TemplateActivity act) {
        kotlin.jvm.internal.i.g(goalList, "goalList");
        kotlin.jvm.internal.i.g(act, "act");
        this.f14187x = new ArrayList<>();
        this.f14187x = goalList;
        this.f14188y = act;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f14187x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        int i10;
        a aVar2 = aVar;
        ScreenResult30Model screenResult30Model = this.f14187x.get(i6);
        kotlin.jvm.internal.i.f(screenResult30Model, "goalList[position]");
        ScreenResult30Model screenResult30Model2 = screenResult30Model;
        Date w10 = defpackage.c.w(screenResult30Model2.getDate() * 1000);
        String n10 = defpackage.b.n("MMM", w10);
        String n11 = defpackage.b.n("dd", w10);
        aVar2.f14190v.setText(n10);
        aVar2.f14189u.setText(n11);
        LinearLayout linearLayout = aVar2.f14191w;
        linearLayout.removeAllViews();
        TemplateActivity templateActivity = this.f14188y;
        HashMap<String, Object> A0 = templateActivity.A0();
        View inflate = templateActivity.getLayoutInflater().inflate(R.layout.row_single_text_heading, (ViewGroup) linearLayout, false);
        ((RobertoTextView) inflate.findViewById(R.id.tvSingleLine)).setText(UtilFunKt.paramsMapToString(A0.get("r30_subheading")));
        linearLayout.addView(inflate);
        if (screenResult30Model2.getList().size() < 3) {
            i10 = screenResult30Model2.getList().size();
        } else {
            i10 = 3;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            View inflate2 = templateActivity.getLayoutInflater().inflate(R.layout.row_single_text, (ViewGroup) linearLayout, false);
            ((RobertoTextView) inflate2.findViewById(R.id.tvSingleLine)).setText(screenResult30Model2.getList().get(i11));
            if (i11 < 3 && i11 < screenResult30Model2.getList().size() - 1) {
                ViewGroup.LayoutParams layoutParams = ((RobertoTextView) inflate2.findViewById(R.id.tvSingleLine)).getLayoutParams();
                kotlin.jvm.internal.i.e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.a aVar3 = (ConstraintLayout.a) layoutParams;
                aVar3.setMargins(16, 0, 16, 0);
                ((RobertoTextView) inflate2.findViewById(R.id.tvSingleLine)).setLayoutParams(aVar3);
            }
            linearLayout.addView(inflate2);
        }
        aVar2.f14192x.setOnClickListener(new defpackage.a(this, 21, screenResult30Model2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView recyclerView) {
        View itemView = defpackage.b.e(recyclerView, "parent", R.layout.row_log_6, recyclerView, false);
        kotlin.jvm.internal.i.f(itemView, "itemView");
        return new a(itemView);
    }
}
