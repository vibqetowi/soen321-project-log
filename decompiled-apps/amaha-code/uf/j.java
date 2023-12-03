package uf;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.math.BigDecimal;
/* compiled from: LazilyParsedNumber.java */
/* loaded from: classes.dex */
public final class j extends Number {

    /* renamed from: u  reason: collision with root package name */
    public final String f34074u;

    public j(String str) {
        this.f34074u = str;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() {
        return new BigDecimal(this.f34074u);
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f34074u);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        String str = ((j) obj).f34074u;
        String str2 = this.f34074u;
        if (str2 == str || str2.equals(str)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f34074u);
    }

    public final int hashCode() {
        return this.f34074u.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f34074u;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(str).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f34074u;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return new BigDecimal(str).longValue();
        }
    }

    public final String toString() {
        return this.f34074u;
    }
}
