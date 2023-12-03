package com.google.firebase.database.ktx;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.Query;
import com.google.firebase.database.ktx.ChildEvent;
import iv.q;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
/* compiled from: Database.kt */
@Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u001a\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\u000e"}, d2 = {"com/google/firebase/database/ktx/DatabaseKt$childEvents$1$listener$1", "Lcom/google/firebase/database/ChildEventListener;", "Lcom/google/firebase/database/DataSnapshot;", "snapshot", "", "previousChildName", "Lhs/k;", "onChildAdded", "onChildChanged", "onChildRemoved", "onChildMoved", "Lcom/google/firebase/database/DatabaseError;", "error", "onCancelled", "com.google.firebase-firebase-database-ktx"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class DatabaseKt$childEvents$1$listener$1 implements ChildEventListener {
    final /* synthetic */ q<ChildEvent> $$this$callbackFlow;
    final /* synthetic */ Query $this_childEvents;

    /* JADX WARN: Multi-variable type inference failed */
    public DatabaseKt$childEvents$1$listener$1(Query query, q<? super ChildEvent> qVar) {
        this.$this_childEvents = query;
        this.$$this$callbackFlow = qVar;
    }

    /* renamed from: onChildAdded$lambda-0 */
    public static final void m0onChildAdded$lambda0(q $this$callbackFlow, DataSnapshot snapshot, String str) {
        i.g($this$callbackFlow, "$$this$callbackFlow");
        i.g(snapshot, "$snapshot");
        sp.b.j0($this$callbackFlow, new ChildEvent.Added(snapshot, str));
    }

    /* renamed from: onChildChanged$lambda-1 */
    public static final void m1onChildChanged$lambda1(q $this$callbackFlow, DataSnapshot snapshot, String str) {
        i.g($this$callbackFlow, "$$this$callbackFlow");
        i.g(snapshot, "$snapshot");
        sp.b.j0($this$callbackFlow, new ChildEvent.Changed(snapshot, str));
    }

    /* renamed from: onChildMoved$lambda-3 */
    public static final void m2onChildMoved$lambda3(q $this$callbackFlow, DataSnapshot snapshot, String str) {
        i.g($this$callbackFlow, "$$this$callbackFlow");
        i.g(snapshot, "$snapshot");
        sp.b.j0($this$callbackFlow, new ChildEvent.Moved(snapshot, str));
    }

    /* renamed from: onChildRemoved$lambda-2 */
    public static final void m3onChildRemoved$lambda2(q $this$callbackFlow, DataSnapshot snapshot) {
        i.g($this$callbackFlow, "$$this$callbackFlow");
        i.g(snapshot, "$snapshot");
        sp.b.j0($this$callbackFlow, new ChildEvent.Removed(snapshot));
    }

    @Override // com.google.firebase.database.ChildEventListener
    public void onCancelled(DatabaseError error) {
        i.g(error, "error");
        q<ChildEvent> qVar = this.$$this$callbackFlow;
        DatabaseException exception = error.toException();
        CancellationException cancellationException = new CancellationException("Error getting Query childEvent");
        cancellationException.initCause(exception);
        h.l(qVar, cancellationException);
    }

    @Override // com.google.firebase.database.ChildEventListener
    public void onChildAdded(DataSnapshot snapshot, String str) {
        i.g(snapshot, "snapshot");
        this.$this_childEvents.getRepo().scheduleNow(new a(this.$$this$callbackFlow, snapshot, str, 0));
    }

    @Override // com.google.firebase.database.ChildEventListener
    public void onChildChanged(DataSnapshot snapshot, String str) {
        i.g(snapshot, "snapshot");
        this.$this_childEvents.getRepo().scheduleNow(new a(this.$$this$callbackFlow, snapshot, str, 1));
    }

    @Override // com.google.firebase.database.ChildEventListener
    public void onChildMoved(DataSnapshot snapshot, String str) {
        i.g(snapshot, "snapshot");
        this.$this_childEvents.getRepo().scheduleNow(new a(this.$$this$callbackFlow, snapshot, str, 2));
    }

    @Override // com.google.firebase.database.ChildEventListener
    public void onChildRemoved(DataSnapshot snapshot) {
        i.g(snapshot, "snapshot");
        this.$this_childEvents.getRepo().scheduleNow(new b(this.$$this$callbackFlow, snapshot, 0));
    }
}
