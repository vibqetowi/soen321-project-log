package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public final class d implements DynamiteModule.a {
    @Override // com.google.android.gms.dynamite.DynamiteModule.a
    public final DynamiteModule.a.b a(Context context, String str, DynamiteModule.a.InterfaceC0145a interfaceC0145a) {
        int a10;
        DynamiteModule.a.b bVar = new DynamiteModule.a.b();
        int b10 = interfaceC0145a.b(context, str);
        bVar.f7462a = b10;
        int i6 = 0;
        if (b10 != 0) {
            a10 = interfaceC0145a.a(context, str, false);
            bVar.f7463b = a10;
        } else {
            a10 = interfaceC0145a.a(context, str, true);
            bVar.f7463b = a10;
        }
        int i10 = bVar.f7462a;
        if (i10 == 0) {
            if (a10 == 0) {
                bVar.f7464c = 0;
                return bVar;
            }
        } else {
            i6 = i10;
        }
        if (i6 >= a10) {
            bVar.f7464c = -1;
        } else {
            bVar.f7464c = 1;
        }
        return bVar;
    }
}
