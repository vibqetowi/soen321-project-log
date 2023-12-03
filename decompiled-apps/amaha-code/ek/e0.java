package ek;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.ScreenResult21Model;
import com.theinnerhour.b2b.model.UrgentImportantModel;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
/* compiled from: Log21Adapter.kt */
/* loaded from: classes2.dex */
public final class e0 extends RecyclerView.e<a> {

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<ScreenResult21Model> f14110x;

    /* renamed from: y  reason: collision with root package name */
    public final TemplateActivity f14111y;

    /* compiled from: Log21Adapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {
        public final RobertoTextView A;
        public final RobertoTextView B;
        public final RobertoTextView C;
        public final RobertoTextView D;
        public final LinearLayout E;
        public final CardView F;

        /* renamed from: u  reason: collision with root package name */
        public final RobertoTextView f14112u;

        /* renamed from: v  reason: collision with root package name */
        public final RobertoTextView f14113v;

        /* renamed from: w  reason: collision with root package name */
        public final LinearLayout f14114w;

        /* renamed from: x  reason: collision with root package name */
        public final LinearLayout f14115x;

        /* renamed from: y  reason: collision with root package name */
        public final LinearLayout f14116y;

        /* renamed from: z  reason: collision with root package name */
        public final LinearLayout f14117z;

