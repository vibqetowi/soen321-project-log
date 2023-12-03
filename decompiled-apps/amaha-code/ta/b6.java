package ta;

import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class b6 {

    /* renamed from: a  reason: collision with root package name */
    public com.google.android.gms.internal.measurement.v2 f32486a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList f32487b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList f32488c;

    /* renamed from: d  reason: collision with root package name */
    public long f32489d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ d6 f32490e;

    public /* synthetic */ b6(d6 d6Var) {
        this.f32490e = d6Var;
    }

    public final boolean a(long j10, com.google.android.gms.internal.measurement.m2 m2Var) {
        if (this.f32488c == null) {
            this.f32488c = new ArrayList();
        }
        if (this.f32487b == null) {
            this.f32487b = new ArrayList();
        }
        if (!this.f32488c.isEmpty() && ((((com.google.android.gms.internal.measurement.m2) this.f32488c.get(0)).x() / 1000) / 60) / 60 != ((m2Var.x() / 1000) / 60) / 60) {
            return false;
        }
        long c10 = this.f32489d + m2Var.c();
        d6 d6Var = this.f32490e;
        d6Var.J();
        if (c10 >= Math.max(0, ((Integer) j2.f32652i.a(null)).intValue())) {
            return false;
        }
        this.f32489d = c10;
        this.f32488c.add(m2Var);
        this.f32487b.add(Long.valueOf(j10));
        int size = this.f32488c.size();
        d6Var.J();
        if (size >= Math.max(1, ((Integer) j2.f32654j.a(null)).intValue())) {
            return false;
        }
        return true;
    }
}
