package com.ifriend.keychain;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* compiled from: KeychainAdapter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class KeychainAdapter$passwordTransform$1 extends Lambda implements Function1<Object, String> {
    public static final KeychainAdapter$passwordTransform$1 INSTANCE = new KeychainAdapter$passwordTransform$1();

    KeychainAdapter$passwordTransform$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(Object obj) {
        Map map = obj instanceof Map ? (Map) obj : null;
        if (map != null) {
            return (String) map.get("password");
        }
        return null;
    }
}
