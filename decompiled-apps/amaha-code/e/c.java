package e;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import e.a;
import kotlin.jvm.internal.i;
/* compiled from: ActivityResultContracts.kt */
/* loaded from: classes.dex */
public final class c extends a<String, Boolean> {
    @Override // e.a
    public final Intent a(ComponentActivity context, Object obj) {
        String input = (String) obj;
        i.g(context, "context");
        i.g(input, "input");
        Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{input});
        i.f(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
        return putExtra;
    }

    @Override // e.a
    public final a.C0212a b(ComponentActivity context, Object obj) {
        boolean z10;
        String input = (String) obj;
        i.g(context, "context");
        i.g(input, "input");
        if (g0.a.a(context, input) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new a.C0212a(Boolean.TRUE);
        }
        return null;
    }

    @Override // e.a
    public final Object c(Intent intent, int i6) {
        boolean z10;
        boolean z11;
        if (intent != null && i6 == -1) {
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            boolean z12 = false;
            if (intArrayExtra != null) {
                int length = intArrayExtra.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        if (intArrayExtra[i10] == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            z10 = true;
                            break;
                        }
                        i10++;
                    } else {
                        z10 = false;
                        break;
                    }
                }
                if (z10) {
                    z12 = true;
                }
            }
            return Boolean.valueOf(z12);
        }
        return Boolean.FALSE;
    }
}
