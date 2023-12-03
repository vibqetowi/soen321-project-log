package lg;

import android.content.SharedPreferences;
/* compiled from: PersistentIdentity.java */
/* loaded from: classes.dex */
public final class h implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i f24339a;

    public h(i iVar) {
        this.f24339a = iVar;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        synchronized (i.f24342s) {
            this.f24339a.j();
            i.r = false;
        }
    }
}
