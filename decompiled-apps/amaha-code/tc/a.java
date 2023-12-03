package tc;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
/* compiled from: AbtExperimentInfo.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f32981g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* renamed from: h  reason: collision with root package name */
    public static final SimpleDateFormat f32982h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* renamed from: a  reason: collision with root package name */
    public final String f32983a;

    /* renamed from: b  reason: collision with root package name */
    public final String f32984b;

    /* renamed from: c  reason: collision with root package name */
    public final String f32985c;

    /* renamed from: d  reason: collision with root package name */
    public final Date f32986d;

    /* renamed from: e  reason: collision with root package name */
    public final long f32987e;
    public final long f;

    public a(String str, String str2, String str3, Date date, long j10, long j11) {
        this.f32983a = str;
        this.f32984b = str2;
        this.f32985c = str3;
        this.f32986d = date;
        this.f32987e = j10;
        this.f = j11;
    }
}
