package ek;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.GoalType;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
/* compiled from: ActivitySelectionAdapter.java */
/* loaded from: classes2.dex */
public final class e extends RecyclerView.e<b> {
    public final HashSet<String> A;
    public final String B = defpackage.c.n();
    public final List<GoalType> C;
    public final a D;

    /* renamed from: x  reason: collision with root package name */
    public final Activity f14105x;

    /* renamed from: y  reason: collision with root package name */
    public List<GoalType> f14106y;

    /* renamed from: z  reason: collision with root package name */
    public final LayoutInflater f14107z;

    /* compiled from: ActivitySelectionAdapter.java */
    /* loaded from: classes2.dex */
    public interface a {
        void u(int i6);
    }

    /* compiled from: ActivitySelectionAdapter.java */
    /* loaded from: classes2.dex */
    public class b extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final RobertoTextView f14108u;

        /* renamed from: v  reason: collision with root package name */
        public final AppCompatImageView f14109v;

        public b(View view) {
            super(view);
            this.f14108u = (RobertoTextView) view.findViewById(R.id.text);
            this.f14109v = (AppCompatImageView) view.findViewById(R.id.image);
        }
    }

    public e(androidx.fragment.app.p pVar, HashSet hashSet, List list, a aVar) {
        this.f14106y = new ArrayList();
        this.A = new HashSet<>();
        this.C = new ArrayList();
        this.f14105x = pVar;
        this.A = hashSet;
        this.C = list;
        this.f14106y = list;
        this.f14107z = (LayoutInflater) pVar.getSystemService("layout_inflater");
        this.D = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f14106y.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(b bVar, int i6) {
        b bVar2 = bVar;
        GoalType goalType = this.f14106y.get(i6);
        bVar2.f14108u.setText(goalType.getGoalName());
        boolean contains = this.A.contains(goalType.getGoalId());
        AppCompatImageView appCompatImageView = bVar2.f14109v;
        if (contains) {
            appCompatImageView.setImageResource(R.drawable.ic_minus);
        } else {
            appCompatImageView.setImageResource(R.drawable.ic_plus);
        }
        appCompatImageView.setOnClickListener(new d(this, goalType));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView recyclerView) {
        return new b(this.f14107z.inflate(R.layout.row_activity_scheduling, (ViewGroup) recyclerView, false));
    }

    public final void v(CharSequence charSequence) {
        int length = charSequence.length();
        a aVar = this.D;
        List<GoalType> list = this.C;
        if (length > 0) {
            ArrayList arrayList = new ArrayList();
            for (GoalType goalType : list) {
                if (goalType.getGoalName().toLowerCase().contains(charSequence.toString().toLowerCase())) {
                    arrayList.add(goalType);
                }
            }
            aVar.u(arrayList.size());
            this.f14106y = arrayList;
            i();
            return;
        }
        aVar.u(list.size());
        this.f14106y = list;
        i();
    }
}
