package ek;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.ScreenResultGratitudeModel;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.Date;
/* compiled from: LogGratitudeAdapter.kt */
/* loaded from: classes2.dex */
public final class z0 extends RecyclerView.e<a> {

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<ScreenResultGratitudeModel> f14364x;

    /* renamed from: y  reason: collision with root package name */
    public final Context f14365y;

    /* compiled from: LogGratitudeAdapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final RobertoTextView f14366u;

        /* renamed from: v  reason: collision with root package name */
        public final LinearLayout f14367v;

        public a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.date);
            kotlin.jvm.internal.i.f(findViewById, "itemView.findViewById(R.id.date)");
            this.f14366u = (RobertoTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.logsContainer);
            kotlin.jvm.internal.i.f(findViewById2, "itemView.findViewById(R.id.logsContainer)");
            this.f14367v = (LinearLayout) findViewById2;
        }
    }

    public z0(Context context, ArrayList goalList) {
        kotlin.jvm.internal.i.g(goalList, "goalList");
        this.f14364x = new ArrayList<>();
        this.f14364x = goalList;
        this.f14365y = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f14364x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        boolean z10;
        a aVar2 = aVar;
        ScreenResultGratitudeModel screenResultGratitudeModel = this.f14364x.get(i6);
        kotlin.jvm.internal.i.f(screenResultGratitudeModel, "goalList[position]");
        ScreenResultGratitudeModel screenResultGratitudeModel2 = screenResultGratitudeModel;
        Utils utils = Utils.INSTANCE;
        RobertoTextView robertoTextView = aVar2.f14366u;
        if (utils.getTimeInSeconds() - screenResultGratitudeModel2.getDate() <= 86400) {
            robertoTextView.setText("Today");
        } else {
            long timeInSeconds = utils.getTimeInSeconds() - screenResultGratitudeModel2.getDate();
            if (86401 <= timeInSeconds && timeInSeconds < 172801) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                robertoTextView.setText("Yesterday");
            } else {
                Date w10 = defpackage.c.w(screenResultGratitudeModel2.getDate() * 1000);
                defpackage.c.A(defpackage.b.n("dd", w10), ' ', defpackage.b.n("MMM", w10), robertoTextView);
            }
        }
        int i10 = 0;
        while (i10 < 3) {
            LayoutInflater from = LayoutInflater.from(this.f14365y);
            LinearLayout linearLayout = aVar2.f14367v;
            View inflate = from.inflate(R.layout.row_log_item_new, (ViewGroup) linearLayout, false);
            StringBuilder sb2 = new StringBuilder("Affirmation #");
            int i11 = i10 + 1;
            sb2.append(i11);
            ((RobertoTextView) inflate.findViewById(R.id.title)).setText(sb2.toString());
            ((RobertoTextView) inflate.findViewById(R.id.content)).setText(screenResultGratitudeModel2.getList().get(i10));
            linearLayout.addView(inflate);
            i10 = i11;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView recyclerView) {
        View itemView = defpackage.b.e(recyclerView, "parent", R.layout.row_log_card_new, recyclerView, false);
        kotlin.jvm.internal.i.f(itemView, "itemView");
        return new a(itemView);
    }
}
