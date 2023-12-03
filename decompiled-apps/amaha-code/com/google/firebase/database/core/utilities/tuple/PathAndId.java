package com.google.firebase.database.core.utilities.tuple;

import com.google.firebase.database.core.Path;
/* loaded from: classes.dex */
public class PathAndId {

    /* renamed from: id  reason: collision with root package name */
    private long f9602id;
    private Path path;

    public PathAndId(Path path, long j10) {
        this.path = path;
        this.f9602id = j10;
    }

    public long getId() {
        return this.f9602id;
    }

    public Path getPath() {
        return this.path;
    }
}
