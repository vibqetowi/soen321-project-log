package mo;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;
import com.theinnerhour.b2b.components.pro.dashboard.model.ProCoachModel;
import com.theinnerhour.b2b.components.pro.tracker.model.CoachModelMultiTracker;
import com.theinnerhour.b2b.model.CoachModel;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import e4.l;
import is.w;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import kotlinx.coroutines.j;
import kotlinx.coroutines.k;
import org.json.JSONObject;
import sf.i;
/* compiled from: ProDashboardRepository.kt */
/* loaded from: classes2.dex */
public final class d implements l.b, ValueEventListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ j f25659u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ a f25660v;

    public /* synthetic */ d(a aVar, k kVar) {
        this.f25659u = kVar;
        this.f25660v = aVar;
    }

    @Override // e4.l.b
    public void a(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        j jVar = this.f25659u;
        try {
            if (jVar.a()) {
                jVar.resumeWith(new i().b(ProCoachModel.class, jSONObject.toString()));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f25660v.f25647a, "exception in my therapist response", e10);
            if (jVar.a()) {
                jVar.resumeWith(null);
            }
        }
    }

    @Override // com.google.firebase.database.ValueEventListener
    public void onCancelled(DatabaseError error) {
        kotlin.jvm.internal.i.g(error, "error");
        LogHelper logHelper = LogHelper.INSTANCE;
        String str = this.f25660v.f25647a;
        String message = error.getMessage();
        kotlin.jvm.internal.i.f(message, "error.message");
        logHelper.e(str, message);
        j jVar = this.f25659u;
        if (jVar.a()) {
            Boolean bool = Boolean.FALSE;
            jVar.resumeWith(new hs.f(bool, bool));
        }
    }

    @Override // com.google.firebase.database.ValueEventListener
    public void onDataChange(DataSnapshot snapshot) {
        Iterable iterable;
        boolean z10;
        boolean z11;
        kotlin.jvm.internal.i.g(snapshot, "snapshot");
        boolean exists = snapshot.exists();
        j jVar = this.f25659u;
        if (exists) {
            if (jVar.a()) {
                CoachModel coachModel = (CoachModel) snapshot.getValue(CoachModel.class);
                if (coachModel == null || (iterable = coachModel.getMultiTrackers()) == null) {
                    iterable = w.f20676u;
                }
                this.f25660v.getClass();
                long timeInMillis = Calendar.getInstance().getTimeInMillis() / 1000;
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (true) {
                    z10 = false;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    CoachModelMultiTracker coachModelMultiTracker = (CoachModelMultiTracker) next;
                    if (coachModelMultiTracker.getStartDate().getTime() <= timeInMillis && coachModelMultiTracker.getEndDate().getTime() >= timeInMillis) {
                        z10 = true;
                    }
                    if (z10) {
                        arrayList.add(next);
                    }
                }
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (((CoachModelMultiTracker) it2.next()).getStartDate().getTime() == Utils.INSTANCE.getTodayTimeInSeconds()) {
                            z11 = true;
                            continue;
                        } else {
                            z11 = false;
                            continue;
                        }
                        if (z11) {
                            z10 = true;
                            break;
                        }
                    }
                }
                jVar.resumeWith(new hs.f(Boolean.valueOf(!arrayList.isEmpty()), Boolean.valueOf(z10)));
            }
        } else if (jVar.a()) {
            Boolean bool = Boolean.FALSE;
            jVar.resumeWith(new hs.f(bool, bool));
        }
    }
}
