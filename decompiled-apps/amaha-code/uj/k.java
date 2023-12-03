package uj;
/* compiled from: ProgressProperties.kt.kt */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final long f34201a;

    /* renamed from: b  reason: collision with root package name */
    public final p f34202b;

    /* renamed from: c  reason: collision with root package name */
    public long f34203c;

    /* renamed from: d  reason: collision with root package name */
    public int f34204d;

    /* renamed from: e  reason: collision with root package name */
    public int f34205e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public int f34206g;

    /* renamed from: h  reason: collision with root package name */
    public int f34207h;

    /* renamed from: i  reason: collision with root package name */
    public int f34208i;

    public k(long j10, p timerProperties) {
        kotlin.jvm.internal.i.g(timerProperties, "timerProperties");
        this.f34201a = j10;
        this.f34202b = timerProperties;
        this.f34203c = -1L;
        this.f34204d = -1;
        this.f34205e = -1;
        this.f = -1;
        this.f34206g = -1;
        this.f34207h = -1;
        this.f34208i = -1;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProgressProperties(timerProperties=");
        sb2.append(this.f34202b);
        sb2.append(", timerEndTime=");
        sb2.append(this.f34201a);
        sb2.append(", updateInterval=");
        sb2.append(this.f34203c);
        sb2.append(", progressUpdateValue=");
        sb2.append(this.f34204d);
        sb2.append(", currentProgress=");
        sb2.append(this.f34205e);
        sb2.append(", maxUpdatesCount=");
        sb2.append(this.f);
        sb2.append(", currentUpdatesCount=");
        sb2.append(this.f34206g);
        sb2.append(", timerAlarmId=");
        sb2.append(this.f34207h);
        sb2.append(", progressAlarmId=");
        return defpackage.c.s(sb2, this.f34208i, ')');
    }
}
