package ek;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.ScreenResult1Model;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.Date;
/* compiled from: Log1Adapter.kt */
/* loaded from: classes2.dex */
public final class b0 extends RecyclerView.e<a> {

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<ScreenResult1Model> f14070x;

    /* renamed from: y  reason: collision with root package name */
    public final TemplateActivity f14071y;

    /* compiled from: Log1Adapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final RobertoTextView f14072u;

        /* renamed from: v  reason: collision with root package name */
        public final RobertoTextView f14073v;

        /* renamed from: w  reason: collision with root package name */
        public final LinearLayout f14074w;

        /* renamed from: x  reason: collision with root package name */
        public final CardView f14075x;

        public a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.dateText);
            kotlin.jvm.internal.i.f(findViewById, "itemView.findViewById(R.id.dateText)");
            this.f14072u = (RobertoTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.monthText);
            kotlin.jvm.internal.i.f(findViewById2, "itemView.findViewById(R.id.monthText)");
            this.f14073v = (RobertoTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.linearLayout);
            kotlin.jvm.internal.i.f(findViewById3, "itemView.findViewById(R.id.linearLayout)");
            this.f14074w = (LinearLayout) findViewById3;
            View findViewById4 = view.findViewById(R.id.logCard);
            kotlin.jvm.internal.i.f(findViewById4, "itemView.findViewById(R.id.logCard)");
            this.f14075x = (CardView) findViewById4;
        }
    }

    public b0(ArrayList<ScreenResult1Model> goalList, TemplateActivity act) {
        kotlin.jvm.internal.i.g(goalList, "goalList");
        kotlin.jvm.internal.i.g(act, "act");
        this.f14070x = new ArrayList<>();
        this.f14070x = goalList;
        this.f14071y = act;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f14070x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        String str;
        a aVar2 = aVar;
        ScreenResult1Model screenResult1Model = this.f14070x.get(i6);
        kotlin.jvm.internal.i.f(screenResult1Model, "goalList[position]");
        ScreenResult1Model screenResult1Model2 = screenResult1Model;
        Date w10 = defpackage.c.w(screenResult1Model2.getDate() * 1000);
        String n10 = defpackage.b.n("MMM", w10);
        String n11 = defpackage.b.n("dd", w10);
        aVar2.f14073v.setText(n10);
        aVar2.f14072u.setText(n11);
        LinearLayout linearLayout = aVar2.f14074w;
        linearLayout.removeAllViews();
        int i10 = 3;
        if (screenResult1Model2.getHeadings().size() < 3) {
            i10 = screenResult1Model2.getHeadings().size();
        }
        for (int i11 = 0; i11 < i10; i11++) {
            View inflate = this.f14071y.getLayoutInflater().inflate(R.layout.row_log_vertical_textview, (ViewGroup) linearLayout, false);
            RobertoTextView robertoTextView = (RobertoTextView) inflate.findViewById(R.id.rowQuestion);
            String str2 = "";
            if (i11 >= screenResult1Model2.getHeadings().size()) {
                str = "";
            } else {
                str = screenResult1Model2.getHeadings().get(i11);
            }
            robertoTextView.setText(str);
            RobertoTextView robertoTextView2 = (RobertoTextView) inflate.findViewById(R.id.rowAnswer);
            if (i11 < screenResult1Model2.getList().size()) {
                str2 = screenResult1Model2.getList().get(i11);
            }
            robertoTextView2.setText(str2);
            linearLayout.addView(inflate);
        }
        aVar2.f14075x.setOnClickListener(new defpackage.a(this, 16, screenResult1Model2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView recyclerView) {
        View itemView = defpackage.b.e(recyclerView, "parent", R.layout.row_log_6, recyclerView, false);
        kotlin.jvm.internal.i.f(itemView, "itemView");
        return new a(itemView);
    }
}
