package ek;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.ScreenResult3Model;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.Date;
/* compiled from: Log3Adapter.kt */
/* loaded from: classes2.dex */
public final class p0 extends RecyclerView.e<a> {

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<ScreenResult3Model> f14256x;

    /* renamed from: y  reason: collision with root package name */
    public final TemplateActivity f14257y;

    /* compiled from: Log3Adapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final RobertoTextView f14258u;

        /* renamed from: v  reason: collision with root package name */
        public final RobertoTextView f14259v;

        /* renamed from: w  reason: collision with root package name */
        public final LinearLayout f14260w;

        /* renamed from: x  reason: collision with root package name */
        public final CardView f14261x;

        public a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.dateText);
            kotlin.jvm.internal.i.f(findViewById, "itemView.findViewById(R.id.dateText)");
            this.f14258u = (RobertoTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.monthText);
            kotlin.jvm.internal.i.f(findViewById2, "itemView.findViewById(R.id.monthText)");
            this.f14259v = (RobertoTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.linearLayout);
            kotlin.jvm.internal.i.f(findViewById3, "itemView.findViewById(R.id.linearLayout)");
            this.f14260w = (LinearLayout) findViewById3;
            View findViewById4 = view.findViewById(R.id.logCard);
            kotlin.jvm.internal.i.f(findViewById4, "itemView.findViewById(R.id.logCard)");
            this.f14261x = (CardView) findViewById4;
        }
    }

    public p0(ArrayList<ScreenResult3Model> goalList, TemplateActivity act) {
        kotlin.jvm.internal.i.g(goalList, "goalList");
        kotlin.jvm.internal.i.g(act, "act");
        this.f14256x = new ArrayList<>();
        this.f14256x = goalList;
        this.f14257y = act;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f14256x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        String str;
        a aVar2 = aVar;
        ScreenResult3Model screenResult3Model = this.f14256x.get(i6);
        kotlin.jvm.internal.i.f(screenResult3Model, "goalList[position]");
        ScreenResult3Model screenResult3Model2 = screenResult3Model;
        Date w10 = defpackage.c.w(screenResult3Model2.getDate() * 1000);
        String n10 = defpackage.b.n("MMM", w10);
        String n11 = defpackage.b.n("dd", w10);
        aVar2.f14259v.setText(n10);
        aVar2.f14258u.setText(n11);
        TemplateActivity templateActivity = this.f14257y;
        ArrayList<String> paramsMapToList = UtilFunKt.paramsMapToList(templateActivity.A0().get("s142_question_list"));
        LinearLayout linearLayout = aVar2.f14260w;
        linearLayout.removeAllViews();
        int i10 = 3;
        if (screenResult3Model2.getList().size() < 3) {
            i10 = screenResult3Model2.getList().size();
        }
        for (int i11 = 0; i11 < i10; i11++) {
            View inflate = templateActivity.getLayoutInflater().inflate(R.layout.row_log_vertical_textview, (ViewGroup) linearLayout, false);
            ((RobertoTextView) inflate.findViewById(R.id.rowQuestion)).setText(paramsMapToList.get(i11));
            RobertoTextView robertoTextView = (RobertoTextView) inflate.findViewById(R.id.rowAnswer);
            if (i11 < screenResult3Model2.getList().size()) {
                str = screenResult3Model2.getList().get(i11);
            } else {
                str = "";
            }
            robertoTextView.setText(str);
            linearLayout.addView(inflate);
        }
        aVar2.f14261x.setOnClickListener(new defpackage.a(this, 24, screenResult3Model2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView recyclerView) {
        View itemView = defpackage.b.e(recyclerView, "parent", R.layout.row_log_6, recyclerView, false);
        kotlin.jvm.internal.i.f(itemView, "itemView");
        return new a(itemView);
    }
}
