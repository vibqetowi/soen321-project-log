package an;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.components.libraryExperiment.model.LibraryCollection;
import com.theinnerhour.b2b.utils.LogHelper;
/* compiled from: LibraryHomeFragment.kt */
/* loaded from: classes2.dex */
public final class z extends RecyclerView.r {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t f816a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a0 f817b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ LibraryCollection f818c;

    public z(t tVar, a0 a0Var, LibraryCollection libraryCollection) {
        this.f816a = tVar;
        this.f817b = a0Var;
        this.f818c = libraryCollection;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void a(int i6, RecyclerView recyclerView) {
        int i10;
        View d10;
        LibraryCollection libraryCollection = this.f818c;
        t tVar = this.f816a;
        kotlin.jvm.internal.i.g(recyclerView, "recyclerView");
        if (i6 == 0) {
            try {
                a0 a0Var = this.f817b;
                a0Var.getClass();
                try {
                    RecyclerView.m layoutManager = recyclerView.getLayoutManager();
                    i10 = -1;
                    if (layoutManager != null && (d10 = a0Var.d(layoutManager)) != null) {
                        i10 = layoutManager.getPosition(d10);
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(a0Var.f.f775u, e10);
                    i10 = 0;
                }
                int i11 = 6;
                if (libraryCollection.getItemList().size() <= 6) {
                    i11 = libraryCollection.getItemList().size();
                }
                int i12 = t.f770g0;
                tVar.Q(i10, i11);
            } catch (Exception e11) {
                LogHelper.INSTANCE.e(tVar.f775u, e11);
            }
        }
    }
}
