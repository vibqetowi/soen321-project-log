package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.T8Activity;
import com.theinnerhour.b2b.model.ScreenResult6Model;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.Date;
import kotlin.jvm.internal.i;
/* compiled from: Log6StaticAdapter.kt */
/* renamed from: f  reason: default package */
/* loaded from: classes.dex */
public final class f extends RecyclerView.e<a> {
    public final String A;

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<ScreenResult6Model> f14591x;

    /* renamed from: y  reason: collision with root package name */
    public final T8Activity f14592y;

    /* renamed from: z  reason: collision with root package name */
    public final ArrayList<String> f14593z;

    /* compiled from: Log6StaticAdapter.kt */
    /* renamed from: f$a */
    /* loaded from: classes.dex */
    public final class a extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final RobertoTextView f14594u;

        /* renamed from: v  reason: collision with root package name */
        public final RobertoTextView f14595v;

        /* renamed from: w  reason: collision with root package name */
        public final LinearLayout f14596w;

        /* renamed from: x  reason: collision with root package name */
        public final CardView f14597x;

        public a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.dateText);
            i.f(findViewById, "itemView.findViewById(R.id.dateText)");
            this.f14594u = (RobertoTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.monthText);
            i.f(findViewById2, "itemView.findViewById(R.id.monthText)");
            this.f14595v = (RobertoTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.linearLayout);
            i.f(findViewById3, "itemView.findViewById(R.id.linearLayout)");
            this.f14596w = (LinearLayout) findViewById3;
            View findViewById4 = view.findViewById(R.id.logCard);
            i.f(findViewById4, "itemView.findViewById(R.id.logCard)");
            this.f14597x = (CardView) findViewById4;
        }
    }

    public f(ArrayList<ScreenResult6Model> goalList, T8Activity t8Activity, ArrayList<String> arrayList, String str) {
        i.g(goalList, "goalList");
        this.f14591x = new ArrayList<>();
        this.f14593z = new ArrayList<>();
        this.A = "";
        this.f14591x = goalList;
        this.f14592y = t8Activity;
        this.f14593z = arrayList;
        this.A = str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f14591x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        String str;
        a aVar2 = aVar;
        ScreenResult6Model screenResult6Model = this.f14591x.get(i6);
        i.f(screenResult6Model, "goalList[position]");
        ScreenResult6Model screenResult6Model2 = screenResult6Model;
        Date w10 = c.w(screenResult6Model2.getDate() * 1000);
        String n10 = b.n("MMM", w10);
        String n11 = b.n("dd", w10);
        aVar2.f14595v.setText(n10);
        aVar2.f14594u.setText(n11);
        LinearLayout linearLayout = aVar2.f14596w;
        linearLayout.removeAllViews();
        ArrayList<String> arrayList = this.f14593z;
        int size = arrayList.size();
        T8Activity t8Activity = this.f14592y;
        if (size == 1) {
            View inflate = t8Activity.getLayoutInflater().inflate(R.layout.row_log_vertical_textview, (ViewGroup) linearLayout, false);
            ((RobertoTextView) inflate.findViewById(R.id.rowQuestion)).setText(arrayList.get(0));
            ((RobertoTextView) inflate.findViewById(R.id.rowAnswer)).setText(screenResult6Model2.getList().get(screenResult6Model2.getList().size() - 1));
            linearLayout.addView(inflate);
        } else {
            int i10 = 3;
            if (screenResult6Model2.getList().size() < 3) {
                i10 = screenResult6Model2.getList().size();
            }
            for (int i11 = 0; i11 < i10; i11++) {
                View inflate2 = t8Activity.getLayoutInflater().inflate(R.layout.row_log_vertical_textview, (ViewGroup) linearLayout, false);
                RobertoTextView robertoTextView = (RobertoTextView) inflate2.findViewById(R.id.rowQuestion);
                String str2 = "";
                if (i11 >= arrayList.size()) {
                    str = "";
                } else {
                    str = arrayList.get(i11);
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
        aVar2.f14597x.setOnClickListener(new defpackage.a(this, 0, screenResult6Model2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView recyclerView) {
        View itemView = b.e(recyclerView, "parent", R.layout.row_log_6, recyclerView, false);
        i.f(itemView, "itemView");
        return new a(itemView);
    }
}
