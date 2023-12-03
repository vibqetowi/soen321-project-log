package ek;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.ScreenResultGoodthingsModel;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.Date;
/* compiled from: LogGoodThingsAdapter.kt */
/* loaded from: classes2.dex */
public final class x0 extends RecyclerView.e<a> {

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<ScreenResultGoodthingsModel> f14344x;

    /* renamed from: y  reason: collision with root package name */
    public final Context f14345y;

    /* compiled from: LogGoodThingsAdapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final RobertoTextView f14346u;

        /* renamed from: v  reason: collision with root package name */
        public final LinearLayout f14347v;

        public a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.date);
            kotlin.jvm.internal.i.f(findViewById, "itemView.findViewById(R.id.date)");
            this.f14346u = (RobertoTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.logsContainer);
            kotlin.jvm.internal.i.f(findViewById2, "itemView.findViewById(R.id.logsContainer)");
            this.f14347v = (LinearLayout) findViewById2;
        }
    }

    public x0(Context context, ArrayList goalList) {
        kotlin.jvm.internal.i.g(goalList, "goalList");
        this.f14344x = new ArrayList<>();
        this.f14344x = goalList;
        this.f14345y = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f14344x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        boolean z10;
        a aVar2 = aVar;
        ScreenResultGoodthingsModel screenResultGoodthingsModel = this.f14344x.get(i6);
        kotlin.jvm.internal.i.f(screenResultGoodthingsModel, "goalList[position]");
        ScreenResultGoodthingsModel screenResultGoodthingsModel2 = screenResultGoodthingsModel;
        Utils utils = Utils.INSTANCE;
        RobertoTextView robertoTextView = aVar2.f14346u;
        if (utils.getTimeInSeconds() - screenResultGoodthingsModel2.getDate() <= 86400) {
            robertoTextView.setText("Today");
        } else {
            long timeInSeconds = utils.getTimeInSeconds() - screenResultGoodthingsModel2.getDate();
            if (86401 <= timeInSeconds && timeInSeconds < 172801) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                robertoTextView.setText("Yesterday");
            } else {
                Date w10 = defpackage.c.w(screenResultGoodthingsModel2.getDate() * 1000);
                defpackage.c.A(defpackage.b.n("dd", w10), ' ', defpackage.b.n("MMM", w10), robertoTextView);
            }
        }
        Context context = this.f14345y;
        LayoutInflater from = LayoutInflater.from(context);
        LinearLayout linearLayout = aVar2.f14347v;
        View inflate = from.inflate(R.layout.row_log_item_new, (ViewGroup) linearLayout, false);
        ((RobertoTextView) inflate.findViewById(R.id.title)).setText("First Good Thing");
        ((RobertoTextView) inflate.findViewById(R.id.content)).setText(screenResultGoodthingsModel2.getGoodThingOne());
        linearLayout.addView(inflate);
        View inflate2 = LayoutInflater.from(context).inflate(R.layout.row_log_item_new, (ViewGroup) linearLayout, false);
        ((RobertoTextView) inflate2.findViewById(R.id.title)).setText("Second Good Thing");
        ((RobertoTextView) inflate2.findViewById(R.id.content)).setText(screenResultGoodthingsModel2.getGoodThingTwo());
        linearLayout.addView(inflate2);
        View inflate3 = LayoutInflater.from(context).inflate(R.layout.row_log_item_new, (ViewGroup) linearLayout, false);
        ((RobertoTextView) inflate3.findViewById(R.id.title)).setText("Third Good Thing");
        ((RobertoTextView) inflate3.findViewById(R.id.content)).setText(screenResultGoodthingsModel2.getGoodThingThree());
        linearLayout.addView(inflate3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView recyclerView) {
        View itemView = defpackage.b.e(recyclerView, "parent", R.layout.row_log_card_new, recyclerView, false);
        kotlin.jvm.internal.i.f(itemView, "itemView");
        return new a(itemView);
    }
}
