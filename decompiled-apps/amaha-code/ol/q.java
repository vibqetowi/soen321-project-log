package ol;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.List;
/* compiled from: N7AScreenListAdapter.kt */
/* loaded from: classes2.dex */
public final class q extends RecyclerView.e<a> {

    /* renamed from: x  reason: collision with root package name */
    public final List<String> f27679x;

    /* renamed from: y  reason: collision with root package name */
    public final String f27680y = LogHelper.INSTANCE.makeLogTag("N7AScreenListAdapter");

    /* compiled from: N7AScreenListAdapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {
        public a(View view) {
            super(view);
        }
    }

    public q(List<String> list) {
        this.f27679x = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f27679x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        try {
            ((RobertoTextView) aVar.f2751a.findViewById(R.id.tvN7AScreenListTitle)).setText(this.f27679x.get(i6));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f27680y, e10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        kotlin.jvm.internal.i.g(parent, "parent");
        a aVar = new a(defpackage.e.h(parent, R.layout.row_n7a_screen_list_view, parent, false, "from(parent.context)\n   …list_view, parent, false)"));
        aVar.s(false);
        return aVar;
    }
}
