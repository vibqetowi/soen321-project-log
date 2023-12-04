package io.opencensus.trace.samplers;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class AutoValue_ProbabilitySampler extends ProbabilitySampler {
    private final long idUpperBound;
    private final double probability;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_ProbabilitySampler(double d, long j) {
        this.probability = d;
        this.idUpperBound = j;
    }

    @Override // io.opencensus.trace.samplers.ProbabilitySampler
    double getProbability() {
        return this.probability;
    }

    @Override // io.opencensus.trace.samplers.ProbabilitySampler
    long getIdUpperBound() {
        return this.idUpperBound;
    }

    public String toString() {
        return "ProbabilitySampler{probability=" + this.probability + ", idUpperBound=" + this.idUpperBound + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ProbabilitySampler) {
            ProbabilitySampler probabilitySampler = (ProbabilitySampler) obj;
            return Double.doubleToLongBits(this.probability) == Double.doubleToLongBits(probabilitySampler.getProbability()) && this.idUpperBound == probabilitySampler.getIdUpperBound();
        }
        return false;
    }

    public int hashCode() {
        long j = this.idUpperBound;
        return (int) ((((int) (1000003 ^ ((Double.doubleToLongBits(this.probability) >>> 32) ^ Double.doubleToLongBits(this.probability)))) * 1000003) ^ (j ^ (j >>> 32)));
    }
}
