package op;

import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import java.util.TimerTask;
/* compiled from: TeleEntryPointFragment.kt */
/* loaded from: classes2.dex */
public final class b extends TimerTask {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ a f27705u;

    public b(a aVar) {
        this.f27705u = aVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView;
        a aVar = this.f27705u;
        if (aVar.isAdded() && !aVar.isDetached() && (recyclerView = (RecyclerView) aVar._$_findCachedViewById(R.id.tvProviderEntryVar2CardRecycler)) != null) {
            recyclerView.j0(700, 0);
        }
    }
}
