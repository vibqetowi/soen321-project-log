package o7;

import java.util.HashSet;
/* compiled from: ExoPlayerLibraryInfo.java */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final HashSet<String> f27209a = new HashSet<>();

    /* renamed from: b  reason: collision with root package name */
    public static String f27210b = "goog.exo.core";

    public static synchronized void a(String str) {
        synchronized (m.class) {
            if (f27209a.add(str)) {
                String str2 = f27210b;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 2 + str.length());
                sb2.append(str2);
                sb2.append(", ");
                sb2.append(str);
                f27210b = sb2.toString();
            }
        }
    }
}
