package sn;

import ak.d;
import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g0.a;
import hs.k;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
import ss.l;
import tn.e;
/* compiled from: TrackerActivitiesAdapter.kt */
/* loaded from: classes2.dex */
public final class a extends RecyclerView.e<C0540a> {
    public final l<String, k> A;
    public final ArrayList<String> B = new ArrayList<>();

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<String> f31770x;

    /* renamed from: y  reason: collision with root package name */
    public final Context f31771y;

    /* renamed from: z  reason: collision with root package name */
    public final int f31772z;

    /* compiled from: TrackerActivitiesAdapter.kt */
    /* renamed from: sn.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public final class C0540a extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final RobertoTextView f31773u;

        /* renamed from: v  reason: collision with root package name */
        public final AppCompatImageView f31774v;

        public C0540a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.activityTitle);
            i.f(findViewById, "itemView.findViewById(R.id.activityTitle)");
            this.f31773u = (RobertoTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.activityCheck);
            i.f(findViewById2, "itemView.findViewById(R.id.activityCheck)");
            this.f31774v = (AppCompatImageView) findViewById2;
        }
    }

    public a(ArrayList arrayList, Context context, int i6, e.a aVar) {
        this.f31770x = arrayList;
        this.f31771y = context;
        this.f31772z = i6;
        this.A = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f31770x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(C0540a c0540a, int i6) {
        C0540a c0540a2 = c0540a;
        ArrayList<String> arrayList = this.f31770x;
        c0540a2.f31773u.setText(arrayList.get(i6));
        String str = arrayList.get(i6);
        i.f(str, "activityList[position]");
        int A = sp.b.A(str);
        AppCompatImageView appCompatImageView = c0540a2.f31774v;
        appCompatImageView.setImageResource(A);
        boolean contains = this.B.contains(arrayList.get(i6));
        Context context = this.f31771y;
        if (contains) {
            Object obj = g0.a.f16164a;
            appCompatImageView.setBackground(a.c.b(context, this.f31772z));
        } else {
            Object obj2 = g0.a.f16164a;
            appCompatImageView.setBackground(a.c.b(context, R.drawable.ic_tracker_circle_empty));
        }
        appCompatImageView.setOnClickListener(new d(i6, 14, this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView recyclerView) {
        View itemView = defpackage.b.e(recyclerView, "parent", R.layout.row_multi_tracker_activities, recyclerView, false);
        i.f(itemView, "itemView");
        return new C0540a(itemView);
    }
}
