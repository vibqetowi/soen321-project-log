package com.ifriend.data.config;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: FirebaseConfig.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class FirebaseConfig$remoteConfig$2 extends Lambda implements Function0<FirebaseRemoteConfig> {
    public static final FirebaseConfig$remoteConfig$2 INSTANCE = new FirebaseConfig$remoteConfig$2();

    FirebaseConfig$remoteConfig$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final FirebaseRemoteConfig invoke() {
        return FirebaseRemoteConfig.getInstance();
    }
}
