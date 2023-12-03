package ek;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.ScreenResultGroundingModel;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.Date;
/* compiled from: LogGroundingAdapter.kt */
/* loaded from: classes2.dex */
public final class b1 extends RecyclerView.e<a> {

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<ScreenResultGroundingModel> f14076x;

    /* renamed from: y  reason: collision with root package name */
    public final Context f14077y;

    /* compiled from: LogGroundingAdapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final RobertoTextView f14078u;

        /* renamed from: v  reason: collision with root package name */
        public final LinearLayout f14079v;

        public a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.date);
            kotlin.jvm.internal.i.f(findViewById, "itemView.findViewById(R.id.date)");
            this.f14078u = (RobertoTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.logsContainer);
            kotlin.jvm.internal.i.f(findViewById2, "itemView.findViewById(R.id.logsContainer)");
            this.f14079v = (LinearLayout) findViewById2;
        }
    }

    public b1(Context context, ArrayList goalList) {
        kotlin.jvm.internal.i.g(goalList, "goalList");
        this.f14076x = new ArrayList<>();
        this.f14076x = goalList;
        this.f14077y = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f14076x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        boolean z10;
        a aVar2 = aVar;
        ScreenResultGroundingModel screenResultGroundingModel = this.f14076x.get(i6);
        kotlin.jvm.internal.i.f(screenResultGroundingModel, "goalList[position]");
        ScreenResultGroundingModel screenResultGroundingModel2 = screenResultGroundingModel;
        Utils utils = Utils.INSTANCE;
        RobertoTextView robertoTextView = aVar2.f14078u;
        if (utils.getTimeInSeconds() - screenResultGroundingModel2.getDate() <= 86400) {
            robertoTextView.setText("Today");
        } else {
            long timeInSeconds = utils.getTimeInSeconds() - screenResultGroundingModel2.getDate();
            if (86401 <= timeInSeconds && timeInSeconds < 172801) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                robertoTextView.setText("Yesterday");
            } else {
                Date w10 = defpackage.c.w(screenResultGroundingModel2.getDate() * 1000);
                defpackage.c.A(defpackage.b.n("dd", w10), ' ', defpackage.b.n("MMM", w10), robertoTextView);
            }
        }
        Context context = this.f14077y;
        LayoutInflater from = LayoutInflater.from(context);
        LinearLayout linearLayout = aVar2.f14079v;
        View inflate = from.inflate(R.layout.row_log_item_new, (ViewGroup) linearLayout, false);
        ((RobertoTextView) inflate.findViewById(R.id.title)).setText("You were");
        ((RobertoTextView) inflate.findViewById(R.id.content)).setText(screenResultGroundingModel2.getLocation());
        linearLayout.addView(inflate);
        View inflate2 = LayoutInflater.from(context).inflate(R.layout.row_log_item_new, (ViewGroup) linearLayout, false);
        ((RobertoTextView) inflate2.findViewById(R.id.title)).setText("Things you saw");
        ((RobertoTextView) inflate2.findViewById(R.id.content)).setText(is.u.m2(screenResultGroundingModel2.getSeeList(), null, null, null, null, 63));
        linearLayout.addView(inflate2);
        View inflate3 = LayoutInflater.from(context).inflate(R.layout.row_log_item_new, (ViewGroup) linearLayout, false);
        ((RobertoTextView) inflate3.findViewById(R.id.title)).setText("Things you felt");
        ((RobertoTextView) inflate3.findViewById(R.id.content)).setText(is.u.m2(screenResultGroundingModel2.getFeelList(), null, null, null, null, 63));
        linearLayout.addView(inflate3);
        View inflate4 = LayoutInflater.from(context).inflate(R.layout.row_log_item_new, (ViewGroup) linearLayout, false);
        ((RobertoTextView) inflate4.findViewById(R.id.title)).setText("Things you heard");
        ((RobertoTextView) inflate4.findViewById(R.id.content)).setText(is.u.m2(screenResultGroundingModel2.getHearList(), null, null, null, null, 63));
        linearLayout.addView(inflate4);
        View inflate5 = LayoutInflater.from(context).inflate(R.layout.row_log_item_new, (ViewGroup) linearLayout, false);
        ((RobertoTextView) inflate5.findViewById(R.id.title)).setText("Things you smelled");
        ((RobertoTextView) inflate5.findViewById(R.id.content)).setText(is.u.m2(screenResultGroundingModel2.getSmellList(), null, null, null, null, 63));
        linearLayout.addView(inflate5);
        View inflate6 = LayoutInflater.from(context).inflate(R.layout.row_log_item_new, (ViewGroup) linearLayout, false);
        ((RobertoTextView) inflate6.findViewById(R.id.title)).setText("Your Thought");
        ((RobertoTextView) inflate6.findViewById(R.id.content)).setText(screenResultGroundingModel2.getThought());
        linearLayout.addView(inflate6);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView recyclerView) {
        View itemView = defpackage.b.e(recyclerView, "parent", R.layout.row_log_card_new, recyclerView, false);
        kotlin.jvm.internal.i.f(itemView, "itemView");
        return new a(itemView);
    }
}
