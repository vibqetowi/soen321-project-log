package ol;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dynamicActivities.data.N18AListModel;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g0.a;
import java.util.ArrayList;
import java.util.List;
/* compiled from: N18AScreenListAdapter.kt */
/* loaded from: classes2.dex */
public final class d extends RecyclerView.e<a> {
    public final String A = LogHelper.INSTANCE.makeLogTag("N18AScreenListAdapter");

    /* renamed from: x  reason: collision with root package name */
    public final List<N18AListModel> f27619x;

    /* renamed from: y  reason: collision with root package name */
    public final ss.l<N18AListModel, hs.k> f27620y;

    /* renamed from: z  reason: collision with root package name */
    public N18AListModel f27621z;

    /* compiled from: N18AScreenListAdapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {
        public a(View view) {
            super(view);
        }
    }

    public d(ArrayList arrayList, ss.l lVar, N18AListModel n18AListModel) {
        this.f27619x = arrayList;
        this.f27620y = lVar;
        this.f27621z = n18AListModel;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f27619x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        boolean z10;
        a aVar2 = aVar;
        try {
            N18AListModel n18AListModel = this.f27621z;
            List<N18AListModel> list = this.f27619x;
            if (n18AListModel != null) {
                z10 = kotlin.jvm.internal.i.b(n18AListModel, list.get(i6));
            } else {
                z10 = false;
            }
            View view = aVar2.f2751a;
            ((RobertoTextView) view.findViewById(R.id.tvN18ARowDuration)).setText(list.get(i6).getDuration());
            ((RobertoTextView) view.findViewById(R.id.tvN18ARowSubText)).setText(list.get(i6).getSubText());
            if (z10) {
                Context context = view.getContext();
                Object obj = g0.a.f16164a;
                view.setBackground(a.c.b(context, R.drawable.background_curved_8dp_green));
            } else {
                Context context2 = view.getContext();
                Object obj2 = g0.a.f16164a;
                view.setBackground(a.c.b(context2, R.drawable.background_stroke_8dp_grey));
            }
            view.setOnClickListener(new ak.d(i6, 5, this));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.A, e10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        kotlin.jvm.internal.i.g(parent, "parent");
        return new a(defpackage.e.h(parent, R.layout.row_n18a_screen_list_view, parent, false, "from(parent.context).inf…list_view, parent, false)"));
    }
}
