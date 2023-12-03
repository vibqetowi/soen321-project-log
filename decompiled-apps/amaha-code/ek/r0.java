package ek;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.ScreenResult4Model;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.Date;
/* compiled from: Log4Adapter.kt */
/* loaded from: classes2.dex */
public final class r0 extends RecyclerView.e<a> {

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<ScreenResult4Model> f14279x;

    /* renamed from: y  reason: collision with root package name */
    public final TemplateActivity f14280y;

    /* compiled from: Log4Adapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final RobertoTextView f14281u;

        /* renamed from: v  reason: collision with root package name */
        public final RobertoTextView f14282v;

        /* renamed from: w  reason: collision with root package name */
        public final LinearLayout f14283w;

        /* renamed from: x  reason: collision with root package name */
        public final CardView f14284x;

        public a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.dateText);
            kotlin.jvm.internal.i.f(findViewById, "itemView.findViewById(R.id.dateText)");
            this.f14281u = (RobertoTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.monthText);
            kotlin.jvm.internal.i.f(findViewById2, "itemView.findViewById(R.id.monthText)");
            this.f14282v = (RobertoTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.linearLayout);
            kotlin.jvm.internal.i.f(findViewById3, "itemView.findViewById(R.id.linearLayout)");
            this.f14283w = (LinearLayout) findViewById3;
            View findViewById4 = view.findViewById(R.id.logCard);
            kotlin.jvm.internal.i.f(findViewById4, "itemView.findViewById(R.id.logCard)");
            this.f14284x = (CardView) findViewById4;
        }
    }

    public r0(ArrayList<ScreenResult4Model> goalList, TemplateActivity act) {
        kotlin.jvm.internal.i.g(goalList, "goalList");
        kotlin.jvm.internal.i.g(act, "act");
        this.f14279x = new ArrayList<>();
        this.f14279x = goalList;
        this.f14280y = act;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f14279x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        a aVar2 = aVar;
        ScreenResult4Model screenResult4Model = this.f14279x.get(i6);
        kotlin.jvm.internal.i.f(screenResult4Model, "goalList[position]");
        ScreenResult4Model screenResult4Model2 = screenResult4Model;
        Date w10 = defpackage.c.w(screenResult4Model2.getDate() * 1000);
        String n10 = defpackage.b.n("MMM", w10);
        String n11 = defpackage.b.n("dd", w10);
        aVar2.f14282v.setText(n10);
        aVar2.f14281u.setText(n11);
        LinearLayout linearLayout = aVar2.f14283w;
        linearLayout.removeAllViews();
        TemplateActivity templateActivity = this.f14280y;
        View inflate = templateActivity.getLayoutInflater().inflate(R.layout.row_log_vertical_textview, (ViewGroup) linearLayout, false);
        Object obj = templateActivity.A0().get("r4_sub_heading");
        kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type kotlin.String");
        ((RobertoTextView) inflate.findViewById(R.id.rowQuestion)).setText((String) obj);
        ((RobertoTextView) inflate.findViewById(R.id.rowAnswer)).setText(screenResult4Model2.getText());
        linearLayout.addView(inflate);
        aVar2.f14284x.setOnClickListener(new defpackage.a(this, 25, screenResult4Model2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView recyclerView) {
        View itemView = defpackage.b.e(recyclerView, "parent", R.layout.row_log_6, recyclerView, false);
        kotlin.jvm.internal.i.f(itemView, "itemView");
        return new a(itemView);
    }
}
