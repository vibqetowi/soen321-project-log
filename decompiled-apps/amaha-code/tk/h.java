package tk;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.TimerTask;
/* compiled from: CommunityEntryPointFragment.kt */
/* loaded from: classes2.dex */
public final class h extends TimerTask {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ c f33188u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ View f33189v;

    public h(View view, c cVar) {
        this.f33188u = cVar;
        this.f33189v = view;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        c cVar = this.f33188u;
        try {
            int i6 = cVar.G + 1;
            cVar.G = i6;
            if (i6 > 3) {
                cVar.G = 0;
            }
            RecyclerView recyclerView = (RecyclerView) this.f33189v.findViewById(R.id.rvCardV2);
            if (recyclerView != null) {
                recyclerView.l0(cVar.G);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(cVar.f33171u, e10);
        }
    }
}
