package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import b7.b;
import e7.d;
import e7.h;
import e7.l;
@Keep
/* loaded from: classes.dex */
public class CctBackendFactory implements d {
    @Override // e7.d
    public l create(h hVar) {
        return new b(hVar.a(), hVar.d(), hVar.c());
    }
}
