package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public final class b implements DynamiteModule.a {
    @Override // com.google.android.gms.dynamite.DynamiteModule.a
    public final DynamiteModule.a.b a(Context context, String str, DynamiteModule.a.InterfaceC0145a interfaceC0145a) {
        DynamiteModule.a.b bVar = new DynamiteModule.a.b();
        int a10 = interfaceC0145a.a(context, str, true);
        bVar.f7463b = a10;
        if (a10 != 0) {
            bVar.f7464c = 1;
        } else {
            int b10 = interfaceC0145a.b(context, str);
            bVar.f7462a = b10;
            if (b10 != 0) {
                bVar.f7464c = -1;
            }
        }
        return bVar;
    }
}
