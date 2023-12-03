package ek;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.ScreenResult9Model;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.Date;
/* compiled from: Log9Adapter.kt */
/* loaded from: classes2.dex */
public final class v0 extends RecyclerView.e<a> {

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<ScreenResult9Model> f14323x;

    /* renamed from: y  reason: collision with root package name */
    public final TemplateActivity f14324y;

    /* compiled from: Log9Adapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final RobertoTextView f14325u;

        /* renamed from: v  reason: collision with root package name */
        public final RobertoTextView f14326v;

        /* renamed from: w  reason: collision with root package name */
        public final LinearLayout f14327w;

        /* renamed from: x  reason: collision with root package name */
        public final CardView f14328x;

        public a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.dateText);
            kotlin.jvm.internal.i.f(findViewById, "itemView.findViewById(R.id.dateText)");
            this.f14325u = (RobertoTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.monthText);
            kotlin.jvm.internal.i.f(findViewById2, "itemView.findViewById(R.id.monthText)");
            this.f14326v = (RobertoTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.linearLayout);
            kotlin.jvm.internal.i.f(findViewById3, "itemView.findViewById(R.id.linearLayout)");
            this.f14327w = (LinearLayout) findViewById3;
            View findViewById4 = view.findViewById(R.id.logCard);
            kotlin.jvm.internal.i.f(findViewById4, "itemView.findViewById(R.id.logCard)");
            this.f14328x = (CardView) findViewById4;
        }
    }

    public v0(ArrayList<ScreenResult9Model> goalList, TemplateActivity act) {
        kotlin.jvm.internal.i.g(goalList, "goalList");
        kotlin.jvm.internal.i.g(act, "act");
        this.f14323x = new ArrayList<>();
        this.f14323x = goalList;
        this.f14324y = act;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f14323x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        String str;
        a aVar2 = aVar;
        ScreenResult9Model screenResult9Model = this.f14323x.get(i6);
        kotlin.jvm.internal.i.f(screenResult9Model, "goalList[position]");
        ScreenResult9Model screenResult9Model2 = screenResult9Model;
        Date w10 = defpackage.c.w(screenResult9Model2.getDate() * 1000);
        String n10 = defpackage.b.n("MMM", w10);
        String n11 = defpackage.b.n("dd", w10);
        aVar2.f14326v.setText(n10);
        aVar2.f14325u.setText(n11);
        TemplateActivity templateActivity = this.f14324y;
        ArrayList<String> paramsMapToList = UtilFunKt.paramsMapToList(templateActivity.A0().get("r9_statement_list"));
        LinearLayout linearLayout = aVar2.f14327w;
        linearLayout.removeAllViews();
        int i10 = 3;
        if (screenResult9Model2.getList().size() < 3) {
            i10 = screenResult9Model2.getList().size();
        }
        for (int i11 = 0; i11 < i10; i11++) {
            View inflate = templateActivity.getLayoutInflater().inflate(R.layout.row_log_vertical_textview, (ViewGroup) linearLayout, false);
            RobertoTextView robertoTextView = (RobertoTextView) inflate.findViewById(R.id.rowQuestion);
            String str2 = "";
            if (i11 >= paramsMapToList.size()) {
                str = "";
            } else {
                str = paramsMapToList.get(i11);
            }
            robertoTextView.setText(str);
            RobertoTextView robertoTextView2 = (RobertoTextView) inflate.findViewById(R.id.rowAnswer);
            if (i11 < screenResult9Model2.getList().size()) {
                str2 = screenResult9Model2.getList().get(i11);
            }
            robertoTextView2.setText(str2);
            linearLayout.addView(inflate);
        }
        aVar2.f14328x.setOnClickListener(new defpackage.a(this, 27, screenResult9Model2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView recyclerView) {
        View itemView = defpackage.b.e(recyclerView, "parent", R.layout.row_log_6, recyclerView, false);
        kotlin.jvm.internal.i.f(itemView, "itemView");
        return new a(itemView);
    }
}
