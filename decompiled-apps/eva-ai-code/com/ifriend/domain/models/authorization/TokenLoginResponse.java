package com.ifriend.domain.models.authorization;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: TokenLoginResponse.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/ifriend/domain/models/authorization/TokenLoginResponse;", "", "()V", "Failure", "Success", "TokenIsNotValid", "Lcom/ifriend/domain/models/authorization/TokenLoginResponse$Failure;", "Lcom/ifriend/domain/models/authorization/TokenLoginResponse$Success;", "Lcom/ifriend/domain/models/authorization/TokenLoginResponse$TokenIsNotValid;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class TokenLoginResponse {
    public /* synthetic */ TokenLoginResponse(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: TokenLoginResponse.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/domain/models/authorization/TokenLoginResponse$Success;", "Lcom/ifriend/domain/models/authorization/TokenLoginResponse;", TtmlNode.TAG_BODY, "Lcom/ifriend/domain/models/authorization/SignInResponse;", "(Lcom/ifriend/domain/models/authorization/SignInResponse;)V", "getBody", "()Lcom/ifriend/domain/models/authorization/SignInResponse;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Success extends TokenLoginResponse {
        private final SignInResponse body;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(SignInResponse body) {
            super(null);
            Intrinsics.checkNotNullParameter(body, "body");
            this.body = body;
        }

        public final SignInResponse getBody() {
            return this.body;
        }
    }

    private TokenLoginResponse() {
    }

    /* compiled from: TokenLoginResponse.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ifriend/domain/models/authorization/TokenLoginResponse$Failure;", "Lcom/ifriend/domain/models/authorization/TokenLoginResponse;", "()V", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Failure extends TokenLoginResponse {
        public static final Failure INSTANCE = new Failure();

        private Failure() {
            super(null);
        }
    }

    /* compiled from: TokenLoginResponse.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ifriend/domain/models/authorization/TokenLoginResponse$TokenIsNotValid;", "Lcom/ifriend/domain/models/authorization/TokenLoginResponse;", "()V", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class TokenIsNotValid extends TokenLoginResponse {
        public static final TokenIsNotValid INSTANCE = new TokenIsNotValid();

        private TokenIsNotValid() {
            super(null);
        }
    }
}
