package e;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import e.a;
import is.e0;
import is.k;
import is.u;
import is.x;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.i;
/* compiled from: ActivityResultContracts.kt */
/* loaded from: classes.dex */
public final class b extends a<String[], Map<String, Boolean>> {
    @Override // e.a
    public final Intent a(ComponentActivity context, Object obj) {
        String[] input = (String[]) obj;
        i.g(context, "context");
        i.g(input, "input");
        Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input);
        i.f(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
        return putExtra;
    }

    @Override // e.a
    public final a.C0212a b(ComponentActivity context, Object obj) {
        boolean z10;
        boolean z11;
        String[] input = (String[]) obj;
        i.g(context, "context");
        i.g(input, "input");
        boolean z12 = true;
        if (input.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new a.C0212a(x.f20677u);
        }
        int length = input.length;
        int i6 = 0;
        while (true) {
            if (i6 >= length) {
                break;
            }
            if (g0.a.a(context, input[i6]) == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                z12 = false;
                break;
            }
            i6++;
        }
        if (z12) {
            int P = sp.b.P(input.length);
            if (P < 16) {
                P = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(P);
            for (String str : input) {
                linkedHashMap.put(str, Boolean.TRUE);
            }
            return new a.C0212a(linkedHashMap);
        }
        return null;
    }

    @Override // e.a
    public final Object c(Intent intent, int i6) {
        boolean z10;
        x xVar = x.f20677u;
        if (i6 == -1 && intent != null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra != null && stringArrayExtra != null) {
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i10 : intArrayExtra) {
                    if (i10 == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    arrayList.add(Boolean.valueOf(z10));
                }
                return e0.w0(u.O2(k.R1(stringArrayExtra), arrayList));
            }
            return xVar;
        }
        return xVar;
    }
}
