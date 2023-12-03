package com.google.firebase.messaging.ktx;

import ca.a;
import com.google.firebase.components.ComponentRegistrar;
import hd.b;
import java.util.List;
import kotlin.Metadata;
import mf.e;
/* compiled from: Messaging.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/google/firebase/messaging/ktx/FirebaseMessagingKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "com.google.firebase-firebase-messaging-ktx"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class FirebaseMessagingKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<b<?>> getComponents() {
        return a.O0(e.a("fire-fcm-ktx", "23.1.2"));
    }
}
