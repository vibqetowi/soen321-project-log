package xg;

import java.util.Calendar;
/* compiled from: EventUtils.java */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f37773a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

    public static String a() {
        Calendar calendar = Calendar.getInstance();
        int i6 = calendar.get(11);
        int i10 = calendar.get(12);
        int i11 = calendar.get(13);
        int i12 = calendar.get(5);
        int i13 = f37773a[calendar.get(2)];
        int i14 = calendar.get(1);
        return i12 + ":" + i13 + ":" + i14 + ":" + i6 + ":" + i10 + ":" + i11;
    }
}
