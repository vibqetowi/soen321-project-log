package org.apache.commons.lang3.builder;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.Validate;
/* loaded from: classes5.dex */
public class DiffResult<T> implements Iterable<Diff<?>> {
    private static final String DIFFERS_STRING = "differs from";
    public static final String OBJECTS_SAME_STRING = "";
    private final List<Diff<?>> diffs;
    private final T lhs;
    private final T rhs;
    private final ToStringStyle style;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DiffResult(T t, T t2, List<Diff<?>> list, ToStringStyle toStringStyle) {
        Validate.notNull(t, "Left hand object cannot be null", new Object[0]);
        Validate.notNull(t2, "Right hand object cannot be null", new Object[0]);
        Validate.notNull(list, "List of differences cannot be null", new Object[0]);
        this.diffs = list;
        this.lhs = t;
        this.rhs = t2;
        if (toStringStyle == null) {
            this.style = ToStringStyle.DEFAULT_STYLE;
        } else {
            this.style = toStringStyle;
        }
    }

    public T getLeft() {
        return this.lhs;
    }

    public T getRight() {
        return this.rhs;
    }

    public List<Diff<?>> getDiffs() {
        return Collections.unmodifiableList(this.diffs);
    }

    public int getNumberOfDiffs() {
        return this.diffs.size();
    }

    public ToStringStyle getToStringStyle() {
        return this.style;
    }

    public String toString() {
        return toString(this.style);
    }

    public String toString(ToStringStyle toStringStyle) {
        if (this.diffs.isEmpty()) {
            return "";
        }
        ToStringBuilder toStringBuilder = new ToStringBuilder(this.lhs, toStringStyle);
        ToStringBuilder toStringBuilder2 = new ToStringBuilder(this.rhs, toStringStyle);
        for (Diff<?> diff : this.diffs) {
            toStringBuilder.append(diff.getFieldName(), diff.getLeft());
            toStringBuilder2.append(diff.getFieldName(), diff.getRight());
        }
        return String.format("%s %s %s", toStringBuilder.build(), DIFFERS_STRING, toStringBuilder2.build());
    }

    @Override // java.lang.Iterable
    public Iterator<Diff<?>> iterator() {
        return this.diffs.iterator();
    }
}
