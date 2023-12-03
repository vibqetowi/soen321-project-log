package ej;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
/* compiled from: MoEPushHelper.kt */
/* loaded from: classes.dex */
public final class c extends k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ b f14050u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar) {
        super(0);
        this.f14050u = bVar;
    }

    @Override // ss.a
    public final String invoke() {
        return i.n(" onPushPermissionGranted() : Below Android 13, ignoring", this.f14050u.f14048a);
    }
}
