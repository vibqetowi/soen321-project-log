package ek;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.ScreenResult31Model;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.Date;
/* compiled from: Log31Adapter.kt */
/* loaded from: classes2.dex */
public final class m0 extends RecyclerView.e<a> {

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<ScreenResult31Model> f14212x;

    /* renamed from: y  reason: collision with root package name */
    public final TemplateActivity f14213y;

    /* compiled from: Log31Adapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final RobertoTextView f14214u;

        /* renamed from: v  reason: collision with root package name */
        public final RobertoTextView f14215v;

        /* renamed from: w  reason: collision with root package name */
        public final LinearLayout f14216w;

        /* renamed from: x  reason: collision with root package name */
        public final CardView f14217x;

        public a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.dateText);
            kotlin.jvm.internal.i.f(findViewById, "itemView.findViewById(R.id.dateText)");
            this.f14214u = (RobertoTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.monthText);
            kotlin.jvm.internal.i.f(findViewById2, "itemView.findViewById(R.id.monthText)");
            this.f14215v = (RobertoTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.linearLayout);
            kotlin.jvm.internal.i.f(findViewById3, "itemView.findViewById(R.id.linearLayout)");
            this.f14216w = (LinearLayout) findViewById3;
            View findViewById4 = view.findViewById(R.id.logCard);
            kotlin.jvm.internal.i.f(findViewById4, "itemView.findViewById(R.id.logCard)");
            this.f14217x = (CardView) findViewById4;
        }
    }

    public m0(ArrayList<ScreenResult31Model> goalList, TemplateActivity act) {
        kotlin.jvm.internal.i.g(goalList, "goalList");
        kotlin.jvm.internal.i.g(act, "act");
        this.f14212x = new ArrayList<>();
        this.f14212x = goalList;
        this.f14213y = act;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f14212x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        a aVar2 = aVar;
        ScreenResult31Model screenResult31Model = this.f14212x.get(i6);
        kotlin.jvm.internal.i.f(screenResult31Model, "goalList[position]");
        ScreenResult31Model screenResult31Model2 = screenResult31Model;
        Date w10 = defpackage.c.w(screenResult31Model2.getDate() * 1000);
        String n10 = defpackage.b.n("MMM", w10);
        String n11 = defpackage.b.n("dd", w10);
        aVar2.f14215v.setText(n10);
        aVar2.f14214u.setText(n11);
        LinearLayout linearLayout = aVar2.f14216w;
        linearLayout.removeAllViews();
        TemplateActivity templateActivity = this.f14213y;
        View inflate = templateActivity.getLayoutInflater().inflate(R.layout.row_log_vertical_textview, (ViewGroup) linearLayout, false);
        ((RobertoTextView) inflate.findViewById(R.id.rowQuestion)).setText("Name of the person");
        ((RobertoTextView) inflate.findViewById(R.id.rowAnswer)).setText(screenResult31Model2.getName());
        linearLayout.addView(inflate);
        View inflate2 = templateActivity.getLayoutInflater().inflate(R.layout.row_log_vertical_textview, (ViewGroup) linearLayout, false);
        ((RobertoTextView) inflate2.findViewById(R.id.rowQuestion)).setText("Similarities");
        ((RobertoTextView) inflate2.findViewById(R.id.rowAnswer)).setText(screenResult31Model2.getSelection());
        linearLayout.addView(inflate2);
        aVar2.f14217x.setOnClickListener(new defpackage.a(this, 22, screenResult31Model2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView recyclerView) {
        View itemView = defpackage.b.e(recyclerView, "parent", R.layout.row_log_6, recyclerView, false);
        kotlin.jvm.internal.i.f(itemView, "itemView");
        return new a(itemView);
    }
}