        public a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.dateText);
            kotlin.jvm.internal.i.f(findViewById, "itemView.findViewById(R.id.dateText)");
            this.f14112u = (RobertoTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.monthText);
            kotlin.jvm.internal.i.f(findViewById2, "itemView.findViewById(R.id.monthText)");
            this.f14113v = (RobertoTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.llOne);
            kotlin.jvm.internal.i.f(findViewById3, "itemView.findViewById(R.id.llOne)");
            this.f14114w = (LinearLayout) findViewById3;
            View findViewById4 = view.findViewById(R.id.llTwo);
            kotlin.jvm.internal.i.f(findViewById4, "itemView.findViewById(R.id.llTwo)");
            this.f14115x = (LinearLayout) findViewById4;
            View findViewById5 = view.findViewById(R.id.llThree);
            kotlin.jvm.internal.i.f(findViewById5, "itemView.findViewById(R.id.llThree)");
            this.f14116y = (LinearLayout) findViewById5;
            View findViewById6 = view.findViewById(R.id.llFour);
            kotlin.jvm.internal.i.f(findViewById6, "itemView.findViewById(R.id.llFour)");
            this.f14117z = (LinearLayout) findViewById6;
            View findViewById7 = view.findViewById(R.id.heading1);
            kotlin.jvm.internal.i.f(findViewById7, "itemView.findViewById(R.id.heading1)");
            this.A = (RobertoTextView) findViewById7;
            View findViewById8 = view.findViewById(R.id.heading2);
            kotlin.jvm.internal.i.f(findViewById8, "itemView.findViewById(R.id.heading2)");
            this.B = (RobertoTextView) findViewById8;
            View findViewById9 = view.findViewById(R.id.heading3);
            kotlin.jvm.internal.i.f(findViewById9, "itemView.findViewById(R.id.heading3)");
            this.C = (RobertoTextView) findViewById9;
            View findViewById10 = view.findViewById(R.id.heading4);
            kotlin.jvm.internal.i.f(findViewById10, "itemView.findViewById(R.id.heading4)");
            this.D = (RobertoTextView) findViewById10;
            View findViewById11 = view.findViewById(R.id.linearLayout);
            kotlin.jvm.internal.i.f(findViewById11, "itemView.findViewById(R.id.linearLayout)");
            this.E = (LinearLayout) findViewById11;
            View findViewById12 = view.findViewById(R.id.logCard);
            kotlin.jvm.internal.i.f(findViewById12, "itemView.findViewById(R.id.logCard)");
            this.F = (CardView) findViewById12;
        }
    }

    public e0(ArrayList<ScreenResult21Model> goalList, TemplateActivity act) {
        kotlin.jvm.internal.i.g(goalList, "goalList");
        kotlin.jvm.internal.i.g(act, "act");
        this.f14110x = new ArrayList<>();
        this.f14110x = goalList;
        this.f14111y = act;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f14110x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        a aVar2 = aVar;
        ScreenResult21Model screenResult21Model = this.f14110x.get(i6);
        kotlin.jvm.internal.i.f(screenResult21Model, "goalList[position]");
        ScreenResult21Model screenResult21Model2 = screenResult21Model;
        Date w10 = defpackage.c.w(screenResult21Model2.getDate() * 1000);
        String n10 = defpackage.b.n("MMM", w10);
        String n11 = defpackage.b.n("dd", w10);
        aVar2.f14113v.setText(n10);
        aVar2.f14112u.setText(n11);
        LinearLayout linearLayout = aVar2.f14114w;
        linearLayout.removeAllViews();
        LinearLayout linearLayout2 = aVar2.f14115x;
        linearLayout2.removeAllViews();
        LinearLayout linearLayout3 = aVar2.f14116y;
        linearLayout3.removeAllViews();
        LinearLayout linearLayout4 = aVar2.f14117z;
        linearLayout4.removeAllViews();
        Iterator<UrgentImportantModel> it = screenResult21Model2.getItems().iterator();
        while (it.hasNext()) {
            UrgentImportantModel next = it.next();
            TemplateActivity templateActivity = this.f14111y;
            kotlin.jvm.internal.i.d(templateActivity);
            View inflate = templateActivity.getLayoutInflater().inflate(R.layout.row_single_text, (ViewGroup) aVar2.E, false);
            kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
            ((RobertoTextView) constraintLayout.findViewById(R.id.tvSingleLine)).setText(next.getText());
            ViewGroup.LayoutParams layoutParams = ((RobertoTextView) constraintLayout.findViewById(R.id.tvSingleLine)).getLayoutParams();
            kotlin.jvm.internal.i.e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.a aVar3 = (ConstraintLayout.a) layoutParams;
            aVar3.setMargins(16, 0, 16, 0);
            ((RobertoTextView) constraintLayout.findViewById(R.id.tvSingleLine)).setLayoutParams(aVar3);
            if (next.getImportant() && next.getUrgent()) {
                if (linearLayout.getChildCount() < 2) {
                    linearLayout.addView(constraintLayout);
                }
            } else if (next.getImportant() && !next.getUrgent()) {
                if (linearLayout2.getChildCount() < 2) {
                    linearLayout2.addView(constraintLayout);
                }
            } else if (!next.getImportant() && next.getUrgent()) {
                if (linearLayout3.getChildCount() < 2) {
                    linearLayout3.addView(constraintLayout);
                }
            } else if (linearLayout4.getChildCount() < 2) {
                linearLayout4.addView(constraintLayout);
            }
        }
        String heading1 = screenResult21Model2.getHeading1();
        RobertoTextView robertoTextView = aVar2.A;
        robertoTextView.setText(heading1);
        String heading2 = screenResult21Model2.getHeading2();
        RobertoTextView robertoTextView2 = aVar2.B;
        robertoTextView2.setText(heading2);
        String heading3 = screenResult21Model2.getHeading3();
        RobertoTextView robertoTextView3 = aVar2.C;
        robertoTextView3.setText(heading3);
        String heading4 = screenResult21Model2.getHeading4();
        RobertoTextView robertoTextView4 = aVar2.D;
        robertoTextView4.setText(heading4);
        if (linearLayout.getChildCount() == 0) {
            linearLayout.setVisibility(8);
            robertoTextView.setVisibility(8);
        }
        if (linearLayout2.getChildCount() == 0) {
            linearLayout2.setVisibility(8);
            robertoTextView2.setVisibility(8);
        }
        if (linearLayout3.getChildCount() == 0) {
            linearLayout3.setVisibility(8);
            robertoTextView3.setVisibility(8);
        }
        if (linearLayout4.getChildCount() == 0) {
            linearLayout4.setVisibility(8);
            robertoTextView4.setVisibility(8);
        }
        aVar2.F.setOnClickListener(new defpackage.a(this, 18, screenResult21Model2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView recyclerView) {
        View itemView = defpackage.b.e(recyclerView, "parent", R.layout.row_log_21, recyclerView, false);
        kotlin.jvm.internal.i.f(itemView, "itemView");
        return new a(itemView);
    }
}
