package com.facebook.login;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CodeChallengeMethod.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/facebook/login/CodeChallengeMethod;", "", "s", "", "(Ljava/lang/String;ILjava/lang/String;)V", "S256", "PLAIN", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public enum CodeChallengeMethod {
    S256("S256"),
    PLAIN("plain");

    CodeChallengeMethod(String str) {
    }

    /* synthetic */ CodeChallengeMethod(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "S256" : str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static CodeChallengeMethod[] valuesCustom() {
        CodeChallengeMethod[] valuesCustom = values();
        return (CodeChallengeMethod[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
