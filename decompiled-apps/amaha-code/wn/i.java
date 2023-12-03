package wn;

import androidx.lifecycle.l0;
import androidx.lifecycle.w;
import com.theinnerhour.b2b.components.multiTracker.model.MultiTrackerFirestoreStatsModel;
import com.theinnerhour.b2b.components.multiTracker.model.MultiTrackerModel;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.List;
import kotlinx.coroutines.flow.x;
/* compiled from: MultiTrackerInsightsViewModel.kt */
/* loaded from: classes2.dex */
public final class i extends l0 {
    public int A;

    /* renamed from: x  reason: collision with root package name */
    public final String f36794x = LogHelper.INSTANCE.makeLogTag("MultiTrackerInsightsVM");

    /* renamed from: y  reason: collision with root package name */
    public final w<List<MultiTrackerModel>> f36795y = new w<>();

    /* renamed from: z  reason: collision with root package name */
    public final x f36796z = tr.r.f(0);
    public final w<MultiTrackerFirestoreStatsModel> B = new w<>();
    public final w<List<MultiTrackerModel>> C = new w<>();
}
