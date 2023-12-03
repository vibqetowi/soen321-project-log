package ek;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.ScreenResult14Model;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
/* compiled from: Log14Adapter.kt */
/* loaded from: classes2.dex */
public final class x extends RecyclerView.e<a> {

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<ScreenResult14Model> f14336x;

    /* renamed from: y  reason: collision with root package name */
    public final TemplateActivity f14337y;

    /* compiled from: Log14Adapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {
        public final RobertoTextView A;
        public final RobertoTextView B;

        /* renamed from: u  reason: collision with root package name */
        public final RobertoTextView f14338u;

        /* renamed from: v  reason: collision with root package name */
        public final RobertoTextView f14339v;

        /* renamed from: w  reason: collision with root package name */
        public final LinearLayout f14340w;

        /* renamed from: x  reason: collision with root package name */
        public final LinearLayout f14341x;

        /* renamed from: y  reason: collision with root package name */
        public final CardView f14342y;

        /* renamed from: z  reason: collision with root package name */
        public final RobertoTextView f14343z;

        public a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.dateText);
            kotlin.jvm.internal.i.f(findViewById, "itemView.findViewById(R.id.dateText)");
            this.f14338u = (RobertoTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.monthText);
            kotlin.jvm.internal.i.f(findViewById2, "itemView.findViewById(R.id.monthText)");
            this.f14339v = (RobertoTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.linearLayoutPros);
            kotlin.jvm.internal.i.f(findViewById3, "itemView.findViewById(R.id.linearLayoutPros)");
            this.f14340w = (LinearLayout) findViewById3;
            View findViewById4 = view.findViewById(R.id.linearLayoutCons);
            kotlin.jvm.internal.i.f(findViewById4, "itemView.findViewById(R.id.linearLayoutCons)");
            this.f14341x = (LinearLayout) findViewById4;
            View findViewById5 = view.findViewById(R.id.logCard);
            kotlin.jvm.internal.i.f(findViewById5, "itemView.findViewById(R.id.logCard)");
            this.f14342y = (CardView) findViewById5;
            View findViewById6 = view.findViewById(R.id.tvStatement);
            kotlin.jvm.internal.i.f(findViewById6, "itemView.findViewById(R.id.tvStatement)");
            this.f14343z = (RobertoTextView) findViewById6;
            View findViewById7 = view.findViewById(R.id.tvPros);
            kotlin.jvm.internal.i.f(findViewById7, "itemView.findViewById(R.id.tvPros)");
            this.A = (RobertoTextView) findViewById7;
            View findViewById8 = view.findViewById(R.id.tvCons);
            kotlin.jvm.internal.i.f(findViewById8, "itemView.findViewById(R.id.tvCons)");
            this.B = (RobertoTextView) findViewById8;
        }
    }

    public x(ArrayList<ScreenResult14Model> goalList, TemplateActivity act) {
        kotlin.jvm.internal.i.g(goalList, "goalList");
        kotlin.jvm.internal.i.g(act, "act");
        this.f14336x = new ArrayList<>();
        this.f14336x = goalList;
        this.f14337y = act;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f14336x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        int i10;
        int i11;
        int i12;
        String str;
        a aVar2 = aVar;
        ScreenResult14Model screenResult14Model = this.f14336x.get(i6);
        kotlin.jvm.internal.i.f(screenResult14Model, "goalList[position]");
        ScreenResult14Model screenResult14Model2 = screenResult14Model;
        Date w10 = defpackage.c.w(screenResult14Model2.getDate() * 1000);
        String n10 = defpackage.b.n("MMM", w10);
        String n11 = defpackage.b.n("dd", w10);
        aVar2.f14339v.setText(n10);
        aVar2.f14338u.setText(n11);
        TemplateActivity templateActivity = this.f14337y;
        HashMap<String, Object> A0 = templateActivity.A0();
        aVar2.f14343z.setText(screenResult14Model2.getStatement());
        Object obj = A0.get("r14_pros_text");
        kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type kotlin.String");
        RobertoTextView robertoTextView = aVar2.B;
        robertoTextView.setText((String) obj);
        Object obj2 = A0.get("r14_cons_text");
        kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type kotlin.String");
        RobertoTextView robertoTextView2 = aVar2.A;
        robertoTextView2.setText((String) obj2);
        LinearLayout linearLayout = aVar2.f14341x;
        linearLayout.removeAllViews();
        LinearLayout linearLayout2 = aVar2.f14340w;
        linearLayout2.removeAllViews();
        if (screenResult14Model2.getPros().size() < 3) {
            i10 = screenResult14Model2.getPros().size();
        } else {
            i10 = 3;
        }
        boolean z10 = false;
        int i13 = 0;
        while (true) {
            i11 = R.layout.row_single_text;
            String str2 = "";
            if (i13 >= i10) {
                break;
            }
            View inflate = templateActivity.getLayoutInflater().inflate(R.layout.row_single_text, linearLayout2, z10);
            RobertoTextView robertoTextView3 = (RobertoTextView) inflate.findViewById(R.id.tvSingleLine);
            if (i13 < screenResult14Model2.getPros().size()) {
                str2 = screenResult14Model2.getPros().get(i13).getText();
            }
            robertoTextView3.setText(str2);
            ViewGroup.LayoutParams layoutParams = ((RobertoTextView) inflate.findViewById(R.id.tvSingleLine)).getLayoutParams();
            kotlin.jvm.internal.i.e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.a aVar3 = (ConstraintLayout.a) layoutParams;
            aVar3.setMargins(16, 0, 16, 0);
            ((RobertoTextView) inflate.findViewById(R.id.tvSingleLine)).setLayoutParams(aVar3);
            linearLayout2.addView(inflate);
            i13++;
            z10 = false;
        }
        if (screenResult14Model2.getCons().size() < 3) {
            i12 = screenResult14Model2.getCons().size();
        } else {
            i12 = 3;
        }
        int i14 = 0;
        while (i14 < i12) {
            View inflate2 = templateActivity.getLayoutInflater().inflate(i11, (ViewGroup) linearLayout, false);
            RobertoTextView robertoTextView4 = (RobertoTextView) inflate2.findViewById(R.id.tvSingleLine);
            if (i14 >= screenResult14Model2.getCons().size()) {
                str = "";
            } else {
                str = screenResult14Model2.getCons().get(i14).getText();
            }
            robertoTextView4.setText(str);
            ViewGroup.LayoutParams layoutParams2 = ((RobertoTextView) inflate2.findViewById(R.id.tvSingleLine)).getLayoutParams();
            kotlin.jvm.internal.i.e(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.a aVar4 = (ConstraintLayout.a) layoutParams2;
            aVar4.setMargins(16, 0, 16, 0);
            ((RobertoTextView) inflate2.findViewById(R.id.tvSingleLine)).setLayoutParams(aVar4);
            linearLayout.addView(inflate2);
            i14++;
            i11 = R.layout.row_single_text;
            templateActivity = templateActivity;
        }
        if (linearLayout.getChildCount() == 0) {
            linearLayout.setVisibility(8);
            robertoTextView.setVisibility(8);
        }
        if (linearLayout2.getChildCount() == 0) {
            linearLayout2.setVisibility(8);
            robertoTextView2.setVisibility(8);
        }
        aVar2.f14342y.setOnClickListener(new defpackage.a(this, 14, screenResult14Model2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView recyclerView) {
        View itemView = defpackage.b.e(recyclerView, "parent", R.layout.row_log_14, recyclerView, false);
        kotlin.jvm.internal.i.f(itemView, "itemView");
        return new a(itemView);
    }
}
