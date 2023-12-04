package com.google.android.gms.auth.api.credentials;

import com.google.android.gms.auth.api.Auth;
/* compiled from: com.google.android.gms:play-services-auth@@20.4.1 */
@Deprecated
/* loaded from: classes2.dex */
public final class CredentialsOptions extends Auth.AuthCredentialsOptions {
    public static final CredentialsOptions DEFAULT = new Builder().build();

    /* compiled from: com.google.android.gms:play-services-auth@@20.4.1 */
    /* loaded from: classes2.dex */
    public static final class Builder extends Auth.AuthCredentialsOptions.Builder {
        public CredentialsOptions build() {
            return new CredentialsOptions(this, null);
        }

        @Override // com.google.android.gms.auth.api.Auth.AuthCredentialsOptions.Builder
        public final /* bridge */ /* synthetic */ Auth.AuthCredentialsOptions.Builder forceEnableSaveDialog() {
            forceEnableSaveDialog();
            return this;
        }

        @Override // com.google.android.gms.auth.api.Auth.AuthCredentialsOptions.Builder
        public Builder forceEnableSaveDialog() {
            this.zba = true;
            return this;
        }
    }

    /* synthetic */ CredentialsOptions(Builder builder, zbd zbdVar) {
        super(builder);
    }
}
