package io.opencensus.common;
/* loaded from: classes4.dex */
final class AutoValue_Timestamp extends Timestamp {
    private final int nanos;
    private final long seconds;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_Timestamp(long j, int i) {
        this.seconds = j;
        this.nanos = i;
    }

    @Override // io.opencensus.common.Timestamp
    public long getSeconds() {
        return this.seconds;
    }

    @Override // io.opencensus.common.Timestamp
    public int getNanos() {
        return this.nanos;
    }

    public String toString() {
        return "Timestamp{seconds=" + this.seconds + ", nanos=" + this.nanos + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Timestamp) {
            Timestamp timestamp = (Timestamp) obj;
            return this.seconds == timestamp.getSeconds() && this.nanos == timestamp.getNanos();
        }
        return false;
    }

    public int hashCode() {
        long j = this.seconds;
        return this.nanos ^ (((int) (1000003 ^ (j ^ (j >>> 32)))) * 1000003);
    }
}
