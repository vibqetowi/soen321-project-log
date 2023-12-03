package em;

import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import fe.g;
import fe.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.i;
import ls.h;
/* compiled from: GoalsNotificationUtils.kt */
/* loaded from: classes2.dex */
public final class a<TResult> implements ya.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ls.d<List<FirestoreGoal>> f14395a;

    public a(h hVar) {
        this.f14395a = hVar;
    }

    @Override // ya.d
    public final void a(ya.h<r> it) {
        i.g(it, "it");
        boolean isSuccessful = it.isSuccessful();
        ls.d<List<FirestoreGoal>> dVar = this.f14395a;
        if (isSuccessful) {
            ArrayList e10 = it.getResult().e();
            ArrayList arrayList = new ArrayList();
            Iterator it2 = e10.iterator();
            while (it2.hasNext()) {
                FirestoreGoal firestoreGoal = (FirestoreGoal) ((g) it2.next()).d(FirestoreGoal.class);
                if (firestoreGoal != null) {
                    arrayList.add(firestoreGoal);
                }
            }
            dVar.resumeWith(arrayList);
            return;
        }
        dVar.resumeWith(null);
    }
}
