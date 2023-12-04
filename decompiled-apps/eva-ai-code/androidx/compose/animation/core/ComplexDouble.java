package androidx.compose.animation.core;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ComplexDouble.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\u000b\u001a\u00020\u0003HÂ\u0003J\t\u0010\f\u001a\u00020\u0003HÂ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0011\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0003H\u0086\nJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0011\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0000H\u0086\nJ\u0011\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0003H\u0086\nJ\u0011\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0000H\u0086\nJ\u0011\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0003H\u0086\nJ\u0011\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0000H\u0086\nJ\u0011\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0003H\u0086\nJ\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0000H\u0086\nR\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u001a"}, d2 = {"Landroidx/compose/animation/core/ComplexDouble;", "", "_real", "", "_imaginary", "(DD)V", "imaginary", "getImaginary", "()D", "real", "getReal", "component1", "component2", "copy", TtmlNode.TAG_DIV, "other", "equals", "", "hashCode", "", "minus", "plus", "times", "toString", "", "unaryMinus", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ComplexDouble {
    private double _imaginary;
    private double _real;

    private final double component1() {
        return this._real;
    }

    private final double component2() {
        return this._imaginary;
    }

    public static /* synthetic */ ComplexDouble copy$default(ComplexDouble complexDouble, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = complexDouble._real;
        }
        if ((i & 2) != 0) {
            d2 = complexDouble._imaginary;
        }
        return complexDouble.copy(d, d2);
    }

    public final ComplexDouble copy(double d, double d2) {
        return new ComplexDouble(d, d2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ComplexDouble) {
            ComplexDouble complexDouble = (ComplexDouble) obj;
            return Double.compare(this._real, complexDouble._real) == 0 && Double.compare(this._imaginary, complexDouble._imaginary) == 0;
        }
        return false;
    }

    public int hashCode() {
        return (Double.doubleToLongBits(this._real) * 31) + Double.doubleToLongBits(this._imaginary);
    }

    public String toString() {
        return "ComplexDouble(_real=" + this._real + ", _imaginary=" + this._imaginary + ')';
    }

    public ComplexDouble(double d, double d2) {
        this._real = d;
        this._imaginary = d2;
    }

    public final double getReal() {
        return this._real;
    }

    public final double getImaginary() {
        return this._imaginary;
    }

    public final ComplexDouble plus(double d) {
        this._real += d;
        return this;
    }

    public final ComplexDouble plus(ComplexDouble other) {
        Intrinsics.checkNotNullParameter(other, "other");
        this._real += other.getReal();
        this._imaginary += other.getImaginary();
        return this;
    }

    public final ComplexDouble times(double d) {
        this._real *= d;
        this._imaginary *= d;
        return this;
    }

    public final ComplexDouble times(ComplexDouble other) {
        Intrinsics.checkNotNullParameter(other, "other");
        this._real = (getReal() * other.getReal()) - (getImaginary() * other.getImaginary());
        this._imaginary = (getReal() * other.getImaginary()) + (other.getReal() * getImaginary());
        return this;
    }

    public final ComplexDouble unaryMinus() {
        double d = -1;
        this._real *= d;
        this._imaginary *= d;
        return this;
    }

    public final ComplexDouble div(double d) {
        this._real /= d;
        this._imaginary /= d;
        return this;
    }

    public final ComplexDouble minus(double d) {
        this._real += -d;
        return this;
    }

    public final ComplexDouble minus(ComplexDouble other) {
        Intrinsics.checkNotNullParameter(other, "other");
        double d = -1;
        other._real *= d;
        other._imaginary *= d;
        this._real += other.getReal();
        this._imaginary += other.getImaginary();
        return this;
    }
}
