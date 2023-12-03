package ek;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.GratitudeJournalAnswerModel;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
/* compiled from: LogGratitudeJournalAdapterNew.kt */
/* loaded from: classes2.dex */
public final class a1 extends RecyclerView.e<a> {

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<GratitudeJournalAnswerModel> f14063x;

    /* renamed from: y  reason: collision with root package name */
    public final Context f14064y;

    /* compiled from: LogGratitudeJournalAdapterNew.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final RobertoTextView f14065u;

        /* renamed from: v  reason: collision with root package name */
        public final LinearLayout f14066v;

        public a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.date);
            kotlin.jvm.internal.i.f(findViewById, "itemView.findViewById(R.id.date)");
            this.f14065u = (RobertoTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.logsContainer);
            kotlin.jvm.internal.i.f(findViewById2, "itemView.findViewById(R.id.logsContainer)");
            this.f14066v = (LinearLayout) findViewById2;
        }
    }

    public a1(Context context, ArrayList arrayList) {
        this.f14063x = new ArrayList<>();
        this.f14063x = arrayList;
        this.f14064y = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        a aVar2 = aVar;
        aVar2.f14065u.setVisibility(8);
        ArrayList<GratitudeJournalAnswerModel> arrayList = this.f14063x;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            LayoutInflater from = LayoutInflater.from(this.f14064y);
            LinearLayout linearLayout = aVar2.f14066v;
            View inflate = from.inflate(R.layout.row_log_item_new, (ViewGroup) linearLayout, false);
            ((RobertoTextView) inflate.findViewById(R.id.title)).setVisibility(8);
            ((RobertoTextView) inflate.findViewById(R.id.content)).setText(arrayList.get(i10).getAnswer());
            if (i10 != arrayList.size() - 1) {
                ViewGroup.LayoutParams layoutParams = ((RobertoTextView) inflate.findViewById(R.id.content)).getLayoutParams();
                kotlin.jvm.internal.i.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = 0;
                ((RobertoTextView) inflate.findViewById(R.id.content)).setLayoutParams(marginLayoutParams);
            }
            linearLayout.addView(inflate);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView recyclerView) {
        View itemView = defpackage.b.e(recyclerView, "parent", R.layout.row_log_card_new, recyclerView, false);
        kotlin.jvm.internal.i.f(itemView, "itemView");
        return new a(itemView);
    }
}
