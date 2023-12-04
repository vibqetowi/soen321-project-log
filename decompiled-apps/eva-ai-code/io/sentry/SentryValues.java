package io.sentry;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
final class SentryValues<T> {
    private final List<T> values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SentryValues(List<T> list) {
        this.values = new ArrayList(list == null ? new ArrayList<>(0) : list);
    }

    public List<T> getValues() {
        return this.values;
    }
}
