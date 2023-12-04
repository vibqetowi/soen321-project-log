package org.apache.http.pool;
/* loaded from: classes5.dex */
public interface ConnPoolControl<T> {
    int getDefaultMaxPerRoute();

    int getMaxPerRoute(T t);

    int getMaxTotal();

    PoolStats getStats(T t);

    PoolStats getTotalStats();

    void setDefaultMaxPerRoute(int i);

    void setMaxPerRoute(T t, int i);

    void setMaxTotal(int i);
}
