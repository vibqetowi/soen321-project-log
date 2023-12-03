package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public final class c implements DynamiteModule.a {
    @Override // com.google.android.gms.dynamite.DynamiteModule.a
    public final DynamiteModule.a.b a(Context context, String str, DynamiteModule.a.InterfaceC0145a interfaceC0145a) {
        DynamiteModule.a.b bVar = new DynamiteModule.a.b();
        bVar.f7462a = interfaceC0145a.b(context, str);
        int a10 = interfaceC0145a.a(context, str, true);
        bVar.f7463b = a10;
        int i6 = bVar.f7462a;
        if (i6 == 0) {
            i6 = 0;
            if (a10 == 0) {
                bVar.f7464c = 0;
                return bVar;
            }
        }
        if (i6 >= a10) {
            bVar.f7464c = -1;
        } else {
            bVar.f7464c = 1;
        }
        return bVar;
    }
}
