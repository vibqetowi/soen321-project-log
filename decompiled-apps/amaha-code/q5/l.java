package q5;
/* compiled from: SourceApplicationInfo.kt */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final String f29177a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f29178b;

    public l(String str, boolean z10) {
        this.f29177a = str;
        this.f29178b = z10;
    }

    public final String toString() {
        String str;
        if (this.f29178b) {
            str = "Applink";
        } else {
            str = "Unclassified";
        }
        String str2 = this.f29177a;
        if (str2 != null) {
            return str + '(' + ((Object) str2) + ')';
        }
        return str;
    }
}
