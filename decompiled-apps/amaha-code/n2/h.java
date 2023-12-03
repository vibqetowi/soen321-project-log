package n2;

import android.os.Build;
/* compiled from: WorkDatabaseMigrations.kt */
/* loaded from: classes.dex */
public final class h extends y1.a {

    /* renamed from: c  reason: collision with root package name */
    public static final h f25824c = new h();

    public h() {
        super(3, 4);
    }

    @Override // y1.a
    public final void a(c2.b bVar) {
        if (Build.VERSION.SDK_INT >= 23) {
            bVar.q("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
        }
    }
}
