package yt;
/* compiled from: SignatureBuildingComponents.kt */
/* loaded from: classes2.dex */
public final class t extends kotlin.jvm.internal.k implements ss.l<String, CharSequence> {

    /* renamed from: u  reason: collision with root package name */
    public static final t f39058u = new t();

    public t() {
        super(1);
    }

    @Override // ss.l
    public final CharSequence invoke(String str) {
        String it = str;
        kotlin.jvm.internal.i.g(it, "it");
        if (it.length() > 1) {
            return "L" + it + ';';
        }
        return it;
    }
}
