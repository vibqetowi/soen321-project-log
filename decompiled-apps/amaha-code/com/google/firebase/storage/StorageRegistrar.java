package com.google.firebase.storage;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import hd.b;
import java.util.Arrays;
import java.util.List;
@Keep
/* loaded from: classes.dex */
public class StorageRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-gcs";

    public static /* synthetic */ FirebaseStorageComponent lambda$getComponents$0(hd.c cVar) {
        return new FirebaseStorageComponent((sc.e) cVar.a(sc.e.class), cVar.b(gd.b.class), cVar.b(cd.b.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<hd.b<?>> getComponents() {
        b.a a10 = hd.b.a(FirebaseStorageComponent.class);
        a10.f17403a = LIBRARY_NAME;
        a10.a(hd.j.c(sc.e.class));
        a10.a(hd.j.b(gd.b.class));
        a10.a(hd.j.b(cd.b.class));
        a10.f = new defpackage.c();
        return Arrays.asList(a10.b(), mf.e.a(LIBRARY_NAME, "20.1.0"));
    }
}
