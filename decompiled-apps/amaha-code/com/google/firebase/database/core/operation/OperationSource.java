package com.google.firebase.database.core.operation;

import com.google.firebase.database.core.utilities.Utilities;
import com.google.firebase.database.core.view.QueryParams;
/* loaded from: classes.dex */
public class OperationSource {
    private final QueryParams queryParams;
    private final Source source;
    private final boolean tagged;
    public static final OperationSource USER = new OperationSource(Source.User, null, false);
    public static final OperationSource SERVER = new OperationSource(Source.Server, null, false);

    /* loaded from: classes.dex */
    public enum Source {
        User,
        Server
    }

    public OperationSource(Source source, QueryParams queryParams, boolean z10) {
        boolean z11;
        this.source = source;
        this.queryParams = queryParams;
        this.tagged = z10;
        if (z10 && !isFromServer()) {
            z11 = false;
        } else {
            z11 = true;
        }
        Utilities.hardAssert(z11);
    }

    public static OperationSource forServerTaggedQuery(QueryParams queryParams) {
        return new OperationSource(Source.Server, queryParams, true);
    }

    public QueryParams getQueryParams() {
        return this.queryParams;
    }

    public boolean isFromServer() {
        if (this.source == Source.Server) {
            return true;
        }
        return false;
    }

    public boolean isFromUser() {
        if (this.source == Source.User) {
            return true;
        }
        return false;
    }

    public boolean isTagged() {
        return this.tagged;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("OperationSource{source=");
        sb2.append(this.source);
        sb2.append(", queryParams=");
        sb2.append(this.queryParams);
        sb2.append(", tagged=");
        return c.t(sb2, this.tagged, '}');
    }
}
