package g6;

import android.content.Intent;
import android.util.Pair;
import androidx.activity.ComponentActivity;
/* compiled from: LoginManager.kt */
/* loaded from: classes.dex */
public final class v extends e.a<Intent, Pair<Integer, Intent>> {
    @Override // e.a
    public final Intent a(ComponentActivity context, Object obj) {
        Intent input = (Intent) obj;
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(input, "input");
        return input;
    }

    @Override // e.a
    public final Object c(Intent intent, int i6) {
        Pair create = Pair.create(Integer.valueOf(i6), intent);
        kotlin.jvm.internal.i.f(create, "create(resultCode, intent)");
        return create;
    }
}
