package ek;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.T5Activity;
import com.theinnerhour.b2b.model.ScreenResult10Model;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.Date;
/* compiled from: Log38StaticAdapter.kt */
/* loaded from: classes2.dex */
public final class o0 extends RecyclerView.e<a> {
    public final String A;

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<ScreenResult10Model> f14236x;

    /* renamed from: y  reason: collision with root package name */
    public final T5Activity f14237y;

    /* renamed from: z  reason: collision with root package name */
    public final ArrayList<String> f14238z;

    /* compiled from: Log38StaticAdapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final RobertoTextView f14239u;

        /* renamed from: v  reason: collision with root package name */
        public final RobertoTextView f14240v;

        /* renamed from: w  reason: collision with root package name */
        public final LinearLayout f14241w;

        /* renamed from: x  reason: collision with root package name */
        public final CardView f14242x;

        public a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.dateText);
            kotlin.jvm.internal.i.f(findViewById, "itemView.findViewById(R.id.dateText)");
            this.f14239u = (RobertoTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.monthText);
            kotlin.jvm.internal.i.f(findViewById2, "itemView.findViewById(R.id.monthText)");
            this.f14240v = (RobertoTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.linearLayout);
            kotlin.jvm.internal.i.f(findViewById3, "itemView.findViewById(R.id.linearLayout)");
            this.f14241w = (LinearLayout) findViewById3;
            View findViewById4 = view.findViewById(R.id.logCard);
            kotlin.jvm.internal.i.f(findViewById4, "itemView.findViewById(R.id.logCard)");
            this.f14242x = (CardView) findViewById4;
        }
    }

    public o0(ArrayList<ScreenResult10Model> goalList, T5Activity t5Activity, ArrayList<String> arrayList, String resultKey) {
        kotlin.jvm.internal.i.g(goalList, "goalList");
        kotlin.jvm.internal.i.g(resultKey, "resultKey");
        this.f14236x = new ArrayList<>();
        this.f14238z = new ArrayList<>();
        this.A = "";
        this.f14236x = goalList;
        this.f14237y = t5Activity;
        this.f14238z = arrayList;
        this.A = resultKey;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f14236x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        a aVar2 = aVar;
        ScreenResult10Model screenResult10Model = this.f14236x.get(i6);
        kotlin.jvm.internal.i.f(screenResult10Model, "goalList[position]");
        ScreenResult10Model screenResult10Model2 = screenResult10Model;
        Date w10 = defpackage.c.w(screenResult10Model2.getDate() * 1000);
        String n10 = defpackage.b.n("MMM", w10);
        String n11 = defpackage.b.n("dd", w10);
        aVar2.f14240v.setText(n10);
        aVar2.f14239u.setText(n11);
        LinearLayout linearLayout = aVar2.f14241w;
        linearLayout.removeAllViews();
        View inflate = this.f14237y.getLayoutInflater().inflate(R.layout.row_log_vertical_textview, (ViewGroup) linearLayout, false);
        ((RobertoTextView) inflate.findViewById(R.id.rowQuestion)).setText(this.f14238z.get(0));
        ((RobertoTextView) inflate.findViewById(R.id.rowAnswer)).setText(screenResult10Model2.getText());
        linearLayout.addView(inflate);
        aVar2.f14242x.setOnClickListener(new defpackage.a(this, 23, screenResult10Model2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView recyclerView) {
        View itemView = defpackage.b.e(recyclerView, "parent", R.layout.row_log_6, recyclerView, false);
        kotlin.jvm.internal.i.f(itemView, "itemView");
        return new a(itemView);
    }
}
