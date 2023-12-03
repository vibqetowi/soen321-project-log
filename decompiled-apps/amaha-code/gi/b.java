package gi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
/* compiled from: MOEDatetime.java */
/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: v  reason: collision with root package name */
    public final String f16513v;

    /* renamed from: w  reason: collision with root package name */
    public final String f16514w;

    public b(String str, String str2, Object obj) {
        super(obj);
        this.f16513v = str;
        this.f16514w = str2;
    }

    @Override // gi.c
    public final Double d() {
        Object obj = this.f16515u;
        if (obj == null) {
            return null;
        }
        try {
            return Double.valueOf(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").parse(obj.toString()).getTime());
        } catch (ParseException unused) {
            return super.d();
        }
    }

    @Override // gi.c, gi.a
    /* renamed from: f */
    public final Double getValue() {
        Double valueOf;
        String str = this.f16513v;
        boolean equals = str.equals("absolute");
        String str2 = this.f16514w;
        if (equals) {
            valueOf = d();
        } else {
            Calendar calendar = Calendar.getInstance();
            if (!str2.equals("inTheLast") && !str2.equals("inTheNext")) {
                calendar.set(11, 0);
                calendar.set(12, 0);
                calendar.set(13, 0);
            }
            long timeInMillis = calendar.getTimeInMillis();
            long longValue = Long.valueOf(Long.parseLong(this.f16515u.toString())).longValue() * 86400000;
            str.getClass();
            if (!str.equals("relative_future")) {
                if (!str.equals("relative_past")) {
                    valueOf = null;
                } else {
                    valueOf = Double.valueOf(timeInMillis - longValue);
                }
            } else {
                valueOf = Double.valueOf(timeInMillis + longValue);
            }
        }
        if (str2.equals("after") && valueOf != null) {
            return Double.valueOf(valueOf.doubleValue() + 86400000);
        }
        return valueOf;
    }
}
