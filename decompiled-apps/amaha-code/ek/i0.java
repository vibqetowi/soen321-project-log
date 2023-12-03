package ek;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.ScreenResult28Model;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
/* compiled from: Log28Adapter.kt */
/* loaded from: classes2.dex */
public final class i0 extends RecyclerView.e<a> {

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<ScreenResult28Model> f14164x;

    /* renamed from: y  reason: collision with root package name */
    public final TemplateActivity f14165y;

    /* compiled from: Log28Adapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final RobertoTextView f14166u;

        /* renamed from: v  reason: collision with root package name */
        public final RobertoTextView f14167v;

        /* renamed from: w  reason: collision with root package name */
        public final LinearLayout f14168w;

        /* renamed from: x  reason: collision with root package name */
        public final CardView f14169x;

        public a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.dateText);
            kotlin.jvm.internal.i.f(findViewById, "itemView.findViewById(R.id.dateText)");
            this.f14166u = (RobertoTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.monthText);
            kotlin.jvm.internal.i.f(findViewById2, "itemView.findViewById(R.id.monthText)");
            this.f14167v = (RobertoTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.linearLayout);
            kotlin.jvm.internal.i.f(findViewById3, "itemView.findViewById(R.id.linearLayout)");
            this.f14168w = (LinearLayout) findViewById3;
            View findViewById4 = view.findViewById(R.id.logCard);
            kotlin.jvm.internal.i.f(findViewById4, "itemView.findViewById(R.id.logCard)");
            this.f14169x = (CardView) findViewById4;
        }
    }

    public i0(ArrayList<ScreenResult28Model> goalList, TemplateActivity act) {
        kotlin.jvm.internal.i.g(goalList, "goalList");
        kotlin.jvm.internal.i.g(act, "act");
        this.f14164x = new ArrayList<>();
        this.f14164x = goalList;
        this.f14165y = act;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f14164x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        a aVar2 = aVar;
        ScreenResult28Model screenResult28Model = this.f14164x.get(i6);
        kotlin.jvm.internal.i.f(screenResult28Model, "goalList[position]");
        ScreenResult28Model screenResult28Model2 = screenResult28Model;
        Date w10 = defpackage.c.w(screenResult28Model2.getDate() * 1000);
        String n10 = defpackage.b.n("MMM", w10);
        String n11 = defpackage.b.n("dd", w10);
        aVar2.f14167v.setText(n10);
        aVar2.f14166u.setText(n11);
        LinearLayout linearLayout = aVar2.f14168w;
        linearLayout.removeAllViews();
        TemplateActivity templateActivity = this.f14165y;
        View inflate = templateActivity.getLayoutInflater().inflate(R.layout.row_log_vertical_textview, (ViewGroup) linearLayout, false);
        ((RobertoTextView) inflate.findViewById(R.id.rowQuestion)).setText("Situation that's worrying you");
        ((RobertoTextView) inflate.findViewById(R.id.rowAnswer)).setText(screenResult28Model2.getSituation());
        linearLayout.addView(inflate);
        HashMap<String, Object> A0 = templateActivity.A0();
        ArrayList arrayList = new ArrayList();
        arrayList.add(UtilFunKt.paramsMapToString(A0.get("s122_two_question")));
        arrayList.add(UtilFunKt.paramsMapToString(A0.get("s122_three_question")));
        arrayList.add(UtilFunKt.paramsMapToString(A0.get("s122_four_question")));
        Iterator<String> it = screenResult28Model2.getAnswers().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            int i11 = i10 + 1;
            View inflate2 = templateActivity.getLayoutInflater().inflate(R.layout.row_log_vertical_textview, (ViewGroup) linearLayout, false);
            ((RobertoTextView) inflate2.findViewById(R.id.rowQuestion)).setText((CharSequence) arrayList.get(i10));
            ((RobertoTextView) inflate2.findViewById(R.id.rowAnswer)).setText(it.next());
            linearLayout.addView(inflate2);
            i10 = i11;
        }
        aVar2.f14169x.setOnClickListener(new defpackage.a(this, 20, screenResult28Model2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView recyclerView) {
        View itemView = defpackage.b.e(recyclerView, "parent", R.layout.row_log_6, recyclerView, false);
        kotlin.jvm.internal.i.f(itemView, "itemView");
        return new a(itemView);
    }
}
