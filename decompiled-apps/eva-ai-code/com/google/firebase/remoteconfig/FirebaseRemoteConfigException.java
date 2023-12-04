package com.google.firebase.remoteconfig;

import com.google.firebase.FirebaseException;
/* loaded from: classes7.dex */
public class FirebaseRemoteConfigException extends FirebaseException {
    private final Code code;

    public FirebaseRemoteConfigException(String str) {
        super(str);
        this.code = Code.UNKNOWN;
    }

    public FirebaseRemoteConfigException(String str, Throwable th) {
        super(str, th);
        this.code = Code.UNKNOWN;
    }

    public FirebaseRemoteConfigException(String str, Code code) {
        super(str);
        this.code = code;
    }

    public FirebaseRemoteConfigException(String str, Throwable th, Code code) {
        super(str, th);
        this.code = code;
    }

    /* loaded from: classes7.dex */
    public enum Code {
        UNKNOWN(0),
        CONFIG_UPDATE_STREAM_ERROR(1),
        CONFIG_UPDATE_MESSAGE_INVALID(2),
        CONFIG_UPDATE_NOT_FETCHED(3),
        CONFIG_UPDATE_UNAVAILABLE(4);
        
        private final int value;

        Code(int i) {
            this.value = i;
        }

        public int value() {
            return this.value;
        }
    }

    public Code getCode() {
        return this.code;
    }
}
