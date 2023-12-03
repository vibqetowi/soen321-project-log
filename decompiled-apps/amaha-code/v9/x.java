package v9;

import android.content.Intent;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class x extends y {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Intent f34957u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.api.internal.h f34958v;

    public x(Intent intent, com.google.android.gms.common.api.internal.h hVar) {
        this.f34957u = intent;
        this.f34958v = hVar;
    }

    @Override // v9.y
    public final void a() {
        Intent intent = this.f34957u;
        if (intent != null) {
            this.f34958v.startActivityForResult(intent, 2);
        }
    }
}
