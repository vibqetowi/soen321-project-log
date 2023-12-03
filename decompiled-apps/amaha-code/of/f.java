package of;
/* compiled from: FirebaseRemoteConfigValueImpl.java */
/* loaded from: classes.dex */
public final class f implements nf.d {

    /* renamed from: a  reason: collision with root package name */
    public final String f27456a;

    /* renamed from: b  reason: collision with root package name */
    public final int f27457b;

    public f(String str, int i6) {
        this.f27456a = str;
        this.f27457b = i6;
    }

    @Override // nf.d
    public final long a() {
        if (this.f27457b == 0) {
            return 0L;
        }
        String trim = c().trim();
        try {
            return Long.valueOf(trim).longValue();
        } catch (NumberFormatException e10) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", trim, "long"), e10);
        }
    }

    @Override // nf.d
    public final double b() {
        if (this.f27457b == 0) {
            return 0.0d;
        }
        String trim = c().trim();
        try {
            return Double.valueOf(trim).doubleValue();
        } catch (NumberFormatException e10) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", trim, "double"), e10);
        }
    }

    @Override // nf.d
    public final String c() {
        if (this.f27457b == 0) {
            return "";
        }
        String str = this.f27456a;
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
    }

    @Override // nf.d
    public final boolean d() {
        if (this.f27457b == 0) {
            return false;
        }
        String trim = c().trim();
        if (d.f27448e.matcher(trim).matches()) {
            return true;
        }
        if (d.f.matcher(trim).matches()) {
            return false;
        }
        throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", trim, "boolean"));
    }

    @Override // nf.d
    public final int g() {
        return this.f27457b;
    }
}
