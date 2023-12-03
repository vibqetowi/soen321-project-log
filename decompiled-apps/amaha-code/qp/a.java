package qp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import kotlin.jvm.internal.i;
/* compiled from: DashboardProviderEntryPointLoaderAdapter.kt */
/* loaded from: classes2.dex */
public final class a extends RecyclerView.e<RecyclerView.c0> {

    /* renamed from: x  reason: collision with root package name */
    public final boolean f29984x;

    /* compiled from: DashboardProviderEntryPointLoaderAdapter.kt */
    /* renamed from: qp.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public final class C0508a extends RecyclerView.c0 {
        public C0508a(View view) {
            super(view);
        }
    }

    public a(boolean z10) {
        this.f29984x = z10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return 3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        int i10;
        i.g(parent, "parent");
        LayoutInflater from = LayoutInflater.from(parent.getContext());
        if (this.f29984x) {
            i10 = R.layout.row_db_provider_loader_1;
        } else {
            i10 = R.layout.row_db_provider_loader_2;
        }
        View inflate = from.inflate(i10, (ViewGroup) parent, false);
        i.f(inflate, "from(parent.context).inf…_loader_2, parent, false)");
        return new C0508a(inflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(RecyclerView.c0 c0Var, int i6) {
    }
}
