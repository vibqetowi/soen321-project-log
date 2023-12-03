package gl;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;
/* compiled from: SymptomsListAdapter.kt */
/* loaded from: classes2.dex */
public final class g extends RecyclerView.e<a> {

    /* renamed from: x  reason: collision with root package name */
    public final List<String> f16611x;

    /* renamed from: y  reason: collision with root package name */
    public final String f16612y = LogHelper.INSTANCE.makeLogTag(g.class);

    /* compiled from: SymptomsListAdapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {
        public a(View view) {
            super(view);
        }
    }

    public g(ArrayList arrayList) {
        this.f16611x = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f16611x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        try {
            ((RobertoTextView) aVar.f2751a.findViewById(R.id.tvSymptomsLabel)).setText(this.f16611x.get(i6));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f16612y, e10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        i.g(parent, "parent");
        return new a(defpackage.e.h(parent, R.layout.row_suggested_activity_symptoms, parent, false, "from(parent.context).inf…_symptoms, parent, false)"));
    }
}
