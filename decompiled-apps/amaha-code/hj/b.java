package hj;

import com.moengage.pushbase.internal.activity.PermissionActivity;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
/* compiled from: PermissionActivity.kt */
/* loaded from: classes.dex */
public final class b extends k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ PermissionActivity f17627u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(PermissionActivity permissionActivity) {
        super(0);
        this.f17627u = permissionActivity;
    }

    @Override // ss.a
    public final String invoke() {
        return i.n(" requestNotificationPermission() : ", this.f17627u.f10226v);
    }
}
