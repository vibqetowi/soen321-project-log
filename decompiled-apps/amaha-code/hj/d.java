package hj;

import com.moengage.pushbase.internal.activity.PermissionActivity;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
/* compiled from: PermissionActivity.kt */
/* loaded from: classes.dex */
public final class d extends k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ PermissionActivity f17629u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(PermissionActivity permissionActivity) {
        super(0);
        this.f17629u = permissionActivity;
    }

    @Override // ss.a
    public final String invoke() {
        return i.n(" requestNotificationPermissionLauncher : Permission Denied.", this.f17629u.f10226v);
    }
}
