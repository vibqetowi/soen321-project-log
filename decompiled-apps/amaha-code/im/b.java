package im;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;
import com.theinnerhour.b2b.components.inAppFunneling.model.InAppPromptData;
import com.theinnerhour.b2b.components.inAppFunneling.model.InAppPromptModel;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
import ls.h;
/* compiled from: InAppPromptRepository.kt */
/* loaded from: classes2.dex */
public final class b implements ValueEventListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ls.d<ArrayList<InAppPromptData>> f20391u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ DatabaseReference f20392v;

    public b(h hVar, DatabaseReference databaseReference) {
        this.f20391u = hVar;
        this.f20392v = databaseReference;
    }

    @Override // com.google.firebase.database.ValueEventListener
    public final void onCancelled(DatabaseError error) {
        i.g(error, "error");
        this.f20391u.resumeWith(null);
    }

    @Override // com.google.firebase.database.ValueEventListener
    public final void onDataChange(DataSnapshot snapshot) {
        ArrayList<InAppPromptData> promptList;
        i.g(snapshot, "snapshot");
        boolean exists = snapshot.exists();
        ls.d<ArrayList<InAppPromptData>> dVar = this.f20391u;
        if (exists) {
            ArrayList arrayList = new ArrayList();
            InAppPromptModel inAppPromptModel = (InAppPromptModel) snapshot.getValue(InAppPromptModel.class);
            if (inAppPromptModel != null && (promptList = inAppPromptModel.getPromptList()) != null) {
                arrayList.addAll(promptList);
            }
            dVar.resumeWith(arrayList);
            return;
        }
        this.f20392v.setValue(new InAppPromptModel(true, null, 2, null));
        dVar.resumeWith(null);
    }
}
