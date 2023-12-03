package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class h implements o {

    /* renamed from: u  reason: collision with root package name */
    public final Double f8397u;

    public h(Double d10) {
        if (d10 == null) {
            this.f8397u = Double.valueOf(Double.NaN);
        } else {
            this.f8397u = d10;
        }
    }

    @Override // com.google.android.gms.internal.measurement.o
    public final o e() {
        return new h(this.f8397u);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        return this.f8397u.equals(((h) obj).f8397u);
    }

    @Override // com.google.android.gms.internal.measurement.o
    public final Double f() {
        return this.f8397u;
    }

    @Override // com.google.android.gms.internal.measurement.o
    public final String g() {
        int scale;
        Double d10 = this.f8397u;
        if (Double.isNaN(d10.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(d10.doubleValue())) {
            if (d10.doubleValue() > 0.0d) {
                return "Infinity";
            }
            return "-Infinity";
        }
        BigDecimal stripTrailingZeros = BigDecimal.valueOf(d10.doubleValue()).stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        if (stripTrailingZeros.scale() > 0) {
            scale = stripTrailingZeros.precision();
        } else {
            scale = stripTrailingZeros.scale();
        }
        decimalFormat.setMinimumFractionDigits(scale - 1);
        String format = decimalFormat.format(stripTrailingZeros);
        int indexOf = format.indexOf("E");
        if (indexOf > 0) {
            int parseInt = Integer.parseInt(format.substring(indexOf + 1));
            if ((parseInt < 0 && parseInt > -7) || (parseInt >= 0 && parseInt < 21)) {
                return stripTrailingZeros.toPlainString();
            }
            return format.replace("E-", "e-").replace("E", "e+");
        }
        return format;
    }

    public final int hashCode() {
        return this.f8397u.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.o
    public final Boolean i() {
        Double d10 = this.f8397u;
        boolean z10 = false;
        if (!Double.isNaN(d10.doubleValue()) && d10.doubleValue() != 0.0d) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    @Override // com.google.android.gms.internal.measurement.o
    public final Iterator o() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.o
    public final o s(String str, v.c cVar, ArrayList arrayList) {
        if ("toString".equals(str)) {
            return new r(g());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", g(), str));
    }

    public final String toString() {
        return g();
    }
}
