package com.google.firebase.database.ktx;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import iv.q;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
/* compiled from: Database.kt */
@Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"com/google/firebase/database/ktx/DatabaseKt$snapshots$1$listener$1", "Lcom/google/firebase/database/ValueEventListener;", "Lcom/google/firebase/database/DataSnapshot;", "snapshot", "Lhs/k;", "onDataChange", "Lcom/google/firebase/database/DatabaseError;", "error", "onCancelled", "com.google.firebase-firebase-database-ktx"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class DatabaseKt$snapshots$1$listener$1 implements ValueEventListener {
    final /* synthetic */ q<DataSnapshot> $$this$callbackFlow;
    final /* synthetic */ Query $this_snapshots;

    /* JADX WARN: Multi-variable type inference failed */
    public DatabaseKt$snapshots$1$listener$1(Query query, q<? super DataSnapshot> qVar) {
        this.$this_snapshots = query;
        this.$$this$callbackFlow = qVar;
    }

    /* renamed from: onDataChange$lambda-0 */
    public static final void m4onDataChange$lambda0(q $this$callbackFlow, DataSnapshot snapshot) {
        i.g($this$callbackFlow, "$$this$callbackFlow");
        i.g(snapshot, "$snapshot");
        sp.b.j0($this$callbackFlow, snapshot);
    }

    @Override // com.google.firebase.database.ValueEventListener
    public void onCancelled(DatabaseError error) {
        i.g(error, "error");
        q<DataSnapshot> qVar = this.$$this$callbackFlow;
        DatabaseException exception = error.toException();
        CancellationException cancellationException = new CancellationException("Error getting Query snapshot");
        cancellationException.initCause(exception);
        h.l(qVar, cancellationException);
    }

    @Override // com.google.firebase.database.ValueEventListener
    public void onDataChange(DataSnapshot snapshot) {
        i.g(snapshot, "snapshot");
        this.$this_snapshots.getRepo().scheduleNow(new b(this.$$this$callbackFlow, snapshot, 1));
    }
}
