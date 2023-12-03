package ek;

import android.content.Context;
import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.SleepCauseSummaryModel;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ImpactOfStressAdapter.java */
/* loaded from: classes2.dex */
public final class o extends RecyclerView.e<a> {

    /* renamed from: x  reason: collision with root package name */
    public final List<SleepCauseSummaryModel> f14231x;

    /* renamed from: y  reason: collision with root package name */
    public final Context f14232y;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f14233z;

    /* compiled from: ImpactOfStressAdapter.java */
    /* loaded from: classes2.dex */
    public class a extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final RobertoTextView f14234u;

        /* renamed from: v  reason: collision with root package name */
        public final CardView f14235v;

        public a(View view) {
            super(view);
            this.f14234u = (RobertoTextView) view.findViewById(R.id.tvTitleText);
            this.f14235v = (CardView) view.findViewById(R.id.cardView);
        }
    }

    public o(boolean z10, ArrayList arrayList, androidx.fragment.app.p pVar) {
        this.f14233z = z10;
        this.f14231x = arrayList;
        this.f14232y = pVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f14231x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        a aVar2 = aVar;
        aVar2.f14234u.setText("" + this.f14231x.get(i6).getTitleText());
        aVar2.f14235v.setOnClickListener(new m(this, i6));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView recyclerView) {
        return new a(defpackage.d.d(recyclerView, R.layout.row_for_impact_of_stress, recyclerView, false));
    }
}
