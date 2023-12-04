package com.google.auth.oauth2;

import com.google.common.base.Preconditions;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class ActingParty {
    private final String actorToken;
    private final String actorTokenType;

    ActingParty(String str, String str2) {
        this.actorToken = (String) Preconditions.checkNotNull(str);
        this.actorTokenType = (String) Preconditions.checkNotNull(str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getActorToken() {
        return this.actorToken;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getActorTokenType() {
        return this.actorTokenType;
    }
}
