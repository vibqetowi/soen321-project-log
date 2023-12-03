package h5;

import h5.q;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
/* compiled from: GraphRequest.kt */
/* loaded from: classes.dex */
public final class r implements q.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ArrayList<String> f17306a;

    public r(ArrayList<String> arrayList) {
        this.f17306a = arrayList;
    }

    @Override // h5.q.d
    public final void a(String str, String value) {
        kotlin.jvm.internal.i.g(value, "value");
        String format = String.format(Locale.US, "%s=%s", Arrays.copyOf(new Object[]{str, URLEncoder.encode(value, "UTF-8")}, 2));
        kotlin.jvm.internal.i.f(format, "java.lang.String.format(locale, format, *args)");
        this.f17306a.add(format);
    }
}
