package com.google.common.math;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.annotation.CheckForNull;
@ElementTypesAreNonnullByDefault
/* loaded from: classes7.dex */
public final class PairedStats implements Serializable {
    private static final int BYTES = 88;
    private static final long serialVersionUID = 0;
    private final double sumOfProductsOfDeltas;
    private final Stats xStats;
    private final Stats yStats;

    private static double ensureInUnitRange(double d) {
        if (d >= 1.0d) {
            return 1.0d;
        }
        if (d <= -1.0d) {
            return -1.0d;
        }
        return d;
    }

    private static double ensurePositive(double d) {
        if (d > 0.0d) {
            return d;
        }
        return Double.MIN_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PairedStats(Stats stats, Stats stats2, double d) {
        this.xStats = stats;
        this.yStats = stats2;
        this.sumOfProductsOfDeltas = d;
    }

    public long count() {
        return this.xStats.count();
    }

    public Stats xStats() {
        return this.xStats;
    }

    public Stats yStats() {
        return this.yStats;
    }

    public double populationCovariance() {
        Preconditions.checkState(count() != 0);
        return this.sumOfProductsOfDeltas / count();
    }

    public double sampleCovariance() {
        Preconditions.checkState(count() > 1);
        return this.sumOfProductsOfDeltas / (count() - 1);
    }

    public double pearsonsCorrelationCoefficient() {
        Preconditions.checkState(count() > 1);
        if (Double.isNaN(this.sumOfProductsOfDeltas)) {
            return Double.NaN;
        }
        double sumOfSquaresOfDeltas = xStats().sumOfSquaresOfDeltas();
        double sumOfSquaresOfDeltas2 = yStats().sumOfSquaresOfDeltas();
        Preconditions.checkState(sumOfSquaresOfDeltas > 0.0d);
        Preconditions.checkState(sumOfSquaresOfDeltas2 > 0.0d);
        return ensureInUnitRange(this.sumOfProductsOfDeltas / Math.sqrt(ensurePositive(sumOfSquaresOfDeltas * sumOfSquaresOfDeltas2)));
    }

    public LinearTransformation leastSquaresFit() {
        Preconditions.checkState(count() > 1);
        if (Double.isNaN(this.sumOfProductsOfDeltas)) {
            return LinearTransformation.forNaN();
        }
        double sumOfSquaresOfDeltas = this.xStats.sumOfSquaresOfDeltas();
        if (sumOfSquaresOfDeltas > 0.0d) {
            if (this.yStats.sumOfSquaresOfDeltas() > 0.0d) {
                return LinearTransformation.mapping(this.xStats.mean(), this.yStats.mean()).withSlope(this.sumOfProductsOfDeltas / sumOfSquaresOfDeltas);
            }
            return LinearTransformation.horizontal(this.yStats.mean());
        }
        Preconditions.checkState(this.yStats.sumOfSquaresOfDeltas() > 0.0d);
        return LinearTransformation.vertical(this.xStats.mean());
    }

    public boolean equals(@CheckForNull Object obj) {
        if (obj != null && getClass() == obj.getClass()) {
            PairedStats pairedStats = (PairedStats) obj;
            return this.xStats.equals(pairedStats.xStats) && this.yStats.equals(pairedStats.yStats) && Double.doubleToLongBits(this.sumOfProductsOfDeltas) == Double.doubleToLongBits(pairedStats.sumOfProductsOfDeltas);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.xStats, this.yStats, Double.valueOf(this.sumOfProductsOfDeltas));
    }

    public String toString() {
        if (count() > 0) {
            return MoreObjects.toStringHelper(this).add("xStats", this.xStats).add("yStats", this.yStats).add("populationCovariance", populationCovariance()).toString();
        }
        return MoreObjects.toStringHelper(this).add("xStats", this.xStats).add("yStats", this.yStats).toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double sumOfProductsOfDeltas() {
        return this.sumOfProductsOfDeltas;
    }

    public byte[] toByteArray() {
        ByteBuffer order = ByteBuffer.allocate(BYTES).order(ByteOrder.LITTLE_ENDIAN);
        this.xStats.writeTo(order);
        this.yStats.writeTo(order);
        order.putDouble(this.sumOfProductsOfDeltas);
        return order.array();
    }

    public static PairedStats fromByteArray(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        Preconditions.checkArgument(bArr.length == BYTES, "Expected PairedStats.BYTES = %s, got %s", (int) BYTES, bArr.length);
        ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        return new PairedStats(Stats.readFrom(order), Stats.readFrom(order), order.getDouble());
    }
}
