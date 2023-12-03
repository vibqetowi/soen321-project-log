package gd;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.api.Status;
import com.google.firebase.database.core.ServerValues;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: b  reason: collision with root package name */
    public static final y f16453b = new y();

    /* renamed from: a  reason: collision with root package name */
    public final s f16454a;

    public y() {
        s sVar = s.f16443b;
        if (n.f16438a == null) {
            n.f16438a = new n();
        }
        this.f16454a = sVar;
    }

    public static void b(Context context, Status status) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putInt("statusCode", status.f7298v);
        edit.putString("statusMessage", status.f7299w);
        edit.putLong(ServerValues.NAME_OP_TIMESTAMP, System.currentTimeMillis());
        edit.commit();
    }

    public final void a(Context context) {
        this.f16454a.getClass();
        v9.o.h(context);
        s.a(context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
    }
}
