package wn;

import androidx.lifecycle.w;
import com.theinnerhour.b2b.components.multiTracker.model.MultiTrackerFirestoreStatsModel;
import com.theinnerhour.b2b.components.multiTracker.model.MultiTrackerModel;
import com.theinnerhour.b2b.components.multiTracker.model.UserTrackFirestoreParentModel;
import java.util.ArrayList;
import java.util.List;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements ya.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f36770a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i f36771b;

    public /* synthetic */ c(i iVar, int i6) {
        this.f36770a = i6;
        this.f36771b = iVar;
    }

    @Override // ya.d
    public final void a(ya.h hVar) {
        MultiTrackerFirestoreStatsModel multiTrackerFirestoreStatsModel;
        int i6 = this.f36770a;
        i iVar = this.f36771b;
        switch (i6) {
            case 0:
                if (hVar.isSuccessful()) {
                    w<List<MultiTrackerModel>> wVar = iVar.C;
                    Object result = hVar.getResult();
                    kotlin.jvm.internal.i.f(result, "it.result");
                    ArrayList arrayList = new ArrayList();
                    for (fe.q qVar : (Iterable) result) {
                        MultiTrackerModel multiTrackerModel = (MultiTrackerModel) qVar.d(MultiTrackerModel.class);
                        if (multiTrackerModel != null) {
                            arrayList.add(multiTrackerModel);
                        }
                    }
                    wVar.i(arrayList);
                    return;
                }
                return;
            default:
                if (hVar.isSuccessful()) {
                    w<MultiTrackerFirestoreStatsModel> wVar2 = iVar.B;
                    UserTrackFirestoreParentModel userTrackFirestoreParentModel = (UserTrackFirestoreParentModel) ((fe.g) hVar.getResult()).d(UserTrackFirestoreParentModel.class);
                    if (userTrackFirestoreParentModel != null) {
                        multiTrackerFirestoreStatsModel = userTrackFirestoreParentModel.getMultiTrackerStats();
                    } else {
                        multiTrackerFirestoreStatsModel = null;
                    }
                    wVar2.i(multiTrackerFirestoreStatsModel);
                    return;
                }
                return;
        }
    }
}
