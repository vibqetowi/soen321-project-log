package cn;

import java.util.Locale;
/* compiled from: LibraryShortCoursesViewModel.kt */
/* loaded from: classes2.dex */
public final class e0 extends kotlin.jvm.internal.k implements ss.l<String, Boolean> {

    /* renamed from: u  reason: collision with root package name */
    public static final e0 f5466u = new e0();

    public e0() {
        super(1);
    }

    @Override // ss.l
    public final Boolean invoke(String str) {
        String str2;
        String str3 = str;
        if (str3 != null) {
            Locale locale = Locale.ENGLISH;
            str2 = ri.e.e(locale, "ENGLISH", str3, locale, "this as java.lang.String).toLowerCase(locale)");
        } else {
            str2 = null;
        }
        return Boolean.valueOf(kotlin.jvm.internal.i.b(str2, "topical"));
    }
}
