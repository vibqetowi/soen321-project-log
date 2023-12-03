package mo;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;
import com.theinnerhour.b2b.model.CoachModel;
import com.theinnerhour.b2b.model.CoachModelTracker;
import com.theinnerhour.b2b.utils.LogHelper;
import is.w;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.j;
import kotlinx.coroutines.k;
/* compiled from: ProDashboardRepository.kt */
/* loaded from: classes2.dex */
public final class f implements ValueEventListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ j<hs.f<? extends List<CoachModelTracker>, Integer>> f25663u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ a f25664v;

    public f(a aVar, k kVar) {
        this.f25663u = kVar;
        this.f25664v = aVar;
    }

    @Override // com.google.firebase.database.ValueEventListener
    public final void onCancelled(DatabaseError error) {
        i.g(error, "error");
        LogHelper logHelper = LogHelper.INSTANCE;
        String str = this.f25664v.f25647a;
        String message = error.getMessage();
        i.f(message, "error.message");
        logHelper.e(str, message);
        j<hs.f<? extends List<CoachModelTracker>, Integer>> jVar = this.f25663u;
        if (jVar.a()) {
            jVar.resumeWith(new hs.f(w.f20676u, 0));
        }
    }

    @Override // com.google.firebase.database.ValueEventListener
    public final void onDataChange(DataSnapshot snapshot) {
        CoachModel coachModel;
        ArrayList<CoachModelTracker> trackers;
        boolean z10;
        i.g(snapshot, "snapshot");
        boolean exists = snapshot.exists();
        j<hs.f<? extends List<CoachModelTracker>, Integer>> jVar = this.f25663u;
        if (exists) {
            if (jVar.a() && (coachModel = (CoachModel) snapshot.getValue(CoachModel.class)) != null && (trackers = coachModel.getTrackers()) != null) {
                this.f25664v.getClass();
                long timeInMillis = Calendar.getInstance().getTimeInMillis() / 1000;
                ArrayList arrayList = new ArrayList();
                for (Object obj : trackers) {
                    CoachModelTracker coachModelTracker = (CoachModelTracker) obj;
                    if (coachModelTracker.getStartDate().getTime() <= timeInMillis && coachModelTracker.getEndDate().getTime() >= timeInMillis) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        arrayList.add(obj);
                    }
                }
                jVar.resumeWith(new hs.f(arrayList, Integer.valueOf(trackers.size())));
            }
        } else if (jVar.a()) {
            jVar.resumeWith(new hs.f(w.f20676u, 0));
        }
    }
}
