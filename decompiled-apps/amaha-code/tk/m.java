package tk;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.TimerTask;
/* compiled from: CommunityEntryPointFragment.kt */
/* loaded from: classes2.dex */
public final class m extends TimerTask {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ c f33197u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.v f33198v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ vk.d f33199w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ View f33200x;

    public m(c cVar, kotlin.jvm.internal.v vVar, vk.d dVar, View view) {
        this.f33197u = cVar;
        this.f33198v = vVar;
        this.f33199w = dVar;
        this.f33200x = view;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        kotlin.jvm.internal.v vVar = this.f33198v;
        c cVar = this.f33197u;
        if (cVar.isAdded()) {
            try {
                cVar.f33174x = true;
                if (vVar.f23467u == this.f33199w.a().size()) {
                    vVar.f23467u = 0;
                }
                RecyclerView recyclerView = (RecyclerView) this.f33200x.findViewById(R.id.rvCommunityCardV3);
                if (recyclerView != null) {
                    int i6 = vVar.f23467u;
                    vVar.f23467u = i6 + 1;
                    recyclerView.l0(i6);
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(cVar.f33171u, "routing exception", e10);
            }
        }
    }
}
