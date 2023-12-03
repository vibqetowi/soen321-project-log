package v9;

import android.app.Activity;
import android.content.Intent;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class w extends y {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Intent f34954u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Activity f34955v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ int f34956w = 2;

    public w(Activity activity, Intent intent) {
        this.f34954u = intent;
        this.f34955v = activity;
    }

    @Override // v9.y
    public final void a() {
        Intent intent = this.f34954u;
        if (intent != null) {
            this.f34955v.startActivityForResult(intent, this.f34956w);
        }
    }
}
