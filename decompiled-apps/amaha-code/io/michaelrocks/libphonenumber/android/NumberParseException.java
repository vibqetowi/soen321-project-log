package io.michaelrocks.libphonenumber.android;
/* loaded from: classes2.dex */
public class NumberParseException extends Exception {

    /* renamed from: u  reason: collision with root package name */
    public final int f20503u;

    /* renamed from: v  reason: collision with root package name */
    public final String f20504v;

    public NumberParseException(int i6, String str) {
        super(str);
        this.f20504v = str;
        this.f20503u = i6;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "Error type: " + d.t(this.f20503u) + ". " + this.f20504v;
    }
}
