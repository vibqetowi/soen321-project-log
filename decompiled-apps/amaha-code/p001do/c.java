package p001do;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;
import com.theinnerhour.b2b.components.onboarding.model.UserOnboardingModel;
import kotlin.jvm.internal.i;
/* compiled from: MatchingFlowRepository.kt */
/* renamed from: do.c  reason: invalid package */
/* loaded from: classes2.dex */
public final class c implements ValueEventListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ DatabaseReference f13187u;

    public c(DatabaseReference databaseReference) {
        this.f13187u = databaseReference;
    }

    @Override // com.google.firebase.database.ValueEventListener
    public final void onCancelled(DatabaseError error) {
        i.g(error, "error");
    }

    @Override // com.google.firebase.database.ValueEventListener
    public final void onDataChange(DataSnapshot snapshot) {
        i.g(snapshot, "snapshot");
        boolean exists = snapshot.exists();
        DatabaseReference databaseReference = this.f13187u;
        if (!exists || !snapshot.hasChildren()) {
            databaseReference.setValue(new UserOnboardingModel(null, null, null));
        }
        databaseReference.removeEventListener(this);
    }
}
