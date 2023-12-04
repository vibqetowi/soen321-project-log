package com.ifriend.data.repository.deeplinks;

import com.ifriend.domain.config.PrimitiveValue;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: DeepLinksParser.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u0015\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J9\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/ifriend/data/repository/deeplinks/DataDeepLink;", "", "uri", "", "pathSections", "", "queries", "", "Lcom/ifriend/domain/config/PrimitiveValue;", "(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)V", "getPathSections", "()Ljava/util/List;", "getQueries", "()Ljava/util/Map;", "getUri", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DataDeepLink {
    private final List<String> pathSections;
    private final Map<String, PrimitiveValue> queries;
    private final String uri;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DataDeepLink copy$default(DataDeepLink dataDeepLink, String str, List list, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dataDeepLink.uri;
        }
        if ((i & 2) != 0) {
            list = dataDeepLink.pathSections;
        }
        if ((i & 4) != 0) {
            map = dataDeepLink.queries;
        }
        return dataDeepLink.copy(str, list, map);
    }

    public final String component1() {
        return this.uri;
    }

    public final List<String> component2() {
        return this.pathSections;
    }

    public final Map<String, PrimitiveValue> component3() {
        return this.queries;
    }

    public final DataDeepLink copy(String uri, List<String> pathSections, Map<String, ? extends PrimitiveValue> queries) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(pathSections, "pathSections");
        Intrinsics.checkNotNullParameter(queries, "queries");
        return new DataDeepLink(uri, pathSections, queries);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DataDeepLink) {
            DataDeepLink dataDeepLink = (DataDeepLink) obj;
            return Intrinsics.areEqual(this.uri, dataDeepLink.uri) && Intrinsics.areEqual(this.pathSections, dataDeepLink.pathSections) && Intrinsics.areEqual(this.queries, dataDeepLink.queries);
        }
        return false;
    }

    public int hashCode() {
        return (((this.uri.hashCode() * 31) + this.pathSections.hashCode()) * 31) + this.queries.hashCode();
    }

    public String toString() {
        String str = this.uri;
        List<String> list = this.pathSections;
        Map<String, PrimitiveValue> map = this.queries;
        return "DataDeepLink(uri=" + str + ", pathSections=" + list + ", queries=" + map + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DataDeepLink(String uri, List<String> pathSections, Map<String, ? extends PrimitiveValue> queries) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(pathSections, "pathSections");
        Intrinsics.checkNotNullParameter(queries, "queries");
        this.uri = uri;
        this.pathSections = pathSections;
        this.queries = queries;
    }

    public final String getUri() {
        return this.uri;
    }

    public final List<String> getPathSections() {
        return this.pathSections;
    }

    public final Map<String, PrimitiveValue> getQueries() {
        return this.queries;
    }
}
