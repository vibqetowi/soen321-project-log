package com.google.firebase.firestore.ktx;

import androidx.annotation.Keep;
import ca.a;
import com.google.firebase.components.ComponentRegistrar;
import hd.b;
import java.util.List;
import kotlin.Metadata;
import mf.e;
/* compiled from: Firestore.kt */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/google/firebase/firestore/ktx/FirebaseFirestoreKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "", "Lhd/b;", "getComponents", "<init>", "()V", "com.google.firebase-firebase-firestore-ktx"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class FirebaseFirestoreKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<b<?>> getComponents() {
        return a.O0(e.a("fire-fst-ktx", "24.4.4"));
    }
}
