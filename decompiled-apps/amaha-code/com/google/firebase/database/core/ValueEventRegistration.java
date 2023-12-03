package com.google.firebase.database.core;

import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.InternalHelpers;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.database.annotations.NotNull;
import com.google.firebase.database.core.view.Change;
import com.google.firebase.database.core.view.DataEvent;
import com.google.firebase.database.core.view.Event;
import com.google.firebase.database.core.view.QuerySpec;
/* loaded from: classes.dex */
public class ValueEventRegistration extends EventRegistration {
    private final ValueEventListener eventListener;
    private final Repo repo;
    private final QuerySpec spec;

    public ValueEventRegistration(Repo repo, ValueEventListener valueEventListener, @NotNull QuerySpec querySpec) {
        this.repo = repo;
        this.eventListener = valueEventListener;
        this.spec = querySpec;
    }

    @Override // com.google.firebase.database.core.EventRegistration
    public EventRegistration clone(QuerySpec querySpec) {
        return new ValueEventRegistration(this.repo, this.eventListener, querySpec);
    }

    @Override // com.google.firebase.database.core.EventRegistration
    public DataEvent createEvent(Change change, QuerySpec querySpec) {
        return new DataEvent(Event.EventType.VALUE, this, InternalHelpers.createDataSnapshot(InternalHelpers.createReference(this.repo, querySpec.getPath()), change.getIndexedNode()), null);
    }

    public boolean equals(Object obj) {
        if (obj instanceof ValueEventRegistration) {
            ValueEventRegistration valueEventRegistration = (ValueEventRegistration) obj;
            if (valueEventRegistration.eventListener.equals(this.eventListener) && valueEventRegistration.repo.equals(this.repo) && valueEventRegistration.spec.equals(this.spec)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.database.core.EventRegistration
    public void fireCancelEvent(DatabaseError databaseError) {
        this.eventListener.onCancelled(databaseError);
    }

    @Override // com.google.firebase.database.core.EventRegistration
    public void fireEvent(DataEvent dataEvent) {
        if (isZombied()) {
            return;
        }
        this.eventListener.onDataChange(dataEvent.getSnapshot());
    }

    @Override // com.google.firebase.database.core.EventRegistration
    @NotNull
    public QuerySpec getQuerySpec() {
        return this.spec;
    }

    @Override // com.google.firebase.database.core.EventRegistration
    public Repo getRepo() {
        return this.repo;
    }

    public int hashCode() {
        int hashCode = this.repo.hashCode();
        return this.spec.hashCode() + ((hashCode + (this.eventListener.hashCode() * 31)) * 31);
    }

    @Override // com.google.firebase.database.core.EventRegistration
    public boolean isSameListener(EventRegistration eventRegistration) {
        if ((eventRegistration instanceof ValueEventRegistration) && ((ValueEventRegistration) eventRegistration).eventListener.equals(this.eventListener)) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.database.core.EventRegistration
    public boolean respondsTo(Event.EventType eventType) {
        if (eventType == Event.EventType.VALUE) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "ValueEventRegistration";
    }
}
