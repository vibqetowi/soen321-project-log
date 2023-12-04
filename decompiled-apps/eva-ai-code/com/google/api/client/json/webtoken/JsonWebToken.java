package com.google.api.client.json.webtoken;

import com.facebook.AuthenticationTokenClaims;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;
import com.google.api.client.util.Objects;
import com.google.api.client.util.Preconditions;
import java.util.Collections;
import java.util.List;
/* loaded from: classes7.dex */
public class JsonWebToken {
    private final Header header;
    private final Payload payload;

    public JsonWebToken(Header header, Payload payload) {
        this.header = (Header) Preconditions.checkNotNull(header);
        this.payload = (Payload) Preconditions.checkNotNull(payload);
    }

    /* loaded from: classes7.dex */
    public static class Header extends GenericJson {
        @Key("cty")
        private String contentType;
        @Key(ClientData.KEY_TYPE)
        private String type;

        public final String getType() {
            return this.type;
        }

        public Header setType(String str) {
            this.type = str;
            return this;
        }

        public final String getContentType() {
            return this.contentType;
        }

        public Header setContentType(String str) {
            this.contentType = str;
            return this;
        }

        @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
        public Header set(String str, Object obj) {
            return (Header) super.set(str, obj);
        }

        @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
        public Header clone() {
            return (Header) super.clone();
        }
    }

    /* loaded from: classes7.dex */
    public static class Payload extends GenericJson {
        @Key(AuthenticationTokenClaims.JSON_KEY_AUD)
        private Object audience;
        @Key(AuthenticationTokenClaims.JSON_KEY_EXP)
        private Long expirationTimeSeconds;
        @Key(AuthenticationTokenClaims.JSON_KEY_IAT)
        private Long issuedAtTimeSeconds;
        @Key(AuthenticationTokenClaims.JSON_KEY_ISS)
        private String issuer;
        @Key(AuthenticationTokenClaims.JSON_KEY_JIT)
        private String jwtId;
        @Key("nbf")
        private Long notBeforeTimeSeconds;
        @Key(AuthenticationTokenClaims.JSON_KEY_SUB)
        private String subject;
        @Key(ClientData.KEY_TYPE)
        private String type;

        public final Long getExpirationTimeSeconds() {
            return this.expirationTimeSeconds;
        }

        public Payload setExpirationTimeSeconds(Long l) {
            this.expirationTimeSeconds = l;
            return this;
        }

        public final Long getNotBeforeTimeSeconds() {
            return this.notBeforeTimeSeconds;
        }

        public Payload setNotBeforeTimeSeconds(Long l) {
            this.notBeforeTimeSeconds = l;
            return this;
        }

        public final Long getIssuedAtTimeSeconds() {
            return this.issuedAtTimeSeconds;
        }

        public Payload setIssuedAtTimeSeconds(Long l) {
            this.issuedAtTimeSeconds = l;
            return this;
        }

        public final String getIssuer() {
            return this.issuer;
        }

        public Payload setIssuer(String str) {
            this.issuer = str;
            return this;
        }

        public final Object getAudience() {
            return this.audience;
        }

        public final List<String> getAudienceAsList() {
            Object obj = this.audience;
            if (obj == null) {
                return Collections.emptyList();
            }
            if (obj instanceof String) {
                return Collections.singletonList((String) obj);
            }
            return (List) obj;
        }

        public Payload setAudience(Object obj) {
            this.audience = obj;
            return this;
        }

        public final String getJwtId() {
            return this.jwtId;
        }

        public Payload setJwtId(String str) {
            this.jwtId = str;
            return this;
        }

        public final String getType() {
            return this.type;
        }

        public Payload setType(String str) {
            this.type = str;
            return this;
        }

        public final String getSubject() {
            return this.subject;
        }

        public Payload setSubject(String str) {
            this.subject = str;
            return this;
        }

        @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
        public Payload set(String str, Object obj) {
            return (Payload) super.set(str, obj);
        }

        @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
        public Payload clone() {
            return (Payload) super.clone();
        }
    }

    public String toString() {
        return Objects.toStringHelper(this).add("header", this.header).add("payload", this.payload).toString();
    }

    public Header getHeader() {
        return this.header;
    }

    public Payload getPayload() {
        return this.payload;
    }
}
