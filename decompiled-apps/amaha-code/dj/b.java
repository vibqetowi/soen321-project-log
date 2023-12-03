package dj;

import gi.a;
import java.lang.Comparable;
import java.util.Date;
/* compiled from: DatetimeOperation.java */
/* loaded from: classes.dex */
public final class b<T extends Comparable<T> & gi.a<Double>> extends a {
    public static boolean K(gi.b bVar, gi.b bVar2) {
        return a.J(bVar, bVar2, new gi.b("absolute", "on", defpackage.b.n("yyyy-MM-dd'T'HH:mm:ss", new Date((long) (((Double) bVar2.getValue()).doubleValue() + 8.64E7d)))));
    }
}
