package e;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import kotlin.jvm.internal.i;
/* compiled from: ActivityResultContracts.kt */
/* loaded from: classes.dex */
public final class d extends a<Intent, androidx.activity.result.a> {
    @Override // e.a
    public final Intent a(ComponentActivity context, Object obj) {
        Intent input = (Intent) obj;
        i.g(context, "context");
        i.g(input, "input");
        return input;
    }

    @Override // e.a
    public final Object c(Intent intent, int i6) {
        return new androidx.activity.result.a(intent, i6);
    }
}
