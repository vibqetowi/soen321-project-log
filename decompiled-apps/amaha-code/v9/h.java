package v9;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final String f34905a;

    /* renamed from: b  reason: collision with root package name */
    public final String f34906b;

    public h(String str, String str2) {
        boolean z10;
        if (str.length() <= 23) {
            z10 = true;
        } else {
            z10 = false;
        }
        Object[] objArr = {str, 23};
        if (z10) {
            this.f34905a = str;
            if (str2 != null && str2.length() > 0) {
                this.f34906b = str2;
                return;
            } else {
                this.f34906b = null;
                return;
            }
        }
        throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
    }
}
