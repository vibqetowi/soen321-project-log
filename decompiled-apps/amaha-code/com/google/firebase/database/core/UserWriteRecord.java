package com.google.firebase.database.core;

import com.google.firebase.database.snapshot.Node;
/* loaded from: classes.dex */
public final class UserWriteRecord {
    private final CompoundWrite merge;
    private final Node overwrite;
    private final Path path;
    private final boolean visible;
    private final long writeId;

    public UserWriteRecord(long j10, Path path, Node node, boolean z10) {
        this.writeId = j10;
        this.path = path;
        this.overwrite = node;
        this.merge = null;
        this.visible = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || UserWriteRecord.class != obj.getClass()) {
            return false;
        }
        UserWriteRecord userWriteRecord = (UserWriteRecord) obj;
        if (this.writeId != userWriteRecord.writeId || !this.path.equals(userWriteRecord.path) || this.visible != userWriteRecord.visible) {
            return false;
        }
        Node node = this.overwrite;
        if (node == null ? userWriteRecord.overwrite != null : !node.equals(userWriteRecord.overwrite)) {
            return false;
        }
        CompoundWrite compoundWrite = this.merge;
        CompoundWrite compoundWrite2 = userWriteRecord.merge;
        if (compoundWrite == null ? compoundWrite2 == null : compoundWrite.equals(compoundWrite2)) {
            return true;
        }
        return false;
    }

    public CompoundWrite getMerge() {
        CompoundWrite compoundWrite = this.merge;
        if (compoundWrite != null) {
            return compoundWrite;
        }
        throw new IllegalArgumentException("Can't access merge when write is an overwrite!");
    }

    public Node getOverwrite() {
        Node node = this.overwrite;
        if (node != null) {
            return node;
        }
        throw new IllegalArgumentException("Can't access overwrite when write is a merge!");
    }

    public Path getPath() {
        return this.path;
    }

    public long getWriteId() {
        return this.writeId;
    }

    public int hashCode() {
        int i6;
        int hashCode = Boolean.valueOf(this.visible).hashCode();
        int hashCode2 = (this.path.hashCode() + ((hashCode + (Long.valueOf(this.writeId).hashCode() * 31)) * 31)) * 31;
        Node node = this.overwrite;
        int i10 = 0;
        if (node != null) {
            i6 = node.hashCode();
        } else {
            i6 = 0;
        }
        int i11 = (hashCode2 + i6) * 31;
        CompoundWrite compoundWrite = this.merge;
        if (compoundWrite != null) {
            i10 = compoundWrite.hashCode();
        }
        return i11 + i10;
    }

    public boolean isMerge() {
        if (this.merge != null) {
            return true;
        }
        return false;
    }

    public boolean isOverwrite() {
        if (this.overwrite != null) {
            return true;
        }
        return false;
    }

    public boolean isVisible() {
        return this.visible;
    }

    public String toString() {
        return "UserWriteRecord{id=" + this.writeId + " path=" + this.path + " visible=" + this.visible + " overwrite=" + this.overwrite + " merge=" + this.merge + "}";
    }

    public UserWriteRecord(long j10, Path path, CompoundWrite compoundWrite) {
        this.writeId = j10;
        this.path = path;
        this.overwrite = null;
        this.merge = compoundWrite;
        this.visible = true;
    }
}
