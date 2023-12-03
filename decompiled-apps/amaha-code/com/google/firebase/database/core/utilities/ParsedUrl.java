package com.google.firebase.database.core.utilities;

import com.google.firebase.database.core.Path;
import com.google.firebase.database.core.RepoInfo;
/* loaded from: classes.dex */
public final class ParsedUrl {
    public Path path;
    public RepoInfo repoInfo;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ParsedUrl.class != obj.getClass()) {
            return false;
        }
        ParsedUrl parsedUrl = (ParsedUrl) obj;
        if (!this.repoInfo.equals(parsedUrl.repoInfo)) {
            return false;
        }
        return this.path.equals(parsedUrl.path);
    }

    public int hashCode() {
        return this.path.hashCode() + (this.repoInfo.hashCode() * 31);
    }
}
