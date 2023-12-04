package com.ifriend.data.config.parser;

import com.google.firebase.remoteconfig.FirebaseRemoteConfigValue;
import com.ifriend.domain.config.DoublePrimitiveValue;
import com.ifriend.domain.config.PrimitiveValue;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: FirebaseRemoteConfigParserImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/domain/config/PrimitiveValue;", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigValue;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class FirebaseRemoteConfigParserImpl$tryDouble$1 extends Lambda implements Function1<FirebaseRemoteConfigValue, PrimitiveValue> {
    final /* synthetic */ FirebaseRemoteConfigValue $value;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseRemoteConfigParserImpl$tryDouble$1(FirebaseRemoteConfigValue firebaseRemoteConfigValue) {
        super(1);
        this.$value = firebaseRemoteConfigValue;
    }

    @Override // kotlin.jvm.functions.Function1
    public final PrimitiveValue invoke(FirebaseRemoteConfigValue safe) {
        Intrinsics.checkNotNullParameter(safe, "$this$safe");
        return new DoublePrimitiveValue(this.$value.asDouble());
    }
}
