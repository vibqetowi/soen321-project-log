package q5;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import h5.p;
import java.util.UUID;
/* compiled from: SessionInfo.kt */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final Long f29169a;

    /* renamed from: b  reason: collision with root package name */
    public Long f29170b;

    /* renamed from: c  reason: collision with root package name */
    public UUID f29171c;

    /* renamed from: d  reason: collision with root package name */
    public int f29172d;

    /* renamed from: e  reason: collision with root package name */
    public Long f29173e;
    public l f;

    public j(Long l2, Long l10) {
        UUID randomUUID = UUID.randomUUID();
        kotlin.jvm.internal.i.f(randomUUID, "randomUUID()");
        this.f29169a = l2;
        this.f29170b = l10;
        this.f29171c = randomUUID;
    }

    public final void a() {
        long longValue;
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(p.a()).edit();
        long j10 = 0;
        Long l2 = this.f29169a;
        if (l2 == null) {
            longValue = 0;
        } else {
            longValue = l2.longValue();
        }
        edit.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", longValue);
        Long l10 = this.f29170b;
        if (l10 != null) {
            j10 = l10.longValue();
        }
        edit.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", j10);
        edit.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.f29172d);
        edit.putString("com.facebook.appevents.SessionInfo.sessionId", this.f29171c.toString());
        edit.apply();
        l lVar = this.f;
        if (lVar != null && lVar != null) {
            SharedPreferences.Editor edit2 = PreferenceManager.getDefaultSharedPreferences(p.a()).edit();
            edit2.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", lVar.f29177a);
            edit2.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", lVar.f29178b);
            edit2.apply();
        }
    }
}
