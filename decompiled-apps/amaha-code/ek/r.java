package ek;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.ScreenResult10Model;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
/* compiled from: Log10Adapter.kt */
/* loaded from: classes2.dex */
public final class r extends RecyclerView.e<a> {

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<ScreenResult10Model> f14273x;

    /* renamed from: y  reason: collision with root package name */
    public final TemplateActivity f14274y;

    /* compiled from: Log10Adapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final RobertoTextView f14275u;

        /* renamed from: v  reason: collision with root package name */
        public final RobertoTextView f14276v;

        /* renamed from: w  reason: collision with root package name */
        public final LinearLayout f14277w;

        /* renamed from: x  reason: collision with root package name */
        public final CardView f14278x;

        public a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.dateText);
            kotlin.jvm.internal.i.f(findViewById, "itemView.findViewById(R.id.dateText)");
            this.f14275u = (RobertoTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.monthText);
            kotlin.jvm.internal.i.f(findViewById2, "itemView.findViewById(R.id.monthText)");
            this.f14276v = (RobertoTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.linearLayout);
            kotlin.jvm.internal.i.f(findViewById3, "itemView.findViewById(R.id.linearLayout)");
            this.f14277w = (LinearLayout) findViewById3;
            View findViewById4 = view.findViewById(R.id.logCard);
            kotlin.jvm.internal.i.f(findViewById4, "itemView.findViewById(R.id.logCard)");
            this.f14278x = (CardView) findViewById4;
        }
    }

    public r(ArrayList<ScreenResult10Model> goalList, TemplateActivity act) {
        kotlin.jvm.internal.i.g(goalList, "goalList");
        kotlin.jvm.internal.i.g(act, "act");
        this.f14273x = new ArrayList<>();
        this.f14273x = goalList;
        this.f14274y = act;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f14273x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        a aVar2 = aVar;
        ScreenResult10Model screenResult10Model = this.f14273x.get(i6);
        kotlin.jvm.internal.i.f(screenResult10Model, "goalList[position]");
        ScreenResult10Model screenResult10Model2 = screenResult10Model;
        Date w10 = defpackage.c.w(screenResult10Model2.getDate() * 1000);
        String n10 = defpackage.b.n("MMM", w10);
        String n11 = defpackage.b.n("dd", w10);
        aVar2.f14276v.setText(n10);
        aVar2.f14275u.setText(n11);
        LinearLayout linearLayout = aVar2.f14277w;
        linearLayout.removeAllViews();
        TemplateActivity templateActivity = this.f14274y;
        HashMap<String, Object> A0 = templateActivity.A0();
        String B0 = templateActivity.B0();
        ArrayList<String> paramsMapToList = UtilFunKt.paramsMapToList(A0.get(B0.concat("_question_list")));
        View inflate = templateActivity.getLayoutInflater().inflate(R.layout.row_log_vertical_textview, (ViewGroup) linearLayout, false);
        if (!kotlin.jvm.internal.i.b(B0, "s39") && !kotlin.jvm.internal.i.b(B0, "s38")) {
            ((RobertoTextView) inflate.findViewById(R.id.rowQuestion)).setText(paramsMapToList.get(0));
        } else {
            ((RobertoTextView) inflate.findViewById(R.id.rowQuestion)).setText(templateActivity.getString(R.string.worryTimeSubtitle));
        }
        ((RobertoTextView) inflate.findViewById(R.id.rowAnswer)).setText(screenResult10Model2.getText());
        linearLayout.addView(inflate);
        aVar2.f14278x.setOnClickListener(new defpackage.a(this, 12, screenResult10Model2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView recyclerView) {
        View itemView = defpackage.b.e(recyclerView, "parent", R.layout.row_log_6, recyclerView, false);
        kotlin.jvm.internal.i.f(itemView, "itemView");
        return new a(itemView);
    }
}
