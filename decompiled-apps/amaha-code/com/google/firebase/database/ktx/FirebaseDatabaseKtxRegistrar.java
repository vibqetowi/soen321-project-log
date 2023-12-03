package com.google.firebase.database.ktx;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import kotlin.Metadata;
import mf.e;
/* compiled from: Database.kt */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/google/firebase/database/ktx/FirebaseDatabaseKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "", "Lhd/b;", "getComponents", "<init>", "()V", "com.google.firebase-firebase-database-ktx"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class FirebaseDatabaseKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<hd.b<?>> getComponents() {
        return ca.a.O0(e.a(DatabaseKt.LIBRARY_NAME, "20.1.0"));
    }
}
