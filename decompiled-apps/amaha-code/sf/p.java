package sf;

import java.io.Serializable;
import java.math.BigInteger;
/* compiled from: JsonPrimitive.java */
/* loaded from: classes.dex */
public final class p extends m {

    /* renamed from: u  reason: collision with root package name */
    public final Serializable f31512u;

    public p(Boolean bool) {
        bool.getClass();
        this.f31512u = bool;
    }

    public static boolean r(p pVar) {
        Serializable serializable = pVar.f31512u;
        if (serializable instanceof Number) {
            Number number = (Number) serializable;
            if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
                return true;
            }
        }
        return false;
    }

    @Override // sf.m
    public final int e() {
        if (this.f31512u instanceof Number) {
            return q().intValue();
        }
        return Integer.parseInt(m());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        Serializable serializable = this.f31512u;
        Serializable serializable2 = pVar.f31512u;
        if (serializable == null) {
            if (serializable2 == null) {
                return true;
            }
            return false;
        } else if (r(this) && r(pVar)) {
            if (q().longValue() == pVar.q().longValue()) {
                return true;
            }
            return false;
        } else if ((serializable instanceof Number) && (serializable2 instanceof Number)) {
            double doubleValue = q().doubleValue();
            double doubleValue2 = pVar.q().doubleValue();
            if (doubleValue == doubleValue2) {
                return true;
            }
            if (Double.isNaN(doubleValue) && Double.isNaN(doubleValue2)) {
                return true;
            }
            return false;
        } else {
            return serializable.equals(serializable2);
        }
    }

    public final int hashCode() {
        long doubleToLongBits;
        Serializable serializable = this.f31512u;
        if (serializable == null) {
            return 31;
        }
        if (r(this)) {
            doubleToLongBits = q().longValue();
        } else if (serializable instanceof Number) {
            doubleToLongBits = Double.doubleToLongBits(q().doubleValue());
        } else {
            return serializable.hashCode();
        }
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    @Override // sf.m
    public final String m() {
        Serializable serializable = this.f31512u;
        if (serializable instanceof Number) {
            return q().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        return (String) serializable;
    }

    public final boolean o() {
        Serializable serializable = this.f31512u;
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).booleanValue();
        }
        return Boolean.parseBoolean(m());
    }

    public final Number q() {
        Serializable serializable = this.f31512u;
        if (serializable instanceof String) {
            return new uf.j((String) serializable);
        }
        return (Number) serializable;
    }

    public p(Number number) {
        number.getClass();
        this.f31512u = number;
    }

    public p(String str) {
        str.getClass();
        this.f31512u = str;
    }
}
