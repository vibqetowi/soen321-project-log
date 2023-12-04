package io.opencensus.trace.export;

import io.opencensus.trace.Link;
import io.opencensus.trace.export.SpanData;
import java.util.List;
/* loaded from: classes4.dex */
final class AutoValue_SpanData_Links extends SpanData.Links {
    private final int droppedLinksCount;
    private final List<Link> links;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_SpanData_Links(List<Link> list, int i) {
        if (list == null) {
            throw new NullPointerException("Null links");
        }
        this.links = list;
        this.droppedLinksCount = i;
    }

    @Override // io.opencensus.trace.export.SpanData.Links
    public List<Link> getLinks() {
        return this.links;
    }

    @Override // io.opencensus.trace.export.SpanData.Links
    public int getDroppedLinksCount() {
        return this.droppedLinksCount;
    }

    public String toString() {
        return "Links{links=" + this.links + ", droppedLinksCount=" + this.droppedLinksCount + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SpanData.Links) {
            SpanData.Links links = (SpanData.Links) obj;
            return this.links.equals(links.getLinks()) && this.droppedLinksCount == links.getDroppedLinksCount();
        }
        return false;
    }

    public int hashCode() {
        return ((this.links.hashCode() ^ 1000003) * 1000003) ^ this.droppedLinksCount;
    }
}
