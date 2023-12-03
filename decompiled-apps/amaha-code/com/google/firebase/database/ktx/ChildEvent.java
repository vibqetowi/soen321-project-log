package com.google.firebase.database.ktx;

import com.google.firebase.database.DataSnapshot;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
import v.g;
/* compiled from: ChildEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/google/firebase/database/ktx/ChildEvent;", "", "()V", "Added", "Changed", "Moved", "Removed", "Lcom/google/firebase/database/ktx/ChildEvent$Added;", "Lcom/google/firebase/database/ktx/ChildEvent$Changed;", "Lcom/google/firebase/database/ktx/ChildEvent$Moved;", "Lcom/google/firebase/database/ktx/ChildEvent$Removed;", "com.google.firebase-firebase-database-ktx"}, k = 1, mv = {1, 7, 1}, xi = com.appsflyer.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public abstract class ChildEvent {

    /* compiled from: ChildEvent.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/google/firebase/database/ktx/ChildEvent$Added;", "Lcom/google/firebase/database/ktx/ChildEvent;", "snapshot", "Lcom/google/firebase/database/DataSnapshot;", "previousChildName", "", "(Lcom/google/firebase/database/DataSnapshot;Ljava/lang/String;)V", "getPreviousChildName", "()Ljava/lang/String;", "getSnapshot", "()Lcom/google/firebase/database/DataSnapshot;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "com.google.firebase-firebase-database-ktx"}, k = 1, mv = {1, 7, 1}, xi = com.appsflyer.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public static final class Added extends ChildEvent {
        private final String previousChildName;
        private final DataSnapshot snapshot;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Added(DataSnapshot snapshot, String str) {
            super(null);
            i.g(snapshot, "snapshot");
            this.snapshot = snapshot;
            this.previousChildName = str;
        }

        public static /* synthetic */ Added copy$default(Added added, DataSnapshot dataSnapshot, String str, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                dataSnapshot = added.snapshot;
            }
            if ((i6 & 2) != 0) {
                str = added.previousChildName;
            }
            return added.copy(dataSnapshot, str);
        }

        public final DataSnapshot component1() {
            return this.snapshot;
        }

        public final String component2() {
            return this.previousChildName;
        }

        public final Added copy(DataSnapshot snapshot, String str) {
            i.g(snapshot, "snapshot");
            return new Added(snapshot, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Added)) {
                return false;
            }
            Added added = (Added) obj;
            if (i.b(this.snapshot, added.snapshot) && i.b(this.previousChildName, added.previousChildName)) {
                return true;
            }
            return false;
        }

        public final String getPreviousChildName() {
            return this.previousChildName;
        }

        public final DataSnapshot getSnapshot() {
            return this.snapshot;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.snapshot.hashCode() * 31;
            String str = this.previousChildName;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Added(snapshot=");
            sb2.append(this.snapshot);
            sb2.append(", previousChildName=");
            return g.c(sb2, this.previousChildName, ')');
        }
    }

    /* compiled from: ChildEvent.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/google/firebase/database/ktx/ChildEvent$Changed;", "Lcom/google/firebase/database/ktx/ChildEvent;", "snapshot", "Lcom/google/firebase/database/DataSnapshot;", "previousChildName", "", "(Lcom/google/firebase/database/DataSnapshot;Ljava/lang/String;)V", "getPreviousChildName", "()Ljava/lang/String;", "getSnapshot", "()Lcom/google/firebase/database/DataSnapshot;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "com.google.firebase-firebase-database-ktx"}, k = 1, mv = {1, 7, 1}, xi = com.appsflyer.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public static final class Changed extends ChildEvent {
        private final String previousChildName;
        private final DataSnapshot snapshot;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Changed(DataSnapshot snapshot, String str) {
            super(null);
            i.g(snapshot, "snapshot");
            this.snapshot = snapshot;
            this.previousChildName = str;
        }

        public static /* synthetic */ Changed copy$default(Changed changed, DataSnapshot dataSnapshot, String str, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                dataSnapshot = changed.snapshot;
            }
            if ((i6 & 2) != 0) {
                str = changed.previousChildName;
            }
            return changed.copy(dataSnapshot, str);
        }

        public final DataSnapshot component1() {
            return this.snapshot;
        }

        public final String component2() {
            return this.previousChildName;
        }

        public final Changed copy(DataSnapshot snapshot, String str) {
            i.g(snapshot, "snapshot");
            return new Changed(snapshot, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Changed)) {
                return false;
            }
            Changed changed = (Changed) obj;
            if (i.b(this.snapshot, changed.snapshot) && i.b(this.previousChildName, changed.previousChildName)) {
                return true;
            }
            return false;
        }

        public final String getPreviousChildName() {
            return this.previousChildName;
        }

        public final DataSnapshot getSnapshot() {
            return this.snapshot;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.snapshot.hashCode() * 31;
            String str = this.previousChildName;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Changed(snapshot=");
            sb2.append(this.snapshot);
            sb2.append(", previousChildName=");
            return g.c(sb2, this.previousChildName, ')');
        }
    }

    /* compiled from: ChildEvent.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/google/firebase/database/ktx/ChildEvent$Moved;", "Lcom/google/firebase/database/ktx/ChildEvent;", "snapshot", "Lcom/google/firebase/database/DataSnapshot;", "previousChildName", "", "(Lcom/google/firebase/database/DataSnapshot;Ljava/lang/String;)V", "getPreviousChildName", "()Ljava/lang/String;", "getSnapshot", "()Lcom/google/firebase/database/DataSnapshot;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "com.google.firebase-firebase-database-ktx"}, k = 1, mv = {1, 7, 1}, xi = com.appsflyer.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public static final class Moved extends ChildEvent {
        private final String previousChildName;
        private final DataSnapshot snapshot;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Moved(DataSnapshot snapshot, String str) {
            super(null);
            i.g(snapshot, "snapshot");
            this.snapshot = snapshot;
            this.previousChildName = str;
        }

        public static /* synthetic */ Moved copy$default(Moved moved, DataSnapshot dataSnapshot, String str, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                dataSnapshot = moved.snapshot;
            }
            if ((i6 & 2) != 0) {
                str = moved.previousChildName;
            }
            return moved.copy(dataSnapshot, str);
        }

        public final DataSnapshot component1() {
            return this.snapshot;
        }

        public final String component2() {
            return this.previousChildName;
        }

        public final Moved copy(DataSnapshot snapshot, String str) {
            i.g(snapshot, "snapshot");
            return new Moved(snapshot, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Moved)) {
                return false;
            }
            Moved moved = (Moved) obj;
            if (i.b(this.snapshot, moved.snapshot) && i.b(this.previousChildName, moved.previousChildName)) {
                return true;
            }
            return false;
        }

        public final String getPreviousChildName() {
            return this.previousChildName;
        }

        public final DataSnapshot getSnapshot() {
            return this.snapshot;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.snapshot.hashCode() * 31;
            String str = this.previousChildName;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Moved(snapshot=");
            sb2.append(this.snapshot);
            sb2.append(", previousChildName=");
            return g.c(sb2, this.previousChildName, ')');
        }
    }

    /* compiled from: ChildEvent.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/google/firebase/database/ktx/ChildEvent$Removed;", "Lcom/google/firebase/database/ktx/ChildEvent;", "snapshot", "Lcom/google/firebase/database/DataSnapshot;", "(Lcom/google/firebase/database/DataSnapshot;)V", "getSnapshot", "()Lcom/google/firebase/database/DataSnapshot;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "com.google.firebase-firebase-database-ktx"}, k = 1, mv = {1, 7, 1}, xi = com.appsflyer.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public static final class Removed extends ChildEvent {
        private final DataSnapshot snapshot;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Removed(DataSnapshot snapshot) {
            super(null);
            i.g(snapshot, "snapshot");
            this.snapshot = snapshot;
        }

        public static /* synthetic */ Removed copy$default(Removed removed, DataSnapshot dataSnapshot, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                dataSnapshot = removed.snapshot;
            }
            return removed.copy(dataSnapshot);
        }

        public final DataSnapshot component1() {
            return this.snapshot;
        }

        public final Removed copy(DataSnapshot snapshot) {
            i.g(snapshot, "snapshot");
            return new Removed(snapshot);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Removed) && i.b(this.snapshot, ((Removed) obj).snapshot)) {
                return true;
            }
            return false;
        }

        public final DataSnapshot getSnapshot() {
            return this.snapshot;
        }

        public int hashCode() {
            return this.snapshot.hashCode();
        }

        public String toString() {
            return "Removed(snapshot=" + this.snapshot + ')';
        }
    }

    private ChildEvent() {
    }

    public /* synthetic */ ChildEvent(d dVar) {
        this();
    }
}
