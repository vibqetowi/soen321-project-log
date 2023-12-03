package pl;

import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dynamicActivities.fragments.N12CScreenFragment;
import com.theinnerhour.b2b.utils.LogHelper;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f28583u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ N12CScreenFragment f28584v;

    public /* synthetic */ e(N12CScreenFragment n12CScreenFragment, int i6) {
        this.f28583u = i6;
        this.f28584v = n12CScreenFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView;
        int i6 = this.f28583u;
        N12CScreenFragment this$0 = this.f28584v;
        switch (i6) {
            case 0:
                int i10 = N12CScreenFragment.L;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    if (this$0.isAdded() && (recyclerView = (RecyclerView) this$0._$_findCachedViewById(R.id.rvN12CContainer)) != null) {
                        recyclerView.l0(0);
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$0.f10930x, e10);
                    return;
                }
            default:
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    if (this$0.isAdded()) {
                        RecyclerView recyclerView2 = (RecyclerView) this$0._$_findCachedViewById(R.id.rvN12CContainer);
                        if (recyclerView2 != null) {
                            recyclerView2.l0(1);
                        }
                        this$0.I = true;
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    LogHelper.INSTANCE.e(this$0.f10930x, e11);
                    return;
                }
        }
    }
}
