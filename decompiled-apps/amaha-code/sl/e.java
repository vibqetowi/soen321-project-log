package sl;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.CircleImageView;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import hs.k;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
import ss.p;
import tl.q;
/* compiled from: ExpertHowItWorkAdapter.kt */
/* loaded from: classes2.dex */
public final class e extends RecyclerView.e<RecyclerView.c0> {
    public final int A;
    public final String B;

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<vl.d> f31662x;

    /* renamed from: y  reason: collision with root package name */
    public final p<vl.d, Integer, k> f31663y;

    /* renamed from: z  reason: collision with root package name */
    public final int f31664z;

    /* compiled from: ExpertHowItWorkAdapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {
        public a(View view) {
            super(view);
        }
    }

    /* compiled from: ExpertHowItWorkAdapter.kt */
    /* loaded from: classes2.dex */
    public final class b extends RecyclerView.c0 {
        public b(View view) {
            super(view);
        }
    }

    public e(Context context, ArrayList list, q.g gVar) {
        i.g(list, "list");
        this.f31662x = list;
        this.f31663y = gVar;
        this.f31664z = 1;
        this.A = 2;
        this.B = LogHelper.INSTANCE.makeLogTag("ExpertHowItWorkAdapter");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f31662x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int h(int i6) {
        if ((i6 + 1) % 2 == 0) {
            return this.A;
        }
        return this.f31664z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(RecyclerView.c0 c0Var, int i6) {
        try {
            int h10 = h(i6);
            int i10 = this.f31664z;
            ArrayList<vl.d> arrayList = this.f31662x;
            if (h10 == i10) {
                View view = ((b) c0Var).f2751a;
                ((RobertoTextView) view.findViewById(R.id.tvExpertLearnUpStepCount)).setText("STEP " + (i6 + 1));
                ((RobertoTextView) view.findViewById(R.id.tvExpertLearnUpTitle)).setText(arrayList.get(i6).f35266a);
                Glide.g(view.getContext()).o(Integer.valueOf(arrayList.get(i6).f35267b)).B((CircleImageView) view.findViewById(R.id.cvExpertLearnUpImage));
            } else {
                View view2 = ((a) c0Var).f2751a;
                ((RobertoTextView) view2.findViewById(R.id.tvExpertLearnDownStepCount)).setText("STEP " + (i6 + 1));
                ((RobertoTextView) view2.findViewById(R.id.tvExpertLearnDownTitle)).setText(arrayList.get(i6).f35266a);
                Glide.g(view2.getContext()).o(Integer.valueOf(arrayList.get(i6).f35267b)).B((CircleImageView) view2.findViewById(R.id.cvExpertLearnDownImage));
            }
            c0Var.f2751a.setOnClickListener(new ak.d(i6, 6, this));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.B, e10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        i.g(parent, "parent");
        if (i6 == this.f31664z) {
            View view = defpackage.d.d(parent, R.layout.layout_expert_info_screen_learn_up, parent, false);
            i.f(view, "view");
            return new b(view);
        }
        View view2 = defpackage.d.d(parent, R.layout.layout_expert_info_screen_learn_down, parent, false);
        i.f(view2, "view");
        return new a(view2);
    }
}
