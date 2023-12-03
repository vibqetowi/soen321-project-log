package ek;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.ScreenResultPleasurableModel;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.Date;
/* compiled from: LogPleasurableAdapter.kt */
/* loaded from: classes2.dex */
public final class c1 extends RecyclerView.e<a> {

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<ScreenResultPleasurableModel> f14089x;

    /* renamed from: y  reason: collision with root package name */
    public final Context f14090y;

    /* compiled from: LogPleasurableAdapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final RobertoTextView f14091u;

        /* renamed from: v  reason: collision with root package name */
        public final LinearLayout f14092v;

        public a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.date);
            kotlin.jvm.internal.i.f(findViewById, "itemView.findViewById(R.id.date)");
            this.f14091u = (RobertoTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.logsContainer);
            kotlin.jvm.internal.i.f(findViewById2, "itemView.findViewById(R.id.logsContainer)");
            this.f14092v = (LinearLayout) findViewById2;
        }
    }

    public c1(Context context, ArrayList goalList) {
        kotlin.jvm.internal.i.g(goalList, "goalList");
        this.f14089x = new ArrayList<>();
        this.f14089x = goalList;
        this.f14090y = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f14089x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        boolean z10;
        a aVar2 = aVar;
        ScreenResultPleasurableModel screenResultPleasurableModel = this.f14089x.get(i6);
        kotlin.jvm.internal.i.f(screenResultPleasurableModel, "goalList[position]");
        ScreenResultPleasurableModel screenResultPleasurableModel2 = screenResultPleasurableModel;
        Utils utils = Utils.INSTANCE;
        RobertoTextView robertoTextView = aVar2.f14091u;
        if (utils.getTimeInSeconds() - screenResultPleasurableModel2.getDate() <= 86400) {
            robertoTextView.setText("Today");
        } else {
            long timeInSeconds = utils.getTimeInSeconds() - screenResultPleasurableModel2.getDate();
            if (86401 <= timeInSeconds && timeInSeconds < 172801) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                robertoTextView.setText("Yesterday");
            } else {
                Date w10 = defpackage.c.w(screenResultPleasurableModel2.getDate() * 1000);
                defpackage.c.A(defpackage.b.n("dd", w10), ' ', defpackage.b.n("MMM", w10), robertoTextView);
            }
        }
        LayoutInflater from = LayoutInflater.from(this.f14090y);
        LinearLayout linearLayout = aVar2.f14092v;
        View inflate = from.inflate(R.layout.row_log_item_new, (ViewGroup) linearLayout, false);
        ((RobertoTextView) inflate.findViewById(R.id.title)).setVisibility(8);
        ((RobertoTextView) inflate.findViewById(R.id.content)).setText(screenResultPleasurableModel2.getLetter());
        linearLayout.addView(inflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView recyclerView) {
        View itemView = defpackage.b.e(recyclerView, "parent", R.layout.row_log_card_new, recyclerView, false);
        kotlin.jvm.internal.i.f(itemView, "itemView");
        return new a(itemView);
    }
}
