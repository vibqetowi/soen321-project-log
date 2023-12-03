package ek;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.ScreenResult6Model;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.Date;
/* compiled from: Log6Adapter.kt */
/* loaded from: classes2.dex */
public final class t0 extends RecyclerView.e<a> {

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<ScreenResult6Model> f14304x;

    /* renamed from: y  reason: collision with root package name */
    public final TemplateActivity f14305y;

    /* compiled from: Log6Adapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final RobertoTextView f14306u;

        /* renamed from: v  reason: collision with root package name */
        public final RobertoTextView f14307v;

        /* renamed from: w  reason: collision with root package name */
        public final LinearLayout f14308w;

        /* renamed from: x  reason: collision with root package name */
        public final CardView f14309x;

        public a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.dateText);
            kotlin.jvm.internal.i.f(findViewById, "itemView.findViewById(R.id.dateText)");
            this.f14306u = (RobertoTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.monthText);
            kotlin.jvm.internal.i.f(findViewById2, "itemView.findViewById(R.id.monthText)");
            this.f14307v = (RobertoTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.linearLayout);
            kotlin.jvm.internal.i.f(findViewById3, "itemView.findViewById(R.id.linearLayout)");
            this.f14308w = (LinearLayout) findViewById3;
            View findViewById4 = view.findViewById(R.id.logCard);
            kotlin.jvm.internal.i.f(findViewById4, "itemView.findViewById(R.id.logCard)");
            this.f14309x = (CardView) findViewById4;
        }
    }

    public t0(ArrayList<ScreenResult6Model> goalList, TemplateActivity act) {
        kotlin.jvm.internal.i.g(goalList, "goalList");
        kotlin.jvm.internal.i.g(act, "act");
        this.f14304x = new ArrayList<>();
        this.f14304x = goalList;
        this.f14305y = act;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f14304x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        String str;
        a aVar2 = aVar;
        ScreenResult6Model screenResult6Model = this.f14304x.get(i6);
        kotlin.jvm.internal.i.f(screenResult6Model, "goalList[position]");
        ScreenResult6Model screenResult6Model2 = screenResult6Model;
        Date w10 = defpackage.c.w(screenResult6Model2.getDate() * 1000);
        String n10 = defpackage.b.n("MMM", w10);
        String n11 = defpackage.b.n("dd", w10);
        aVar2.f14307v.setText(n10);
        aVar2.f14306u.setText(n11);
        TemplateActivity templateActivity = this.f14305y;
        ArrayList<String> paramsMapToList = UtilFunKt.paramsMapToList(templateActivity.A0().get("r6_sub_heading_list"));
        LinearLayout linearLayout = aVar2.f14308w;
        linearLayout.removeAllViews();
        if (paramsMapToList.size() == 1) {
            View inflate = templateActivity.getLayoutInflater().inflate(R.layout.row_log_vertical_textview, (ViewGroup) linearLayout, false);
            ((RobertoTextView) inflate.findViewById(R.id.rowQuestion)).setText(paramsMapToList.get(0));
            ((RobertoTextView) inflate.findViewById(R.id.rowAnswer)).setText(screenResult6Model2.getList().get(screenResult6Model2.getList().size() - 1));
            linearLayout.addView(inflate);
        } else {
            int i10 = 3;
            if (screenResult6Model2.getList().size() < 3) {
                i10 = screenResult6Model2.getList().size();
            }
            for (int i11 = 0; i11 < i10; i11++) {
                View inflate2 = templateActivity.getLayoutInflater().inflate(R.layout.row_log_vertical_textview, (ViewGroup) linearLayout, false);
                RobertoTextView robertoTextView = (RobertoTextView) inflate2.findViewById(R.id.rowQuestion);
                String str2 = "";
                if (i11 >= paramsMapToList.size()) {
                    str = "";
                } else {
                    str = paramsMapToList.get(i11);
                }
                robertoTextView.setText(str);
                RobertoTextView robertoTextView2 = (RobertoTextView) inflate2.findViewById(R.id.rowAnswer);
                if (i11 < screenResult6Model2.getList().size()) {
                    str2 = screenResult6Model2.getList().get(i11);
                }
                robertoTextView2.setText(str2);
                linearLayout.addView(inflate2);
            }
        }
        aVar2.f14309x.setOnClickListener(new defpackage.a(this, 26, screenResult6Model2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView recyclerView) {
        View itemView = defpackage.b.e(recyclerView, "parent", R.layout.row_log_6, recyclerView, false);
        kotlin.jvm.internal.i.f(itemView, "itemView");
        return new a(itemView);
    }
}
