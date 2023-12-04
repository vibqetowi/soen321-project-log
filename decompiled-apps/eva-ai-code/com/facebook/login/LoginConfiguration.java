package com.facebook.login;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: LoginConfiguration.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\b\u0004\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB!\b\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006B+\b\u0016\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0002\u0010\bR\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/facebook/login/LoginConfiguration;", "", "permissions", "", "", "nonce", "(Ljava/util/Collection;Ljava/lang/String;)V", "codeVerifier", "(Ljava/util/Collection;Ljava/lang/String;Ljava/lang/String;)V", "getCodeVerifier", "()Ljava/lang/String;", "getNonce", "", "getPermissions", "()Ljava/util/Set;", "Companion", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class LoginConfiguration {
    public static final Companion Companion = new Companion(null);
    public static final String OPENID = "openid";
    private final String codeVerifier;
    private final String nonce;

    /* renamed from: permissions  reason: collision with root package name */
    private final Set<String> f142permissions;

    public LoginConfiguration(Collection<String> collection) {
        this(collection, null, 2, null);
    }

    public final Set<String> getPermissions() {
        return this.f142permissions;
    }

    public final String getNonce() {
        return this.nonce;
    }

    public final String getCodeVerifier() {
        return this.codeVerifier;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ LoginConfiguration(Collection collection, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(collection, str);
        if ((i & 2) != 0) {
            str = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoginConfiguration(Collection<String> collection, String nonce) {
        this(collection, nonce, PKCEUtil.generateCodeVerifier());
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        PKCEUtil pKCEUtil = PKCEUtil.INSTANCE;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ LoginConfiguration(Collection collection, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(collection, str, str2);
        collection = (i & 1) != 0 ? null : collection;
        if ((i & 2) != 0) {
            str = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LoginConfiguration(Collection<String> collection, String nonce, String codeVerifier) {
        boolean z;
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Intrinsics.checkNotNullParameter(codeVerifier, "codeVerifier");
        NonceUtil nonceUtil = NonceUtil.INSTANCE;
        if (NonceUtil.isValidNonce(nonce)) {
            PKCEUtil pKCEUtil = PKCEUtil.INSTANCE;
            if (PKCEUtil.isValidCodeVerifier(codeVerifier)) {
                z = true;
                if (z) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                HashSet hashSet = collection != null ? new HashSet(collection) : new HashSet();
                hashSet.add("openid");
                Set<String> unmodifiableSet = Collections.unmodifiableSet(hashSet);
                Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "unmodifiableSet(permissions)");
                this.f142permissions = unmodifiableSet;
                this.nonce = nonce;
                this.codeVerifier = codeVerifier;
                return;
            }
        }
        z = false;
        if (z) {
        }
    }

    /* compiled from: LoginConfiguration.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/facebook/login/LoginConfiguration$Companion;", "", "()V", "OPENID", "", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
