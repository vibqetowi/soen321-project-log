package cn;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;
import java.util.ArrayList;
/* compiled from: LibraryViewModelRepository.kt */
/* loaded from: classes2.dex */
public final class r1 implements ValueEventListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ DatabaseReference f5765u;

    public r1(DatabaseReference databaseReference) {
        this.f5765u = databaseReference;
    }

    @Override // com.google.firebase.database.ValueEventListener
    public final void onCancelled(DatabaseError error) {
        kotlin.jvm.internal.i.g(error, "error");
    }

    @Override // com.google.firebase.database.ValueEventListener
    public final void onDataChange(DataSnapshot snapshot) {
        kotlin.jvm.internal.i.g(snapshot, "snapshot");
        boolean exists = snapshot.exists();
        DatabaseReference databaseReference = this.f5765u;
        if (!exists || !snapshot.hasChildren()) {
            databaseReference.setValue(new ArrayList());
        }
        databaseReference.removeEventListener(this);
    }
}
