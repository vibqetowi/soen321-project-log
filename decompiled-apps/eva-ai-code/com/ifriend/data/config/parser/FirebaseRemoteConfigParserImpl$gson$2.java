package com.ifriend.data.config.parser;

import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FirebaseRemoteConfigParserImpl.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/google/gson/Gson;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FirebaseRemoteConfigParserImpl$gson$2 extends Lambda implements Function0<Gson> {
    public static final FirebaseRemoteConfigParserImpl$gson$2 INSTANCE = new FirebaseRemoteConfigParserImpl$gson$2();

    FirebaseRemoteConfigParserImpl$gson$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Gson invoke() {
        return new Gson();
    }
}
