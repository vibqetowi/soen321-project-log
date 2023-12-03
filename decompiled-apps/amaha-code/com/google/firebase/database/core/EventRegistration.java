package com.google.firebase.database.core;

import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.annotations.NotNull;
import com.google.firebase.database.core.utilities.Utilities;
import com.google.firebase.database.core.view.Change;
import com.google.firebase.database.core.view.DataEvent;
import com.google.firebase.database.core.view.Event;
import com.google.firebase.database.core.view.QuerySpec;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public abstract class EventRegistration {
    private EventRegistrationZombieListener listener;
    private AtomicBoolean zombied = new AtomicBoolean(false);
    private boolean isUserInitiated = false;

    public abstract EventRegistration clone(QuerySpec querySpec);

    public abstract DataEvent createEvent(Change change, QuerySpec querySpec);

    public abstract void fireCancelEvent(DatabaseError databaseError);

    public abstract void fireEvent(DataEvent dataEvent);

    @NotNull
    public abstract QuerySpec getQuerySpec();

    public Repo getRepo() {
        return null;
    }

    public abstract boolean isSameListener(EventRegistration eventRegistration);

    public boolean isUserInitiated() {
        return this.isUserInitiated;
    }

    public boolean isZombied() {
        return this.zombied.get();
    }

    public abstract boolean respondsTo(Event.EventType eventType);

    public void setIsUserInitiated(boolean z10) {
        this.isUserInitiated = z10;
    }

    public void setOnZombied(EventRegistrationZombieListener eventRegistrationZombieListener) {
        boolean z10 = true;
        Utilities.hardAssert(!isZombied());
        if (this.listener != null) {
            z10 = false;
        }
        Utilities.hardAssert(z10);
        this.listener = eventRegistrationZombieListener;
    }

    public void zombify() {
        EventRegistrationZombieListener eventRegistrationZombieListener;
        if (this.zombied.compareAndSet(false, true) && (eventRegistrationZombieListener = this.listener) != null) {
            eventRegistrationZombieListener.onZombied(this);
            this.listener = null;
        }
    }
}
