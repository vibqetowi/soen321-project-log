package ek;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.ScreenResultPositiveQualities;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.Date;
/* compiled from: LogPositiveQualitiesAdapter.kt */
/* loaded from: classes2.dex */
public final class d1 extends RecyclerView.e<a> {

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<ScreenResultPositiveQualities> f14101x;

    /* renamed from: y  reason: collision with root package name */
    public final Context f14102y;

    /* compiled from: LogPositiveQualitiesAdapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final RobertoTextView f14103u;

        /* renamed from: v  reason: collision with root package name */
        public final LinearLayout f14104v;

        public a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.date);
            kotlin.jvm.internal.i.f(findViewById, "itemView.findViewById(R.id.date)");
            this.f14103u = (RobertoTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.logsContainer);
            kotlin.jvm.internal.i.f(findViewById2, "itemView.findViewById(R.id.logsContainer)");
            this.f14104v = (LinearLayout) findViewById2;
        }
    }

    public d1(Context context, ArrayList goalList) {
        kotlin.jvm.internal.i.g(goalList, "goalList");
        this.f14101x = new ArrayList<>();
        this.f14101x = goalList;
        this.f14102y = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f14101x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        boolean z10;
        a aVar2 = aVar;
        ScreenResultPositiveQualities screenResultPositiveQualities = this.f14101x.get(i6);
        kotlin.jvm.internal.i.f(screenResultPositiveQualities, "goalList[position]");
        ScreenResultPositiveQualities screenResultPositiveQualities2 = screenResultPositiveQualities;
        Utils utils = Utils.INSTANCE;
        RobertoTextView robertoTextView = aVar2.f14103u;
        if (utils.getTimeInSeconds() - screenResultPositiveQualities2.getDate() <= 86400) {
            robertoTextView.setText("Today");
        } else {
            long timeInSeconds = utils.getTimeInSeconds() - screenResultPositiveQualities2.getDate();
            if (86401 <= timeInSeconds && timeInSeconds < 172801) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                robertoTextView.setText("Yesterday");
            } else {
                Date w10 = defpackage.c.w(screenResultPositiveQualities2.getDate() * 1000);
                defpackage.c.A(defpackage.b.n("dd", w10), ' ', defpackage.b.n("MMM", w10), robertoTextView);
            }
        }
        Context context = this.f14102y;
        LayoutInflater from = LayoutInflater.from(context);
        LinearLayout linearLayout = aVar2.f14104v;
        View inflate = from.inflate(R.layout.row_log_item_new, (ViewGroup) linearLayout, false);
        ((RobertoTextView) inflate.findViewById(R.id.title)).setText("You have displayed \"" + screenResultPositiveQualities2.getQualityOne() + "\" at \"" + screenResultPositiveQualities2.getPlaceOne() + "\" by...");
        ((RobertoTextView) inflate.findViewById(R.id.content)).setText(screenResultPositiveQualities2.getTaskOne());
        linearLayout.addView(inflate);
        View inflate2 = LayoutInflater.from(context).inflate(R.layout.row_log_item_new, (ViewGroup) linearLayout, false);
        ((RobertoTextView) inflate2.findViewById(R.id.title)).setText("You have displayed \"" + screenResultPositiveQualities2.getQualityTwo() + "\" at \"" + screenResultPositiveQualities2.getPlaceTwo() + "\" by...");
        ((RobertoTextView) inflate2.findViewById(R.id.content)).setText(screenResultPositiveQualities2.getTaskTwo());
        linearLayout.addView(inflate2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView recyclerView) {
        View itemView = defpackage.b.e(recyclerView, "parent", R.layout.row_log_card_new, recyclerView, false);
        kotlin.jvm.internal.i.f(itemView, "itemView");
        return new a(itemView);
    }
}
