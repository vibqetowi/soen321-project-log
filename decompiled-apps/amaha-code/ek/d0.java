package ek;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.T8Activity;
import com.theinnerhour.b2b.model.ScreenResult1Model;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.Date;
/* compiled from: Log1StaticAdapter.kt */
/* loaded from: classes2.dex */
public final class d0 extends RecyclerView.e<a> {

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<ScreenResult1Model> f14095x;

    /* renamed from: y  reason: collision with root package name */
    public final T8Activity f14096y;

    /* compiled from: Log1StaticAdapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final RobertoTextView f14097u;

        /* renamed from: v  reason: collision with root package name */
        public final RobertoTextView f14098v;

        /* renamed from: w  reason: collision with root package name */
        public final LinearLayout f14099w;

        /* renamed from: x  reason: collision with root package name */
        public final CardView f14100x;

        public a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.dateText);
            kotlin.jvm.internal.i.f(findViewById, "itemView.findViewById(R.id.dateText)");
            this.f14097u = (RobertoTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.monthText);
            kotlin.jvm.internal.i.f(findViewById2, "itemView.findViewById(R.id.monthText)");
            this.f14098v = (RobertoTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.linearLayout);
            kotlin.jvm.internal.i.f(findViewById3, "itemView.findViewById(R.id.linearLayout)");
            this.f14099w = (LinearLayout) findViewById3;
            View findViewById4 = view.findViewById(R.id.logCard);
            kotlin.jvm.internal.i.f(findViewById4, "itemView.findViewById(R.id.logCard)");
            this.f14100x = (CardView) findViewById4;
        }
    }

    public d0(ArrayList<ScreenResult1Model> goalList, T8Activity t8Activity) {
        kotlin.jvm.internal.i.g(goalList, "goalList");
        this.f14095x = new ArrayList<>();
        this.f14095x = goalList;
        this.f14096y = t8Activity;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f14095x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        String str;
        a aVar2 = aVar;
        ScreenResult1Model screenResult1Model = this.f14095x.get(i6);
        kotlin.jvm.internal.i.f(screenResult1Model, "goalList[position]");
        ScreenResult1Model screenResult1Model2 = screenResult1Model;
        Date w10 = defpackage.c.w(screenResult1Model2.getDate() * 1000);
        String n10 = defpackage.b.n("MMM", w10);
        String n11 = defpackage.b.n("dd", w10);
        aVar2.f14098v.setText(n10);
        aVar2.f14097u.setText(n11);
        LinearLayout linearLayout = aVar2.f14099w;
        linearLayout.removeAllViews();
        int i10 = 3;
        if (screenResult1Model2.getList().size() < 3) {
            i10 = screenResult1Model2.getList().size();
        }
        int i11 = 0;
        while (i11 < i10) {
            View inflate = this.f14096y.getLayoutInflater().inflate(R.layout.row_log_vertical_textview, (ViewGroup) linearLayout, false);
            StringBuilder sb2 = new StringBuilder("Good Thing #");
            int i12 = i11 + 1;
            sb2.append(i12);
            ((RobertoTextView) inflate.findViewById(R.id.rowQuestion)).setText(sb2.toString());
            RobertoTextView robertoTextView = (RobertoTextView) inflate.findViewById(R.id.rowAnswer);
            if (i11 < screenResult1Model2.getList().size()) {
                str = screenResult1Model2.getList().get(i11);
            } else {
                str = "";
            }
            robertoTextView.setText(str);
            linearLayout.addView(inflate);
            i11 = i12;
        }
        aVar2.f14100x.setOnClickListener(new defpackage.a(this, 17, screenResult1Model2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView recyclerView) {
        View itemView = defpackage.b.e(recyclerView, "parent", R.layout.row_log_6, recyclerView, false);
        kotlin.jvm.internal.i.f(itemView, "itemView");
        return new a(itemView);
    }
}
