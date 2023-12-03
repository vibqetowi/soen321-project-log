package op;

import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.TimerTask;
/* compiled from: TeleEntryPointFragment.kt */
/* loaded from: classes2.dex */
public final class d extends TimerTask {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ a f27707u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ a f27708v;

    public d(a aVar, a aVar2) {
        this.f27707u = aVar;
        this.f27708v = aVar2;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView;
        a aVar = this.f27708v;
        a aVar2 = this.f27707u;
        try {
            if (aVar2.isAdded() && !aVar2.isDetached() && (recyclerView = (RecyclerView) aVar._$_findCachedViewById(R.id.tvProviderEntryVar2CardRecycler)) != null) {
                recyclerView.j0(700, 0);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(aVar.f27695v, e10);
        }
    }
}
